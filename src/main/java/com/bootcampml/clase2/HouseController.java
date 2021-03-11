package com.bootcampml.clase2;

import DTO.CasaDTO;
import DTO.HabitacionDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HouseController {

    @PostMapping(path = "getArea")
    public double getArea(@RequestBody CasaDTO house) {
        return  getHouseArea(house.getRooms());
    }

    @PostMapping(path = "getPrice")
    public double getPrice(@RequestBody CasaDTO house) {
        double area = getHouseArea(house.getRooms());
        return area * 800;
    }

    @PostMapping(path = "getBiggestRoom")
    public HabitacionDTO getBiggestRoom(@RequestBody CasaDTO house){
        double maxArea = 0;
        HabitacionDTO biggerRoom = new HabitacionDTO();
        for (HabitacionDTO room: house.getRooms()
             ) {
            double roomArea = room.getHeight() * room.getWidth();
            if(roomArea > maxArea){
                biggerRoom = room;
                maxArea = roomArea;
            }
        }
        return biggerRoom;
    }

    @PostMapping(path = "getAreaByRoom")
    public ArrayList<Double> getAreaByRoom(@RequestBody CasaDTO house){
        ArrayList<Double> area = new ArrayList<>();
        for (HabitacionDTO room: house.getRooms()
             ) {
            area.add(room.getHeight() * room.getWidth());

        }
        return  area;
    }

    public double getHouseArea(ArrayList<HabitacionDTO> rooms) {
        double area = 0;
        for (HabitacionDTO room : rooms
        ) {
            area += room.getHeight() * room.getWidth();
        }
        return area;
    }
}
