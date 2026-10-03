package com.oplus.aiunit.vision;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes18.dex */
public class soa {
    public static void a(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
