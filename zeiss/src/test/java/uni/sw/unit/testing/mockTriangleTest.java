package uni.sw.unit.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class mockTriangleTest {
    static Triangle triangle;

    @BeforeAll
    public static void  makeMockTriangle(){
        triangle=mock(Triangle.class);
    }

    @Test
    public void testIsoscelesTriangle(){
        when(triangle.isIsosceles()).thenReturn(true);
        assertTrue(triangle.isIsosceles(), "isIsosceles should return true");
    }

    @Test
    public void testEquilateralTriangle(){
        when(triangle.isEquilateral()).thenReturn(true);
        assertTrue(triangle.isEquilateral(), "isEquilateral should return true");
    }

    @Test
    public void testRightAngeledTriangle(){
        when(triangle.isRightAngeled()).thenReturn(true);
        assertTrue(triangle.isRightAngeled(), "isRightAngeled should return true");
    }

    @Test
    public void testPerimeter(){
        when(triangle.getPerimeter()).thenReturn(1);
        assertEquals(1, triangle.getPerimeter(), "getPerimeter should return 1");
    }

    @Test
    public void testArea(){
        when(triangle.getArea()).thenReturn(1.0);
        assertEquals(1.0, triangle.getArea(), "getArea should return 1");
    }

}
