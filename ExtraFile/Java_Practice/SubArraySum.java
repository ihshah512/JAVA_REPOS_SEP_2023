import java.util.*;
public class SubArraySum {
    public static void arraySum() {

        String str = "";
        int arrLength;clear
        int sum;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length");
        arrLength = in.nextInt();
        int[] returnArr = new int[arrLength];
        System.out.println("Enter sum");
        sum = in.nextInt();
        System.out.println("StartEntering the ints for array");
        int loopCounter = 0;
        while (loopCounter <= returnArr.length) {

            returnArr[loopCounter] = in.nextInt();
            ++loopCounter;
        }
        int calculatedSum = 0;
        int[] myLastArr = new int[2];
        int right = 0, left = 0, calSum = 0;
        int arrSum = 0;
        for (int k : returnArr) {
            arrSum += k;
        }
        if ((returnArr[0] + returnArr[1]) == sum) {
            System.out.println("0 " + " 1");
        } else if (returnArr[0] == sum) {
            System.out.println("0 ");
        } else if (sum > arrSum) {

            System.out.println("Enter sum amount exceeds total Array Sum");
        }
        calculatedSum = returnArr[right]+returnArr[++left];
        while(calculatedSum != sum){
            calculatedSum = returnArr[right]+returnArr[++left];
            if(calculatedSum > sum){
                calculatedSum -= returnArr[right];
                if(calculatedSum == sum){
                    System.out.println(right + " "+ left);
                }else{
                    //++right;
                    calculatedSum = returnArr[++right]+ returnArr[++left];
                }
            }
            if(calculatedSum == sum){
                System.out.println(right + " " + left);
           }
        }
    }

    public static void main(String [] args){
        arraySum();
//        aSystem.out.println("hi");
    }
}
