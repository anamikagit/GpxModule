package com.example.anamika.gpxmodule;

import android.app.Application;

import com.facebook.stetho.Stetho;


public class MyApplication extends Application {

	public void onCreate() {
		super.onCreate();
		Stetho.initializeWithDefaults(this);
	}
}
