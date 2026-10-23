# Day - 20

# Topics Covered
Multithreading
• Process vs thread
• Thread lifecycle
• Creating threads
• Runnable
• Thread synchronization
• Race condition
• ExecutorService
• Thread pool

Multithreading is a feature in Java that allows multiple threads to execute within a single process. It helps applications perform multiple tasks concurrently, improving responsiveness and resource utilization.

# 1. Process vs Thread

- Process
A process is an instance of a running program. Each process has its own memory space.

- Thread
A thread is a unit of execution within a process. Multiple threads within the same process share memory and resources.

- Difference

| Process                           | Thread                                   |
| --------------------------------- | ---------------------------------------- |
| Instance of a running program     | Unit of execution within a process       |
| Has its own address space         | Shares process memory with other threads |
| Generally requires more resources | Generally requires fewer resources       |
| Communication may require IPC     | Can communicate through shared objects   |

## 2. Thread Lifecycle

Java defines six thread states.

| State         | Description                                  |
| ------------- | -------------------------------------------- |
| NEW           | Thread object is created but not started     |
| RUNNABLE      | Thread is ready to run or running            |
| BLOCKED       | Thread is waiting to acquire a monitor lock  |
| WAITING       | Thread waits indefinitely for another action |
| TIMED_WAITING | Thread waits for a specified duration        |
| TERMINATED    | Thread execution has finished                |


# 3. Creating Threads

There are two common ways to create and start a thread.

- Method 1: Extending the Thread Class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}

- Important Methods
* `start()` — Starts a new thread.
* `run()` — Contains the task executed by the thread.
- Important:Calling `run()` directly does not start a new thread.

# 4. Runnable Interface

`Runnable` is a functional interface used to represent a task that can be executed by a thread.
It contains the `run()` method.

- Example
class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Task is running");
    }
}
public class Main {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task);
        t.start();
    }
}

# Runnable Using Lambda Expression
Since `Runnable` is a functional interface, we can use a lambda expression.
public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Task is running");
        };
        Thread t = new Thread(task);
        t.start();
    }
}

# Thread vs Runnable

| Thread                                        | Runnable                                        |
| --------------------------------------------- | ----------------------------------------------- |
| A class                                       | An interface                                    |
| Extend the Thread class                       | Implement the Runnable interface                |
| Combines task definition with thread behavior | Separates task definition from thread execution |
| Prevents extending another class              | Allows extending another class                  |

Best Practice: Prefer `Runnable` when you only need to define a task.

# 5. Thread Synchronization

Synchronization controls access to shared resources when multiple threads execute concurrently.
It prevents threads from interfering with each other's operations.

- Example
class Counter {
    int count = 0;
    synchronized void increment() {
        count++;
    }
}
public class Main {
    public static void main(String[] args)
            throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count);
    }
}

# Task-1
Built:
Multi-threaded File Processor which Process multiple files simultaneously.