import java.time.Duration;

/**
 * Main class for the Movie application.
 *
 * @author Seungjo, Jeong
 */
public class Main {

    public static void main(String[] args) {
        Movie avatar = new Movie(
                "아바타",
                Duration.ofMinutes(120),
                Money.wons(10_000),
                new AmountDiscountPolicy() // 객체를 생성하는 시점에 DiscountPolicy를 결정
        );

        avatar.changeDiscountPolicy(new PercentDiscountPolicy()); // 유연하게 할인 정책을 변경할 수 있는 구조로 개선

        // 즉, 컴파일 시간 의존성과 실행 시간 의존성을 다르게 설계할 수 있다는 것

        Movie avengers = new Movie(
                "어벤져스",
                Duration.ofMinutes(150),
                Money.wons(12_000),
                new PercentDiscountPolicy() // 다른 DiscountPolicy를 사용
        );

        Movie starWars = new Movie(
                "스타워즈",
                Duration.ofMinutes(130),
                Money.wons(11_000),
                new NoneDiscountPolicy() // 할인 정책이 없는 경우
        );
    }
}
