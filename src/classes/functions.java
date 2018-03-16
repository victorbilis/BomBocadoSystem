/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class functions {
     public ResultSet execute(String sql,String type)
    {
        //variavel para obter o resultado da consulta sql
      ResultSet rs = null;
      try
      {
        //nome do driver a ser utilizado para conexao com banco de dados
        String myDriver = "org.gjt.mm.mysql.Driver";
        //endereço do banco de dados
        String myUrl = "jdbc:mysql://localhost/bombocado";
        //inicializando o driver
        Class.forName(myDriver);
        //abrir conexao com banco de dados
        Connection conn = DriverManager.getConnection(myUrl, "root", "");        
        //comando sql para ser executado
        String query = sql; 
        //objeto para executar o comando sql
        Statement st = conn.createStatement();
        
        //se o tipo for insert
        if(type.equals("INSERT"))
        {
            //executeUpdate para inserir dados na tabela
            st.executeUpdate(query);
            
        }
        else
        {
            //para pegar o retorno do comado sql , exemplo SELECT
            rs = st.executeQuery(query);
        }
        // execute the query, and get a java resultset
        
        
        
      }
      catch(Exception e)
      {
          System.out.println(e);
         rs = null;
      }
      //retornando o resultado da consulta
      return rs;
      
    }
     
     public String execute2(String sql,String type)
    {
        //variavel para obter o resultado da consulta sql
      String rs = "";
      try
      {
        //nome do driver a ser utilizado para conexao com banco de dados
        String myDriver = "org.gjt.mm.mysql.Driver";
        //endereço do banco de dados
        String myUrl = "jdbc:mysql://localhost/bombocado";
        //inicializando o driver
        Class.forName(myDriver);
        //abrir conexao com banco de dados
        Connection conn = DriverManager.getConnection(myUrl, "root", "");        
        //comando sql para ser executado
        String query = sql; 
        //objeto para executar o comando sql
        Statement st = conn.createStatement();
        
        //se o tipo for insert
        if(type.equals("INSERT"))
        {
            //executeUpdate para inserir dados na tabela
            st.executeUpdate(query);
        }
       
        // execute the query, and get a java resultset
        
        
        
      }
      catch(Exception e)
      {
          System.out.println(e);
          
      }
      //retornando o resultado da consulta
      return rs;
      
    }
     
            
    public String listCliente(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://bombocado.esy.es/listCli.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"ISO-8859-1"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return res;
    }
    
    public void send(String sql)
    {
        String res = "";
        try
        {
            URL url = new URL("http://bombocado.esy.es/send.php");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setUseCaches(false);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type","application/x-www-form-urlencoded");
            
            DataOutputStream printer = new DataOutputStream(con.getOutputStream());
            printer.writeBytes("sql="+sql);
            printer.flush();
            printer.close();
            
            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(),"ISO-8859-1"));
            String line = null;
            while((line = reader.readLine()) != null)
            {
                res += line;
            }
            JOptionPane.showMessageDialog(null,res);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }        
    }
    
    
    
     
}
