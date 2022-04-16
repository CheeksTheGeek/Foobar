import java.util.Arrays;
public class Solution {
    public static int solution(int[] l) {
        Arrays.sort(l);
        int l_sum = 0;
         for(int i = 0; i < l.length; i++) {
             l_sum += l[i];
        }
        if(l_sum%3==0){
            return numbermaker(l);
        }  
        if(l_sum%3==1){
            for(int i = 0; i<l.length; i++){
                if(l[i]%3==1){
                    return numbermaker(elementremover(l, i));
                }
            }
            int x=0;
            int[] partially_cleaned_list = new int[l.length-1];
            for(int i= 0; i<l.length; i++){
                if(l[i]%3==2){
                    partially_cleaned_list =  elementremover(l, i);
                    x = i-1;
                }
                if(l[i]%3==2 && i!=x){
                    return numbermaker(elementremover(partially_cleaned_list, i));
                }
            }
        }
        else{
            for(int i = 0; i<l.length; i++){
                if(l[i]%3==2){
                    return numbermaker(elementremover(l, i));
                }
            }
            int x=0;
            int[] partially_cleaned_list = new int[l.length-1];
            for(int i= 0; i<l.length; i++){
                if(l[i]%3==1){
                    partially_cleaned_list =  elementremover(l, i);
                    x = i;
                }
                if(l[i]%3==1 && i!=x){
                    return numbermaker(elementremover(partially_cleaned_list, i));
                }
            }

        }
        return 0;
        

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
    public static int numbermaker(int[] l){
        String l_int = Integer.toString(descendsort(l)[0]);
        for(int i = 1; i < l.length; i++) {
            l_int += descendsort(l)[i];
        }
        return Integer.parseInt(l_int);
    }
    public static int[] elementremover(int[] l, int indexoftrash){
        int[] firsttemparray = Arrays.copyOfRange(l, 0, indexoftrash);
        int[] secondtemparray = Arrays.copyOfRange(l, indexoftrash+1, l.length);
        int[] cleanarray = new int[firsttemparray.length+secondtemparray.length];
        System.arraycopy(firsttemparray, 0, cleanarray, 0, firsttemparray.length);
        System.arraycopy(secondtemparray, 0, cleanarray, firsttemparray.length, secondtemparray.length);
        return cleanarray;
    }
    public static void main(String[] args){
        int[] l = {3, 1, 4, 1, 4, 9};
        int[] m = {3, 1, 4, 1};
        int[] n = {3, 1, 4, 1, 5, 9};
        int[] o = {6, 9, 0, 5, 5};
        // int[] arr = {l,m,n};
        // int[] answarr = {"94431", "4311", "94311"}
        // for(int i = 0; i < arr.length; i++) {
        //     if(arr[i] )
        // }
        System.out.println(solution(o));
    }
}
