package DTO;

import java.sql.Timestamp;
import java.util.ArrayList;

public class ActorDTO {
    private ArrayList<Short> actor_idDTO = new ArrayList<Short>();
    private ArrayList<String> first_nameDTO = new ArrayList<String>();
    private ArrayList<String> last_nameDTO = new ArrayList<String>();
    private ArrayList<Timestamp> last_updateDTO = new ArrayList<Timestamp>();


    public ActorDTO(){}

    public ArrayList<Short> getActor_idDTO() {
        return actor_idDTO;
    }

    public void setActor_idDTO(ArrayList<Short> actor_idDTO) {
        this.actor_idDTO = actor_idDTO;
    }

    public ArrayList<String> getFirst_nameDTO() {
        return first_nameDTO;
    }

    public void setFirst_nameDTO(ArrayList<String> first_nameDTO) {
        this.first_nameDTO = first_nameDTO;
    }

    public ArrayList<String> getLast_nameDTO() {
        return last_nameDTO;
    }

    public void setLast_nameDTO(ArrayList<String> last_nameDTO) {
        this.last_nameDTO = last_nameDTO;
    }

    public ArrayList<Timestamp> getLast_updateDTO() {
        return last_updateDTO;
    }

    public void setLast_updateDTO(ArrayList<Timestamp> last_updateDTO) {
        this.last_updateDTO = last_updateDTO;
    }
}
