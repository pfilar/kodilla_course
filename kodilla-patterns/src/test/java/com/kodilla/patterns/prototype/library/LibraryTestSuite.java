package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("my Library");
//        Book book1 = new Book("Secrets of Alamo", "John Smith", LocalDate.of(2008, Month.OCTOBER, 15));
//        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", LocalDate.of(2012, Month.DECEMBER, 12));
//        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", LocalDate.of(2016, Month.FEBRUARY, 20));
//        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", LocalDate.of(2010, Month.AUGUST, 10));
//
//        library.addBook(book1);
//        library.addBook(book2);
//        library.addBook(book3);
//        library.addBook(book4);

        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Book" + n, "Author" + n, LocalDate.of(1990,1,1).plusYears(n))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("my Library - shallow copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("my Library - deep copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        //library.removeBook(book4);
        library.getBooks().remove(new Book("Book2", "Author2", LocalDate.of(1992,1,1)));

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(9, library.getBooks().size());
        Assert.assertEquals(9, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
    }
}

