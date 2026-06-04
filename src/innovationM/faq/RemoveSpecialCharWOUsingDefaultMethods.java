package innovationM.faq;

public class RemoveSpecialCharWOUsingDefaultMethods {
    public static void main(String[] args) {
        System.out.println(removeSpecialChars("Hello@#World!123"));
    }
    public static String removeSpecialChars(String input){
        String result="";
        for(int ele:input.toCharArray()){
            if(ele>='a' && ele<='z' || ele>='A' && ele<='Z' || ele>='0' && ele<='9'){
                result+=(char)ele;
            }
        }
        return result;
    }
}
