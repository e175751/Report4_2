package jp.ac.uryukyu.ie.e175751;

public class Main {
        public static void main(String[] args){
            try {
                String str = null;
                System.out.println(str.length());
            }catch(NullPointerException w) {
                System.out.println(w.getMessage());
            }
        }
}
