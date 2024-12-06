import java.util.*;

class Solution {
    public int solution(int[] array) {
        Arrays.sort(array); // 배열 정렬
        int max = 0;        // 최빈값의 빈도수
        int maxNum = -1;    // 최빈값
        int cnt = 1;        // 현재 값의 빈도수

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                cnt++; // 이전 값과 같으면 빈도수 증가
            } else {
                if (cnt > max) {
                    max = cnt;       // 최대 빈도 갱신
                    maxNum = array[i - 1]; // 최빈값 갱신
                } else if (cnt == max) {
                    maxNum = -1; // 동률 발생 시 -1로 설정
                }
                cnt = 1; // 빈도수 초기화
            }
        }

        // 마지막 값 처리
        if (cnt > max) {
            maxNum = array[array.length - 1];
        } else if (cnt == max) {
            maxNum = -1;
        }

        return maxNum; // 최빈값 반환
    }
}
