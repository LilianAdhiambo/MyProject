package com.example.MyProject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.util.ArrayList;

/**
 * Created by lilian on 8/20/14.
 */
public class WelcomeScreen extends Activity {

    //declaring variables
    Spinner spinner1;
    Button button;
    EditText edittext;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcomescreen);

        ArrayList<String> list=new ArrayList<String>();
        list.add("America");
        list.add("Tanzania");
        list.add("Uganda");
        list.add("Brazil");
        list.add("South Africa");
        list.add("Lesotho");
        list.add("Eritrea");
        list.add("Australia");
        list.add("Congo");
        list.add("Cameroon");
        list.add("Germany");
        list.add("Chile");
        list.add("Spain");
        list.add("Nigeria");
        list.add("Algeria");
        list.add("Kenya");
        list.add("Somalia");
        list.add("Dubai");
        list.add("Zambia");
        list.add("Ghana");

        ArrayAdapter<String> dataAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);




        button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                switch (view.getId()){
                    case R.id.button:
                        Intent i= new Intent(getApplicationContext(),Register.class);
                        startActivity(i);
                }

            }
        });
    }
}