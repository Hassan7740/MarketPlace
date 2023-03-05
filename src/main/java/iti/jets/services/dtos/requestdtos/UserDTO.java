package iti.jets.services.dtos.requestdtos;

import lombok.Data;

@Data
public class UserDTO {
    private int userId ;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String gender;
    private int addressId;
 } 