import es.alvaroweb.datastructures.LinkedList;

import java.util.Random;

/**
 * Created by Alvaro on 31/07/2016.
 */
public class Main {
    public static void main(String[] args){
        print("hello world");
    }

    private static void print(String s) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < 20; i++){
            int r = (int) (Math.random() * 10);

            if(i == 10){
                list.add(100);
            }else{
                list.add(r);
            }
        }
        System.out.println("list:" + list);
        System.out.println("get the 10th: " + list.get(10));


    }
}

