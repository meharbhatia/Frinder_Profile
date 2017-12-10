package com.example.manasithegr8.frindrprofile.Firebase;

/**
 * Created by Manasithegr8 on 09-12-2017.
 */

public class Firebaseuser {

    private String uId;

    private String branch;

    private String name;



    private String phone;

    private String birthday;

    private String interest1;
    private String interest2;
    private String interest3;

    public Firebaseuser(){
    }

    public Firebaseuser(String uId, String name, String branch, String phone, String birthday, String interest1,String interest2, String interest3) {
        this.uId = uId;
        this.name = name;
        this.branch = branch;
        this.phone = phone;
        this.birthday = birthday;
        this.interest1 = interest1;
        this.interest2 = interest2;
        this.interest3 = interest3;
    }

    public String getuId() {
        return uId;
    }

    public String getBranch() {
        return branch;
    }

    public String getName() {
        return name;
    }



    public String getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getInterest1() {
        return interest1;
    }
    public String getInterest2() {
        return interest2;
    }
    public String getInterest3() {
        return interest3;
    }
}
