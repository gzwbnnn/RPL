/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class DataTodo {
    ArrayList<Todo>listTodo;

    public DataTodo() {
        listTodo = new ArrayList<>();
    }
    public void InsertData(String tittle, Date tenggatwaktu){
        Todo todo = new Todo(tittle, tenggatwaktu);
        listTodo.add(todo);
    }
    public void deleteData(int index){
        listTodo.remove(index);
    }
    public List<Todo> getAll(){
        List<Todo> todolist = new ArrayList<>();
        String sql = """
                        SELECT tittle, tenggat_waktu FROM todo_item 
                     """;
        Todo dbtodo = new Todo(); 
         try{
                Connection conn = new koneksiDatabase().getKoneksi();
                PreparedStatement statement = conn.prepareStatement(sql);
  
                try (ResultSet resultSet = statement.executeQuery()) {
                    
                    while(resultSet.next()) {                       
                    
                        dbtodo.setTittle(resultSet.getString("tittle"));
                        dbtodo.setTenggatwaktu(new Date(resultSet.getDate("tenggat_waktu").getTime()));
                        todolist.add(dbtodo);
                     
                    }
                }
                System.out.println("Sukses");
                statement.close();
                conn.close();
            }   catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        return todolist;
    }
   
}
