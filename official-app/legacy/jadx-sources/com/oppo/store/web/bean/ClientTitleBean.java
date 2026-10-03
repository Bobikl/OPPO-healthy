package com.oppo.store.web.bean;

import com.oplus.aiunit.vision.f04;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010B\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\bR\"\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001c\u0010<\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001c\u0010?\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\b¨\u0006C"}, d2 = {"Lcom/oppo/store/web/bean/ClientTitleBean;", "Ljava/io/Serializable;", "()V", "backText", "", "getBackText", "()Ljava/lang/String;", "setBackText", "(Ljava/lang/String;)V", "backgroundColor", "getBackgroundColor", "setBackgroundColor", "backgroundImage", "getBackgroundImage", "setBackgroundImage", "homeAsUpIndicator", "getHomeAsUpIndicator", "setHomeAsUpIndicator", "isGradientNav", "", "()Z", "setGradientNav", "(Z)V", "isHasWindowVideo", "setHasWindowVideo", "isNeedBackIcon", "setNeedBackIcon", "isNeedRightIcon", "setNeedRightIcon", "nextText", "getNextText", "setNextText", "rightAction", "", "Lcom/oppo/store/web/bean/RightActionBean;", "getRightAction", "()Ljava/util/List;", "setRightAction", "(Ljava/util/List;)V", "rightIconText", "getRightIconText", "setRightIconText", "rightIconTextCallbackId", "getRightIconTextCallbackId", "setRightIconTextCallbackId", "rightIconUrl", "getRightIconUrl", "setRightIconUrl", "rightTapText", "getRightTapText", "setRightTapText", f04.KEY_SHARED_ID, "getShareId", "setShareId", "statusbarTint", "getStatusbarTint", "setStatusbarTint", "tabContent", "getTabContent", "setTabContent", "title", "getTitle", "setTitle", "titleColor", "getTitleColor", "setTitleColor", "toString", "webbrowser-impl_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ClientTitleBean implements Serializable {

    @Nullable
    private String backText;

    @Nullable
    private String backgroundColor;

    @Nullable
    private String backgroundImage;

    @Nullable
    private String homeAsUpIndicator;

    /* JADX INFO: renamed from: isGradientNav, reason: from kotlin metadata and from toString */
    private boolean gradientNav;

    /* JADX INFO: renamed from: isHasWindowVideo, reason: from kotlin metadata and from toString */
    private boolean hasWindowVideo;
    private boolean isNeedBackIcon;
    private boolean isNeedRightIcon;

    @Nullable
    private String nextText;

    @Nullable
    private List<RightActionBean> rightAction;

    @Nullable
    private String rightIconText;

    @Nullable
    private String rightIconTextCallbackId;

    @Nullable
    private String rightIconUrl;

    @Nullable
    private String rightTapText;

    @Nullable
    private String shareId;

    @Nullable
    private String statusbarTint;

    @Nullable
    private String tabContent;

    @Nullable
    private String title;

    @Nullable
    private String titleColor;

    @Nullable
    public final String getBackText() {
        return this.backText;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    @Nullable
    public final String getHomeAsUpIndicator() {
        return this.homeAsUpIndicator;
    }

    @Nullable
    public final String getNextText() {
        return this.nextText;
    }

    @Nullable
    public final List<RightActionBean> getRightAction() {
        return this.rightAction;
    }

    @Nullable
    public final String getRightIconText() {
        return this.rightIconText;
    }

    @Nullable
    public final String getRightIconTextCallbackId() {
        return this.rightIconTextCallbackId;
    }

    @Nullable
    public final String getRightIconUrl() {
        return this.rightIconUrl;
    }

    @Nullable
    public final String getRightTapText() {
        return this.rightTapText;
    }

    @Nullable
    public final String getShareId() {
        return this.shareId;
    }

    @Nullable
    public final String getStatusbarTint() {
        return this.statusbarTint;
    }

    @Nullable
    public final String getTabContent() {
        return this.tabContent;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTitleColor() {
        return this.titleColor;
    }

    /* JADX INFO: renamed from: isGradientNav, reason: from getter */
    public final boolean getGradientNav() {
        return this.gradientNav;
    }

    /* JADX INFO: renamed from: isHasWindowVideo, reason: from getter */
    public final boolean getHasWindowVideo() {
        return this.hasWindowVideo;
    }

    /* JADX INFO: renamed from: isNeedBackIcon, reason: from getter */
    public final boolean getIsNeedBackIcon() {
        return this.isNeedBackIcon;
    }

    /* JADX INFO: renamed from: isNeedRightIcon, reason: from getter */
    public final boolean getIsNeedRightIcon() {
        return this.isNeedRightIcon;
    }

    public final void setBackText(@Nullable String str) {
        this.backText = str;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    public final void setBackgroundImage(@Nullable String str) {
        this.backgroundImage = str;
    }

    public final void setGradientNav(boolean z) {
        this.gradientNav = z;
    }

    public final void setHasWindowVideo(boolean z) {
        this.hasWindowVideo = z;
    }

    public final void setHomeAsUpIndicator(@Nullable String str) {
        this.homeAsUpIndicator = str;
    }

    public final void setNeedBackIcon(boolean z) {
        this.isNeedBackIcon = z;
    }

    public final void setNeedRightIcon(boolean z) {
        this.isNeedRightIcon = z;
    }

    public final void setNextText(@Nullable String str) {
        this.nextText = str;
    }

    public final void setRightAction(@Nullable List<RightActionBean> list) {
        this.rightAction = list;
    }

    public final void setRightIconText(@Nullable String str) {
        this.rightIconText = str;
    }

    public final void setRightIconTextCallbackId(@Nullable String str) {
        this.rightIconTextCallbackId = str;
    }

    public final void setRightIconUrl(@Nullable String str) {
        this.rightIconUrl = str;
    }

    public final void setRightTapText(@Nullable String str) {
        this.rightTapText = str;
    }

    public final void setShareId(@Nullable String str) {
        this.shareId = str;
    }

    public final void setStatusbarTint(@Nullable String str) {
        this.statusbarTint = str;
    }

    public final void setTabContent(@Nullable String str) {
        this.tabContent = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTitleColor(@Nullable String str) {
        this.titleColor = str;
    }

    @NotNull
    public String toString() {
        return "ClientTitleBean{isNeedBackIcon=" + this.isNeedBackIcon + ", isNeedRightIcon=" + this.isNeedRightIcon + ", hasWindowVideo=" + this.hasWindowVideo + ", gradientNav=" + this.gradientNav + ", nextText='" + this.nextText + "', backText='" + this.backText + "', titleColor='" + this.titleColor + "', statusbarTint='" + this.statusbarTint + "', homeAsUpIndicator='" + this.homeAsUpIndicator + "', rightIconText='" + this.rightIconText + "', rightIconUrl='" + this.rightIconUrl + "', tabContent='" + this.tabContent + "', backgroundColor='" + this.backgroundColor + "', backgroundImage='" + this.backgroundImage + "', title='" + this.title + "', rightTapText='" + this.rightTapText + "', shareId='" + this.shareId + "'}";
    }
}
