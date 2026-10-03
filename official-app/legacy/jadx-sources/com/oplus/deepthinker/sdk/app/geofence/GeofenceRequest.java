package com.oplus.deepthinker.sdk.app.geofence;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\u001f\b\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/geofence/GeofenceRequest;", "Landroid/os/Parcelable;", "", "toString", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "Lcom/oplus/deepthinker/sdk/app/geofence/Geofence;", "geofenceList", "Ljava/util/List;", "getGeofenceList", "()Ljava/util/List;", "", "callbackTimeInMillis", "J", "getCallbackTimeInMillis", "()J", "<init>", "(Ljava/util/List;J)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "b", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final class GeofenceRequest implements Parcelable {
    public static final long CALLBACK_TIME_NOT_SET = 0;

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final long callbackTimeInMillis;

    @NotNull
    private final List<Geofence> geofenceList;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/geofence/GeofenceRequest$a;", "", "Lcom/oplus/deepthinker/sdk/app/geofence/GeofenceRequest;", "a", "", "Lcom/oplus/deepthinker/sdk/app/geofence/Geofence;", "Ljava/util/List;", "geofenceList", "", "b", "J", "callbackTimeInMillis", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public List<Geofence> geofenceList = new ArrayList();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public long callbackTimeInMillis;

        @NotNull
        public final GeofenceRequest a() {
            if (this.geofenceList.isEmpty()) {
                throw new IllegalArgumentException("geofenceList must not be empty.");
            }
            return new GeofenceRequest(this.geofenceList, this.callbackTimeInMillis, null);
        }
    }

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.geofence.GeofenceRequest$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\b\u001a\u00020\u00022\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/geofence/GeofenceRequest$b;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/deepthinker/sdk/app/geofence/GeofenceRequest;", "Lkotlin/Function1;", "Lcom/oplus/deepthinker/sdk/app/geofence/GeofenceRequest$a;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "Landroid/os/Parcel;", "parcel", "b", "", "size", "", "c", "(I)[Lcom/oplus/deepthinker/sdk/app/geofence/GeofenceRequest;", "", "CALLBACK_TIME_NOT_SET", "J", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Parcelable.Creator<GeofenceRequest> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final GeofenceRequest a(@NotNull Function1<? super a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return aVar.a();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GeofenceRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GeofenceRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public GeofenceRequest[] newArray(int size) {
            return new GeofenceRequest[size];
        }
    }

    public /* synthetic */ GeofenceRequest(List list, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, j2);
    }

    @JvmStatic
    @NotNull
    public static final GeofenceRequest build(@NotNull Function1<? super a, Unit> function1) {
        return INSTANCE.a(function1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getCallbackTimeInMillis() {
        return this.callbackTimeInMillis;
    }

    @NotNull
    public final List<Geofence> getGeofenceList() {
        return this.geofenceList;
    }

    @NotNull
    public String toString() {
        return "GeofenceRequest: geofenceList=" + this.geofenceList + ", callbackTimeInMillis=" + this.callbackTimeInMillis;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeTypedList(this.geofenceList);
        parcel.writeLong(this.callbackTimeInMillis);
    }

    private GeofenceRequest(List<Geofence> list, long j2) {
        this.geofenceList = list;
        this.callbackTimeInMillis = j2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GeofenceRequest(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        List listCreateTypedArrayList = parcel.createTypedArrayList(Geofence.INSTANCE);
        this(listCreateTypedArrayList == null ? CollectionsKt__CollectionsKt.emptyList() : listCreateTypedArrayList, parcel.readLong());
    }
}
