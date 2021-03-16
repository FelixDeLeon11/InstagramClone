package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("oDrylGXfm5RxVjkSQcdg8msjU73cXnd4du21jnSQ")
                .clientKey("HBVMQCd2695S8oBarH6iGcZEYEIxz1PhpzbQPHto")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
