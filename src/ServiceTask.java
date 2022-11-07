import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiceTask {
    //    private Task task;
    public static Map<Integer, Task> taskList = new HashMap<>();

    public void printOneTaskData(Scanner scanner) {
        System.out.println(" Введите id задачи");
        int id = scanner.nextInt();
        int period = taskList.get(id).getRepeatability();
        LocalDate localDateEnd = LocalDate.of(2023, 12, 31);
        LocalDate localDateHome = taskList.get(id).getStartData();
        while (!localDateHome.isAfter(localDateEnd)) {
            System.out.println(localDateHome);
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

        }
    }

    public void printTasksToData(Scanner scanner) {

        System.out.println("Введите число");
        int day = scanner.nextInt();
        System.out.println("Введите месяц");
        int month = scanner.nextInt();
        System.out.println("Введите год");
        int year = scanner.nextInt();
        LocalDate localDateEnd = LocalDate.of(year, month, day);


        for (Map.Entry<Integer, Task> n : taskList.entrySet()) {
            var task = n.getValue();
            if (task.formationDates(localDateEnd)) {
                System.out.println(" на дату " + localDateEnd + " етсь задача " + task.getName());
            }
        }
    }

    public void inputTask(Scanner scanner) {// метод ввода задачи и создания массива дат задачи

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
        LocalDate startTask = LocalDate.of(yearTask, monthTask, dayTask);
        //--------------------------------------------------
        switch (periodTask) {
            case 1:
                var task = new Task(taskName, description, typeTask, periodTask, startTask);
                taskList.put(task.getId(), task);
                break;
            case 2:
                var task1 = new Daily(taskName, description, typeTask, periodTask, startTask);
                taskList.put(task1.getId(), task1);
                break;
            case 3:
                var task2 = new Weekly(taskName, description, typeTask, periodTask, startTask);
                taskList.put(task2.getId(), task2);
                break;
            case 4:
                var task3 = new Monthly(taskName, description, typeTask, periodTask, startTask);
                taskList.put(task3.getId(), task3);
                break;
            case 5:
                var task4 = new Annual(taskName, description, typeTask, periodTask, startTask);
                taskList.put(task4.getId(), task4);
                break;
        }


        //--------------------------------------------------


    }

    public void deleteTask(Scanner scanner) {
        System.out.print("Введите id удаляемой задачи: ");
        taskList.remove(scanner.nextInt());
    }

    public void printAllTask() {
        for (int n : taskList.keySet()) {
            System.out.println("id:" + taskList.get(n).getId() + " " + taskList.get(n).toString());
        }
    }

    public void printOneTaskDate(Scanner scanner) {

        System.out.println(" Введите id задачи");
        Integer id = scanner.nextInt();
    }


}
