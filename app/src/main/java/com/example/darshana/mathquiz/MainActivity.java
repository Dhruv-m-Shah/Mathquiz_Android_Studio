package com.example.darshana.mathquiz;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import  android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button option1;
    private Button option2;
    private Button option3;
    private Button option4;
    private int number_of_questions = 0;
    private TextView questionbar;
    private TextView pointbar;
    private int current_index = 0;
    private int total_points = 0;
    private Question[] mQuestions = new Question[]
            {
                    new Question("What is 9*52", "468", "458", "358", "478", 1),
                    new Question("What is 99*99", "10001", "9801", "9601", "8881", 2),
                    new Question("What is 101*101", "10001", "20101", "10101", "10201", 4),
                    new Question("Which mathematician formulated the Incompleteness theorem", "Leonard Euler", "Kurt Godel", "Carl Gauss", "Sir Maxim Yodeller", 2),
                    new Question("If f(x) = 7x+1-5^2, what is f(2) ", "-20", "0", "-10", "-25", 3),
                    new Question("How many prime numbers are divisible by 3", "1", "0", "2", "3", 1),
                    new Question("What is sin(cos(90))", "0", "1", "-1", "-0.5", 1),
            };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Button viewers
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //Find viewById Button initializing
        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        option3 = findViewById(R.id.option3);
        option4 = findViewById(R.id.option4);
        //Find viewById Button initializing
        questionbar = findViewById(R.id.Qbar);
        pointbar = findViewById(R.id.pointBar);
        //Find viewById for TextView

        //Initializing Starting phase
        option1.setText(mQuestions[current_index].O1);
        option2.setText(mQuestions[current_index].O2);
        option3.setText(mQuestions[current_index].O3);
        option4.setText(mQuestions[current_index].O4);
        pointbar.setText("0");
        questionbar.setText(mQuestions[current_index].Q);
        number_of_questions = mQuestions.length;
        //Initializing Starting phase

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mQuestions[current_index].getIs_correct() == 1)
                {
                    total_points+=1;
                    pointbar.setText(String.valueOf(total_points));
                    current_index = (current_index+1)%number_of_questions;
                    option1.setText(mQuestions[current_index].O1);
                    option2.setText(mQuestions[current_index].O2);
                    option3.setText(mQuestions[current_index].O3);
                    option4.setText(mQuestions[current_index].O4);
                    questionbar.setText(mQuestions[current_index].Q);
                }

            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                if(mQuestions[current_index].getIs_correct() == 2){
                    total_points+=1;
                    pointbar.setText(String.valueOf(total_points));
                    current_index = (current_index+1)%number_of_questions;
                    option1.setText(mQuestions[current_index].O1);
                    option2.setText(mQuestions[current_index].O2);
                    option3.setText(mQuestions[current_index].O3);
                    option4.setText(mQuestions[current_index].O4);
                    questionbar.setText(mQuestions[current_index].Q);
                }


            }
            });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mQuestions[current_index].getIs_correct() == 3)
                {
                    total_points+=1;
                    pointbar.setText(String.valueOf(total_points));
                    current_index = (current_index+1)%number_of_questions;
                    option1.setText(mQuestions[current_index].O1);
                    option2.setText(mQuestions[current_index].O2);
                    option3.setText(mQuestions[current_index].O3);
                    option4.setText(mQuestions[current_index].O4);
                    questionbar.setText(mQuestions[current_index].Q);

                }

            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mQuestions[current_index].getIs_correct() == 4)
                {
                    total_points+=1;
                    pointbar.setText(String.valueOf(total_points));
                    current_index = (current_index+1)%number_of_questions;
                    option1.setText(mQuestions[current_index].O1);
                    option2.setText(mQuestions[current_index].O2);
                    option3.setText(mQuestions[current_index].O3);
                    option4.setText(mQuestions[current_index].O4);
                    questionbar.setText(mQuestions[current_index].Q);

                }

            }
        });


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "new ViReplace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
