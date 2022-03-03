import java.util.*;
public class UpdateStu {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("01","li");
        map.put("02","wei");
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        System.out.println("key:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Collection<String> coll = map.values();
        it = coll.iterator();
        System.out.println("values:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
