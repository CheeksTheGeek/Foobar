import java.util.Arrays;
public class Solution {
    public static String versForm(String vers) {
        while(vers.split("\\." ).length < 3) {
            vers += ".0";
        }
        return vers;
    }
    public static String[] solution(String[] l) {
        Arrays.sort(l, (part1,part2) -> {
            String[] tempstring1 = versForm(part1).split("\\.");
            String[] tempstring2 = versForm(part2).split("\\." );
            if(!Integer.valueOf(tempstring1[0]).equals(Integer.valueOf(tempstring2[0]))){
                return Integer.valueOf(tempstring1[0]) - Integer.valueOf(tempstring2[0]);
            }
            if(!Integer.valueOf(tempstring1[1]).equals(Integer.valueOf(tempstring2[1]))){
                return Integer.valueOf(tempstring1[1]) - Integer.valueOf(tempstring2[1]);
            }
            if(!Integer.valueOf(tempstring1[2]).equals(Integer.valueOf(tempstring2[2]))){
                return Integer.valueOf(tempstring1[2]) - Integer.valueOf(tempstring2[2]);
            }
            
            return part1.length()-part2.length();

        }
        );

        

        return l;

    }
    
    public static void main(String[] args){
            //test case 1 : "1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"
            //test case 2 : "1.1.2", "1.0", "1.3.3", "1.0.12", "1.0.2"

            
            
            String[]  ab = {"1.11", "2.0.0", "1.2", "2", "0.1", "1.2.1", "1.1.1", "2.0"};
            System.out.print(Arrays.toString(solution(ab)));
           
    
    }
}
