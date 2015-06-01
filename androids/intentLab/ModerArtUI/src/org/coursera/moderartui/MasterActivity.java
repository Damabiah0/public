package org.coursera.moderartui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Toast;

public class MasterActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_master);
		initialize();
	}

	private void initialize() {
		SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar1);
		final EditText editText01 = (EditText) findViewById(R.id.editText01);
		final EditText editText02 = (EditText) findViewById(R.id.editText02);
		final EditText editText11 = (EditText) findViewById(R.id.editText11);
		final EditText editText12 = (EditText) findViewById(R.id.editText12);
		final EditText editText13 = (EditText) findViewById(R.id.editText13);

		seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			int progressChanged = 0;

			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				int diferenceProgress = 0;
				diferenceProgress = progress - progressChanged;
				progressChanged = progress;

				setNewColor(editText01, progress);
				setNewColor(editText02,progress);
				setNewColor(editText11,progress);
				setNewColor(editText12,progress);
				setNewColor(editText13,progress);
			}

			public void onStartTrackingTouch(SeekBar seekBar) {
			}

			public void onStopTrackingTouch(SeekBar seekBar) {
				Toast.makeText(MasterActivity.this,
						"seek bar progress:" + progressChanged,
						Toast.LENGTH_SHORT).show();
			}
		});
		
	}

	private void setNewColor(EditText editText01, int progress) {
		ColorDrawable colorDrawable = (ColorDrawable) editText01
				.getBackground();
//		float[] hsvColor = new float[] { 0, 0, 0 };
		// progress=colorDrawable.getColor()+progress;
		colorDrawable.setColorFilter(
				Color.argb(Color.alpha(colorDrawable.getColor()),
						Color.red(colorDrawable.getColor()) + progress,
						Color.green(colorDrawable.getColor()) + progress,
						Color.blue(colorDrawable.getColor())), Mode.SRC_IN);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		Log.i("onCreateOptionsMenu", "onCreateOptionsMenu");
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.master, menu);
		menu.getItem(0).setOnMenuItemClickListener(new OnMenuItemClickListener() {
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				createAlertForRedirect();
				return true;
			}

		});
		return true;
	}
	
	public void OnOptionsItemSelected(MenuItem item) {
		Log.i("OnOptionsItemSelected", "OnOptionsItemSelected");
	}
	
	private void createAlertForRedirect() {
		Log.i("createAlertForRedirect", "createAlertForRedirect");
		AlertDialog.Builder builder = new AlertDialog.Builder(MasterActivity.this);
		builder=builder
				.setMessage(
						"Inspirated by the works of artists such as Piet	Mondrian and Ben Nicholson.\n Click below to learn more")
				.setNegativeButton("Not Now", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.cancel();
					}
				}).setPositiveButton("Visit MOMA", new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						
						Intent intent = new Intent();
						intent.setAction(Intent.ACTION_VIEW);
						intent.addCategory(Intent.CATEGORY_DEFAULT);
						intent.setData(Uri.parse("http://www.MoMA.org"));
						startActivity(Intent.createChooser(intent, "Choose the browser"));
						
					}
				});
		builder.setTitle("Choose").create().show();
	}

}
