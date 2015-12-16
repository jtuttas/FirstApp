package de.tuttas.firstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // TODO Auto-generated method stub
        msg("onSaveInstanceState()");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg("onCreate()");
    }

    public void klick(View v) {
        Intent intent = new Intent(this, Main2Activity.class);
        this.startActivity(intent);

    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        msg("onDestroy()");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        msg("onPause()");
        super.onPause();
    }

    @Override
    protected void onRestart() {
        // TODO Auto-generated method stub
        msg("onRestart()");

        super.onRestart();
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        msg("onResume()");
        super.onResume();
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        msg("onStart()");
        super.onStart();
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        msg("onStop()");
        super.onStop();
    }

    private void msg(String msg) {
        // TODO Auto-generated method stub
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
