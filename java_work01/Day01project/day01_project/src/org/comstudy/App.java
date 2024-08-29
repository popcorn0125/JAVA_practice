package org.comstudy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 변수 선언 : 타입 변수명 = 초기값;
        // 초기값은 리터럴이라고 표현한다.
        // 타입은 기본타입(8가지), 참조타입
        // 기본타입:
        // ---- 논리형 boolean
        // ---- 실수형 float, double (부동 소수점을 갖는다, 기본형은 double) 3.14, 3.14f
        // ---- 정수형 byte, short, int, long (정수형의 기본형은 int) 365, 365L
        // ---- 문수형 char (문자형도 정수형에 속한다. 문자는 아스키코드이기 때문이다.)
        String greeting = "안녕 세계";
        
        System.out.println(greeting);
        System.out.print("이름 입력 : ");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.println(name);
    }
}
