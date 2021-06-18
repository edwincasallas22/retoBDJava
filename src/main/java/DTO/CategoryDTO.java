package DTO;

import java.sql.Timestamp;
import java.util.ArrayList;

public class CategoryDTO {
    private ArrayList<Short> category_idDTO = new ArrayList<Short>();
    private ArrayList<String> nameDTO = new ArrayList<String>();
    private ArrayList<Timestamp> last_updateDTO = new ArrayList<Timestamp>();

    public CategoryDTO(){}

    public ArrayList<Short> getCategory_idDTO() {
        return category_idDTO;
    }

    public void setCategory_idDTO(ArrayList<Short> category_idDTO) {
        this.category_idDTO = category_idDTO;
    }

    public ArrayList<String> getNameDTO() {
        return nameDTO;
    }

    public void setNameDTO(ArrayList<String> nameDTO) {
        this.nameDTO = nameDTO;
    }

    public ArrayList<Timestamp> getLast_updateDTO() {
        return last_updateDTO;
    }

    public void setLast_updateDTO(ArrayList<Timestamp> last_updateDTO) {
        this.last_updateDTO = last_updateDTO;
    }
}
