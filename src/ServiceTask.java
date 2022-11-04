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
}
