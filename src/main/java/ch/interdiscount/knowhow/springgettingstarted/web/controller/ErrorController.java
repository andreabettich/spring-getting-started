package ch.interdiscount.knowhow.springgettingstarted.web.controller;

import ch.interdiscount.knowhow.springgettingstarted.web.errorhandler.EasyPeasyException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "errorController")
public class ErrorController {
    @GetMapping("/{test}")
    public void throwException(@PathVariable final String test) throws EasyPeasyException{
        throw new EasyPeasyException("That was easy" + test);
    }
}
