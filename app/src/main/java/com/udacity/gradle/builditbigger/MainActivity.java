package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.mbm_soft.androidjokeslibrary.JokeActivity;


public class MainActivity extends AppCompatActivity implements TaskResult {

    public static final String JOKE_ID = "joke_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void tellJoke(View view) {
        //step number 1:
        // Joke joke = new Joke();
        // Toast.makeText(this, joke.getRandomJoke(), Toast.LENGTH_LONG).show();

        //step number 2:
        //Joke joke = new Joke();
        //Intent myIntent = new Intent(this, JokeActivity.class);
        //myIntent.putExtra("JOKE_ID",joke.getRandomJoke());
        //startActivity(myIntent);

        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(this);
        endpointsAsyncTask.execute();
    }


    @Override
    public void onTaskCompleted(String result) {
        Intent myIntent = new Intent(this, JokeActivity.class);
        myIntent.putExtra(JOKE_ID, result);
        startActivity(myIntent);
    }
}
