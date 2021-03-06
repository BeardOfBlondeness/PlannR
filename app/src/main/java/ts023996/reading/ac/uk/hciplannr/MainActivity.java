package ts023996.reading.ac.uk.hciplannr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActivityBackgroundColor(0);
        setContentView(R.layout.activity_main);
    }

    public void setActivityBackgroundColor(int color) {
        View view = this.getWindow().getDecorView();
        view.setBackgroundColor(color);
    }

    public void toTimetables(View view) {
        startActivity(new Intent(MainActivity.this, Timetables.class));
    }

    public void toNotify(View view) {
        startActivity(new Intent(MainActivity.this, Notifications.class));
    }

    public void toDeadlines(View view) {
        startActivity(new Intent(MainActivity.this, Deadlines.class));
    }


}
