public class Solution {
    public static String solution(String x) {
        // Your code here
        char msgltr;
        String s = "";
        for( int i = 0 ; i < x.length() ; i++ ){
            msgltr= x.charAt(i);
            if( Character.isLetter(msgltr) ){
                if (Character.isLowerCase(msgltr))
                    msgltr = (char)(122 + 97 - (int)(msgltr));
                    s = s + msgltr;
                }
                else{
                    s=s+msgltr;
                
                }
          
         }
         return s;
        
        
    }
    public static void main(String[] args){
        // Your code here
            String  x= "Yvzs! I xzm'g yvorvev Lzmxv olhg srh qly zg gsv xlolmb!!";
            System.out.println(solution(x));
    }
}