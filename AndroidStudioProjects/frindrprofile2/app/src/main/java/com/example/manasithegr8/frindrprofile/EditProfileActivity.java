package com.example.manasithegr8.frindrprofile;

/**
 * Created by Manasithegr8 on 09-12-2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.example.manasithegr8.frindrprofile.Firebase.Firebasedatahelper;
import com.example.manasithegr8.frindrprofile.Firebase.Firebaseuser;
import com.example.manasithegr8.frindrprofile.Helper.Helper;
import com.example.manasithegr8.frindrprofile.R;

public class EditProfileActivity extends AppCompatActivity {

    private static final String TAG = EditProfileActivity.class.getSimpleName();

    private EditText editProfileName;

    private EditText editProfileBranch;

    private EditText editProfilePhoneNumber;

    private EditText editProfileInterest1;
    private EditText editProfileInterest2;
    private EditText editProfileInterest3;

    private EditText editProfileBirthday;

    private FirebaseAuth.AuthStateListener authStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_profile);

        setTitle("Edit Profile Information");

        editProfileName = (EditText)findViewById(R.id.profile_name);
        editProfileBranch = (EditText)findViewById(R.id.profile_branch);
        editProfilePhoneNumber = (EditText)findViewById(R.id.profile_phone);
        editProfileInterest1 = (EditText)findViewById(R.id.profile_interest1);
        editProfileBirthday = (EditText)findViewById(R.id.profile_birth);
        editProfileInterest2 = (EditText)findViewById(R.id.profile_interest2);
        editProfileInterest3 = (EditText)findViewById(R.id.profile_interest3);

        Button saveEditButton = (Button)findViewById(R.id.save_edit_button);
        saveEditButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String profileName = editProfileName.getText().toString();
                String profileBranch = editProfileBranch.getText().toString();
                String profilePhoneNumber = editProfilePhoneNumber.getText().toString();
                String profileInterest1 = editProfileInterest1.getText().toString();
                String profileInterest2 = editProfileInterest2.getText().toString();
                String profileInterest3 = editProfileInterest3.getText().toString();

                String profileBirthday = editProfileBirthday.getText().toString();

                // update the user profile information in Firebase database.
                if(TextUtils.isEmpty(profileName) || TextUtils.isEmpty(profileBranch) || TextUtils.isEmpty(profilePhoneNumber)
                        || TextUtils.isEmpty(profileInterest1) || TextUtils.isEmpty(profileBirthday)||TextUtils.isEmpty(profileInterest2)||TextUtils.isEmpty(profileInterest3)){
                    Helper.displayMessageToast(EditProfileActivity.this, "All fields must be filled");
                }

                FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
                if (user == null) {

                } else {
                    String userId = user.getProviderId();
                    String id = user.getUid();
                    String profileEmail = user.getEmail();

                    Firebaseuser userEntity = new Firebaseuser(id, profileName, profileBranch, profilePhoneNumber, profileBirthday, profileInterest1,profileInterest2,profileInterest3);
                    Firebasedatahelper firebaseDatabaseHelper = new Firebasedatahelper();
                    firebaseDatabaseHelper.createUserInFirebaseDatabase(id, userEntity);

                    editProfileName.setText("");
                    editProfileBranch.setText("");
                    editProfilePhoneNumber.setText("");
                    editProfileInterest1.setText("");
                    editProfileInterest2.setText("");
                    editProfileInterest3.setText("");
                    editProfileBirthday.setText("");
                }
            }
        });
    }
}
