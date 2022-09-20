package com.pixeldust.android.customization.picker

import android.app.Application;

import com.android.wallpaper.module.InjectorProvider;

import com.pixeldust.android.customization.module.PixeldustCustomizationInjector;

public class PixeldustCustomizationPickerApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        InjectorProvider.setInjector(PixeldustCustomizationInjector());
    }

}
