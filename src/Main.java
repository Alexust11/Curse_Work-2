
import java.time.LocalDate;

import java.util.*;

public class Main {

    public static LocalDate DATA_CHECK = LocalDate.of(2023, 12, 31);//  максимальная дата окончания периода формирования задач
    public static Map<Integer, Task> taskList = new HashMap<>();
    public static Map<Integer, ArrayList<LocalDate>> taskDataList = new HashMap<>();


    public static void main(String[] args) {

        Service service = new Service();
        service.menu();


        // printTaskData(task3);
    } // --------------end main-----------------------


} // -------------- end class main--------------------