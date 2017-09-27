/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructures;

import java.util.Scanner;

/**
 *
 * @author kavunnuggihalli
 */
public class JosephusProblem {
    
    public static void main(String args[]){
        CircularLinkedList<Integer> l =  new CircularLinkedList<>();
        Scanner keys = new Scanner(System.in);
        System.out.print("Enter how many people are playing (n):");
        int amt = keys.nextInt();
        
        for(int i =0; i<=amt-1; i++){
            l.add(i+1,i);
        }
          
        
       System.out.print("Enter n'th number (k):");
       int mn = keys.nextInt();
       System.out.println("");
        

       
        for(int i=0; i<l.size; i++){
               System.out.print(l.getNode(i).getElement()+"=>");
        }
       
       
        int x = l.size;
        CLNode<Integer> temp = l.head;
        while(x != 1){
            
            for(int i=0; i<mn; i++){//move over 2 times
                temp = temp.next;
            }
            
            int index = l.remove(temp.index);
            temp = l.getNode(index);
              System.out.println("");
            for(int i=0; i<l.size; i++){
               System.out.print(l.getNode(i).getElement()+"=>");
            }
            x = l.size;
        }
    
      
            
       
    }
    
}
