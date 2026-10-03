package com.oplus.aiunit.vision;

import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000\u001a\u0016\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u0002\u001a\f\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0006¨\u0006\t"}, d2 = {"", "", "Lcom/oplus/aiunit/vision/gj8;", "b", "", "c", "Lokhttp3/Request;", "Lcom/oplus/aiunit/vision/eqf;", "a", "okhttp4_extension_release"}, k = 2, mv = {1, 4, 0})
public final class ly6 {
    @Nullable
    public static final RequestAttachInfo a(@NotNull Request getAttachInfo) {
        Intrinsics.checkNotNullParameter(getAttachInfo, "$this$getAttachInfo");
        return (RequestAttachInfo) getAttachInfo.s(RequestAttachInfo.class);
    }

    @NotNull
    public static final gj8 b(@NotNull Map<String, String> toHeaders) {
        Intrinsics.checkNotNullParameter(toHeaders, "$this$toHeaders");
        gj8.a aVar = new gj8.a();
        for (Map.Entry<String, String> entry : toHeaders.entrySet()) {
            aVar.b(entry.getKey(), entry.getValue());
        }
        return aVar.g();
    }

    @NotNull
    public static final Map<String, String> c(@NotNull gj8 toMap) {
        Intrinsics.checkNotNullParameter(toMap, "$this$toMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : toMap.names()) {
            String strA = toMap.a(str);
            if (strA != null) {
                linkedHashMap.put(str, strA);
            }
        }
        return linkedHashMap;
    }
}
