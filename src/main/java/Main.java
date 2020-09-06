/**
 * @Author Phindile Mfeka
 * <>h1</>Checking Equality Project<>h1</>
 * <>p</>This program checks if the array elements equate to the max value in the array, return "true" if true or else return false.<>p</>
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(adding(new int[]{78,8,13,2,32,22}));
    }

    public static boolean adding(int [] arr){
        int max = 0;
        int sum = 0;
        boolean determiner = false;

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i != max) {
                sum += i;
                if (sum == max) {
                    determiner = true;
                } else {
                    determiner = false;
                }
            }
        }
        System.out.println("Max: "+max+" & Sum:"+sum);
        return determiner;
    }
}
