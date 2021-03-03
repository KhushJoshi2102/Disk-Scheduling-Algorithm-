/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DiskScheduling;

/**
 *
 * @author KHUSH
 */
public class data {
    int[] data;
    int head;
    void fetch(int[] a,int h ){
        data = a;
        head = h;
    }
    int[] get(){
        return data;
    }
    int gh(){
        return head;
    }
}
