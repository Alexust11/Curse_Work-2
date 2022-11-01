import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class ServiсeTask implements RepeatTask {
    private Integer count=0;

    private Task task;
    private HashMap<String, Task> taskList=new HashMap<String, Task>();

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
                            System.out.println(taskList.toString());
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
        count++;
        System.out.print("Введите название задачи: ");
        String taskName = scanner.next();
        System.out.print("Введите описание задачи: ");
        String descriptionTask=scanner.next();
              System.out.print("Введите тип  задачи 1-личная, 2-рабочая: ");
        String typeTask=scanner.next();
        if (typeTask.equals("1")) {
            task.setTypeTask("личная");
        } else {
            task.setTypeTask("рабочая");
        }
        System.out.println("Введите периодичность задачи:1- однократная,2- ежедневная,3-еженедельная,4-ежемесячная,5- ежегодная");
            String period=scanner.next();
        if (period.equals("1")) { task.setRepeatability(period);}
        if (period.equals("2")) { task.setRepeatability(period);}
        if (period.equals("3")) { task.setRepeatability(period);}
        if (period.equals("4")) { task.setRepeatability(period);}
        if (period.equals("5")) { task.setRepeatability(period);}


        task.setDataTaskNow(LocalDate.now());

        task.setDescriptionTask(descriptionTask);
        task.setTitleTask(taskName);
        String id="Задача"+String.valueOf(count);
        taskList.put(id, task);
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

    @Override
    public Integer repeatTask(Integer sign) {
        return null;
    }
}
