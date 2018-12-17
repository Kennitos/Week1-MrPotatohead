package com.example.kennet.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    /*Crate bundle when onSaveInstance is called. */
    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        Integer viewarms = findViewById(R.id.arms).getVisibility();
        Integer vieweyes = findViewById(R.id.eyes).getVisibility();
        Integer viewhat = findViewById(R.id.hat).getVisibility();
        Integer viewears = findViewById(R.id.ears).getVisibility();
        Integer viewglasses = findViewById(R.id.glasses).getVisibility();

        Integer viewshoes = findViewById(R.id.shoes).getVisibility();
        Integer viewmustache = findViewById(R.id.mustache).getVisibility();
        Integer viewnose = findViewById(R.id.nose).getVisibility();
        Integer viewmouth = findViewById(R.id.mouth).getVisibility();
        Integer vieweyebrows = findViewById(R.id.eyebrows).getVisibility();

        outState.putInt("armsvisibility", viewarms);
        outState.putInt("eyesvisibility", vieweyes);
        outState.putInt("hatvisibility", viewhat);
        outState.putInt("earsvisibility", viewears);
        outState.putInt("glassesvisibility", viewglasses);

        outState.putInt("shoesvisibility", viewshoes);
        outState.putInt("mustachevisibility", viewmustache);
        outState.putInt("nosevisibility", viewnose);
        outState.putInt("mouthvisibility", viewmouth);
        outState.putInt("eyebrowsvisibility", vieweyebrows);


}

    /*And do something with the bundle when the state is restored */
    @Override
    public void onRestoreInstanceState(Bundle inState){
        super.onRestoreInstanceState(inState);

        Integer armsRestored = inState.getInt("armsvisibility");
        ImageView imgarms = findViewById(R.id.arms);
        imgarms.setVisibility(armsRestored);

        Integer eyesRestored = inState.getInt("eyesvisibility");
        ImageView imgeyes = findViewById(R.id.eyes);
        imgeyes.setVisibility(eyesRestored);

        Integer hatRestored = inState.getInt("hatvisibility");
        ImageView imghat = findViewById(R.id.hat);
        imghat.setVisibility(hatRestored);

        Integer glassesRestored = inState.getInt("glassesvisibility");
        ImageView imgglasses = findViewById(R.id.glasses);
        imgglasses.setVisibility(glassesRestored);

        Integer shoesRestored = inState.getInt("shoesvisibility");
        ImageView imgshoes = findViewById(R.id.shoes);
        imgshoes.setVisibility(shoesRestored);


        Integer mustacheRestored = inState.getInt("mustachevisibility");
        ImageView imgmustache = findViewById(R.id.mustache);
        imgmustache.setVisibility(mustacheRestored);

        Integer earsRestored = inState.getInt("earsvisibility");
        ImageView imgears = findViewById(R.id.ears);
        imgears.setVisibility(earsRestored);

        Integer mouthRestored = inState.getInt("mouthvisibility");
        ImageView imgmouth = findViewById(R.id.mouth);
        imgmouth.setVisibility(mouthRestored);

        Integer eyebrowsRestored = inState.getInt("eyebrowsvisibility");
        ImageView imgeyebrows = findViewById(R.id.eyebrows);
        imgeyebrows.setVisibility(eyebrowsRestored);

        Integer noseRestored = inState.getInt("nosevisibility");
        ImageView imgnose = findViewById(R.id.nose);
        imgnose.setVisibility(noseRestored);
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

    public void boxChecked(View view) {
        boolean checked = ((CheckBox)view).isChecked();
        ImageView imgarms = (ImageView)findViewById(R.id.arms);
        ImageView imgeyebrows = (ImageView)findViewById(R.id.eyebrows);
        ImageView imgnose = (ImageView)findViewById(R.id.nose);
        ImageView imgeyes = (ImageView)findViewById(R.id.eyes);
        ImageView imgears = (ImageView)findViewById(R.id.ears);
        ImageView imgglasses = (ImageView)findViewById(R.id.glasses);
        ImageView imghat = (ImageView)findViewById(R.id.hat);

        ImageView imgmouth = (ImageView)findViewById(R.id.mouth);
        ImageView imgmustache = (ImageView)findViewById(R.id.mustache);
        ImageView imgshoes = (ImageView)findViewById(R.id.shoes);
        switch (view.getId()) {
            case R.id.checkarms:
                if(checked) {
                    imgarms .setVisibility(View.VISIBLE);
                }
                else {
                    imgarms .setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkeyebrows:
                if(checked) {
                    imgeyebrows .setVisibility(View.VISIBLE);
                }
                else {
                    imgeyebrows .setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checknose:
                if(checked) {
                    imgnose .setVisibility(View.VISIBLE);
                }
                else {
                    imgnose .setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkeyes:
                if(checked) {
                    imgeyes .setVisibility(View.VISIBLE);
                }
                else {
                    imgeyes .setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkears:
                if(checked) {
                    imgears .setVisibility(View.VISIBLE);
                }
                else {
                    imgears .setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkglasses:
                if(checked) {
                    imgglasses .setVisibility(View.VISIBLE);
                }
                else {
                    imgglasses .setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkhat:
                if(checked) {
                    imghat .setVisibility(View.VISIBLE);
                }
                else {
                    imghat .setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkmouth:
                if(checked) {
                    imgmouth .setVisibility(View.VISIBLE);
                }
                else {
                    imgmouth .setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkmustache:
                if(checked) {
                    imgmustache.setVisibility(View.VISIBLE);
                }
                else {
                    imgmustache .setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkshoes:
                if(checked) {
                    imgshoes .setVisibility(View.VISIBLE);
                }
                else {
                    imgshoes .setVisibility(View.INVISIBLE);
                }
                break;
        }
    }

}
