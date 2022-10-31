import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ServiсeTask  {

    private Task task;
    private HashMap <Integer, Task> taskList=new HashMap<>();

    public void menu() {
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
                            break;
                        case 2:
                            // todo: обрабатываем пункт меню 2
                            break;
                        case 3:
                            // todo: обрабатываем пункт меню 3
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

    } // ----end menu----------------
    private void addTask() {

    }
    private  void inputTask(Scanner scanner) {
        Task task=new Task();
        System.out.print("Введите название задачи: ");
        String taskName = scanner.next();
        System.out.print("Введите описание задачи: ");
        String descriptionTask=scanner.next();
              System.out.print("Введите тип  задачи 1-личная, 2-рабочая: ");
        String typeTask=scanner.next();
        if (typeTask.equals("1")) {
            task.setTitleTask(String.valueOf(TypeTask.PERSONAL));
        } else {
            task.setTitleTask(String.valueOf(TypeTask.WORKING));
        }

        task.setTitleTask(taskName);
        System.out.println(task);
    }
    private  void printMenu() {
        System.out.println(
                """
                        1. Добавить задачу
                        2. Удалить задачу
                        3. Получить задачу на указанный день
                        0. Выход
                        """
        );
    }
}
