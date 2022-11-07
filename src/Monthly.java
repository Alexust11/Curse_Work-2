import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class Monthly extends Task {
    public Monthly(String name, String description, Integer typeTask, Integer repeatability, LocalDate startData) {
        super(name, description, typeTask, repeatability, startData);
    }

    @Override
    public boolean formationDates(LocalDate localDateEnd) {
        LocalDate date = getStartData();
        while (!date.isAfter(localDateEnd)) {
            if (date.equals(localDateEnd)) {
                return true;
            }
            date = date.plusMonths(1);
        }
        return false;
    }

}

