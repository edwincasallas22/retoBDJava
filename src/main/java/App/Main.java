package App;


import Conexion.ConexionDB;
import DTO.ActorDTO;
import DTO.AddressDTO;
import DTO.CategoryDTO;
import Datos.Datos;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        ConexionDB conexion = new ConexionDB();
        ActorDTO actorDTO = new ActorDTO();
        AddressDTO addressDTO = new AddressDTO();
        CategoryDTO categoryDTO = new CategoryDTO();
        Datos datos = new Datos();
       conexion.establecerConexion();

        actorDTO.setActor_idDTO(conexion.obtenerActor("actor_id"));
        actorDTO.setFirst_nameDTO(conexion.obtenerActor("first_name"));
        actorDTO.setLast_nameDTO(conexion.obtenerActor("last_name"));
        actorDTO.setLast_updateDTO(conexion.obtenerActor("last_update"));


        addressDTO.setAddress_idDTO(conexion.obtenerDireccion("address_id"));
        addressDTO.setAddressDTO(conexion.obtenerDireccion("address"));
        addressDTO.setDistrictDTO(conexion.obtenerDireccion("district"));
        addressDTO.setCity_idDTO(conexion.obtenerDireccion("city_id"));
        addressDTO.setPostal_codeDTO(conexion.obtenerDireccion("postal_code"));
        addressDTO.setPhoneDTO(conexion.obtenerDireccion("phone"));
        addressDTO.setLast_updateDTO(conexion.obtenerDireccion("last_update"));

        categoryDTO.setCategory_idDTO(conexion.obtenerCategoria("category_id"));
        categoryDTO.setNameDTO(conexion.obtenerCategoria("name"));
        categoryDTO.setLast_updateDTO(conexion.obtenerCategoria("last_update"));

        conexion.cerrarConexion();

        datos.obtenerDatos(actorDTO,addressDTO, categoryDTO);




    }
}
