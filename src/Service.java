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
                            printTaskToData(scanner);
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

    private void printTaskToData(Scanner scanner) {//метод вывода задач по дате
        System.out.println("Введите число");
        int day = scanner.nextInt();
        System.out.println("Введите месяц");
        int month=scanner.nextInt();
        System.out.println("Введите год");
        int year=scanner.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println("На дату "+date+" имеются задачи:");
        for (int i = 1; i <=Main.taskDataList.size() ; i++) {

                if (Main.taskDataList.get(i).contains(date)) {
                    System.out.println(Main.taskList.get(i).getName());
                }



        }
    }

    private static void inputTask(Scanner scanner) {// метод ввода задачи и создания массива дат задачи
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
        if (periodTask == 1) {
            Onetime onetime=new Onetime();
            onetime.formationDates(LocalDate.of(yearTask,monthTask,dayTask),Main.DATA_CHECK,task.getID());
        }
        if (periodTask == 2) {
            Daily daily=new Daily();
            daily.formationDates(LocalDate.of(yearTask,monthTask,dayTask),Main.DATA_CHECK,task.getID());
        }
        if (periodTask == 3) {
            Weekly weekly=new Weekly();
            weekly.formationDates(LocalDate.of(yearTask,monthTask,dayTask),Main.DATA_CHECK,task.getID());
        }
        if (periodTask == 4) {
            Monthly monthly=new Monthly();
            monthly.formationDates(LocalDate.of(yearTask,monthTask,dayTask),Main.DATA_CHECK,task.getID());
        }
        if (periodTask == 5) {
            Annual annual=new Annual();
            annual.formationDates(LocalDate.of(yearTask,monthTask,dayTask),Main.DATA_CHECK,task.getID());
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
   public void printTaskList() { // метод получения общего списка задач
       for (int i = 1; i <= Main.taskList.size(); i++) {

           if (Main.taskList.get(i).getID()!=null) {
               System.out.println("ID задачи-"+Main.taskList.get(i).getID()+". Название задачи - "+Main.taskList.get(i).getName());

           }
       }

   }

    public void deleteTask(Scanner scanner) {// метод удаления задач по id, требует доработки: Нужно сдвинуть объекты map, иначе пропуск id и ошибка
        System.out.println("Введите ID удаляемой задачи");
        int id=scanner.nextInt();
        Main.taskList.remove(id);
    }

    public void printTaskDataList() {
        System.out.println(Main.taskDataList);
    }// временный метод для вывода всех дат всех задач
}
