
import java.time.LocalDate;

import java.util.*;


public class Main {


    public static Map<Integer, Task> taskList = new HashMap<>();
    public static LocalDate dataSearch;


    public static void main(String[] args) {

        menu();


        // printTaskData(task3);
    } // --------------end main-----------------------

    public static void menu() {
        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:

                            inputTask(scanner);
                            ;
                            break;
                        case 2:
                            deleteTask(scanner);
                            break;
                        case 3:
                            ServiceTask serviceTask2=new ServiceTask();
                            System.out.println("Введите число");
                            int day = scanner.nextInt();
                            System.out.println("Введите месяц");
                            int month = scanner.nextInt();
                            System.out.println("Введите год");
                            int year = scanner.nextInt();
                            LocalDate localDateEnd=LocalDate.of(year,month,day);
                            serviceTask2.printTasksToData(taskList,localDateEnd);
                            break;
                        case 4:
                            // System.out.println(taskList);
                            ServiceTask serviceTask = new ServiceTask();
                            System.out.println(taskList);
                            serviceTask.printTaskNew(taskList);
                            break;
                        case 5:
                            System.out.println(" Введите id задачи");
                            Integer id=scanner.nextInt();
                            ServiceTask serviceTask1=new ServiceTask();
                            serviceTask1.printOneTaskData(taskList, id);
                            break;
                        case 0:
                            break label;
                    }
                } else {
                    scanner.next();
                    System.out.println("Выберите пункт меню из списка!");
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println(
                """
                        1. Добавить задачу
                        2. Удалить задачу
                        3. Получить задачи на указанный день
                        4. Получить общий список задач
                        5. Получить даты одной задачи по id
                        0. Выход
                        """
        );
    }

    private static void inputTask(Scanner scanner) {// метод ввода задачи и создания массива дат задачи
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

    private static void deleteTask(Scanner scanner) {
        System.out.print("Введите id удаляемой задачи: ");
        taskList.remove(scanner.nextInt());
    }




} // -------------- end class main--------------------