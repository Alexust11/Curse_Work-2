import java.time.LocalDate;


public class Weekly extends Task {
    public Weekly() {
    }

    @Override
    public boolean formationDates(LocalDate localDateEnd) {
        LocalDate date=getStartData();
        while (date.isBefore(localDateEnd)) {
            if (date.equals(localDateEnd)) {
                return true;
            }
            date=date.plusWeeks(1);
        }
        return false;
    }


    }

