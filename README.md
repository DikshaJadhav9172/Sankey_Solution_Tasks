# Student Attendance Management System (Java)

## 📌 Overview
The **Student Attendance Management System** is a simple, menu-driven Java application designed to manage student attendance efficiently using basic data structures.  
It allows users to mark attendance, check student presence, undo the last attendance entry, and display all present students in the order they entered the classroom.

## 🎯 Problem Statement
Design a system to manage student attendance with the following requirements:

1. Store student IDs in the order they enter the classroom.
2. Quickly check whether a student is present using their ID.
3. Allow the last marked attendance to be undone.
4. Display all present students in the order they arrived.

## ⚙️ Constraints
- Student IDs are unique.
- Attendance is marked one student at a time.

## 🧠 Data Structures Used

| Purpose | Data Structure | Java Implementation |
|------|---------------|---------------------|
| Maintain entry order | Queue | `Queue<Integer>` |
| Fast presence check | Hash Set | `HashSet<Integer>` |
| Undo last attendance | Stack | `Stack<Integer>` |
| Display records | Array / List | `ArrayList<Integer>` |

## 📋 Features
- ✅ Mark student attendance
- 🔍 Check if a student is present
- ↩️ Undo the last attendance entry
- 📄 Display all present students in entry order
- 📜 Menu-driven console interface

## 🖥️ Menu Options
1.Mark Attendance
2.Check Student Presence
3.Undo Last Attendance
4.Display All Present Students
5.Exit

## 🚀 How to Run

### Prerequisites
- Java JDK 8 or above
- Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans) or terminal

### Steps
1. Copy the Java code into a file named:
StudentAttendanceSystem.java

2. Compile the program:
javac StudentAttendanceSystem.java

3. Run the program:
java StudentAttendanceSystem

## 🧪 Sample Output
===== Student Attendance Management System =====
1.Mark Attendance
2.Check Student Presence
3.Undo Last Attendance
4.Display All Present Students
5.Exit

Enter your choice: 1
Enter Student ID: 101
Attendance marked for Student ID: 101

## ⏱️ Time Complexity

| Operation | Complexity |
|---------|------------|
| Mark Attendance | O(1) |
| Check Presence | O(1) |
| Undo Attendance | O(n) |
| Display Attendance | O(n) |

## 📚 Learning Outcomes
- Understanding of **Queue, Stack, HashSet, and ArrayList**
- Practical application of **undo operations**
- Efficient data management using multiple data structures
- Building a **menu-driven Java application**

## 🏁 Conclusion
This project demonstrates how multiple data structures can work together to solve a real-world problem efficiently.  
It is simple, effective, and perfectly aligned with fundamental DSA concepts.

### ✨ Author-Diksha Jadhav
Java Mini Project – Data Structures
