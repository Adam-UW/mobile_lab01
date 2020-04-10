package edu.uw.tcss450.uwnetid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.uw.tcss450.uwnetid.databinding.FragmentColorBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {
    private FragmentColorBinding binding;

    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentColorBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        return view;
    }


    public void updateContent(int color){
        TextView tv = getActivity().findViewById(R.id.text_color_label);
        tv.setTextColor(color);

    }
}
