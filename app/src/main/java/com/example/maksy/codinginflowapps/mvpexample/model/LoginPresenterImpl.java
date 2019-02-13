package com.example.maksy.codinginflowapps.mvpexample.model;

import android.text.TextUtils;

import com.example.maksy.codinginflowapps.mvpexample.presenter.LoginPresenter;
import com.example.maksy.codinginflowapps.mvpexample.view.LoginView;

public class LoginPresenterImpl implements LoginPresenter {

    LoginView mLoginView;

    public LoginPresenterImpl(LoginView loginView){
        this.mLoginView = loginView;
    }
    @Override
    public void performLogin(String userName, String password) {
        if(TextUtils.isEmpty(userName) || TextUtils.isEmpty(password)){
            mLoginView.loginValidations();
        } else if(userName.equals("dupa") && password.equals("dupka")){
            mLoginView.loginSuccess();
        } else {
            mLoginView.loginError();
        }
    }
}
