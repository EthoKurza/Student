/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentobject_example;

import java.util.*;

/**
 *
 * @author EthoKurza
 */
public class StudentObject_Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] studentArr = new Student[5];
        Scanner sc =  new Scanner(System.in);
        /*
        //create student array
        for(int i =0; i < studentArr.length;i++){
            String name;
            int id;
            System.out.println("Enter a name: ");
            name = sc.next();
            System.out.println("Enter your ID: ");
            id = sc.nextInt();
            studentArr[i] = new Student(name, id);
        }*/
        Student s1 = new Student();
        s1.setName("Bob");
        Student s2 = new Student();
        s2.setName("Cob");
        Student s3 = new Student();
        s3.setName("Rob");
        
        Student[] sList = new Student[3];//student array
        sList[0] = s1;
        sList[1] = s2;
        sList[2] = s3;
        
        for(int i=0;i<sList.length;i++){
            System.out.println(sList[i].getName());
        }
        
    }//end of main
    
}//end of class
