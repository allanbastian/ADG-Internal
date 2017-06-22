package com.adgvit.work;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Event, DateTime, Venue;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initalization
        Event = (TextView) findViewById(R.id.txt1);
        DateTime = (TextView) findViewById(R.id.txt2);
        Venue = (TextView) findViewById(R.id.txt3);
        viewPager = (ViewPager) findViewById(R.id.pager);
        myFragmentPageAdapter adapter = new myFragmentPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        //getting details of event
        Event = getEvent();
        setEvent(Event);
        DateTime = getDateTime();
        setDateTime(DateTime);
        Venue = getVenue();
        setVenue(Venue);
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
