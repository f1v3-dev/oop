import java.time.Duration;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        // 2025년 7월 21일 10시 30분부터 30분간 진행되는 회의 이벤트 인스턴스
        Event meeting = new Event(
                "회의",
                LocalDateTime.of(2025, 7, 21, 10, 30),
                Duration.ofMillis(30)
        );


    }
}
