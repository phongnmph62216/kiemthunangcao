package com.example.sof3041_sp26_sof3041_02.methods;

import org.junit.jupiter.api.*;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class MyUyttilTest {


    static  MyUyttil myUtil;
    @Test
    void add() {


     int resul = new MyUyttil().add(2,3);

     Assertions.assertEquals(5,resul);
        System.out.printf("Ket qua la: %d",resul);
    }

    @BeforeAll
static void setUpBeforeClass(){

        System.out.println("Chay truoc tat ca cac test");
       myUtil =  new MyUyttil();

    }

    @AfterAll
    static void tearDownAfterClass(){
        System.out.println("Chay sau tat ca cac test");
     myUtil = null;

    }

    @BeforeEach
    void setUp() {
        System.out.println("Chay truoc moi test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Chay sau moi test");
    }

    @Test
    @DisplayName("Test reverse method")
    void reverse() {

        Assertions.assertEquals("olleh",myUtil.reverse("hello"));
        System.out.printf("reverse() done.....");

    }

    @Test
    @DisplayName("assertNull => test null")
    void testNull() {

        assertNull(null);
    }


    @Test
    @DisplayName("assertNotNull => test not null")
    void testNotNull() {
        assertNotNull(myUtil);


    }


    @Test
    @DisplayName("assertSame => test same")
    void testSame() {
            assertSame(myUtil,myUtil);

    }

    @Test
    @DisplayName("assertNotSame => test not same")
    void testNotSame() {
        assertNotSame("Hello",myUtil);
    }

    @Test
    @DisplayName("assertTrue Examples")
    void test_assertTrue() {
        assertTrue(3 > 0);
        assertTrue(() -> {
            return true;
        });

        assertTrue(3 > 0, "assertTrue fail message");
        assertTrue(3 > 0, () -> {
            return "assertTrue fail message";
        });

        assertTrue(() -> {
            return true;
        }, "assertTrue fail message");
        assertTrue(() -> {
            return true;
        }, () -> {
            return "assertTrue fail message";
        });
    }
@Test
    @DisplayName("assertEquals Examples")
    void test_assertEquals() {
        assertEquals(10, 10);
        assertEquals(true, true, "assertEquals Failure Message");
        assertEquals("Hi", new String("Hi"));
        assertEquals(new File("test"), new File("test"));
    }

    @Test
    @DisplayName("assertNotEquals Examples")
    void test_assertNotEquals() {
        assertNotEquals(10, 100);
        assertNotEquals(true, false, "assertEquals Failure Message");
        assertNotEquals("Hi", new String("Hello"));
        assertNotEquals(new File("test"), new File("test1"));
    }



    //Array
    @Test
    @DisplayName("assertArrayEquals Examples")
    void test_assertArrayEquals() {

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "B", "C"};
        assertArrayEquals(s1, s2);


    }

@Test
    @DisplayName("assertsThrows Examples")
    void test_assertsThrows() {
        assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("This is a runtime exception");
        });
        }



}