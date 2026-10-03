package com.oplus.deepthinker.sdk.app.awareness.capability;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001&B\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\"\u0010$J\u0016\u0010\u0005\u001a\u00020\u0004*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0014\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/CapabilityEventCategory;", "Landroid/os/Parcelable;", "Landroid/os/Bundle;", "other", "", "checkEquals", "", "calHashCode", "Landroid/os/Parcel;", "parcel", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "equals", "hashCode", "component1", "component2", "eventId", "eventMode", "copy", "", "toString", "I", "getEventId", "()I", "getEventMode", "capabilityArgs", "Landroid/os/Bundle;", "getCapabilityArgs", "()Landroid/os/Bundle;", "setCapabilityArgs", "(Landroid/os/Bundle;)V", "<init>", "(II)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final /* data */ class CapabilityEventCategory implements Parcelable {
    public static final int CAPABILITY_EVENT_MODE_OPTIONAL = 1;
    public static final int CAPABILITY_EVENT_MODE_REQUIRED = 2;

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int HASH_NUM = 31;

    @Nullable
    private Bundle capabilityArgs;
    private final int eventId;
    private final int eventMode;

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.awareness.capability.CapabilityEventCategory$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/awareness/capability/CapabilityEventCategory$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/deepthinker/sdk/app/awareness/capability/CapabilityEventCategory;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/oplus/deepthinker/sdk/app/awareness/capability/CapabilityEventCategory;", "CAPABILITY_EVENT_MODE_OPTIONAL", "I", "CAPABILITY_EVENT_MODE_REQUIRED", "HASH_NUM", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Parcelable.Creator<CapabilityEventCategory> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CapabilityEventCategory createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CapabilityEventCategory(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CapabilityEventCategory[] newArray(int size) {
            return new CapabilityEventCategory[size];
        }
    }

    public CapabilityEventCategory(int i, int i2) {
        this.eventId = i;
        this.eventMode = i2;
    }

    private final int calHashCode(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            iHashCode = (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }

    private final boolean checkEquals(Bundle bundle, Bundle bundle2) {
        boolean z;
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<String> setKeySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "this.keySet()");
        linkedHashSet.addAll(setKeySet);
        Set<String> setKeySet2 = bundle2.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet2, "other.keySet()");
        linkedHashSet.addAll(setKeySet2);
        Iterator it = linkedHashSet.iterator();
        do {
            z = true;
            if (!it.hasNext()) {
                return true;
            }
            String str = (String) it.next();
            if (!bundle.containsKey(str) || !bundle2.containsKey(str)) {
                break;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !checkEquals((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null && obj2 != null) {
                return false;
            }
            if (obj == null || obj.equals(obj2)) {
                z = false;
            }
        } while (!z);
        return false;
    }

    public static /* synthetic */ CapabilityEventCategory copy$default(CapabilityEventCategory capabilityEventCategory, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = capabilityEventCategory.eventId;
        }
        if ((i3 & 2) != 0) {
            i2 = capabilityEventCategory.eventMode;
        }
        return capabilityEventCategory.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getEventMode() {
        return this.eventMode;
    }

    @NotNull
    public final CapabilityEventCategory copy(int eventId, int eventMode) {
        return new CapabilityEventCategory(eventId, eventMode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!(other instanceof CapabilityEventCategory)) {
            return false;
        }
        CapabilityEventCategory capabilityEventCategory = (CapabilityEventCategory) other;
        if (capabilityEventCategory.eventId != this.eventId) {
            return false;
        }
        Bundle bundle = capabilityEventCategory.capabilityArgs;
        if (bundle != null || this.capabilityArgs != null) {
            if ((bundle == null || checkEquals(bundle, this.capabilityArgs)) ? false : true) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final Bundle getCapabilityArgs() {
        return this.capabilityArgs;
    }

    public final int getEventId() {
        return this.eventId;
    }

    public final int getEventMode() {
        return this.eventMode;
    }

    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.eventId) + 31) * 31;
        Bundle bundle = this.capabilityArgs;
        return iHashCode + (bundle == null ? 0 : calHashCode(bundle));
    }

    public final void setCapabilityArgs(@Nullable Bundle bundle) {
        this.capabilityArgs = bundle;
    }

    @NotNull
    public String toString() {
        return "CapabilityEventCategory(eventId=" + this.eventId + ", eventMode=" + this.eventMode + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.eventId);
        parcel.writeInt(this.eventMode);
        parcel.writeBundle(this.capabilityArgs);
    }

    public /* synthetic */ CapabilityEventCategory(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 2 : i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CapabilityEventCategory(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.capabilityArgs = parcel.readBundle(CapabilityEventCategory.class.getClassLoader());
    }
}
