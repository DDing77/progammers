class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int nCola;

        while(n >= a) {
            answer += (n / a)* b;
            n = n%a + (n / a)* b;
        }

        return answer;
    }
}