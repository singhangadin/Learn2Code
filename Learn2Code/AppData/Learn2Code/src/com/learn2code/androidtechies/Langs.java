package com.learn2code.androidtechies;

import com.adt.learn2code.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Langs extends ActionBarActivity 
{	Button s1,s2,s3;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_langs);	
		//Toast.makeText(getApplicationContext(), "Select semester", Toast.LENGTH_SHORT).show();
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		s1=(Button) findViewById(R.id.button1);
		s2=(Button) findViewById(R.id.button2);
		s3=(Button) findViewById(R.id.button3);
		s1.setOnClickListener(new OnClickListener() 
		{	@Override
			public void onClick(View v) 
			{	Intent C=new Intent(Langs.this,C.class);
				startActivity(C);
			}
		});
		s2.setOnClickListener(new OnClickListener() 
		{	@Override
			public void onClick(View v) 
			{	Intent cpp=new Intent(Langs.this,Cpp.class);
				startActivity(cpp);
			}
		});
		s3.setOnClickListener(new OnClickListener() 
		{	@Override
			public void onClick(View v) 
			{	Intent java=new Intent(Langs.this,Java.class);
				startActivity(java);
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{	//getMenuInflater().inflate(R.menu.semesters, menu);
		return true;
	}
}
