package GreatestNumInString;

public class FindTheGreatestNumberInString {

    public static void main(String[] args) {

        System.out.println(greatestNumInString("asdfgh123ghjkl2324xcvbn3544vbnm"));



    }

    private static int greatestNumInString(String str) {
        int res = 0;

        int num = 0 ;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                num = num * 10 +(str.charAt(i)-'0');
            }else {
                res = Math.max(res,num);
                num = 0 ;
            }
        }
        return Math.max(res,num);

    }
}
