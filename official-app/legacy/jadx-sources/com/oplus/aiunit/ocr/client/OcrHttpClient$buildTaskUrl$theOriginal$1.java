package com.oplus.aiunit.ocr.client;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
final class OcrHttpClient$buildTaskUrl$theOriginal$1 extends Lambda implements Function1<Map.Entry<String, String>, CharSequence> {
    public static final OcrHttpClient$buildTaskUrl$theOriginal$1 INSTANCE = new OcrHttpClient$buildTaskUrl$theOriginal$1();

    public OcrHttpClient$buildTaskUrl$theOriginal$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull Map.Entry<String, String> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String key = it.getKey();
        String value = it.getValue();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) key);
        sb.append((Object) value);
        return sb.toString();
    }
}
