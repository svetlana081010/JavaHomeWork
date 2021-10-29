package com.pb.malkova.hw5;

public class Library {
    public static void main(String[] args) {
        Reader[] readers = new Reader[3];
        readers[0] = new Reader("Petrov V.V.");
        readers[1] = new Reader("Smirnov N.B.");
        readers[2] = new Reader("Gorlov T.S.");

        Book[] book = new Book[3];
        book[0] = new Book("Adventures", "Ivanov I.I.", 2000);
        book[1] = new Book("Dictionary", "Sidorov A.V.", 1980);
        book[2] = new Book("Encyclopedia", "Gusev K.V.", 2010);
        String[] bookTitle = {"Adventures", "Dictionary", "Encyclopedia"};

        System.out.println("Book list: ");
        for (Book books : book) {
            System.out.println(books.getBookInfo());
        }
        System.out.println("");

        System.out.println("Reader list: ");
        for (Reader reader : readers) {
            System.out.println(reader.readerName);
        }
        System.out.println("");

        readers[0].takeBook(3);
        System.out.println("");

        readers[1].takeBook(bookTitle);
        System.out.println("");

        readers[2].takeBook(book);
        System.out.println("");

        readers[0].returnBook(3);
        System.out.println("");

        readers[1].returnBook(bookTitle);
        System.out.println("");

        readers[2].returnBook(book);
    }
}
