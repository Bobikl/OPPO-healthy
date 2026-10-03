package com.oplus.aiunit.vision;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jdk7.AutoCloseableKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001c\u0010\u000b\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/oplus/aiunit/vision/iq;", "", "Landroid/content/Context;", "context", "", "b", "", "a", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "Landroid/net/Uri;", "URI_COMBINE_VERSION", "Z", "isCompleteInit", "c", "Ljava/lang/String;", "authority", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class iq {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static boolean isCompleteInit;

    @NotNull
    public static final iq INSTANCE = new iq();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final Uri URI_COMBINE_VERSION = Uri.parse("content://com.oplus.advice.settings.combine.external.pas");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static String authority = "com.oplus.advice.settings";

    @JvmStatic
    @NotNull
    public static final String b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (isCompleteInit) {
            return authority;
        }
        if (INSTANCE.a(context)) {
            f7b.e("AdviceAuthorityHelper", "advice is the latest");
            authority = "com.oplus.advice.settings.combine.external.pas";
        }
        isCompleteInit = true;
        return authority;
    }

    public final boolean a(Context context) {
        Object objM5287constructorimpl;
        Boolean boolValueOf;
        try {
            Result.Companion companion = Result.INSTANCE;
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(URI_COMBINE_VERSION);
            if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                boolValueOf = null;
            } else {
                try {
                    Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("isAdviceCombined", null, null);
                    boolValueOf = bundleCall == null ? null : Boolean.valueOf(bundleCall.getBoolean("result", false));
                    AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient, th);
                        throw th2;
                    }
                }
            }
            objM5287constructorimpl = Result.m5287constructorimpl(boolValueOf);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th3));
        }
        Boolean bool = (Boolean) (Result.m5293isFailureimpl(objM5287constructorimpl) ? null : objM5287constructorimpl);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
