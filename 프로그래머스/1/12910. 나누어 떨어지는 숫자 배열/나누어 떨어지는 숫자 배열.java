import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int a = 0;
        int number = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                a++;
            }
        }
        
        if(a == 0){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[a];
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                answer[number] = arr[i];
                number++;
            }
        }
            Arrays.sort(answer);
        return answer;
    }
}