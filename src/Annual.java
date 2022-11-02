import java.time.LocalDate;
import java.util.ArrayList;

public class Annual implements Repeatable{
    @Override
    public void formationDates(LocalDate localDate1, LocalDate localDate2, int id) {
        LocalDate interimDate = localDate1;
        ArrayList<LocalDate> arrayList=new ArrayList();
        while (!interimDate.isAfter(localDate2)) {
            arrayList.add(interimDate);
            Main.taskDataList.put(id,arrayList);
            interimDate=interimDate.plusYears(1);


        }
    }
}
