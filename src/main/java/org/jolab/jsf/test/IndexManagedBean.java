/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jolab.jsf.test;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author jolab
 */
@ManagedBean(name = "someExampleBeans")
public class IndexManagedBean {
    private final String myName= "Jolab";
    private final long numberExample= 1969;
    
    private String inputValue;

    public String getMyName() {
        return myName;
    }

    public long getNumberExample() {
        return numberExample;
    }
    
    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }
    
    public String getHello(){
        String name = "Jolab";
        if(name==null || name.equals("")){
            name = new String();
        }
        return "Hello " + name + " " + new java.util.Date();
    }
    
    
    public String getResponse(){
        return "Received value is: " + this.inputValue;
    }
}
