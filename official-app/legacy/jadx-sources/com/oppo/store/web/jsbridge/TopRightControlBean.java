package com.oppo.store.web.jsbridge;

import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/oppo/store/web/jsbridge/TopRightControlBean;", "", "()V", "clickAction", "", "getClickAction", "()Ljava/lang/String;", "setClickAction", "(Ljava/lang/String;)V", "mShowText", "showText", "getShowText", "setShowText", "showType", "", "getShowType", "()I", "setShowType", "(I)V", "Companion", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TopRightControlBean {
    public static final int sShowTypeExplain = 3;
    public static final int sShowTypeNone = 0;
    public static final int sShowTypeScan = 4;
    public static final int sShowTypeSearch = 5;
    public static final int sShowTypeShare = 1;
    public static final int sShowTypeText = 2;
    private int showType;

    @NotNull
    private String mShowText = "";

    @NotNull
    private String clickAction = "";

    @NotNull
    public final String getClickAction() {
        return this.clickAction;
    }

    @NotNull
    /* JADX INFO: renamed from: getShowText, reason: from getter */
    public final String getMShowText() {
        return this.mShowText;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final void setClickAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clickAction = str;
    }

    public final void setShowText(@NotNull String showText) {
        Intrinsics.checkNotNullParameter(showText, "showText");
        if (!TextUtils.isEmpty(showText) && showText.length() > 5) {
            try {
                String strSubstring = showText.substring(0, 5);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                showText = strSubstring;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        this.mShowText = showText;
    }

    public final void setShowType(int i) {
        this.showType = i;
    }
}
