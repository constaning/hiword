package cn.com.bean;

import org.springframework.stereotype.Component;

@Component
public class User {
  private Integer udi;
  private Integer uphone;
  private  String upassword;

  public Integer getUdi() {
    return udi;
  }

  public void setUdi(Integer udi) {
    this.udi = udi;
  }

  public Integer getUphone() {
    return uphone;
  }

  public void setUphone(Integer uphone) {
    this.uphone = uphone;
  }

  public String getUpassword() {
    return upassword;
  }

  public void setUpassword(String upassword) {
    this.upassword = upassword;
  }

  @Override
  public String toString() {
    return "User{" +
            "udi=" + udi +
            ", uphone=" + uphone +
            ", upassword='" + upassword + '\'' +
            '}';
  }

  public User() {
  }

  public User(Integer uphone, String upassword) {
    this.uphone = uphone;
    this.upassword = upassword;
  }
}
