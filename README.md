# nawadata_fullstack_JendraLuqmanZen

## Overview
this is Readme.md for all question created by Jendra Luqman Zen

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


# PSBB_no2 Command-Line Application

## Overview
PSBB_no2 is a Java command-line application that calculates the minimum number of buses required to transport family members to a wedding. The buses have a capacity of 4 passengers each, and each bus can carry members from up to two different families.

## Features
- Accepts user input for the number of families and the number of members in each family.
- Uses a two-pointer technique to optimize the number of buses required.
- Displays the minimum number of buses needed or an appropriate error message if the input is invalid.

## How to Use
### Prerequisites
- Java Development Kit (JDK) version 8 or higher must be installed.

### Compilation and Running Instructions
1. **Save the Code**:
   - Save the Java source code in a file named `PSBB_no2.java`.

2. **Compile the Java File**:
   - Open a terminal and navigate to the directory where `PSBB_no2.java` is saved.
   - Run the following command to compile the Java file:
     ```sh
     javac PSBB_no2.java
     ```

3. **Run the Application**:
   - Run the compiled application using the following command:
     ```sh
     java PSBB_no2
     ```

4. **User Input**:
   - The application will prompt you to enter the number of families.
   - Then, enter the number of members in each family, separated by spaces.
   - The application will then calculate and display the minimum number of buses required.

## Example
### Input
```
Enter the number of families: 5
Enter the number of members in each family (separated by a space): 1 2 4 3 3
```

### Output
```
Minimum bus required is: 4
```

## Files Included
- `PSBB_no2.java`: The main Java source code for the application.

## Requirements
- Java 8 or higher.

## Author
- Created by Jendra Luqman Zen for submission test of PT Nawadata Solutions role fullstack .

