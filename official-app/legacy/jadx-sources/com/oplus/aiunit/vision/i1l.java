package com.oplus.aiunit.vision;

import android.view.View;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/* JADX INFO: loaded from: classes19.dex */
public class i1l {
    public static int a;

    public static void c(AppCompatActivity appCompatActivity, boolean z) {
        View decorView = appCompatActivity.getWindow().getDecorView();
        if (z) {
            a = decorView.getSystemUiVisibility();
            appCompatActivity.getWindow().getDecorView().setSystemUiVisibility(5894);
        } else {
            int i = a;
            if (i == 0) {
                i = 256;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    public static void d(String str, JsonParser jsonParser, WebView webView) {
        final AppCompatActivity appCompatActivity;
        final boolean asBoolean = ((JsonObject) jsonParser.parse(str)).get("isFull").getAsBoolean();
        if (webView == null || (appCompatActivity = (AppCompatActivity) webView.getContext()) == null) {
            return;
        }
        appCompatActivity.runOnUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.g1l
            @Override // java.lang.Runnable
            public final void run() {
                i1l.c(appCompatActivity, asBoolean);
            }
        });
    }
}
