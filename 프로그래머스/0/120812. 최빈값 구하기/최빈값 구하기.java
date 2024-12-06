class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        int[] count = new int[max + 1];
        for (int num : array) {
            count[num]++;
        }
        int countMax = 0;
        answer = -1; 
        for (int i = 0; i < count.length; i++) {
            if (count[i] > countMax) {
                countMax = count[i];
                answer = i;
            } else if (count[i] == countMax) {
                answer = -1; 
            }
        }
        
        return answer;
    }
}
