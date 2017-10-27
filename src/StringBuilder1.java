public class StringBuilder1 {
    public static String makeSentence(String[] words){
        StringBuilder st = new StringBuilder();
        for(String w:words) st.append(w);
        return st.toString();
    }

    public static void main(String args[]){
        StringBuilder k = new StringBuilder();
        String[] t = {"K", "H", "A", "N", "G"};
        k.append(makeSentence(t));
        k.deleteCharAt(1);
        k.replace(1,2,"i    ");
        System.out.println(k.toString());
    }
}
