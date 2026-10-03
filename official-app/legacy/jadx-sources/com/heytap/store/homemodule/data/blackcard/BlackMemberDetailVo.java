package com.heytap.store.homemodule.data.blackcard;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0002\u0010\u0014J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0005HÆ\u0003J\t\u0010;\u001a\u00020\u0007HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010=\u001a\u00020\u0007HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u0081\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0007HÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0005HÖ\u0001J\t\u0010G\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0013\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\u001a\u0010\u0012\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001a\"\u0004\b&\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001cR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006H"}, d2 = {"Lcom/heytap/store/homemodule/data/blackcard/BlackMemberDetailVo;", "", "userId", "", "status", "", "title", "", "btnInfo", "Lcom/heytap/store/homemodule/data/blackcard/BtnInfoVo;", "freezeText", "startTime", "endTime", "vipRights", "", "Lcom/heytap/store/homemodule/data/blackcard/VipRightVO;", "styleInfo", "Lcom/heytap/store/homemodule/data/blackcard/StyleInfoVO;", "protocolUrl", "protocolTitle", "(JILjava/lang/String;Lcom/heytap/store/homemodule/data/blackcard/BtnInfoVo;Ljava/lang/String;JJLjava/util/List;Lcom/heytap/store/homemodule/data/blackcard/StyleInfoVO;Ljava/lang/String;Ljava/lang/String;)V", "getBtnInfo", "()Lcom/heytap/store/homemodule/data/blackcard/BtnInfoVo;", "setBtnInfo", "(Lcom/heytap/store/homemodule/data/blackcard/BtnInfoVo;)V", "getEndTime", "()J", "setEndTime", "(J)V", "getFreezeText", "()Ljava/lang/String;", "setFreezeText", "(Ljava/lang/String;)V", "getProtocolTitle", "setProtocolTitle", "getProtocolUrl", "setProtocolUrl", "getStartTime", "setStartTime", "getStatus", "()I", "setStatus", "(I)V", "getStyleInfo", "()Lcom/heytap/store/homemodule/data/blackcard/StyleInfoVO;", "setStyleInfo", "(Lcom/heytap/store/homemodule/data/blackcard/StyleInfoVO;)V", "getTitle", "setTitle", "getUserId", "setUserId", "getVipRights", "()Ljava/util/List;", "setVipRights", "(Ljava/util/List;)V", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class BlackMemberDetailVo {

    @Nullable
    private BtnInfoVo btnInfo;
    private long endTime;

    @NotNull
    private String freezeText;

    @NotNull
    private String protocolTitle;

    @NotNull
    private String protocolUrl;
    private long startTime;
    private int status;

    @Nullable
    private StyleInfoVO styleInfo;

    @NotNull
    private String title;
    private long userId;

    @NotNull
    private List<VipRightVO> vipRights;

    public BlackMemberDetailVo(long j2, int i, @NotNull String title, @Nullable BtnInfoVo btnInfoVo, @NotNull String freezeText, long j3, long j4, @NotNull List<VipRightVO> vipRights, @Nullable StyleInfoVO styleInfoVO, @NotNull String protocolUrl, @NotNull String protocolTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(freezeText, "freezeText");
        Intrinsics.checkNotNullParameter(vipRights, "vipRights");
        Intrinsics.checkNotNullParameter(protocolUrl, "protocolUrl");
        Intrinsics.checkNotNullParameter(protocolTitle, "protocolTitle");
        this.userId = j2;
        this.status = i;
        this.title = title;
        this.btnInfo = btnInfoVo;
        this.freezeText = freezeText;
        this.startTime = j3;
        this.endTime = j4;
        this.vipRights = vipRights;
        this.styleInfo = styleInfoVO;
        this.protocolUrl = protocolUrl;
        this.protocolTitle = protocolTitle;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getProtocolUrl() {
        return this.protocolUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getProtocolTitle() {
        return this.protocolTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BtnInfoVo getBtnInfo() {
        return this.btnInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFreezeText() {
        return this.freezeText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final List<VipRightVO> component8() {
        return this.vipRights;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final StyleInfoVO getStyleInfo() {
        return this.styleInfo;
    }

    @NotNull
    public final BlackMemberDetailVo copy(long userId, int status, @NotNull String title, @Nullable BtnInfoVo btnInfo, @NotNull String freezeText, long startTime, long endTime, @NotNull List<VipRightVO> vipRights, @Nullable StyleInfoVO styleInfo, @NotNull String protocolUrl, @NotNull String protocolTitle) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(freezeText, "freezeText");
        Intrinsics.checkNotNullParameter(vipRights, "vipRights");
        Intrinsics.checkNotNullParameter(protocolUrl, "protocolUrl");
        Intrinsics.checkNotNullParameter(protocolTitle, "protocolTitle");
        return new BlackMemberDetailVo(userId, status, title, btnInfo, freezeText, startTime, endTime, vipRights, styleInfo, protocolUrl, protocolTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackMemberDetailVo)) {
            return false;
        }
        BlackMemberDetailVo blackMemberDetailVo = (BlackMemberDetailVo) other;
        return this.userId == blackMemberDetailVo.userId && this.status == blackMemberDetailVo.status && Intrinsics.areEqual(this.title, blackMemberDetailVo.title) && Intrinsics.areEqual(this.btnInfo, blackMemberDetailVo.btnInfo) && Intrinsics.areEqual(this.freezeText, blackMemberDetailVo.freezeText) && this.startTime == blackMemberDetailVo.startTime && this.endTime == blackMemberDetailVo.endTime && Intrinsics.areEqual(this.vipRights, blackMemberDetailVo.vipRights) && Intrinsics.areEqual(this.styleInfo, blackMemberDetailVo.styleInfo) && Intrinsics.areEqual(this.protocolUrl, blackMemberDetailVo.protocolUrl) && Intrinsics.areEqual(this.protocolTitle, blackMemberDetailVo.protocolTitle);
    }

    @Nullable
    public final BtnInfoVo getBtnInfo() {
        return this.btnInfo;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final String getFreezeText() {
        return this.freezeText;
    }

    @NotNull
    public final String getProtocolTitle() {
        return this.protocolTitle;
    }

    @NotNull
    public final String getProtocolUrl() {
        return this.protocolUrl;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final StyleInfoVO getStyleInfo() {
        return this.styleInfo;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    public final List<VipRightVO> getVipRights() {
        return this.vipRights;
    }

    public int hashCode() {
        int iHashCode = ((((Long.hashCode(this.userId) * 31) + Integer.hashCode(this.status)) * 31) + this.title.hashCode()) * 31;
        BtnInfoVo btnInfoVo = this.btnInfo;
        int iHashCode2 = (((((((((iHashCode + (btnInfoVo == null ? 0 : btnInfoVo.hashCode())) * 31) + this.freezeText.hashCode()) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime)) * 31) + this.vipRights.hashCode()) * 31;
        StyleInfoVO styleInfoVO = this.styleInfo;
        return ((((iHashCode2 + (styleInfoVO != null ? styleInfoVO.hashCode() : 0)) * 31) + this.protocolUrl.hashCode()) * 31) + this.protocolTitle.hashCode();
    }

    public final void setBtnInfo(@Nullable BtnInfoVo btnInfoVo) {
        this.btnInfo = btnInfoVo;
    }

    public final void setEndTime(long j2) {
        this.endTime = j2;
    }

    public final void setFreezeText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.freezeText = str;
    }

    public final void setProtocolTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.protocolTitle = str;
    }

    public final void setProtocolUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.protocolUrl = str;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setStyleInfo(@Nullable StyleInfoVO styleInfoVO) {
        this.styleInfo = styleInfoVO;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setUserId(long j2) {
        this.userId = j2;
    }

    public final void setVipRights(@NotNull List<VipRightVO> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.vipRights = list;
    }

    @NotNull
    public String toString() {
        return "BlackMemberDetailVo(userId=" + this.userId + ", status=" + this.status + ", title=" + this.title + ", btnInfo=" + this.btnInfo + ", freezeText=" + this.freezeText + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", vipRights=" + this.vipRights + ", styleInfo=" + this.styleInfo + ", protocolUrl=" + this.protocolUrl + ", protocolTitle=" + this.protocolTitle + ')';
    }

    public /* synthetic */ BlackMemberDetailVo(long j2, int i, String str, BtnInfoVo btnInfoVo, String str2, long j3, long j4, List list, StyleInfoVO styleInfoVO, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, i, str, (i2 & 8) != 0 ? null : btnInfoVo, str2, j3, j4, list, (i2 & 256) != 0 ? null : styleInfoVO, str3, str4);
    }
}
