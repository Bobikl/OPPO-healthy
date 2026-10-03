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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001dJV\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020\t2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u000200HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017¨\u00062"}, d2 = {"Lcom/heytap/store/homemodule/data/AdvertPendantInfo;", "", "id", "", "pendantStyle", "pendantIcon", "pendantText", "pendantLinks", "pendantLogin", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "clickReportBean", "Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;", "getClickReportBean", "()Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;", "setClickReportBean", "(Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;)V", "exposureReportBean", "getExposureReportBean", "setExposureReportBean", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getPendantIcon", "setPendantIcon", "getPendantLinks", "setPendantLinks", "getPendantLogin", "()Ljava/lang/Boolean;", "setPendantLogin", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPendantStyle", "setPendantStyle", "getPendantText", "setPendantText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/heytap/store/homemodule/data/AdvertPendantInfo;", "equals", "other", "hashCode", "", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AdvertPendantInfo {

    @Nullable
    private SensorsBean clickReportBean;

    @Nullable
    private SensorsBean exposureReportBean;

    @Nullable
    private String id;

    @Nullable
    private String pendantIcon;

    @Nullable
    private String pendantLinks;

    @Nullable
    private Boolean pendantLogin;

    @Nullable
    private String pendantStyle;

    @Nullable
    private String pendantText;

    public AdvertPendantInfo() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ AdvertPendantInfo copy$default(AdvertPendantInfo advertPendantInfo, String str, String str2, String str3, String str4, String str5, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advertPendantInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = advertPendantInfo.pendantStyle;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = advertPendantInfo.pendantIcon;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = advertPendantInfo.pendantText;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = advertPendantInfo.pendantLinks;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            bool = advertPendantInfo.pendantLogin;
        }
        return advertPendantInfo.copy(str, str6, str7, str8, str9, bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPendantStyle() {
        return this.pendantStyle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPendantIcon() {
        return this.pendantIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPendantText() {
        return this.pendantText;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPendantLinks() {
        return this.pendantLinks;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getPendantLogin() {
        return this.pendantLogin;
    }

    @NotNull
    public final AdvertPendantInfo copy(@Nullable String id, @Nullable String pendantStyle, @Nullable String pendantIcon, @Nullable String pendantText, @Nullable String pendantLinks, @Nullable Boolean pendantLogin) {
        return new AdvertPendantInfo(id, pendantStyle, pendantIcon, pendantText, pendantLinks, pendantLogin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertPendantInfo)) {
            return false;
        }
        AdvertPendantInfo advertPendantInfo = (AdvertPendantInfo) other;
        return Intrinsics.areEqual(this.id, advertPendantInfo.id) && Intrinsics.areEqual(this.pendantStyle, advertPendantInfo.pendantStyle) && Intrinsics.areEqual(this.pendantIcon, advertPendantInfo.pendantIcon) && Intrinsics.areEqual(this.pendantText, advertPendantInfo.pendantText) && Intrinsics.areEqual(this.pendantLinks, advertPendantInfo.pendantLinks) && Intrinsics.areEqual(this.pendantLogin, advertPendantInfo.pendantLogin);
    }

    @Nullable
    public final SensorsBean getClickReportBean() {
        return this.clickReportBean;
    }

    @Nullable
    public final SensorsBean getExposureReportBean() {
        return this.exposureReportBean;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getPendantIcon() {
        return this.pendantIcon;
    }

    @Nullable
    public final String getPendantLinks() {
        return this.pendantLinks;
    }

    @Nullable
    public final Boolean getPendantLogin() {
        return this.pendantLogin;
    }

    @Nullable
    public final String getPendantStyle() {
        return this.pendantStyle;
    }

    @Nullable
    public final String getPendantText() {
        return this.pendantText;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.pendantStyle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pendantIcon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pendantText;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pendantLinks;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.pendantLogin;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    public final void setClickReportBean(@Nullable SensorsBean sensorsBean) {
        this.clickReportBean = sensorsBean;
    }

    public final void setExposureReportBean(@Nullable SensorsBean sensorsBean) {
        this.exposureReportBean = sensorsBean;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setPendantIcon(@Nullable String str) {
        this.pendantIcon = str;
    }

    public final void setPendantLinks(@Nullable String str) {
        this.pendantLinks = str;
    }

    public final void setPendantLogin(@Nullable Boolean bool) {
        this.pendantLogin = bool;
    }

    public final void setPendantStyle(@Nullable String str) {
        this.pendantStyle = str;
    }

    public final void setPendantText(@Nullable String str) {
        this.pendantText = str;
    }

    @NotNull
    public String toString() {
        return "AdvertPendantInfo(id=" + ((Object) this.id) + ", pendantStyle=" + ((Object) this.pendantStyle) + ", pendantIcon=" + ((Object) this.pendantIcon) + ", pendantText=" + ((Object) this.pendantText) + ", pendantLinks=" + ((Object) this.pendantLinks) + ", pendantLogin=" + this.pendantLogin + ')';
    }

    public AdvertPendantInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Boolean bool) {
        this.id = str;
        this.pendantStyle = str2;
        this.pendantIcon = str3;
        this.pendantText = str4;
        this.pendantLinks = str5;
        this.pendantLogin = bool;
    }

    public /* synthetic */ AdvertPendantInfo(String str, String str2, String str3, String str4, String str5, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? Boolean.FALSE : bool);
    }
}
