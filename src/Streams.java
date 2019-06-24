import com.functional.UserI;
import com.functional.UserImpl;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by e088740 on 6/24/2019.
 */
public class Streams {

    public static void main(String... args){
        UserI user = new UserImpl();
        //define predicate
        Predicate<String> predicate  = parameter -> parameter.startsWith("A");
        //apply predicate in streams filter
        List<String> stringStream = user.getUserNames().stream().filter(predicate).collect(Collectors.toList());
        //flatmap on filtered predicate map+flat
        List<Character> flatMap = user.getUserNames().stream().filter(predicate).flatMap(s->Stream.of(s.charAt(0))).collect(Collectors.toList());
        System.out.println("characters case"+flatMap);
        //map on filtered predicate and to uppercase
        List<String> namesorder = user.getUserNames().stream().filter((s -> s.startsWith("A"))).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("upperc case"+namesorder);

    }
}
