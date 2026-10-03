package io.netty.incubator.codec.quic.track;

import com.heytap.store.base.core.http.HttpUtils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"jsonReplace1", "", "netty-quic_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TrackAdapterKt {
    @NotNull
    public static final String jsonReplace1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(str, HttpUtils.EQUAL_SIGN, ":", false, 4, (Object) null), ";", ",", false, 4, (Object) null), "\"[", "[", false, 4, (Object) null), "]\"", "]", false, 4, (Object) null), "\\\"", "\"", false, 4, (Object) null);
    }
}
