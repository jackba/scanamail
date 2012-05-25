package com.Android.Scanamail;

import java.security.PublicKey;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ScanamailActivity extends Activity {
    /** Called when the activity is first created. */
	int _gHits =0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
     
        Button btn = (Button) findViewById(R.id.btnStart);
        btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent= new Intent("com.google.zxing.client.android.scan");
				intent.putExtra("SCAN_MODE","QR_CODE_MODE");
				startActivityForResult(intent, 0);
			}
			public void onActivityResult(int requestCode, int resultCode, Intent intent) {
				   if (requestCode == 0) {
				      if (resultCode == RESULT_OK) {
				    	 EditText editText =(EditText)findViewById(R.id.txtMaxScans);
				    	 int value = Integer.parseInt(editText.getText().toString());
				    	 
				    	  if( _gHits < value )
				    	  _gHits++;
				         String contents = intent.getStringExtra("SCAN_RESULT");
				         String format = intent.getStringExtra("SCAN_RESULT_FORMAT");
				         // Handle successful scan
				      } else if (resultCode == RESULT_CANCELED) {
				         // Handle cancel
				      }
				   }
				}

		});	
      
    }
}