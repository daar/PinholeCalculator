package com.pinhole.slidingmenu;

import com.pinhole.slidingmenu.R;
import android.app.Fragment;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.AdapterView.OnItemSelectedListener;

public class DevelopTimerFragment extends Fragment implements OnClickListener,
		OnItemSelectedListener, SensorEventListener {
	
	//widget variables
    private View btnStartTimer;

    public DevelopTimerFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_develop_timer, container, false);
         
		//attach callbacks
        //btnStartTimer = (Button) this.findViewById(R.id.btnStartTimer);
        //btnStartTimer.setOnClickListener(this);
        
        return rootView;
    }
	
	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if (v == btnStartTimer) {
			StartCountDownTimer();
		}
	
	}

	private void StartCountDownTimer() {
		// TODO Auto-generated method stub
		
	}	
}
