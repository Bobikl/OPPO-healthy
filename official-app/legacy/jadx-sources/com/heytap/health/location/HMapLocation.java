package com.heytap.health.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.amap.api.services.district.DistrictSearchQuery;
import com.heytap.databaseengine.model.UserInfo;
import com.oplus.aiunit.vision.iim;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Keep
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b-\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u0000 S2\u00020\u0001:\u0001TB\u0007¢\u0006\u0004\bP\u0010QB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\bP\u0010RJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018\"\u0004\b'\u0010\u001aR\"\u0010(\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001f\"\u0004\b*\u0010!R$\u0010+\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00101\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R$\u00104\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\"\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u0016\u001a\u0004\b8\u0010\u0018\"\u0004\b9\u0010\u001aR$\u0010:\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R$\u0010=\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010,\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R\"\u0010@\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010\u0016\u001a\u0004\bA\u0010\u0018\"\u0004\bB\u0010\u001aR$\u0010C\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010,\u001a\u0004\bD\u0010.\"\u0004\bE\u00100R$\u0010F\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010,\u001a\u0004\bG\u0010.\"\u0004\bH\u00100R\"\u0010J\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006U"}, d2 = {"Lcom/heytap/health/location/HMapLocation;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", UTraceSQLiteHelperKt.COL_FLAGS, "", "writeToParcel", "describeContents", "", "toString", "", "latitude", "D", "getLatitude", "()D", "setLatitude", "(D)V", "longitude", "getLongitude", "setLongitude", "gpsAccuracyStatus", "I", "getGpsAccuracyStatus", "()I", "setGpsAccuracyStatus", "(I)V", "", "bearing", UserInfo.SEX_FEMALE, "getBearing", "()F", "setBearing", "(F)V", "speed", "getSpeed", "setSpeed", "conScenario", "getConScenario", "setConScenario", "accuracy", "getAccuracy", "setAccuracy", DistrictSearchQuery.KEYWORDS_CITY, "Ljava/lang/String;", "getCity", "()Ljava/lang/String;", "setCity", "(Ljava/lang/String;)V", DistrictSearchQuery.KEYWORDS_DISTRICT, "getDistrict", "setDistrict", "adCode", "getAdCode", "setAdCode", "locType", "getLocType", "setLocType", DistrictSearchQuery.KEYWORDS_PROVINCE, "getProvince", "setProvince", "addrStr", "getAddrStr", "setAddrStr", "errorCode", "getErrorCode", "setErrorCode", "coordType", "getCoordType", "setCoordType", iim.a.f, "getDescription", "setDescription", "", ClickApiEntity.TIME, "J", "getTime", "()J", "setTime", "(J)V", "<init>", "()V", "(Landroid/os/Parcel;)V", "CREATOR", "a", "location_release"}, k = 1, mv = {1, 8, 0})
public final class HMapLocation implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private float accuracy;

    @Nullable
    private String adCode;

    @Nullable
    private String addrStr;
    private float bearing;

    @Nullable
    private String city;
    private int conScenario;

    @Nullable
    private String coordType;

    @Nullable
    private String description;

    @Nullable
    private String district;
    private int errorCode;
    private int gpsAccuracyStatus;
    private double latitude;
    private int locType;
    private double longitude;

    @Nullable
    private String province;
    private float speed;
    private long time;

    /* JADX INFO: renamed from: com.heytap.health.location.HMapLocation$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/health/location/HMapLocation$a;", "Landroid/os/Parcelable$Creator;", "Lcom/heytap/health/location/HMapLocation;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/heytap/health/location/HMapLocation;", "<init>", "()V", "location_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parcelable.Creator<HMapLocation> {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public HMapLocation createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HMapLocation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public HMapLocation[] newArray(int size) {
            return new HMapLocation[size];
        }
    }

    public HMapLocation() {
        this.gpsAccuracyStatus = -1;
        this.city = "";
        this.district = "";
        this.adCode = "";
        this.locType = -1;
        this.province = "";
        this.addrStr = "";
        this.errorCode = -1;
        this.coordType = "";
        this.description = "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final float getAccuracy() {
        return this.accuracy;
    }

    @Nullable
    public final String getAdCode() {
        return this.adCode;
    }

    @Nullable
    public final String getAddrStr() {
        return this.addrStr;
    }

    public final float getBearing() {
        return this.bearing;
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    public final int getConScenario() {
        return this.conScenario;
    }

    @Nullable
    public final String getCoordType() {
        return this.coordType;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getDistrict() {
        return this.district;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final int getGpsAccuracyStatus() {
        return this.gpsAccuracyStatus;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final int getLocType() {
        return this.locType;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    @Nullable
    public final String getProvince() {
        return this.province;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setAccuracy(float f) {
        this.accuracy = f;
    }

    public final void setAdCode(@Nullable String str) {
        this.adCode = str;
    }

    public final void setAddrStr(@Nullable String str) {
        this.addrStr = str;
    }

    public final void setBearing(float f) {
        this.bearing = f;
    }

    public final void setCity(@Nullable String str) {
        this.city = str;
    }

    public final void setConScenario(int i) {
        this.conScenario = i;
    }

    public final void setCoordType(@Nullable String str) {
        this.coordType = str;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setDistrict(@Nullable String str) {
        this.district = str;
    }

    public final void setErrorCode(int i) {
        this.errorCode = i;
    }

    public final void setGpsAccuracyStatus(int i) {
        this.gpsAccuracyStatus = i;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final void setLocType(int i) {
        this.locType = i;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final void setProvince(@Nullable String str) {
        this.province = str;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public final void setTime(long j2) {
        this.time = j2;
    }

    @NotNull
    public String toString() {
        return "HMapLocation(latitude=" + this.latitude + ", longitude=" + this.longitude + ", gpsAccuracyStatus=" + this.gpsAccuracyStatus + ", bearing=" + this.bearing + ", speed=" + this.speed + ", conScenario=" + this.conScenario + ", accuracy=" + this.accuracy + ", city=" + this.city + ", district=" + this.district + ", adCode=" + this.adCode + ", locType=" + this.locType + ", province=" + this.province + ", addrStr=" + this.addrStr + ", errorCode=" + this.errorCode + ", coordType=" + this.coordType + ", description=" + this.description + ", time=" + this.time + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeInt(this.gpsAccuracyStatus);
        parcel.writeFloat(this.bearing);
        parcel.writeFloat(this.speed);
        parcel.writeInt(this.conScenario);
        parcel.writeFloat(this.accuracy);
        parcel.writeString(this.city);
        parcel.writeString(this.district);
        parcel.writeString(this.adCode);
        parcel.writeInt(this.locType);
        parcel.writeString(this.province);
        parcel.writeString(this.addrStr);
        parcel.writeInt(this.errorCode);
        parcel.writeString(this.coordType);
        parcel.writeString(this.description);
        parcel.writeLong(this.time);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HMapLocation(@NotNull Parcel parcel) {
        this();
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.gpsAccuracyStatus = parcel.readInt();
        this.bearing = parcel.readFloat();
        this.speed = parcel.readFloat();
        this.conScenario = parcel.readInt();
        this.accuracy = parcel.readFloat();
        this.city = parcel.readString();
        this.district = parcel.readString();
        this.adCode = parcel.readString();
        this.locType = parcel.readInt();
        this.province = parcel.readString();
        this.addrStr = parcel.readString();
        this.errorCode = parcel.readInt();
        this.coordType = parcel.readString();
        this.description = parcel.readString();
        this.time = parcel.readLong();
    }
}
