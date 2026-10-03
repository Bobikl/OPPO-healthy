package com.heytap.speech.engine.protocol.event.payload.customerData;

import com.amap.api.services.district.DistrictSearchQuery;
import com.heytap.speech.engine.protocol.event.Payload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0016\u0018\u0000 /2\u00020\u0001:\u00010B\t\b\u0016¢\u0006\u0004\b,\u0010-Bs\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b,\u0010.R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR$\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR$\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR$\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010&\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00061"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/customerData/Location;", "Lcom/heytap/speech/engine/protocol/event/Payload;", "", "coordinateSystem", "Ljava/lang/String;", "getCoordinateSystem", "()Ljava/lang/String;", "setCoordinateSystem", "(Ljava/lang/String;)V", "longitude", "getLongitude", "setLongitude", "latitude", "getLatitude", "setLatitude", "country", "getCountry", "setCountry", DistrictSearchQuery.KEYWORDS_PROVINCE, "getProvince", "setProvince", DistrictSearchQuery.KEYWORDS_CITY, "getCity", "setCity", DistrictSearchQuery.KEYWORDS_DISTRICT, "getDistrict", "setDistrict", "parentCityCode", "getParentCityCode", "setParentCityCode", "", "updateTime", "Ljava/lang/Long;", "getUpdateTime", "()Ljava/lang/Long;", "setUpdateTime", "(Ljava/lang/Long;)V", "", "type", "Ljava/lang/Integer;", "getType", "()Ljava/lang/Integer;", "setType", "(Ljava/lang/Integer;)V", "<init>", "()V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "Companion", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public class Location extends Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.0";

    @Nullable
    private String city;

    @Nullable
    private String coordinateSystem;

    @Nullable
    private String country;

    @Nullable
    private String district;

    @Nullable
    private String latitude;

    @Nullable
    private String longitude;

    @Nullable
    private String parentCityCode;

    @Nullable
    private String province;

    @Nullable
    private Integer type;

    @Nullable
    private Long updateTime;

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.customerData.Location$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/customerData/Location$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return Location.VERSION;
        }
    }

    public Location() {
    }

    @Nullable
    public final String getCity() {
        return this.city;
    }

    @Nullable
    public final String getCoordinateSystem() {
        return this.coordinateSystem;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
    }

    @Nullable
    public final String getDistrict() {
        return this.district;
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
    public final String getParentCityCode() {
        return this.parentCityCode;
    }

    @Nullable
    public final String getProvince() {
        return this.province;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final Long getUpdateTime() {
        return this.updateTime;
    }

    public final void setCity(@Nullable String str) {
        this.city = str;
    }

    public final void setCoordinateSystem(@Nullable String str) {
        this.coordinateSystem = str;
    }

    public final void setCountry(@Nullable String str) {
        this.country = str;
    }

    public final void setDistrict(@Nullable String str) {
        this.district = str;
    }

    public final void setLatitude(@Nullable String str) {
        this.latitude = str;
    }

    public final void setLongitude(@Nullable String str) {
        this.longitude = str;
    }

    public final void setParentCityCode(@Nullable String str) {
        this.parentCityCode = str;
    }

    public final void setProvince(@Nullable String str) {
        this.province = str;
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    public final void setUpdateTime(@Nullable Long l2) {
        this.updateTime = l2;
    }

    public /* synthetic */ Location(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : l2, (i & 512) != 0 ? null : num);
    }

    public Location(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable Long l2, @Nullable Integer num) {
        this.coordinateSystem = str;
        this.longitude = str2;
        this.latitude = str3;
        this.country = str4;
        this.province = str5;
        this.city = str6;
        this.district = str7;
        this.parentCityCode = str8;
        this.updateTime = l2;
        this.type = num;
    }
}
