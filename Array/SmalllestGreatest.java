//Leetcode 774
//Find Smallest Letter Greater Than Target.
package Array;

public class SmalllestGreatest {
    public static char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (target < letter) {
                return letter;
            }
        }
        return letters[0];
    }
    public static void main (String args[]) {
        char[] l = {'c', 'f', 'g'};
        char t = 'c';
        System.out.println(nextGreatestLetter(l,t));
    }
}

