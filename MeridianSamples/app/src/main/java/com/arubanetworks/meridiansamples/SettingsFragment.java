package com.arubanetworks.meridiansamples;

import android.os.Bundle;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;

import com.arubanetworks.meridian.Meridian;

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        // Load the preferences from an XML resource
        setPreferencesFromResource(R.xml.prefs, rootKey);
        setVersionName();
    }

    private void setVersionName() {
        Preference versionPref = findPreference("pref_version");
        versionPref.setSummary(Meridian.getShared().getSDKVersion() + " (" + Meridian.getShared().getSDKVersionCode() + ")");
    }

}
