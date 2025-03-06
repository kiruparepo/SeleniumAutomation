# Selenium Automation Framework

This repository contains automated testing scripts for web applications using **Selenium WebDriver** and **Java**.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- **Java JDK** 8 or higher installed.
- **Maven**  (depending on your setup) for dependency management.
- A supported **Web Browser** (e.g., Chrome, Firefox, etc.).
  
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

### Folder Structure

Here is an overview of the project folder structure:


- **`src/test/java/testcases`**: Contains unit test cases (if any) related to the Selenium tests.
- **`pom.xml`**: If you're using Maven, it defines dependencies and build settings.
Make sure Maven is installed on your machine, and that the mvn command is available in your system's PATH. Here's how to check if Maven is installed correctly:

## Install Maven in your machine

- **`1. To install maven in your machine`**:
Open the command prompt and type:  
**mvn -v**

If Maven is installed correctly, this will display the version of Maven along with Java details. If you still see an error, Maven might not be installed properly, or the PATH environment variable isn't set correctly.

- **`2. Fixing the PATH (If Maven is Not Recognized):`**:
If Maven is not recognized, you need to make sure Maven is properly added to the system's PATH.

On Windows:
Add Maven to the PATH:

Find the location where Maven is installed (e.g., **C:\apache-maven\apache-maven-3.x.x**).

Add Maven's bin directory to the PATH environment variable.

To add Maven to the system PATH:

Right-click on This PC or My Computer and choose Properties.
Click on Advanced system settings on the left.
In the System Properties window, click on the Environment Variables button.
Under System Variables, find the Path variable, select it, and click Edit.
Add the Maven bin directory to the path (e.g., **C:\apache-maven\apache-maven-3.x.x\bin**).
Click OK to save.
**Restart Command Prompt:**

After adding Maven to the PATH, close and reopen the command prompt.
Verify by typing:

**mvn -v**

- **`3. Run the Correct Command:`**:
Once Maven is installed correctly and the mvn command works, navigate to your project directory and run the following command to execute your tests:

**mvn test**

---

**Author**: Kirupa  
**GitHub**: [kiruparepo](https://github.com/kiruparepo)

