package katex.hourglass.in.katextuts.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.LinearLayout;

import katex.hourglass.in.katextuts.Helpers;
import katex.hourglass.in.katextuts.R;
import katex.hourglass.in.mathlib.MathView;

/**
 * Created by lingaraj on 4/4/17.
 */

public class MathViewAdditionAtRuntime extends AppCompatActivity {

    private String TAG = "MATHVIEWRUNTIME";
    private LinearLayout parent_layout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runtime_layout);
        setInitialViews();
        addMathView();
    }

    private void addMathView() {
        MathView mathView = new MathView(getApplicationContext());
        mathView.setClickable(true);
        mathView.setTextSize(14);
        mathView.setTextColor(ContextCompat.getColor(getApplicationContext(),android.R.color.white));
        mathView.setDisplayText(getResources().getString(R.string.runtime_formula));
       // mathView.setViewBackgroundColor(ContextCompat.getColor(getApplicationContext(),R.color.Color5));
        mathView.setViewBackgroundColor(Helpers.getRandomColor(getApplicationContext(),2));
        parent_layout.addView(mathView);
        Log.d(TAG,"MathView Added to parent layout at runtime");
    }

    private void setInitialViews() {
        parent_layout = (LinearLayout) findViewById(R.id.linear_parent_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Runtime Mathview Demo");
        Log.d(TAG,"Views Intitialized");

    }
}
