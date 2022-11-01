import java.time.LocalDate;

public class Weekly implements Repeatable {
    private static int count;
    private int n;
    @Override
    public Integer formationDates(LocalDate localDate1, LocalDate localDate2) {
        LocalDate interimDate = localDate1;

        while (!interimDate.isBefore(localDate2)) {

            if (interimDate.equals(localDate2)) {
              n=count++;

            }
            interimDate=interimDate.plusWeeks(1);
        }
        return n;
    }
}
