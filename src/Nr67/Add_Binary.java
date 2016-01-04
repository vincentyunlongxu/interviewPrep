package Nr67;

/**
 * Created by yunlongxu on 12/22/15.
 */
public class Add_Binary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int lengthA = a.length() - 1;
        int lengthB = b.length() - 1;
        int carries = 0;
        String result = "";
        while (lengthB >= 0) {
            int sum = (int)(a.charAt(lengthA) - '0') + (int)(b.charAt(lengthB) - '0') + carries;
            result = String.valueOf(sum % 2) + result;
            carries = sum / 2;
            lengthA--;
            lengthB--;
        }
        while (lengthA >= 0) {
            int sum = (int)(a.charAt(lengthA) - '0') + carries;
            result = String.valueOf(sum % 2) + result;
            carries = sum / 2;
            lengthA--;
        }
        if (carries == 1) {
            result = "1" + result;
        }
        return result;
    }
}
