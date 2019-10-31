package com.gcs.testexpresso.fragments;

import android.view.View;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.gcs.testexpresso.R;

import butterknife.BindView;

public class StepDetailsFragment extends Fragment implements View.OnClickListener {

    @BindView(R.id.textView_description)
    private TextView description;

}
