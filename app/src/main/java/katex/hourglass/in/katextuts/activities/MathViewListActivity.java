package katex.hourglass.in.katextuts.activities;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

import katex.hourglass.in.katextuts.R;

/**
 * Created by lingaraj on 4/4/17.
 */

public class MathViewListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathview_list);
    }

    public class CardClick implements View.OnClickListener
    {

        @Override
        public void onClick(View view) {

        }
    }
}