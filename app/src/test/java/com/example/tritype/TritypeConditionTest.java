package com.example.tritype;

import static org.junit.Assert.*;
import junit.framework.TestCase;
public class TritypeConditionTest extends TestCase {
    //condition in training method
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-1, 2, 1));
        assertEquals(2, tri.Triang(3, 3, 2));
        assertEquals(4, tri.Triang(2, -1, 1));
        assertEquals(2, tri.Triang(3, 3, 2));
        assertEquals(4, tri.Triang(3, 3, -1));
        assertEquals(2, tri.Triang(2, 3, 2));
    }
}