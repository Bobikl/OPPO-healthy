package com.oplus.cardwidget.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u001a \u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\u0001\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\u0001\u001a\n\u0010\n\u001a\u00020\u0005*\u00020\u0001\u001a\f\u0010\u000b\u001a\u00020\u0005*\u00020\u0001H\u0000\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"CARDTYPE_SPLIT", "", "CARD_PREFIX", "getWidgetId", "cardType", "", "cardId", "hostId", "getCardId", "getCardType", "getHostId", "getIdByWidgetCode", "getWidgetIdByObserver", "com.oplus.card.widget.cardwidget"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class CardDataTranslaterKt {

    @NotNull
    private static final String CARDTYPE_SPLIT = "&";

    @NotNull
    private static final String CARD_PREFIX = "card:";

    public static final int getCardId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            return Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null).get(1));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl != null) {
                Logger.INSTANCE.e("", "getCardId has error " + thM5290exceptionOrNullimpl.getMessage());
            }
            return 0;
        }
    }

    public static final int getCardType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            return Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null).get(0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl != null) {
                Logger.INSTANCE.e("", "getCardType has error " + thM5290exceptionOrNullimpl.getMessage());
            }
            return 0;
        }
    }

    public static final int getHostId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            return Integer.parseInt((String) StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, 0, 6, (Object) null).get(2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl != null) {
                Logger.INSTANCE.e("", "getHostId has error " + thM5290exceptionOrNullimpl.getMessage());
            }
            return 0;
        }
    }

    public static final int getIdByWidgetCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            return Integer.parseInt(StringsKt__StringsJVMKt.replace$default(str, "&", "", false, 4, (Object) null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(Result.m5287constructorimpl(ResultKt.createFailure(th)));
            if (thM5290exceptionOrNullimpl == null) {
                return 0;
            }
            Logger.INSTANCE.e("", "get id by widget code has error " + thM5290exceptionOrNullimpl.getMessage());
            return 0;
        }
    }

    @NotNull
    public static final String getWidgetId(int i, int i2, int i3) {
        return i + "&" + i2 + "&" + i3;
    }

    @Nullable
    public static final String getWidgetIdByObserver(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 5) {
            return null;
        }
        String strSubstring = str.substring(5);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }
}
