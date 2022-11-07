
import java.time.LocalDate;

import java.util.*;


public class Main {


    public static LocalDate dataSearch;


    public static void main(String[] args) {

        menu();


        // printTaskData(task3);
    } // --------------end main-----------------------

    public static void menu() {
        ServiceTask serviceTask = new ServiceTask();
        try (Scanner scanner = new Scanner(System.in)) {
            label:
            while (true) {
                printMenu();
                System.out.print("Выберите пункт меню: ");
                if (scanner.hasNextInt()) {
                    int menu = scanner.nextInt();
                    switch (menu) {
                        case 1:
                            serviceTask.inputTask(scanner);
                            break;
                        case 2:
                            serviceTask.deleteTask(scanner);
                            break;
                        case 3:
                            serviceTask.printTasksToData(scanner);
                            break;
                        case 4:

                            serviceTask.printAllTask();
                            break;
                        case 5:
                            serviceTask.printOneTaskData(scanner);
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


} // -------------- end class main--------------------