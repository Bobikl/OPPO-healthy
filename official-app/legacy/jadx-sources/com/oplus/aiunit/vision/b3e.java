package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.instant.router.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000e\u001a\u00020\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\f\u001a\u00020\u0007H\u0002R\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/b3e;", "", "Landroid/content/Context;", "context", "", "", "c", "Landroid/content/pm/ResolveInfo;", "a", "", "b", "appLists", Instant.HOST_INSTANT, "", "d", "TAG", "Ljava/lang/String;", "PKG_INSTANT", "PKG_SEARCH_BOX", "PKG_ASSISTANT_SCREEN", "PKG_OCR_SCANNER", "PKG_PICTORIAL", "", "Ljava/util/Set;", "sPkgSets", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class b3e {

    @NotNull
    public static final String PKG_ASSISTANT_SCREEN = "com.coloros.assistantscreen";

    @NotNull
    public static final String PKG_INSTANT = "com.nearme.instant.platform";

    @NotNull
    public static final String PKG_OCR_SCANNER = "com.coloros.ocrscanner";

    @NotNull
    public static final String PKG_PICTORIAL = "com.heytap.pictorial";

    @NotNull
    public static final String PKG_SEARCH_BOX = "com.heytap.quicksearchbox";

    @NotNull
    public static final String TAG = "PackageUtil";

    @NotNull
    public static final b3e INSTANCE = new b3e();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final Set<String> sPkgSets = new LinkedHashSet();
    public static final int $stable = 8;

    public final List<ResolveInfo> a(Context context) {
        List<ResolveInfo> listB = b(context);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listB);
        Intent intent = new Intent();
        intent.setPackage("com.nearme.instant.platform");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "context.packageManager.q…tentActivities(intent, 0)");
        if (!listQueryIntentActivities.isEmpty()) {
            ResolveInfo resolveInfo = listQueryIntentActivities.get(0);
            Intrinsics.checkNotNullExpressionValue(resolveInfo, "instants[0]");
            if (!d(arrayList, resolveInfo)) {
                ResolveInfo resolveInfo2 = listQueryIntentActivities.get(0);
                Intrinsics.checkNotNullExpressionValue(resolveInfo2, "instants[0]");
                arrayList.add(resolveInfo2);
            }
        }
        intent.setPackage("com.heytap.quicksearchbox");
        List<ResolveInfo> listQueryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities2, "context.packageManager.q…tentActivities(intent, 0)");
        if (!listQueryIntentActivities2.isEmpty()) {
            ResolveInfo resolveInfo3 = listQueryIntentActivities2.get(0);
            Intrinsics.checkNotNullExpressionValue(resolveInfo3, "instants[0]");
            if (!d(arrayList, resolveInfo3)) {
                ResolveInfo resolveInfo4 = listQueryIntentActivities2.get(0);
                Intrinsics.checkNotNullExpressionValue(resolveInfo4, "instants[0]");
                arrayList.add(resolveInfo4);
            }
        }
        intent.setPackage("com.coloros.assistantscreen");
        List<ResolveInfo> listQueryIntentActivities3 = context.getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities3, "context.packageManager.q…tentActivities(intent, 0)");
        if (!listQueryIntentActivities3.isEmpty()) {
            ResolveInfo resolveInfo5 = listQueryIntentActivities3.get(0);
            Intrinsics.checkNotNullExpressionValue(resolveInfo5, "instants[0]");
            if (!d(arrayList, resolveInfo5)) {
                ResolveInfo resolveInfo6 = listQueryIntentActivities3.get(0);
                Intrinsics.checkNotNullExpressionValue(resolveInfo6, "instants[0]");
                arrayList.add(resolveInfo6);
            }
        }
        intent.setPackage("com.coloros.ocrscanner");
        List<ResolveInfo> listQueryIntentActivities4 = context.getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities4, "context.packageManager.q…tentActivities(intent, 0)");
        if (!listQueryIntentActivities4.isEmpty()) {
            ResolveInfo resolveInfo7 = listQueryIntentActivities4.get(0);
            Intrinsics.checkNotNullExpressionValue(resolveInfo7, "instants[0]");
            if (!d(arrayList, resolveInfo7)) {
                ResolveInfo resolveInfo8 = listQueryIntentActivities4.get(0);
                Intrinsics.checkNotNullExpressionValue(resolveInfo8, "instants[0]");
                arrayList.add(resolveInfo8);
            }
        }
        if (ab0.INSTANCE.a(context)) {
            intent.setPackage("com.heytap.pictorial");
            List<ResolveInfo> listQueryIntentActivities5 = context.getPackageManager().queryIntentActivities(intent, 0);
            Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities5, "context.packageManager.q…tentActivities(intent, 0)");
            if (!listQueryIntentActivities5.isEmpty()) {
                ResolveInfo resolveInfo9 = listQueryIntentActivities5.get(0);
                Intrinsics.checkNotNullExpressionValue(resolveInfo9, "instants[0]");
                if (!d(arrayList, resolveInfo9)) {
                    ResolveInfo resolveInfo10 = listQueryIntentActivities5.get(0);
                    Intrinsics.checkNotNullExpressionValue(resolveInfo10, "instants[0]");
                    arrayList.add(resolveInfo10);
                }
            }
        }
        return arrayList;
    }

    public final List<ResolveInfo> b(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "context.packageManager.q…ivities(resolveIntent, 0)");
        return listQueryIntentActivities;
    }

    @NotNull
    public final List<String> c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (sPkgSets.isEmpty()) {
            for (ResolveInfo resolveInfo : a(context)) {
                Set<String> set = sPkgSets;
                if (!set.contains(resolveInfo.activityInfo.packageName)) {
                    String str = resolveInfo.activityInfo.packageName;
                    Intrinsics.checkNotNullExpressionValue(str, "resolveInfo.activityInfo.packageName");
                    set.add(str);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = sPkgSets.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public final boolean d(List<? extends ResolveInfo> appLists, ResolveInfo instant) {
        Iterator<? extends ResolveInfo> it = appLists.iterator();
        while (it.hasNext()) {
            if (TextUtils.equals(it.next().activityInfo.packageName, instant.activityInfo.packageName)) {
                return true;
            }
        }
        return false;
    }
}
