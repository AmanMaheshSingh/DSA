//LeetCode : 1773
//Count Item Matching a RuleKey
import java.util.Arrays;
import java.util.List;

public class ItemMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items = Arrays.asList(
                Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone")
        );
        String ruleKey = "color" , ruleValue = "silver";
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int idx = ruleKey.equals("type") ? 0 :
                  ruleKey.equals("color") ? 1 : 2;
        int count = 0;
        for(List<String> item : items){
            if(item.get(idx).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
}
