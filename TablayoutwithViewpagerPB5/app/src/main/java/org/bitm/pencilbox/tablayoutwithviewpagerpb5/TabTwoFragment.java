package org.bitm.pencilbox.tablayoutwithviewpagerpb5;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabTwoFragment extends Fragment {


    public TabTwoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(), "tab 2", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_tab_two, container, false);
    }

}
