/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cegonzal
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> lst = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            lst.add(i);
        }
        for(int i = 0; i < lst.size(); i++){
            System.out.println(lst.get(i));
        }
    }
}
