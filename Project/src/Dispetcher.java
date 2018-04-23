public class Dispetcher {
    public static void main(String[] args) {
        String [] str = {"Ivan" , ", " , "Galina" , ", " , "Igor" , ", " , "Dima"};
        String s = new String();
        for (int i = 0; i < str.length; i++){
            s += str[i];
        }
        System.out.println(s);
    }
}
