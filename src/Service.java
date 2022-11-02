import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

public class Service {
    private Task task;
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
                            deleteTask(scanner);
                            break;
                        case 3:
                            // todo: обрабатываем пункт меню 3
                            break;
                        case 4:
                            printTaskList();
                            break ;
                        case 5:
                            printTaskDataList();
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
    private static void inputTask(Scanner scanner) {
        Task task=new Task();
        System.out.print("Введите название задачи: ");
        String taskName = scanner.next();
        System.out.print("Введите описание задачи: ");
        String description = scanner.next();
        System.out.print("Введите тип задачи: 1-личная, 2-рабочая ");
        int typeTask=scanner.nextInt();
        System.out.print("Введите периодичность задачи: 1-- однократная, 2-ежедневная, 3- еженедельная, 4- ежемесячная, 5- ежегодная. ");
        Integer periodTask=scanner.nextInt();
        System.out.println("Введите день начала задачи");
        Integer dayTask=scanner.nextInt();
        System.out.println("Введите месяц начала задачи");
        Integer monthTask=scanner.nextInt();
        System.out.println("Введите год начала задачи");
        Integer yearTask=scanner.nextInt();

        task.setName(taskName);
        task.setDescription(description);
        task.setTypeTask(typeTask);
        task.setRepeatability(periodTask);
        task.setStartData(yearTask,monthTask,dayTask);
        task.setID(Main.taskList.size()+1);
        Main.taskList.put(task.getID(),task);

        switch (periodTask) {
            case 3:
               Weekly weekly=new Weekly();
               weekly.formationDates(LocalDate.of(yearTask,monthTask,dayTask),Main.DATA_CHEK,task.getID());

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
   public void printTaskList() {
       for (int i = 1; i <= Main.taskList.size(); i++) {
           System.out.println("ID задачи-"+Main.taskList.get(i).getID()+". Название задачи - "+Main.taskList.get(i).getName());
       }

   }

    public void deleteTask(Scanner scanner) {
        System.out.println("Введите ID удаляемой задачи");
        int id=scanner.nextInt();
        Main.taskList.remove(id);
    }

    public void printTaskDataList() {
        System.out.println(Main.taskDataList);
    }
}
