package com.example.maksy.codinginflowapps.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.maksy.codinginflowapps.R;
import com.example.maksy.codinginflowapps.mvpexample.model.LoginPresenterImpl;
import com.example.maksy.codinginflowapps.mvpexample.presenter.LoginPresenter;
import com.example.maksy.codinginflowapps.mvpexample.view.LoginView;

public class MVPMain extends AppCompatActivity implements View.OnClickListener,LoginView {

    EditText editTextLogin, editTextPassword;
    TextView textViewLogin;

    LoginPresenter loginPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvpmain);

        editTextLogin = findViewById(R.id.mvp_login);
        editTextPassword = findViewById(R.id.mvp_password);
        textViewLogin = findViewById(R.id.mvp_button_login);

        textViewLogin.setOnClickListener(this);

        loginPresenter = new LoginPresenterImpl(MVPMain.this);
    }

    @Override
    public void onClick(View v) {
        String userName = editTextLogin.getText().toString();
        String password = editTextPassword.getText().toString();

        loginPresenter.performLogin(userName,password);
    }

    @Override
    public void loginValidations() {
        Toast.makeText(this, "zalogowany nie bedziesz", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "zalogowany bedziesz!!!!!!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(this, "przypau!!! bagiety jadom!!!", Toast.LENGTH_SHORT).show();
    }
}
