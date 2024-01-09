public class Main {
    public static void main(String[] args) {

    }


    public static boolean isPalindrome (int number) {
         number=Math.abs(number);
         char[] digits =String.valueOf(number).toCharArray();
         String reversed = "";
         for (int i = digits.length-1; i >= 0 ; i-- ) {
             reversed += digits [i];
         }
         return reversed.equals(String.valueOf(number));
    }

    public static boolean isPalindrome2(int number) {
        number = Math.abs(number);
        int originalNum = number;
        int reversNumber = 0;

        while (number>0){
            int digit = number %10;
            reversNumber = reversNumber*10 + digit;
            number = number /10;
        }
        return originalNum == reversNumber;
    }

    public static boolean isPalindrome3(int number) {
        number = Math.abs(number);
        String numberString = Integer.toString(number);
        char[] charNumber = numberString.toCharArray();

        int firstIndex = 0;
        int lastIndex = charNumber.length - 1 ;
        while (firstIndex < lastIndex) {
            if (charNumber[firstIndex] != charNumber[lastIndex])
                return false;
            firstIndex++;
            lastIndex--;
        }
        return true;
    }

    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        int total = 0;
        for (int i=1;i <= num / 2; i++) {
            if (num % i == 0) total +=i;
        }
        return num == total;
    }

    public static String numberToWords(int num) {
        if (num<0) {
            return "Invalid Value";
        }
        char[] digits = String.valueOf(num).toCharArray();
        String numToText = "";
        for(char digit : digits) {
            switch (digit) {
                case '0':
                    numToText += "Zero";
                    break;
                case '1':
                    numToText += "One";
                    break;
                case '2':
                    numToText += "Two";
                    break;
                case '3':
                    numToText += "Three";
                    break;
                case '4':
                    numToText += "Four";
                    break;
                case '5':
                    numToText += "Five";
                    break;
                case '6':
                    numToText += "Six";
                    break;
                case '7':
                    numToText += "Seven";
                    break;
                case '8':
                    numToText += "Eight";
                    break;
                case '9':
                    numToText += "Nine";
                    break;
            }
        }
        return numToText;
    }
}