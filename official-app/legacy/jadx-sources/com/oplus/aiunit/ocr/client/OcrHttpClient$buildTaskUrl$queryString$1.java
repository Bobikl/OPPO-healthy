package com.oplus.aiunit.ocr.client;

import com.heytap.store.base.core.http.HttpUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes5.dex */
final class OcrHttpClient$buildTaskUrl$queryString$1 extends Lambda implements Function1<Map.Entry<String, String>, CharSequence> {
    public static final OcrHttpClient$buildTaskUrl$queryString$1 INSTANCE = new OcrHttpClient$buildTaskUrl$queryString$1();

    public OcrHttpClient$buildTaskUrl$queryString$1() {
        super(1);
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull Map.Entry<String, String> it) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(it, "it");
        String key = it.getKey();
        return ((Object) key) + HttpUtils.EQUAL_SIGN + URLEncoder.encode(it.getValue(), "utf-8");
    }
}
