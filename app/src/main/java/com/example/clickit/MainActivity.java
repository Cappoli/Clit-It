package com.example.clickit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean upOrDown = true;    //used to flip whether the clicks add or subtract from the total count
    char plusOrMinus;           //'+' when adding clicks '-' when subtracting clicks
    int counter;
    int interval = 1;
    String currentCount;
    TextView possiNeggi;
    TextView clickCounting;
    String clickButton;
    TextView intervalTracker;
    TextView viewInterval;

    public static void main(String[] args) {

    }

        public void UpOrDown(View view){

            upOrDown = !upOrDown;                               //Flip the up or down boolean

            if (upOrDown) { plusOrMinus = '+';}                 //change value of plusOrMinus based on up or down
            else {plusOrMinus = '-';}


            possiNeggi = findViewById(R.id.downButton);
            possiNeggi.setText(String.valueOf(plusOrMinus));    //Display value of plusOrMinus



        }

        public void saveTitle(View view){
            //Save current count with title from title bar

        }

        public void openCount(View view){
            //Bring up a list of saved counts
            //open selected count

        }

        public void newButton (View view){
            //Create new clickCount with a title based on the text field
            //Set int 'count' to 0
            //Set currentCount to clickCount'title'

        }

        public void clickCount (View view){

            EditText clickValueMang = findViewById(R.id.clickIntervalViewer);

            String clickInterView = clickValueMang.getText().toString();

            interval = Integer.parseInt(clickInterView);

            if (plusOrMinus == '+'){
                counter += interval;//Increase count if up or down boolean is true
            }else{
               counter -= interval; //Decrease count if up or down boolean is false
            }

            clickCounting = findViewById(R.id.clickCounter);
            clickCounting.setText(String.valueOf(counter)); //Updates displayed value of current count

        }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (upOrDown) { plusOrMinus = '+';}                 //change value of plusOrMinus based on up or down
        else {plusOrMinus = '-';}

        possiNeggi = findViewById(R.id.downButton);
        possiNeggi.setText(String.valueOf(plusOrMinus));

        clickCounting = findViewById(R.id.clickCounter);    //display value of the current count
        clickCounting.setText(String.valueOf(counter));

        intervalTracker = findViewById(R.id.upButton);
        intervalTracker.setText("Click");

        viewInterval = findViewById(R.id.clickIntervalViewer);
        viewInterval.setText(String.valueOf(interval));
    }


    class clickCounts {

        String name;    //Name
        int count;      //Click count

    }
}




//initiate click tracking variables
   /* int clickValue = 0;
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
        //Use hint to display title of count
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

        clickIntView.setText(String.valueOf(clickInterval));*/

