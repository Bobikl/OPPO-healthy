package com.heytap.store.product_support.data;

import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0002\u0010\u0012J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\nHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\rHÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\nHÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u00109J\u0092\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010KJ\u0013\u0010L\u001a\u00020\n2\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020\rHÖ\u0001J\t\u0010P\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001c\u0010#\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 R\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0011\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010'\"\u0004\b*\u0010)R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010'\"\u0004\b+\u0010)R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0014\"\u0004\b/\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0014\"\u0004\b7\u0010\u0016R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010<\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006Q"}, d2 = {"Lcom/heytap/store/product_support/data/RecommendReportData;", "Ljava/io/Serializable;", "moduleName", "", "sectionId", "moduleCode", "attach", SensorsBean.ATTACH2, "adDetail", "isTitleAttachModuleName", "", "omsId", "weight", "", "fromStrategy", "exitSource", "position", "isFromHomePage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;IZ)V", "getAdDetail", "()Ljava/lang/String;", "setAdDetail", "(Ljava/lang/String;)V", "getAttach", "setAttach", "getAttach2", "setAttach2", "clickReportBean", "Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;", "getClickReportBean", "()Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;", "setClickReportBean", "(Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;)V", "getExitSource", "setExitSource", "exposureReportBean", "getExposureReportBean", "setExposureReportBean", "getFromStrategy", "()Z", "setFromStrategy", "(Z)V", "setFromHomePage", "setTitleAttachModuleName", "getModuleCode", "setModuleCode", "getModuleName", "setModuleName", "getOmsId", "setOmsId", "getPosition", "()I", "setPosition", "(I)V", "getSectionId", "setSectionId", "getWeight", "()Ljava/lang/Integer;", "setWeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Integer;ZLjava/lang/String;IZ)Lcom/heytap/store/product_support/data/RecommendReportData;", "equals", "other", "", "hashCode", "toString", "product-support_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class RecommendReportData implements Serializable {

    @NotNull
    private String adDetail;

    @NotNull
    private String attach;

    @NotNull
    private String attach2;

    @Nullable
    private SensorsBean clickReportBean;

    @NotNull
    private String exitSource;

    @Nullable
    private SensorsBean exposureReportBean;
    private boolean fromStrategy;
    private boolean isFromHomePage;
    private boolean isTitleAttachModuleName;

    @NotNull
    private String moduleCode;

    @NotNull
    private String moduleName;

    @NotNull
    private String omsId;
    private int position;

    @NotNull
    private String sectionId;

    @Nullable
    private Integer weight;

    public RecommendReportData() {
        this(null, null, null, null, null, null, false, null, null, false, null, 0, false, 8191, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getModuleName() {
        return this.moduleName;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getFromStrategy() {
        return this.fromStrategy;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getExitSource() {
        return this.exitSource;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsFromHomePage() {
        return this.isFromHomePage;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSectionId() {
        return this.sectionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAttach() {
        return this.attach;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAttach2() {
        return this.attach2;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAdDetail() {
        return this.adDetail;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsTitleAttachModuleName() {
        return this.isTitleAttachModuleName;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getOmsId() {
        return this.omsId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getWeight() {
        return this.weight;
    }

    @NotNull
    public final RecommendReportData copy(@NotNull String moduleName, @NotNull String sectionId, @NotNull String moduleCode, @NotNull String attach, @NotNull String attach2, @NotNull String adDetail, boolean isTitleAttachModuleName, @NotNull String omsId, @Nullable Integer weight, boolean fromStrategy, @NotNull String exitSource, int position, boolean isFromHomePage) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(moduleCode, "moduleCode");
        Intrinsics.checkNotNullParameter(attach, "attach");
        Intrinsics.checkNotNullParameter(attach2, "attach2");
        Intrinsics.checkNotNullParameter(adDetail, "adDetail");
        Intrinsics.checkNotNullParameter(omsId, "omsId");
        Intrinsics.checkNotNullParameter(exitSource, "exitSource");
        return new RecommendReportData(moduleName, sectionId, moduleCode, attach, attach2, adDetail, isTitleAttachModuleName, omsId, weight, fromStrategy, exitSource, position, isFromHomePage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendReportData)) {
            return false;
        }
        RecommendReportData recommendReportData = (RecommendReportData) other;
        return Intrinsics.areEqual(this.moduleName, recommendReportData.moduleName) && Intrinsics.areEqual(this.sectionId, recommendReportData.sectionId) && Intrinsics.areEqual(this.moduleCode, recommendReportData.moduleCode) && Intrinsics.areEqual(this.attach, recommendReportData.attach) && Intrinsics.areEqual(this.attach2, recommendReportData.attach2) && Intrinsics.areEqual(this.adDetail, recommendReportData.adDetail) && this.isTitleAttachModuleName == recommendReportData.isTitleAttachModuleName && Intrinsics.areEqual(this.omsId, recommendReportData.omsId) && Intrinsics.areEqual(this.weight, recommendReportData.weight) && this.fromStrategy == recommendReportData.fromStrategy && Intrinsics.areEqual(this.exitSource, recommendReportData.exitSource) && this.position == recommendReportData.position && this.isFromHomePage == recommendReportData.isFromHomePage;
    }

    @NotNull
    public final String getAdDetail() {
        return this.adDetail;
    }

    @NotNull
    public final String getAttach() {
        return this.attach;
    }

    @NotNull
    public final String getAttach2() {
        return this.attach2;
    }

    @Nullable
    public final SensorsBean getClickReportBean() {
        return this.clickReportBean;
    }

    @NotNull
    public final String getExitSource() {
        return this.exitSource;
    }

    @Nullable
    public final SensorsBean getExposureReportBean() {
        return this.exposureReportBean;
    }

    public final boolean getFromStrategy() {
        return this.fromStrategy;
    }

    @NotNull
    public final String getModuleCode() {
        return this.moduleCode;
    }

    @NotNull
    public final String getModuleName() {
        return this.moduleName;
    }

    @NotNull
    public final String getOmsId() {
        return this.omsId;
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final String getSectionId() {
        return this.sectionId;
    }

    @Nullable
    public final Integer getWeight() {
        return this.weight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((this.moduleName.hashCode() * 31) + this.sectionId.hashCode()) * 31) + this.moduleCode.hashCode()) * 31) + this.attach.hashCode()) * 31) + this.attach2.hashCode()) * 31) + this.adDetail.hashCode()) * 31;
        boolean z = this.isTitleAttachModuleName;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((iHashCode + r1) * 31) + this.omsId.hashCode()) * 31;
        Integer num = this.weight;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z2 = this.fromStrategy;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode4 = (((((iHashCode3 + r2) * 31) + this.exitSource.hashCode()) * 31) + Integer.hashCode(this.position)) * 31;
        boolean z3 = this.isFromHomePage;
        return iHashCode4 + (z3 ? 1 : z3);
    }

    public final boolean isFromHomePage() {
        return this.isFromHomePage;
    }

    public final boolean isTitleAttachModuleName() {
        return this.isTitleAttachModuleName;
    }

    public final void setAdDetail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adDetail = str;
    }

    public final void setAttach(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.attach = str;
    }

    public final void setAttach2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.attach2 = str;
    }

    public final void setClickReportBean(@Nullable SensorsBean sensorsBean) {
        this.clickReportBean = sensorsBean;
    }

    public final void setExitSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.exitSource = str;
    }

    public final void setExposureReportBean(@Nullable SensorsBean sensorsBean) {
        this.exposureReportBean = sensorsBean;
    }

    public final void setFromHomePage(boolean z) {
        this.isFromHomePage = z;
    }

    public final void setFromStrategy(boolean z) {
        this.fromStrategy = z;
    }

    public final void setModuleCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.moduleCode = str;
    }

    public final void setModuleName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.moduleName = str;
    }

    public final void setOmsId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.omsId = str;
    }

    public final void setPosition(int i) {
        this.position = i;
    }

    public final void setSectionId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sectionId = str;
    }

    public final void setTitleAttachModuleName(boolean z) {
        this.isTitleAttachModuleName = z;
    }

    public final void setWeight(@Nullable Integer num) {
        this.weight = num;
    }

    @NotNull
    public String toString() {
        return "RecommendReportData(moduleName=" + this.moduleName + ", sectionId=" + this.sectionId + ", moduleCode=" + this.moduleCode + ", attach=" + this.attach + ", attach2=" + this.attach2 + ", adDetail=" + this.adDetail + ", isTitleAttachModuleName=" + this.isTitleAttachModuleName + ", omsId=" + this.omsId + ", weight=" + this.weight + ", fromStrategy=" + this.fromStrategy + ", exitSource=" + this.exitSource + ", position=" + this.position + ", isFromHomePage=" + this.isFromHomePage + ')';
    }

    public RecommendReportData(@NotNull String moduleName, @NotNull String sectionId, @NotNull String moduleCode, @NotNull String attach, @NotNull String attach2, @NotNull String adDetail, boolean z, @NotNull String omsId, @Nullable Integer num, boolean z2, @NotNull String exitSource, int i, boolean z3) {
        Intrinsics.checkNotNullParameter(moduleName, "moduleName");
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(moduleCode, "moduleCode");
        Intrinsics.checkNotNullParameter(attach, "attach");
        Intrinsics.checkNotNullParameter(attach2, "attach2");
        Intrinsics.checkNotNullParameter(adDetail, "adDetail");
        Intrinsics.checkNotNullParameter(omsId, "omsId");
        Intrinsics.checkNotNullParameter(exitSource, "exitSource");
        this.moduleName = moduleName;
        this.sectionId = sectionId;
        this.moduleCode = moduleCode;
        this.attach = attach;
        this.attach2 = attach2;
        this.adDetail = adDetail;
        this.isTitleAttachModuleName = z;
        this.omsId = omsId;
        this.weight = num;
        this.fromStrategy = z2;
        this.exitSource = exitSource;
        this.position = i;
        this.isFromHomePage = z3;
    }

    public /* synthetic */ RecommendReportData(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, Integer num, boolean z2, String str8, int i, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? "" : str7, (i2 & 256) != 0 ? null : num, (i2 & 512) != 0 ? false : z2, (i2 & 1024) == 0 ? str8 : "", (i2 & 2048) != 0 ? 0 : i, (i2 & 4096) == 0 ? z3 : false);
    }
}
