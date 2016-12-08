package com.dilmaj.hello;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

import com.dilmaj.hello.view.MainView;

public class MainActivity extends Activity {
    private Button sayHelloButton;
    private MainView mainView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mainView = new MainView(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    public MainView getMainView() {
        return mainView;
    }


    public void setMainView(MainView mainView) {
        this.mainView = mainView;
    }


    public Button getSayHelloButton() {
        return sayHelloButton;
    }


    public void setSayHelloButton(Button sayHelloButton) {
        this.sayHelloButton = sayHelloButton;
    }

}
