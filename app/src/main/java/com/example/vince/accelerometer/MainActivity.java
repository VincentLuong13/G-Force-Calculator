package com.example.vince.accelerometer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

import android.widget.TextView;

import com.gCalc;


public class MainActivity extends AppCompatActivity implements SensorEventListener{

    private TextView xText,yText,zText;
    private Sensor mySensor;
    private SensorManager SM;
    gCalc calculator = new gCalc(0,0);






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Create Sensor Manager
        SM=(SensorManager)getSystemService(SENSOR_SERVICE);

        //Accelerometor Censor
        mySensor = SM.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        //Register Listner
        SM.registerListener(this,mySensor,SensorManager.SENSOR_DELAY_FASTEST);

        //Assign TextView
        xText = (TextView)findViewById(R.id.xText);
        //yText = (TextView)findViewById(R.id.yText);
        zText = (TextView)findViewById(R.id.zText);


    }


    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {



        //Set text to the sensor read
        xText.setText("X GForce:" + calculator.calcX(sensorEvent.values[0]));
        //yText.setText("Y:" + sensorEvent.values[1]);
        zText.setText("X GForce:" + calculator.calcX(sensorEvent.values[2]));
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
