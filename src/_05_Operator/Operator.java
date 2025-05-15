package _05_Operator;

public class Operator {
    public static void main(String[] args) {
        //연산자

        //대입 연산자
        int num1 = 10;
        int num2 = 5;
        //여기서 =은 해당 변수에 데이터(값)을 대입한다는 의미
        //수학적인 같다라는 의미가 아님
        
        //산술 연산자
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);//몫
        System.out.println(num1 % num2);//나머지

        //복합 대입 연산자
        num1 += 5; //num1 = num1 + 5 => 15
        System.out.println(num1);
        num1 -= 5; //num1 = num1 - 5 => 10
        System.out.println(num1);
        num1 *= 2; //num1 = num1 * 2 => 20
        System.out.println(num1);
        num1 /= 2; //num1 == num1 / 2 => 10
        System.out.println(num1);
        num1 %= 2; //num1 = num1 % 2 => 0
        System.out.println(num1);

/*  
*int height = 숫자;
*키가 120 이상인 걍우 탈추 가능하도록 하는 상향연산자 
* 가능하면 "탑승 가능" 불가능 하면 "탑승 불가능" 출력/
 */
        int height = 140;
        String result (height >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println(result);
    }
}
