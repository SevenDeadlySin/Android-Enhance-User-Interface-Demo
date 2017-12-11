package com.example.raksa.alertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //View
    Button buttonClickMe;
    ImageView imageViewEmotion;

    AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClickMe = findViewById(R.id.button);
        imageViewEmotion = findViewById(R.id.imageView);

        alertDialog = new AlertDialog.Builder(this)
                .setIcon(android.R.drawable.ic_input_get)
                .setTitle("One Question For You !")
                .setMessage("      Do you love me ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        imageViewEmotion.setImageDrawable(getResources().getDrawable(R.drawable.happy));
                        if (imageViewEmotion.getVisibility()==View.INVISIBLE){
                            imageViewEmotion.setVisibility(View.VISIBLE);
                        }
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        imageViewEmotion.setImageDrawable(getResources().getDrawable(R.drawable.sad));
                        if (imageViewEmotion.getVisibility()==View.INVISIBLE){
                            imageViewEmotion.setVisibility(View.VISIBLE);
                        }
                    }
                })
                .create();

        //If the button was clicked..
        buttonClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             alertDialog.show();
            }
        });

    }
}
