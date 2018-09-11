package ch.interdiscount.knowhow.springgettingstarted.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
/**
 * @ResponseBody is also supported at the class level in which case it is inherited by all controller methods.
 * This is the effect of @RestController which is nothing more than a meta-annotation
 * marked with @Controller and @ResponseBody.
 */
@RequestMapping(path = "basic")
@CrossOrigin(maxAge = 3600)
@Slf4j
public class BasicController {

    @GetMapping(path = "get")
    public String basicGet() {
        log.info("basicGet call");
        return "Hello";
    }

    @GetMapping(path = "get/{name}")
    public String basicGetParams(
            @PathVariable final String name) {
        log.info("basicGet call with Param");
        return "Hello " + name;
    }


    // You can define the name of the PathVariable if it's not the same as the variable
    @GetMapping(path = "get2/{name}")
    public String basicGetParams2(
            @PathVariable(value = "name") final String someString) {
        log.info("basicGet call with Param");
        return "Hello " + someString;
    }

    @GetMapping(path = "get/{name}/{lastname}")
    public String basicGetTwoParams(
            @PathVariable final String name,
            @PathVariable final String lastname) {
        log.info("basicGet call with Param");
        return "Hello " + name + " " + lastname;
    }

    @PostMapping(path = "post/requestbody")
    @ResponseStatus(HttpStatus.OK) // Define Response Status for methods without response
    public void basicPostRequestBody(@RequestBody final String body){
        log.info(body);
    }

    @PostMapping(path = "post/addSomething")
    @ResponseStatus(HttpStatus.CREATED) // Define Response Status for methods without response
    public void basicPostResponseStatus(@RequestBody final String name){
        // add it to a database or do something without returning something
    }

    @GetMapping(path = "redirect")
    public void redirect(final HttpServletResponse response) throws IOException {
        response.sendRedirect("/basic/get/YouGot/Redirected");
    }

    @GetMapping(path = "error")
    public void error(final HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }
}
