package com.dilmaj.hello.view;

import android.view.View;
import android.view.View.OnClickListener;

import com.dilmaj.hello.model.Greetings;

public class SayHelloButtonClickListener implements OnClickListener {
    private MainView mainView;

    public SayHelloButtonClickListener(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void onClick(View arg0) {
        String name = mainView.getEditText();
        String message = Greetings.buildMessage(name);
        NotificationHandler.toast(mainView.getContext(), message);
    }
}

