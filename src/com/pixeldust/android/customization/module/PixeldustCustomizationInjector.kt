package com.pixeldust.android.customization.module

import android.content.Context

import androidx.fragment.app.Fragment

import com.android.wallpaper.model.WallpaperInfo
import com.android.wallpaper.module.CustomizationSections
import com.android.wallpaper.picker.MonetPreviewFragment

import com.android.customization.module.DefaultCustomizationInjector

public class PixeldustCustomizationInjector : DefaultCustomizationInjector() {

    private var customizationSections: CustomizationSections? = null

    override fun getPreviewFragment(
            context: Context,
            wallpaperInfo: WallpaperInfo,
            mode: Int,
            viewAsHome: Boolean,
            viewFullScreen: Boolean,
            testingModeEnabled: Boolean): Fragment {
        return MonetPreviewFragment.newInstance(wallpaperInfo, mode, viewAsHome, viewFullScreen, testingModeEnabled);
    }

    override fun getCustomizationSections(): CustomizationSections {
        if (customizationSections == null) {
            customizationSections = PixeldustCustomizationSections()
        }
        return customizationSections!!
    }
}
