package com.heytap.health.watch.notification.impl.fluid;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003JE\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0012¨\u00062"}, d2 = {"Lcom/heytap/health/watch/notification/impl/fluid/TextBean;", "Landroid/os/Parcelable;", "text", "", "level", "color", "", "targetCountDownTime", "", "startText", "", "step", "(Ljava/lang/String;Ljava/lang/String;IJZI)V", "getColor", "()I", "setColor", "(I)V", "getLevel", "()Ljava/lang/String;", "setLevel", "(Ljava/lang/String;)V", "getStartText", "()Z", "setStartText", "(Z)V", "getStep", "setStep", "getTargetCountDownTime", "()J", "setTargetCountDownTime", "(J)V", "getText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class TextBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TextBean> CREATOR = new a();
    private int color;

    @NotNull
    private String level;
    private boolean startText;
    private int step;
    private long targetCountDownTime;

    @NotNull
    private final String text;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TextBean> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TextBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TextBean(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TextBean[] newArray(int i) {
            return new TextBean[i];
        }
    }

    public TextBean(@NotNull String text, @NotNull String level, int i, long j2, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(level, "level");
        this.text = text;
        this.level = level;
        this.color = i;
        this.targetCountDownTime = j2;
        this.startText = z;
        this.step = i2;
    }

    public static /* synthetic */ TextBean copy$default(TextBean textBean, String str, String str2, int i, long j2, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = textBean.text;
        }
        if ((i3 & 2) != 0) {
            str2 = textBean.level;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = textBean.color;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            j2 = textBean.targetCountDownTime;
        }
        long j3 = j2;
        if ((i3 & 16) != 0) {
            z = textBean.startText;
        }
        boolean z2 = z;
        if ((i3 & 32) != 0) {
            i2 = textBean.step;
        }
        return textBean.copy(str, str3, i4, j3, z2, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTargetCountDownTime() {
        return this.targetCountDownTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getStartText() {
        return this.startText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStep() {
        return this.step;
    }

    @NotNull
    public final TextBean copy(@NotNull String text, @NotNull String level, int color, long targetCountDownTime, boolean startText, int step) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(level, "level");
        return new TextBean(text, level, color, targetCountDownTime, startText, step);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextBean)) {
            return false;
        }
        TextBean textBean = (TextBean) other;
        return Intrinsics.areEqual(this.text, textBean.text) && Intrinsics.areEqual(this.level, textBean.level) && this.color == textBean.color && this.targetCountDownTime == textBean.targetCountDownTime && this.startText == textBean.startText && this.step == textBean.step;
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    public final boolean getStartText() {
        return this.startText;
    }

    public final int getStep() {
        return this.step;
    }

    public final long getTargetCountDownTime() {
        return this.targetCountDownTime;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int iHashCode = ((((((this.text.hashCode() * 31) + this.level.hashCode()) * 31) + Integer.hashCode(this.color)) * 31) + Long.hashCode(this.targetCountDownTime)) * 31;
        boolean z = this.startText;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + Integer.hashCode(this.step);
    }

    public final void setColor(int i) {
        this.color = i;
    }

    public final void setLevel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.level = str;
    }

    public final void setStartText(boolean z) {
        this.startText = z;
    }

    public final void setStep(int i) {
        this.step = i;
    }

    public final void setTargetCountDownTime(long j2) {
        this.targetCountDownTime = j2;
    }

    @NotNull
    public String toString() {
        return "TextBean(text=" + this.text + ", level=" + this.level + ", color=" + this.color + ", targetCountDownTime=" + this.targetCountDownTime + ", startText=" + this.startText + ", step=" + this.step + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.text);
        parcel.writeString(this.level);
        parcel.writeInt(this.color);
        parcel.writeLong(this.targetCountDownTime);
        parcel.writeInt(this.startText ? 1 : 0);
        parcel.writeInt(this.step);
    }

    public /* synthetic */ TextBean(String str, String str2, int i, long j2, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i3 & 8) != 0 ? 0L : j2, (i3 & 16) != 0 ? false : z, (i3 & 32) != 0 ? 1 : i2);
    }
}
