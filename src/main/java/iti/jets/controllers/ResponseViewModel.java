package iti.jets.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
@Controller
public class ResponseViewModel {
    private Map<String, Object> responseBody = new HashMap<>();
    
    public void setResponseBody(String massage, HttpStatus status, Object data) {
        responseBody.put("massage", massage);
        responseBody.put("status", status);
        responseBody.put("data", data);
    }

    public Map<String, Object> getResponseBody() {
        return responseBody;
    }
}
