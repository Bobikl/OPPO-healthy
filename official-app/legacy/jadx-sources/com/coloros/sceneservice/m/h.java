package com.coloros.sceneservice.m;

import android.os.Bundle;
import android.text.TextUtils;
import com.coloros.sceneservice.utils.BundleDeserializer;
import com.coloros.sceneservice.utils.BundleSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes13.dex */
public class h {
    public static final String TAG = "SceneDataUtils";

    public static String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Bundle.class, new BundleSerializer());
            return gsonBuilder.create().toJson(bundle);
        } catch (Throwable th) {
            f.e(TAG, "sceneBundleToStr: throwable = " + th);
            return null;
        }
    }

    public static String b(Object obj) {
        if (obj != null) {
            try {
                return new Gson().toJson(obj);
            } catch (Throwable th) {
                f.e(TAG, "beanToJsonStr error:" + th);
            }
        }
        return null;
    }

    public static Bundle m(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.registerTypeAdapter(Bundle.class, new BundleDeserializer());
            return (Bundle) gsonBuilder.create().fromJson(str, Bundle.class);
        } catch (Throwable th) {
            f.e(TAG, "setBundleFormJson, json=" + str + ", error=" + th);
            return null;
        }
    }

    public static Object a(String str, Type type) {
        try {
            return new Gson().fromJson(str, type);
        } catch (Throwable th) {
            f.e(TAG, "jsonStrToBean error:" + th);
            return null;
        }
    }
}
