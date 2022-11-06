import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class Daily extends Task{
    public Daily() {
    }

    @Override
    public boolean formationDates(LocalDate localDateEnd) {
        LocalDate date=getStartData();
        while (date.isBefore(localDateEnd)) {
            if (date.equals(localDateEnd)) {
                return true;
            }
            date=date.plusDays(1);
        }
        return false;
    }


}
