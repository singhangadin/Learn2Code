package com.learn2code.androidtechies;

import com.adt.learn2code.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class Webhand extends Activity
{   WebView web;
	String str=new String();
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_webhand);
		str=getIntent().getExtras().getString("htmlname");
		web=(WebView)findViewById(R.id.web);
		if(!str.equals("http://www.androidtechies.com"))
		{	web.loadUrl("file:///android_asset/"+str+".html");
		}
		else
		{	web.loadUrl(str);
		}
		web.getSettings().setBuiltInZoomControls(true);
		web.getSettings().setUseWideViewPort(true);
	}
}