/**
 * 할인 정책 인터페이스
 *
 * @author Seungjo, Jeong
 */
public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);
}
