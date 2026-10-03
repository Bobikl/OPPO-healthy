package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public class d94 {

    @SuppressLint({"StaticFieldLeak"})
    public static Context a;

    @SuppressLint({"PrivateApi"})
    public static Application a() {
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Context b() {
        if (a == null) {
            a = a();
        }
        Objects.requireNonNull(a, "You must init WebPro with context firstly!");
        return a;
    }

    @UiThread
    public static void c(@NonNull Context context) {
        if (a == null) {
            if (context instanceof Application) {
                a = context;
            } else {
                a = context.getApplicationContext();
            }
        }
    }
}
