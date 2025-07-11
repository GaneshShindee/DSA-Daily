import java.util.*;
public class PrintAllTheDuplicateCharactersInAString {
    public static void main(String[] args) {
    String arr[] = {"2","22","222",
					"3","33","333",
					"4","44","444",
					"5","55","555",
					"6","66","666",
					"7","77","777","7777",
					"8","88","888",
					"9","99","999","9999"
				};
    String input="Ganesh";
    String s = input.toUpperCase();
    StringBuilder sb= new StringBuilder();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(s.charAt(i)==' '){
            sb.append("0");
        }else{
            sb.append(arr[s.charAt(i)-'A']);
        }
    }
    System.out.println(sb.toString());

}}
