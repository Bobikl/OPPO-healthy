package com.heytap.health.wallet.network.car.rsp;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\"\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010(X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u000201X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\b¨\u0006<"}, d2 = {"Lcom/heytap/health/wallet/network/car/rsp/CarBrandModel;", "", "()V", "actionName", "", "getActionName", "()Ljava/lang/String;", "setActionName", "(Ljava/lang/String;)V", "appGuideUrl", "getAppGuideUrl", "setAppGuideUrl", "appIcon", "getAppIcon", "setAppIcon", "appId", "getAppId", "setAppId", "appName", "getAppName", "setAppName", "categoryImg", "getCategoryImg", "setCategoryImg", "content", "getContent", "setContent", "downloadAppTips", "getDownloadAppTips", "setDownloadAppTips", Feedback.WIDGET_LINKURL, "getLinkUrl", "setLinkUrl", "openCardTips", "getOpenCardTips", "setOpenCardTips", "pkg", "getPkg", "setPkg", "tagList", "", "getTagList", "()Ljava/util/List;", "setTagList", "(Ljava/util/List;)V", "title", "getTitle", "setTitle", "type", "", "getType", "()I", "setType", "(I)V", "userCourseLinkUrl", "getUserCourseLinkUrl", "setUserCourseLinkUrl", "userCourseLinkUrlTitle", "getUserCourseLinkUrlTitle", "setUserCourseLinkUrlTitle", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CarBrandModel {

    @Nullable
    private String actionName;

    @Nullable
    private String appGuideUrl;

    @Nullable
    private String appIcon;

    @Nullable
    private String appId;

    @Nullable
    private String appName;

    @Nullable
    private String categoryImg;

    @Nullable
    private String content;

    @Nullable
    private String downloadAppTips;

    @Nullable
    private String linkUrl;

    @Nullable
    private String openCardTips;

    @Nullable
    private String pkg;

    @Nullable
    private List<String> tagList;

    @Nullable
    private String title;
    private int type;

    @Nullable
    private String userCourseLinkUrl;

    @Nullable
    private String userCourseLinkUrlTitle;

    @Nullable
    public final String getActionName() {
        return this.actionName;
    }

    @Nullable
    public final String getAppGuideUrl() {
        return this.appGuideUrl;
    }

    @Nullable
    public final String getAppIcon() {
        return this.appIcon;
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    @Nullable
    public final String getAppName() {
        return this.appName;
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
    public final String getDownloadAppTips() {
        return this.downloadAppTips;
    }

    @Nullable
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    public final String getOpenCardTips() {
        return this.openCardTips;
    }

    @Nullable
    public final String getPkg() {
        return this.pkg;
    }

    @Nullable
    public final List<String> getTagList() {
        return this.tagList;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getUserCourseLinkUrl() {
        return this.userCourseLinkUrl;
    }

    @Nullable
    public final String getUserCourseLinkUrlTitle() {
        return this.userCourseLinkUrlTitle;
    }

    public final void setActionName(@Nullable String str) {
        this.actionName = str;
    }

    public final void setAppGuideUrl(@Nullable String str) {
        this.appGuideUrl = str;
    }

    public final void setAppIcon(@Nullable String str) {
        this.appIcon = str;
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }

    public final void setAppName(@Nullable String str) {
        this.appName = str;
    }

    public final void setCategoryImg(@Nullable String str) {
        this.categoryImg = str;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setDownloadAppTips(@Nullable String str) {
        this.downloadAppTips = str;
    }

    public final void setLinkUrl(@Nullable String str) {
        this.linkUrl = str;
    }

    public final void setOpenCardTips(@Nullable String str) {
        this.openCardTips = str;
    }

    public final void setPkg(@Nullable String str) {
        this.pkg = str;
    }

    public final void setTagList(@Nullable List<String> list) {
        this.tagList = list;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUserCourseLinkUrl(@Nullable String str) {
        this.userCourseLinkUrl = str;
    }

    public final void setUserCourseLinkUrlTitle(@Nullable String str) {
        this.userCourseLinkUrlTitle = str;
    }
}
