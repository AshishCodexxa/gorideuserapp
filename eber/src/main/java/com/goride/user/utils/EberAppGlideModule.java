package com.goride.user.utils;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.module.AppGlideModule;

import org.jetbrains.annotations.NotNull;

@GlideModule
public class EberAppGlideModule extends AppGlideModule {
    @Override
    public void applyOptions(@NonNull @NotNull Context context, @NonNull @NotNull GlideBuilder builder) {
        builder.setLogLevel(Log.ERROR);
        super.applyOptions(context, builder);
    }
}