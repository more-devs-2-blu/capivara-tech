package nfsetimbo.capivaratech.authenticator;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

@RestController
@RequestMapping("/user/getAllUsers/nfs")
public class NfsAuthentication {

    @PostMapping
    public ResponseEntity<String> executeAuthentication() {
        RestTemplate restTemplate = new RestTemplate();

        // Set up basic authentication with base64 encoding
        String username = System.getenv("AUTH_NFSE_USERNAME");
        String password = System.getenv("AUTH_NFSE_PASSWORD");
        String authString = username + ":" + password;
        byte[] authBytes = authString.getBytes(StandardCharsets.UTF_8);
        String encodedAuth = Base64.getEncoder().encodeToString(authBytes);
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Basic " + encodedAuth);

        // Make a GET request to http://localhost:8080/user/getAllUsers
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(System.getenv("GET_USERS_URL"), HttpMethod.GET, entity, String.class);

        // Make a POST request to https://homologacao.atende.net
        HttpHeaders postHeaders = new HttpHeaders();
        postHeaders.setContentType(MediaType.APPLICATION_XML);
        postHeaders.set("Authorization", "Basic " + encodedAuth);
        HttpEntity<String> postEntity = new HttpEntity<>(response.getBody(), postHeaders);
        ResponseEntity<String> postResponse = restTemplate.exchange("POST_URL", HttpMethod.POST, postEntity, String.class);
        return new ResponseEntity<>(postResponse.getBody(), HttpStatus.OK);
    }
}