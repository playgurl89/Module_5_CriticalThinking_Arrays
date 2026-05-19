# Monthly Temperatures Java Program

## Overview
This Java program stores average monthly temperatures for a full year using two parallel arrays: one for the month names and one for the corresponding temperatures.

The user can:
- Enter the name of a specific month to view that month’s average temperature
- Enter `"year"` to display all monthly temperatures, the yearly average, and the highest and lowest monthly temperatures
- Enter `"end"` to exit the program

This project demonstrates the use of:
- Arrays
- Loops (`for` and `while`)
- Conditional statements (`if`, `else if`, `else`)
- User input with the `Scanner` class

---

## Features
- Stores 12 months and their average temperatures using arrays
- Allows repeated user input until the user chooses to exit
- Displays:
  - Individual monthly temperatures
  - Full yearly temperature report
  - Yearly average temperature
  - Highest monthly temperature
  - Lowest monthly temperature
- Handles invalid month entries gracefully

---

## Technologies Used
- :contentReference[oaicite:0]{index=0}
- Scanner class for user input
- Arrays for data storage
- Loops and decision structures for program logic

---

## Example Program Output
```text
Enter a month, type 'year' for all data, or type 'end' to quit: March
March: 45.3°F

Enter a month, type 'year' for all data, or type 'end' to quit: year

Monthly Temperatures:
January: 30.5°F
February: 32.0°F
...
December: 33.6°F

Yearly Average: 55.25°F
Highest: 80.2°F in July
Lowest: 30.5°F in January

Enter a month, type 'year' for all data, or type 'end' to quit: end
Program ended.
