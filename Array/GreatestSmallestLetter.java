//LeetCode : 774
//Find Smallest Letter Greater Than Target

public class GreatestSmallestLetter {
    public static void main(String[] args) {
        char[] arr = new char[]{'a','b','c','d','e','f'};
        char tar = 'e';
        char ans = nextGreatestLetter(arr,tar);
        System.out.println("The Smallest Letter Greater Than Target : "+ans);
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0 ,end = letters.length - 1;
        while(start<=end){
            int mid = start + (end - start) / 2;
            if(target<letters[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
