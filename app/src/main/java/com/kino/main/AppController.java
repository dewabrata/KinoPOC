package com.kino.main;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by user on 1/23/2018.
 */

public class AppController extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this).build();
        com.nostra13.universalimageloader.core.ImageLoader.getInstance().init(config);
    }
}
