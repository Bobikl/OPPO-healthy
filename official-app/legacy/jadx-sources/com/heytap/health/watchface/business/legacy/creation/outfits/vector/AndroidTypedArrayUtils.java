package com.heytap.health.watchface.business.legacy.creation.outfits.vector;

import android.content.res.TypedArray;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.ltl;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes19.dex */
@Keep
class AndroidTypedArrayUtils {
    private static final int DEFAULT_VALUE = -1;
    private static final String NAMESPACE = "http://schemas.android.com/apk/res/android";
    private static final String TAG = "AndroidTypedArrayUtils";

    public static boolean getNamedBoolean(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        try {
            return !hasAttribute(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
        } catch (Exception unused) {
            ltl.b(TAG, "AndroidTypedArrayUtils getNamedBoolean --> error");
            return z;
        }
    }

    public static int getNamedColor(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        try {
            return !hasAttribute(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
        } catch (Exception unused) {
            ltl.b(TAG, "AndroidTypedArrayUtils getNamedColor --> error");
            return i2;
        }
    }

    public static float getNamedFloat(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        try {
            return !hasAttribute(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
        } catch (Exception unused) {
            ltl.b(TAG, "AndroidTypedArrayUtils getNamedFloat --> error");
            return f;
        }
    }

    public static int getNamedInt(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        try {
            if (hasAttribute(xmlPullParser, str)) {
                return typedArray.getInt(i, -1);
            }
            return -1;
        } catch (Exception unused) {
            ltl.b(TAG, "AndroidTypedArrayUtils getNamedInt --> error");
            return -1;
        }
    }

    public static boolean hasAttribute(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue(NAMESPACE, str) != null;
    }
}
