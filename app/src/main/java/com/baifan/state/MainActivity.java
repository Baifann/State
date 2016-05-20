package com.baifan.state;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void forward(){
        LoginContext.getLoginContext().forward(this);
    }

    private void comment(){
        LoginContext.getLoginContext().comment(this);
    }
}
