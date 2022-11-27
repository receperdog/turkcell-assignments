package hashset;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<Person> people = new HashSet<>();
        Person personOne = new Person("John", 30);
        Person personTwo = new Person("John", 30);
        people.add(personOne);
        people.add(personTwo);
        System.out.println(people.size());
        System.out.println(personOne.equals(personTwo));
        deneme deneme = new deneme();
    }
}
class deneme extends HashSet<a>{
    public deneme(){
        super();
        System.out.println("deneme");
    }


}
class a {

}
