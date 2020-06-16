package com.mbinfo.huge.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mbinfo.huge.R;
import com.mbinfo.huge.ui.start.HomeActivity;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class TabFragment extends Fragment {
    private static HomeActivity mActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = (HomeActivity) getActivity();
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rv = inflater.inflate(R.layout.layout_recylerview_list, container, false);
       // setupRecyclerView(rv);
        return rv;
    }
}
