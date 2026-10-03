package com.oplus.deepthinker.sdk.app.geofence;

import android.os.Parcel;
import android.os.Parcelable;
import com.oplus.aiunit.vision.b2n;
import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u0000 &2\u00020\u0001:\u0003'()BC\b\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b#\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010!\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006*"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/geofence/Geofence;", "Landroid/os/Parcelable;", "", "toString", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "", "longitude", "D", "getLongitude", "()D", "latitude", "getLatitude", "radius", "I", "getRadius", "()I", "transitionTypes", "getTransitionTypes", "", "loiteringDelayMs", "J", "getLoiteringDelayMs", "()J", "expirationDurationInMillis", "getExpirationDurationInMillis", "<init>", "(Ljava/lang/String;DDIIJJ)V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "b", "TransitionType", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final class Geofence implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int DWELL_VALUE = 4;
    private static final int ENTER_VALUE = 1;
    private static final int EXIT_VALUE = 2;
    public static final long LOITERING_DELAY_NOT_SET = 0;
    public static final int MIN_RADIUS = 150;
    public static final long NEVER_EXPIRE = 0;
    private static final int UNKNOWN_VALUE = 0;

    /* JADX INFO: renamed from: expirationDurationInMillis, reason: from kotlin metadata and from toString */
    private final long Expiration;

    @Nullable
    private final String id;

    /* JADX INFO: renamed from: latitude, reason: from kotlin metadata and from toString */
    private final double Latitude;

    /* JADX INFO: renamed from: loiteringDelayMs, reason: from kotlin metadata and from toString */
    private final long LoiteringDelay;

    /* JADX INFO: renamed from: longitude, reason: from kotlin metadata and from toString */
    private final double Longitude;

    /* JADX INFO: renamed from: radius, reason: from kotlin metadata and from toString */
    private final int Radius;

    /* JADX INFO: renamed from: transitionTypes, reason: from kotlin metadata and from toString */
    private final int TransitionTypes;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/geofence/Geofence$TransitionType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTER", "EXIT", "DWELL", LanConstants.OPERATOR_UNKNOWN, "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum TransitionType {
        ENTER(1),
        EXIT(2),
        DWELL(4),
        UNKNOWN(0);

        private final int value;

        TransitionType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/geofence/Geofence$a;", "", "Lcom/oplus/deepthinker/sdk/app/geofence/Geofence;", "a", "", "Ljava/lang/String;", "geofenceId", "", "b", "Ljava/lang/Double;", "longitude", "c", "latitude", "", "d", "I", "radius", MapSchema.FIELD_NAME_ENTRY, "transitionTypes", "", "f", "J", "loiteringDelayMs", b2n.f, "expirationDurationInMillis", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public String geofenceId;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public Double longitude;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public Double latitude;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int radius = 150;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        public int transitionTypes = TransitionType.UNKNOWN.getValue();

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public long loiteringDelayMs;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public long expirationDurationInMillis;

        @NotNull
        public final Geofence a() {
            String str = this.geofenceId;
            Double d = this.longitude;
            Intrinsics.checkNotNull(d);
            double dDoubleValue = d.doubleValue();
            Double d2 = this.latitude;
            Intrinsics.checkNotNull(d2);
            return new Geofence(str, dDoubleValue, d2.doubleValue(), this.radius, this.transitionTypes, this.loiteringDelayMs, this.expirationDurationInMillis, null);
        }
    }

    /* JADX INFO: renamed from: com.oplus.deepthinker.sdk.app.geofence.Geofence$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\b\u001a\u00020\u00022\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u001f\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"Lcom/oplus/deepthinker/sdk/app/geofence/Geofence$b;", "Landroid/os/Parcelable$Creator;", "Lcom/oplus/deepthinker/sdk/app/geofence/Geofence;", "Lkotlin/Function1;", "Lcom/oplus/deepthinker/sdk/app/geofence/Geofence$a;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "Landroid/os/Parcel;", "parcel", "b", "", "size", "", "c", "(I)[Lcom/oplus/deepthinker/sdk/app/geofence/Geofence;", "DWELL_VALUE", "I", "ENTER_VALUE", "EXIT_VALUE", "", "LOITERING_DELAY_NOT_SET", "J", "MIN_RADIUS", "NEVER_EXPIRE", "UNKNOWN_VALUE", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion implements Parcelable.Creator<Geofence> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Geofence a(@NotNull Function1<? super a, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            a aVar = new a();
            block.invoke(aVar);
            return aVar.a();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Geofence createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Geofence(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Geofence[] newArray(int size) {
            return new Geofence[size];
        }
    }

    public /* synthetic */ Geofence(String str, double d, double d2, int i, int i2, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, d, d2, i, i2, j2, j3);
    }

    @JvmStatic
    @NotNull
    public static final Geofence build(@NotNull Function1<? super a, Unit> function1) {
        return INSTANCE.a(function1);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: getExpirationDurationInMillis, reason: from getter */
    public final long getExpiration() {
        return this.Expiration;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public final double getLatitude() {
        return this.Latitude;
    }

    /* JADX INFO: renamed from: getLoiteringDelayMs, reason: from getter */
    public final long getLoiteringDelay() {
        return this.LoiteringDelay;
    }

    public final double getLongitude() {
        return this.Longitude;
    }

    public final int getRadius() {
        return this.Radius;
    }

    public final int getTransitionTypes() {
        return this.TransitionTypes;
    }

    @NotNull
    public String toString() {
        return "Geofence: GeofenceId=" + ((Object) this.id) + ", Longitude=" + this.Longitude + ", Latitude=" + this.Latitude + ", Radius=" + this.Radius + ", TransitionTypes=" + this.TransitionTypes + ", LoiteringDelay=" + this.LoiteringDelay + ", Expiration=" + this.Expiration;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeDouble(this.Longitude);
        parcel.writeDouble(this.Latitude);
        parcel.writeInt(this.Radius);
        parcel.writeInt(this.TransitionTypes);
        parcel.writeLong(this.LoiteringDelay);
        parcel.writeLong(this.Expiration);
    }

    private Geofence(String str, double d, double d2, int i, int i2, long j2, long j3) {
        this.id = str;
        this.Longitude = d;
        this.Latitude = d2;
        this.Radius = i;
        this.TransitionTypes = i2;
        this.LoiteringDelay = j2;
        this.Expiration = j3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Geofence(@NotNull Parcel parcel) {
        this(parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
