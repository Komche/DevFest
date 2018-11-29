package com.akoy.komche.devfest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnGo;
    private EditText myName;
    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo = (Button)findViewById(R.id.btnGo);
        myName = (EditText)findViewById(R.id.editTextName);
        alertDialog = new AlertDialog.Builder(MainActivity.this).create();

        btnGo.setOnClickListener(go);

    }

    View.OnClickListener go = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String name;
            name = myName.getText().toString();

            alertDialog.setTitle("DevFest 2018");
            alertDialog.setMessage("Bonjour "+name+" vous allez bien j'espère !");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();

        }
    };

}
