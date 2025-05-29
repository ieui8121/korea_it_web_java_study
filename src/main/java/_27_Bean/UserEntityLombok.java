package _27_Bean;

import lombok.*;

// @NoArgsConstructor
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class UserEntityLombok {
    private  final int userId;
    @NonNull
    private String username;
    private int age;
    private String email;
}
//Entity
//데이터베이스의 테이블과 1:! 매핑되는 클래스
//자바 객체 <=> DB 테이블 간 데이터를 매핑하기 위해 사용
//DB와 DRUB 작업 에 사용

//
