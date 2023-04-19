package com.goride.user.fragments;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.goride.user.MainDrawerActivity;
import com.goride.user.utils.AppLog;

/**
 * Created by elluminati on 14-06-2016.
 */
public abstract class BaseFragments extends Fragment implements View.OnClickListener {

    public String TAG = this.getClass().getSimpleName();
    protected MainDrawerActivity drawerActivity;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        drawerActivity = (MainDrawerActivity) getActivity();
    }

    @Override
    public void onDestroy() {
        try {
            super.onDestroy();
        } catch (Exception e) {
            AppLog.handleException("Base Fragment", e);
        }
    }
}
