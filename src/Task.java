import java.sql.Time;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.Random;

public class Task {
    private String titleTask;
    private String descriptionTask;
    private String typeTask;
    private String repeatability;//повторяемость
    private LocalDate dataTaskNow; // текущая дата создания задачи
    private Integer yearTaskNow;
    private Month monthTaskNow;
    private Integer dayTaskNow;
    private Date scheduledTaskDate;//запланированная дата задачи
    private Time timeTask;
    private Random random;


    public Task(String titleTask, String descriptionTask, String typeTask,String repeatability) {
        this.titleTask = titleTask;
        this.descriptionTask = descriptionTask;
        this.typeTask = typeTask;
        this.dataTaskNow =LocalDate.now();
        this.yearTaskNow=LocalDate.now().getYear();
        this.monthTaskNow=LocalDate.now().getMonth();
        this.dayTaskNow=LocalDate.now().getDayOfMonth();
        this.repeatability=repeatability;


    }

    public Task() {  }

    public void setDataTaskNow(LocalDate dataTaskNow) {
        this.dataTaskNow = dataTaskNow;
    }

    public void setTitleTask(String titleTask) {
        this.titleTask = titleTask;
    }

    public void setDescriptionTask(String descriptionTask) {
        this.descriptionTask = descriptionTask;
    }

    public void setTypeTask(String typeTask) {
        this.typeTask = typeTask;
    }

    public void setRepeatability(String repeatability) {
        this.repeatability = repeatability;
    }

    public String getTitleTask() {
        return titleTask;
    }

    public String getDescriptionTask() {
        return descriptionTask;
    }

    public String getTypeTask() {
        return typeTask;
    }

    public String getRepeatability() {
        return repeatability;
    }

    public LocalDate getDataTaskNow() {
        return dataTaskNow;
    }


    @Override
    public String toString() {
        return "Задача{" +
                "название='" + titleTask + '\'' +
                ", описание='" + descriptionTask + '\'' +
                ", тип задачи=" + typeTask +
                ", дата задачи=" + dataTaskNow +
                ", повторяемость" + repeatability+
                '}';
    }
}
