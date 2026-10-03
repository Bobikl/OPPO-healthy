package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\bF\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010?\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J´\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00052\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u0007HÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0004\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010$\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017R\u001a\u0010\u000f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0015\"\u0004\b4\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0015\"\u0004\b8\u0010\u0017¨\u0006M"}, d2 = {"Lcom/heytap/store/homemodule/data/HomeTabItemDetail;", "", "id", "", "isLogin", "", "mediaType", "", "switchValue", "title", "navigationType", "nativePageId", "link", "picSvg", "picSelectSvg", "picStyle", "columnColor", "navigateStyle", "navigateThemePic", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getColumnColor", "()Ljava/lang/String;", "setColumnColor", "(Ljava/lang/String;)V", "getId", "setId", "()Ljava/lang/Boolean;", "setLogin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getLink", "setLink", "getMediaType", "()Ljava/lang/Integer;", "setMediaType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getNativePageId", "setNativePageId", "getNavigateStyle", "setNavigateStyle", "getNavigateThemePic", "setNavigateThemePic", "getNavigationType", "setNavigationType", "getPicSelectSvg", "setPicSelectSvg", "getPicStyle", "()I", "setPicStyle", "(I)V", "getPicSvg", "setPicSvg", "getSwitchValue", "setSwitchValue", "getTitle", "setTitle", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/heytap/store/homemodule/data/HomeTabItemDetail;", "equals", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HomeTabItemDetail {

    @Nullable
    private String columnColor;

    @Nullable
    private String id;

    @Nullable
    private Boolean isLogin;

    @Nullable
    private String link;

    @Nullable
    private Integer mediaType;

    @Nullable
    private String nativePageId;

    @Nullable
    private Integer navigateStyle;

    @Nullable
    private String navigateThemePic;

    @Nullable
    private Integer navigationType;

    @Nullable
    private String picSelectSvg;
    private int picStyle;

    @Nullable
    private String picSvg;

    @Nullable
    private Boolean switchValue;

    @Nullable
    private String title;

    public HomeTabItemDetail() {
        this(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, 16383, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPicSelectSvg() {
        return this.picSelectSvg;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getPicStyle() {
        return this.picStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getColumnColor() {
        return this.columnColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getNavigateStyle() {
        return this.navigateStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getNavigateThemePic() {
        return this.navigateThemePic;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsLogin() {
        return this.isLogin;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMediaType() {
        return this.mediaType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getSwitchValue() {
        return this.switchValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getNavigationType() {
        return this.navigationType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNativePageId() {
        return this.nativePageId;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPicSvg() {
        return this.picSvg;
    }

    @NotNull
    public final HomeTabItemDetail copy(@Nullable String id, @Nullable Boolean isLogin, @Nullable Integer mediaType, @Nullable Boolean switchValue, @Nullable String title, @Nullable Integer navigationType, @Nullable String nativePageId, @Nullable String link, @Nullable String picSvg, @Nullable String picSelectSvg, int picStyle, @Nullable String columnColor, @Nullable Integer navigateStyle, @Nullable String navigateThemePic) {
        return new HomeTabItemDetail(id, isLogin, mediaType, switchValue, title, navigationType, nativePageId, link, picSvg, picSelectSvg, picStyle, columnColor, navigateStyle, navigateThemePic);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeTabItemDetail)) {
            return false;
        }
        HomeTabItemDetail homeTabItemDetail = (HomeTabItemDetail) other;
        return Intrinsics.areEqual(this.id, homeTabItemDetail.id) && Intrinsics.areEqual(this.isLogin, homeTabItemDetail.isLogin) && Intrinsics.areEqual(this.mediaType, homeTabItemDetail.mediaType) && Intrinsics.areEqual(this.switchValue, homeTabItemDetail.switchValue) && Intrinsics.areEqual(this.title, homeTabItemDetail.title) && Intrinsics.areEqual(this.navigationType, homeTabItemDetail.navigationType) && Intrinsics.areEqual(this.nativePageId, homeTabItemDetail.nativePageId) && Intrinsics.areEqual(this.link, homeTabItemDetail.link) && Intrinsics.areEqual(this.picSvg, homeTabItemDetail.picSvg) && Intrinsics.areEqual(this.picSelectSvg, homeTabItemDetail.picSelectSvg) && this.picStyle == homeTabItemDetail.picStyle && Intrinsics.areEqual(this.columnColor, homeTabItemDetail.columnColor) && Intrinsics.areEqual(this.navigateStyle, homeTabItemDetail.navigateStyle) && Intrinsics.areEqual(this.navigateThemePic, homeTabItemDetail.navigateThemePic);
    }

    @Nullable
    public final String getColumnColor() {
        return this.columnColor;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final Integer getMediaType() {
        return this.mediaType;
    }

    @Nullable
    public final String getNativePageId() {
        return this.nativePageId;
    }

    @Nullable
    public final Integer getNavigateStyle() {
        return this.navigateStyle;
    }

    @Nullable
    public final String getNavigateThemePic() {
        return this.navigateThemePic;
    }

    @Nullable
    public final Integer getNavigationType() {
        return this.navigationType;
    }

    @Nullable
    public final String getPicSelectSvg() {
        return this.picSelectSvg;
    }

    public final int getPicStyle() {
        return this.picStyle;
    }

    @Nullable
    public final String getPicSvg() {
        return this.picSvg;
    }

    @Nullable
    public final Boolean getSwitchValue() {
        return this.switchValue;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isLogin;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.mediaType;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.switchValue;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.navigationType;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.nativePageId;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.picSvg;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.picSelectSvg;
        int iHashCode10 = (((iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31) + Integer.hashCode(this.picStyle)) * 31;
        String str7 = this.columnColor;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num3 = this.navigateStyle;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str8 = this.navigateThemePic;
        return iHashCode12 + (str8 != null ? str8.hashCode() : 0);
    }

    @Nullable
    public final Boolean isLogin() {
        return this.isLogin;
    }

    public final void setColumnColor(@Nullable String str) {
        this.columnColor = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setLogin(@Nullable Boolean bool) {
        this.isLogin = bool;
    }

    public final void setMediaType(@Nullable Integer num) {
        this.mediaType = num;
    }

    public final void setNativePageId(@Nullable String str) {
        this.nativePageId = str;
    }

    public final void setNavigateStyle(@Nullable Integer num) {
        this.navigateStyle = num;
    }

    public final void setNavigateThemePic(@Nullable String str) {
        this.navigateThemePic = str;
    }

    public final void setNavigationType(@Nullable Integer num) {
        this.navigationType = num;
    }

    public final void setPicSelectSvg(@Nullable String str) {
        this.picSelectSvg = str;
    }

    public final void setPicStyle(int i) {
        this.picStyle = i;
    }

    public final void setPicSvg(@Nullable String str) {
        this.picSvg = str;
    }

    public final void setSwitchValue(@Nullable Boolean bool) {
        this.switchValue = bool;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "HomeTabItemDetail(id=" + ((Object) this.id) + ", isLogin=" + this.isLogin + ", mediaType=" + this.mediaType + ", switchValue=" + this.switchValue + ", title=" + ((Object) this.title) + ", navigationType=" + this.navigationType + ", nativePageId=" + ((Object) this.nativePageId) + ", link=" + ((Object) this.link) + ", picSvg=" + ((Object) this.picSvg) + ", picSelectSvg=" + ((Object) this.picSelectSvg) + ", picStyle=" + this.picStyle + ", columnColor=" + ((Object) this.columnColor) + ", navigateStyle=" + this.navigateStyle + ", navigateThemePic=" + ((Object) this.navigateThemePic) + ')';
    }

    public HomeTabItemDetail(@Nullable String str, @Nullable Boolean bool, @Nullable Integer num, @Nullable Boolean bool2, @Nullable String str2, @Nullable Integer num2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, int i, @Nullable String str7, @Nullable Integer num3, @Nullable String str8) {
        this.id = str;
        this.isLogin = bool;
        this.mediaType = num;
        this.switchValue = bool2;
        this.title = str2;
        this.navigationType = num2;
        this.nativePageId = str3;
        this.link = str4;
        this.picSvg = str5;
        this.picSelectSvg = str6;
        this.picStyle = i;
        this.columnColor = str7;
        this.navigateStyle = num3;
        this.navigateThemePic = str8;
    }

    public /* synthetic */ HomeTabItemDetail(String str, Boolean bool, Integer num, Boolean bool2, String str2, Integer num2, String str3, String str4, String str5, String str6, int i, String str7, Integer num3, String str8, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? Boolean.FALSE : bool, (i2 & 4) != 0 ? -1 : num, (i2 & 8) != 0 ? Boolean.FALSE : bool2, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? 1 : num2, (i2 & 64) != 0 ? "" : str3, (i2 & 128) != 0 ? "" : str4, (i2 & 256) != 0 ? "" : str5, (i2 & 512) != 0 ? "" : str6, (i2 & 1024) != 0 ? 0 : i, (i2 & 2048) != 0 ? "" : str7, (i2 & 4096) != 0 ? 1 : num3, (i2 & 8192) == 0 ? str8 : "");
    }
}
