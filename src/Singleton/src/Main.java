// 티켓 발행기를 이용해 티켓을 할당받기.
// 티켓 발행기는 1개만 존재
// 발행된 티켓은 고유의 시리얼 넘버가있다.
// 시리얼넘버가 0보다 작거나 같으면 유효하지 않은 티켓이다.
// 발행할수있는 티켓은 5개이다.

public class Main {
    public static void main(String[] args) {
        TicketMachine ticketMachine = TicketMachine.getInstance();

        Ticket[] tickets = new Ticket[10];

        for(int i=0;i<tickets.length;i++){
            tickets[i] = ticketMachine.getTicket();
        }

        for(int i=0;i<tickets.length;i++){
            System.out.println(tickets[i]);
        }
    }

}
