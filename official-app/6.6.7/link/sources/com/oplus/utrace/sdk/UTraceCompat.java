package com.oplus.utrace.sdk;

import android.net.Uri;
import android.os.Bundle;
import com.oplus.smartenginehelper.ParserTag;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ\u0010\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u000bJ$\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ*\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0006J*\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/oplus/utrace/sdk/UTraceCompat;", "", "()V", "jsonStr", "Lorg/json/JSONObject;", "utraceContext", "Lcom/oplus/utrace/sdk/UTraceContext;", "readFromBundle", "bundle", "Landroid/os/Bundle;", "legacyKey", "", "newKey", "readFromJsonString", "jsonString", "readFromUri", ParserTag.TAG_URI, "Landroid/net/Uri;", "writeToBundle", "ctx", "writeToJsonString", "writeToUri", "Landroid/net/Uri$Builder;", "uriBuilder", "foundation-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UTraceCompat {

    @NotNull
    public static final UTraceCompat INSTANCE = new UTraceCompat();

    @NotNull
    private static final JSONObject jsonStr = new JSONObject();

    @Nullable
    private static final UTraceContext utraceContext = null;

    private UTraceCompat() {
    }

    public static /* synthetic */ UTraceContext readFromBundle$default(UTraceCompat uTraceCompat, Bundle bundle, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        return uTraceCompat.readFromBundle(bundle, str, str2);
    }

    public static /* synthetic */ UTraceContext readFromUri$default(UTraceCompat uTraceCompat, Uri uri, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        return uTraceCompat.readFromUri(uri, str, str2);
    }

    public static /* synthetic */ Bundle writeToBundle$default(UTraceCompat uTraceCompat, UTraceContext uTraceContext, Bundle bundle, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        return uTraceCompat.writeToBundle(uTraceContext, bundle, str, str2);
    }

    public static /* synthetic */ Uri.Builder writeToUri$default(UTraceCompat uTraceCompat, UTraceContext uTraceContext, Uri.Builder builder, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        return uTraceCompat.writeToUri(uTraceContext, builder, str, str2);
    }

    @Nullable
    public final UTraceContext readFromBundle(@NotNull Bundle bundle, @NotNull String legacyKey, @NotNull String newKey) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(legacyKey, "legacyKey");
        Intrinsics.checkNotNullParameter(newKey, "newKey");
        return utraceContext;
    }

    @Nullable
    public final UTraceContext readFromJsonString(@NotNull String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        return utraceContext;
    }

    @Nullable
    public final UTraceContext readFromUri(@NotNull Uri uri, @NotNull String legacyKey, @NotNull String newKey) {
        Intrinsics.checkNotNullParameter(uri, ParserTag.TAG_URI);
        Intrinsics.checkNotNullParameter(legacyKey, "legacyKey");
        Intrinsics.checkNotNullParameter(newKey, "newKey");
        return utraceContext;
    }

    @NotNull
    public final Bundle writeToBundle(@NotNull UTraceContext ctx, @NotNull Bundle bundle, @NotNull String legacyKey, @NotNull String newKey) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(legacyKey, "legacyKey");
        Intrinsics.checkNotNullParameter(newKey, "newKey");
        return bundle;
    }

    @NotNull
    public final String writeToJsonString(@NotNull UTraceContext ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        String string = jsonStr.toString();
        Intrinsics.checkNotNullExpressionValue(string, "jsonStr.toString()");
        return string;
    }

    @NotNull
    public final Uri.Builder writeToUri(@NotNull UTraceContext ctx, @NotNull Uri.Builder uriBuilder, @NotNull String legacyKey, @NotNull String newKey) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(uriBuilder, "uriBuilder");
        Intrinsics.checkNotNullParameter(legacyKey, "legacyKey");
        Intrinsics.checkNotNullParameter(newKey, "newKey");
        return uriBuilder;
    }
}
