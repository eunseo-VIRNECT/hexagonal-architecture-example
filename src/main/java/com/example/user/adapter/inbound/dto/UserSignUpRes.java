package com.example.user.adapter.inbound.dto;

public class UserSignUpRes {
    private Long userId;

    public UserSignUpRes(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }
}
