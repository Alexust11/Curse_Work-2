import java.time.LocalDate;
import java.util.Map;

public class ServiceTask  {

    public void printTaskNew(Map<Integer, Task> map) {

        for (Integer n : map.keySet()) {
            System.out.println(" id задачи:" + n + " " + map.get(n).toString());
        }
        System.out.println(map);
    }

    public void printOneTaskData(Map<Integer, Task> map, Integer id) {


        int period = map.get(id).getRepeatability();
        LocalDate localDateEnd = LocalDate.of(2023, 12, 31);
        LocalDate localDateHome = map.get(id).getStartData();
        System.out.println(localDateHome);
        while (!localDateHome.isAfter(localDateEnd)) {
            if (period == 2) {
                localDateHome = localDateHome.plusDays(1);
            }
            if (period == 3) {
                localDateHome = localDateHome.plusWeeks(1);
            }
            if (period == 4) {
                localDateHome = localDateHome.plusMonths(1);
            }
            System.out.println(localDateHome);
        }
    }
    public void printTasksToData(Map<Integer, Task> map, LocalDate localDateEnd) {
        for (Integer n: map.keySet() ) {
            Integer number=map.get(n).getRepeatability(); // получаю значение повторяемости
            if (number == 1) {
                Onetime onetime=new Onetime();
                onetime.formationDates(localDateEnd);
            }
            if (number == 2) {
                Daily daily=new Daily();
                daily.formationDates(localDateEnd);
            }
            if (number == 3) {
                Weekly weekly=new Weekly();
                weekly.formationDates(localDateEnd);
            }
            if (number == 4) {
                Monthly monthly=new Monthly();
                monthly.formationDates(localDateEnd);
            }
            if (number == 5) {
                Annual annual=new Annual();
                annual.formationDates(localDateEnd);
            }
        }
    }


}
