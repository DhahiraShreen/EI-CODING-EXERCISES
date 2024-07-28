# Behavioral Patterns Demo

This project demonstrates the use of two behavioral design patterns: Observer and Command. The project is implemented in Java and uses Maven for build management. Detailed logging is implemented to trace the operations performed in each pattern.

## Table of Contents

- [Project Structure](#project-structure)
- [Design Patterns](#design-patterns)
  - [Observer Pattern](#observer-pattern)
  - [Command Pattern](#command-pattern)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Examples](#running-the-examples)
- [Sample Input and Output](#sample-input-and-output)
  - [Observer Pattern Sample](#observer-pattern-sample)
  - [Command Pattern Sample](#command-pattern-sample)
- [Logging](#logging)

## Project Structure
```
BehavioralPatternDemo/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── example/
│ │ │ ├── command/
│ │ │ │ ├── Command.java
│ │ │ │ ├── CommandLoggingConfig.java
│ │ │ │ ├── CommandMain.java
│ │ │ │ ├── Document.java
│ │ │ │ ├── Editor.java
│ │ │ │ ├── RedoCommand.java
│ │ │ │ ├── UndoCommand.java
│ │ │ │ ├── WriteCommand.java
│ │ │ ├── observer/
│ │ │ │ ├── FinancialAnalysisTool.java
│ │ │ │ ├── NewsPortal.java
│ │ │ │ ├── ObserverLoggingConfig.java
│ │ │ │ ├── ObserverMain.java
│ │ │ │ ├── StockMarket.java
│ │ │ │ ├── StockObserver.java
│ │ │ │ ├── TradingApp.java
│
├── target/
├── .gitignore
├── pom.xml
└── README.md
```

## Design Patterns

### Observer Pattern

The Observer pattern is used to create a subscription mechanism to allow multiple objects to listen to and react to events or changes in another object. In this project, it is demonstrated through a stock market system where investors subscribe to updates about stock prices.

### Command Pattern

The Command pattern is used to encapsulate all information needed to perform an action or trigger an event at a later time. This project demonstrates a text editor application where commands for writing text and undoing the last action are implemented.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6.0 or higher

### Installation

1. Clone the main repository:
   ```sh
    git clone https://github.com/YOUR_USERNAME/BehavioralPatternDemo.git
    cd BehavioralPatternDemo

2.  Build the project using Maven:
   ```sh
    mvn clean install


### Running the Examples


To run the examples:

1. Run the Observer Pattern Example:
   ```sh
    mvn compile exec:java -Pobserver

2. Run the Command Pattern Example:
   ```sh
    mvn compile exec:java -Pcommand



## Sample Input and Output

  ### Observer Pattern Sample


Sample Input:
```

Enter stock price update (integer value): 100
Enter stock price update (integer value): 150

Sample Output:
```Enter stock price update (integer value):
100
Investor 1: Stock price updated to 100
Investor 2: Stock price updated to 100
Enter stock price update (integer value):
150
Investor 1: Stock price updated to 150
Investor 2: Stock price updated to 150
```
### Command Pattern Sample

Sample Input:
```Enter a command (write, undo, redo, exit): write
Enter text to write: Hello
Enter a command (write, undo, redo, exit): write
Enter text to write: World
Enter a command (write, undo, redo, exit): undo
```
Sample Output:
```Enter a command (write, undo, redo, exit):
write
Enter text to write:
Hello
INFO: write command occurred. Text: Hello
Current Text: Hello
Enter a command (write, undo, redo, exit):
write
Enter text to write:
World
INFO: write command occurred. Text: World
Current Text: HelloWorld
Enter a command (write, undo, redo, exit):
undo
INFO: undo command occurred.
Undo last command. Current Text: Hello
```

## Logging
Separate logging files are used for the Observer and Command patterns. Logs include detailed information about the operations performed.

Observer Pattern Log: observer_application.log
Command Pattern Log: command_application.log
Logs are written using the java.util.logging package and include timestamps and operation details.




## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
