package com.example.thefirstpillar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;

public class schedule_one extends AppCompatActivity {

     CheckBox day1, day2, day3, day4, day5, day6, day7, day8, day9, day10;
     azkar_sharif obj1 = new azkar_sharif();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_schedule_one);


        day1 = findViewById(R.id.day1_c1);
        day2 = findViewById(R.id.day2_c1);
        day3 = findViewById(R.id.day3_c1);
        day4 = findViewById(R.id.day4_c1);
        day5 = findViewById(R.id.day5_c1);
        day6 = findViewById(R.id.day6_c1);
        day7 = findViewById(R.id.day7_c1);
        day8 = findViewById(R.id.day8_c1);
        day9 = findViewById(R.id.day9_c1);
        day10 = findViewById(R.id.day10_c1);


       /* if (savedInstanceState!=null){
            Boolean one = savedInstanceState.getBoolean("day1");
            Boolean two = savedInstanceState.getBoolean("day2");
            Boolean three = savedInstanceState.getBoolean("day3");
            Boolean four = savedInstanceState.getBoolean("day4");
            Boolean five = savedInstanceState.getBoolean("day5");
            Boolean six = savedInstanceState.getBoolean("day6");
            Boolean seven = savedInstanceState.getBoolean("day7");
            Boolean eight = savedInstanceState.getBoolean("day8");
            Boolean nine = savedInstanceState.getBoolean("day9");
            Boolean ten = savedInstanceState.getBoolean("day10");

            day1.setChecked(one);
            day2.setChecked(two);
            day3.setChecked(three);
            day4.setChecked(four);
            day5.setChecked(five);
            day6.setChecked(six);
            day7.setChecked(seven);
            day8.setChecked(eight);
            day9.setChecked(nine);
            day10.setChecked(ten);
        }



            if (day1.isChecked() == true && day2.isChecked() == true && day3.isChecked() == true && day4.isChecked() == true
                    && day5.isChecked() == true && day6.isChecked() == true
                    && day7.isChecked() == true && day8.isChecked() == true
                    && day9.isChecked() == true && day10.isChecked() == true) {

                obj1.btn5.setClickable(true);
                obj1.imglocked.setVisibility(View.INVISIBLE);
                obj1.imgunlocked.setVisibility(View.VISIBLE);
            }*/

    }
}