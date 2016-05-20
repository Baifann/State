package com.baifan.state;

import android.content.Context;

/**
 * Created by baifan on 16/5/18.
 * 管理类
 */
public class LoginContext {
    private UserState mState = new LoginoutState();

    static LoginContext mLoginContext = new LoginContext();

    private LoginContext() {

    }

    public static LoginContext getLoginContext() {
        return mLoginContext;
    }

    public void setState(UserState state) {
        mState = state;
    }

    public void forward(Context context) {
        mState.forwoard(context);
    }

    public void comment(Context context) {
        mState.comment(context);
    }
}
