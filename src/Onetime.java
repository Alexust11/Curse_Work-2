import java.time.LocalDate;
import java.util.ArrayList;

public class Onetime implements Repeatable{
    @Override
    public void formationDates(LocalDate localDate1, LocalDate localDate2, int id) {
        LocalDate interimDate = localDate1;
        ArrayList<LocalDate> arrayList=new ArrayList();
         arrayList.add(interimDate);
         Main.taskDataList.put(id,arrayList);

    }
}
