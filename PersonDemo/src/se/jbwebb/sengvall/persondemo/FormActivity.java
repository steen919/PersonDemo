package se.jbwebb.sengvall.persondemo;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

public class FormActivity extends Activity {
	
	TextView tvName;
	TextView tvAddress;
	TextView tvZipCity;
	TextView tvMobile;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form);
		
		tvName = (TextView) findViewById(R.id.editText1);
		tvAddress = (TextView) findViewById(R.id.editText2);
		tvZipCity = (TextView) findViewById(R.id.editText3);
		tvMobile = (TextView) findViewById(R.id.editText4);
		
		Button bSave = (Button) findViewById(R.id.button1);
		
	}

	
}
