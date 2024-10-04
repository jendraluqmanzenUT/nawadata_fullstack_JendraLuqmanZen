# nawadata_fullstack_JendraLuqmanZen

# SortChar_no1 Command-Line Application

## Overview
SortChar_no1 is a simple Java command-line application that separates the vowels and consonants from a user-provided line of text. It processes the input to identify and display vowel and consonant characters in the order they appear.

## Features
- Accepts a line of input from the user.
- Separates the characters into vowels and consonants.
- Outputs the vowel and consonant characters in the order they appear in the input.

## How to Use
### Prerequisites
- Java Development Kit (JDK) version 8 or above must be installed.

### Compilation and Running Instructions
1. **Compile the Java file**:
   - Open a terminal and navigate to the directory where `SortChar_no1.java` is saved.
   - Run the following command to compile the Java file:
     ```sh
     javac SortChar_no1.java
     ```

2. **Create a `.jar` File** (optional):
   - Create a manifest file named `manifest.txt` with the following content:
     ```
     Main-Class: SortChar_no1
     ```
   - Create a `.jar` file using the following command:
     ```sh
     jar cfm SortChar_no1.jar manifest.txt SortChar_no1.class
     ```

3. **Run the Application**:
   - Run the application using the following command:
     ```sh
     java -jar SortChar_no1.jar
     ```
   - Alternatively, you can run it directly using the compiled `.class` file:
     ```sh
     java SortChar_no1
     ```

4. **User Input**:
   - The application will prompt you to enter a line of words.
   - Enter the text, and the application will display the separated vowel and consonant characters.

## Example
### Input
```
Enter a line of words: Sample Case
```

### Output
```
Vowel Characters: aaee
Consonant Characters: smplcs
```

## Files Included
- `SortChar_no1.java`: The main Java source code.
- `manifest.txt`: The manifest file used for creating the `.jar` file.

## Requirements
- Java 8 or higher.


## Author
- Created by Jendra Luqman Zen for submission test of PT Nawadata Solutions role fullstack .

