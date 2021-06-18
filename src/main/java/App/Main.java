package App;


import Conexion.ConexionDB;
import DTO.ActorDTO;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        ConexionDB conexion = new ConexionDB();
        ActorDTO actorDTO = new ActorDTO();
        conexion.establecerConexion();

        actorDTO.setActor_idDTO(conexion.obtenerActor("actor_id"));
        actorDTO.setFirst_nameDTO(conexion.obtenerActor("first_name"));
        actorDTO.setLast_nameDTO(conexion.obtenerActor("last_name"));
        actorDTO.setLast_updateDTO(conexion.obtenerActor("last_update"));

        conexion.cerrarConexion();

        for(int i = 0; i<=(actorDTO.getActor_idDTO().size())-1;i++ ){
            System.out.println(actorDTO.getActor_idDTO().get(i)+ " "+ actorDTO.getFirst_nameDTO().get(i) +" " +actorDTO.getLast_nameDTO().get(i) +"   " + actorDTO.getLast_updateDTO().get(i)  );
        }


    }
}
