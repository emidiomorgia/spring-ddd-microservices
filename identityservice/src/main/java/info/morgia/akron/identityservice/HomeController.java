package info.morgia.akron.identityservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/home")
public class HomeController {

    @Value("${server.port:v1}")
    private String v;

    @Value("${sapp.value:v2}")
    private String v2;

    @GetMapping(path = "/value", produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HomeResponse> getValue(){
        return new ResponseEntity<HomeResponse>(new HomeResponse(1,v),HttpStatus.OK );
    }
}