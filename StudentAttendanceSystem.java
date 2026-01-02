package Student_Attendance_Management_System;

import java.util.*;

public class StudentAttendanceSystem {

    // Data structures used in the system
    private static Queue<Integer> entryQueue = new LinkedList<>();
    private static Set<Integer> presentSet = new HashSet<>();
    private static Stack<Integer> undoStack = new Stack<>();
    private static List<Integer> attendanceList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Student Attendance Management System =====");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Check Student Presence");
            System.out.println("3. Undo Last Attendance");
            System.out.println("4. Display Present Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    markAttendance(sc);
                    break;

                case 2:
                    checkPresence(sc);
                    break;

                case 3:
                    undoAttendance();
                    break;

                case 4:
                    displayAttendance();
                    break;

                case 5:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }

    // Marks attendance for a student
    private static void markAttendance(Scanner sc) {
        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();

        if (presentSet.contains(studentId)) {
            System.out.println("Student is already marked present.");
            return;
        }

        entryQueue.add(studentId);
        attendanceList.add(studentId);
        presentSet.add(studentId);
        undoStack.push(studentId);

        System.out.println("Attendance marked successfully for Student ID: " + studentId);
    }

    // Checks whether a student is present
    private static void checkPresence(Scanner sc) {
        System.out.print("Enter Student ID to check: ");
        int studentId = sc.nextInt();

        if (presentSet.contains(studentId)) {
            System.out.println("Student ID " + studentId + " is present.");
        } else {
            System.out.println("Student ID " + studentId + " is not present.");
        }
    }

    // Undoes the last marked attendance
    private static void undoAttendance() {
        if (undoStack.isEmpty()) {
            System.out.println("No attendance record available to undo.");
            return;
        }

        int lastStudent = undoStack.pop();
        presentSet.remove(lastStudent);
        entryQueue.remove(lastStudent);
        attendanceList.remove(Integer.valueOf(lastStudent));

        System.out.println("Attendance undone for Student ID: " + lastStudent);
    }

    // Displays all present students in entry order
    private static void displayAttendance() {
        if (attendanceList.isEmpty()) {
            System.out.println("No students are currently present.");
            return;
        }

        System.out.println("Present Students (Order of Entry):");
        for (int id : attendanceList) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}
