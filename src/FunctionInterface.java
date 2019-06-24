import com.functional.UserI;
import com.functional.UserImpl;

import java.util.function.Function;

/**
 * Created by e088740 on 6/24/2019.
 */
public class FunctionInterface {

    public static void main(String... args){

    String name = getFunctional(UserI::getName);

    String salary = getFunctional(UserI::getSalary);

    System.out.println(name+" salary "+salary);
    Function<String,String> f = parameter -> parameter + getFunctional(UserI::getName);
    String appendedtext = f.apply("testing");
    System.out.println(appendedtext);

    }

    public static <R>  R getFunctional(Function<UserI,R> func){
        UserI user = new UserImpl();
        return func.apply(user);
    }


}
