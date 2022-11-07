import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class Daily extends Task {
    public Daily(String name, String description, Integer typeTask, Integer repeatability, LocalDate startData) {
        super(name, description, typeTask, repeatability, startData);
    }

    @Override
    public boolean formationDates(LocalDate localDateEnd) {
        LocalDate date = getStartData();
        while (!date.isAfter(localDateEnd)) {
            if (date.equals(localDateEnd)) {
                return true;
            }
            date = date.plusDays(1);
        }
        return false;
    }


}
