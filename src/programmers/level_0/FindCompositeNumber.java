package programmers.level_0;

/*
    약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
*/
public class FindCompositeNumber {

    public void FindCompositeNumber() {
        int randomInt = (int) (Math.random() * 100) + 1;
        int findCompositeNumber = FindCompositeNumber(randomInt);
        System.out.println("randomInt : " + randomInt  + "\n" +
                           "findCompositeNumber : " + findCompositeNumber);
    }


    public int FindCompositeNumber(int n) {

        int YaksuCount     = 0;
        int HapsungsuCount = 0;

        for (int i = 1; i <= n; i++) {
            YaksuCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) YaksuCount++;
            }

            if(YaksuCount >= 3) {
                HapsungsuCount++;
            }
        }

        return HapsungsuCount;
    }
}
