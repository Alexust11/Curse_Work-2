import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;

public class Onetime implements Repeatable{
    @Override
    public void formationDates(LocalDate localDateHome, LocalDate localDateEnd, Integer id, Map<Integer, Task> map) {
        if (localDateHome.equals(localDateEnd)) {
            System.out.println(" На дату: "+localDateEnd+" имеется задача -"+map.get(id).getName());
        }

    }
}
