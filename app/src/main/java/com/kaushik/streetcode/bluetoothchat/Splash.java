package com.kaushik.streetcode.bluetoothchat;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Window;
import android.widget.Toast;


public class Splash extends Activity {
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	
	

	
	protected void onCreate(Bundle savedInstanceState) {
	    // TODO Auto-generated method stub
	    super.onCreate(savedInstanceState);
	   this.requestWindowFeature(Window.FEATURE_NO_TITLE);
	   
	    setContentView(R.layout.splash);          
	    Thread timer = new Thread() {
	        public void run() {
	            try {
	                sleep(2500);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            } finally {
	                startActivity(new Intent(Splash.this, MainActivity.class));
	                 
	            }
	        }
	    };
	    timer.start();
	   }

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	

}
