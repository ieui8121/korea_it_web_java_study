package _17_Method;

public class ParameterAndReturn {
//    public static void power(int number) {
//        int result = number * number;
//        System.out.println(number + "의 2승은" + result + "이다");
//    }

    public  static int gerPower(int number) {
        //int result = number * number.
        int result = number * number;
        return result;
    }

    public static int getPowerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int power = gerPower(3);
        System.out.println(power);

    }

    //문자열을 매개변수로 전달하고 해당 문자열의 길이를 반환받아서 출력하는 메소드
    // System.out.println(getStrLength("안녕하세요 반갑습니다."));
    
}
