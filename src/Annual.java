import java.time.LocalDate;
;

public class Annual extends Task{
    public Annual() {
    }

    @Override
    public boolean formationDates(LocalDate localDateEnd) {
        LocalDate date=getStartData();
        while (date.isBefore(localDateEnd)) {
            if (date.equals(localDateEnd)) {
                return true;
            }
            date=date.plusYears(1);
        }
        return false;
    }

    }

