package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u00020\u00138FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u00020\u00138FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0019\u001a\u00020\u00138FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u001c\u0010\u001c\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001c\u0010\u001f\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR\u001c\u0010\"\u001a\u00020\u00138FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001c\u0010%\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR\u001c\u0010(\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\u001c\u0010+\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR\u001c\u0010.\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\f\"\u0004\b0\u0010\u000eR\u001c\u00101\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR\u001c\u00104\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\f\"\u0004\b6\u0010\u000eR\u001c\u00107\u001a\u0002088FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010=\u001a\u00020\n8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR\u001c\u0010@\u001a\u00020\u00138FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0014\"\u0004\bB\u0010\u0016R\u001c\u0010C\u001a\u0002088FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010:\"\u0004\bE\u0010<¨\u0006F"}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreHeaderInfo;", "", "()V", "advertPendantInfo", "Lcom/heytap/store/business/component/entity/HeaderAdvertPendantInfo;", "getAdvertPendantInfo", "()Lcom/heytap/store/business/component/entity/HeaderAdvertPendantInfo;", "setAdvertPendantInfo", "(Lcom/heytap/store/business/component/entity/HeaderAdvertPendantInfo;)V", "colorScroll", "", "getColorScroll", "()Ljava/lang/String;", "setColorScroll", "(Ljava/lang/String;)V", "colorTitle", "getColorTitle", "setColorTitle", "isShowMore", "", "()Z", "setShowMore", "(Z)V", "isShowPic", "setShowPic", "moreIsLogin", "getMoreIsLogin", "setMoreIsLogin", "moreLink", "getMoreLink", "setMoreLink", "moreText", "getMoreText", "setMoreText", "pendantShow", "getPendantShow", "setPendantShow", "pic", "getPic", "setPic", "picField", "getPicField", "setPicField", "picJson", "getPicJson", "setPicJson", "picJsonField", "getPicJsonField", "setPicJsonField", "picLink", "getPicLink", "setPicLink", "picTitle", "getPicTitle", "setPicTitle", "styleFillet", "", "getStyleFillet", "()I", "setStyleFillet", "(I)V", "title", "getTitle", "setTitle", "titleShow", "getTitleShow", "setTitleShow", "titleStyle", "getTitleStyle", "setTitleStyle", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class OStoreHeaderInfo {

    @Nullable
    private HeaderAdvertPendantInfo advertPendantInfo;
    private boolean isShowMore;
    private boolean isShowPic;
    private boolean moreIsLogin;
    private boolean pendantShow;
    private int styleFillet;
    private boolean titleShow;
    private int titleStyle;

    @NotNull
    private String colorScroll = "";

    @NotNull
    private String colorTitle = "";

    @NotNull
    private String moreLink = "";

    @NotNull
    private String moreText = "";

    @NotNull
    private String pic = "";

    @NotNull
    private String picField = "";

    @NotNull
    private String picJson = "";

    @NotNull
    private String picJsonField = "";

    @NotNull
    private String picLink = "";

    @NotNull
    private String title = "";

    @NotNull
    private String picTitle = "";

    @Nullable
    public final HeaderAdvertPendantInfo getAdvertPendantInfo() {
        return this.advertPendantInfo;
    }

    @NotNull
    public final String getColorScroll() {
        String str = this.colorScroll;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getColorTitle() {
        String str = this.colorTitle;
        return str == null ? "" : str;
    }

    public final boolean getMoreIsLogin() {
        return this.moreIsLogin;
    }

    @NotNull
    public final String getMoreLink() {
        String str = this.moreLink;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getMoreText() {
        String str = this.moreText;
        return str == null ? "" : str;
    }

    public final boolean getPendantShow() {
        return this.pendantShow;
    }

    @NotNull
    public final String getPic() {
        String str = this.pic;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPicField() {
        String str = this.picField;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPicJson() {
        String str = this.picJson;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPicJsonField() {
        String str = this.picJsonField;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPicLink() {
        String str = this.picLink;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getPicTitle() {
        String str = this.picTitle;
        return str == null ? "" : str;
    }

    public final int getStyleFillet() {
        return this.styleFillet;
    }

    @NotNull
    public final String getTitle() {
        String str = this.title;
        return str == null ? "" : str;
    }

    public final boolean getTitleShow() {
        return this.titleShow;
    }

    public final int getTitleStyle() {
        return this.titleStyle;
    }

    /* JADX INFO: renamed from: isShowMore, reason: from getter */
    public final boolean getIsShowMore() {
        return this.isShowMore;
    }

    /* JADX INFO: renamed from: isShowPic, reason: from getter */
    public final boolean getIsShowPic() {
        return this.isShowPic;
    }

    public final void setAdvertPendantInfo(@Nullable HeaderAdvertPendantInfo headerAdvertPendantInfo) {
        this.advertPendantInfo = headerAdvertPendantInfo;
    }

    public final void setColorScroll(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.colorScroll = str;
    }

    public final void setColorTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.colorTitle = str;
    }

    public final void setMoreIsLogin(boolean z) {
        this.moreIsLogin = z;
    }

    public final void setMoreLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.moreLink = str;
    }

    public final void setMoreText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.moreText = str;
    }

    public final void setPendantShow(boolean z) {
        this.pendantShow = z;
    }

    public final void setPic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pic = str;
    }

    public final void setPicField(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.picField = str;
    }

    public final void setPicJson(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.picJson = str;
    }

    public final void setPicJsonField(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.picJsonField = str;
    }

    public final void setPicLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.picLink = str;
    }

    public final void setPicTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.picTitle = str;
    }

    public final void setShowMore(boolean z) {
        this.isShowMore = z;
    }

    public final void setShowPic(boolean z) {
        this.isShowPic = z;
    }

    public final void setStyleFillet(int i) {
        this.styleFillet = i;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setTitleShow(boolean z) {
        this.titleShow = z;
    }

    public final void setTitleStyle(int i) {
        this.titleStyle = i;
    }
}
