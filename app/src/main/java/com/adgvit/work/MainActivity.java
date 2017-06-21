package com.adgvit.work;

import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Switch aSwitch;
    private TextView Event, DateTime, Venue;
    private ViewPager viewPager;
    private PagerTabStrip tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Event = (TextView) findViewById(R.id.txt1);
        DateTime = (TextView) findViewById(R.id.txt2);
        Venue = (TextView) findViewById(R.id.txt3);
        viewPager = (ViewPager) findViewById(R.id.pager);
        myFragmentPageAdapter adapter = new myFragmentPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabs = (PagerTabStrip) findViewById(R.id.tabStrip);
        tabs.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 24);

    }

    private void showCompleted() {
        //function to show Completed tasks in the recycler view
    }

    private void showPending() {
        //function to show Pending tasks in the recycler view
    }

    public TextView getEvent() { return Event; }

    public void setEvent(TextView event) { this.Event = event; }

    public TextView getDateTime() { return DateTime; }

    public void setDateTime(TextView dateTime) { this.DateTime = dateTime; }

    public TextView getVenue() { return Venue; }

    public void setVenue(TextView venue) { this.Venue = venue; }


}
