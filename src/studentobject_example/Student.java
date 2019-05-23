/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentobject_example;

/**
 *
 * @author EthoKurza
 */
public class Student {

    private String name;
    private int id;
    private int maxcourse;
    
    Student(){
        this.name=" ";
        this.id=0;
        this.maxcourse = 0;
    }
    Student(String n,int id, int mcourse){
        this.name = n;
        this.id = id;
        this.maxcourse = mcourse;
    }
    
    // Set or Get Name
    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    
    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id = id;
    }

    /**
     * @return the maxcourse
     */
    public int getMaxcourse() {
        return maxcourse;
    }

    /**
     * @param maxcourse the maxcourse to set
     */
    public void setMaxcourse(int maxcourse) {
        this.maxcourse = maxcourse;
    }
    
}
