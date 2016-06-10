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
class AgeComparator implements Comparator {

    public AgeComparator() {
    }

    @Override
    public int compare(Object o1, Object o2) {
        // throw new UnsupportedOperationException("Not supported yet.");
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if (s1.age == s2.age) {
            return 0;
        } else if (s1.age > s2.age) {
            return 1;
        } else {
            return -1;
        }
    }
}
