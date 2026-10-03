package org.hapjs.card.sdk.utils;

import android.content.BroadcastReceiver;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.os.Handler;
import com.nearme.instant.xcard.CardClient;
import java.io.File;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"org/hapjs/card/sdk/utils/CardExt__CardExtKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class CardExt {
    public static final int RECEIVER_EXPORTED = 2;

    @NotNull
    public static final String TAG = "CardExt";

    @Nullable
    public static final AssetManager createPluginAssertManager(@NotNull File file) {
        return CardExt__CardExtKt.createPluginAssertManager(file);
    }

    public static final int extractVersion(@NotNull CardClient cardClient, @NotNull String str) {
        return CardExt__CardExtKt.extractVersion(cardClient, str);
    }

    @NotNull
    public static final String getFileMD5(@NotNull File file) {
        return CardExt__CardExtKt.getFileMD5(file);
    }

    public static final int getSignaturesFlags() {
        return CardExt__CardExtKt.getSignaturesFlags();
    }

    public static final void initEventTrackerIfNeeded(@NotNull Context context) {
        CardExt__CardExtKt.initEventTrackerIfNeeded(context);
    }

    public static final void registerReceiverExt(@NotNull Context context, @NotNull BroadcastReceiver broadcastReceiver, @NotNull IntentFilter intentFilter, int i) {
        CardExt__CardExtKt.registerReceiverExt(context, broadcastReceiver, intentFilter, i);
    }

    public static final void reportEngineInitError(@NotNull Context context, int i, @Nullable Throwable th, boolean z, boolean z2, boolean z3) {
        CardExt__CardExtKt.reportEngineInitError(context, i, th, z, z2, z3);
    }

    public static final void reportHotLoadEngineError(@NotNull Context context, int i, @Nullable Throwable th) {
        CardExt__CardExtKt.reportHotLoadEngineError(context, i, th);
    }

    public static final void safeClose(@NotNull ContentProviderClient contentProviderClient) {
        CardExt__CardExtKt.safeClose(contentProviderClient);
    }

    public static final void registerReceiverExt(@NotNull Context context, @NotNull BroadcastReceiver broadcastReceiver, @NotNull IntentFilter intentFilter, @Nullable String str, @Nullable Handler handler) {
        CardExt__CardExtKt.registerReceiverExt(context, broadcastReceiver, intentFilter, str, handler);
    }

    public static final void registerReceiverExt(@NotNull Context context, @NotNull BroadcastReceiver broadcastReceiver, @NotNull IntentFilter intentFilter, @Nullable String str, @Nullable Handler handler, int i) {
        CardExt__CardExtKt.registerReceiverExt(context, broadcastReceiver, intentFilter, str, handler, i);
    }
}
