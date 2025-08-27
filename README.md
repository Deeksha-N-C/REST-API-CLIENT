# REST-API-CLIENT
COMPANY: CODTECH IT SOLUTIONS

NAME: DEEKSHA N C

INTERN ID: CT04DY1225

DOMAIN: JAVA PROGRAMMING

DURATION: 4 WEEKS

MENTOR: NEELA SANTOSH

DESCRIPTION:
The Main program is a Java application developed to read and display weather data for multiple cities stored in a JSON file. This program demonstrates practical concepts such as loading resources, parsing JSON data, and interacting with the user through the console to fetch specific information. The class Main is designed to handle all core operations, including reading a JSON file, searching for a city, and displaying its weather details, such as temperature, humidity, and condition.

Key Highlights:
Class Name: Main – responsible for JSON parsing, user input, and displaying results.

Purpose of the Program:
To read weather data from a local JSON resource (weather.json).
To parse the JSON array of cities and their respective weather details.
To allow users to input a city name and retrieve its corresponding weather information.
To provide an interactive, user-friendly interface for querying structured data.

User Interaction:
Users are prompted to enter a city name via the console.
The program searches the JSON array for the entered city (case-insensitive).
If the city exists, the program prints its temperature, humidity, and condition.
If the city is not found, it displays “City not found” to inform the user.

Java Libraries and Tools Used:
org.json.JSONObject – to parse individual JSON objects.
org.json.JSONArray – to handle arrays of JSON objects.
java.util.Scanner – for capturing user input.
Visual Studio Code (VS Code) – as the development environment, providing features such as debugging, syntax highlighting, and code navigation.

Maven Project Setup:
The project uses a Maven pom.xml file to manage dependencies and build configuration.
JSON parsing is supported through the org.json dependency, specified in the <dependencies> section.
The project uses Java 17 as the source and target version.
The exec-maven-plugin allows running the program directly via Maven, specifying com.example.Main as the main class.
Maven ensures that all required libraries are automatically downloaded and included, simplifying project setup and management.

Features of the Program:
Resource Loading: Loads the weather.json file using the ClassLoader, which allows the file to be bundled as a resource within the project.
JSON Parsing: Extracts data from JSON objects and arrays to retrieve structured information.
Interactive Search: Allows the user to query any city in a flexible and case-insensitive manner.
Exception Handling: Wraps file reading and JSON parsing in a try-catch block to handle errors gracefully.

Applicability:
Educational: Helps learners understand JSON parsing, file handling, and resource loading in Java.
Practical: Useful for developing weather apps, dashboards, or any application requiring structured data retrieval from JSON files.
Automation & Data Processing: Can be adapted for scripts that process structured datasets or configuration files automatically.
Industry Relevance: Understanding JSON handling and Maven builds is essential in modern Java development, especially for projects requiring external libraries or API integration.

Key Learning Outcomes:
Loading and reading resource files from the project classpath.
Parsing JSON arrays and objects to extract specific information.
Handling user input dynamically and performing searches.
Using Maven for dependency management, build automation, and project structure.
Implementing error handling to ensure robust and reliable execution.

OUTPUT:
