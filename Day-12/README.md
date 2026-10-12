# Day - 12 
Java Exception Handling

# Topics Covered

* Exception
* Error
* Checked Exception
* Unchecked Exception
* try
* catch
* finally
* throw
* throws
* Custom Exceptions

## 1. Exception

An exception is an unexpected event that occurs during program execution and interrupts the normal flow of the program.

## 2. Error

An Error represents a serious problem that generally occurs outside the normal control of an application. Applications usually cannot recover from errors easily.
* OutOfMemoryError
* StackOverflowError

## 3. Checked Exception

A checked exception is checked by the compiler at compile time. The programmer must handle it using try-catch or declare it using throws.
* IOException
* SQLException
* FileNotFoundException

## 4. Unchecked Exception

An unchecked exception occurs at runtime and is not required to be handled or declared by the compiler.
Unchecked exceptions are subclasses of RuntimeException.
* ArithmeticException
* NullPointerException
* ArrayIndexOutOfBoundsException
* NumberFormatException

## 5. try Block

The try block contains code that might throw an exception.

-Syntax
try {
    // Code that may cause an exception
}

## 6. catch Block

The catch block handles an exception thrown from the associated try block.

-Syntax
try {
    // Risky code
} catch (ExceptionType e) {
    // Exception-handling code
}

## 7. finally Block

The finally block generally executes whether an exception occurs or not. It is commonly used for cleanup operations, such as releasing resources.

## 8. throw Keyword

The throw keyword is used to explicitly throw an exception.
-Syntax
throw new ExceptionType("Error message");

## 9. throws Keyword

The throws keyword declares exceptions that a method may pass to its caller.

-Syntax
returnType methodName() throws ExceptionType {
    // Method body
}

## 10. Custom Exceptions

A custom exception is a user-defined exception created to represent a specific problem in an application.

To create a custom checked exception, extend the Exception class.

-Common Custom Exception Examples

* InsufficientBalanceException — when an account has insufficient funds.
* InvalidAmountException — when a deposit or withdrawal amount is invalid.
* AccountNotFoundException — when an account cannot be found.
