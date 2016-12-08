package com.dilmaj.hello.view;


import android.app.Activity;
import android.content.Context;
import android.widget.Button;
import android.widget.EditText;

import com.dilmaj.hello.R;

public class MainView {
    private Button sayHelloButton;
    private EditText nameEditText;
    private Activity activity;

    public MainView(Activity activity) {
        this.activity = activity;

        nameEditText = (EditText)activity.findViewById(R.id.nameEditText);

        sayHelloButton = (Button)activity.findViewById(R.id.sayHelloButton);
        sayHelloButton.setOnClickListener(new SayHelloButtonClickListener(this));
    }

    public String getEditText() {
        return nameEditText.getText().toString();
    }

    public Context getContext() {
        return activity;
    }

    public void setEditText(String name) {
        nameEditText.setText(name);
    }
}
