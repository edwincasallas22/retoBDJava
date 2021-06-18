package Conexion;

import DTO.ActorDTO;

import java.math.BigInteger;
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

    public ArrayList obtenerActor(String campo){
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

        }
        switch (campo){
            case "actor_id":
                return actor_id;
            case "first_name":
                return first_name;
            case "last_name":
                return last_name;
            case "last_update":
                return last_update;
            default:
                return null;
        }

    }
    public ArrayList obtenerDireccion(String campo){
        ArrayList<Short> address_id = new ArrayList<Short>();
        ArrayList<String> address = new ArrayList<String>();
        ArrayList<String> district = new ArrayList<String>();
        ArrayList<Integer> city_id = new ArrayList<Integer>();
        ArrayList<Integer> postal_code = new ArrayList<Integer>();
        ArrayList<Long> phone = new ArrayList<Long>();
        ArrayList<String> location = new ArrayList<String>();
        ArrayList<Timestamp> last_update = new ArrayList<Timestamp>();
        try{

            statement = connection.createStatement();
            statement.setQueryTimeout(45);
            rs = statement.executeQuery("select * from address");


            while (rs.next()){

                address_id.add(rs.getShort("address_id"));
                address.add(rs.getString("address"));
                district.add(rs.getString("district"));
                city_id.add(rs.getInt("city_id"));
                postal_code.add(rs.getInt("postal_code"));
                phone.add(rs.getLong("phone"));
                location.add(rs.getString("location"));
                last_update.add(rs.getTimestamp("last_update"));

            }
        }
        catch (SQLException e){
            System.out.println(e.getMessage());

        }
        switch (campo){
            case "address_id":
                return address_id;
            case "address":
                return address;
            case "district":
                return district;
            case "city_id":
                return city_id;
            case "postal_code":
                return postal_code;
            case "phone":
                return phone;
            case "location":
                return location;
            case "last_update":
                return last_update;
            default:
                return null;
        }

    }
    public ArrayList obtenerCategoria(String campo){
        ArrayList<Short> category_id = new ArrayList<Short>();
        ArrayList<String> name = new ArrayList<String>();
        ArrayList<Timestamp> last_update = new ArrayList<Timestamp>();
        try{

            statement = connection.createStatement();
            statement.setQueryTimeout(45);
            rs = statement.executeQuery("select * from category");


            while (rs.next()){

                category_id.add(rs.getShort("category_id"));
                name.add(rs.getString("name"));
                last_update.add(rs.getTimestamp("last_update"));

            }
        } catch (SQLException e){
            System.out.println(e.getMessage());

        }
        switch (campo){
            case "category_id":
                return category_id;
            case "name":
                return name;
            case "last_update":
                return last_update;
            default:
                return null;
        }

    }

}
