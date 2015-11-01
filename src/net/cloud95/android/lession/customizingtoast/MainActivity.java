package net.cloud95.android.lession.customizingtoast;

import android.os.Bundle;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private Activity activity;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		activity = this;
		
		Button btnToast = (Button) findViewById(R.id.btnToast);
		btnToast.setOnClickListener(toastOnClickListener);
	}
	
	private OnClickListener toastOnClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Utility.showToast(activity, "這是自製吐司訊息!!!");
		}
	};
}
