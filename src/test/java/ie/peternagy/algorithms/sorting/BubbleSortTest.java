/**
 * Copyright (C) 2016 Peter Nagy
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * ======================================================================
 *
 * @author Peter Nagy - https://peternagy.ie
 * @since December 2016
 * @version 0.1
 * @description BubbleSortTest - Test cases for bubble sort
 * @package ie.peternagy.algorithms.sorting
 */
package ie.peternagy.algorithms.sorting;

import ie.peternagy.algorithms.models.User;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BubbleSortTest {
    private final static int OBJECT_CNT = 10000;
    private static User[] items = new User[OBJECT_CNT];
    
    public BubbleSortTest() {}
    
    @BeforeClass
    public static void setUpClass() {
        for(int i = 0; i < OBJECT_CNT; i++)
            items[i] = new User();
            
    }
    
    
    @Before
    public void setUp() {
        System.out.printf("\n==============\nTest cases for %s \n", BubbleSort.class.getName());
    }
    /**
     * Test of sort method, of class BubbleSort.
     */
    @Test
    public void testSort_ComparableArr() {
        System.out.println("sort - asc");
        User[] itemsBubbleSort = items;
        User[] itemsSort = items;
        
        Arrays.sort(itemsSort);
        BubbleSort.sort(itemsBubbleSort);
        
        assertEquals(true, Arrays.equals(itemsSort, itemsBubbleSort));
    }

    /**
     * Test of sort method, of class BubbleSort.
     */
    @Test
    public void testSort_ComparableArr_boolean() {
        System.out.println("sort - desc");
        boolean sortAsc = false;
        User[] itemsBubbleSort = items;
        User[] itemsSort = items;
        
        Arrays.sort(itemsSort);
        ArrayUtils.reverse(itemsSort);
        BubbleSort.sort(itemsBubbleSort, sortAsc);
        
        assertEquals(true, Arrays.equals(itemsSort, itemsBubbleSort));
    }

    /**
     * Test of swapItems method, of class BubbleSort.
     */
    @Test
    public void testSwapItems() {
        System.out.println("swapItems");
        User[] items = new User[2];
        User one = new User();
        items[0] = one;
        items[1] = new User();
        int indexOne = 0;
        int indexTwo = 1;
        BubbleSort.swapItems(items, indexOne, indexTwo);
        
        assertTrue(items[1].compareTo(one) == 0);
    }
    
}
