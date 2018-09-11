package ch.interdiscount.knowhow.springgettingstarted.web.controller;

import ch.interdiscount.knowhow.springgettingstarted.web.dto.SimpleDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("basicdto")
public class BasicDtoController {

    @GetMapping
    public SimpleDto getSimpleDto(){
        final SimpleDto simpleDto = new SimpleDto("Kieran", "Willis", 23);
        return simpleDto;
    }

}
