package com.baifan.state;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by baifan on 16/5/18.
 */
public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void login(){
        //登录成功后
        LoginContext.getLoginContext().setState(new LoginState());
    }
}
