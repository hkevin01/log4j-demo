# Log4j Demo

## Overview
A comprehensive demo project for Java logging using Log4j 2.x, covering basic to advanced usage. This project is designed to help developers understand and implement logging best practices in Java applications.

## Features
- Simple and advanced Log4j 2.x usage examples
- Custom appenders and log filtering
- Integration with external systems
- Pattern layouts and configuration
- Unit and integration tests with JUnit 5
- Modular, well-commented code following agent AI rules

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/hkevin01/log4j-demo.git
   ```
2. Ensure JDK 11+ and Maven are installed.
3. Build the project:
   ```bash
   mvn clean install
   ```

## Usage
- Run demo classes from `src/main/java/com/example/` to see Log4j in action.
- Example:
   ```bash
   mvn exec:java -Dexec.mainClass="com.example.BasicLoggerDemo"
   ```
- Explore advanced features in `AdvancedLoggerDemo.java`.

## Testing
- Unit tests are located in `src/test/java/com/example/`.
- Run all tests:
   ```bash
   mvn test
   ```

## Documentation
- Project plan and workflow: [`docs/project-plan.md`](docs/project-plan.md), [`docs/WORKFLOW.md`](docs/WORKFLOW.md)
- Goals and audience: [`docs/PROJECT_GOALS.md`](docs/PROJECT_GOALS.md)
- Log4j features and usage: See code comments and user guide (to be completed)

## Contribution Guidelines
- Please read [`CONTRIBUTING.md`](.github/CONTRIBUTING.md) before submitting changes.
- Follow the agent AI rules: meaningful comments, modular code, and maintainability.

## License
MIT
