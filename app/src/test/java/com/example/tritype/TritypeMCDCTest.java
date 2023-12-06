package com.example.tritype;

import junit.framework.TestCase;

public class TritypeMCDCTest extends TestCase {
    // MC/DC coverage in Triang method
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-1, 3, 3));
        assertEquals(4, tri.Triang(3, 5, 8));
        assertEquals(4, tri.Triang(3, 3, 6));
        assertEquals(2, tri.Triang(3, 3, 1));
    }
}