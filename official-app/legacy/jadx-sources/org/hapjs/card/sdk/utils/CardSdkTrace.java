package org.hapjs.card.sdk.utils;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lorg/hapjs/card/sdk/utils/CardSdkTrace;", "", "()V", "mInitTrace", "Ljava/util/LinkedHashMap;", "", "Lkotlin/collections/LinkedHashMap;", "addTrace", "", "key", "value", "putTrace", "bundle", "Landroid/os/Bundle;", "card-sdk_liteRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCardSdkTrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardSdkTrace.kt\norg/hapjs/card/sdk/utils/CardSdkTrace\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,26:1\n215#2,2:27\n*S KotlinDebug\n*F\n+ 1 CardSdkTrace.kt\norg/hapjs/card/sdk/utils/CardSdkTrace\n*L\n18#1:27,2\n*E\n"})
public final class CardSdkTrace {

    @NotNull
    public static final CardSdkTrace INSTANCE = new CardSdkTrace();

    @NotNull
    private static final LinkedHashMap<String, String> mInitTrace = new LinkedHashMap<>();

    private CardSdkTrace() {
    }

    public final void addTrace(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            mInitTrace.put(key, value);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void putTrace(@NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        try {
            for (Map.Entry<String, String> entry : mInitTrace.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            mInitTrace.clear();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
