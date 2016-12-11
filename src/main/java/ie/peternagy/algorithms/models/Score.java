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
 * @description Score - Dummy object to imitate numbers
 * @package ie.peternagy.algorithms.models
 */
package ie.peternagy.algorithms.models;

import java.security.SecureRandom;

public class Score implements Comparable<Score>{
    private Score next;
    private Score prev;
    private int value;

    public Score() {
        random();
    }

    public Score(int value) {
        this.value = value;
    }

    public Score(Score next, Score prev, int value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public Score getNext() {
        return next;
    }

    public void setNext(Score next) {
        this.next = next;
    }

    public Score getPrev() {
        return prev;
    }

    public void setPrev(Score prev) {
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(Score o) {
        return new Integer(value).compareTo(o.value);
    }
    
    private void random(){
        this.value = (new SecureRandom()).nextInt();
    }
}
