import java.time.LocalDate;

public class Task implements Repeatable{
    private String name;// имя задачи
    private String description;// описание задачи
    private Integer typeTask; // тип задачи 1-личная, 2-рабочая
    private Integer repeatability; // повторяемость 1- однократная, 2-ежедневная, 3-еженедельная, 4- ежемесячная, 5- ежегодная.
    private LocalDate startData;

    private  Integer ID;
    private static int count=1;

    public Task(String name, String description, Integer typeTask, Integer repeatability, LocalDate startData) {
        this.name = name;
        this.description = description;
        this.typeTask = typeTask;
        this.repeatability = repeatability;
        this.startData = startData;
        ID=count;
        count++;
    }

//    public Task() {
//
//        ID=count;
//        count++;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public void setID(int ID) {
//        this.ID = ID;
//    }

    public void setTypeTask(Integer typeTask) {
        this.typeTask = typeTask;
    }

    public void setRepeatability(Integer repeatability) {
        this.repeatability = repeatability;
    }


    public String getName() {
        return name;
    }

    public void setStartData(int yaer, int month, int day) {
        this.startData = LocalDate.of(yaer,month,day);
    }

    public Integer getRepeatability() {
        return repeatability;
    }

    public LocalDate getStartData() {
        return startData;
    }

    public Integer getID() {
        return ID;
    }

    @Override
    public String toString() {
        return
                "Название='" + name + '\'' +
                ", описание='" + description + '\'' +
//                ", тип задачи=" + typeTask +
                  ", повторяемость=" + repeatability +
                   ", время начала" + startData;
    }



    @Override
    public boolean formationDates(LocalDate localDateEnd) {
        return getStartData().equals(localDateEnd);
    }
}
