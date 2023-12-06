package com.example.tritype;

import static org.junit.Assert.assertEquals;

import junit.framework.TestCase;

import org.junit.Test;

public class TritypeMutantationTest extends TestCase {
    @Test
    public void testMutantationInTriang1() {
        assertEquals(2, new TritypeMutantOne().Triang(3, 3, 7));
    }
    @Test
    public void testMutantationInTriang2() {
        assertEquals(2, new TritypeMutantOne().Triang(3, 3, 6));
    }

}