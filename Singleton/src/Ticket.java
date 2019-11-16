public class Ticket {
    private int serialNumber;

    public Ticket(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isValidate() {
        if (this.serialNumber <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        if (isValidate()) {
            return this.getClass().getName() + serialNumber;
        }
        return "is not validate Ticket.";
    }
}
