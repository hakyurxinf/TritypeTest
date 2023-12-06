package com.example.tritype;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeLineBranchTest {
    public void testTriangScalene() {
        assertEquals(1, new Tritype().Triang(3, 4, 5));
    }

    @Test
    public void testTriangIsosceles() {
        assertEquals(2, new Tritype().Triang(3, 4, 4));
    }

    @Test
    public void testTriangEquilateral() {
        assertEquals(3, new Tritype().Triang(2, 2, 2));
    }

    @Test
    public void testTriangNotATriangle() {
        assertEquals(4, new Tritype().Triang(1, 3, 7));
    }
}