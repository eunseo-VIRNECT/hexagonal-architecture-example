package com.example.user.adapter.inbound.controller;

import com.example.user.adapter.inbound.dto.UserSignUp;
import com.example.user.port.inbound.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  @PostMapping(path = "/signup")
  public UserSignUp.Response signUp(@Valid @RequestBody UserSignUp.Request request){
    return this.userService.signUp(request);
  }
}
