package edu.uw.tcss450;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import edu.uw.tcss450.databinding.FragmentLoginBinding;
import edu.uw.tcss450.databinding.FragmentRegisterBinding;


public class RegisterFragment extends Fragment {

    private FragmentRegisterBinding binding;

    public RegisterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentRegisterBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
      binding.register2.setOnClickListener(button -> jumpLogin(view));

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding= null;
    }

    public void jumpLogin(View view){
        String str = binding.emailView.getText().toString();

//        if(str.contains("@")){
//            RegisterFragmentDirections.ActionRegisterFragmentToSuccessFragment directions =
//                    RegisterFragmentDirections.actionRegisterFragmentToSuccessFragment(str, "");
//
//            //Use the navigate method to perform the navigation.
//            Navigation.findNavController(getView()).navigate(directions);
//        }
//        else {
//            RegisterFragmentDirections.ActionRegisterFragmentToSuccessFragment directions =
//                    RegisterFragmentDirections.actionRegisterFragmentToSuccessFragment("please type the email correctly with @", "");
//
//            //Use the navigate method to perform the navigation.
//            Navigation.findNavController(getView()).navigate(directions);
//
//        }


//        NavController navController= Navigation.findNavController(view);
//        navController.navigate(R.id.action_registerFragment_to_successFragment(binding.register2.getText().toString()));

        if(!str.contains("@")){
            Toast.makeText(getContext(), "Please type your email correctly with ->  @", Toast.LENGTH_SHORT).show();
        }
        else{
            RegisterFragmentDirections.ActionRegisterFragmentToSuccessFragment directions =
                    RegisterFragmentDirections.actionRegisterFragmentToSuccessFragment(str, "");

            //Use the navigate method to perform the navigation.
            Navigation.findNavController(getView()).navigate(directions);

        }
    }



}
