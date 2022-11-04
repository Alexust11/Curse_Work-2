import java.util.Map;

public class ServiceTask extends Task {

    public void printTaskNew(Map<Integer, Task> map) {

        for (Integer n : map.keySet()) {
            System.out.println(" id задачи:" + n + " " + map.get(n).toString());
        }
        System.out.println(map);
    }


}
