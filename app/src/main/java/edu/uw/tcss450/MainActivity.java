package edu.uw.tcss450;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;

import edu.uw.tcss450.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * If the one in Success fragment called, to exit the fragment right away
         */
//        if(getIntent().getBooleanExtra("LOGOUT", false)){
//            finish();
//        }
    }

    @Override
    public void onBackPressed() {
//        if(getIntent().getBooleanExtra("LOGOUT", false)){
//            finish();
//        }
        super.onBackPressed();
        //finish();
    }
}
