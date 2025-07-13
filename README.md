
<div id="header">
  <img src="https://github.com/Javac-g/Design_Patterns/blob/master/DP.png?raw=true"/>
</div>
# ☕ Java Design Patterns

This repository contains practical examples and explanations of the most commonly used **design patterns in Java**. Each pattern is implemented using idiomatic Java and accompanied by a description and its appropriate use cases.

---

## 📦 Creational Patterns

These patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation.

| Pattern             | Description                                                                   | Use Case                                      | When to Use                                                              | Indicators to Use                                                                            |
| ------------------- | ----------------------------------------------------------------------------- | --------------------------------------------- | ------------------------------------------------------------------------ | -------------------------------------------------------------------------------------------- |
| **AbstractFactory** | Creates families of related objects without specifying their concrete classes | UI Toolkits, game character kits              | When your code needs to work with various families of related products   | Multiple related objects, system should be independent of how its products are created       |
| **Builder**         | Separates the construction of a complex object from its representation        | Creating documents, meal combos, complex DTOs | When an object has many optional fields or configuration steps           | Complex object construction, multiple representations of object, immutability desired        |
| **Factory Method**  | Defines an interface for creating an object, but lets subclasses alter it     | Logging frameworks, notification senders      | When you need to delegate instantiation to subclasses                    | Object creation needs to be controlled or delegated to subclasses                            |
| **Prototype**       | Creates objects by cloning existing ones                                      | Graphic editors, document templates           | When object creation is costly and you want to clone existing instances  | Object creation is expensive or slow, system should be independent of how objects are copied |
| **Singleton**       | Ensures a class has only one instance and provides global access to it        | Configuration managers, caches, loggers       | When exactly one instance of a class is required and globally accessible | Global state or resource management, shared access, restricted instantiation                 |

---

## 🔌 Structural Patterns

These patterns deal with object composition and typically help ensure that if one part of a system changes, the entire system doesn't need to do the same.

| Pattern       | Description                                                  | Use Case                                              | When to Use                                                                                | Indicators to Use                                                                              |
| ------------- | ------------------------------------------------------------ | ----------------------------------------------------- | ------------------------------------------------------------------------------------------ | ---------------------------------------------------------------------------------------------- |
| **Adapter**   | Converts one interface to another                            | Legacy code integration, 3rd-party library interfaces | When you want to use a class that doesn't match the required interface                     | Interfaces don't match, adapting third-party/legacy code                                       |
| **Bridge**    | Separates abstraction from implementation                    | UI rendering, cross-platform drivers                  | When you want to vary abstraction and implementation independently                         | Multiple implementations, avoid class explosion, dynamic behavior changes required             |
| **Composite** | Treats individual objects and groups uniformly               | File system structures, GUIs                          | When clients should treat individual objects and compositions the same                     | Hierarchical structures, part-whole relationships, tree structures                             |
| **Decorator** | Adds new behavior to objects dynamically                     | GUI components, logging wrappers                      | When you need to add responsibilities to individual objects dynamically                    | Responsibilities need to be added without modifying code, flexible object composition required |
| **Facade**    | Provides a simplified interface to a complex subsystem       | Simplified API for subsystems like JDBC, EmailService | When you want to provide a unified interface to a set of interfaces in a subsystem         | Complex system needs simplification, hiding complexity from client                             |
| **Flyweight** | Reduces memory usage by sharing common parts of object state | Text editors, game particle systems                   | When many objects share common data and memory efficiency is critical                      | Many similar objects created, high memory usage, shared intrinsic state                        |
| **Proxy**     | Provides a placeholder or surrogate for another object       | Lazy loading, access control, remote proxy            | When you need to control access to another object or add functionality without changing it | Additional control over access, lazy loading, remote method calls                              |

---

## 🔁 Behavioral Patterns

These patterns are concerned with algorithms and the assignment of responsibilities between objects.

| Pattern                     | Description                                                            | Use Case                                  | When to Use                                                                                      | Indicators to Use                                                                      |
| --------------------------- | ---------------------------------------------------------------------- | ----------------------------------------- | ------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------- |
| **Chain of Responsibility** | Passes requests along a chain of handlers                              | Logging, event propagation                | When multiple objects might handle a request and the handler isn't known a priori                | Multiple handlers possible, decoupling sender and receiver                             |
| **Command**                 | Encapsulates a request as an object                                    | Undo mechanisms, macro recording          | When you need parameterize requests, delay execution, or support undo                            | Need to queue, log, undo, or schedule operations                                       |
| **Iterator**                | Provides a way to access elements sequentially                         | Collections traversal                     | When you want to access elements without exposing underlying representation                      | Need to traverse collection uniformly, abstraction from container structure            |
| **Mediator**                | Reduces communication between objects by centralizing it               | Chat rooms, UI widget interaction         | When objects communicate in complex ways and you want to avoid tight coupling                    | Complex interaction between objects, central coordination needed                       |
| **Memento**                 | Captures and restores an object's internal state                       | Undo/redo functionality, game save states | When you need to restore an object to a previous state without violating encapsulation           | Need to track state history, rollback functionality                                    |
| **Observer**                | Defines a one-to-many dependency between objects                       | Event systems, UI listeners               | When a change in one object requires changes in others, and you want to minimize coupling        | One change triggers multiple updates, need decoupled event notification                |
| **State**                   | Allows an object to alter its behavior when its internal state changes | Vending machines, game characters         | When an object’s behavior depends on its state                                                   | State-dependent behavior, avoid complex if-else or switch logic                        |
| **Strategy**                | Defines a family of interchangeable algorithms                         | Sorting algorithms, payment processing    | When you want to choose an algorithm at runtime                                                  | Different variants of an algorithm needed, dynamic behavior selection                  |
| **Template Method**         | Defines the skeleton of an algorithm in the superclass                 | File parsers, game loops                  | When the core algorithm stays the same but individual steps vary                                 | Common structure with customizable steps, enforced sequence                            |
| **Visitor**                 | Lets you define new operations without changing object structure       | AST processing, document rendering        | When you need to perform operations across a set of heterogeneous objects without modifying them | Need to add operations without modifying object classes, multiple unrelated operations |

---

## 🧽 Usage Guidelines

- Each pattern is located in its own package with well-named Java classes.
- Each example contains:
  - Interfaces/abstract classes
  - Concrete implementations
  - A main/demo class to run and observe behavior
- JavaDoc comments explain the roles of each class.

---

## 🏁 Getting Started

1. Clone the repository:

2. Open in your IDE (IntelliJ, Eclipse, etc.)

3. Navigate to any pattern folder and run the `Main.java` file to observe output

---

## 📚 References

- *Design Patterns: Elements of Reusable Object-Oriented Software* — GoF
- *Head First Design Patterns* — O'Reilly

---

## 📬 Contact

Feel free to contribute or open an issue if you spot something to improve. Contributions are welcome!
