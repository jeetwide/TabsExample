package com.example.jeetendraachtani.tabsexample;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.Toast;

import com.codevscolor.materialpreference.activity.MaterialPreferenceActivity;
import com.codevscolor.materialpreference.callback.MaterialPreferenceCallback;
import com.codevscolor.materialpreference.util.MaterialPrefUtil;

public class ActSettings extends MaterialPreferenceActivity implements MaterialPreferenceCallback {

    @Override
    public void init(@Nullable Bundle savedInstanceState) {
        //register this class as listener for preference change
        setPreferenceChangedListener(this);

        //use dark theme or not . Default is light theme
        useDarkTheme(true);

        //set toolbar title
        setToolbarTitle("My Toolbar");

        //set primary color
        //setPrimaryColor(MaterialPrefUtil.COLOR_BLUE_GREY);
        setPrimaryColor(MaterialPrefUtil.COLOR_TEAL);

        //default secondary color for tinting widgets, if no secondary color is used yet
        setDefaultSecondaryColor(this, MaterialPrefUtil.COLOR_BLUE);

        //set application package name and xml resource name of preference
        setAppPackageName("com.example.jeetendraachtani.tabsexample");
        setXmlResourceName("settingspreference");

        //optional
        //if you are using color picker, set the key used in the xml preference
        setColorPickerKey("secondary_color_position");

    }


    /**
     * callback for preference changes
     *
     * @param sharedPreferences
     * @param name
     */
    @Override
    public void onPreferenceSettingsChanged(SharedPreferences sharedPreferences, String name) {
        Toast.makeText(this, "preference with key " + name + " changed", Toast.LENGTH_LONG).show();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

}