package sma.form.formValidator.entity;

import jakarta.validation.constraints.*;

public class LoginData {
    @NotBlank(message="UserName cannot be null")
    @Size(min=3,max=12,message="UserName should be 3-12 characters long")
    private String userName;

    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Invalid email")
    private String email;

    @AssertTrue(message = "Must agree to terms and conditions")
    private boolean agreed;

    @Override
    public String toString() {
        return "LoginData{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}
