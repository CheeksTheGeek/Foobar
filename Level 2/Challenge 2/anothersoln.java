public class anothersoln {
    public static int solution(int[] l) {
        
        // Your code here
        //check if any digit appears more than once in the list and then remove the duplicate digits
        int cleanlistcount = 0;
        int cleanlist[] = new int[l.length];
        for(int i = 0; i < l.length; i++) {
            for (int j = i + 1; j < l.length; j++) {
                if (l[i] != l[j]) {

                    cleanlist[cleanlistcount] = l[i];
                }
                else{
                    
                    cleanlistcount += 1;
                    continue;
                }
            }
            
        }
        //check if the sum of all digits is divisible by 3 in the list l
        int sum = 0;
        for (int i = 0; i < l.length; i++) {
            sum += l[i];
        }
        if(sum%3==0){
            return sum;
        }
        else{
            return 0;
        }
        
        
    }
}