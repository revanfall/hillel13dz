import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        StreamsMethods str=new StreamsMethods();
        System.out.println(str.streamAverage(list));

        List<String> stringList=new ArrayList<>();
        stringList.add("reka");
        stringList.add("Adsafsd");
        stringList.add("afsd");
        stringList.add("Qwer");
        System.out.println(str.streamsToUpper(stringList));

        str.streamsString(stringList);

    }
}
