package com.oplus.deepthinker.sdk.app.geofence;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.EventType;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB)\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lcom/oplus/deepthinker/sdk/app/geofence/GeofenceEvent;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "toString", "", "Lcom/oplus/deepthinker/sdk/app/geofence/Geofence;", "triggeringGeofences", "Ljava/util/List;", "getTriggeringGeofences", "()Ljava/util/List;", "Landroid/location/Location;", "triggeringLocation", "Landroid/location/Location;", "getTriggeringLocation", "()Landroid/location/Location;", "Lcom/oplus/deepthinker/sdk/app/geofence/Geofence$TransitionType;", "geofenceTransition", "Lcom/oplus/deepthinker/sdk/app/geofence/Geofence$TransitionType;", "getGeofenceTransition", "()Lcom/oplus/deepthinker/sdk/app/geofence/Geofence$TransitionType;", "<init>", "(Ljava/util/List;Landroid/location/Location;Lcom/oplus/deepthinker/sdk/app/geofence/Geofence$TransitionType;)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final class GeofenceEvent implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Geofence.TransitionType geofenceTransition;

    @Nullable
    private final List<Geofence> triggeringGeofences;

    @Nullable
    private final Location triggeringLocation;

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.geofence.GeofenceEvent$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0014\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¨\u0006\u0010"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/geofence/GeofenceEvent$a;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/deepthinker/sdk/app/geofence/GeofenceEvent;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "c", "(I)[Lcom/oplus/deepthinker/sdk/app/geofence/GeofenceEvent;", "Landroid/os/Bundle;", "bundle", "b", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Parcelable.Creator<GeofenceEvent> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GeofenceEvent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GeofenceEvent(parcel);
        }

        @JvmStatic
        @Nullable
        public final GeofenceEvent b(@Nullable Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return (GeofenceEvent) bundle.getParcelable(EventType.GeoFenceExtra.BUNDLE_KEY_GEOFENCE_EVENT);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GeofenceEvent[] newArray(int size) {
            return new GeofenceEvent[size];
        }
    }

    public GeofenceEvent(@Nullable List<Geofence> list, @Nullable Location location, @NotNull Geofence.TransitionType geofenceTransition) {
        Intrinsics.checkNotNullParameter(geofenceTransition, "geofenceTransition");
        this.triggeringGeofences = list;
        this.triggeringLocation = location;
        this.geofenceTransition = geofenceTransition;
    }

    @JvmStatic
    @Nullable
    public static final GeofenceEvent fromBundle(@Nullable Bundle bundle) {
        return INSTANCE.b(bundle);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final Geofence.TransitionType getGeofenceTransition() {
        return this.geofenceTransition;
    }

    @Nullable
    public final List<Geofence> getTriggeringGeofences() {
        return this.triggeringGeofences;
    }

    @Nullable
    public final Location getTriggeringLocation() {
        return this.triggeringLocation;
    }

    @NotNull
    public String toString() {
        return "GeofenceEvent(triggeringGeofences=" + this.triggeringGeofences + ", triggeringLocation=" + this.triggeringLocation + ", geofenceTransition=" + this.geofenceTransition + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeTypedList(this.triggeringGeofences);
        parcel.writeParcelable(this.triggeringLocation, flags);
        parcel.writeInt(this.geofenceTransition.ordinal());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GeofenceEvent(@NotNull Parcel parcel) {
        this(parcel.createTypedArrayList(Geofence.INSTANCE), (Location) parcel.readParcelable(Location.class.getClassLoader()), Geofence.TransitionType.values()[parcel.readInt()]);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
