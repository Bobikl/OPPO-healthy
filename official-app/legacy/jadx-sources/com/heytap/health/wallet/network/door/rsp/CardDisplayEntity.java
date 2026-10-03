package com.heytap.health.wallet.network.door.rsp;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.heytap.webview.extension.protocol.Const;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR \u0010\u001e\u001a\u0004\u0018\u00010\u001f8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010%\u001a\u0004\u0018\u00010&8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R \u0010,\u001a\u0004\u0018\u00010&8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR \u00102\u001a\u0004\u0018\u00010&8FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b3\u0010(\"\u0004\b4\u0010*R\u001c\u00105\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\b¨\u00068"}, d2 = {"Lcom/heytap/health/wallet/network/door/rsp/CardDisplayEntity;", "", "()V", "aid", "", "getAid", "()Ljava/lang/String;", "setAid", "(Ljava/lang/String;)V", "appCode", "getAppCode", "setAppCode", "categoryImg", "getCategoryImg", "setCategoryImg", "content", "getContent", "setContent", "installDialogContent", "getInstallDialogContent", "setInstallDialogContent", Feedback.WIDGET_LINKURL, "getLinkUrl", "setLinkUrl", "openDialogContent", "getOpenDialogContent", "setOpenDialogContent", "packageName", "getPackageName", "setPackageName", "sortNo", "", "getSortNo", "()Ljava/lang/Byte;", "setSortNo", "(Ljava/lang/Byte;)V", "Ljava/lang/Byte;", "status", "", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", Const.Arguments.Open.STYLE, "getStyle", "setStyle", "title", "getTitle", "setTitle", "type", "getType", "setType", "userRight", "getUserRight", "setUserRight", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CardDisplayEntity {

    @Nullable
    private String aid;

    @Nullable
    private String appCode;

    @Nullable
    private String categoryImg;

    @Nullable
    private String content;

    @Nullable
    private String installDialogContent;

    @Nullable
    private String linkUrl;

    @Nullable
    private String openDialogContent;

    @Nullable
    private String packageName;

    @Nullable
    private Byte sortNo;

    @Nullable
    private Integer status;

    @Nullable
    private Integer style;

    @Nullable
    private String title;

    @Nullable
    private Integer type;

    @Nullable
    private String userRight;

    @Nullable
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getCategoryImg() {
        return this.categoryImg;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final String getInstallDialogContent() {
        return this.installDialogContent;
    }

    @Nullable
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    public final String getOpenDialogContent() {
        return this.openDialogContent;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final Byte getSortNo() {
        Byte b = this.sortNo;
        if (b == null) {
            return (byte) -1;
        }
        return b;
    }

    @Nullable
    public final Integer getStatus() {
        Integer num = this.status;
        if (num == null) {
            return -1;
        }
        return num;
    }

    @Nullable
    public final Integer getStyle() {
        Integer num = this.style;
        if (num == null) {
            return 0;
        }
        return num;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Integer getType() {
        Integer num = this.type;
        if (num == null) {
            return -1;
        }
        return num;
    }

    @Nullable
    public final String getUserRight() {
        return this.userRight;
    }

    public final void setAid(@Nullable String str) {
        this.aid = str;
    }

    public final void setAppCode(@Nullable String str) {
        this.appCode = str;
    }

    public final void setCategoryImg(@Nullable String str) {
        this.categoryImg = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setInstallDialogContent(@Nullable String str) {
        this.installDialogContent = str;
    }

    public final void setLinkUrl(@Nullable String str) {
        this.linkUrl = str;
    }

    public final void setOpenDialogContent(@Nullable String str) {
        this.openDialogContent = str;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setSortNo(@Nullable Byte b) {
        this.sortNo = b;
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }

    public final void setStyle(@Nullable Integer num) {
        this.style = num;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    public final void setUserRight(@Nullable String str) {
        this.userRight = str;
    }
}
