
package com.mycompany.mayaqil1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Student> students;
    private ArrayList<Loan> loans;
    
    
    
     // Constants for loan management
    private static final int MAX_LOANS = 3;
    private static final int DAYS_ALLOWED = 5;

//-------------------------------------------------------------------

    public Library() {
        this.books = new ArrayList<>();
        this.students = new ArrayList<>();
        this.loans = new ArrayList<>();  

    }
//---------------------------------------------------------------------

    public void addBook(Book book) {
        books.add(book);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addLoan(Loan loan) {
        loans.add(loan);
    }

//----------------------------------------------------------------------
    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }
//-----------------------------------------------------------------

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book searchBookByNo(int no) {
        for (Book book : books) {
            if (book.getNo() == no) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> searchBooksByAuthor(String authorName) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuther().getName().equalsIgnoreCase(authorName)) {
                result.add(book);
            }
        }
        return result;
    }

    public boolean isBookAvailable(Book book) {
        return !book.inLoan();
    }

    public ArrayList<Book> getBorrowedBooks() {
        ArrayList<Book> borrowedBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.inLoan()) {
                borrowedBooks.add(book);
            }
        }
        return borrowedBooks;
    }

     public void borrowBook(Student student, Book book) {
        if (student.getLoan().size() >= MAX_LOANS) {
            System.out.println("Student has reached the maximum number of allowed loans.");
            return;
        }

        LocalDate dueDate = LocalDate.now().plusDays(DAYS_ALLOWED);

       Loan loan = new Loan(student, book, dueDate);

        student.addLoan(loan);
        loans.add(loan);

        System.out.println("Book '" + book.getTitle() + "' borrowed by " + student.getName() +
                ". Due date: " + loan.getDueDate());
    }

    public void returnBook(Student student, Book book) {
        if (student.hasBorrowedBook(book)) {
            student.returnBook(book);
            book.setOnLoan(false);
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Student did not borrow this book.");
        }
    }

    public void displayBookInfo(Book book) {
        System.out.println(book.getInfo());
    }

    public void displayAllBooks() {
        for (Book book : books) {
            displayBookInfo(book);
        }
    }

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student.getInfo());
        }
        
        
      
}
}