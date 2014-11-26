package com.learn2code.androidtechies;


import com.adt.learn2code.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Cpp extends ActionBarActivity implements OnItemClickListener
{   String[] values=new String[]{"Calculate Simple Interest","Fibonacii Series",
		                        "Largest of Three Nos","Check whether a no is divisible",
		                        "Odd Even check","Simple Calculator",
		                        "1/n series","Factorial","Area of Square and Rectangle",
		                        "Swap two nos using Pointers","Sum of digit of 3 dig. no",
		                        "Matrix Calculation","Add Diff. Data Types",
		                        "Perimeter and Area of Diff. Shapes","Cipher a String",
		                        "Find and Delete a Sub String","Introduction to Classes",
		                        "Add Sub two Complex No.","To Show and Add Entered Time"};
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {	super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		ListView lview=(ListView)findViewById(R.id.listc);
		lview.setAdapter(new ArrayAdapter<String>(Cpp.this, android.R.layout.simple_list_item_1,values));
        lview.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) 
    {	String[] List=new String[]{"si","fibon","gr83","divd","oddeve","simpcalc",
    							   "series","fact","arsqr","swap",
    							   "sum3dig","matcal","adddata","perarea",
    							   "cipher","fnds","idtc","astcn","time"};

    	Intent intent;
    	intent=new Intent(Cpp.this,Webhand.class);
    	intent.putExtra("htmlname",List[position]);
    	startActivity(intent);
    }
}