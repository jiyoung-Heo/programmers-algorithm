package SummerWinterCoding.level2.점프와순간이동;

import java.util.*;

//6:23
//6:33
//7:38
//7:43
//풀이시간 25분
//처음에 dfs로 푸려고 하다가 시간초과발생
//단순하게 생각해서 풀이함
public class Solution {
    List<Integer> list = new ArrayList<>();

    public int solution(int n) {
        int ans = 1;
        while (n != 1) {
            ans += n % 2;
            n /= 2;
        }
        return ans;
    }
}