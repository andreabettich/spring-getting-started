package ch.interdiscount.knowhow.springgettingstarted.web.controller;

import ch.interdiscount.knowhow.springgettingstarted.profiles.NestedProperties;
import ch.interdiscount.knowhow.springgettingstarted.profiles.PropertiesExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "props")
public class PropertiesController {

    @Autowired
    private PropertiesExampleService propertiesExampleService;

    @GetMapping
    public String hello(){
        return "Hello";
    }

    @GetMapping(path = "prop")
    public String getProperty(){
        return "Double Property - " + propertiesExampleService.getDoubleProperty();
    }

    @GetMapping(path = "nested")
    public String getNestedProperty(){
        final NestedProperties nestedProperties = propertiesExampleService.getNestedProperties();
        return "Name: " + nestedProperties.getName() + " Age: " + nestedProperties.getAge();
    }
}
