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
 * @description MergeSortTest - Test cases
 * @package ie.peternagy.algorithms.sorting
 */
package ie.peternagy.algorithms.sorting;

import ie.peternagy.algorithms.models.Score;
import ie.peternagy.algorithms.models.User;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {
    
    private final static int OBJECT_CNT = 10000;
    private static User[] userArr = new User[OBJECT_CNT];
    private static Score[] scoreArr = new Score[OBJECT_CNT];
    
    public MergeSortTest() {
    
    }
    
    @BeforeClass
    public static void setUpClass() {
        for(int i = 0; i < OBJECT_CNT; i++){
            userArr[i] = new User();
            scoreArr[i] = new Score();
        }
    }
    
    @Before
    public void setUp() {
        System.out.printf("\n==============\nTest cases for %s \n", MergeSort.class.getName());
    }
    /**
     * Test of sort method, of class MergeSort.
     */
    @Test
    public void testSort_ComparableUserArr() {
        System.out.println("sort - asc (String - User)");
        User[] itemsMergeSort = userArr;
        User[] itemsSort = userArr;
        
        Arrays.sort(itemsSort);
        MergeSort.sort(itemsMergeSort);
        
        assertEquals(true, Arrays.equals(itemsSort, itemsMergeSort));
    }

    /**
     * Test of sort method, of class MergeSort.
     */
    @Test
    public void testSort_ComparableUserArr_boolean() {
        System.out.println("sort - desc (String - User)");
        boolean sortAsc = false;
        User[] itemsMergeSort = Arrays.copyOf(userArr, OBJECT_CNT);
        User[] itemsSort = Arrays.copyOf(userArr, OBJECT_CNT);
        
        Arrays.sort(itemsSort);
        ArrayUtils.reverse(itemsSort);
        MergeSort.sort(itemsMergeSort, sortAsc);
        
        assertEquals(true, Arrays.equals(itemsSort, itemsMergeSort));
    }
    
    
    /**
     * Test of sort method, of class MergeSort.
     */
    @Test
    public void testSort_ComparableScoreArr() {
        System.out.println("sort - asc (Integer - Score)");
        Score[] itemsMergeSort = Arrays.copyOf(scoreArr, OBJECT_CNT);
        Score[] itemsSort = Arrays.copyOf(scoreArr, OBJECT_CNT);
        
        Arrays.sort(itemsSort);
        MergeSort.sort(itemsMergeSort);
        
        assertEquals(true, Arrays.equals(itemsSort, itemsMergeSort));
    }

    /**
     * Test of sort method, of class MergeSort.
     */
    @Test
    public void testSort_ComparableScoreArr_boolean() {
        System.out.println("sort - desc (Integer - Score)");
        boolean sortAsc = false;
        Score[] itemsMergeSort = Arrays.copyOf(scoreArr, OBJECT_CNT);
        Score[] itemsSort = Arrays.copyOf(scoreArr, OBJECT_CNT);
        
        Arrays.sort(itemsSort);
        ArrayUtils.reverse(itemsSort);
        MergeSort.sort(itemsMergeSort, sortAsc);
        
        assertEquals(true, Arrays.equals(itemsSort, itemsMergeSort));
    }
    
}
