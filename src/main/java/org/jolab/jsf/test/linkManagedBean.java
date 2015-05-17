/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jolab.jsf.test;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/**
 *
 * @author jolab
 */
@ManagedBean(name = "linksBean")
public class linkManagedBean {
    private String parameterValue;
    
    @ManagedProperty(name = "parameter" , value="#{param.parameter}")
    private String parameter; // +setter

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }    

    public void setParameterValue(String parameterValue) {
        this.parameterValue = parameterValue;
    }
    
    
    public String invokeFromButton(){
        String s = "/index";
        return s;
    }
    
    //public String invokeFromButtonWithParam(String param){
    public String invokeFromButtonWithParam(){
        String s = "/index";
        System.out.println("Parameter: " + parameter);
        return s;
    }    
    
    public String invokeWithListener(){
        String s = "/index";
        System.out.println("Parameter: " + parameterValue);
        return s;        
    }
    
}
