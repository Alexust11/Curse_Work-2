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

    @Override
    public String toString() {
        return "Task{" +
                "titleTask='" + titleTask + '\'' +
                ", descriptionTask='" + descriptionTask + '\'' +
                ", typeTask=" + typeTask +
                ", dataTaskNow=" + dataTaskNow +
                ", yearTaskNow=" + yearTaskNow +
                ", monthTaskNow=" + monthTaskNow +
                ", dayTaskNow=" + dayTaskNow +
                ", timeTask=" + timeTask +
                ", id=" + id +
                '}';
    }
}
