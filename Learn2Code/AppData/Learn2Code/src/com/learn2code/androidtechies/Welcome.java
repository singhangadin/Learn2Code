package com.learn2code.androidtechies;

import com.adt.learn2code.R;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends ActionBarActivity
{	Button b1,b2;
	TextView tv1;	
	String[] adt=new String[]{"androidtechies@gmail.com"};
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		//tv1=(TextView) findViewById(R.id.textView1);
		b2=(Button) findViewById(R.id.conbtn);		
		b2.setOnClickListener(new View.OnClickListener() 
		{	@Override
			public void onClick(View v) 
			{	Intent cont=new Intent(Welcome.this,Langs.class);
				startActivity(cont);
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{	getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item)
	{   switch(item.getItemId())
		{   case R.id.creds:Intent next;
		                    next=new Intent(Welcome.this,Credits.class);
		                    startActivity(next);
		                    return true;
		                    
			case R.id.feed:	Intent email=new Intent(android.content.Intent.ACTION_SEND);
							email.setType("plain/text");
							email.putExtra(android.content.Intent.EXTRA_EMAIL,adt);
							email.putExtra(android.content.Intent.EXTRA_SUBJECT,"Feedback");
							startActivity(email);
							return true;
						
			default:return super.onContextItemSelected(item);
		}
		
	}
}