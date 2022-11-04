import java.time.LocalDate;
import java.util.Map;

public interface Repeatable {
  void formationDates (LocalDate localDateHome, LocalDate localDateEnd, Integer id, Map<Integer, Task> map);
}
