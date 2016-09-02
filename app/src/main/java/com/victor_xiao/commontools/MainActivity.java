package com.victor_xiao.commontools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnOne = (Button) findViewById(R.id.button);
        final EditText txtResult = (EditText) findViewById(R.id.edittext);
        btnOne.setOnClickListener(new View.OnClickListener() {
            int i = 0;

            @Override
            public void onClick(View v) {
                i++;
                txtResult.setText("Change " + i);
            }
        });
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        TextView tv=(TextView)findViewById(R.id.textview_1);

        switch(view.getId()) {
            case R.id.checkbox_1:
                if(checked){
                    tv.setText("You Select CheckBox 1");
                }else{
                    Toast.makeText(this,"Unselect CheckBox 1", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkbox_2:
                if(checked){
                    tv.setText("You Select CheckBox 2");
                }else{
                    Toast.makeText(this,"Unselect CheckBox 2", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkbox_3:
                if(checked){
                    tv.setText("You Select CheckBox 3");
                }else{
                    Toast.makeText(this,"Unselect CheckBox 3", Toast.LENGTH_LONG).show();
                }

        }
    }


    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        final TextView tv = (TextView) findViewById(R.id.textview_1);
        switch (view.getId()) {
            case R.id.radiobutton_1:
                if (checked)
                    tv.setText("You Select RadioButton 1");
                break;
            case R.id.radiobutton_2:
                if (checked)
                    tv.setText("You Select RadioButton 2");
                break;
            case R.id.radiobutton_3:
                if (checked)
                    tv.setText("You Select RadioButton 3");
                break;
        }
    }


}
