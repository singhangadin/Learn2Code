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

public class C extends ActionBarActivity implements OnItemClickListener
{   String[] values=new String[]{"Area and Perimeter of Rectangle","Change Character Cases",
								"Conv. Celsius to Fah/Cel","Check Upper Lower",
								"Check if no. is Odd or Even","Conv. Float to Int",
								"Largest of 2 Nos.","Largest of 3 Nos.","Check Leap Year",
								"Check is a no. is +ve,-ve or 0","Reversing a 3 Digit no.",
								"Calculate Simple Interest","Simple Calculator",
								"Sum of digs. of 3 dig. no."};
    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {    super.onCreate(savedInstanceState);
		 setContentView(R.layout.activity_list);
		 getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		 ListView lview=(ListView)findViewById(R.id.listc);
		 lview.setAdapter(new ArrayAdapter<String>(C.this, android.R.layout.simple_list_item_1,values));
         lview.setOnItemClickListener(this);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) 
    {	 // TODO Auto-generated method stub
	     String[] List=new String[]{"calaprec","cck","cel2fah",
	    		 					"chkul","cppeo","f2i","l2ter",
	    		 					"l3nif","lyr","pnzchk","revxlp",
	    		 					"sicpp","simcal","smo3d"};
    	 Intent intent;
    	 intent=new Intent(C.this,Webhand.class);
    	 intent.putExtra("htmlname",List[position]);  
    	 startActivity(intent);
    	 overridePendingTransition(0, R.anim.exit_slide_down);
    }
}
