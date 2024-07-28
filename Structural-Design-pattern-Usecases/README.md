# Structural Patterns Demo

This project demonstrates the use of two structural design patterns: Decorator and Composite. The project is implemented in Java and uses Maven for build management. Detailed logging is implemented to trace the operations performed in each pattern.

## Table of Contents

- [Project Structure](#project-structure)
- [Design Patterns](#design-patterns)
  - [Decorator Pattern](#decorator-pattern)
  - [Composite Pattern](#composite-pattern)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Examples](#running-the-examples)
- [Sample Input and Output](#sample-input-and-output)
  - [Decorator Pattern Sample](#decorator-pattern-sample)
  - [Composite Pattern Sample](#composite-pattern-sample)
- [Logging](#logging)

## Project Structure
```
StructuralPatternsDemo/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── example/
│ │ │ ├── decorator/
│ │ │ │ ├── Notifier.java
│ │ │ │ ├── BasicNotifier.java
│ │ │ │ ├── NotifierDecorator.java
│ │ │ │ ├── EmailNotifier.java
│ │ │ │ ├── SMSNotifier.java
│ │ │ │ ├── PushNotifier.java
│ │ │ │ ├── DecoratorLoggingConfig.java
│ │ │ │ ├── NotificationDecoratorClient.java
│ │ │ ├── composite/
│ │ │ │ ├── FileSystemComponent.java
│ │ │ │ ├── File.java
│ │ │ │ ├── Directory.java
│ │ │ │ ├── CompositeLoggingConfig.java
│ │ │ │ ├── CompositeClient.java
│
├── target/
├── .gitignore
├── pom.xml
└── README.md
```

## Design Patterns

### Decorator Pattern

The Decorator pattern is used to add additional functionality to objects dynamically. In this project, it is demonstrated through a notification system where features like Email, SMS, and Push notifications can be added.

### Composite Pattern

The Composite pattern is used to treat individual objects and compositions of objects uniformly. This project demonstrates a file system where files and directories are treated uniformly.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6.0 or higher

### Installation

1. Clone the main repository:
   ```sh
   git clone https://github.com/YOUR_USERNAME/StructuralPatternsDemo.git
   cd StructuralPatternsDemo
2. Build the project using Maven:
   ```sh
   mvn clean install

   
### Running the Examples
To run the examples:

1. Run the Decorator Pattern Example:
   ```sh
    mvn compile exec:java -Pdecorator

2. Run the Composite Pattern Example:
   ```sh
    mvn compile exec:java -Pcomposite


## Sample Input and Output
 ## Decorator Pattern Sample
Sample Input:
```
Enter message to send:
Hello World
Choose notification types to add (1-Email, 2-SMS, 3-Push, 4-Done):
1
Choose notification types to add (1-Email, 2-SMS, 3-Push, 4-Done):
2
Choose notification types to add (1-Email, 2-SMS, 3-Push, 4-Done):
3
Choose notification types to add (1-Email, 2-SMS, 3-Push, 4-Done):
4
```
Sample Output:
```
Sending notification: Hello World
Email: Hello World
SMS: Hello World
Push: Hello World
```

### Composite Pattern Sample
Sample Input:
```

Enter 1 to add a file, 2 to add a directory, 3 to show details, 0 to exit:
1
Enter file name:
file1.txt
Enter 1 to add a file, 2 to add a directory, 3 to show details, 0 to exit:
1
Enter file name:
file2.txt
Enter 1 to add a file, 2 to add a directory, 3 to show details, 0 to exit:
3
```
Sample Output:

```
Directory: Root
File: file1.txt
File: file2.txt
```

## Logging
Separate logging files are used for the Decorator and Composite patterns. Logs include detailed information about the operations performed.

Decorator Pattern Log: decorator_application.log
Composite Pattern Log: composite_application.log
Logs are written using the java.util.logging package and include timestamps and operation details.


## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
