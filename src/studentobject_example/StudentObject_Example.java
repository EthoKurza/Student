/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * May 23,2019
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
        s1.setID(1);
        Student s2 = new Student();
        s2.setName("Cob");
        s2.setID(2);
        Student s3 = new Student();
        s3.setName("Rob");
        s3.setID(3);
        
        Student[] sList = new Student[3];//student array
        sList[0] = s1;
        sList[1] = s2;
        sList[2] = s3;
        
        for(int i=0;i<sList.length;i++){
            System.out.println("Name: "+sList[i].getName()+"\nStudent ID: "+ sList[i].getID());
        }
        
    }//end of main
    
}//end of class
