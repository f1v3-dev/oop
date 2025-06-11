/**
 * 극장을 구현하는 클래스
 *
 * @author Seungjo, Jeong
 */
public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /**
     * 극장에 입장하는 메서드
     *
     * @param audience 관람객 객체
     */
    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}
