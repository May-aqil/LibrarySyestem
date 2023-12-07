/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mayaqil1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MayAqil1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library;
        library = new Library();
        int n;
        //  Adding books to the library
        for (int i = 1; i <= 4; i++) {
            System.out.println("Enter details for Book " + i + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author ID: ");
            int authorId = scanner.nextInt();
            System.out.print("Author Name: ");
            String authorName = scanner.next();
            System.out.print("Author Address: ");
            String authorAddress = scanner.next();
            System.out.print("Author Birth Date: ");
            String authorBirthDate = scanner.next();
            scanner.nextLine();
            System.out.print("Book Number: ");
            int bookNo = scanner.nextInt();
            System.out.print("Genre: ");
            String genre = scanner.next();
            System.out.print("Version: ");
            int version = scanner.nextInt();
            System.out.print("Publication Date: ");
            String date = scanner.next();

            Auther author = new Auther(authorId, authorName, authorAddress, authorBirthDate);
            Book book = new Book(title, author, bookNo, genre, version, date);
            library.addBook(book);
            scanner.nextLine(); // Consume the newline character
        }

        // Adding students to the library
        for (int i = 1; i <= 2; i++) {
            System.out.println("Enter details for Student " + i + ":");
            System.out.print("Student Name: ");
            String studentName = scanner.nextLine();
            System.out.print("Student Address: ");
            String studentAddress = scanner.nextLine();
            System.out.print("Student Birth Date: ");
            String studentBirthDate = scanner.nextLine();
            System.out.print("Student Major: ");
            String studentMajor = scanner.nextLine();

            Student student = new Student(i, studentName, studentAddress, studentBirthDate, studentMajor);
            library.addStudent(student);
        }

      
        int choice;
        do {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Search for a Book");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Display All Students");
            System.out.println("6. Display All loans");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    //  Searching for a book by title
                    System.out.print("Enter book title to search: ");
                    String titleToSearch = scanner.nextLine();
                    Book foundBook = library.searchBookByTitle(titleToSearch);
                    if (foundBook != null) {
                        library.displayBookInfo(foundBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 2:
                    // Borrowing a book
                    System.out.print("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    System.out.print("Enter book number to borrow: ");
                    int bookNoToBorrow = scanner.nextInt();

                    Student borrower = null;
                    for (Student student : library.getStudents()) {
                        if (student.getId() == studentId) {
                            borrower = student;
                            break;
                        }
                    }

                    Book bookToBorrow = library.searchBookByNo(bookNoToBorrow);
                    if (borrower != null && bookToBorrow != null) {
                        library.borrowBook(borrower, bookToBorrow);
                    } else {
                        System.out.println("Invalid student ID or book number.");
                    }
                    break;

                case 3:
                    //  Returning a book
                    System.out.print("Enter student ID: ");
                    int studentIdToReturn = scanner.nextInt();
                    System.out.print("Enter book number to return: ");
                    int bookNoToReturn = scanner.nextInt();

                    Student returner = null;
                    for (Student student : library.getStudents()) {
                        if (student.getId() == studentIdToReturn) {
                            returner = student;
                            break;
                        }
                    }

                    Book bookToReturn = library.searchBookByNo(bookNoToReturn);
                    if (returner != null && bookToReturn != null) {
                        library.returnBook(returner, bookToReturn);
                    } else {
                        System.out.println("Invalid student ID or book number.");
                    }
                    break;

                case 4:
                    //  Displaying all books
                    System.out.println("All Books in the Library:");
                    library.displayAllBooks();
                    break;

                case 5:
                    // Displaying all students
                    System.out.println("All Students in the Library:");
                    library.displayAllStudents();
                    break;

                case 6:
                    // Displaying all Loans
                    System.out.println("\nLoans in the Library:");
                    for (Loan loan : library.getLoans()) {
                        System.out.println(loan);

                        if (loan.isOverdue()) {
                            System.out.println("This loan is overdue!");

                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting Library Management System.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
