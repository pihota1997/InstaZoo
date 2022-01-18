package org.pihotans.payload.request;

import lombok.Data;
import org.pihotans.annotations.PasswordMatches;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@PasswordMatches
public class SignupRequest {

    @Email(message = "It should have email format")
    @NotBlank(message = "User email is required")
//    @ValidEmail  //- вроде бы не нужен, так как весь внутренний код прописан в аннотации @Email
    private String email;
    @NotEmpty(message = "Please enter your first name")
    private String firstname;
    @NotEmpty(message = "Please enter your last name")
    private String lastname;
    @NotEmpty(message = "Please enter your username")
    private String username;
    @NotEmpty(message = "Password is required")
    @Size(min = 6)
    private String password;
    private String confirmPassword;

}
