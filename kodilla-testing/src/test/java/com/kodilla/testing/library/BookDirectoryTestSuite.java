package com.kodilla.testing.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class BookDirectoryTestSuite {

    private List<Book> generateListOfNBooks(int booksQuantity) {    // metoda automatyzująca generowanie listy książek o dowolnej liczbie tytułów / potrzebne do implementacji drugiego testu
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {   // czy lista książek spełniających warunek wyszukiwania jest poprawnie zwracana
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);      // mock interfejsu
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);         // mock przez konstruktor
        List<Book> resultListOfBooks = new ArrayList<Book>();                   // linie 30 do 38 - zwracana odpowiedź interfejsu metody listBookWithCondition
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);   // instrukcja dla mocka co zwrócić

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {    // czy metoda listBooksWithCondition zachowuje się poprawnie, gdy liczba tytułów pasujących do wzorca jest większa niż 20
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();              // linie od 55 do 57  trzy różne listy obiektów Book, które będą zwracane przez mock
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");

        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {  // czy zwracana lista książek jest pusta, w sytuacji, gdy wyszukiwany fragment tytułu jest krótszy niż trzy znaki
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }

    @Test
    public void listBooksInHandsOfZeroBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(generateListOfNBooks(0));
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(
                new LibraryUser("user1", "Jacek", "11111"));

        //Then
        Assert.assertEquals(0, result.size());
    }

    @Test
    public void listBooksInHandsOfOneBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(generateListOfNBooks(1));
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(
                new LibraryUser("user1", "Jacek", "11111"));
        //Then
        Assert.assertEquals(1, result.size());
    }

    @Test
    public void listBooksInHandsOfFiveBooks() {

        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        when(libraryDatabaseMock.listBooksInHandsOf(any())).thenReturn(generateListOfNBooks(5));
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        //When
        List<Book> result = bookLibrary.listBooksInHandsOf(
                new LibraryUser("user1", "Jacek", "11111"));
        //Then
        Assert.assertEquals(5, result.size());
    }
}
