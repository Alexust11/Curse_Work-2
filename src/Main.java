
import java.time.LocalDate;

import java.util.*;



public class Main {


    public static   Map<Integer, Task> taskList = new HashMap<>();



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
//                            service.deleteTask(scanner);
                            break;
                        case 3:
//                            service.printTaskToData(scanner);
                            break;
                        case 4:
                            System.out.println(taskList);
//                            service.printTaskList();
                            break ;
                        case 5:
//                            service.printTaskDataList();
                            break ;
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
                        3. Получить задачу на указанный день
                        4. Получить общий список задач
                        5. Проверить список задач с датами (мапа с датами)
                        0. Выход
                        """
        );
    }
    private static void inputTask(Scanner scanner) {// метод ввода задачи и создания массива дат задачи
        Task task=new Task();
        System.out.print("Введите название задачи: ");
        String taskName = scanner.next();
        System.out.print("Введите описание задачи: ");
        String description = scanner.next();
        System.out.print("Введите тип задачи: 1-личная, 2-рабочая ");
        int typeTask=scanner.nextInt();
        System.out.println("Введите периодичность задачи: 1-- однократная, 2-ежедневная, 3- еженедельная, 4- ежемесячная, 5- ежегодная. ");
        int periodTask=scanner.nextInt();
        System.out.println("Введите день начала задачи");
        int dayTask=scanner.nextInt();
        System.out.println("Введите месяц начала задачи");
        int monthTask=scanner.nextInt();
        System.out.println("Введите год начала задачи");
        int yearTask=scanner.nextInt();
        //--------------------------------------------------
        task.setName(taskName);
        task.setDescription(description);
        task.setTypeTask(typeTask);
        task.setRepeatability(periodTask);
        task.setStartData(yearTask,monthTask,dayTask);
        //--------------------------------------------------
        taskList.put(task.getID(),task );

    }


} // -------------- end class main--------------------