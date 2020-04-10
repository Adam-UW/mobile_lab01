package edu.uw.tcss450.uwnetid;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.uwnetid.databinding.FragmentFirstBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {
    private FragmentFirstBinding binding;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding =FragmentFirstBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //add this Fragment Object as the OnClickListener to the red button
        binding.buttonRed.setOnClickListener(this);

        //Use a Lambda expression to add the OnClickListener
        binding.buttonGreen.setOnClickListener(button-> processColor(Color.GREEN) );

        //Use a method reference to add the OnClickListener
        binding.buttonBlue.setOnClickListener(this::handleBlue);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding=null;
    }


    @Override
    public void onClick(View v) {
        if(v==binding.buttonRed){
            processColor(Color.RED);
        }
    }

    public void processColor(int color){
        Log.d("ACTIVITY", "Red: " + Color.red(color)+
                "Green: "+ Color.green(color)+
                "Blue: "+ Color.blue(color));
    }


    public void handleBlue(View v){
        if(v==binding.buttonBlue){
            processColor(Color.BLUE);
        }

    }
}
