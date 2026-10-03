package com.heytap.store.homemodule.data.blackcard;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/heytap/store/homemodule/data/blackcard/VipRightVO;", "", Feedback.WIDGET_LINKURL, "", "iconUrl", "title", "popText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "setIconUrl", "(Ljava/lang/String;)V", "getLinkUrl", "setLinkUrl", "getPopText", "setPopText", "getTitle", "setTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class VipRightVO {

    @NotNull
    private String iconUrl;

    @NotNull
    private String linkUrl;

    @NotNull
    private String popText;

    @NotNull
    private String title;

    public VipRightVO() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ VipRightVO copy$default(VipRightVO vipRightVO, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vipRightVO.linkUrl;
        }
        if ((i & 2) != 0) {
            str2 = vipRightVO.iconUrl;
        }
        if ((i & 4) != 0) {
            str3 = vipRightVO.title;
        }
        if ((i & 8) != 0) {
            str4 = vipRightVO.popText;
        }
        return vipRightVO.copy(str, str2, str3, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPopText() {
        return this.popText;
    }

    @NotNull
    public final VipRightVO copy(@NotNull String linkUrl, @NotNull String iconUrl, @NotNull String title, @NotNull String popText) {
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(popText, "popText");
        return new VipRightVO(linkUrl, iconUrl, title, popText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipRightVO)) {
            return false;
        }
        VipRightVO vipRightVO = (VipRightVO) other;
        return Intrinsics.areEqual(this.linkUrl, vipRightVO.linkUrl) && Intrinsics.areEqual(this.iconUrl, vipRightVO.iconUrl) && Intrinsics.areEqual(this.title, vipRightVO.title) && Intrinsics.areEqual(this.popText, vipRightVO.popText);
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @NotNull
    public final String getPopText() {
        return this.popText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((this.linkUrl.hashCode() * 31) + this.iconUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.popText.hashCode();
    }

    public final void setIconUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.iconUrl = str;
    }

    public final void setLinkUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.linkUrl = str;
    }

    public final void setPopText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.popText = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "VipRightVO(linkUrl=" + this.linkUrl + ", iconUrl=" + this.iconUrl + ", title=" + this.title + ", popText=" + this.popText + ')';
    }

    public VipRightVO(@NotNull String linkUrl, @NotNull String iconUrl, @NotNull String title, @NotNull String popText) {
        Intrinsics.checkNotNullParameter(linkUrl, "linkUrl");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(popText, "popText");
        this.linkUrl = linkUrl;
        this.iconUrl = iconUrl;
        this.title = title;
        this.popText = popText;
    }

    public /* synthetic */ VipRightVO(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
