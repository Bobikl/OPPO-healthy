package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.log.formatter.LogFieldKey;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.kp8, reason: from toString */
/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b*\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bY\u0010ZJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001a\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\"\u0010\u001d\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\"\u0010 \u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013\"\u0004\b\u001f\u0010\u0015R\"\u0010#\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\"\u0010\u0015R\"\u0010&\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b%\u0010\u0015R\"\u0010)\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u0011\u001a\u0004\b\u000b\u0010\u0013\"\u0004\b(\u0010\u0015R\"\u0010,\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0011\u001a\u0004\b\u0004\u0010\u0013\"\u0004\b+\u0010\u0015R\"\u00100\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0005\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\tR\"\u00108\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0005\u001a\u0004\b:\u0010\u0007\"\u0004\b;\u0010\tR\"\u0010?\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0005\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\tR\"\u0010C\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0005\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u0010\tR\"\u0010F\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010\u0005\u001a\u0004\b'\u0010\u0007\"\u0004\bE\u0010\tR\"\u0010I\u001a\u0002018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u00103\u001a\u0004\b$\u00105\"\u0004\bH\u00107R\"\u0010K\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u0005\u001a\u0004\b-\u0010\u0007\"\u0004\bJ\u0010\tR\"\u0010L\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u0005\u001a\u0004\b*\u0010\u0007\"\u0004\b\u0011\u0010\tR\"\u0010N\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0005\u001a\u0004\b!\u0010\u0007\"\u0004\bM\u0010\tR\"\u0010P\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010\u0005\u001a\u0004\bG\u0010\u0007\"\u0004\bO\u0010\tR\"\u0010R\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0011\u001a\u0004\bD\u0010\u0013\"\u0004\bQ\u0010\u0015R\"\u0010T\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0005\u001a\u0004\b2\u0010\u0007\"\u0004\bS\u0010\tR\"\u0010V\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b9\u0010\u0007\"\u0004\bU\u0010\tR\"\u0010X\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b@\u0010\u0007\"\u0004\bW\u0010\t¨\u0006["}, d2 = {"Lcom/oplus/aiunit/vision/kp8;", "", "", "toString", "a", "Ljava/lang/String;", "y", "()Ljava/lang/String;", "X", "(Ljava/lang/String;)V", "title", "b", "n", "M", "noDataTip", "", "c", "I", "x", "()I", ExifInterface.LONGITUDE_WEST, "(I)V", "stepMaxProgress", "d", "w", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "stepCurProgress", MapSchema.FIELD_NAME_ENTRY, "C", "consumeMaxProgress", "f", c8l.KEY_B, "consumeCurProgress", b2n.f, ExifInterface.LONGITUDE_EAST, "exerciseMaxProgress", b2n.g, "D", "exerciseCurProgress", "i", "A", "actMaxProgress", "j", "z", "actCurProgress", MapSchema.FIELD_NAME_KEY, "t", "S", "spo2Title", "", LogFieldKey.LEVEL_KEY, "Z", "s", "()Z", "R", "(Z)V", "spo2NoData", LogFieldKey.MESSAGE_KEY, "v", "U", "spo2Value", "u", ExifInterface.GPS_DIRECTION_TRUE, "spo2Unit", "o", "r", "Q", "spo2LastData", LogFieldKey.PROCESS_NAME_KEY, "H", "heartRateTitle", "q", "G", "heartRateNoData", "J", "heartRateValue", "heartRateUnit", UserInfo.SEX_FEMALE, "heartRateLastData", SecureGcmConstants.MESSAGE_KEY, "sleepTitle", "O", "sleepTime", "K", "hourUnit", "L", "minuteUnit", "N", "sleepLastData", "<init>", "()V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class HealthCardData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int stepMax;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int stepCurProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public int consume;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public int consume;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    public int exercise;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public int exercise;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public int act;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public int act;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata and from toString */
    public int sleepTime;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public String title = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String noDataTip = "";

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public String spo2Title = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean spo2NoData = true;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public String spo2Value = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String spo2Unit = "";

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public String spo2LastData = "";

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public String heartRateTitle = "";

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean heartRateNoData = true;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata and from toString */
    @NotNull
    public String heartRateValue = "";

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public String heartRateUnit = "";

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @NotNull
    public String heartRateLastData = "";

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    public String sleepTitle = "";

    /* JADX INFO: renamed from: w, reason: from kotlin metadata and from toString */
    @NotNull
    public String hourUnit = "";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata and from toString */
    @NotNull
    public String minuteUnit = "";

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    public String sleepLastData = "";

    public final void A(int i) {
        this.act = i;
    }

    public final void B(int i) {
        this.consume = i;
    }

    public final void C(int i) {
        this.consume = i;
    }

    public final void D(int i) {
        this.exercise = i;
    }

    public final void E(int i) {
        this.exercise = i;
    }

    public final void F(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.heartRateLastData = str;
    }

    public final void G(boolean z) {
        this.heartRateNoData = z;
    }

    public final void H(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.heartRateTitle = str;
    }

    public final void I(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.heartRateUnit = str;
    }

    public final void J(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.heartRateValue = str;
    }

    public final void K(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.hourUnit = str;
    }

    public final void L(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.minuteUnit = str;
    }

    public final void M(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.noDataTip = str;
    }

    public final void N(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sleepLastData = str;
    }

    public final void O(int i) {
        this.sleepTime = i;
    }

    public final void P(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sleepTitle = str;
    }

    public final void Q(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.spo2LastData = str;
    }

    public final void R(boolean z) {
        this.spo2NoData = z;
    }

    public final void S(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.spo2Title = str;
    }

    public final void T(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.spo2Unit = str;
    }

    public final void U(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.spo2Value = str;
    }

    public final void V(int i) {
        this.stepCurProgress = i;
    }

    public final void W(int i) {
        this.stepMax = i;
    }

    public final void X(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAct() {
        return this.act;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getAct() {
        return this.act;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getConsume() {
        return this.consume;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getConsume() {
        return this.consume;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getExercise() {
        return this.exercise;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getExercise() {
        return this.exercise;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getHeartRateLastData() {
        return this.heartRateLastData;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getHeartRateNoData() {
        return this.heartRateNoData;
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getHeartRateTitle() {
        return this.heartRateTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getHeartRateUnit() {
        return this.heartRateUnit;
    }

    @NotNull
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getHeartRateValue() {
        return this.heartRateValue;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getHourUnit() {
        return this.hourUnit;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getMinuteUnit() {
        return this.minuteUnit;
    }

    @NotNull
    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getNoDataTip() {
        return this.noDataTip;
    }

    @NotNull
    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getSleepLastData() {
        return this.sleepLastData;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getSleepTime() {
        return this.sleepTime;
    }

    @NotNull
    /* JADX INFO: renamed from: q, reason: from getter */
    public final String getSleepTitle() {
        return this.sleepTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: r, reason: from getter */
    public final String getSpo2LastData() {
        return this.spo2LastData;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getSpo2NoData() {
        return this.spo2NoData;
    }

    @NotNull
    /* JADX INFO: renamed from: t, reason: from getter */
    public final String getSpo2Title() {
        return this.spo2Title;
    }

    @NotNull
    public String toString() {
        return "HealthCardData(stepMax" + this.stepMax + ", " + this.stepCurProgress + ", consume=" + this.consume + ", consume=" + this.consume + ", exercise=" + this.exercise + ", exercise=" + this.exercise + ", act=" + this.act + ", act=" + this.act + ", spo2'" + this.spo2Value + "', heartRateValue='" + this.heartRateValue + "', sleepTime=" + this.sleepTime + ", hourUnit='" + this.hourUnit + "', minuteUnit='" + this.minuteUnit + "' )";
    }

    @NotNull
    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getSpo2Unit() {
        return this.spo2Unit;
    }

    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public final String getSpo2Value() {
        return this.spo2Value;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final int getStepCurProgress() {
        return this.stepCurProgress;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final int getStepMax() {
        return this.stepMax;
    }

    @NotNull
    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final void z(int i) {
        this.act = i;
    }
}
