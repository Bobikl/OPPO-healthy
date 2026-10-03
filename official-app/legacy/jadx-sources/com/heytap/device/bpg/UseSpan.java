package com.heytap.device.bpg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.smartenginehelper.entity.TextEntity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Parcelize
@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ<\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/heytap/device/bpg/UseSpan;", "Landroid/os/Parcelable;", "text", "", "fontSizeSp", "", "fontWeight", TextEntity.TYPEFACE_STYLE_BOLD, "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getBold", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFontSizeSp", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFontWeight", "getText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/heytap/device/bpg/UseSpan;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_third_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UseSpan implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UseSpan> CREATOR = new a();

    @Nullable
    private final Boolean bold;

    @Nullable
    private final Integer fontSizeSp;

    @Nullable
    private final Integer fontWeight;

    @NotNull
    private final String text;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UseSpan> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UseSpan createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UseSpan(string, numValueOf, numValueOf2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UseSpan[] newArray(int i) {
            return new UseSpan[i];
        }
    }

    public UseSpan(@NotNull String text, @Nullable Integer num, @Nullable Integer num2, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.text = text;
        this.fontSizeSp = num;
        this.fontWeight = num2;
        this.bold = bool;
    }

    public static /* synthetic */ UseSpan copy$default(UseSpan useSpan, String str, Integer num, Integer num2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = useSpan.text;
        }
        if ((i & 2) != 0) {
            num = useSpan.fontSizeSp;
        }
        if ((i & 4) != 0) {
            num2 = useSpan.fontWeight;
        }
        if ((i & 8) != 0) {
            bool = useSpan.bold;
        }
        return useSpan.copy(str, num, num2, bool);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getFontSizeSp() {
        return this.fontSizeSp;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getFontWeight() {
        return this.fontWeight;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getBold() {
        return this.bold;
    }

    @NotNull
    public final UseSpan copy(@NotNull String text, @Nullable Integer fontSizeSp, @Nullable Integer fontWeight, @Nullable Boolean bold) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new UseSpan(text, fontSizeSp, fontWeight, bold);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UseSpan)) {
            return false;
        }
        UseSpan useSpan = (UseSpan) other;
        return Intrinsics.areEqual(this.text, useSpan.text) && Intrinsics.areEqual(this.fontSizeSp, useSpan.fontSizeSp) && Intrinsics.areEqual(this.fontWeight, useSpan.fontWeight) && Intrinsics.areEqual(this.bold, useSpan.bold);
    }

    @Nullable
    public final Boolean getBold() {
        return this.bold;
    }

    @Nullable
    public final Integer getFontSizeSp() {
        return this.fontSizeSp;
    }

    @Nullable
    public final Integer getFontWeight() {
        return this.fontWeight;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Integer num = this.fontSizeSp;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.fontWeight;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.bold;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UseSpan(text=" + this.text + ", fontSizeSp=" + this.fontSizeSp + ", fontWeight=" + this.fontWeight + ", bold=" + this.bold + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.text);
        Integer num = this.fontSizeSp;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.fontWeight;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Boolean bool = this.bold;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ UseSpan(String str, Integer num, Integer num2, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : bool);
    }
}
