package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public final class gfb {
    public final Context a;

    public gfb(Context context) {
        this.a = context;
    }

    public static u68 c(String str) {
        Object objNewInstance;
        try {
            Class<?> cls = Class.forName(str);
            try {
                objNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e2) {
                d(cls, e2);
                objNewInstance = null;
            } catch (InstantiationException e3) {
                d(cls, e3);
                objNewInstance = null;
            } catch (NoSuchMethodException e4) {
                d(cls, e4);
                objNewInstance = null;
            } catch (InvocationTargetException e5) {
                d(cls, e5);
                objNewInstance = null;
            }
            if (objNewInstance instanceof u68) {
                return (u68) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    public static void d(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    @Nullable
    public final ApplicationInfo a() throws PackageManager.NameNotFoundException {
        return this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128);
    }

    public List<u68> b() {
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoA = a();
            if (applicationInfoA != null && applicationInfoA.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfoA.metaData);
                }
                for (String str : applicationInfoA.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfoA.metaData.get(str))) {
                        arrayList.add(c(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
                return arrayList;
            }
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e2) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e2);
            }
        }
    }
}
