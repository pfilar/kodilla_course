package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {      // zwraca listę książek o tytułach rozpoczynających się od podanego ciągu znaków
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;

        //Book book = new Book("The book title", "The book author", 2000);  // dlaczego tworzenie nowego obiektu
        //bookList.add(book);

        // temporary returning list of one book
        return bookList;
    }

    // ---------------------------------------------------------------------------------------------------------------
    //
    // do implementacji / metoda o tej samej nazwie w LibraryDatabase (Interfejsie), są to dwie różne metody
    // gdy użytkownik nie ma wypożyczonych żadnych książek
    // gdy ma wypożyczoną jedną książkę,
    // gdy ma wypożyczonych 5 książek

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        return libraryDatabase.listBooksInHandsOf(libraryUser);
    }
}
