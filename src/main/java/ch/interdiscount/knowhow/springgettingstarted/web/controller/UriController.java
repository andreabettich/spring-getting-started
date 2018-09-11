package ch.interdiscount.knowhow.springgettingstarted.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;


import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("uri")
public class UriController {
    @GetMapping("uri1")
    public String getUri1() {
        final URI uri = UriComponentsBuilder
                .fromUriString("https://www.interdiscount.ch/de/computer-software/notebooks-tablets/tablets--C512000/{product}")
                .build("apple-ipad-wifi-9-7-32-gb-space-grau-2018---P0001496329");
        return uri.toString();
    }

    @GetMapping("uri2")
    public String getUri2() {
        final URI uri = UriComponentsBuilder
                .fromUriString("http://interdiscount.ch/category/{category}")
                .queryParam("q", "{q}") // ?q=123
                .encode()
                .buildAndExpand("Telefon", "123") // just the values
                .toUri();
        return uri.toString();
    }

    @GetMapping("uri3")
    public String getUri3() {
        final URI uri = UriComponentsBuilder
                .fromUriString("http://interdiscount.ch/{1}/{2}/{3}")
                .build("some", "values", "here");
        return uri.toString();
    }

    @GetMapping("uri4")
    public String getUri4() {
        final Map paramMap = new HashMap<String, String>();
        paramMap.put("1", "some");
        paramMap.put("3", "here");
        paramMap.put("2", "values");
        final URI uri = UriComponentsBuilder
                .fromUriString("http://interdiscount.ch/{1}/{2}/{3}")
                .build(paramMap);
        return uri.toString();
    }

    @GetMapping("uri5")
    public String getUri5(){
        final URI uri = UriComponentsBuilder
                .fromUriString("http://interdiscount.ch/{1}")
                .build("This need encoding");
        return uri.toString();
    }

    @GetMapping("uri6")
    public String getUri6(final HttpServletRequest request){
        final URI uri = ServletUriComponentsBuilder
                .fromContextPath(request) // use the host and port of the request to build a new uri
                .path("/accounts")
                .build()
                .toUri();
        return uri.toString();
    }
}
