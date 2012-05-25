package com.Android.Scanamail;

import android.R.anim;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Settings extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        Button btnSave = (Button) findViewById(R.id.btnSave);
        
        btnSave.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				
				Toast.makeText(getBaseContext(), "Saved",Toast.LENGTH_SHORT).show();
				//save it to sqllite db
				
				
				Intent intent = new Intent();
				setResult(RESULT_OK,intent);
			    finish();//Important to go back to the parent window...//
			}
		});
        
       Button btnCancel = (Button) findViewById(R.id.button3);
       btnCancel.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			Intent intent = new Intent();
			setResult(RESULT_OK,intent);
		    finish();//Important to go back to the parent window...//
			
		}
	});
       
       
    }
}
