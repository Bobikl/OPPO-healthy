package com.heytap.sports.record.details.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.f04;
import com.oplus.aiunit.vision.wvi;
import io.protostuff.MapSchema;
import java.util.Objects;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u000bJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0001HÆ\u0003JI\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\t\u0010*\u001a\u00020\u0005HÖ\u0001J\b\u0010+\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000f¨\u0006,"}, d2 = {"Lcom/heytap/sports/record/details/bean/FitnessAction;", "", "name", "", "trainNum", "", "actTrainNum", f04.JSON_KEY_RKE_ACTION_TYPE, "durationSec", "", "duration", "(Ljava/lang/String;IIIDLjava/lang/Object;)V", "getActTrainNum", "()I", "setActTrainNum", "(I)V", "getActionType", "setActionType", "getDuration", "()Ljava/lang/Object;", "setDuration", "(Ljava/lang/Object;)V", "getDurationSec", "()D", "setDurationSec", "(D)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getTrainNum", "setTrainNum", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "sport_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class FitnessAction {
    public static final int $stable = 8;
    private int actTrainNum;
    private int actionType;

    @Nullable
    private Object duration;
    private double durationSec;

    @Nullable
    private String name;
    private int trainNum;

    public FitnessAction() {
        this(null, 0, 0, 0, 0.0d, null, 63, null);
    }

    public static /* synthetic */ FitnessAction copy$default(FitnessAction fitnessAction, String str, int i, int i2, int i3, double d, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            str = fitnessAction.name;
        }
        if ((i4 & 2) != 0) {
            i = fitnessAction.trainNum;
        }
        int i5 = i;
        if ((i4 & 4) != 0) {
            i2 = fitnessAction.actTrainNum;
        }
        int i6 = i2;
        if ((i4 & 8) != 0) {
            i3 = fitnessAction.actionType;
        }
        int i7 = i3;
        if ((i4 & 16) != 0) {
            d = fitnessAction.durationSec;
        }
        double d2 = d;
        if ((i4 & 32) != 0) {
            obj = fitnessAction.duration;
        }
        return fitnessAction.copy(str, i5, i6, i7, d2, obj);
    }

    private final int getDurationSec(double duration) {
        if (duration < 1000.0d) {
            duration *= (double) 1000;
        }
        return (int) duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTrainNum() {
        return this.trainNum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getActTrainNum() {
        return this.actTrainNum;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getActionType() {
        return this.actionType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getDurationSec() {
        return this.durationSec;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getDuration() {
        return this.duration;
    }

    @NotNull
    public final FitnessAction copy(@Nullable String name, int trainNum, int actTrainNum, int actionType, double durationSec, @Nullable Object duration) {
        return new FitnessAction(name, trainNum, actTrainNum, actionType, durationSec, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FitnessAction)) {
            return false;
        }
        FitnessAction fitnessAction = (FitnessAction) other;
        return Intrinsics.areEqual(this.name, fitnessAction.name) && this.trainNum == fitnessAction.trainNum && this.actTrainNum == fitnessAction.actTrainNum && this.actionType == fitnessAction.actionType && Double.compare(this.durationSec, fitnessAction.durationSec) == 0 && Intrinsics.areEqual(this.duration, fitnessAction.duration);
    }

    public final int getActTrainNum() {
        return this.actTrainNum;
    }

    public final int getActionType() {
        return this.actionType;
    }

    @Nullable
    public final Object getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getTrainNum() {
        return this.trainNum;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (((((((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.trainNum)) * 31) + Integer.hashCode(this.actTrainNum)) * 31) + Integer.hashCode(this.actionType)) * 31) + Double.hashCode(this.durationSec)) * 31;
        Object obj = this.duration;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final void setActTrainNum(int i) {
        this.actTrainNum = i;
    }

    public final void setActionType(int i) {
        this.actionType = i;
    }

    public final void setDuration(@Nullable Object obj) {
        this.duration = obj;
    }

    public final void setDurationSec(double d) {
        this.durationSec = d;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setTrainNum(int i) {
        this.trainNum = i;
    }

    @NotNull
    public String toString() {
        return "FitnessAction(name=" + this.name + ", trainNum=" + this.trainNum + ", actTrainNum=" + this.actTrainNum + ", actionType=" + this.actionType + ", duration=" + this.duration + ")";
    }

    public FitnessAction(@Nullable String str, int i, int i2, int i3, double d, @Nullable Object obj) {
        this.name = str;
        this.trainNum = i;
        this.actTrainNum = i2;
        this.actionType = i3;
        this.durationSec = d;
        this.duration = obj;
    }

    @Nullable
    /* JADX INFO: renamed from: getDuration, reason: collision with other method in class */
    public final String m4738getDuration() {
        double d = this.durationSec;
        if (d > 0.0d) {
            return wvi.f(getDurationSec(d));
        }
        return Pattern.compile("[0-9]*\\.?[0-9]+").matcher(Objects.toString(this.duration, MapSchema.FIELD_NAME_ENTRY)).matches() ? wvi.f(getDurationSec(Double.parseDouble(String.valueOf(this.duration)))) : Objects.toString(this.duration);
    }

    public final double getDurationSec() {
        return this.durationSec;
    }

    public /* synthetic */ FitnessAction(String str, int i, int i2, int i3, double d, Object obj, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 2 : i3, (i4 & 16) != 0 ? 0.0d : d, (i4 & 32) != 0 ? null : obj);
    }
}
