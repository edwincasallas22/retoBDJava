package App;


import Conexion.ConexionDB;
import DTO.ActorDTO;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        ConexionDB conexion = new ConexionDB();
        ActorDTO actorDTO = new ActorDTO();
        conexion.establecerConexion();


        actorDTO.setFirst_nameDTO(conexion.obtenerActor());
        System.out.println(actorDTO.getFirst_nameDTO());

    }
}
