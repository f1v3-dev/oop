/**
 * 할인 정책이 없는 클래스
 *
 * @author Seungjo, Jeong
 */
public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
