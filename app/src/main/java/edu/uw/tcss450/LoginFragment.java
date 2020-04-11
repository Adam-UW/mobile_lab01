package edu.uw.tcss450;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavAction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import edu.uw.tcss450.databinding.FragmentLoginBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment implements View.OnClickListener {

    private FragmentLoginBinding binding;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       binding= FragmentLoginBinding.inflate(inflater, container, false);
       View view = binding.getRoot();
       return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.register.setOnClickListener(this);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding= null;
    }

    public void jumpLogin(View view){

        NavController navController= Navigation.findNavController(view);
        navController.navigate(R.id.action_loginFragment_to_registerFragment);
    }




    @Override
    public void onClick(View v) {
        if(v==binding.register)
            jumpLogin(v);

    }

}
