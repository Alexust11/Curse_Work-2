import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class Annual implements Repeatable{
    private Task task;
    @Override
    public void formationDates(LocalDate localDateEnd) {
        LocalDate taskDate = task.getStartData();

        while (!taskDate.isAfter(localDateEnd)) {

            if (taskDate.equals(localDateEnd)) {

                System.out.println(" На дату: "+localDateEnd+" имеется задача -"+task.getName());

            }

            taskDate=taskDate.plusYears(1);

        }

    }
}
