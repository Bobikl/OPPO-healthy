package com.oplus.aiunit.vision;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.ChecksSdkIntAtLeast;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0002J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004*\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0010\u001a\u00020\u000fH\u0003¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/te3;", "", "Landroid/content/Context;", "context", "", "Lcom/oplus/aiunit/vision/qqg;", "infoList", "Landroid/content/Intent;", "d", "", "packageName", "a", UTraceSQLiteHelperKt.COL_INFO, "b", "c", "", MapSchema.FIELD_NAME_ENTRY, "<init>", "()V", "groupcard-interface_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nClickHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClickHelper.kt\npantanal/app/groupcard/utils/ClickHelper\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,178:1\n32#2,2:179\n766#3:181\n857#3,2:182\n766#3:184\n857#3,2:185\n*S KotlinDebug\n*F\n+ 1 ClickHelper.kt\npantanal/app/groupcard/utils/ClickHelper\n*L\n133#1:179,2\n155#1:181\n155#1:182,2\n162#1:184\n162#1:185,2\n*E\n"})
public final class te3 {

    @NotNull
    public static final te3 INSTANCE = new te3();

    public final Intent a(Context context, String packageName) {
        Intent launchIntentForPackage;
        boolean z = false;
        if (packageName != null) {
            if (packageName.length() > 0) {
                z = true;
            }
        }
        if (z) {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(packageName);
            if (launchIntentForPackage == null) {
                bs9.a.c(t6e.INSTANCE, "ClickHelper", "createIntentByPackage, intent is null", false, null, false, 0, false, null, 252, null);
            }
        } else {
            launchIntentForPackage = null;
        }
        bs9.a.c(t6e.INSTANCE, "ClickHelper", "createIntentByPackage, intent: " + launchIntentForPackage, false, null, false, 0, false, null, 252, null);
        return launchIntentForPackage;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    public final Intent b(SeedlingActivityInfo info) {
        boolean z;
        boolean z2;
        boolean z3;
        Iterator<String> itKeys;
        String uri = info.getUri();
        JSONObject jSONObject = null;
        String string = uri != null ? StringsKt__StringsKt.trim((CharSequence) uri).toString() : null;
        if (string == null) {
            z = false;
        } else {
            if (string.length() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        String strSubstringAfter$default = z ? StringsKt__StringsKt.substringAfter$default(string, "nativeapp://", (String) null, 2, (Object) null) : null;
        String data = info.getData();
        String string2 = data != null ? StringsKt__StringsKt.trim((CharSequence) data).toString() : null;
        if (string2 == null) {
            z2 = false;
        } else {
            if (string2.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        Uri uri2 = z2 ? Uri.parse(string2) : null;
        if (Intrinsics.areEqual(strSubstringAfter$default, "android.intent.action.VIEW") && uri2 == null) {
            bs9.a.c(t6e.INSTANCE, "ClickHelper", "createIntentByUri,action == Intent.ACTION_VIEW && data == null,return null intent!", false, null, false, 0, false, null, 252, null);
            return null;
        }
        String params = info.getParams();
        String string3 = params != null ? StringsKt__StringsKt.trim((CharSequence) params).toString() : null;
        if (string3 != null) {
            z3 = string3.length() > 0;
        }
        if (!z3) {
            string3 = null;
        }
        Intent intent = new Intent();
        if (strSubstringAfter$default != null) {
            intent.setAction(strSubstringAfter$default);
        }
        if (uri2 != null) {
            intent.setData(uri2);
        }
        if (string3 != null) {
            try {
                jSONObject = new JSONObject(string3);
            } catch (JSONException e2) {
                bs9.a.b(t6e.INSTANCE, "ClickHelper", "createIntentByUri error, params can not cast to JSONObject: " + e2.getMessage(), false, null, false, 0, false, null, 252, null);
            }
        }
        if (jSONObject != null && (itKeys = jSONObject.keys()) != null) {
            Intrinsics.checkNotNullExpressionValue(itKeys, "keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                intent.putExtra(next, jSONObject.optString(next));
            }
        }
        intent.setFlags(335544320);
        bs9.a.c(t6e.INSTANCE, "ClickHelper", "createIntentByUri, intent: " + intent, false, null, false, 0, false, null, 252, null);
        return intent;
    }

    @SuppressLint({"QueryPermissionsNeeded"})
    public final List<Intent> c(List<? extends Intent> list, Context context) {
        ArrayList arrayList;
        bs9.a.c(t6e.INSTANCE, "ClickHelper", "filterValidIntent,before filter:" + list, false, null, false, 0, false, null, 252, null);
        PackageManager packageManager = context.getPackageManager();
        if (e()) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                List listQueryIntentActivities = packageManager.queryIntentActivities((Intent) obj, PackageManager.ResolveInfoFlags.of(PlaybackStateCompat.ACTION_PREPARE_FROM_URI));
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "packageManager.queryInte…Long())\n                )");
                if (!listQueryIntentActivities.isEmpty()) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = new ArrayList();
            for (Object obj2 : list) {
                List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities((Intent) obj2, 131072);
                Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities2, "packageManager.queryInte…PackageManager.MATCH_ALL)");
                if (!listQueryIntentActivities2.isEmpty()) {
                    arrayList.add(obj2);
                }
            }
        }
        bs9.a.c(t6e.INSTANCE, "ClickHelper", "filterValidIntent,after filter:" + arrayList, false, null, false, 0, false, null, 252, null);
        return arrayList;
    }

    @NotNull
    public final List<Intent> d(@NotNull Context context, @NotNull List<SeedlingActivityInfo> infoList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(infoList, "infoList");
        bs9.a.c(t6e.INSTANCE, "ClickHelper", "startMultistageActivity begin,infoList:" + infoList, false, null, false, 0, false, null, 252, null);
        ArrayList arrayList = new ArrayList();
        for (SeedlingActivityInfo seedlingActivityInfo : infoList) {
            Intent intentA = a(context, seedlingActivityInfo.getPackageName());
            if (intentA == null) {
                intentA = b(seedlingActivityInfo);
            }
            if (intentA != null) {
                arrayList.add(intentA);
            }
        }
        bs9.a.c(t6e.INSTANCE, "ClickHelper", "startMultistageActivity, intentList.size: " + arrayList.size(), false, null, false, 0, false, null, 252, null);
        return c(arrayList, context);
    }

    @ChecksSdkIntAtLeast(api = 33)
    public final boolean e() {
        return Build.VERSION.SDK_INT >= 33;
    }
}
