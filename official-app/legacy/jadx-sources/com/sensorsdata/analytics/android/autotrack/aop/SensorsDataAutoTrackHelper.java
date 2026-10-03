package com.sensorsdata.analytics.android.autotrack.aop;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ExpandableListView;
import android.widget.RadioGroup;
import com.sensorsdata.analytics.android.autotrack.core.autotrack.AppClickTrackImpl;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.SensorsDataAPI;
import com.sensorsdata.analytics.android.sdk.util.ThreadUtils;
import org.json.JSONException;

/* JADX INFO: loaded from: classes10.dex */
public class SensorsDataAutoTrackHelper {
    private static final String TAG = "SA.SensorsDataAutoTrackHelper";

    public static void track(String str, String str2) {
        AppClickTrackImpl.track(SensorsDataAPI.sharedInstance(), str, str2);
    }

    public static void trackDialog(DialogInterface dialogInterface, int i) {
        AppClickTrackImpl.trackDialog(SensorsDataAPI.sharedInstance(), dialogInterface, i);
    }

    public static void trackDrawerClosed(View view) {
        AppClickTrackImpl.trackDrawerClosed(SensorsDataAPI.sharedInstance(), view);
    }

    public static void trackDrawerOpened(View view) {
        AppClickTrackImpl.trackDrawerOpened(SensorsDataAPI.sharedInstance(), view);
    }

    public static void trackExpandableListViewOnChildClick(ExpandableListView expandableListView, View view, int i, int i2) {
        AppClickTrackImpl.trackExpandableListViewOnChildClick(SensorsDataAPI.sharedInstance(), expandableListView, view, i, i2);
    }

    public static void trackExpandableListViewOnGroupClick(ExpandableListView expandableListView, View view, int i) {
        AppClickTrackImpl.trackExpandableListViewOnGroupClick(SensorsDataAPI.sharedInstance(), expandableListView, view, i);
    }

    public static void trackListView(AdapterView<?> adapterView, View view, int i) {
        AppClickTrackImpl.trackListView(SensorsDataAPI.sharedInstance(), adapterView, view, i);
    }

    public static void trackMenuItem(MenuItem menuItem) {
        trackMenuItem(null, menuItem);
    }

    public static void trackRN(Object obj, int i, int i2, boolean z) {
    }

    public static void trackRadioGroup(RadioGroup radioGroup, int i) {
        AppClickTrackImpl.trackRadioGroup(SensorsDataAPI.sharedInstance(), radioGroup, i);
    }

    public static void trackTabHost(final String str) {
        try {
            ThreadUtils.getSinglePool().execute(new Runnable() { // from class: com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    AppClickTrackImpl.trackTabHost(SensorsDataAPI.sharedInstance(), str);
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void trackTabLayoutSelected(Object obj, Object obj2) {
        AppClickTrackImpl.trackTabLayoutSelected(SensorsDataAPI.sharedInstance(), obj, obj2);
    }

    public static void trackViewOnClick(View view) {
        if (view == null) {
            return;
        }
        trackViewOnClick(view, view.isPressed());
    }

    public static void trackMenuItem(final Object obj, final MenuItem menuItem) {
        try {
            ThreadUtils.getSinglePool().execute(new Runnable() { // from class: com.sensorsdata.analytics.android.autotrack.aop.SensorsDataAutoTrackHelper.2
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    AppClickTrackImpl.trackMenuItem(SensorsDataAPI.sharedInstance(), obj, menuItem);
                }
            });
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
    }

    public static void trackViewOnClick(View view, boolean z) {
        AppClickTrackImpl.trackViewOnClick(SensorsDataAPI.sharedInstance(), view, z);
    }
}
