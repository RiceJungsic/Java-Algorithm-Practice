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
