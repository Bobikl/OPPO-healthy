package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import com.heytap.store.homemodule.data.blackcard.BlackMemberDetailVo;
import com.oplus.aiunit.vision.hp6;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b5\b\u0017\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0004\u0018\u00010!8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001e\u00106\u001a\u0004\u0018\u00010!8FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010#\"\u0004\b8\u0010%R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010E\"\u0004\bF\u0010GR\u001a\u0010\u0014\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010B\"\u0004\bI\u0010DR\u001a\u0010\r\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010B\"\u0004\bK\u0010DR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010'\"\u0004\bM\u0010)R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010B\"\u0004\bO\u0010DR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010'\"\u0004\bU\u0010)¨\u0006V"}, d2 = {"Lcom/heytap/store/homemodule/data/HomeDataBean;", "", "componentCode", "", hp6.DETAIL_ENTRY, "", "Lcom/heytap/store/homemodule/data/HomeItemDetail;", "title", "headerInfo", "Lcom/heytap/store/homemodule/data/HomeItemHeaderInfo;", "seq", "", "id", "modelCode", "moduleCode", "styleInfo", "Lcom/heytap/store/homemodule/data/HomeItemStyleInfo;", "blackMemberDetailVo", "Lcom/heytap/store/homemodule/data/blackcard/BlackMemberDetailVo;", "extensionObj", "listIndex", "deviceData", "Lcom/heytap/store/homemodule/data/DeviceDetailData;", "isPad", "", "currentTime", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/heytap/store/homemodule/data/HomeItemHeaderInfo;IIILjava/lang/String;Lcom/heytap/store/homemodule/data/HomeItemStyleInfo;Lcom/heytap/store/homemodule/data/blackcard/BlackMemberDetailVo;Ljava/lang/Object;ILcom/heytap/store/homemodule/data/DeviceDetailData;ZJ)V", "getBlackMemberDetailVo", "()Lcom/heytap/store/homemodule/data/blackcard/BlackMemberDetailVo;", "setBlackMemberDetailVo", "(Lcom/heytap/store/homemodule/data/blackcard/BlackMemberDetailVo;)V", "clickReportBean", "Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;", "getClickReportBean", "()Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;", "setClickReportBean", "(Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;)V", "getComponentCode", "()Ljava/lang/String;", "setComponentCode", "(Ljava/lang/String;)V", "getCurrentTime", "()J", "setCurrentTime", "(J)V", "getDetails", "()Ljava/util/List;", "setDetails", "(Ljava/util/List;)V", "getDeviceData", "()Lcom/heytap/store/homemodule/data/DeviceDetailData;", "setDeviceData", "(Lcom/heytap/store/homemodule/data/DeviceDetailData;)V", "exposureReportBean", "getExposureReportBean", "setExposureReportBean", "getExtensionObj", "()Ljava/lang/Object;", "setExtensionObj", "(Ljava/lang/Object;)V", "getHeaderInfo", "()Lcom/heytap/store/homemodule/data/HomeItemHeaderInfo;", "setHeaderInfo", "(Lcom/heytap/store/homemodule/data/HomeItemHeaderInfo;)V", "getId", "()I", "setId", "(I)V", "()Z", "setPad", "(Z)V", "getListIndex", "setListIndex", "getModelCode", "setModelCode", "getModuleCode", "setModuleCode", "getSeq", "setSeq", "getStyleInfo", "()Lcom/heytap/store/homemodule/data/HomeItemStyleInfo;", "setStyleInfo", "(Lcom/heytap/store/homemodule/data/HomeItemStyleInfo;)V", "getTitle", "setTitle", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class HomeDataBean {

    @Nullable
    private BlackMemberDetailVo blackMemberDetailVo;

    @Nullable
    private SensorsBean clickReportBean;

    @NotNull
    private String componentCode;
    private long currentTime;

    @Nullable
    private List<? extends HomeItemDetail> details;

    @Nullable
    private DeviceDetailData deviceData;

    @Nullable
    private SensorsBean exposureReportBean;

    @Nullable
    private Object extensionObj;

    @Nullable
    private HomeItemHeaderInfo headerInfo;
    private int id;
    private boolean isPad;
    private int listIndex;
    private int modelCode;

    @NotNull
    private String moduleCode;
    private int seq;

    @Nullable
    private HomeItemStyleInfo styleInfo;

    @NotNull
    private String title;

    public HomeDataBean() {
        this(null, null, null, null, 0, 0, 0, null, null, null, null, 0, null, false, 0L, 32767, null);
    }

    @Nullable
    public final BlackMemberDetailVo getBlackMemberDetailVo() {
        return this.blackMemberDetailVo;
    }

    @Nullable
    public final SensorsBean getClickReportBean() {
        SensorsBean sensorsBean = this.clickReportBean;
        if (sensorsBean == null) {
            return null;
        }
        return sensorsBean.clone();
    }

    @NotNull
    public final String getComponentCode() {
        return this.componentCode;
    }

    public final long getCurrentTime() {
        return this.currentTime;
    }

    @Nullable
    public final List<HomeItemDetail> getDetails() {
        return this.details;
    }

    @Nullable
    public final DeviceDetailData getDeviceData() {
        return this.deviceData;
    }

    @Nullable
    public final SensorsBean getExposureReportBean() {
        SensorsBean sensorsBean = this.exposureReportBean;
        if (sensorsBean == null) {
            return null;
        }
        return sensorsBean.clone();
    }

    @Nullable
    public final Object getExtensionObj() {
        return this.extensionObj;
    }

    @Nullable
    public final HomeItemHeaderInfo getHeaderInfo() {
        return this.headerInfo;
    }

    public final int getId() {
        return this.id;
    }

    public final int getListIndex() {
        return this.listIndex;
    }

    public final int getModelCode() {
        return this.modelCode;
    }

    @NotNull
    public final String getModuleCode() {
        return this.moduleCode;
    }

    public final int getSeq() {
        return this.seq;
    }

    @Nullable
    public final HomeItemStyleInfo getStyleInfo() {
        return this.styleInfo;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: isPad, reason: from getter */
    public final boolean getIsPad() {
        return this.isPad;
    }

    public final void setBlackMemberDetailVo(@Nullable BlackMemberDetailVo blackMemberDetailVo) {
        this.blackMemberDetailVo = blackMemberDetailVo;
    }

    public final void setClickReportBean(@Nullable SensorsBean sensorsBean) {
        this.clickReportBean = sensorsBean;
    }

    public final void setComponentCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.componentCode = str;
    }

    public final void setCurrentTime(long j2) {
        this.currentTime = j2;
    }

    public final void setDetails(@Nullable List<? extends HomeItemDetail> list) {
        this.details = list;
    }

    public final void setDeviceData(@Nullable DeviceDetailData deviceDetailData) {
        this.deviceData = deviceDetailData;
    }

    public final void setExposureReportBean(@Nullable SensorsBean sensorsBean) {
        this.exposureReportBean = sensorsBean;
    }

    public final void setExtensionObj(@Nullable Object obj) {
        this.extensionObj = obj;
    }

    public final void setHeaderInfo(@Nullable HomeItemHeaderInfo homeItemHeaderInfo) {
        this.headerInfo = homeItemHeaderInfo;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setListIndex(int i) {
        this.listIndex = i;
    }

    public final void setModelCode(int i) {
        this.modelCode = i;
    }

    public final void setModuleCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.moduleCode = str;
    }

    public final void setPad(boolean z) {
        this.isPad = z;
    }

    public final void setSeq(int i) {
        this.seq = i;
    }

    public final void setStyleInfo(@Nullable HomeItemStyleInfo homeItemStyleInfo) {
        this.styleInfo = homeItemStyleInfo;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public HomeDataBean(@NotNull String componentCode, @Nullable List<? extends HomeItemDetail> list, @NotNull String title, @Nullable HomeItemHeaderInfo homeItemHeaderInfo, int i, int i2, int i3, @NotNull String moduleCode, @Nullable HomeItemStyleInfo homeItemStyleInfo, @Nullable BlackMemberDetailVo blackMemberDetailVo, @Nullable Object obj, int i4, @Nullable DeviceDetailData deviceDetailData, boolean z, long j2) {
        Intrinsics.checkNotNullParameter(componentCode, "componentCode");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(moduleCode, "moduleCode");
        this.componentCode = componentCode;
        this.details = list;
        this.title = title;
        this.headerInfo = homeItemHeaderInfo;
        this.seq = i;
        this.id = i2;
        this.modelCode = i3;
        this.moduleCode = moduleCode;
        this.styleInfo = homeItemStyleInfo;
        this.blackMemberDetailVo = blackMemberDetailVo;
        this.extensionObj = obj;
        this.listIndex = i4;
        this.deviceData = deviceDetailData;
        this.isPad = z;
        this.currentTime = j2;
    }

    public /* synthetic */ HomeDataBean(String str, List list, String str2, HomeItemHeaderInfo homeItemHeaderInfo, int i, int i2, int i3, String str3, HomeItemStyleInfo homeItemStyleInfo, BlackMemberDetailVo blackMemberDetailVo, Object obj, int i4, DeviceDetailData deviceDetailData, boolean z, long j2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? null : list, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? null : homeItemHeaderInfo, (i5 & 16) != 0 ? -999999 : i, (i5 & 32) != 0 ? 0 : i2, (i5 & 64) != 0 ? -1 : i3, (i5 & 128) == 0 ? str3 : "", (i5 & 256) != 0 ? null : homeItemStyleInfo, (i5 & 512) != 0 ? null : blackMemberDetailVo, (i5 & 1024) != 0 ? null : obj, (i5 & 2048) == 0 ? i4 : -1, (i5 & 4096) == 0 ? deviceDetailData : null, (i5 & 8192) == 0 ? z : false, (i5 & 16384) != 0 ? 0L : j2);
    }
}
