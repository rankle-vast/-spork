import java.util.Scanner;
import java.util.regex.Pattern;

public class IDcard {
    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }
    public static boolean isLeapYear(int year){
        return year%400 == 0 || (year%4 == 0 && year%100 != 0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String IDNumber = sc.nextLine();
        if(IDNumber.length() == 18 && isNumeric(IDNumber.substring(0,17))){
            String endChar = IDNumber.substring(17);
            if(isNumeric(endChar) || endChar.equals("X")){
                int year = Integer.parseInt(IDNumber.substring(6,10));
                int mouth = Integer.parseInt(IDNumber.substring(10,12));
                int day = Integer.parseInt(IDNumber.substring(12,14));
                int[] mouthDay = {31,28,31,30,31,30,31,31,30,31,30,31};
                if(year>=1900&&year<=2019&&mouth>=1&&mouth<=12&&day>=1) {
                    if (isLeapYear(year))
                        mouthDay[1] += 1;
                    if(day<=mouthDay[mouth-1]){
                        System.out.println("为合法的身份证号");
                    }
                }
            }
        }
        else System.out.println("为不合法的身份证号");
    }

}