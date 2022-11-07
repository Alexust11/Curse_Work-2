import java.time.LocalDate;
;

public class Annual extends Task {
    public Annual(String name, String description, Integer typeTask, Integer repeatability, LocalDate startData) {
        super(name, description, typeTask, repeatability, startData);
    }

    @Override
    public boolean formationDates(LocalDate localDateEnd) {
        LocalDate date = getStartData();
        while (!date.isAfter(localDateEnd)) {
            if (date.equals(localDateEnd)) {
                return true;
            }
            date = date.plusYears(1);
        }
        return false;
    }

}

