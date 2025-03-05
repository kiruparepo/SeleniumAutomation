# SeleniumAutomation

This repository contains automated testing scripts for web applications using **Selenium WebDriver** and **Java**. The goal of this project is to demonstrate how to automate browser interactions for testing purposes.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Java JDK** 8 or higher installed.
- **Maven** or **Gradle** (depending on your setup) for dependency management.
- **Selenium WebDriver** (automated browser interaction tool).
- A supported **Web Browser** (e.g., Chrome, Firefox, etc.) and its corresponding WebDriver (e.g., **ChromeDriver** for Google Chrome).
  
### Installation

To set up the project locally:

1. **Clone the repository** to your local machine:
    ```bash
    git clone https://github.com/kiruparepo/SeleniumAutomation.git
    cd SeleniumAutomation
    ```

2. **Install Dependencies**:

    If you're using **Maven**, you can install dependencies by running:
    ```bash
    mvn install
    ```

    If you're using **Gradle**, use:
    ```bash
    gradle build
    ```

## Usage

1. **Run Tests Using Maven**:
    To run the tests with Maven, you can use the following command:
    ```bash
    mvn test
    ```

2. **Run Tests Using Gradle**:
    To run the tests with Gradle, use the following:
    ```bash
    gradle test
    ```

3. **Run Specific Test Class**:
    If you want to run a specific test class:
    - For **Maven**:
      ```bash
      mvn -Dtest=YourTestClass test
      ```
    - For **Gradle**:
      ```bash
      gradle test --tests "YourTestClass"
      ```

### Folder Structure

Here is an overview of the project folder structure:


- **`src/test/java/testcases`**: Contains unit test cases (if any) related to the Selenium tests.
- **`pom.xml`**: If you're using Maven, it defines dependencies and build settings.
- **`build.gradle`**: If you're using Gradle, it defines dependencies and build settings.

---

**Author**: Kirupa  
**GitHub**: [kiruparepo](https://github.com/kiruparepo)

