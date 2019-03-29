package ts023996.reading.ac.uk.hciplannr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class AddEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);
    }

    public void addEvent(View view) {
        EditText edit = (EditText)findViewById(R.id.editTextDialogUserInput2);
        try {
            WeeklyTimetable.addEvent(edit.getText().toString());
        } catch(Exception e) {
            e.printStackTrace();
        }
        startActivity(new Intent(AddEvent.this, WeeklyTimetable.class));
    }
}
