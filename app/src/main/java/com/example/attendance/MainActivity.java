package com.example.attendance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;
    Button punchIn,punchOut;
    TextView punchIntime,punchOuttime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = (CalendarView)findViewById(R.id.calenderView);
        punchIn = (Button)findViewById(R.id.punchIn);
        punchOut = (Button)findViewById(R.id.punchOut);
        punchIntime = (TextView)findViewById(R.id.punchIntime);
        punchOuttime = (TextView)findViewById(R.id.punchOuttime);

        punchIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
                String currentDateandTime = sdf.format(new Date());
                punchIntime.setText(currentDateandTime);
            }
        });

        punchOuttime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf= new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm: z");
                String currentDateandTime = sdf.format(new Date());
                punchOuttime.setText(currentDateandTime);
            }
        });
    }
}
