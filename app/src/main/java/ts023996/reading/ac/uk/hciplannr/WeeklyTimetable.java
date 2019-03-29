package ts023996.reading.ac.uk.hciplannr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.Date;

public class WeeklyTimetable extends AppCompatActivity {
    private static ArrayList<String> events;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weekly_timetable);
    }

    public void add(View view) {
        startActivity(new Intent(WeeklyTimetable.this, AddEvent.class));
    }

    public void remove(View view) {
        startActivity(new Intent(WeeklyTimetable.this, RemoveEvent.class));
    }

    public static void addEvent(String ev) {
        events.add(ev);
    }

    public static void removeEvent(int i) {
        events.remove(i);
    }

    public static ArrayList<String> getEvents() {
        return events;
    }
}
