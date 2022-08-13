import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

    public class Main{
        public static void main(String[] args) {

            Runtime2 a1 = new Runtime2("Kate", 17.45, "20/10/01");
            Runtime2 a2 = new Runtime2("Jones", 16.32, "21/5/12");
            Runtime2 a3 = new Runtime2("Anthony", 20.01, "19/12/24");
            Runtime2 a4 = new Runtime2("worker", 16.24, "22/01/30");

            List<Runtime2> list = Arrays.asList(a1, a2, a3, a4);
            list.forEach(a ->
                    System.out.println(a.getRunnerName() + " " + a.getRunTime() + " " + a.getDate()));

            System.out.println("---------------");
            System.out.println("time順に並び替え");

            Comparator<Runtime2> comparator = Comparator.comparing(Runtime2::getRunTime);

            list.stream().sorted(comparator)
                    .forEach(a ->
                            System.out.println(a.getRunnerName() + " " + a.getRunTime() + " " + a.getDate()));

            System.out.println("---------------");
            System.out.println("日付順に並び替え");

            Comparator<Runtime2> comparator2 = Comparator.comparing(Runtime2::getDate);

            list.stream().sorted(comparator2)
                    .forEach(a ->
                            System.out.println(a.getRunnerName() + " " + a.getRunTime() + " " + a.getDate()));

        }
    }
