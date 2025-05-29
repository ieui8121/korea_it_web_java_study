package _27_Bean;

public class Main {
    public static void main(String[] args) {
        //UserEntity
        //UserId(int), username, age(int), email => private
        //기본생성자 하나 만들기
        //getter / setter

        //toString 오버라이드해서 정보 모두 출력되도록
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUsername("박수호");
        userEntity.setAge(18);
        userEntity.setEmail("ieui8121@naver.com");

        System.out.println(userEntity);

        userEntity.getUserId();
        userEntity.getUsername();
        userEntity.getAge();
        userEntity.getEmail();

    //    System.out.println(UserEntityLombok);

    }
}
