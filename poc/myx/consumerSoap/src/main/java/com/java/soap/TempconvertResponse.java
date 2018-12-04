/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Yosaporn_pokky
 */
@XmlRootElement(name = "CelsiusToFahrenheitResponse", namespace = "https://www.w3schools.com/xml/")
@XmlAccessorType(XmlAccessType.FIELD)
public class TempconvertResponse {
    
    @XmlElement(name = "CelsiusToFahrenheitResult", namespace = "https://www.w3schools.com/xml/")
    private String fahrenheit;

    public String getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(String fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

}
