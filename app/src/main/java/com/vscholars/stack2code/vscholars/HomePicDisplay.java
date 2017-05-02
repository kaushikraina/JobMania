package com.vscholars.stack2code.vscholars;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ViewFlipper;

/**
 * Created by vineet_jain on 24/3/17.
 */

public class HomePicDisplay extends Fragment{
    ViewFlipper viewFlipper;
    ListView allUploadedJobs;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v1 = inflater.inflate(R.layout.home, container, false);
        viewFlipper = (ViewFlipper) v1.findViewById(R.id.flipper);
        return v1;
    }

}
