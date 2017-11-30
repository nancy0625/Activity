package com.example.activity_test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NextActivity extends Activity {
	private TextView textView;
	private EditText editText;
	private Button btn;

	public NextActivity() {
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.next);
		textView = (TextView)this.findViewById(R.id.textView1);
		editText = (EditText)this.findViewById(R.id.editText1);
		btn = (Button)this.findViewById(R.id.button1);
		
		Intent intent = getIntent();
		String message = intent.getStringExtra("message");
		textView.setText(message);
		
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String value = editText.getText().toString().trim();
				Intent intent = new Intent();
				intent.putExtra("result", value);
				setResult(1001, intent);
				finish();
				
			}
		});
		
	}

}
