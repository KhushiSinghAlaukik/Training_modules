# Day14

# Topics Learned
Collections Framework I
• Collection framework
• List
• ArrayList
• LinkedList
• Vector
• Iterator


# Collection Framework
The Java Collections Framework (JCF) is a set of interfaces, classes, and algorithms used to store, manage, and manipulate groups of objects.
Instead of creating separate variables for every value, we can use collections to store multiple elements together.

ex-
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Khushi");
        employees.add("Rahul");
        employees.add("Priya");
        System.out.println(employees);
    }
}

# List

The List interface represents an ordered collection of elements that allows duplicates.
It maintains a positional sequence of elements, so you can access elements using indexes.
The List interface extends the Collection interface.
Important characteristics
Maintains insertion order.
Allows duplicate elements.
Supports index-based access.
Can store multiple null elements in implementations that permit them, such as ArrayList and LinkedList.
Cannot be instantiated directly because it is an interface.

ex-
import java.util.List;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {\
        List<String> names = new ArrayList<>();
        names.add("Khushi");
        names.add("Rahul");
        names.add("Khushi");
        System.out.println(names);
        System.out.println(names.get(1));
    }
}

# ArrayList

ArrayList is a resizable-array implementation of the List interface.
Unlike a regular array, an ArrayList automatically grows or shrinks as elements are added or removed.It is part of the java.util package.
Characteristics of ArrayList-
Maintains insertion order.
Allows duplicate elements.
Allows multiple null elements.
Supports fast access using indexes.
Is not synchronized by default.
Automatically manages its internal capacity as necessary.

ex-
ArrayList<String> names = new ArrayList<>();
names.add("Khushi");
names.add("Rahul");
names.add("Priya");

# Linkedlist

LinkedList is a class that implements the List and Deque interfaces.
It uses a doubly linked list internally, where each node stores an element reference and links to the previous and next nodes.

LinkedList<Integer> numbers = new LinkedList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);


# Vector

Vector is a growable-array implementation of the List interface.
It is similar to ArrayList, but its individual methods are synchronized.
Vector is an older collection class that existed before the modern Collections Framework.

Characteristics of Vector
Maintains insertion order.
Allows duplicates.
Allows null elements.
Supports index-based access.
Is synchronized at the method level.
Can grow dynamically.
ex-
import java.util.Vector;

class Main {
    public static void main(String[] args) {

        Vector<String> names = new Vector<>();

        names.add("Khushi");
        names.add("Rahul");
        names.add("Priya");

        System.out.println(names);

        names.remove("Rahul");

        System.out.println(names);

        System.out.println(names.size());
    }
}

# Iterator
An Iterator is an interface used to traverse the elements of a collection one by one.\
It belongs to the java.util package.
Instead of accessing elements through indexes, an iterator provides methods to move through a collection.

for (int i = 0; i < names.size(); i++) {
    System.out.println(names.get(i));
}