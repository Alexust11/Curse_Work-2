import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiceTask  {
//    private Task task;
    public static Map<Integer, Task> taskList = new HashMap<>();
       public void printOneTaskData(Scanner scanner) {
           System.out.println(" Введите id задачи");
           int id=scanner.nextInt();
        int period = taskList.get(id).getRepeatability();
        LocalDate localDateEnd = LocalDate.of(2023, 12, 31);
        LocalDate localDateHome = taskList.get(id).getStartData();
        System.out.println(localDateHome);
        label:
        while (!localDateHome.isAfter(localDateEnd)) {
            if (period == 1) {
                break;

            }
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
    public void printTasksToData(Scanner  scanner) {

        System.out.println("Введите число");
        int day = scanner.nextInt();
        System.out.println("Введите месяц");
        int month = scanner.nextInt();
        System.out.println("Введите год");
        int year = scanner.nextInt();
        LocalDate localDateEnd=LocalDate.of(year,month,day);

        for (Integer n: taskList.keySet() ) {
            Integer number=taskList.get(n).getRepeatability(); // получаю значение повторяемости
            if (number == 1) {
                Onetime onetime=new Onetime();
                onetime.formationDates(localDateEnd,taskList.get(n));
            }
            if (number == 2) {
                Daily daily=new Daily();
                daily.formationDates(localDateEnd,taskList.get(n));
            }
            if (number == 3) {
                Weekly weekly=new Weekly();
                weekly.formationDates(localDateEnd,taskList.get(n));
            }
            if (number == 4) {
                Monthly monthly=new Monthly();
                monthly.formationDates(localDateEnd,taskList.get(n));
            }
            if (number == 5) {
                Annual annual=new Annual();
                annual.formationDates(localDateEnd,taskList.get(n));
            }
        }
    }
    public  void inputTask(Scanner scanner) {// метод ввода задачи и создания массива дат задачи
        Task task = new Task();
        System.out.print("Введите название задачи: ");
        String taskName = scanner.next();
        System.out.print("Введите описание задачи: ");
        String description = scanner.next();
        System.out.print("Введите тип задачи: 1-личная, 2-рабочая ");
        int typeTask = scanner.nextInt();
        System.out.println("Введите периодичность задачи: 1-- однократная, 2-ежедневная, 3- еженедельная, 4- ежемесячная, 5- ежегодная. ");
        int periodTask = scanner.nextInt();
        System.out.println("Введите день начала задачи");
        int dayTask = scanner.nextInt();
        System.out.println("Введите месяц начала задачи");
        int monthTask = scanner.nextInt();
        System.out.println("Введите год начала задачи");
        int yearTask = scanner.nextInt();
        //--------------------------------------------------
        task.setName(taskName);
        task.setDescription(description);
        task.setTypeTask(typeTask);
        task.setRepeatability(periodTask);
        task.setStartData(yearTask, monthTask, dayTask);
        //--------------------------------------------------
        taskList.put(task.getID(), task);

    }
    public void deleteTask(Scanner scanner) {
        System.out.print("Введите id удаляемой задачи: ");
        taskList.remove(scanner.nextInt());
    }
    public void printAllTask() {
        for (int n :taskList.keySet()) {
            System.out.println("id:"+taskList.get(n).getID()+" "+ taskList.get(n).toString());
        }
    }
    public void printOneTaskDate(Scanner scanner) {

        System.out.println(" Введите id задачи");
        Integer id=scanner.nextInt();
    }


}
