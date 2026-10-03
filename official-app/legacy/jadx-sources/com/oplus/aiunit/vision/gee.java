package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/gee;", "", "", "", "deniedPermList", "", "a", "<init>", "()V", "Companion", "lib_base_release"}, k = 1, mv = {1, 8, 0})
public final class gee {
    public final void a(@NotNull List<String> deniedPermList) {
        ApplicationInfo applicationInfo;
        Intrinsics.checkNotNullParameter(deniedPermList, "deniedPermList");
        a7b.f("PermDeniedHandler", "onPermDenied " + deniedPermList);
        Context contextA = b78.a();
        try {
            applicationInfo = contextA.getPackageManager().getApplicationInfo("com.oplus.securitypermission", 128);
        } catch (PackageManager.NameNotFoundException unused) {
            a7b.b("PermDeniedHandler", "securityPermission not found");
            applicationInfo = null;
        }
        boolean z = false;
        boolean z2 = applicationInfo != null ? applicationInfo.metaData.getBoolean("navigateToAppPermissions", false) : false;
        a7b.f("PermDeniedHandler", "onPermDenied " + z2 + ", " + applicationInfo);
        if (z2) {
            Intent intent = new Intent("oplus.intent.action.PERMISSION_APP_DETAIL");
            intent.setFlags(268435456);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("permissionList", new ArrayList<>(deniedPermList));
            bundle.putString("packageName", contextA.getPackageName());
            intent.putExtras(bundle);
            try {
                contextA.startActivity(intent);
                z = z2;
            } catch (SecurityException unused2) {
                a7b.b("PermDeniedHandler", "oplus.intent.action.PERMISSION_APP_DETAIL permission error");
            }
        } else {
            z = z2;
        }
        if (z) {
            return;
        }
        a7b.b("PermDeniedHandler", "something error, jump to setting list");
        Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + contextA.getPackageName()));
        intent2.addFlags(268435456);
        contextA.startActivity(intent2);
    }
}
