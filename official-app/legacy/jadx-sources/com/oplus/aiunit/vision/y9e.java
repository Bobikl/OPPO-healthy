package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/y9e;", "Lcom/oplus/aiunit/vision/qb1;", "Landroid/content/Context;", "context", "", "", MapSchema.FIELD_NAME_KEY, LogFieldKey.MESSAGE_KEY, "<init>", "()V", "paysdk_web_release"}, k = 1, mv = {1, 8, 0})
public class y9e extends qb1 {
    @Override // com.oplus.aiunit.vision.qb1
    @NotNull
    public Map<String, String> k(@Nullable Context context) {
        Map<String, String> map = super.k(context);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNullExpressionValue(map, "map");
        linkedHashMap.putAll(map);
        String strA = die.a();
        Intrinsics.checkNotNullExpressionValue(strA, "getCurRegion()");
        linkedHashMap.put("deviceRegion", strA);
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        linkedHashMap.put("brand", BRAND);
        linkedHashMap.put("versionName", m(context));
        String guid = sh5.d(context);
        Intrinsics.checkNotNullExpressionValue(guid, "guid");
        linkedHashMap.put("guid", guid);
        qae.b("PayBasicInfoInterceptor guid:" + guid);
        String ouid = sh5.e(context);
        Intrinsics.checkNotNullExpressionValue(ouid, "ouid");
        linkedHashMap.put("ouid", ouid);
        qae.b("PayBasicInfoInterceptor ouid:" + ouid);
        return linkedHashMap;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    public final String m(Context context) {
        PackageInfo packageInfo;
        String str;
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) == null) {
                    str = null;
                } else {
                    str = packageInfo.versionName;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return "Unknown";
            }
        } else {
            str = null;
        }
        return str == null ? "Unknown" : str;
    }
}
