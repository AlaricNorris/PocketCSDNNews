package com.alaric.norris.open.source.csdnnews.frameworks;

import android.content.Intent ;
import android.os.Bundle ;
import android.support.v4.app.FragmentActivity ;
import com.alaric.norris.open.source.csdnnews.R ;
import com.alaric.norris.open.source.csdnnews.tool.ActivityCollectorTool ;

public class BaseFragmentActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ActivityCollectorTool.addActivity(this);
	}

	@Override
	protected void onStart() {
		super.onStart();
	}

	@Override
	protected void onStop() {
		super.onStop();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		ActivityCollectorTool.removeActivity(this);
	}

	@Override
	public void startActivity(Intent intent) {
		super.startActivity(intent);
		overridePendingTransition(R.anim.activity_translate_right_in, R.anim.activity_translate_right_out);
	}

	public void startActivityForResult(Intent intent, int requestCode) {
		super.startActivityForResult(intent, requestCode);
		overridePendingTransition(R.anim.activity_translate_right_in, R.anim.activity_translate_right_out);
	}

	@Override
	public void finish() {
		super.finish();
		overridePendingTransition(R.anim.activity_translate_right_close_in, R.anim.activity_translate_right_close_out);
	}
}
