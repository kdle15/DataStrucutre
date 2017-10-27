import java.util.HashMap;

public class HashMap1 {
    public static HashMap<Integer, String> buildMap(int[] num){
        HashMap<Integer, String> map = new HashMap<>();
        for(int n: num) map.put(n,Integer.toString(n));
        return map;
    }

    public static void main(String args[]){
        int[] k = {1,2,3,4,5};
        HashMap<Integer, String> map = buildMap(k);
        for(int i: map.keySet()){
            System.out.println(i + "- String:" + map.get(i));
        }
    }
}
