package com.oplus.mydevices.sdk.utils;

import android.net.Uri;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002¨\u0006\u0005"}, d2 = {"isFileProviderUri", "", "", "toUri", "Landroid/net/Uri;", "sdk_domesticRelease"}, k = 2, mv = {1, 4, 0})
public final class UriExtKt {
    public static final boolean isFileProviderUri(@NotNull String isFileProviderUri) {
        Intrinsics.checkNotNullParameter(isFileProviderUri, "$this$isFileProviderUri");
        return StringsKt__StringsJVMKt.startsWith$default(isFileProviderUri, "content:", false, 2, null);
    }

    @Nullable
    public static final Uri toUri(@NotNull String toUri) {
        Intrinsics.checkNotNullParameter(toUri, "$this$toUri");
        try {
            return Uri.parse(toUri);
        } catch (Exception unused) {
            return null;
        }
    }
}
