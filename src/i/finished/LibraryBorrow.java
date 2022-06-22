package i.finished;

import java.time.LocalDateTime;

public interface LibraryBorrow {
    LocalDateTime getBorrowDate();

    String getBorrower();
    String getLibraryId();

}