package com.heytap.store.business.component.entity;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b@\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u0018J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u000fHÆ\u0003J\t\u0010E\u001a\u00020\u000fHÆ\u0003J\t\u0010F\u001a\u00020\u000fHÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0003HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J¿\u0001\u0010T\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÆ\u0001J\u0013\u0010U\u001a\u00020\u000f2\b\u0010V\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010W\u001a\u00020XHÖ\u0001J\t\u0010Y\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u001d\"\u0004\b \u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001a\"\u0004\b'\u0010\u001cR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010\u001cR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001a\"\u0004\b1\u0010\u001cR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010#\"\u0004\b3\u0010%R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u001a\"\u0004\b;\u0010\u001cR\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010#\"\u0004\b=\u0010%R\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010\u001cR\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010#\"\u0004\bA\u0010%¨\u0006Z"}, d2 = {"Lcom/heytap/store/business/component/entity/LiveCardEntity;", "", "id", "", "pullAddress", "", "livePic", "liveBackGroundUrl", "liveSeeNum", "liveName", "liveTitle", "liveStartTime", "liveGetDataTime", "liveServiceTime", "isCanSubScribe", "", "isSubScribe", "isLiving", "streamCode", "streamId", "roomId", "streamJumpUrl", "reportEntity", "Lcom/heytap/store/business/component/entity/LiveReportEntity;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;JJJZZZLjava/lang/String;JJLjava/lang/String;Lcom/heytap/store/business/component/entity/LiveReportEntity;)V", "getId", "()J", "setId", "(J)V", "()Z", "setCanSubScribe", "(Z)V", "setLiving", "setSubScribe", "getLiveBackGroundUrl", "()Ljava/lang/String;", "setLiveBackGroundUrl", "(Ljava/lang/String;)V", "getLiveGetDataTime", "setLiveGetDataTime", "getLiveName", "setLiveName", "getLivePic", "setLivePic", "getLiveSeeNum", "setLiveSeeNum", "getLiveServiceTime", "setLiveServiceTime", "getLiveStartTime", "setLiveStartTime", "getLiveTitle", "setLiveTitle", "getPullAddress", "setPullAddress", "getReportEntity", "()Lcom/heytap/store/business/component/entity/LiveReportEntity;", "setReportEntity", "(Lcom/heytap/store/business/component/entity/LiveReportEntity;)V", "getRoomId", "setRoomId", "getStreamCode", "setStreamCode", "getStreamId", "setStreamId", "getStreamJumpUrl", "setStreamJumpUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class LiveCardEntity {
    private long id;
    private boolean isCanSubScribe;
    private boolean isLiving;
    private boolean isSubScribe;

    @NotNull
    private String liveBackGroundUrl;
    private long liveGetDataTime;

    @NotNull
    private String liveName;

    @NotNull
    private String livePic;
    private long liveSeeNum;
    private long liveServiceTime;
    private long liveStartTime;

    @NotNull
    private String liveTitle;

    @NotNull
    private String pullAddress;

    @Nullable
    private LiveReportEntity reportEntity;
    private long roomId;

    @NotNull
    private String streamCode;
    private long streamId;

    @NotNull
    private String streamJumpUrl;

    public LiveCardEntity() {
        this(0L, null, null, null, 0L, null, null, 0L, 0L, 0L, false, false, false, null, 0L, 0L, null, null, 262143, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getLiveServiceTime() {
        return this.liveServiceTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsCanSubScribe() {
        return this.isCanSubScribe;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsSubScribe() {
        return this.isSubScribe;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsLiving() {
        return this.isLiving;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getStreamCode() {
        return this.streamCode;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getStreamId() {
        return this.streamId;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getRoomId() {
        return this.roomId;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getStreamJumpUrl() {
        return this.streamJumpUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final LiveReportEntity getReportEntity() {
        return this.reportEntity;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPullAddress() {
        return this.pullAddress;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLivePic() {
        return this.livePic;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLiveBackGroundUrl() {
        return this.liveBackGroundUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getLiveSeeNum() {
        return this.liveSeeNum;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLiveName() {
        return this.liveName;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLiveTitle() {
        return this.liveTitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getLiveStartTime() {
        return this.liveStartTime;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getLiveGetDataTime() {
        return this.liveGetDataTime;
    }

    @NotNull
    public final LiveCardEntity copy(long id, @NotNull String pullAddress, @NotNull String livePic, @NotNull String liveBackGroundUrl, long liveSeeNum, @NotNull String liveName, @NotNull String liveTitle, long liveStartTime, long liveGetDataTime, long liveServiceTime, boolean isCanSubScribe, boolean isSubScribe, boolean isLiving, @NotNull String streamCode, long streamId, long roomId, @NotNull String streamJumpUrl, @Nullable LiveReportEntity reportEntity) {
        Intrinsics.checkNotNullParameter(pullAddress, "pullAddress");
        Intrinsics.checkNotNullParameter(livePic, "livePic");
        Intrinsics.checkNotNullParameter(liveBackGroundUrl, "liveBackGroundUrl");
        Intrinsics.checkNotNullParameter(liveName, "liveName");
        Intrinsics.checkNotNullParameter(liveTitle, "liveTitle");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        Intrinsics.checkNotNullParameter(streamJumpUrl, "streamJumpUrl");
        return new LiveCardEntity(id, pullAddress, livePic, liveBackGroundUrl, liveSeeNum, liveName, liveTitle, liveStartTime, liveGetDataTime, liveServiceTime, isCanSubScribe, isSubScribe, isLiving, streamCode, streamId, roomId, streamJumpUrl, reportEntity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveCardEntity)) {
            return false;
        }
        LiveCardEntity liveCardEntity = (LiveCardEntity) other;
        return this.id == liveCardEntity.id && Intrinsics.areEqual(this.pullAddress, liveCardEntity.pullAddress) && Intrinsics.areEqual(this.livePic, liveCardEntity.livePic) && Intrinsics.areEqual(this.liveBackGroundUrl, liveCardEntity.liveBackGroundUrl) && this.liveSeeNum == liveCardEntity.liveSeeNum && Intrinsics.areEqual(this.liveName, liveCardEntity.liveName) && Intrinsics.areEqual(this.liveTitle, liveCardEntity.liveTitle) && this.liveStartTime == liveCardEntity.liveStartTime && this.liveGetDataTime == liveCardEntity.liveGetDataTime && this.liveServiceTime == liveCardEntity.liveServiceTime && this.isCanSubScribe == liveCardEntity.isCanSubScribe && this.isSubScribe == liveCardEntity.isSubScribe && this.isLiving == liveCardEntity.isLiving && Intrinsics.areEqual(this.streamCode, liveCardEntity.streamCode) && this.streamId == liveCardEntity.streamId && this.roomId == liveCardEntity.roomId && Intrinsics.areEqual(this.streamJumpUrl, liveCardEntity.streamJumpUrl) && Intrinsics.areEqual(this.reportEntity, liveCardEntity.reportEntity);
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getLiveBackGroundUrl() {
        return this.liveBackGroundUrl;
    }

    public final long getLiveGetDataTime() {
        return this.liveGetDataTime;
    }

    @NotNull
    public final String getLiveName() {
        return this.liveName;
    }

    @NotNull
    public final String getLivePic() {
        return this.livePic;
    }

    public final long getLiveSeeNum() {
        return this.liveSeeNum;
    }

    public final long getLiveServiceTime() {
        return this.liveServiceTime;
    }

    public final long getLiveStartTime() {
        return this.liveStartTime;
    }

    @NotNull
    public final String getLiveTitle() {
        return this.liveTitle;
    }

    @NotNull
    public final String getPullAddress() {
        return this.pullAddress;
    }

    @Nullable
    public final LiveReportEntity getReportEntity() {
        return this.reportEntity;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    @NotNull
    public final String getStreamCode() {
        return this.streamCode;
    }

    public final long getStreamId() {
        return this.streamId;
    }

    @NotNull
    public final String getStreamJumpUrl() {
        return this.streamJumpUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21, types: [int] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((Long.hashCode(this.id) * 31) + this.pullAddress.hashCode()) * 31) + this.livePic.hashCode()) * 31) + this.liveBackGroundUrl.hashCode()) * 31) + Long.hashCode(this.liveSeeNum)) * 31) + this.liveName.hashCode()) * 31) + this.liveTitle.hashCode()) * 31) + Long.hashCode(this.liveStartTime)) * 31) + Long.hashCode(this.liveGetDataTime)) * 31) + Long.hashCode(this.liveServiceTime)) * 31;
        boolean z = this.isCanSubScribe;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isSubScribe;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.isLiving;
        int iHashCode2 = (((((((((i2 + (z3 ? 1 : z3)) * 31) + this.streamCode.hashCode()) * 31) + Long.hashCode(this.streamId)) * 31) + Long.hashCode(this.roomId)) * 31) + this.streamJumpUrl.hashCode()) * 31;
        LiveReportEntity liveReportEntity = this.reportEntity;
        return iHashCode2 + (liveReportEntity == null ? 0 : liveReportEntity.hashCode());
    }

    public final boolean isCanSubScribe() {
        return this.isCanSubScribe;
    }

    public final boolean isLiving() {
        return this.isLiving;
    }

    public final boolean isSubScribe() {
        return this.isSubScribe;
    }

    public final void setCanSubScribe(boolean z) {
        this.isCanSubScribe = z;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setLiveBackGroundUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.liveBackGroundUrl = str;
    }

    public final void setLiveGetDataTime(long j2) {
        this.liveGetDataTime = j2;
    }

    public final void setLiveName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.liveName = str;
    }

    public final void setLivePic(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.livePic = str;
    }

    public final void setLiveSeeNum(long j2) {
        this.liveSeeNum = j2;
    }

    public final void setLiveServiceTime(long j2) {
        this.liveServiceTime = j2;
    }

    public final void setLiveStartTime(long j2) {
        this.liveStartTime = j2;
    }

    public final void setLiveTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.liveTitle = str;
    }

    public final void setLiving(boolean z) {
        this.isLiving = z;
    }

    public final void setPullAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pullAddress = str;
    }

    public final void setReportEntity(@Nullable LiveReportEntity liveReportEntity) {
        this.reportEntity = liveReportEntity;
    }

    public final void setRoomId(long j2) {
        this.roomId = j2;
    }

    public final void setStreamCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.streamCode = str;
    }

    public final void setStreamId(long j2) {
        this.streamId = j2;
    }

    public final void setStreamJumpUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.streamJumpUrl = str;
    }

    public final void setSubScribe(boolean z) {
        this.isSubScribe = z;
    }

    @NotNull
    public String toString() {
        return "LiveCardEntity(id=" + this.id + ", pullAddress=" + this.pullAddress + ", livePic=" + this.livePic + ", liveBackGroundUrl=" + this.liveBackGroundUrl + ", liveSeeNum=" + this.liveSeeNum + ", liveName=" + this.liveName + ", liveTitle=" + this.liveTitle + ", liveStartTime=" + this.liveStartTime + ", liveGetDataTime=" + this.liveGetDataTime + ", liveServiceTime=" + this.liveServiceTime + ", isCanSubScribe=" + this.isCanSubScribe + ", isSubScribe=" + this.isSubScribe + ", isLiving=" + this.isLiving + ", streamCode=" + this.streamCode + ", streamId=" + this.streamId + ", roomId=" + this.roomId + ", streamJumpUrl=" + this.streamJumpUrl + ", reportEntity=" + this.reportEntity + ')';
    }

    public LiveCardEntity(long j2, @NotNull String pullAddress, @NotNull String livePic, @NotNull String liveBackGroundUrl, long j3, @NotNull String liveName, @NotNull String liveTitle, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, @NotNull String streamCode, long j7, long j8, @NotNull String streamJumpUrl, @Nullable LiveReportEntity liveReportEntity) {
        Intrinsics.checkNotNullParameter(pullAddress, "pullAddress");
        Intrinsics.checkNotNullParameter(livePic, "livePic");
        Intrinsics.checkNotNullParameter(liveBackGroundUrl, "liveBackGroundUrl");
        Intrinsics.checkNotNullParameter(liveName, "liveName");
        Intrinsics.checkNotNullParameter(liveTitle, "liveTitle");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        Intrinsics.checkNotNullParameter(streamJumpUrl, "streamJumpUrl");
        this.id = j2;
        this.pullAddress = pullAddress;
        this.livePic = livePic;
        this.liveBackGroundUrl = liveBackGroundUrl;
        this.liveSeeNum = j3;
        this.liveName = liveName;
        this.liveTitle = liveTitle;
        this.liveStartTime = j4;
        this.liveGetDataTime = j5;
        this.liveServiceTime = j6;
        this.isCanSubScribe = z;
        this.isSubScribe = z2;
        this.isLiving = z3;
        this.streamCode = streamCode;
        this.streamId = j7;
        this.roomId = j8;
        this.streamJumpUrl = streamJumpUrl;
        this.reportEntity = liveReportEntity;
    }

    public /* synthetic */ LiveCardEntity(long j2, String str, String str2, String str3, long j3, String str4, String str5, long j4, long j5, long j6, boolean z, boolean z2, boolean z3, String str6, long j7, long j8, String str7, LiveReportEntity liveReportEntity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? -1L : j2, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? 0L : j3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? 0L : j4, (i & 256) != 0 ? 0L : j5, (i & 512) != 0 ? 0L : j6, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? false : z2, (i & 4096) == 0 ? z3 : false, (i & 8192) != 0 ? "" : str6, (i & 16384) != 0 ? -1L : j7, (32768 & i) != 0 ? -1L : j8, (65536 & i) != 0 ? "" : str7, (i & 131072) != 0 ? null : liveReportEntity);
    }
}
