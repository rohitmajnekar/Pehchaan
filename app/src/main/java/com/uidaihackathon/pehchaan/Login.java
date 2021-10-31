package com.uidaihackathon.pehchaan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText uid1,uid2,uid3;
    int c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        uid1 = (EditText)findViewById(R.id.login_et_uid1);
        uid2 = (EditText)findViewById(R.id.login_et_uid2);
        uid3 = (EditText)findViewById(R.id.login_et_uid3);
    }

    @Override
    protected void onStart() {
        super.onStart();

        uid1.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()==4)
                    uid2.requestFocus();
            }
        });

        uid2.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.length()==4)
                    uid3.requestFocus();
            }
        });
    }
//
//    private String addPadding(String t, String s, int num)
//    {
//        StringBuilder retVal;
//
//        if (null == s || 0 >= num) {
//            throw new IllegalArgumentException("Don't be silly");
//        }
//
//        if (s.length() <= num) {
//            //String to small, do nothing
//            return s;
//        }
//
//        retVal = new StringBuilder(s);
//
//        for(int i = retVal.length(); i > 0; i -= num){
//            retVal.insert(i, t);
//        }
//        return retVal.toString();
//    }
}