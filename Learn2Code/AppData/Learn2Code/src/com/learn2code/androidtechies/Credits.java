package com.learn2code.androidtechies;

import com.adt.learn2code.R;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;

public class Credits extends ActionBarActivity
{   ImageView Img;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_credits);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		Img=(ImageView)findViewById(R.id.adt);
		Img.setOnClickListener(new View.OnClickListener() 
		{	@Override
			public void onClick(View v) 
			{	// TODO Auto-generated method stub
				Intent browser=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.androidtechies.com"));
				startActivity(browser);
			}
		});
	}
}
