package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes13.dex */
public final class ef0 {
    public static final ConcurrentMap<String, ona> a = new ConcurrentHashMap();

    @Nullable
    public static PackageInfo a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e2);
            return null;
        }
    }

    @NonNull
    public static String b(@Nullable PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @NonNull
    public static ona c(@NonNull Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, ona> concurrentMap = a;
        ona onaVar = concurrentMap.get(packageName);
        if (onaVar != null) {
            return onaVar;
        }
        ona onaVarD = d(context);
        ona onaVarPutIfAbsent = concurrentMap.putIfAbsent(packageName, onaVarD);
        return onaVarPutIfAbsent == null ? onaVarD : onaVarPutIfAbsent;
    }

    @NonNull
    public static ona d(@NonNull Context context) {
        return new ebd(b(a(context)));
    }
}
