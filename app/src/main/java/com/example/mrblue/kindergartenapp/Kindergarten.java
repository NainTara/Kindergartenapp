package com.example.mrblue.kindergartenapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Kindergarten extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kindergarten);
    }

    public void OnButtonClick(View v)
    {
        if( v.getId() == R.id.sPoem)
        {
                Intent i= new Intent(Kindergarten.this , poem.class);
                startActivity(i);

        }
        if(v.getId() == R.id.sStory)
        {
            Intent i= new Intent(Kindergarten.this , story.class);
            startActivity(i);
        }
        if(v.getId() == R.id.sManner)
        {
            Intent i= new Intent(Kindergarten.this , manner.class);
            startActivity(i);
        }
    }
public void checking()
{//checked}
}
