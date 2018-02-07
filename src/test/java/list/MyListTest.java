package list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyListTest {

    private MyList myList;

    @Before
    public void setUp() throws Exception {
        myList = new MyList();
    }

    @Test
    public void testGetSize() {
        assertEquals(0, myList.getSize());
    }

    @Test
    public void testAdd() {
        myList.add("Hello");
        assertEquals(1, myList.getSize());
    }

    @Test
    public void testGet() {
        myList.add("Hello");
        assertEquals("Hello", myList.get(0));
    }

    @Test
    public void testMultipleAdd() {
        for (int i = 0; i < 10; i++) {
            myList.add("Hello" + i);
        }
        assertEquals(10, myList.getSize());
    }

    @Test
    public void testContains() {
        myList.add("World");
        myList.add("Hello");
        assertEquals(true, myList.contains("Hello"));
    }

    @Test
    public void testNotContains() {
        myList.add("Hello");
        assertEquals(false, myList.contains("Hello world!"));
    }

    @Test
    public void testRemove() {
        myList.add("Hello");
        myList.add("World");
        myList.remove("World");
        assertEquals(false, myList.contains("World"));
    }
}

