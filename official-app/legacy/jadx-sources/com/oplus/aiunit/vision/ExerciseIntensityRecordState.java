package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.cw6, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/oplus/aiunit/vision/cw6;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", SpeechConstant.KEY_RECORD_ID, "b", "Z", "()Z", "isGtMonth", "c", "isThirdPartyRecord", "d", "isThirdPartyTaycanRecord", "<init>", "(Ljava/lang/String;ZZZ)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ExerciseIntensityRecordState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    public final String recordId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public final boolean isGtMonth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final boolean isThirdPartyRecord;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public final boolean isThirdPartyTaycanRecord;

    public ExerciseIntensityRecordState() {
        this(null, false, false, false, 15, null);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRecordId() {
        return this.recordId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsGtMonth() {
        return this.isGtMonth;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsThirdPartyTaycanRecord() {
        return this.isThirdPartyTaycanRecord;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseIntensityRecordState)) {
            return false;
        }
        ExerciseIntensityRecordState exerciseIntensityRecordState = (ExerciseIntensityRecordState) other;
        return Intrinsics.areEqual(this.recordId, exerciseIntensityRecordState.recordId) && this.isGtMonth == exerciseIntensityRecordState.isGtMonth && this.isThirdPartyRecord == exerciseIntensityRecordState.isThirdPartyRecord && this.isThirdPartyTaycanRecord == exerciseIntensityRecordState.isThirdPartyTaycanRecord;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        String str = this.recordId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.isGtMonth;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.isThirdPartyRecord;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.isThirdPartyTaycanRecord;
        return i2 + (z3 ? 1 : z3);
    }

    @NotNull
    public String toString() {
        return "ExerciseIntensityRecordState(recordId=" + this.recordId + ", isGtMonth=" + this.isGtMonth + ", isThirdPartyRecord=" + this.isThirdPartyRecord + ", isThirdPartyTaycanRecord=" + this.isThirdPartyTaycanRecord + ")";
    }

    public ExerciseIntensityRecordState(@Nullable String str, boolean z, boolean z2, boolean z3) {
        this.recordId = str;
        this.isGtMonth = z;
        this.isThirdPartyRecord = z2;
        this.isThirdPartyTaycanRecord = z3;
    }

    public /* synthetic */ ExerciseIntensityRecordState(String str, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }
}
