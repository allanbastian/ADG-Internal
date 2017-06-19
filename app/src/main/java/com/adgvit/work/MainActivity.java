package com.adgvit.work;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Switch aSwitch;
    private TextView txt1, txt2, txt3;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch = (Switch) findViewById(R.id.switch1);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) { //Toggle and Switch are compound buttons
                if(isChecked) {
                    //show Pending work
                    aSwitch.setText(R.string.pendingChange);
                    showPending();
                } else {
                    //show Completed work
                    aSwitch.setText(R.string.compeleteChange);
                    showCompleted();
                }
            }
        });
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        getEventDetails();
        viewPager = (ViewPager) findViewById(R.id.container);

    }

    private void getEventDetails() {
        //function to replace text view details to show event details
    }

    private void showCompleted() {
        //function to show Completed tasks in the recycler view
    }

    private void showPending() {
        //function to show Pending tasks in the recycler view
    }
}
