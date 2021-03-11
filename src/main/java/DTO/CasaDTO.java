package DTO;

import Model.Habitacion;

import java.util.ArrayList;

public class CasaDTO {
    private String name;
    private String address;
    private ArrayList<HabitacionDTO> rooms;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<HabitacionDTO> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<HabitacionDTO> rooms) {
        this.rooms = rooms;
    }
}
