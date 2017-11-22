package jp.ac.uryukyu.ie.e175751;

public class Main {
        public static void main(String[] args){
            try {
                String str = "3．14";
                double value = Double.parseDouble(str);
                System.out.println();
            }catch(NullPointerException w) {
                System.out.println(w.getMessage());
            }
        }

}
