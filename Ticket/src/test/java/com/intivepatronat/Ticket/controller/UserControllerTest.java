package com.intivepatronat.Ticket.controller;

import com.intivepatronat.Ticket.dto.UserDTO;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @LocalServerPort
    private int port;

    private final TestRestTemplate restTemplate = new TestRestTemplate();
    private final HttpHeaders headers = new HttpHeaders();


    @Test
    public void saveUser_shouldCreateUser() throws Exception {
        final HttpEntity<UserDTO> entity = new HttpEntity<>(new UserDTO("Test"), headers);
        final ResponseEntity<String> response = restTemplate.exchange(createURLWithPort(), HttpMethod.POST, entity, String.class);
        assertEquals(response.getStatusCode(), HttpStatus.CREATED);
        JSONAssert.assertEquals(createSampleJsonData(), response.getBody(), false);
    }

    private String createURLWithPort() {
        return "http://localhost:" + port + "/user";
    }

    private String createSampleJsonData() {
        return "{\"name\":\"Test\"}";
    }

}