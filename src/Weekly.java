import java.time.LocalDate;


public class Weekly extends Task {
    public Weekly(String name, String description, Integer typeTask, Integer repeatability, LocalDate startData) {
        super(name, description, typeTask, repeatability, startData);
    }

    @Override
    public boolean formationDates(LocalDate localDateEnd) {
        LocalDate date=getStartData();
        while (!date.isAfter(localDateEnd)) {
            if (date.equals(localDateEnd)) {
                return true;
            }
            date=date.plusWeeks(1);
        }
        return false;
    }


    }

