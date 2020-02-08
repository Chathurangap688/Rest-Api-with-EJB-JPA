package com.test.user.implimentations;
import com.test.user.interfaces.User;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TEST_USER")
@NamedQueries({
        @NamedQuery(name = "UserBean.findById",
                query = "SELECT i FROM UserBean i WHERE i.userId = :userId"),
})
public class UserBean implements User {
    @Id
    @GeneratedValue(generator = "userIdSeq")
    @SequenceGenerator(name = "userIdSeq", sequenceName = "USER_ID_SEQ", initialValue = 1, allocationSize = 1)
    @Column(name = "USER_ID")
    private int userId;

    @Column(name = "FIRST_NAME", columnDefinition = "VARCHAR(255)")
    private String firstName;

    @Column(name = "LAST_NAME", columnDefinition = "VARCHAR(255)")
    private String lastName;

    @Column(name = "USER_NAME", columnDefinition = "VARCHAR(255)")
    private String userName;

    @Column(name = "BIRTH_DAY", columnDefinition = "DATE")
    private Date birthDay;

    @Column(name = "USER_TYPE", columnDefinition = "NUMBER(10) default 0")
    private int userType;

    @Override
    public int getUserId() {
        return userId;
    }

    @Override
    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public Date getBirthDay() {
        return birthDay;
    }

    @Override
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public int getUserType() {
        return userType;
    }

    @Override
    public void setUserType(int userType) {
        this.userType = userType;
    }
}
