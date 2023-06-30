/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Todo {
    String tittle;
    Date tenggatwaktu;

    public Todo() {
    }

    public Todo(String tittle, Date tenggatwaktu) {
        this.tittle = tittle;
        this.tenggatwaktu = tenggatwaktu;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Date getTenggatwaktu() {
        return tenggatwaktu;
    }

    public void setTenggatwaktu(Date tenggatwaktu) {
        this.tenggatwaktu = tenggatwaktu;
    }
    
    
}
