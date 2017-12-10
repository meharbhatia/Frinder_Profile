package com.example.manasithegr8.frindrprofile.Helper;

/**
 * Created by Manasithegr8 on 09-12-2017.
 */

import android.content.Context;
import android.widget.Toast;

public class Helper {

    public static final String NAME = "Name";

    public static final String BRANCH = "Branch";

    public static final String BIRTHDAY = "Birthday";

    public static final String PHONE_NUMBER = "Phone Number";

    public static final String INTEREST1= "Interest 1";
    public static final String INTEREST2= "Interest 2";
    public static final String INTEREST3= "Interest 3";


    public static final int SELECT_PICTURE = 2000;

    public static boolean isValidEmail(String email){
        if(email.contains("@")){
            return true;
        }
        return false;
    }

    public static void displayMessageToast(Context context, String displayMessage){
        Toast.makeText(context, displayMessage, Toast.LENGTH_LONG).show();
    }
}