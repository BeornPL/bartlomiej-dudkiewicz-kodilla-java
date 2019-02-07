package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.rules.TestName;

import java.util.ArrayList;
import java.util.Random;

public class CollectionTestSuite {
    @Rule
    public TestName name = new TestName();

    @Before
    public void before() {
        System.out.println("Test Case " + name.getMethodName() + ": begin");
    }
    @After
    public void after() {
        System.out.println("Test Case " + name.getMethodName() + ": end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
            //Given
            OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
            //When
            ArrayList<Integer> result = oddNumbersExterminator.exterminate(new ArrayList<Integer>());
            //Then
            Assert.assertTrue(result == null);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> collection = new ArrayList<>();
        Random random = new Random();
        for (int i=0; i<20; i++) {
            collection.add(random.nextInt(100));
        }
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(collection);
        boolean haveOdds = false;
        System.out.print("Numbers that endured: ");
        for (int i=0; i<result.size(); i++) {
            Integer n = result.get(i);
            if (n%2 == 0) {
                System.out.print(n + ", ");
                continue;
            } else {
                haveOdds = true;
                break;
            }
        }
        System.out.println();
        //Then
        Assert.assertFalse(haveOdds);
    }
}
