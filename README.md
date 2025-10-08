# Java Lambda Expressions and Stream Operations Examples

## Overview

This repository contains Java programs demonstrating the use of **lambda expressions** and **Stream API** for common operations like sorting, filtering, grouping, and aggregation. These examples showcase **functional programming features in Java** for cleaner, more readable, and efficient code.

---

## Features

### 1. Employee Sorting (`EmployeeSort.java`)
- Sort a list of `Employee` objects by:
  - Name (alphabetically)
  - Age (ascending)
  - Salary (descending)
- Demonstrates lambda expressions for concise sorting logic.

### 2. Student Filtering and Sorting (`StudentProcessor.java`)
- Filter students scoring above 75%.
- Sort the filtered students by marks in descending order.
- Display the names of top-performing students.
- Highlights functional-style **filtering**, **sorting**, and **mapping** using streams.

### 3. Product Analytics (`ProductAnalytics.java`)
- Group products by category using `Collectors.groupingBy()`.
- Find the most expensive product in each category with `Collectors.maxBy()`.
- Calculate the average price of all products using `Collectors.averagingDouble()`.
- Demonstrates real-world data processing using **Stream API** and **Collectors**.

---

## Project Structure

java-lambda-stream-examples

├── EmployeeSort.java        # Sorting Employee objects using lambda expressions

├── StudentProcessor.java    # Filtering and sorting students using streams

├── ProductAnalytics.java    # Stream operations on Product dataset

└── README.md                # Project documentation

## Key Concepts Covered

- Lambda expressions for concise functional code
- List.sort() and Collections.sort() with lambdas
- Stream operations: filter(), map(), sorted(), forEach()
- Collectors: groupingBy(), maxBy(), averagingDouble()
- Functional-style data processing in Java
