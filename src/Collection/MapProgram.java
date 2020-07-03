package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String,String> languages=new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        }
        else{
            languages.put("Java","A compiled high level language,object oriented,platform independent");
            System.out.println("Added Java Successfully");
        }
        languages.put("Python","An interpreted,object oriented ,high level programming language");
        languages.put("Algol","An Algorithmic language");
        System.out.println(languages.put("BASIC","Beginners All purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp","Therein lies madness"));
        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map ");
        }
        else{
            languages.put("Java","This course is about java");
        }
        System.out.println("************************************");

        languages.remove("BASIC");
        if(languages.remove("Algol","a family of algorithmic languages")){
            System.out.println("Algol is removed");
        }
        else{
            System.out.println("Algol not removed , key/value pair not found");
        }

        if(languages.replace("Lisp","Therein lies madness","A functional programming language with imperative features")){
            System.out.println("Lisp replaced");
        }
        else{
            System.out.println("Lisp was not replaced");
        }
        for(String key:languages.keySet()){
            System.out.println(key +":"+ languages.get(key));
        }


    }
}
