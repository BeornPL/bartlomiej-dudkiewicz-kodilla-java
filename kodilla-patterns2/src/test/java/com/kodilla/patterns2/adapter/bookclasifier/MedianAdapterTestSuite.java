package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("Author 1", "Title 1", 2002, "MNA-23647-XCAS"));
        bookSet.add(new Book("Author 2", "Title 2", 2003, "MNA-25343-XCAS"));
        bookSet.add(new Book("Author 3", "Title 3", 2005, "MNA-86431-XCAS"));
        bookSet.add(new Book("Author 4", "Title 4", 2010, "MNA-67864-XCAS"));
        bookSet.add(new Book("Author 5", "Title 5", 2011, "MNA-46972-XCAS"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(median);
        assertEquals(median, 2005);
    }
}
