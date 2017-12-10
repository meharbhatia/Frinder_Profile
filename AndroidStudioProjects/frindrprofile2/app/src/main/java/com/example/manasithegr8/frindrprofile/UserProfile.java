package com.example.manasithegr8.frindrprofile;

/**
 * Created by Manasithegr8 on 09-12-2017.
 */

public class UserProfile {
    private String header;

    private String profileContent;

    public UserProfile(String header, String profileContent) {
        this.header = header;
        this.profileContent = profileContent;
    }

    public String getHeader() {
        return header;
    }

    public String getProfileContent() {
        return profileContent;
    }
}

