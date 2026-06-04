import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
        Map<String,List<String>> result= words.stream().collect(Collectors.groupingBy(GroupAnagrams::sortedKey));
        System.out.println(result.values());
    }
    public static String sortedKey(String input){
        char[] charArr=input.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }
}
