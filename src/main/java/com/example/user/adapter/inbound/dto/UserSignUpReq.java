package com.example.user.adapter.inbound.dto;

import javax.validation.constraints.NotBlank;

public class UserSignUpReq {
    @NotBlank(message = "이메일이 비어있습니다.")
    private String email;

    @NotBlank(message = "이름이 비어있습니다.")
    private String userName;

    @NotBlank(message = "비밀번호가 비어있습니다.")
    private String password;

    @NotBlank(message = "닉네임이 비어있습니다.")
    private String nickName;

    public UserSignUpReq(String email, String userName, String password, String nickName) {
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {return userName;}

    public String getPassword() {
        return password;
    }

    public String getNickName() {
        return nickName;
    }
}
