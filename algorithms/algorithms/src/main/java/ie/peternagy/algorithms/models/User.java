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
 * @author Peter Nagy - peternagy.ie
 * @since December 2016
 * @version 0.1
 * @description User - Dummy class for testing purpose only
 * @package ie.peternagy.algorithms.models
 */
package ie.peternagy.algorithms.models;

public class User implements Comparable<User>{
    private User next;
    private User prev;
    private String username;

    public User() {}
    
    public User(String username) {
        this.username = username;
    }

    public User(User next, User prev, String username) {
        this.next = next;
        this.prev = prev;
        this.username = username;
    }
    
    public User getNext() {
        return next;
    }

    public void setNext(User next) {
        this.next = next;
    }

    public User getPrev() {
        return prev;
    }

    public void setPrev(User prev) {
        this.prev = prev;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int compareTo(User o) {
        return this.username.compareTo(o.username);
    }
}
