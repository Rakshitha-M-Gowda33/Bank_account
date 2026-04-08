package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinearSearchTest {

    LinearSearch ls = new LinearSearch();

    @Test
    void testSearchFound() {

        int arr[] = {10,20,30,40};

        assertEquals(2, ls.search(arr,30));
    }

    @Test
    void testSearchNotFound() {

        int arr[] = {10,20,30,40};

        assertEquals(-1, ls.search(arr,50));
    }
}
