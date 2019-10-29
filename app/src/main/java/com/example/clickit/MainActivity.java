package com.example.clickit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //initiate click tracking variables
    int clickValue = 0;
    int clickInterval = 1;
    boolean upOrDown = true;
    char plusOrMinus = ' ';

    TextView clickCounting;
    TextView intervalTracker;
    TextView possiNeggi;
    TextView clickIntView;
    TextView titleBarYo;

    public void newCount(View view){


    }

    public void openCount(View view) {


    }

    //function to determine weather you are adding or subtracting the interval from the count
    public void upOrDown (View view) {



        //flip the weather licking the counting button increases or decreases the value displayed
        upOrDown = !upOrDown;

        if (upOrDown == true) {
            plusOrMinus = '+';
        } else {
            plusOrMinus = '-';
        }

        possiNeggi = findViewById(R.id.downButton);

        possiNeggi.setText(String.valueOf(plusOrMinus));



    }

    public void clickIntervalEdit(View view) {

        //listen for long click on "button"
        //on long click allow edit of "clickInterval" to what is typed into the field

    }



    //create function for button press
    public void clickCount(View view) {

        //Add function to make 'clickInterval' = 1 if the text field has nothing in it

        EditText clickValueMang = findViewById(R.id.clickIntervalViewer);

        String clickInterView = clickValueMang.getText().toString();

        clickInterval = Integer.parseInt(clickInterView);

        //increase "clickValue" by 1 every time button is pressed
        if (upOrDown == true) {
            clickValue += clickInterval;
        }else {
            clickValue -= clickInterval;
        }

        System.out.println(clickValue);

        //Displays value of the variable "clickValue" to the text field "clickCounter" in the layout
        clickCounting = findViewById(R.id.clickCounter);

        clickCounting.setText(String.valueOf(clickValue));

        intervalTracker = findViewById(R.id.upButton);

        intervalTracker.setText(String.valueOf(clickInterval));
    }



    public void saveTitle(View view) {



    }

    public void openTitle(View view) {


    }

    public void newTitle(View View){


    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Displays value of the variable "clickValue" to the text field "clickCounter" in the layout
        clickCounting = findViewById(R.id.clickCounter);

        clickCounting.setText(String.valueOf(clickValue));

        //Displays the value of the variable "clickInterval" to the text of the button "button" in the layout
        intervalTracker = findViewById(R.id.upButton);

        intervalTracker.setText(String.valueOf(clickInterval));

        if (upOrDown == true) {
            plusOrMinus = '+';
        } else {
            plusOrMinus = '-';
        }

        possiNeggi = findViewById(R.id.downButton);

        possiNeggi.setText(String.valueOf(plusOrMinus));

        clickIntView = findViewById(R.id.clickIntervalViewer);

        clickIntView.setText(String.valueOf(clickInterval));






    }


}
