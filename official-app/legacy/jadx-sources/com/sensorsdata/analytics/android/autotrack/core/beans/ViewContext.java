package com.sensorsdata.analytics.android.autotrack.core.beans;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public class ViewContext {
    public Activity activity;
    public Object fragment;
    public View view;

    public ViewContext(Activity activity, Object obj) {
        this.activity = activity;
        this.fragment = obj;
    }

    public ViewContext(View view) {
        this.view = view;
    }

    public ViewContext(Activity activity, Object obj, View view) {
        this.activity = activity;
        this.fragment = obj;
        this.view = view;
    }
}
