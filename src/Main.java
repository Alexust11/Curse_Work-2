import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static LocalDate DATA_CHEK=LocalDate.of(2022,12,31);// дата окончания периода формирования задач
//    public static LocalDate checkedDate;
    public static Map<Integer, Task> taskList=new HashMap<>();

    public static void main(String[] args) {
        Task task1 = new Task("Первая задача", "Описание первой задачи", 1,1,2022,11,5);

        Task task2 = new Task("Вторая задача", "Описание второй задачи", 2, 1, 2022,11,3);
        Task task3 = new Task("Третья задача", "Описание третьей задачи", 1, 3,2022,11,4);
        Task task4 = new Task("Четвертая задача", "Описание четвертой задачи", 2, 1,2022,11,5);
        taskList.put(task1.getID(),task1);
        taskList.put(task2.getID(),task2);
        taskList.put(task3.getID(),task3);
        taskList.put(task4.getID(),task4);
        //printListTaskOfData(2022,11,19);//проверяемая дата
        Service service = new Service();
        service.menu();

//        checkedDate = LocalDate.of(2022, 12, 15);


      // printTaskData(task3);
    } // --------------end main-----------------------

    private static void printTaskData(Task task) {
        int n=0;
        System.out.println("Задача: "+task.getName()+" будет выполнятся в следующие даты");
        LocalDate data1=task.getStartData();
        int step=task.getRepeatability();
        while (!data1.isAfter(DATA_CHEK) ) {
            if (step == 2) {
                data1 = data1.plusDays(1);
                System.out.println(data1);

            }
            if (step == 3) {
                data1 = data1.plusWeeks(1);
                System.out.println(data1);
            }
            if (step == 4) {
                data1 = data1.plusMonths(1);
                System.out.println(data1);
            }


        }
    }

    public static void printListTaskOfData(int year, int month, int day) {
        LocalDate checkedDate = LocalDate.of(year, month, day);
        Integer n=0;

        for (int i = 1; i <= taskList.size(); i++) {
                int count=0;
                LocalDate interimDate=taskList.get(i).getStartData();
                LocalDate localDate2=checkedDate;
//            System.out.println("для задачи "+taskList.get(i).getName()+" начальная дата "+interimDate);
            if (taskList.get(i).getRepeatability() == 1) {
                while (interimDate.isBefore(checkedDate)) {
                    interimDate = interimDate.plusWeeks(1);
                    if (interimDate.isEqual(checkedDate)) {
                        System.out.println(" в дату "+checkedDate+" есть задача "+taskList.get(i).getName());
                    }
//                    System.out.println("есть выполнение условия, промежуточная дата"+ interimDate+ "для задачи"+taskList.get(i).getName());
                }


            }

        }

    }
} // -------------- end class main--------------------