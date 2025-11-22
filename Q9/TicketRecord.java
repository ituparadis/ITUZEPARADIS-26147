package _27089.Q9;

public final class TicketRecord extends Invoice {

    public TicketRecord() {}

    // Formula: price + baggageFee
    public double generateInvoice() {
        return getPrice() + getBaggageFee();
    }
}