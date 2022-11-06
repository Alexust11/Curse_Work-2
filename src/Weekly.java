import java.time.LocalDate;


public class Weekly implements Repeatable {


    @Override
    public void formationDates(LocalDate localDateEnd, Task task) {

        LocalDate taskDate = task.getStartData();
        while (!taskDate.isAfter(localDateEnd)) {
            if (taskDate.equals(localDateEnd)) {
                System.out.println(" На дату: " + localDateEnd + " имеется задача -" + task.getName());
            }
            taskDate = taskDate.plusWeeks(1);

        }


    }
}
