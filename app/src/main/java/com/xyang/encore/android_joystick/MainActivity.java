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
        JoystickView joystickT = (JoystickView) findViewById(R.id.jsvLeft);
        JoystickView joystickB = (JoystickView) findViewById(R.id.jsvRight);
        final TextView tvT1 = (TextView) findViewById(R.id.tvAngleTVal);
        final TextView tvT2 = (TextView) findViewById(R.id.tvStrengthTVal);
        final TextView tvB1 = (TextView) findViewById(R.id.tvAngleBVal);
        final TextView tvB2 = (TextView) findViewById(R.id.tvStrengthBVal);
        tvT1.setText("0");
        tvT2.setText("0");
        tvB1.setText("0");
        tvB2.setText("0");
        joystickT.setOnMoveListener(new JoystickView.OnMoveListener() {
            @Override
            public void onMove(int angle, int strength) {
                // do whatever you want
                tvT1.setText(String.valueOf(angle));
                tvT2.setText(String.valueOf(strength));
            }
        });
        joystickB.setOnMoveListener(new JoystickView.OnMoveListener() {
            @Override
            public void onMove(int angle, int strength) {
                // do whatever you want
                tvB1.setText(String.valueOf(angle));
                tvB2.setText(String.valueOf(strength));
            }
        });
    }
}
