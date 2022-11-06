import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class Monthly extends Task{
    public Monthly() {
    }

    @Override
    public boolean formationDates(LocalDate localDateEnd) {
       LocalDate date=getStartData();
        while (date.isBefore(localDateEnd)) {
            if (date.equals(localDateEnd)) {
                return true;
            }
            date=date.plusMonths(1);
        }
        return false;
    }

}

