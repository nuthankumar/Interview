/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package intervieww;

import java.util.Comparator;

/**
 *
 * @author Davidvilla
 */
class NameComparator implements Comparator {

    public NameComparator() {
    }

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        return s1.name.compareTo(s2.name);
    }
}
