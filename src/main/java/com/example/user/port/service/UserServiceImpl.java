package com.example.user.port.service;

import com.example.user.adapter.inbound.dto.UserSignUpReq;
import com.example.user.adapter.inbound.dto.UserSignUpRes;
import com.example.user.domain.User;
import com.example.user.port.inbound.UserService;
import com.example.user.port.outbound.UserRepository;
import javax.transaction.Transactional;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
  private final UserRepository userRepository;

  @Transactional
  public UserSignUpRes signUp(UserSignUpReq request) {
    User user = userRepository.save(User.signUpBuilder()
            .userSignUpReq(request)
            .build());
    return new UserSignUpRes(user.getId());
  }
}
