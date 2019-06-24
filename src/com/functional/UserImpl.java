package com.functional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by e088740 on 6/24/2019.
 */
public class UserImpl implements UserI {
    String name;
    String salary;

   public UserImpl(){
       name = "raju";
       salary = "1000";
   }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSalary() {
        return salary;
    }

    @Override
    public List<String> getUserNames() {
        List<String> memberNames = new ArrayList<>();
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
        return memberNames;
    }

}
