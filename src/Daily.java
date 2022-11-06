import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class Daily implements Repeatable{

    @Override
    public void formationDates(LocalDate localDateEnd, Task task) {
       LocalDate taskDate = task.getStartData();

        while (!taskDate.isAfter(localDateEnd)) {

            if (taskDate.equals(localDateEnd)) {

                System.out.println(" На дату: "+localDateEnd+" имеется задача -"+task.getName());

            }

            taskDate=taskDate.plusDays(1);

        }


    }
}
