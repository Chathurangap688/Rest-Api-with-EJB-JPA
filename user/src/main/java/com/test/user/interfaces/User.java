package com.test.user.interfaces;

import java.util.Date;

public interface User {
    public int getUserId();
    public void setUserId(int userId);
    public String getFirstName();
    public void setFirstName(String firstName);
    public String getLastName();
    public void setLastName(String lastName);
    public String getUserName();
    public void setUserName(String userName);
    public Date getBirthDay();
    public void setBirthDay(Date birthDay);
    public int getUserType();
    public void setUserType(int userType);
}
