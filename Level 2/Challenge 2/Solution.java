import java.util.Arrays;

public class Solution {
    
    public static int solution(int[] l) {
        // Your code here
        /*You have L, a list containing some digits (0 to 9). Write a function solution(L) which finds 
        the largest number that can be made from some or all of these digits and is divisible by 3. 
        If it is not possible to make such a number, return 0 as the solution. L will contain anywhere from 1 to 9 digits.  
        The same digit may appear multiple times in the list, but each element in the list may only be used once. */
        
        int mod_three_digits = 0;
        int two_mod_three_index_1 = -1;
        int two_mod_three_index_2 = -1;
        int one_mod_three_index = -1;

        // sum of array l
        int l_sum = 0;
         for(int i = 0; i < l.length; i++) {
             l_sum += l[i];
        }

        //conditions to check if the original list is divisible by 3, if not then what letter to remove to make it
        if(l_sum % 3==1){
            // checking if a digit in the list l is 1 mod 3
            for(int i = 0; i < l.length; i++) {
                if(l[i] % 3 == 1){
                    // remembering its index to remove 
                    one_mod_three_index = i;
                    mod_three_digits+=1;
                    
                    break;
                }
            }
            // check if there are two digits in the list l that are 2 mod 3 (part1)
            for(int i = 0; i < l.length; i++) {
                if(l[i] % 3 == 2){
                    // remembering its index to remove 
                    two_mod_three_index_1 = i;
                    mod_three_digits+=1;
                    break;
                }
            }
            // check if there are two digits in the list l that are 2 mod 3 (part2)
            for(int i = 0; i< l.length; i++) {
                if(l[i] % 3 == 2 && i != two_mod_three_index_1){
                    // remembering its index to remove 
                    two_mod_three_index_2 = i;
                    mod_three_digits+=1;
                    break;
                }
            }
            //making a new list without the disturbing digits
            int[] cleanlist = new int[l.length-mod_three_digits];
            for (int i = 0, j = 0; i < l.length; i++) {
                if(mod_three_digits==1){
                    if(i == one_mod_three_index || i == two_mod_three_index_1 || i == two_mod_three_index_2){
                        continue;
                    }
                    
                    cleanlist[j++] = l[i];
                }
            }
            return numbermaker(cleanlist);
        }
        if(l_sum % 3==2){

            return 0;
        }
        //condition: when the array of numbers is already divisible by 3, so I form the 
        //largest possible number by reversing the list and then turning it into an integer
        else{
            return numbermaker(l);

        }

    }
    public static int[] descendsort(int[] l){
        //getting the descending order sort of the list l
        Arrays.sort(l);
        int[] revsortedlist = new int[l.length];
        int temp_length = l.length;
        for(int i = 0; i < l.length; i++) {
            revsortedlist[i] = l[temp_length - 1];
            temp_length -= 1;
        }
        return revsortedlist;
    }

    //turning the array l into an integer for returning
    public static int numbermaker(int[] l){
        String l_int = Integer.toString(descendsort(l)[0]);
        for(int i = 1; i < l.length; i++) {
            l_int += descendsort(l)[i];
        }
        return Integer.parseInt(l_int);
    }
    //Main function for testing
    public static void main(String[] args){
        int[] l = {3, 1, 4, 1, 4, 9};
        solution(l);
        System.out.println(solution(l));
    }
}