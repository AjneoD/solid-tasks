package i.finished;

public interface LibraryCheckout {
    void checkIn();

    void checkOut(String borrower);

    int getCheckOutDurationInDays();
}