//LeetCode : 1832
//Check if the Sentence Is Pangram

public class CheckPangram {
    public static void main(String[] args) {
        String sen = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sen));
        String sen1 = "amanmaheshsingh";
        System.out.println(checkIfPangram(sen1));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];
        for(int i = 0 ; i<sentence.length();i++){
            char c = sentence.charAt(i);
            seen[c-'a']=true;
        }
        for(boolean b : seen){
            if(!b) return false;
        }
        return true;
    }
}
