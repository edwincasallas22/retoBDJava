import java.sql.*;

public class Conexion {

    public void llamadoBD(){
        // Creamos el objeto conexion
        Connection connection = null;

        try{
            // Se crea la conexion a la base de datos
            // Se pasa el nombre de la BD
            // el user de la BD
            // la contraseña
            connection = DriverManager.getConnection("jdbc:mysql://sofka-training.cpxphmd1h1ok.us-east-1.rds.amazonaws.com/EdwinCasallas?user=sofka_training&password=BZenX643bQHw&serverTimezone=UTC");
            //Creo el objeto para ejecutar la sentencia SQL
            Statement statement = connection.createStatement();
            // Establezco un tiempo maximo de respuesta
            statement.setQueryTimeout(45);

            // Ejecuta una consulta de sencilla busqueda
            // El resultado se almecena en el ResultSet (conjunto de resultado)
            ResultSet rs = statement.executeQuery("select * from actor ");

            // Recorremos el conjunto de resultados
            while (rs.next()){
                // Obtenemos un campo cadena
                System.out.println("Nombre del cliente " + rs.getString("first_name"));

            }

        }
        catch (SQLException e){
            System.out.println(e.getMessage());

        } finally {
            try{
                if(connection != null){
                    connection.close();
                }
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }


    }

}
