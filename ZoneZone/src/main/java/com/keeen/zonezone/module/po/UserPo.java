package com.keeen.zonezone.module.po;

public class UserPo {

    private String userName;

    private String password;

    private String inviteCode;

    private String emailAddress;

    private String mobileNumber;

    private String isAllowed;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getIsAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(String isAllowed) {
        this.isAllowed = isAllowed;
    }

    @Override
    public String toString() {
        return "UserPo{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", inviteCode='" + inviteCode + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", isAllowed='" + isAllowed + '\'' +
                '}';
    }
}
