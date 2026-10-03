package com.oplus.deepthinker.sdk.app.awareness.capability.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001\"B#\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001e\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006#"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/ProvinceCityEvent;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "component1", "", "component2", "component3", "type", EventType.CityFenceExtra.BUNDLE_KEY_NEW, EventType.CityFenceExtra.BUNDLE_KEY_OLD, "copy", "toString", "hashCode", "", "other", "", "equals", "I", "getType", "()I", "Ljava/lang/String;", "getNew", "()Ljava/lang/String;", "getOld", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class ProvinceCityEvent implements Parcelable {

    @NotNull
    public static final String BUNDLE_KEY_PROVINCE_CITY_EVENT = "province_city_event";

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String new;

    @Nullable
    private final String old;
    private final int type;

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.awareness.capability.impl.ProvinceCityEvent$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/ProvinceCityEvent$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/ProvinceCityEvent;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/ProvinceCityEvent;", "", "BUNDLE_KEY_PROVINCE_CITY_EVENT", "Ljava/lang/String;", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Parcelable.Creator<ProvinceCityEvent> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProvinceCityEvent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProvinceCityEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ProvinceCityEvent[] newArray(int size) {
            return new ProvinceCityEvent[size];
        }
    }

    public ProvinceCityEvent(int i, @Nullable String str, @Nullable String str2) {
        this.type = i;
        this.new = str;
        this.old = str2;
    }

    public static /* synthetic */ ProvinceCityEvent copy$default(ProvinceCityEvent provinceCityEvent, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = provinceCityEvent.type;
        }
        if ((i2 & 2) != 0) {
            str = provinceCityEvent.new;
        }
        if ((i2 & 4) != 0) {
            str2 = provinceCityEvent.old;
        }
        return provinceCityEvent.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNew() {
        return this.new;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOld() {
        return this.old;
    }

    @NotNull
    public final ProvinceCityEvent copy(int type, @Nullable String str, @Nullable String old) {
        return new ProvinceCityEvent(type, str, old);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProvinceCityEvent)) {
            return false;
        }
        ProvinceCityEvent provinceCityEvent = (ProvinceCityEvent) other;
        return this.type == provinceCityEvent.type && Intrinsics.areEqual(this.new, provinceCityEvent.new) && Intrinsics.areEqual(this.old, provinceCityEvent.old);
    }

    @Nullable
    public final String getNew() {
        return this.new;
    }

    @Nullable
    public final String getOld() {
        return this.old;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type) * 31;
        String str = this.new;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.old;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProvinceCityEvent(type=" + this.type + ", new=" + ((Object) this.new) + ", old=" + ((Object) this.old) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.type);
        parcel.writeString(this.new);
        parcel.writeString(this.old);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProvinceCityEvent(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
