package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public abstract class pha {

    @SuppressLint({"StaticFieldLeak"})
    public static Context a;

    public static Context a() {
        Context context = a;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Please call `#init(Context)` method to initialize jLatexMath");
    }

    public static InputStream b(String str) {
        try {
            return a().getAssets().open("org/scilab/forge/jlatexmath/" + str);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void c(Context context) {
        a = context.getApplicationContext();
    }

    @NonNull
    public static Typeface d(@NonNull String str) {
        return Typeface.createFromAsset(a().getAssets(), "org/scilab/forge/jlatexmath/" + str);
    }
}
