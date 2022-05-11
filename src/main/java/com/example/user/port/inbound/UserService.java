package com.example.user.port.inbound;


import com.example.user.adapter.inbound.dto.UserSignUpReq;
import com.example.user.adapter.inbound.dto.UserSignUpRes;

public interface UserService {
  UserSignUpRes signUp(UserSignUpReq request);
}
