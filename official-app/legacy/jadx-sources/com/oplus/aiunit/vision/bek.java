package com.oplus.aiunit.vision;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
import java.util.Hashtable;
import java.util.Locale;

/* JADX INFO: loaded from: classes18.dex */
public class bek {
    public static final String TYPE_DEFAULT = "FindType-Bold1016.ttf";
    public static final Hashtable<String, Typeface> a = new Hashtable<>();

    public static Typeface a(Context context, String str) {
        Typeface typeface;
        Hashtable<String, Typeface> hashtable = a;
        synchronized (hashtable) {
            if (!hashtable.containsKey(str)) {
                try {
                    hashtable.put(str, Typeface.createFromAsset(context.getAssets(), String.format("fonts/%s", str)));
                } catch (Exception e2) {
                    t6b.i("Typefaces", e2.getMessage());
                    return null;
                }
            }
            typeface = hashtable.get(str);
        }
        return typeface;
    }

    public static Locale b() {
        return Locale.CHINA;
    }

    public static void c(TextView textView, String str) {
        Typeface typefaceA;
        if (textView == null || (typefaceA = a(textView.getContext(), str)) == null) {
            return;
        }
        textView.setTypeface(typefaceA);
    }
}
