package it.polito.ami.simplecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView edit_number1;
    TextView edit_number2;

    Button button_plus;
    Button button_minus;
    Button button_times;
    Button button_division;

    LinearLayout layout_result;
    TextView text_result;

    Button button_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get the references to the layout widgets
        edit_number1 = findViewById(R.id.edit_number1);
        edit_number2 = findViewById(R.id.edit_number2);
        button_plus = findViewById(R.id.button_plus);
        button_minus = findViewById(R.id.button_minus);
        button_times = findViewById(R.id.button_times);
        button_division = findViewById(R.id.button_division);
        layout_result = findViewById(R.id.layout_result);
        text_result = findViewById(R.id.text_result);
        button_info = findViewById(R.id.button_info);

        //assign the callback methods
        button_plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //get the user input
                int number1 = Integer.parseInt(edit_number1.getText().toString());
                int number2 = Integer.parseInt(edit_number2.getText().toString());
                //calculate the result
                int result = number1 + number2;
                //insert the result in the right text field
                text_result.setText(Integer.toString(result));
                //make the result text field visible
                layout_result.setVisibility(View.VISIBLE);
            }
        });

        button_minus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //get the user input
                int number1 = Integer.parseInt(edit_number1.getText().toString());
                int number2 = Integer.parseInt(edit_number2.getText().toString());
                //calculate the result
                int result = number1 - number2;
                //insert the result in the right text field
                text_result.setText(Integer.toString(result));
                //make the result text field visible
                layout_result.setVisibility(View.VISIBLE);
            }
        });

        button_times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the user input
                int number1 = Integer.parseInt(edit_number1.getText().toString());
                int number2 = Integer.parseInt(edit_number2.getText().toString());
                //calculate the result
                int result = number1 * number2;
                //insert the result in the right text field
                text_result.setText(Integer.toString(result));
                //make the result text field visible
                layout_result.setVisibility(View.VISIBLE);
            }
        });

        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //get the user input
                int number1 = Integer.parseInt(edit_number1.getText().toString());
                int number2 = Integer.parseInt(edit_number2.getText().toString());
                //check the user input
                if(number2 == 0){
                    Toast toast = Toast.makeText(getApplicationContext(),"Wrong operation: division by 0", Toast.LENGTH_LONG);
                    toast.show();
                }
                else {
                    //calculate the result
                    int result = number1 / number2;
                    //insert the result in the right text field
                    text_result.setText(Integer.toString(result));
                    //make the result text field visible
                    layout_result.setVisibility(View.VISIBLE);
                }
            }
        });

        button_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openInfo = new Intent(getApplicationContext(), InfoActivity.class);
                startActivity(openInfo);
            }
        });
    }


}
