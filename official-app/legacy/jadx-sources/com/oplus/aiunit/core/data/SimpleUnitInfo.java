package com.oplus.aiunit.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0006H\u0016J\u0013\u0010\u001a\u001a\u00020\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\u0006\u0010\u001d\u001a\u00020\u0006J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0006\u0010\u001f\u001a\u00020\fJ\u0006\u0010 \u001a\u00020\fJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\fJ\u000e\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u0006J\u000e\u0010&\u001a\u00020\"2\u0006\u0010#\u001a\u00020\fJ\b\u0010'\u001a\u00020\bH\u0016J\u0018\u0010(\u001a\u00020\"2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0006H\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/oplus/aiunit/core/data/SimpleUnitInfo;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "id", "", "name", "", "state", "(ILjava/lang/String;I)V", "availableInner", "", "getId", "()I", "getName", "()Ljava/lang/String;", "getState", "type", "unsupportedBySelfInner", "component1", "component2", "component3", "copy", "defaultType", "describeContents", "equals", "other", "", "getRunType", "hashCode", "isAvailable", "isUnsupportedBySelf", "setAvailable", "", "b", "setRunType", "t", "setUnsupportedBySelf", "toString", "writeToParcel", UTraceSQLiteHelperKt.COL_FLAGS, "CREATOR", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class SimpleUnitInfo implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private boolean availableInner;
    private final int id;

    @NotNull
    private final String name;
    private final int state;
    private int type;
    private boolean unsupportedBySelfInner;

    /* JADX INFO: renamed from: com.oplus.aiunit.core.data.SimpleUnitInfo$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/core/data/SimpleUnitInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/aiunit/core/data/SimpleUnitInfo;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/oplus/aiunit/core/data/SimpleUnitInfo;", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<SimpleUnitInfo> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SimpleUnitInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SimpleUnitInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SimpleUnitInfo[] newArray(int size) {
            return new SimpleUnitInfo[size];
        }
    }

    public SimpleUnitInfo(int i, @NotNull String name, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.name = name;
        this.state = i2;
        this.type = -1;
        this.availableInner = i2 >= 1 && i2 <= 4;
        this.unsupportedBySelfInner = i2 == 0 || i2 == 12 || i2 == 13;
        this.type = defaultType();
    }

    public static /* synthetic */ SimpleUnitInfo copy$default(SimpleUnitInfo simpleUnitInfo, int i, String str, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = simpleUnitInfo.id;
        }
        if ((i3 & 2) != 0) {
            str = simpleUnitInfo.name;
        }
        if ((i3 & 4) != 0) {
            i2 = simpleUnitInfo.state;
        }
        return simpleUnitInfo.copy(i, str, i2);
    }

    private final int defaultType() {
        return (Intrinsics.areEqual(this.name, "cloud_aigc_article_summary") || Intrinsics.areEqual(this.name, "cloud_aigc_call_summary") || Intrinsics.areEqual(this.name, "cloud_aigc_sdinpainting") || Intrinsics.areEqual(this.name, "cloud_aigc_segmentation") || Intrinsics.areEqual(this.name, "cloud_audio_asr")) ? 1 : 0;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @NotNull
    public final SimpleUnitInfo copy(int id, @NotNull String name, int state) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new SimpleUnitInfo(id, name, state);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleUnitInfo)) {
            return false;
        }
        SimpleUnitInfo simpleUnitInfo = (SimpleUnitInfo) other;
        return this.id == simpleUnitInfo.id && Intrinsics.areEqual(this.name, simpleUnitInfo.name) && this.state == simpleUnitInfo.state;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: getRunType, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final int getState() {
        return this.state;
    }

    public int hashCode() {
        return Integer.hashCode(this.state) + ((this.name.hashCode() + (Integer.hashCode(this.id) * 31)) * 31);
    }

    /* JADX INFO: renamed from: isAvailable, reason: from getter */
    public final boolean getAvailableInner() {
        return this.availableInner;
    }

    /* JADX INFO: renamed from: isUnsupportedBySelf, reason: from getter */
    public final boolean getUnsupportedBySelfInner() {
        return this.unsupportedBySelfInner;
    }

    public final void setAvailable(boolean b) {
        this.availableInner = b;
    }

    public final void setRunType(int t) {
        this.type = t;
    }

    public final void setUnsupportedBySelf(boolean b) {
        this.unsupportedBySelfInner = b;
    }

    @NotNull
    public String toString() {
        return "SimpleUnitInfo[" + this.id + "=id, name=" + this.name + ", state=" + this.state + ", available=" + this.availableInner + ", unsupportedBySelf=" + this.unsupportedBySelfInner + ", type=" + this.type + ']';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeInt(this.state);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SimpleUnitInfo(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int i = parcel.readInt();
        String string = parcel.readString();
        this(i, string == null ? "" : string, parcel.readInt());
    }
}
