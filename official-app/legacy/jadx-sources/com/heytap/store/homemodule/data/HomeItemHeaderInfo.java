package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bH\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0011HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0006HÆ\u0003J\t\u0010V\u001a\u00020\u0011HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0006HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0006HÆ\u0003J\t\u0010\\\u001a\u00020\u0006HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0006HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003JÉ\u0001\u0010b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001J\u0013\u0010c\u001a\u00020\u00062\b\u0010d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010e\u001a\u00020\u0011HÖ\u0001J\t\u0010f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010%\"\u0004\b)\u0010'R\u001c\u0010*\u001a\u0004\u0018\u00010\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010-\"\u0004\b0\u0010/R\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010%\"\u0004\b4\u0010'R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R\u001a\u0010\u0016\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010-\"\u0004\b8\u0010/R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010%\"\u0004\b:\u0010'R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010%\"\u0004\b<\u0010'R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010%\"\u0004\b>\u0010'R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010%\"\u0004\b@\u0010'R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010%\"\u0004\bB\u0010'R\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010%\"\u0004\bD\u0010'R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010%\"\u0004\bJ\u0010'R\u001a\u0010\u0013\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010-\"\u0004\bL\u0010/R\u001a\u0010\u0014\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010F\"\u0004\bN\u0010H¨\u0006g"}, d2 = {"Lcom/heytap/store/homemodule/data/HomeItemHeaderInfo;", "", "colorScroll", "", "colorTitle", "isShowMore", "", "isShowPic", "moreLink", "moreIsLogin", "moreText", "pic", "picField", "picJson", "picJsonField", "picLink", "styleFillet", "", "title", "titleShow", "titleStyle", "picTitle", "pendantShow", "advertPendantInfo", "Lcom/heytap/store/homemodule/data/AdvertPendantInfo;", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZILjava/lang/String;ZLcom/heytap/store/homemodule/data/AdvertPendantInfo;)V", "getAdvertPendantInfo", "()Lcom/heytap/store/homemodule/data/AdvertPendantInfo;", "setAdvertPendantInfo", "(Lcom/heytap/store/homemodule/data/AdvertPendantInfo;)V", "clickReportBean", "Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;", "getClickReportBean", "()Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;", "setClickReportBean", "(Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;)V", "getColorScroll", "()Ljava/lang/String;", "setColorScroll", "(Ljava/lang/String;)V", "getColorTitle", "setColorTitle", "exposureReportBean", "getExposureReportBean", "setExposureReportBean", "()Z", "setShowMore", "(Z)V", "setShowPic", "getMoreIsLogin", "setMoreIsLogin", "getMoreLink", "setMoreLink", "getMoreText", "setMoreText", "getPendantShow", "setPendantShow", "getPic", "setPic", "getPicField", "setPicField", "getPicJson", "setPicJson", "getPicJsonField", "setPicJsonField", "getPicLink", "setPicLink", "getPicTitle", "setPicTitle", "getStyleFillet", "()I", "setStyleFillet", "(I)V", "getTitle", "setTitle", "getTitleShow", "setTitleShow", "getTitleStyle", "setTitleStyle", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class HomeItemHeaderInfo {

    @Nullable
    private AdvertPendantInfo advertPendantInfo;

    @Nullable
    private SensorsBean clickReportBean;

    @NotNull
    private String colorScroll;

    @NotNull
    private String colorTitle;

    @Nullable
    private SensorsBean exposureReportBean;
    private boolean isShowMore;
    private boolean isShowPic;
    private boolean moreIsLogin;

    @NotNull
    private String moreLink;

    @NotNull
    private String moreText;
    private boolean pendantShow;

    @NotNull
    private String pic;

    @NotNull
    private String picField;

    @NotNull
    private String picJson;

    @NotNull
    private String picJsonField;

    @NotNull
    private String picLink;

    @NotNull
    private String picTitle;
    private int styleFillet;

    @NotNull
    private String title;
    private boolean titleShow;
    private int titleStyle;

    public HomeItemHeaderInfo() {
        this(null, null, false, false, null, false, null, null, null, null, null, null, 0, null, false, 0, null, false, null, 524287, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getColorScroll() {
        return this.colorScroll;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getPicJson() {
        return this.picJson;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getPicJsonField() {
        return this.picJsonField;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getPicLink() {
        return this.picLink;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getStyleFillet() {
        return this.styleFillet;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getTitleShow() {
        return this.titleShow;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getTitleStyle() {
        return this.titleStyle;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getPicTitle() {
        return this.picTitle;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getPendantShow() {
        return this.pendantShow;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final AdvertPendantInfo getAdvertPendantInfo() {
        return this.advertPendantInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getColorTitle() {
        return this.colorTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsShowMore() {
        return this.isShowMore;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsShowPic() {
        return this.isShowPic;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMoreLink() {
        return this.moreLink;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getMoreIsLogin() {
        return this.moreIsLogin;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMoreText() {
        return this.moreText;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPicField() {
        return this.picField;
    }

    @NotNull
    public final HomeItemHeaderInfo copy(@NotNull String colorScroll, @NotNull String colorTitle, boolean isShowMore, boolean isShowPic, @NotNull String moreLink, boolean moreIsLogin, @NotNull String moreText, @NotNull String pic, @NotNull String picField, @NotNull String picJson, @NotNull String picJsonField, @NotNull String picLink, int styleFillet, @NotNull String title, boolean titleShow, int titleStyle, @NotNull String picTitle, boolean pendantShow, @Nullable AdvertPendantInfo advertPendantInfo) {
        Intrinsics.checkNotNullParameter(colorScroll, "colorScroll");
        Intrinsics.checkNotNullParameter(colorTitle, "colorTitle");
        Intrinsics.checkNotNullParameter(moreLink, "moreLink");
        Intrinsics.checkNotNullParameter(moreText, "moreText");
        Intrinsics.checkNotNullParameter(pic, "pic");
        Intrinsics.checkNotNullParameter(picField, "picField");
        Intrinsics.checkNotNullParameter(picJson, "picJson");
        Intrinsics.checkNotNullParameter(picJsonField, "picJsonField");
        Intrinsics.checkNotNullParameter(picLink, "picLink");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(picTitle, "picTitle");
        return new HomeItemHeaderInfo(colorScroll, colorTitle, isShowMore, isShowPic, moreLink, moreIsLogin, moreText, pic, picField, picJson, picJsonField, picLink, styleFillet, title, titleShow, titleStyle, picTitle, pendantShow, advertPendantInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeItemHeaderInfo)) {
            return false;
        }
        HomeItemHeaderInfo homeItemHeaderInfo = (HomeItemHeaderInfo) other;
        return Intrinsics.areEqual(this.colorScroll, homeItemHeaderInfo.colorScroll) && Intrinsics.areEqual(this.colorTitle, homeItemHeaderInfo.colorTitle) && this.isShowMore == homeItemHeaderInfo.isShowMore && this.isShowPic == homeItemHeaderInfo.isShowPic && Intrinsics.areEqual(this.moreLink, homeItemHeaderInfo.moreLink) && this.moreIsLogin == homeItemHeaderInfo.moreIsLogin && Intrinsics.areEqual(this.moreText, homeItemHeaderInfo.moreText) && Intrinsics.areEqual(this.pic, homeItemHeaderInfo.pic) && Intrinsics.areEqual(this.picField, homeItemHeaderInfo.picField) && Intrinsics.areEqual(this.picJson, homeItemHeaderInfo.picJson) && Intrinsics.areEqual(this.picJsonField, homeItemHeaderInfo.picJsonField) && Intrinsics.areEqual(this.picLink, homeItemHeaderInfo.picLink) && this.styleFillet == homeItemHeaderInfo.styleFillet && Intrinsics.areEqual(this.title, homeItemHeaderInfo.title) && this.titleShow == homeItemHeaderInfo.titleShow && this.titleStyle == homeItemHeaderInfo.titleStyle && Intrinsics.areEqual(this.picTitle, homeItemHeaderInfo.picTitle) && this.pendantShow == homeItemHeaderInfo.pendantShow && Intrinsics.areEqual(this.advertPendantInfo, homeItemHeaderInfo.advertPendantInfo);
    }

    @Nullable
    public final AdvertPendantInfo getAdvertPendantInfo() {
        return this.advertPendantInfo;
    }

    @Nullable
    public final SensorsBean getClickReportBean() {
        return this.clickReportBean;
    }

    @NotNull
    public final String getColorScroll() {
        return this.colorScroll;
    }

    @NotNull
    public final String getColorTitle() {
        return this.colorTitle;
    }

    @Nullable
    public final SensorsBean getExposureReportBean() {
        return this.exposureReportBean;
    }

    public final boolean getMoreIsLogin() {
        return this.moreIsLogin;
    }

    @NotNull
    public final String getMoreLink() {
        return this.moreLink;
    }

    @NotNull
    public final String getMoreText() {
        return this.moreText;
    }

    public final boolean getPendantShow() {
        return this.pendantShow;
    }

    @NotNull
    public final String getPic() {
        return this.pic;
    }

    @NotNull
    public final String getPicField() {
        return this.picField;
    }

    @NotNull
    public final String getPicJson() {
        return this.picJson;
    }

    @NotNull
    public final String getPicJsonField() {
        return this.picJsonField;
    }

    @NotNull
    public final String getPicLink() {
        return this.picLink;
    }

    @NotNull
    public final String getPicTitle() {
        return this.picTitle;
    }

    public final int getStyleFillet() {
        return this.styleFillet;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean getTitleShow() {
        return this.titleShow;
    }

    public final int getTitleStyle() {
        return this.titleStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v27, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.colorScroll.hashCode() * 31) + this.colorTitle.hashCode()) * 31;
        boolean z = this.isShowMore;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isShowPic;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode2 = (((i + r2) * 31) + this.moreLink.hashCode()) * 31;
        boolean z3 = this.moreIsLogin;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int iHashCode3 = (((((((((((((((((iHashCode2 + r3) * 31) + this.moreText.hashCode()) * 31) + this.pic.hashCode()) * 31) + this.picField.hashCode()) * 31) + this.picJson.hashCode()) * 31) + this.picJsonField.hashCode()) * 31) + this.picLink.hashCode()) * 31) + Integer.hashCode(this.styleFillet)) * 31) + this.title.hashCode()) * 31;
        boolean z4 = this.titleShow;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int iHashCode4 = (((((iHashCode3 + r4) * 31) + Integer.hashCode(this.titleStyle)) * 31) + this.picTitle.hashCode()) * 31;
        boolean z5 = this.pendantShow;
        int i2 = (iHashCode4 + (z5 ? 1 : z5)) * 31;
        AdvertPendantInfo advertPendantInfo = this.advertPendantInfo;
        return i2 + (advertPendantInfo == null ? 0 : advertPendantInfo.hashCode());
    }

    public final boolean isShowMore() {
        return this.isShowMore;
    }

    public final boolean isShowPic() {
        return this.isShowPic;
    }

    public final void setAdvertPendantInfo(@Nullable AdvertPendantInfo advertPendantInfo) {
        this.advertPendantInfo = advertPendantInfo;
    }

    public final void setClickReportBean(@Nullable SensorsBean sensorsBean) {
        this.clickReportBean = sensorsBean;
    }

    public final void setColorScroll(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.colorScroll = str;
    }

    public final void setColorTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.colorTitle = str;
    }

    public final void setExposureReportBean(@Nullable SensorsBean sensorsBean) {
        this.exposureReportBean = sensorsBean;
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

    @NotNull
    public String toString() {
        return "HomeItemHeaderInfo(colorScroll=" + this.colorScroll + ", colorTitle=" + this.colorTitle + ", isShowMore=" + this.isShowMore + ", isShowPic=" + this.isShowPic + ", moreLink=" + this.moreLink + ", moreIsLogin=" + this.moreIsLogin + ", moreText=" + this.moreText + ", pic=" + this.pic + ", picField=" + this.picField + ", picJson=" + this.picJson + ", picJsonField=" + this.picJsonField + ", picLink=" + this.picLink + ", styleFillet=" + this.styleFillet + ", title=" + this.title + ", titleShow=" + this.titleShow + ", titleStyle=" + this.titleStyle + ", picTitle=" + this.picTitle + ", pendantShow=" + this.pendantShow + ", advertPendantInfo=" + this.advertPendantInfo + ')';
    }

    public HomeItemHeaderInfo(@NotNull String colorScroll, @NotNull String colorTitle, boolean z, boolean z2, @NotNull String moreLink, boolean z3, @NotNull String moreText, @NotNull String pic, @NotNull String picField, @NotNull String picJson, @NotNull String picJsonField, @NotNull String picLink, int i, @NotNull String title, boolean z4, int i2, @NotNull String picTitle, boolean z5, @Nullable AdvertPendantInfo advertPendantInfo) {
        Intrinsics.checkNotNullParameter(colorScroll, "colorScroll");
        Intrinsics.checkNotNullParameter(colorTitle, "colorTitle");
        Intrinsics.checkNotNullParameter(moreLink, "moreLink");
        Intrinsics.checkNotNullParameter(moreText, "moreText");
        Intrinsics.checkNotNullParameter(pic, "pic");
        Intrinsics.checkNotNullParameter(picField, "picField");
        Intrinsics.checkNotNullParameter(picJson, "picJson");
        Intrinsics.checkNotNullParameter(picJsonField, "picJsonField");
        Intrinsics.checkNotNullParameter(picLink, "picLink");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(picTitle, "picTitle");
        this.colorScroll = colorScroll;
        this.colorTitle = colorTitle;
        this.isShowMore = z;
        this.isShowPic = z2;
        this.moreLink = moreLink;
        this.moreIsLogin = z3;
        this.moreText = moreText;
        this.pic = pic;
        this.picField = picField;
        this.picJson = picJson;
        this.picJsonField = picJsonField;
        this.picLink = picLink;
        this.styleFillet = i;
        this.title = title;
        this.titleShow = z4;
        this.titleStyle = i2;
        this.picTitle = picTitle;
        this.pendantShow = z5;
        this.advertPendantInfo = advertPendantInfo;
    }

    public /* synthetic */ HomeItemHeaderInfo(String str, String str2, boolean z, boolean z2, String str3, boolean z3, String str4, String str5, String str6, String str7, String str8, String str9, int i, String str10, boolean z4, int i2, String str11, boolean z5, AdvertPendantInfo advertPendantInfo, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? false : z3, (i3 & 64) != 0 ? "" : str4, (i3 & 128) != 0 ? "" : str5, (i3 & 256) != 0 ? "" : str6, (i3 & 512) != 0 ? "" : str7, (i3 & 1024) != 0 ? "" : str8, (i3 & 2048) != 0 ? "" : str9, (i3 & 4096) != 0 ? 0 : i, (i3 & 8192) != 0 ? "" : str10, (i3 & 16384) != 0 ? false : z4, (i3 & 32768) != 0 ? 0 : i2, (i3 & 65536) != 0 ? "" : str11, (i3 & 131072) != 0 ? false : z5, (i3 & 262144) != 0 ? null : advertPendantInfo);
    }
}
