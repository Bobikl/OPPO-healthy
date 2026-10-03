package com.heytap.wearable.support.watchface.common.utils;

import android.content.Context;
import com.heytap.wearable.support.watchface.common.log.SdkDebugLog;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes2.dex */
public class ResourcesUtil {
    private static final String TAG = "ResourcesUtil";

    public @interface ResourceType {
        public static final String DIMEN = "dimen";
        public static final String DRAWABLE = "drawable";
        public static final String RAW = "raw";
    }

    public static float[] getDimensListByIntId(Context context, int[] iArr) {
        float[] fArr = new float[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            fArr[i] = getDimension(context, iArr[i]);
        }
        return fArr;
    }

    public static int[] getDimensListByJsonArrayId(Context context, JSONArray jSONArray) {
        if (jSONArray == null) {
            SdkDebugLog.d(TAG, "[getDimensListByJsonArrayId] JSONArray is null");
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = Math.round(getDimension(context, jSONArray.optString(i)));
        }
        return iArr;
    }

    public static float[] getDimensListByStrId(Context context, String[] strArr) {
        float[] fArr = new float[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            fArr[i] = getDimension(context, strArr[i]);
        }
        return fArr;
    }

    public static float getDimension(Context context, int i) {
        return context.getResources().getDimension(i);
    }

    public static int getIdentifier(Context context, String str, String str2) {
        try {
            return context.getResources().getIdentifier(str, str2, context.getPackageName());
        } catch (Exception unused) {
            SdkDebugLog.d(TAG, "[getIdentifier] name is null");
            return -1;
        }
    }

    public static float getDimension(Context context, String str) {
        return context.getResources().getDimension(getIdentifier(context, str, ResourceType.DIMEN));
    }
}
