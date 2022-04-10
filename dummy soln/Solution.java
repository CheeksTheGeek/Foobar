import java.util.; 
public class Solution {
    public static String solution(String[] l) {
        Arrays.sort(l, (part1,part2) -> {
            String[] tempstring1 = part1.split(".");
            String[] tempstring2 = part2.split("." );
            if(!Integer.valueOf(tempstring1[0]).equals(Integer.valueOf(tempstring2[0]))){
                return Integer.valueOf(tempstring1[0]) - Integer.valueOf(tempstring2[0]);
            }
            if(!Integer.valueOf(tempstring1[1]).equals(Integer.valueOf(tempstring2[1]))){
                return Integer.valueOf(tempstring1[1]) - Integer.valueOf(tempstring2[1]);
            }
            return Integer.valueOf(tempstring1[2]) - Integer.valueOf(tempstring2[2]);
        }
        );
        /*for(String finalString : l){
            System.out.println(finalString)
        }
        */
        return l;
        // Your code here
    }
    public static void main(String[] args){
        // Your code here
            String[]  x = {"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"};
            System.out.println(solution(x));


    }
}
import java.util.; 
public class Solution {
    public static String solution(String[] l) {
        Arrays.sort(l, (part1,part2) -> {
            String[] tempstring1 = part1.split(".");
            String[] tempstring2 = part2.split("." );
            if(!Integer.valueOf(tempstring1[0]).equals(Integer.valueOf(tempstring2[0]))){
                return Integer.valueOf(tempstring1[0]) - Integer.valueOf(tempstring2[0]);
            }
            if(!Integer.valueOf(tempstring1[1]).equals(Integer.valueOf(tempstring2[1]))){
                return Integer.valueOf(tempstring1[1]) - Integer.valueOf(tempstring2[1]);
            }
            return Integer.valueOf(tempstring1[2]) - Integer.valueOf(tempstring2[2]);
        }
        );
        /*for(String finalString : l){
            System.out.println(finalString)
        }
        */
        return l;
        // Your code here
    }
    public static void main(String[] args){
        // Your code here
            String[]  x = {"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"};
            System.out.println(solution(x));


    }
}