package katex.hourglass.in.katextuts.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import katex.hourglass.in.katextuts.R;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialViews();
    }

    private void setInitialViews() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Katex MathView Demo");


    }

    public void recyclerViewClick(View view) {
        Log.d(TAG,"Using Mathview in Recyclerview Clicked");
        Intent intent = new Intent(getApplicationContext(),MathViewListActivity.class);
        startActivity(intent);
    }

    public void layoutViewClick(View view) {
        Log.d(TAG,"Using MathView in Layout Clicked");
        Intent intent = new Intent(getApplicationContext(),MathviewInLayoutActivity.class);
        startActivity(intent);
    }

    public void addingAtRuntime(View view) {
        Log.d(TAG,"Adding Mathview at runtime Clicked");
        Intent intent = new Intent(getApplicationContext(),MathViewAdditionAtRuntime.class);
        startActivity(intent);
    }


}