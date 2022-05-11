package com.example.user.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.example.user.adapter.inbound.dto.UserSignUpReq;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name ="id")
  private Long id;

  @Column(name = "email", length=100, nullable = false, unique = true)
  private String email;

  @Column(name = "username", length=50 , nullable = false)
  private String username;

  @Column(name = "password", length=100 , nullable = false)
  private String password;

  @Column(name = "nickname", length=50, unique = true)
  private String nickname;

  @Builder(builderMethodName = "signUpBuilder")
  public User(UserSignUpReq userSignUpReq) {
    this.email = userSignUpReq.getEmail();
    this.nickname = userSignUpReq.getNickName();
    this.password = userSignUpReq.getPassword();
    this.username = userSignUpReq.getUserName();
  }
}
