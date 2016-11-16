package com.xyang.encore.android_joystick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import io.github.controlwear.virtual.joystick.android.JoystickView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JoystickView joystick = (JoystickView) findViewById(R.id.jsvLeft);
        final TextView tv1 = (TextView) findViewById(R.id.tvAngleVal);
        final TextView tv2 = (TextView) findViewById(R.id.tvStrengthVal);
        tv1.setText("0");
        tv2.setText("0");
        joystick.setOnMoveListener(new JoystickView.OnMoveListener() {
            @Override
            public void onMove(int angle, int strength) {
                // do whatever you want
                tv1.setText(String.valueOf(angle));
                tv2.setText(String.valueOf(strength));
            }
        });
    }
}
