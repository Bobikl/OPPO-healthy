package pantanal.decision;

import androidx.annotation.Keep;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import pantanal.foundation.utils.RequiresVersionSdk;
import pantanal.foundation.utils.VersionSdk;

/* JADX INFO: loaded from: classes11.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b4\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e¢\u0006\u0002\u0010\u0015J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\fHÆ\u0003J\t\u0010<\u001a\u00020\u000eHÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u000eHÆ\u0003J\u0091\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u000eHÆ\u0001J\u0013\u0010@\u001a\u00020\u000e2\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010B\u001a\u00020CJ\t\u0010D\u001a\u00020\u0005HÖ\u0001J\b\u0010E\u001a\u00020CH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0017\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b\u001e\u0010\u001aR\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010!R\u001e\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010\u0010\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u001e\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010#\"\u0004\b0\u0010%R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001c¨\u0006F"}, d2 = {"Lpantanal/decision/PantaSceneInfo;", "", "sceneID", "", "cardSleeveType", "", "serviceList", "", "Lpantanal/decision/ServiceInfo;", "createTime", "updateTime", "score", "", JsonToSeedlingCardOptionsConvertor.KEY_SHOULD_FOCUS_IN_UPK, "", "expectSceneCnt", "homeFlag", "sceneLevel", "focusTime", "combinationStrategy", "forceGuaranteed", "(JILjava/util/List;JJFZIZIJIZ)V", "getCardSleeveType", "()I", "getCombinationStrategy", "setCombinationStrategy", "(I)V", "getCreateTime", "()J", "getExpectSceneCnt", "setExpectSceneCnt", "getFocusTime", "setFocusTime", "(J)V", "getForceGuaranteed", "()Z", "setForceGuaranteed", "(Z)V", "getHomeFlag", "setHomeFlag", "getSceneID", "getSceneLevel", "setSceneLevel", "getScore", "()F", "getServiceList", "()Ljava/util/List;", "getShouldFocus", "setShouldFocus", "getUpdateTime", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "getReportSceneInfo", "", "hashCode", "toString", "pantanal-interface_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantaSceneInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantaSceneInfo.kt\npantanal/decision/PantaSceneInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n1855#2,2:124\n*S KotlinDebug\n*F\n+ 1 PantaSceneInfo.kt\npantanal/decision/PantaSceneInfo\n*L\n117#1:124,2\n*E\n"})
public final /* data */ class PantaSceneInfo {
    private final int cardSleeveType;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_20)
    private int combinationStrategy;
    private final long createTime;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_20)
    private int expectSceneCnt;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_20)
    private long focusTime;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_20)
    private boolean forceGuaranteed;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_20)
    private boolean homeFlag;
    private final long sceneID;

    @RequiresVersionSdk(version = VersionSdk.SDK_1_2_20)
    private int sceneLevel;
    private final float score;

    @NotNull
    private final List<ServiceInfo> serviceList;
    private boolean shouldFocus;
    private final long updateTime;

    public PantaSceneInfo(long j2, int i, @NotNull List<ServiceInfo> serviceList, long j3, long j4, float f, boolean z, int i2, boolean z2, int i3, long j5, int i4, boolean z3) {
        Intrinsics.checkNotNullParameter(serviceList, "serviceList");
        this.sceneID = j2;
        this.cardSleeveType = i;
        this.serviceList = serviceList;
        this.createTime = j3;
        this.updateTime = j4;
        this.score = f;
        this.shouldFocus = z;
        this.expectSceneCnt = i2;
        this.homeFlag = z2;
        this.sceneLevel = i3;
        this.focusTime = j5;
        this.combinationStrategy = i4;
        this.forceGuaranteed = z3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getSceneID() {
        return this.sceneID;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getSceneLevel() {
        return this.sceneLevel;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getFocusTime() {
        return this.focusTime;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getCombinationStrategy() {
        return this.combinationStrategy;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
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
    public final float getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getShouldFocus() {
        return this.shouldFocus;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getExpectSceneCnt() {
        return this.expectSceneCnt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getHomeFlag() {
        return this.homeFlag;
    }

    @NotNull
    public final PantaSceneInfo copy(long sceneID, int cardSleeveType, @NotNull List<ServiceInfo> serviceList, long createTime, long updateTime, float score, boolean shouldFocus, int expectSceneCnt, boolean homeFlag, int sceneLevel, long focusTime, int combinationStrategy, boolean forceGuaranteed) {
        Intrinsics.checkNotNullParameter(serviceList, "serviceList");
        return new PantaSceneInfo(sceneID, cardSleeveType, serviceList, createTime, updateTime, score, shouldFocus, expectSceneCnt, homeFlag, sceneLevel, focusTime, combinationStrategy, forceGuaranteed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PantaSceneInfo)) {
            return false;
        }
        PantaSceneInfo pantaSceneInfo = (PantaSceneInfo) other;
        return this.sceneID == pantaSceneInfo.sceneID && this.cardSleeveType == pantaSceneInfo.cardSleeveType && Intrinsics.areEqual(this.serviceList, pantaSceneInfo.serviceList) && this.createTime == pantaSceneInfo.createTime && this.updateTime == pantaSceneInfo.updateTime && Float.compare(this.score, pantaSceneInfo.score) == 0 && this.shouldFocus == pantaSceneInfo.shouldFocus && this.expectSceneCnt == pantaSceneInfo.expectSceneCnt && this.homeFlag == pantaSceneInfo.homeFlag && this.sceneLevel == pantaSceneInfo.sceneLevel && this.focusTime == pantaSceneInfo.focusTime && this.combinationStrategy == pantaSceneInfo.combinationStrategy && this.forceGuaranteed == pantaSceneInfo.forceGuaranteed;
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

    @NotNull
    public final String getReportSceneInfo() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(sceneID=");
        stringBuffer.append(this.sceneID);
        stringBuffer.append(",services=");
        Iterator<T> it = this.serviceList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(((ServiceInfo) it.next()).getCardSizeListDesc());
        }
        stringBuffer.append(')');
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "serviceBuilder.toString()");
        return string;
    }

    public final long getSceneID() {
        return this.sceneID;
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

    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((Long.hashCode(this.sceneID) * 31) + Integer.hashCode(this.cardSleeveType)) * 31) + this.serviceList.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.updateTime)) * 31) + Float.hashCode(this.score)) * 31;
        boolean z = this.shouldFocus;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((iHashCode + r1) * 31) + Integer.hashCode(this.expectSceneCnt)) * 31;
        boolean z2 = this.homeFlag;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode3 = (((((((iHashCode2 + r2) * 31) + Integer.hashCode(this.sceneLevel)) * 31) + Long.hashCode(this.focusTime)) * 31) + Integer.hashCode(this.combinationStrategy)) * 31;
        boolean z3 = this.forceGuaranteed;
        return iHashCode3 + (z3 ? 1 : z3);
    }

    public final void setCombinationStrategy(int i) {
        this.combinationStrategy = i;
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

    public final void setShouldFocus(boolean z) {
        this.shouldFocus = z;
    }

    @NotNull
    public String toString() {
        return "PantaSceneInfo(sceneID=" + this.sceneID + ",sceneLevel = " + this.sceneLevel + ",score = " + this.score + ",homeFlag = " + this.homeFlag + ",shouldFocus=" + this.shouldFocus + ",expectSceneCnt = " + this.expectSceneCnt + ",combinationStrategy = " + this.combinationStrategy + ",forceGuaranteed = " + this.forceGuaranteed + ",focusTime=" + this.focusTime + ",createTime=" + this.createTime + ", updateTime=" + this.updateTime + ",cardSleeveType='" + this.cardSleeveType + "', serviceList=\n" + this.serviceList + ")";
    }

    public /* synthetic */ PantaSceneInfo(long j2, int i, List list, long j3, long j4, float f, boolean z, int i2, boolean z2, int i3, long j5, int i4, boolean z3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, (i5 & 2) != 0 ? 0 : i, list, j3, j4, (i5 & 32) != 0 ? -1.0f : f, (i5 & 64) != 0 ? false : z, (i5 & 128) != 0 ? 1 : i2, (i5 & 256) != 0 ? false : z2, (i5 & 512) != 0 ? 0 : i3, (i5 & 1024) != 0 ? 0L : j5, (i5 & 2048) != 0 ? 0 : i4, (i5 & 4096) != 0 ? false : z3);
    }
}
