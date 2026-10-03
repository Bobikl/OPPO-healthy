package com.oplus.utrace.utils;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.lib.PackageNames;
import com.opos.process.bridge.base.BridgeConstant;
import java.util.ArrayList;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jdk7.AutoCloseableKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0004H\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0004J(\u0010\u0016\u001a\u0004\u0018\u00010\b\"\b\b\u0000\u0010\u0017*\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00170\u001aJ\"\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u0010J4\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010 \u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\nR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/oplus/utrace/utils/Providers;", "", "()V", "coreAuthority", "", "coreResolveTime", "", "coreUri", "Landroid/net/Uri;", "callCoreProvider", "Landroid/os/Bundle;", "context", "Landroid/content/Context;", "method", BridgeConstant.KEY_EXTRAS, "checkAuthority", "", "authority", "resolveCoreAuthority", "authoritySuffix", "resolveCoreUri", "resolveCoreUriWithAuthority", "resolveUriWithClass", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/content/ContentProvider;", "clazz", "Ljava/lang/Class;", "resolveUriWithComponent", "name", "Landroid/content/ComponentName;", "logFailure", "unstableProviderCall", ParserTag.TAG_URI, "arg", "utrace-lib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProviders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Providers.kt\ncom/oplus/utrace/utils/Providers\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,131:1\n11335#2:132\n11670#2,3:133\n*S KotlinDebug\n*F\n+ 1 Providers.kt\ncom/oplus/utrace/utils/Providers\n*L\n88#1:132\n88#1:133,3\n*E\n"})
public final class Providers {

    @NotNull
    public static final Providers INSTANCE = new Providers();

    @Nullable
    private static volatile String coreAuthority;
    private static volatile long coreResolveTime;

    @Nullable
    private static volatile Uri coreUri;

    private Providers() {
    }

    public static /* synthetic */ Bundle callCoreProvider$default(Providers providers, Context context, String str, Bundle bundle, int i, Object obj) {
        if ((i & 4) != 0) {
            bundle = new Bundle();
        }
        return providers.callCoreProvider(context, str, bundle);
    }

    private final boolean checkAuthority(Context context, String authority) {
        Object objM5287constructorimpl;
        PackageManager packageManager = context.getPackageManager();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(Build.VERSION.SDK_INT >= 33 ? packageManager.resolveContentProvider(authority, PackageManager.ComponentInfoFlags.of(128L)) : packageManager.resolveContentProvider(authority, 128));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logs.INSTANCE.w("UTrace.Lib.Providers", "checkAuthority() exception=" + thM5290exceptionOrNullimpl.getMessage(), thM5290exceptionOrNullimpl);
        }
        ProviderInfo providerInfo = null;
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = null;
        }
        ProviderInfo providerInfo2 = (ProviderInfo) objM5287constructorimpl;
        if (providerInfo2 != null) {
            Logs.INSTANCE.d("UTrace.Lib.Providers", "checkAuthority() authority=" + authority + " result=" + providerInfo2);
            providerInfo = providerInfo2;
        }
        return providerInfo != null;
    }

    private final String resolveCoreAuthority(Context context, String authoritySuffix) {
        Object next;
        String[] core_apps = PackageNames.INSTANCE.getCORE_APPS();
        ArrayList arrayList = new ArrayList(core_apps.length);
        for (String str : core_apps) {
            arrayList.add(str + '.' + authoritySuffix);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (INSTANCE.checkAuthority(context, (String) next)) {
                return (String) next;
            }
        }
        next = null;
        return (String) next;
    }

    public static /* synthetic */ Uri resolveUriWithComponent$default(Providers providers, Context context, ComponentName componentName, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return providers.resolveUriWithComponent(context, componentName, z);
    }

    public static /* synthetic */ Bundle unstableProviderCall$default(Providers providers, Context context, Uri uri, String str, String str2, Bundle bundle, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = "";
        }
        String str3 = str2;
        if ((i & 16) != 0) {
            bundle = new Bundle();
        }
        return providers.unstableProviderCall(context, uri, str, str3, bundle);
    }

    @Nullable
    public final Bundle callCoreProvider(@NotNull Context context, @NotNull String method, @NotNull Bundle extras) {
        Object objM5287constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Logs.INSTANCE.d("UTrace.Lib.Providers", "callCoreProvider, method = " + method);
        try {
            Result.Companion companion = Result.INSTANCE;
            Uri uriResolveCoreUri = resolveCoreUri(context);
            objM5287constructorimpl = Result.m5287constructorimpl(uriResolveCoreUri != null ? unstableProviderCall$default(this, context, uriResolveCoreUri, method, null, extras, 8, null) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logs.INSTANCE.w("UTrace.Lib.Providers", "callCoreProvider() method=" + method + " exception=" + thM5290exceptionOrNullimpl.getMessage(), thM5290exceptionOrNullimpl);
        }
        return (Bundle) (Result.m5293isFailureimpl(objM5287constructorimpl) ? null : objM5287constructorimpl);
    }

    @Nullable
    public final Uri resolveCoreUri(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = coreResolveTime / 60000 != jElapsedRealtime / 60000;
        String strResolveCoreAuthority = coreAuthority;
        if (z || strResolveCoreAuthority == null) {
            strResolveCoreAuthority = resolveCoreAuthority(context, "UTraceProvider");
            coreAuthority = strResolveCoreAuthority;
            coreResolveTime = jElapsedRealtime;
        }
        Uri uri = coreUri;
        if ((!z && uri != null) || strResolveCoreAuthority == null) {
            return uri;
        }
        Uri uri2 = Uri.parse(NotificationApiService.CONTENT + strResolveCoreAuthority);
        coreUri = uri2;
        coreResolveTime = jElapsedRealtime;
        return uri2;
    }

    @Nullable
    public final Uri resolveCoreUriWithAuthority(@NotNull Context context, @NotNull String authoritySuffix) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authoritySuffix, "authoritySuffix");
        String strResolveCoreAuthority = resolveCoreAuthority(context, authoritySuffix);
        if (strResolveCoreAuthority == null) {
            return null;
        }
        return Uri.parse(NotificationApiService.CONTENT + strResolveCoreAuthority);
    }

    @Nullable
    public final <T extends ContentProvider> Uri resolveUriWithClass(@NotNull Context context, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return resolveUriWithComponent$default(this, context, new ComponentName(context, (Class<?>) clazz), false, 4, null);
    }

    @Nullable
    public final Uri resolveUriWithComponent(@NotNull Context context, @NotNull ComponentName name, boolean logFailure) {
        Object objM5287constructorimpl;
        String str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        PackageManager packageManager = context.getPackageManager();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(Build.VERSION.SDK_INT >= 33 ? packageManager.getProviderInfo(name, PackageManager.ComponentInfoFlags.of(128L)) : packageManager.getProviderInfo(name, 128));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
        if (thM5290exceptionOrNullimpl != null) {
            Logs.INSTANCE.println(logFailure ? 5 : 3, "UTrace.Lib.Providers", "resolveUriWithComponent() name=" + name + " exception=" + thM5290exceptionOrNullimpl);
        }
        Uri uri = null;
        if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
            objM5287constructorimpl = null;
        }
        ProviderInfo providerInfo = (ProviderInfo) objM5287constructorimpl;
        if (providerInfo != null && (str = providerInfo.authority) != null) {
            uri = Uri.parse(NotificationApiService.CONTENT + str);
        }
        Logs.INSTANCE.d("UTrace.Lib.Providers", "resolveUriWithComponent() name=" + name + " result=" + uri);
        return uri;
    }

    @Nullable
    public final Bundle unstableProviderCall(@NotNull Context context, @NotNull Uri uri, @NotNull String method, @NotNull String arg, @NotNull Bundle extras) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(arg, "arg");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Logs.INSTANCE.d("UTrace.Lib.Providers", "unstableProviderCall(" + uri + ", " + method + ", " + arg + ", " + extras + ')');
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        if (contentProviderClientAcquireUnstableContentProviderClient == null) {
            return null;
        }
        try {
            String authority = uri.getAuthority();
            Bundle bundleCall = authority != null ? contentProviderClientAcquireUnstableContentProviderClient.call(authority, method, arg, extras) : null;
            AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient, null);
            return bundleCall;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(contentProviderClientAcquireUnstableContentProviderClient, th);
                throw th2;
            }
        }
    }
}
