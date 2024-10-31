package uni.sw.unit.testing;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class TriangleTest {
    @BeforeAll
    public static void setup(){
        System.out.println("BeforeAll demo: setup test execution");
    }
    @AfterAll
    public static void tearDown(){
        System.out.println("AfterAll demo: tear down test execution");
    }
    @BeforeEach
    public void initTest(){
        System.out.println("BeforeEach demo: init test case");
    }

    @AfterEach
    public void tearDownTest(){
        System.out.println("AfterEach demo: tear down test case");
    }

    @Test
    public void testGenericTriangle(){
        Triangle triangle= new Triangle(3, 4, 6);

        assertTrue(triangle instanceof Triangle);
        assertFalse(triangle.isIsosceles());
        assertFalse(triangle.isEquilateral());
        //assertFalse(triangle.isRightAngeled());
    }

    @Test
    public void testIsoscalesTriangle(){
        System.out.println("Testing isoscales triangle");
        Triangle triangle=new Triangle(3,3,5);
        assertTrue(triangle.isIsosceles());
    }

    @Test
    public void testEquilateralTriangle(){
        Triangle triangle=new Triangle(5, 5, 5);

        assertTrue(triangle.isIsosceles());
        assertTrue(triangle.isEquilateral());
    }

    @Test
    public void testRightAngeledTriangle(){
        Triangle triangle=new Triangle(3, 4, 5);
        assertTrue(triangle.isRightAngeled());
    }

    @Test
    public void testPerimeter(){
        Triangle triangle= new Triangle(100, 251, 178);
        assertEquals(529, triangle.getPerimeter(), "Calculated parameter doesn't match expected value");
    }
    
    @Test
    public void testArea(){
        Triangle triangle=new Triangle(3, 4, 5);
        assertEquals(6, triangle.getArea(), "Calculated area doesn't match expected value");
    }

    @Test 
    public void textNotConstructableTriangle(){
        assertThrows(ArithmeticException.class, () -> {
            new Triangle(3, 4, 7);
        });

        assertThrows(ArithmeticException.class, () ->{
            new Triangle(3, 7, 4);
        });
        assertThrows(ArithmeticException.class, () ->{
            new Triangle(7, 3, 4);
        });
    }
}