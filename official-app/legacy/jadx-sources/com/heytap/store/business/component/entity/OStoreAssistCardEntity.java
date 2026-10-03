package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B«\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¯\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010B\u001a\u00020\t2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0015\"\u0004\b\u001f\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010&\"\u0004\b'\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0015\"\u0004\b0\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0015\"\u0004\b2\u0010\u0017¨\u0006G"}, d2 = {"Lcom/heytap/store/business/component/entity/OStoreAssistCardEntity;", "", "title", "", "secondTitle", "buttonDesc", "backgroundColor", "pic", "isLogin", "", "link", "titleExt", "transparent", "adType", "adId", "adName", "adDetail", "exposureReportBean", "Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;)V", "getAdDetail", "()Ljava/lang/String;", "setAdDetail", "(Ljava/lang/String;)V", "getAdId", "setAdId", "getAdName", "setAdName", "getAdType", "setAdType", "getBackgroundColor", "setBackgroundColor", "getButtonDesc", "setButtonDesc", "getExposureReportBean", "()Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;", "setExposureReportBean", "(Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;)V", "()Z", "setLogin", "(Z)V", "getLink", "setLink", "getPic", "setPic", "getSecondTitle", "getTitle", "getTitleExt", "setTitleExt", "getTransparent", "setTransparent", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class OStoreAssistCardEntity {

    @Nullable
    private String adDetail;

    @Nullable
    private String adId;

    @Nullable
    private String adName;

    @Nullable
    private String adType;

    @Nullable
    private String backgroundColor;

    @Nullable
    private String buttonDesc;

    @Nullable
    private SensorsBean exposureReportBean;
    private boolean isLogin;

    @Nullable
    private String link;

    @Nullable
    private String pic;

    @Nullable
    private final String secondTitle;

    @Nullable
    private final String title;

    @Nullable
    private String titleExt;

    @Nullable
    private String transparent;

    public OStoreAssistCardEntity() {
        this(null, null, null, null, null, false, null, null, null, null, null, null, null, null, 16383, null);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAdType() {
        return this.adType;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getAdName() {
        return this.adName;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getAdDetail() {
        return this.adDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final SensorsBean getExposureReportBean() {
        return this.exposureReportBean;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSecondTitle() {
        return this.secondTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getButtonDesc() {
        return this.buttonDesc;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPic() {
        return this.pic;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsLogin() {
        return this.isLogin;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitleExt() {
        return this.titleExt;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTransparent() {
        return this.transparent;
    }

    @NotNull
    public final OStoreAssistCardEntity copy(@Nullable String title, @Nullable String secondTitle, @Nullable String buttonDesc, @Nullable String backgroundColor, @Nullable String pic, boolean isLogin, @Nullable String link, @Nullable String titleExt, @Nullable String transparent, @Nullable String adType, @Nullable String adId, @Nullable String adName, @Nullable String adDetail, @Nullable SensorsBean exposureReportBean) {
        return new OStoreAssistCardEntity(title, secondTitle, buttonDesc, backgroundColor, pic, isLogin, link, titleExt, transparent, adType, adId, adName, adDetail, exposureReportBean);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OStoreAssistCardEntity)) {
            return false;
        }
        OStoreAssistCardEntity oStoreAssistCardEntity = (OStoreAssistCardEntity) other;
        return Intrinsics.areEqual(this.title, oStoreAssistCardEntity.title) && Intrinsics.areEqual(this.secondTitle, oStoreAssistCardEntity.secondTitle) && Intrinsics.areEqual(this.buttonDesc, oStoreAssistCardEntity.buttonDesc) && Intrinsics.areEqual(this.backgroundColor, oStoreAssistCardEntity.backgroundColor) && Intrinsics.areEqual(this.pic, oStoreAssistCardEntity.pic) && this.isLogin == oStoreAssistCardEntity.isLogin && Intrinsics.areEqual(this.link, oStoreAssistCardEntity.link) && Intrinsics.areEqual(this.titleExt, oStoreAssistCardEntity.titleExt) && Intrinsics.areEqual(this.transparent, oStoreAssistCardEntity.transparent) && Intrinsics.areEqual(this.adType, oStoreAssistCardEntity.adType) && Intrinsics.areEqual(this.adId, oStoreAssistCardEntity.adId) && Intrinsics.areEqual(this.adName, oStoreAssistCardEntity.adName) && Intrinsics.areEqual(this.adDetail, oStoreAssistCardEntity.adDetail) && Intrinsics.areEqual(this.exposureReportBean, oStoreAssistCardEntity.exposureReportBean);
    }

    @Nullable
    public final String getAdDetail() {
        return this.adDetail;
    }

    @Nullable
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    public final String getAdName() {
        return this.adName;
    }

    @Nullable
    public final String getAdType() {
        return this.adType;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final String getButtonDesc() {
        return this.buttonDesc;
    }

    @Nullable
    public final SensorsBean getExposureReportBean() {
        return this.exposureReportBean;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getPic() {
        return this.pic;
    }

    @Nullable
    public final String getSecondTitle() {
        return this.secondTitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTitleExt() {
        return this.titleExt;
    }

    @Nullable
    public final String getTransparent() {
        return this.transparent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v47 */
    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.secondTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonDesc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.backgroundColor;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pic;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        boolean z = this.isLogin;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode5 + r2) * 31;
        String str6 = this.link;
        int iHashCode6 = (i + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.titleExt;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.transparent;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.adType;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.adId;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.adName;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.adDetail;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        SensorsBean sensorsBean = this.exposureReportBean;
        return iHashCode12 + (sensorsBean != null ? sensorsBean.hashCode() : 0);
    }

    public final boolean isLogin() {
        return this.isLogin;
    }

    public final void setAdDetail(@Nullable String str) {
        this.adDetail = str;
    }

    public final void setAdId(@Nullable String str) {
        this.adId = str;
    }

    public final void setAdName(@Nullable String str) {
        this.adName = str;
    }

    public final void setAdType(@Nullable String str) {
        this.adType = str;
    }

    public final void setBackgroundColor(@Nullable String str) {
        this.backgroundColor = str;
    }

    public final void setButtonDesc(@Nullable String str) {
        this.buttonDesc = str;
    }

    public final void setExposureReportBean(@Nullable SensorsBean sensorsBean) {
        this.exposureReportBean = sensorsBean;
    }

    public final void setLink(@Nullable String str) {
        this.link = str;
    }

    public final void setLogin(boolean z) {
        this.isLogin = z;
    }

    public final void setPic(@Nullable String str) {
        this.pic = str;
    }

    public final void setTitleExt(@Nullable String str) {
        this.titleExt = str;
    }

    public final void setTransparent(@Nullable String str) {
        this.transparent = str;
    }

    @NotNull
    public String toString() {
        return "OStoreAssistCardEntity(title=" + ((Object) this.title) + ", secondTitle=" + ((Object) this.secondTitle) + ", buttonDesc=" + ((Object) this.buttonDesc) + ", backgroundColor=" + ((Object) this.backgroundColor) + ", pic=" + ((Object) this.pic) + ", isLogin=" + this.isLogin + ", link=" + ((Object) this.link) + ", titleExt=" + ((Object) this.titleExt) + ", transparent=" + ((Object) this.transparent) + ", adType=" + ((Object) this.adType) + ", adId=" + ((Object) this.adId) + ", adName=" + ((Object) this.adName) + ", adDetail=" + ((Object) this.adDetail) + ", exposureReportBean=" + this.exposureReportBean + ')';
    }

    public OStoreAssistCardEntity(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable SensorsBean sensorsBean) {
        this.title = str;
        this.secondTitle = str2;
        this.buttonDesc = str3;
        this.backgroundColor = str4;
        this.pic = str5;
        this.isLogin = z;
        this.link = str6;
        this.titleExt = str7;
        this.transparent = str8;
        this.adType = str9;
        this.adId = str10;
        this.adName = str11;
        this.adDetail = str12;
        this.exposureReportBean = sensorsBean;
    }

    public /* synthetic */ OStoreAssistCardEntity(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SensorsBean sensorsBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? false : z, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) == 0 ? str12 : "", (i & 8192) != 0 ? null : sensorsBean);
    }
}
