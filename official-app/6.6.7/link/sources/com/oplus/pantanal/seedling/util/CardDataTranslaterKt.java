package com.oplus.pantanal.seedling.util;

import com.oplus.pantanal.seedling.constants.Constants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u001a \u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000\u001a\n\u0010\b\u001a\u00020\u0005*\u00020\u0001\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\u0001\u001a\n\u0010\n\u001a\u00020\u0005*\u00020\u0001\u001a\f\u0010\u000b\u001a\u00020\u0005*\u00020\u0001H\u0000\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"CARDTYPE_SPLIT", "", "CARD_PREFIX", "getWidgetId", "cardType", "", "cardId", "hostId", "getCardId", "getCardType", "getHostId", "getIdByWidgetCode", "getWidgetIdByObserver", "seedling-support_manualRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CardDataTranslaterKt {

    @NotNull
    private static final String CARDTYPE_SPLIT = "&";

    @NotNull
    private static final String CARD_PREFIX = "card:";

    public static final int getCardId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            return Integer.parseInt((String) StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, (Object) null).get(1));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 != null) {
                Logger.INSTANCE.e(Constants.TAG, "getCardId has error " + th2.getMessage());
            }
            return 0;
        }
    }

    public static final int getCardType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            return Integer.parseInt((String) StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, (Object) null).get(0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 != null) {
                Logger.INSTANCE.e(Constants.TAG, "getCardType has error " + th2.getMessage());
            }
            return 0;
        }
    }

    public static final int getHostId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            return Integer.parseInt((String) StringsKt.split$default(str, new String[]{"&"}, false, 0, 6, (Object) null).get(2));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 != null) {
                Logger.INSTANCE.e(Constants.TAG, "getHostId has error " + th2.getMessage());
            }
            return 0;
        }
    }

    public static final int getIdByWidgetCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            Result.Companion companion = Result.Companion;
            return Integer.parseInt(StringsKt.replace$default(str, "&", "", false, 4, (Object) null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return 0;
            }
            Logger.INSTANCE.e("", "get id by widget code has error " + th2.getMessage());
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
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
