public class TicketMachine {
    private static TicketMachine ticketMachine; // 정적 변수 티켓머신
    private final int MAX_TICKET = 5;
    private int counter = 1;
    private int serialNumber = 1;

    private TicketMachine() { // 생성자를 private으로 선언하여 외부에서 생성못하게한다.
    }

    public static synchronized TicketMachine getInstance() { // 다중 쓰레드에서는 여러개의 티켓머신이 생성될수있기때문에 동기화 시켜준다.
        // ticketMachine이 null이라면 객체생성
        if (ticketMachine == null) {
            ticketMachine = new TicketMachine();
        }

        return ticketMachine;
    }

    public Ticket getTicket() {
        if (counter > MAX_TICKET) {
            System.out.println("티켓은 5개밖에 발행할 수 없습니다.");
            return null;
        }
        counter++;
        return new Ticket(serialNumber++);
    }
}
