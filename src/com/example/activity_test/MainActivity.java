package com.example.activity_test;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class MainActivity extends Activity {
	private Button button;
	private EditText editText1,editText2,editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)this.findViewById(R.id.button1);
        editText1 = (EditText)this.findViewById(R.id.editText1);
        editText2 = (EditText)this.findViewById(R.id.editText2);
        editText3 = (EditText)this.findViewById(R.id.editText3);
        button.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			String a = editText1.getText().toString().trim();
			String b = editText2.getText().toString().trim();
			String message = a+" + "+b+" = "+"?";
			Intent intent = new Intent(MainActivity.this,NextActivity.class);
			intent.putExtra("message", message);
			startActivityForResult(intent, 1000);
			
		}
	});
      
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    	// TODO Auto-generated method stub
    	super.onActivityResult(requestCode, resultCode, data);
    	if(requestCode == 1000 & resultCode == 1001){
    		String value = data.getStringExtra("result");
    		editText3.setText(value);
    	}
    	
    }


  

}
