package ts023996.reading.ac.uk.hciplannr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Timetables extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetables);
    }

    public void toClass(View view) {
        startActivity(new Intent(Timetables.this, WeeklyTimetable.class));
    }

    public void toHome(View view) {
        startActivity(new Intent(Timetables.this, HomeTimetable.class));
    }
}
