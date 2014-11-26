package com.learn2code.androidtechies;

import com.adt.learn2code.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Java extends ActionBarActivity implements OnItemClickListener
{   String[] values=new String[]{"Hello World Program","Multiplication and Division","While Loop","Count No. of Words","Binomial Function","Binary Search","Calender",
								 "Finding Factors","Fibonacii Series","Insertion","Leap Year",
								 "Merging Arrays","Nested if","Quadratic Equation","Ruler",
								 "Square Roots","Stop Watch","Matrix Transpose","User Argument",
								 };
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		ListView lview=(ListView)findViewById(R.id.listc);
		lview.setAdapter(new ArrayAdapter<String>(Java.this, android.R.layout.simple_list_item_1,values));
        lview.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) 
    {	String[] List=new String[]{"hello","muldiv","whlloop","wrdcnt","bino","bisr",
    							   "cal","factor","fibona","inser","lypr","merge",
    							   "nesif","quad","ruler","sqrt","stpwtch","trpose","usrarg"};
    
    	Intent intent;
    	intent=new Intent(Java.this,Webhand.class);
    	intent.putExtra("htmlname",List[position]);
    	startActivity(intent);
    }
}
