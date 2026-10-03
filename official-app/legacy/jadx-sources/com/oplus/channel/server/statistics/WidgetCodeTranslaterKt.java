package com.oplus.channel.server.statistics;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0003"}, d2 = {"CARDTYPE_SPLIT", "", "getWidgetCodeCardType", "server_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class WidgetCodeTranslaterKt {

    @NotNull
    private static final String CARDTYPE_SPLIT = "&";

    @NotNull
    public static final String getWidgetCodeCardType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "&", false, 2, (Object) null) ? (String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null).get(0) : "";
    }
}
