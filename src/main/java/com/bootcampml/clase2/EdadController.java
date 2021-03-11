package com.bootcampml.clase2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;


@RestController
public class EdadController {

@GetMapping(path = "getEdad/{day}/{month}/{year}")

public int getEdad(@PathVariable int day, @PathVariable int month, @PathVariable int year){
    int currentYear = LocalDate.now().getYear();
    int currentMonth = LocalDate.now().getMonthValue();
    int currentDay = LocalDate.now().getDayOfMonth();
    if(year > currentYear){
        return 0;
    }
    if(currentMonth > month){
        return currentYear - year;
    }else if( currentMonth == month && currentDay >= day){
        return  currentYear - year;
    }


return currentYear - year - 1;
}


}
