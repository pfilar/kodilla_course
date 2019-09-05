package com.kodilla.kodillapatterns2.adapter.bookclassifier;

import com.kodilla.kodillapatterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book bookA1 = new Book("Dmitrij Gluchowski", "Metro 2033", 2005, "M2033_DG25_ru");
        Book bookA2 = new Book("Dmitrij Gluchowski", "Metro 2034", 2009, "M2034_DG29_ru");
        Book bookA3 = new Book("Dmitrij Gluchowski", "Metro 2035", 2015, "M2035_DG215_ru");

        Set<Book> librarySet = new HashSet<>();
        librarySet.add(bookA1);
        librarySet.add(bookA2);
        librarySet.add(bookA3);

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int mediana = medianAdapter.publicationYearMedian(librarySet);

        //Then
        System.out.println(mediana);
        assertEquals(mediana, 2009);
    }
}
