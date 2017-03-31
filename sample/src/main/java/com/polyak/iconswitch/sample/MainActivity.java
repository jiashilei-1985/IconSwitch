package com.polyak.iconswitch.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;

import com.polyak.iconswitch.IconSwitch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Switch sw = (Switch) findViewById(R.id.s_witch);
        IconSwitch iconSw = (IconSwitch) findViewById(R.id.icon_switch);
        iconSw.setListener(new IconSwitch.Listener() {
            @Override
            public void onCheckChanged(boolean checked) {
                sw.setChecked(checked);
            }
        });
    }
}
