package edu.uw.tcss450;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.uw.tcss450.databinding.FragmentLoginBinding;
import edu.uw.tcss450.databinding.FragmentSuccessBinding;


public class SuccessFragment extends Fragment {
    private FragmentSuccessBinding binding;
    private static final String TAG = "SuccessFragment";

    public SuccessFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentSuccessBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //Get a reference to the SafeArg object
        SuccessFragmentArgs args = SuccessFragmentArgs.fromBundle(getArguments());

        //Set the text color of the label . NOTE no need to cast
        binding.textColorLabel.setText(args.getEmail());

        /**
         * {@EXIT THE FRAGMENT RIGHT AWAY -> IMPORTANT -> ADAM
         */
//        Intent intent = new Intent(getActivity(), MainActivity.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//        intent.putExtra("LOGOUT", true);
//        startActivity(intent);
//        getActivity().finish();
    }


}
