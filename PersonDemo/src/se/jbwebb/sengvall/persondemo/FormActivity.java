package se.jbwebb.sengvall.persondemo;

import java.util.ArrayList;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

public class FormActivity extends Activity {
	
	TextView tvName;
	TextView tvAddress;
	TextView tvZipCity;
	TextView tvMobile;
	
	ArrayList<Person> persons = new ArrayList<Person>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_form);
		
		tvName = (TextView) findViewById(R.id.editText1);
		tvAddress = (TextView) findViewById(R.id.editText2);
		tvZipCity = (TextView) findViewById(R.id.editText3);
		tvMobile = (TextView) findViewById(R.id.editText4);
		
		Button bSave = (Button) findViewById(R.id.button1);
		Button bShow = (Button) findViewById(R.id.button2);
		
		bSave.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {				
				String name = tvName.getText().toString();
				String address = tvAddress.getText().toString();
				String zipcity = tvZipCity.getText().toString();
				String mobile = tvMobile.getText().toString();
				
				Person person = new Person(name,address,zipcity,mobile);
				persons.add(person);
				Log.i("Person", person.getName());
				
			}
			
		});
		
		bShow.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
			}
			
		});
		
	}

	
}
