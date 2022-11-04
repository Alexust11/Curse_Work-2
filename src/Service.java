import java.awt.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Scanner;

public class Service extends Task {

 private Task task;



    public void printTaskToData(Scanner scanner) {//метод вывода задач по дате
        System.out.println("Введите число");
        int day = scanner.nextInt();
        System.out.println("Введите месяц");
        int month=scanner.nextInt();
        System.out.println("Введите год");
        int year=scanner.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        System.out.println("На дату "+date+" имеются задачи:");

    }

   public void inputTask(Scanner scanner) {// метод ввода задачи и создания массива дат задачи
//        Task task=new Task();
        System.out.print("Введите название задачи: ");
        String taskName = scanner.next();
        System.out.print("Введите описание задачи: ");
        String description = scanner.next();

         Label1:
        System.out.print("Введите тип задачи: 1-личная, 2-рабочая ");
        int typeTask=scanner.nextInt();
//        while (typeTask != 1 || typeTask != 2) {
//            System.out.println(" Вы ввели некоретное значение. Нужно 1 или 2 ");
//            System.out.print("Введите тип задачи: 1-личная, 2-рабочая ");
//             typeTask=scanner.nextInt();
//        }
        System.out.print("Введите периодичность задачи: 1-- однократная, 2-ежедневная, 3- еженедельная, 4- ежемесячная, 5- ежегодная. ");
        int periodTask=scanner.nextInt();
        System.out.println("Введите день начала задачи");
        int dayTask=scanner.nextInt();
        System.out.println("Введите месяц начала задачи");
        int monthTask=scanner.nextInt();
        System.out.println("Введите год начала задачи");
        int yearTask=scanner.nextInt();

        task.setName(taskName);
        task.setDescription(description);
        task.setTypeTask(typeTask);
        task.setRepeatability(periodTask);
        task.setStartData(yearTask,monthTask,dayTask);
//        task.setID(task.getID());//???????????

        if (periodTask == 1) {
            Onetime onetime=new Onetime();
//            onetime.formationDates(LocalDate.of(yearTask,monthTask,dayTask),Main.DATA_CHECK,task.getID());
        }
        if (periodTask == 2) {
            Daily daily=new Daily();
//            daily.formationDates(LocalDate.of(yearTask,monthTask,dayTask),Main.DATA_CHECK,task.getID());
        }
        if (periodTask == 3) {
            Weekly weekly=new Weekly();
//            weekly.formationDates(LocalDate.of(yearTask,monthTask,dayTask),Main.DATA_CHECK,task.getID());
        }
        if (periodTask == 4) {
            Monthly monthly=new Monthly();
//            monthly.formationDates(LocalDate.of(yearTask,monthTask,dayTask),Main.DATA_CHECK,task.getID());
        }
        if (periodTask == 5) {
            Annual annual=new Annual();
//            annual.formationDates(LocalDate.of(yearTask,monthTask,dayTask),Main.DATA_CHECK,task.getID());
        }
      
    }


    public void deleteTask(Scanner scanner) {// метод удаления задач по id, требует доработки: Нужно сдвинуть объекты map, иначе пропуск id и ошибка
        System.out.println("Введите ID удаляемой задачи");
        int id=scanner.nextInt();

    }
   public void printTaskList() { // метод получения общего списка задач



   }

    public void printTaskDataList() {

    }// временный метод для вывода всех дат всех задач
}
