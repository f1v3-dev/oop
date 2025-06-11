/**
 * 관람객 클래스
 *
 * @author Seungjo, Jeong
 */
public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
