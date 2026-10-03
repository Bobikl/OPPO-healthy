package com.heytap.health.sport.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001-B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b(\u0010\u0010B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b(\u0010)B\u0011\b\u0014\u0012\u0006\u0010*\u001a\u00020\u0004¢\u0006\u0004\b(\u0010+J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010R\"\u0010%\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\f\u001a\u0004\b&\u0010\u000e\"\u0004\b'\u0010\u0010¨\u0006."}, d2 = {"Lcom/heytap/health/sport/model/MovingGoal;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "dest", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "", "toString", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "I", "getSportMode", "()I", "setSportMode", "(I)V", "goalType", "getGoalType", "setGoalType", "", "doubleValue", "D", "getDoubleValue", "()D", "setDoubleValue", "(D)V", "", "longValue", "J", "getLongValue", "()J", "setLongValue", "(J)V", "locateError", "getLocateError", "setLocateError", "sourceType", "getSourceType", "setSourceType", "<init>", "(II)V", "parcel", "(Landroid/os/Parcel;)V", "Companion", "b", "sport_release"}, k = 1, mv = {1, 8, 0})
public final class MovingGoal implements Parcelable {
    public static final int CALORIE = 1;
    public static final int DURATION = 2;
    public static final int LOCATE_ERROR_NONE = 23;
    public static final int LOCATE_ERROR_SERVICE_DISABLE = 21;
    public static final int MILEAGE = 0;
    public static final int NONE = -1;
    private double doubleValue;
    private int goalType;
    private int locateError;
    private long longValue;
    private int sourceType;
    private int sportMode;
    public static final int $stable = 8;

    @JvmField
    @NotNull
    public static final Parcelable.Creator<MovingGoal> CREATOR = new a();

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/heytap/health/sport/model/MovingGoal$a", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/health/sport/model/MovingGoal;", "Landroid/os/Parcel;", "source", "a", "", "size", "", "b", "(I)[Lcom/heytap/health/sport/model/MovingGoal;", "sport_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Parcelable.Creator<MovingGoal> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MovingGoal createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new MovingGoal(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MovingGoal[] newArray(int size) {
            return new MovingGoal[size];
        }
    }

    public MovingGoal(int i) {
        this.locateError = 21;
        this.sportMode = i;
        this.goalType = -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final double getDoubleValue() {
        return this.doubleValue;
    }

    public final int getGoalType() {
        return this.goalType;
    }

    public final int getLocateError() {
        return this.locateError;
    }

    public final long getLongValue() {
        return this.longValue;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final int getSportMode() {
        return this.sportMode;
    }

    public final void setDoubleValue(double d) {
        this.doubleValue = d;
    }

    public final void setGoalType(int i) {
        this.goalType = i;
    }

    public final void setLocateError(int i) {
        this.locateError = i;
    }

    public final void setLongValue(long j2) {
        this.longValue = j2;
    }

    public final void setSourceType(int i) {
        this.sourceType = i;
    }

    public final void setSportMode(int i) {
        this.sportMode = i;
    }

    @NotNull
    public String toString() {
        return "MovingGoal{sportMode=" + this.sportMode + ", goalType=" + this.goalType + ", doubleValue=" + this.doubleValue + ", longValue=" + this.longValue + ", locateError=" + this.locateError + ", sourceType=" + this.sourceType + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.sportMode);
        dest.writeInt(this.goalType);
        dest.writeDouble(this.doubleValue);
        dest.writeLong(this.longValue);
        dest.writeInt(this.locateError);
        dest.writeInt(this.sourceType);
    }

    public MovingGoal(int i, int i2) {
        this.locateError = 21;
        this.sportMode = i;
        this.goalType = i2;
    }

    public MovingGoal(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.sportMode = 2;
        this.goalType = -1;
        this.locateError = 21;
        this.sportMode = parcel.readInt();
        this.goalType = parcel.readInt();
        this.doubleValue = parcel.readDouble();
        this.longValue = parcel.readLong();
        this.locateError = parcel.readInt();
        this.sourceType = parcel.readInt();
    }
}
