import java.time.LocalDate;
import java.util.ArrayList;

public class Weekly implements Repeatable {
    private static int count;
    private int n;
        private LocalDate localDate1;
        private LocalDate localDate2;



    @Override
    public void formationDates(LocalDate localDate1, LocalDate localDate2, int id) {
        LocalDate interimDate = localDate1;
        ArrayList <LocalDate> arrayList=new ArrayList<LocalDate>();
        while (!interimDate.isBefore(localDate2)) {

            interimDate=interimDate.plusWeeks(1);
            arrayList.add(interimDate);
            Main.taskDataList.put(id,arrayList);
            System.out.println(arrayList);
        }

    }
}
