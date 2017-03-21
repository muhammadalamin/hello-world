/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package static_demo;

/**
 *
 * @author Rownak
 */
public class FinalDemo {
    
    final int FILE_NEW = 1;  
    final int FILE_OPEN = 2; 
    final int FILE_SAVE = 3; 
    
    void useFinal(){
        
        System.out.println("file Open: "+FILE_OPEN);
        
       // FILE_OPEN = 100;
        
    }
    public static void main(String[] args) {
        FinalDemo fd = new FinalDemo();
        fd.useFinal();
    }
}
