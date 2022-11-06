import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class Onetime implements Repeatable{

    @Override
    public void formationDates(LocalDate localDateEnd, Task task) {
        LocalDate taskDate = task.getStartData();

        if (taskDate.equals(localDateEnd)) {
            System.out.println(" На дату: "+localDateEnd+" имеется задача -"+task.getName());
        }

    }
}
