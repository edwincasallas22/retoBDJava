package Conexion;

import DTO.ActorDTO;

import java.sql.*;
import java.util.ArrayList;

public class ConexionDB {
    // Creamos el objeto conexion
    Connection connection = null;
    Statement statement;
    ResultSet rs;

    public ConexionDB(){}

    public void establecerConexion(){
        try{
            // Se crea la conexion a la base de datos, Se pasa el nombre de la BD, el user de la BD y la contraseña
            connection = DriverManager.getConnection("jdbc:mysql://sofka-training.cpxphmd1h1ok.us-east-1.rds.amazonaws.com/EdwinCasallas?user=sofka_training&password=BZenX643bQHw&serverTimezone=UTC");


        }
        catch (SQLException e){
            System.out.println(e.getMessage());

        }
    }
    public void cerrarConexion(){
        try{
            if(connection != null){
                connection.close();
            }
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public ArrayList obtenerActor(){
      ArrayList<Short> actor_id = new ArrayList<Short>();
      ArrayList<String> first_name = new ArrayList<String>();
      ArrayList<String> last_name = new ArrayList<String>();
      ArrayList<Timestamp> last_update = new ArrayList<Timestamp>();

        try{
            //Creo el objeto para ejecutar la sentencia SQL
            statement = connection.createStatement();

            // Establezco un tiempo maximo de respuesta
            statement.setQueryTimeout(45);

            // Ejecuta una consulta de sencilla busqueda y el resultado se almecena en el ResultSet (conjunto de resultado)
             rs = statement.executeQuery("select * from actor");

            // Recorremos el conjunto de resultados
            while (rs.next()){

                actor_id.add(rs.getShort("actor_id"));
                first_name.add(rs.getString("first_name"));
                last_name.add(rs.getString("last_name"));
                last_update.add(rs.getTimestamp("last_update"));

            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());

        } finally {
                cerrarConexion();
        }
        return first_name;
    }







}
