package com.pantanal.server.content.recommendlist;

import androidx.annotation.Keep;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b2\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0001XB\u009b\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\r\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000f\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u000f\u0012\b\b\u0002\u0010$\u001a\u00020\u0004\u0012\b\b\u0002\u0010%\u001a\u00020\u000f¢\u0006\u0004\bU\u0010VJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0016\u001a\u00020\u000fHÆ\u0003J¥\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00042\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u000fHÆ\u0001J\t\u0010(\u001a\u00020'HÖ\u0001J\t\u0010)\u001a\u00020\u0004HÖ\u0001J\u0013\u0010+\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010/\u001a\u0004\b0\u00101R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\b3\u00104R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00107R\"\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010,\u001a\u0004\b8\u0010.\"\u0004\b9\u00107R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010/\u001a\u0004\b:\u00101\"\u0004\b;\u0010<R\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010/\u001a\u0004\b=\u00101\"\u0004\b>\u0010<R\"\u0010\u001e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010\u001f\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010,\u001a\u0004\bI\u0010.\"\u0004\bJ\u00107R\"\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010/\u001a\u0004\bK\u00101\"\u0004\bL\u0010<R\"\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010/\u001a\u0004\bM\u00101\"\u0004\bN\u0010<R\"\u0010#\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010D\u001a\u0004\bO\u0010F\"\u0004\bP\u0010HR\"\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010/\u001a\u0004\bQ\u00101\"\u0004\bR\u0010<R\"\u0010%\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010D\u001a\u0004\bS\u0010F\"\u0004\bT\u0010H¨\u0006Y"}, d2 = {"Lcom/pantanal/server/content/recommendlist/SceneInfo;", "", "", "component1", "", "component2", "", "Lcom/pantanal/server/content/recommendlist/ServiceInfo;", "component3", "component4", "component5", "component6", "component7", "", "component8", "", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "sceneId", "cardSleeveType", "serviceList", "createTime", "updateTime", "weight", "status", "score", JsonToSeedlingCardOptionsConvertor.KEY_SHOULD_FOCUS_IN_UPK, "focusTime", "expectSceneCnt", "combinationStrategy", "homeFlag", "sceneLevel", "forceGuaranteed", "copy", "", "toString", "hashCode", "other", "equals", "J", "getSceneId", "()J", "I", "getCardSleeveType", "()I", "Ljava/util/List;", "getServiceList", "()Ljava/util/List;", "getCreateTime", "setCreateTime", "(J)V", "getUpdateTime", "setUpdateTime", "getWeight", "setWeight", "(I)V", "getStatus", "setStatus", UserInfo.SEX_FEMALE, "getScore", "()F", "setScore", "(F)V", "Z", "getShouldFocus", "()Z", "setShouldFocus", "(Z)V", "getFocusTime", "setFocusTime", "getExpectSceneCnt", "setExpectSceneCnt", "getCombinationStrategy", "setCombinationStrategy", "getHomeFlag", "setHomeFlag", "getSceneLevel", "setSceneLevel", "getForceGuaranteed", "setForceGuaranteed", "<init>", "(JILjava/util/List;JJIIFZJIIZIZ)V", "Companion", "a", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SceneInfo {
    public static final long SCENE_DEFAULT = 24000000;
    public static final int SCENE_STATE_NEW = 0;
    public static final int SCENE_STATE_UNCHANGED = 2;
    public static final int SCENE_STATE_UPDATE = 1;
    private final int cardSleeveType;
    private int combinationStrategy;
    private long createTime;
    private int expectSceneCnt;
    private long focusTime;
    private boolean forceGuaranteed;
    private boolean homeFlag;
    private final long sceneId;
    private int sceneLevel;
    private float score;

    @NotNull
    private final List<ServiceInfo> serviceList;
    private boolean shouldFocus;
    private int status;
    private long updateTime;
    private int weight;

    public SceneInfo(long j2, int i, @NotNull List<ServiceInfo> serviceList, long j3, long j4, int i2, int i3, float f, boolean z, long j5, int i4, int i5, boolean z2, int i6, boolean z3) {
        Intrinsics.checkNotNullParameter(serviceList, "serviceList");
        this.sceneId = j2;
        this.cardSleeveType = i;
        this.serviceList = serviceList;
        this.createTime = j3;
        this.updateTime = j4;
        this.weight = i2;
        this.status = i3;
        this.score = f;
        this.shouldFocus = z;
        this.focusTime = j5;
        this.expectSceneCnt = i4;
        this.combinationStrategy = i5;
        this.homeFlag = z2;
        this.sceneLevel = i6;
        this.forceGuaranteed = z3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getSceneId() {
        return this.sceneId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getFocusTime() {
        return this.focusTime;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getExpectSceneCnt() {
        return this.expectSceneCnt;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getCombinationStrategy() {
        return this.combinationStrategy;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getHomeFlag() {
        return this.homeFlag;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getSceneLevel() {
        return this.sceneLevel;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getForceGuaranteed() {
        return this.forceGuaranteed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCardSleeveType() {
        return this.cardSleeveType;
    }

    @NotNull
    public final List<ServiceInfo> component3() {
        return this.serviceList;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getShouldFocus() {
        return this.shouldFocus;
    }

    @NotNull
    public final SceneInfo copy(long sceneId, int cardSleeveType, @NotNull List<ServiceInfo> serviceList, long createTime, long updateTime, int weight, int status, float score, boolean shouldFocus, long focusTime, int expectSceneCnt, int combinationStrategy, boolean homeFlag, int sceneLevel, boolean forceGuaranteed) {
        Intrinsics.checkNotNullParameter(serviceList, "serviceList");
        return new SceneInfo(sceneId, cardSleeveType, serviceList, createTime, updateTime, weight, status, score, shouldFocus, focusTime, expectSceneCnt, combinationStrategy, homeFlag, sceneLevel, forceGuaranteed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SceneInfo)) {
            return false;
        }
        SceneInfo sceneInfo = (SceneInfo) other;
        return this.sceneId == sceneInfo.sceneId && this.cardSleeveType == sceneInfo.cardSleeveType && Intrinsics.areEqual(this.serviceList, sceneInfo.serviceList) && this.createTime == sceneInfo.createTime && this.updateTime == sceneInfo.updateTime && this.weight == sceneInfo.weight && this.status == sceneInfo.status && Intrinsics.areEqual((Object) Float.valueOf(this.score), (Object) Float.valueOf(sceneInfo.score)) && this.shouldFocus == sceneInfo.shouldFocus && this.focusTime == sceneInfo.focusTime && this.expectSceneCnt == sceneInfo.expectSceneCnt && this.combinationStrategy == sceneInfo.combinationStrategy && this.homeFlag == sceneInfo.homeFlag && this.sceneLevel == sceneInfo.sceneLevel && this.forceGuaranteed == sceneInfo.forceGuaranteed;
    }

    public final int getCardSleeveType() {
        return this.cardSleeveType;
    }

    public final int getCombinationStrategy() {
        return this.combinationStrategy;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getExpectSceneCnt() {
        return this.expectSceneCnt;
    }

    public final long getFocusTime() {
        return this.focusTime;
    }

    public final boolean getForceGuaranteed() {
        return this.forceGuaranteed;
    }

    public final boolean getHomeFlag() {
        return this.homeFlag;
    }

    public final long getSceneId() {
        return this.sceneId;
    }

    public final int getSceneLevel() {
        return this.sceneLevel;
    }

    public final float getScore() {
        return this.score;
    }

    @NotNull
    public final List<ServiceInfo> getServiceList() {
        return this.serviceList;
    }

    public final boolean getShouldFocus() {
        return this.shouldFocus;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final int getWeight() {
        return this.weight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v22, types: [int] */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((Long.hashCode(this.sceneId) * 31) + Integer.hashCode(this.cardSleeveType)) * 31) + this.serviceList.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.updateTime)) * 31) + Integer.hashCode(this.weight)) * 31) + Integer.hashCode(this.status)) * 31) + Float.hashCode(this.score)) * 31;
        boolean z = this.shouldFocus;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((((iHashCode + r1) * 31) + Long.hashCode(this.focusTime)) * 31) + Integer.hashCode(this.expectSceneCnt)) * 31) + Integer.hashCode(this.combinationStrategy)) * 31;
        boolean z2 = this.homeFlag;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode3 = (((iHashCode2 + r2) * 31) + Integer.hashCode(this.sceneLevel)) * 31;
        boolean z3 = this.forceGuaranteed;
        return iHashCode3 + (z3 ? 1 : z3);
    }

    public final void setCombinationStrategy(int i) {
        this.combinationStrategy = i;
    }

    public final void setCreateTime(long j2) {
        this.createTime = j2;
    }

    public final void setExpectSceneCnt(int i) {
        this.expectSceneCnt = i;
    }

    public final void setFocusTime(long j2) {
        this.focusTime = j2;
    }

    public final void setForceGuaranteed(boolean z) {
        this.forceGuaranteed = z;
    }

    public final void setHomeFlag(boolean z) {
        this.homeFlag = z;
    }

    public final void setSceneLevel(int i) {
        this.sceneLevel = i;
    }

    public final void setScore(float f) {
        this.score = f;
    }

    public final void setShouldFocus(boolean z) {
        this.shouldFocus = z;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setUpdateTime(long j2) {
        this.updateTime = j2;
    }

    public final void setWeight(int i) {
        this.weight = i;
    }

    @NotNull
    public String toString() {
        return "SceneInfo(sceneId=" + this.sceneId + ", cardSleeveType=" + this.cardSleeveType + ", serviceList=" + this.serviceList + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", weight=" + this.weight + ", status=" + this.status + ", score=" + this.score + ", shouldFocus=" + this.shouldFocus + ", focusTime=" + this.focusTime + ", expectSceneCnt=" + this.expectSceneCnt + ", combinationStrategy=" + this.combinationStrategy + ", homeFlag=" + this.homeFlag + ", sceneLevel=" + this.sceneLevel + ", forceGuaranteed=" + this.forceGuaranteed + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SceneInfo(long j2, int i, List list, long j3, long j4, int i2, int i3, float f, boolean z, long j5, int i4, int i5, boolean z2, int i6, boolean z3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        long jCurrentTimeMillis = (i7 & 8) != 0 ? System.currentTimeMillis() : j3;
        this(j2, i, list, jCurrentTimeMillis, (i7 & 16) != 0 ? jCurrentTimeMillis : j4, (i7 & 32) != 0 ? 1 : i2, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? -1.0f : f, (i7 & 256) != 0 ? false : z, j5, (i7 & 1024) != 0 ? 1 : i4, (i7 & 2048) != 0 ? 0 : i5, (i7 & 4096) != 0 ? false : z2, (i7 & 8192) != 0 ? 0 : i6, (i7 & 16384) != 0 ? false : z3);
    }
}
