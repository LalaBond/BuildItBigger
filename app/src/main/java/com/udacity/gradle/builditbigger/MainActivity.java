package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.example.jokeslib.JokesClass;
import com.example.jokeslibrary.JokesALActivity;


public class MainActivity extends AppCompatActivity {

    private JokesClass jokes = new JokesClass();

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
        /*
        Toast.makeText(this, jokes.getJoke(), Toast.LENGTH_SHORT).show();

        String joke = jokes.getJoke();
        Intent intent = new Intent(this, JokesALActivity.class);

        intent.putExtra("joke", joke);

        startActivity(intent);
        */

        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, "why 6 hates 7? Because 7 8 9"));


    }


}
