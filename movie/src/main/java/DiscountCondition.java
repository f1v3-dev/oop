/**
 * 할인 조건 인터페이스
 *
 * @author Seungjo, Jeong
 */
public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
