# Creational Patterns Demo

This project demonstrates the use of two creational design patterns: Builder and Prototype. The project is implemented in Java and uses Maven for build management. Detailed logging is implemented to trace the operations performed in each pattern.
## Table of Contents

- [Project Structure](#project-structure)
- [Design Patterns](#design-patterns)
  - [Builder Pattern](#builder-pattern)
  - [Prototype Pattern](#prototype-pattern)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
  - [Running the Examples](#running-the-examples)
- [Sample Input and Output](#sample-input-and-output)
  - [Builder Pattern](#builder-pattern-sample)
  - [Prototype Pattern](#prototype-pattern-sample)
- [Logging](#logging)


## Project Structure
```
CreationalPatternsDemo/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── example/
│ │ │ └── creational/
│ │ │ ├── builder/
│ │ │ │ ├── Meal.java
│ │ │ │ ├── MealBuilder.java
│ │ │ │ ├── MealDirector.java
│ │ │ │ ├── MealDemo.java
│ │ │ ├── prototype/
│ │ │ │ ├── Character.java
│ │ │ │ ├── Warrior.java
│ │ │ │ ├── Mage.java
│ │ │ │ ├── CharacterCache.java
│ │ │ │ ├── PrototypeDemo.java
│ │ │ ├── logging/
│ │ │ │ ├── BuilderLoggingConfig.java
│ │ │ │ ├── PrototypeLoggingConfig.java
│
├── pom.xml
```



## Design Patterns

### Builder Pattern

The Builder pattern is used to construct complex objects step by step. In this project, it is demonstrated through a Meal Builder system where users can build and customize their meals.
### Prototype Pattern

The Prototype pattern is used to create new objects by copying existing ones. This pattern is demonstrated through a character cloning system in a game, where different character types (e.g., Warrior, Mage) can be cloned and customized.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6.0 or higher

### Installation

1. Clone the main repository:
  
   git clone https://github.com/yourusername/CreationalPatternsDemo.git
   
   cd CreationalPatternsDemo

2. Build the project using Maven:
    
    mvn clean install

   
### Running the Examples
To run the examples:

1. Run the Builder Pattern Example:
   ```sh
    mvn compile exec:java -Pbuilder

2. Run the Prototype Pattern Example:
   ```sh
    mvn compile exec:java -Pprototype


## Sample Input and Output
 ## Builder Pattern 
Sample Input:
```

Enter the type of meal (VEG, NON_VEG): VEG
Would you like to customize your meal? (yes/no): yes
Enter custom burger: Bean Burger
Enter custom drink: Orange Juice
Enter custom dessert: Fruit Salad
```
Sample Output:
```
Enter the type of meal (VEG, NON_VEG):
VEG
Meal prepared:
Item: Burger: Veggie Burger
Item: Drink: Coke
Item: Dessert: Ice Cream
Would you like to customize your meal? (yes/no):
yes
Enter custom burger:
Bean Burger
Enter custom drink:
Orange Juice
Enter custom dessert:
Fruit Salad
Customized meal:
Item: Burger: Veggie Burger
Item: Drink: Coke
Item: Dessert: Ice Cream
Item: Burger: Bean Burger
Item: Drink: Orange Juice
Item: Dessert: Fruit Salad
```

### Prototype Pattern Sample
Sample Input:
```
Enter the type of character to clone (Warrior or Mage): Warrior
Enter new weapon for the Warrior: Axe
Enter new armor for the Warrior: Chainmail
```
Sample Output:

```
Enter the type of character to clone (Warrior or Mage):
Warrior
Character cloned: Warrior
Warrior attacks with Sword
Enter new weapon for the Warrior:
Axe
Enter new armor for the Warrior:
Chainmail
Warrior customized with weapon: Axe and armor: Chainmail
Warrior attacks with Axe
```

## Logging
Separate logging files are used for the Builder and Prototype patterns. Logs include detailed information about the operations performed.

Builder Pattern Log: builder_application.log
Prototype Pattern Log: prototype_application.log

Logs are written using the java.util.logging package and include timestamps and operation details.


## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
