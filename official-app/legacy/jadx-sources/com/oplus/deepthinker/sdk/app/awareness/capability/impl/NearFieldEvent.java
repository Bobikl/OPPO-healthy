package com.oplus.deepthinker.sdk.app.awareness.capability.impl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.g5g;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u0000 72\u00020\u0001:\u00018BS\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b4\u00105B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b4\u00106J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\tHÆ\u0003Je\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b(\u0010'R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b*\u0010'R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b+\u0010'R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b,\u0010'R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00069"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/NearFieldEvent;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "toString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "type", "state", "name", "poiId", "categoryId", "categoryName", "longitude", "latitude", "copy", "hashCode", "", "other", "", "equals", "I", "getType", "()I", "getState", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getPoiId", "getCategoryId", "getCategoryName", "getLongitude", "getLatitude", "Landroid/os/Bundle;", "extra", "Landroid/os/Bundle;", "getExtra", "()Landroid/os/Bundle;", "setExtra", "(Landroid/os/Bundle;)V", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class NearFieldEvent implements Parcelable {

    @NotNull
    public static final String BUNDLE_KEY_CATEGORY_LIST = "category_list";

    @NotNull
    public static final String BUNDLE_KEY_NEAR_FIELD_EVENT = "near_field_event";

    @NotNull
    public static final String BUNDLE_KEY_RECOMMEND_SHOP_LIST = "recommend_shop_list";

    @NotNull
    public static final String BUNDLE_KEY_TAG_LIST = "tag_list";

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "NearFieldEvent";

    @Nullable
    private final String categoryId;

    @Nullable
    private final String categoryName;

    @Nullable
    private Bundle extra;

    @Nullable
    private final String latitude;

    @Nullable
    private final String longitude;

    @Nullable
    private final String name;

    @Nullable
    private final String poiId;
    private final int state;
    private final int type;

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.awareness.capability.impl.NearFieldEvent$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/NearFieldEvent$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/NearFieldEvent;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/deepthinker/sdk/app/awareness/capability/impl/NearFieldEvent;", "", "BUNDLE_KEY_CATEGORY_LIST", "Ljava/lang/String;", "BUNDLE_KEY_NEAR_FIELD_EVENT", "BUNDLE_KEY_RECOMMEND_SHOP_LIST", "BUNDLE_KEY_TAG_LIST", "TAG", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Parcelable.Creator<NearFieldEvent> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NearFieldEvent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new NearFieldEvent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public NearFieldEvent[] newArray(int size) {
            return new NearFieldEvent[size];
        }
    }

    public NearFieldEvent(int i, int i2, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.type = i;
        this.state = i2;
        this.name = str;
        this.poiId = str2;
        this.categoryId = str3;
        this.categoryName = str4;
        this.longitude = str5;
        this.latitude = str6;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPoiId() {
        return this.poiId;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLongitude() {
        return this.longitude;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLatitude() {
        return this.latitude;
    }

    @NotNull
    public final NearFieldEvent copy(int type, int state, @Nullable String name, @Nullable String poiId, @Nullable String categoryId, @Nullable String categoryName, @Nullable String longitude, @Nullable String latitude) {
        return new NearFieldEvent(type, state, name, poiId, categoryId, categoryName, longitude, latitude);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NearFieldEvent)) {
            return false;
        }
        NearFieldEvent nearFieldEvent = (NearFieldEvent) other;
        return this.type == nearFieldEvent.type && this.state == nearFieldEvent.state && Intrinsics.areEqual(this.name, nearFieldEvent.name) && Intrinsics.areEqual(this.poiId, nearFieldEvent.poiId) && Intrinsics.areEqual(this.categoryId, nearFieldEvent.categoryId) && Intrinsics.areEqual(this.categoryName, nearFieldEvent.categoryName) && Intrinsics.areEqual(this.longitude, nearFieldEvent.longitude) && Intrinsics.areEqual(this.latitude, nearFieldEvent.latitude);
    }

    @Nullable
    public final String getCategoryId() {
        return this.categoryId;
    }

    @Nullable
    public final String getCategoryName() {
        return this.categoryName;
    }

    @Nullable
    public final Bundle getExtra() {
        return this.extra;
    }

    @Nullable
    public final String getLatitude() {
        return this.latitude;
    }

    @Nullable
    public final String getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPoiId() {
        return this.poiId;
    }

    public final int getState() {
        return this.state;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.type) * 31) + Integer.hashCode(this.state)) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.poiId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.categoryId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.categoryName;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.longitude;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.latitude;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setExtra(@Nullable Bundle bundle) {
        this.extra = bundle;
    }

    @NotNull
    public String toString() {
        return "NearFieldEvent(type=" + this.type + ", state=" + this.state + ", poiId=" + ((Object) this.poiId) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.type);
        parcel.writeInt(this.state);
        parcel.writeString(this.name);
        parcel.writeString(this.poiId);
        parcel.writeString(this.categoryId);
        parcel.writeString(this.categoryName);
        parcel.writeString(this.longitude);
        parcel.writeString(this.latitude);
        parcel.writeBundle(this.extra);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NearFieldEvent(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        try {
            this.extra = parcel.readBundle(NearFieldEvent.class.getClassLoader());
        } catch (IllegalStateException e2) {
            g5g.h(TAG, Intrinsics.stringPlus("readBundle warning, ", e2));
        }
    }
}
