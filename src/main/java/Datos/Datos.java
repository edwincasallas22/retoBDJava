package Datos;

import DTO.ActorDTO;
import DTO.AddressDTO;
import DTO.CategoryDTO;

public class Datos {
    public void obtenerDatos(ActorDTO actorDTO, AddressDTO addressDTO, CategoryDTO categoryDTO){

        for(int i = 0; i<=(actorDTO.getActor_idDTO().size())-1;i++ ){
            System.out.println(actorDTO.getActor_idDTO().get(i)+ " "+ actorDTO.getFirst_nameDTO().get(i) +" " +actorDTO.getLast_nameDTO().get(i) +"   " + actorDTO.getLast_updateDTO().get(i) );
        }


        for(int i = 0; i<=(addressDTO.getAddress_idDTO().size())-1;i++ ){
            System.out.println(addressDTO.getAddress_idDTO().get(i)+ " "+ addressDTO.getAddressDTO().get(i) +" " +
                    addressDTO.getDistrictDTO().get(i) +" " + addressDTO.getCity_idDTO().get(i)+ " "+
                    addressDTO.getPostal_codeDTO().get(i)+ addressDTO.getPhoneDTO().get(i)+"   "+
                    addressDTO.getLast_updateDTO().get(i));
        }

        for(int i=0; i<=(categoryDTO.getCategory_idDTO().size())-1; i++){
            System.out.println(categoryDTO.getCategory_idDTO().get(i)+" "+ categoryDTO.getNameDTO().get(i)+ " "+
                    categoryDTO.getLast_updateDTO().get(i));
        }


    }
}
