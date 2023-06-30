/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Comparator;

/**
 *
 * @author ASUS
 */
public class sortingTodo implements Comparator<Todo>{

    @Override
    public int compare(Todo todo1, Todo todo2) {
    
        return todo1.tenggatwaktu.compareTo(todo2.tenggatwaktu);
    }
    
    
}
