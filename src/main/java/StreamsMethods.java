import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsMethods {
//Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>
    public List<Map<String,String>> streamsToUpper(List<String> list){
        List<Map<String,String>> map=new ArrayList<>();
        Map<String,String> streamMap  = list.stream().collect(Collectors.toMap(str->str,String::toUpperCase));
        map.add(streamMap);
       return map;
    }
    //Имеется коллекция из String, отфильтровать и вывести на экран в все значения, которые написаны в loverCase and length = 4
    public void streamsString(List<String> list){
        Predicate<String> isLower=str->str.equals(str.toLowerCase());
        Predicate<String> lessThanFour=str->str.length()==4;
        list.stream().filter(isLower.and(lessThanFour)).forEach(System.out::println);
    }

//Имеется коллекция из Integes, использую стримы посчитать среденее значения всех чисел
    public OptionalDouble streamAverage(List<Integer> list){
        return list.stream().mapToInt(l->l).average();
    }
}
