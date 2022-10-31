import java.sql.Time;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Random;

public class Task {
    private String titleTask;
    private String descriptionTask;
    private TypeTask typeTask;
    private Repeatability repeatability;//повторяемость
    private LocalDate dataTaskNow; // текущая дата создания задачи
    private Integer yearTaskNow;
    private Month monthTaskNow;
    private Integer dayTaskNow;
    private Date scheduledTaskDate;//запланированная дата задачи
    private Time timeTask;
    private Random random;
    private int id = 0;

    public Task(String titleTask, String descriptionTask, TypeTask typeTask,Repeatability repeatability) {
        this.titleTask = titleTask;
        this.descriptionTask = descriptionTask;
        this.typeTask = typeTask;
        this.dataTaskNow =LocalDate.now();
        this.yearTaskNow=LocalDate.now().getYear();
        this.monthTaskNow=LocalDate.now().getMonth();
        this.dayTaskNow=LocalDate.now().getDayOfMonth();
        this.repeatability=repeatability;

        this.id=id++;
    }

    public Task() {

    }

    public void setTitleTask(String titleTask) {
        this.titleTask = titleTask;
    }

    public void setDescriptionTask(String descriptionTask) {
        this.descriptionTask = descriptionTask;
    }

    public void setTypeTask(TypeTask typeTask) {
        this.typeTask = typeTask;
    }

    public void setRepeatability(Repeatability repeatability) {
        this.repeatability = repeatability;
    }

    public String getTitleTask() {
        return titleTask;
    }

    public String getDescriptionTask() {
        return descriptionTask;
    }

    public TypeTask getTypeTask(TypeTask working) {
        return typeTask;
    }

    public Repeatability getRepeatability() {
        return repeatability;
    }

    public LocalDate getDataTaskNow() {
        return dataTaskNow;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Задача{" +
                "название='" + titleTask + '\'' +
                ", описание='" + descriptionTask + '\'' +
                ", тип задачи=" + typeTask +
                ", дата задачи=" + dataTaskNow +
                ", год задачи=" + yearTaskNow +
                ", месяц задачи=" + monthTaskNow +
                ", день задачи=" + dayTaskNow +
                ", время задачи=" + timeTask +
                ", id задачи=" + id +
                '}';
    }
}
