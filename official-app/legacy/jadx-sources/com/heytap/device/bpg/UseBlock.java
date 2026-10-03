package com.heytap.device.bpg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/heytap/device/bpg/UseBlock;", "Landroid/os/Parcelable;", "type", "", "text", "Lcom/heytap/device/bpg/UseRichText;", "src", "(Ljava/lang/String;Lcom/heytap/device/bpg/UseRichText;Ljava/lang/String;)V", "getSrc", "()Ljava/lang/String;", "getText", "()Lcom/heytap/device/bpg/UseRichText;", "getType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "device_third_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UseBlock implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UseBlock> CREATOR = new a();

    @Nullable
    private final String src;

    @Nullable
    private final UseRichText text;

    @NotNull
    private final String type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UseBlock> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UseBlock createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UseBlock(parcel.readString(), parcel.readInt() == 0 ? null : UseRichText.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final UseBlock[] newArray(int i) {
            return new UseBlock[i];
        }
    }

    public UseBlock(@NotNull String type, @Nullable UseRichText useRichText, @Nullable String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.text = useRichText;
        this.src = str;
    }

    public static /* synthetic */ UseBlock copy$default(UseBlock useBlock, String str, UseRichText useRichText, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = useBlock.type;
        }
        if ((i & 2) != 0) {
            useRichText = useBlock.text;
        }
        if ((i & 4) != 0) {
            str2 = useBlock.src;
        }
        return useBlock.copy(str, useRichText, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final UseRichText getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    @NotNull
    public final UseBlock copy(@NotNull String type, @Nullable UseRichText text, @Nullable String src) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new UseBlock(type, text, src);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UseBlock)) {
            return false;
        }
        UseBlock useBlock = (UseBlock) other;
        return Intrinsics.areEqual(this.type, useBlock.type) && Intrinsics.areEqual(this.text, useBlock.text) && Intrinsics.areEqual(this.src, useBlock.src);
    }

    @Nullable
    public final String getSrc() {
        return this.src;
    }

    @Nullable
    public final UseRichText getText() {
        return this.text;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        UseRichText useRichText = this.text;
        int iHashCode2 = (iHashCode + (useRichText == null ? 0 : useRichText.hashCode())) * 31;
        String str = this.src;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UseBlock(type=" + this.type + ", text=" + this.text + ", src=" + this.src + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.type);
        UseRichText useRichText = this.text;
        if (useRichText == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            useRichText.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.src);
    }

    public /* synthetic */ UseBlock(String str, UseRichText useRichText, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : useRichText, (i & 4) != 0 ? null : str2);
    }
}
