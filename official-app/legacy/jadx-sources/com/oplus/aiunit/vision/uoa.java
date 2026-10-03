package com.oplus.aiunit.vision;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes15.dex */
public class uoa {
    public static void a(View view) {
        if (view != null) {
            view.clearFocus();
            InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
            if (inputMethodManager.isActive()) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    public static void b(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            view.requestFocus();
            inputMethodManager.showSoftInput(view, 2);
        }
    }
}
