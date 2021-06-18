package DTO;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;

public class AddressDTO {
    private ArrayList<Short> address_idDTO = new ArrayList<Short>();
    private ArrayList<String> addressDTO = new ArrayList<String>();
    private ArrayList<String> districtDTO = new ArrayList<String>();
    private ArrayList<Integer> city_idDTO = new ArrayList<Integer>();
    private ArrayList<Integer> postal_codeDTO = new ArrayList<Integer>();
    private ArrayList<Long> phoneDTO = new ArrayList<Long>();
    private ArrayList<Timestamp> last_updateDTO = new ArrayList<Timestamp>();

    public AddressDTO(){}

    public ArrayList<Short> getAddress_idDTO() {
        return address_idDTO;
    }

    public void setAddress_idDTO(ArrayList<Short> address_idDTO) {
        this.address_idDTO = address_idDTO;
    }

    public ArrayList<String> getAddressDTO() {
        return addressDTO;
    }

    public void setAddressDTO(ArrayList<String> addressDTO) {
        this.addressDTO = addressDTO;
    }

    public ArrayList<String> getDistrictDTO() {
        return districtDTO;
    }

    public void setDistrictDTO(ArrayList<String> districtDTO) {
        this.districtDTO = districtDTO;
    }

    public ArrayList<Integer> getCity_idDTO() {
        return city_idDTO;
    }

    public void setCity_idDTO(ArrayList<Integer> city_idDTO) {
        this.city_idDTO = city_idDTO;
    }

    public ArrayList<Integer> getPostal_codeDTO() {
        return postal_codeDTO;
    }

    public void setPostal_codeDTO(ArrayList<Integer> postal_codeDTO) {
        this.postal_codeDTO = postal_codeDTO;
    }

    public ArrayList<Long> getPhoneDTO() {
        return phoneDTO;
    }

    public void setPhoneDTO(ArrayList<Long> phoneDTO) {
        this.phoneDTO = phoneDTO;
    }

    public ArrayList<Timestamp> getLast_updateDTO() {
        return last_updateDTO;
    }

    public void setLast_updateDTO(ArrayList<Timestamp> last_updateDTO) {
        this.last_updateDTO = last_updateDTO;
    }
}
