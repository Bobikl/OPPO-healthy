package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.sports.R$drawable;
import com.heytap.sports.R$string;
import io.protostuff.MapSchema;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.collections.MapsKt__MapsKt;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.jji, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0001\tB=\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0016\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u0017\u0010\"\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0013\u0010$\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012R\u0013\u0010%\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012R\u0013\u0010&\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b \u0010\u0012¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/jji;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "c", "()I", "setType", "(I)V", "type", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "setTemperature", "(Ljava/lang/Integer;)V", "temperature", "setHumidity", "humidity", "d", "getWindDegrees", "setWindDegrees", "windDegrees", MapSchema.FIELD_NAME_ENTRY, b2n.f, "setWindPower", "windPower", "f", "Z", "isNight", "()Z", "weatherIcon", "weatherName", "windDirDesc", "<init>", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IZ)V", "Companion", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class SportWeatherBean {

    @NotNull
    public static final Map<Integer, Integer> h;

    @NotNull
    public static final Map<Integer, Integer> i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public int type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer temperature;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public Integer humidity;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public Integer windDegrees;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public int windPower;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final boolean isNight;
    public static final int $stable = 8;

    @NotNull
    public static final Map<Integer, Integer> g = MapsKt__MapsKt.mapOf(TuplesKt.to(0, Integer.valueOf(R$string.sports_record_weather_wind_dir_north)), TuplesKt.to(1, Integer.valueOf(R$string.sports_record_weather_wind_dir_north_northeast)), TuplesKt.to(2, Integer.valueOf(R$string.sports_record_weather_wind_dir_northeast)), TuplesKt.to(3, Integer.valueOf(R$string.sports_record_weather_wind_dir_east_northeast)), TuplesKt.to(4, Integer.valueOf(R$string.sports_record_weather_wind_dir_east)), TuplesKt.to(5, Integer.valueOf(R$string.sports_record_weather_wind_dir_east_southeast)), TuplesKt.to(6, Integer.valueOf(R$string.sports_record_weather_wind_dir_southeast)), TuplesKt.to(7, Integer.valueOf(R$string.sports_record_weather_wind_dir_south_southeast)), TuplesKt.to(8, Integer.valueOf(R$string.sports_record_weather_wind_dir_south)), TuplesKt.to(9, Integer.valueOf(R$string.sports_record_weather_wind_dir_south_southwest)), TuplesKt.to(10, Integer.valueOf(R$string.sports_record_weather_wind_dir_southwest)), TuplesKt.to(11, Integer.valueOf(R$string.sports_record_weather_wind_dir_west_southwest)), TuplesKt.to(12, Integer.valueOf(R$string.sports_record_weather_wind_dir_west)), TuplesKt.to(13, Integer.valueOf(R$string.sports_record_weather_wind_dir_west_northwest)), TuplesKt.to(14, Integer.valueOf(R$string.sports_record_weather_wind_dir_northwest)), TuplesKt.to(15, Integer.valueOf(R$string.sports_record_weather_wind_dir_north_northwest)));

    static {
        int i2 = R$drawable.sports_record_weather_sunny;
        Pair pair = TuplesKt.to(0, Integer.valueOf(i2));
        int i3 = R$drawable.sports_record_weather_shower;
        Pair pair2 = TuplesKt.to(1, Integer.valueOf(i3));
        Pair pair3 = TuplesKt.to(2, Integer.valueOf(i3));
        Pair pair4 = TuplesKt.to(3, Integer.valueOf(i3));
        Pair pair5 = TuplesKt.to(4, Integer.valueOf(i3));
        Pair pair6 = TuplesKt.to(5, Integer.valueOf(i3));
        Pair pair7 = TuplesKt.to(6, Integer.valueOf(R$drawable.sports_record_weather_light_rain));
        int i4 = R$drawable.sports_record_weather_moderate_rain;
        Pair pair8 = TuplesKt.to(7, Integer.valueOf(i4));
        Pair pair9 = TuplesKt.to(8, Integer.valueOf(i4));
        int i5 = R$drawable.sports_record_weather_heavy_rain;
        Pair pair10 = TuplesKt.to(9, Integer.valueOf(i5));
        Pair pair11 = TuplesKt.to(10, Integer.valueOf(i5));
        int i6 = R$drawable.sports_record_weather_storm;
        Pair pair12 = TuplesKt.to(11, Integer.valueOf(i6));
        Pair pair13 = TuplesKt.to(12, Integer.valueOf(i6));
        Pair pair14 = TuplesKt.to(13, Integer.valueOf(i6));
        Pair pair15 = TuplesKt.to(14, Integer.valueOf(i6));
        Pair pair16 = TuplesKt.to(15, Integer.valueOf(i6));
        Pair pair17 = TuplesKt.to(16, Integer.valueOf(i6));
        Pair pair18 = TuplesKt.to(17, Integer.valueOf(R$drawable.sports_record_weather_freezing_rain));
        int i7 = R$drawable.sports_record_weather_hail;
        Pair pair19 = TuplesKt.to(18, Integer.valueOf(i7));
        Pair pair20 = TuplesKt.to(19, Integer.valueOf(i7));
        Pair pair21 = TuplesKt.to(20, Integer.valueOf(i7));
        int i8 = R$drawable.sports_record_weather_blizzard;
        Pair pair22 = TuplesKt.to(21, Integer.valueOf(i8));
        Pair pair23 = TuplesKt.to(22, Integer.valueOf(R$drawable.sports_record_weather_thunder_rain));
        Pair pair24 = TuplesKt.to(23, Integer.valueOf(i7));
        Pair pair25 = TuplesKt.to(24, Integer.valueOf(R$drawable.sports_record_weather_thunder));
        Pair pair26 = TuplesKt.to(25, Integer.valueOf(R$drawable.sports_record_weather_thunderstorm));
        int i9 = R$drawable.sports_record_weather_snow;
        Pair pair27 = TuplesKt.to(26, Integer.valueOf(i9));
        Pair pair28 = TuplesKt.to(27, Integer.valueOf(i9));
        Pair pair29 = TuplesKt.to(28, Integer.valueOf(i9));
        Pair pair30 = TuplesKt.to(29, Integer.valueOf(R$drawable.sports_record_weather_light_snow));
        int i10 = R$drawable.sports_record_weather_moderate_snow;
        Pair pair31 = TuplesKt.to(30, Integer.valueOf(i10));
        Pair pair32 = TuplesKt.to(31, Integer.valueOf(i10));
        Pair pair33 = TuplesKt.to(32, Integer.valueOf(i8));
        Pair pair34 = TuplesKt.to(33, Integer.valueOf(i8));
        Pair pair35 = TuplesKt.to(34, Integer.valueOf(i8));
        Pair pair36 = TuplesKt.to(35, Integer.valueOf(i8));
        Pair pair37 = TuplesKt.to(36, Integer.valueOf(R$drawable.sports_record_weather_snowstorm));
        Pair pair38 = TuplesKt.to(37, Integer.valueOf(R$drawable.sports_record_weather_sleet));
        int i11 = R$drawable.sports_record_weather_fog;
        Pair pair39 = TuplesKt.to(38, Integer.valueOf(i11));
        Pair pair40 = TuplesKt.to(39, Integer.valueOf(i11));
        Pair pair41 = TuplesKt.to(40, Integer.valueOf(i11));
        Pair pair42 = TuplesKt.to(41, Integer.valueOf(i11));
        Pair pair43 = TuplesKt.to(42, Integer.valueOf(i11));
        Pair pair44 = TuplesKt.to(43, Integer.valueOf(i11));
        Pair pair45 = TuplesKt.to(44, Integer.valueOf(i11));
        Pair pair46 = TuplesKt.to(45, Integer.valueOf(R$drawable.sports_record_weather_floating_dust));
        int i12 = R$drawable.sports_record_weather_blowing_sand;
        Pair pair47 = TuplesKt.to(46, Integer.valueOf(i12));
        Pair pair48 = TuplesKt.to(47, Integer.valueOf(i12));
        int i13 = R$drawable.sports_record_weather_sandstorm;
        Pair pair49 = TuplesKt.to(48, Integer.valueOf(i13));
        Pair pair50 = TuplesKt.to(49, Integer.valueOf(i13));
        int i14 = R$drawable.sports_record_weather_haze;
        Pair pair51 = TuplesKt.to(50, Integer.valueOf(i14));
        Pair pair52 = TuplesKt.to(51, Integer.valueOf(i14));
        Pair pair53 = TuplesKt.to(52, Integer.valueOf(i14));
        Pair pair54 = TuplesKt.to(53, Integer.valueOf(i14));
        Pair pair55 = TuplesKt.to(54, Integer.valueOf(i2));
        Pair pair56 = TuplesKt.to(55, Integer.valueOf(i2));
        int i15 = R$drawable.sports_record_weather_cloudy;
        Pair pair57 = TuplesKt.to(56, Integer.valueOf(i15));
        Pair pair58 = TuplesKt.to(57, Integer.valueOf(i15));
        Pair pair59 = TuplesKt.to(58, Integer.valueOf(i15));
        int i16 = R$drawable.sports_record_weather_cloudy_night;
        Pair pair60 = TuplesKt.to(-56, Integer.valueOf(i16));
        Pair pair61 = TuplesKt.to(-57, Integer.valueOf(i16));
        Pair pair62 = TuplesKt.to(-58, Integer.valueOf(i16));
        Pair pair63 = TuplesKt.to(59, Integer.valueOf(R$drawable.sports_record_weather_overcast));
        int i17 = R$drawable.sports_record_weather_wind;
        h = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, pair21, pair22, pair23, pair24, pair25, pair26, pair27, pair28, pair29, pair30, pair31, pair32, pair33, pair34, pair35, pair36, pair37, pair38, pair39, pair40, pair41, pair42, pair43, pair44, pair45, pair46, pair47, pair48, pair49, pair50, pair51, pair52, pair53, pair54, pair55, pair56, pair57, pair58, pair59, pair60, pair61, pair62, pair63, TuplesKt.to(60, Integer.valueOf(i17)), TuplesKt.to(61, Integer.valueOf(i17)), TuplesKt.to(62, Integer.valueOf(i17)), TuplesKt.to(63, Integer.valueOf(i17)), TuplesKt.to(64, Integer.valueOf(i17)), TuplesKt.to(65, Integer.valueOf(i17)), TuplesKt.to(66, Integer.valueOf(R$drawable.sports_record_weather_tornado)), TuplesKt.to(67, Integer.valueOf(R$drawable.sports_record_weather_hurricane)));
        i = MapsKt__MapsKt.mapOf(TuplesKt.to(1, Integer.valueOf(R$string.sports_record_weather_name_rain)), TuplesKt.to(2, Integer.valueOf(R$string.sports_record_weather_name_shower)), TuplesKt.to(3, Integer.valueOf(R$string.sports_record_weather_name_local_shower)), TuplesKt.to(4, Integer.valueOf(R$string.sports_record_weather_name_light_shower)), TuplesKt.to(5, Integer.valueOf(R$string.sports_record_weather_name_heavy_shower)), TuplesKt.to(6, Integer.valueOf(R$string.sports_record_weather_name_light_rain)), TuplesKt.to(7, Integer.valueOf(R$string.sports_record_weather_name_light_to_moderate_rain)), TuplesKt.to(8, Integer.valueOf(R$string.sports_record_weather_name_moderate_rain)), TuplesKt.to(9, Integer.valueOf(R$string.sports_record_weather_name_moderate_to_heavy_rain)), TuplesKt.to(10, Integer.valueOf(R$string.sports_record_weather_name_heavy_rain)), TuplesKt.to(11, Integer.valueOf(R$string.sports_record_weather_name_heavy_to_storm_rain)), TuplesKt.to(12, Integer.valueOf(R$string.sports_record_weather_name_storm_rain)), TuplesKt.to(13, Integer.valueOf(R$string.sports_record_weather_name_storm_to_heavy_storm_rain)), TuplesKt.to(14, Integer.valueOf(R$string.sports_record_weather_name_heavy_storm_rain)), TuplesKt.to(15, Integer.valueOf(R$string.sports_record_weather_name_heavy_storm_to_extra_heavy_storm_rain)), TuplesKt.to(16, Integer.valueOf(R$string.sports_record_weather_name_extra_heavy_storm_rain)), TuplesKt.to(17, Integer.valueOf(R$string.sports_record_weather_name_freezing_rain)), TuplesKt.to(18, Integer.valueOf(R$string.sports_record_weather_name_hail)), TuplesKt.to(19, Integer.valueOf(R$string.sports_record_weather_name_ice_needle)), TuplesKt.to(20, Integer.valueOf(R$string.sports_record_weather_name_ice_pellet)), TuplesKt.to(21, Integer.valueOf(R$string.sports_record_weather_name_ice)), TuplesKt.to(22, Integer.valueOf(R$string.sports_record_weather_name_thunder_shower)), TuplesKt.to(23, Integer.valueOf(R$string.sports_record_weather_name_thunder_shower_with_hail)), TuplesKt.to(24, Integer.valueOf(R$string.sports_record_weather_name_lightning)), TuplesKt.to(25, Integer.valueOf(R$string.sports_record_weather_name_thunderstorm)), TuplesKt.to(26, Integer.valueOf(R$string.sports_record_weather_name_snow)), TuplesKt.to(27, Integer.valueOf(R$string.sports_record_weather_name_snow_shower)), TuplesKt.to(28, Integer.valueOf(R$string.sports_record_weather_name_light_snow_shower)), TuplesKt.to(29, Integer.valueOf(R$string.sports_record_weather_name_light_snow)), TuplesKt.to(30, Integer.valueOf(R$string.sports_record_weather_name_light_to_moderate_snow)), TuplesKt.to(31, Integer.valueOf(R$string.sports_record_weather_name_moderate_snow)), TuplesKt.to(32, Integer.valueOf(R$string.sports_record_weather_name_moderate_to_heavy_snow)), TuplesKt.to(33, Integer.valueOf(R$string.sports_record_weather_name_heavy_snow)), TuplesKt.to(34, Integer.valueOf(R$string.sports_record_weather_name_heavy_to_storm_snow)), TuplesKt.to(35, Integer.valueOf(R$string.sports_record_weather_name_storm_snow)), TuplesKt.to(36, Integer.valueOf(R$string.sports_record_weather_name_blizzard)), TuplesKt.to(37, Integer.valueOf(R$string.sports_record_weather_name_sleet)), TuplesKt.to(38, Integer.valueOf(R$string.sports_record_weather_name_fog)), TuplesKt.to(39, Integer.valueOf(R$string.sports_record_weather_name_freezing_fog)), TuplesKt.to(40, Integer.valueOf(R$string.sports_record_weather_name_mist)), TuplesKt.to(41, Integer.valueOf(R$string.sports_record_weather_name_dense_fog)), TuplesKt.to(42, Integer.valueOf(R$string.sports_record_weather_name_thick_fog)), TuplesKt.to(43, Integer.valueOf(R$string.sports_record_weather_name_strong_thick_fog)), TuplesKt.to(44, Integer.valueOf(R$string.sports_record_weather_name_extra_strong_thick_fog)), TuplesKt.to(45, Integer.valueOf(R$string.sports_record_weather_name_floating_dust)), TuplesKt.to(46, Integer.valueOf(R$string.sports_record_weather_name_blowing_sand)), TuplesKt.to(47, Integer.valueOf(R$string.sports_record_weather_name_dust_devil)), TuplesKt.to(48, Integer.valueOf(R$string.sports_record_weather_name_sandstorm)), TuplesKt.to(49, Integer.valueOf(R$string.sports_record_weather_name_strong_sandstorm)), TuplesKt.to(50, Integer.valueOf(R$string.sports_record_weather_name_haze)), TuplesKt.to(51, Integer.valueOf(R$string.sports_record_weather_name_moderate_haze)), TuplesKt.to(52, Integer.valueOf(R$string.sports_record_weather_name_heavy_haze)), TuplesKt.to(53, Integer.valueOf(R$string.sports_record_weather_name_severe_haze)), TuplesKt.to(54, Integer.valueOf(R$string.sports_record_weather_name_sunny)), TuplesKt.to(55, Integer.valueOf(R$string.sports_record_weather_name_mostly_clear)), TuplesKt.to(56, Integer.valueOf(R$string.sports_record_weather_name_cloudy)), TuplesKt.to(57, Integer.valueOf(R$string.sports_record_weather_name_mostly_cloudy)), TuplesKt.to(58, Integer.valueOf(R$string.sports_record_weather_name_few_clouds)), TuplesKt.to(59, Integer.valueOf(R$string.sports_record_weather_name_overcast)), TuplesKt.to(60, Integer.valueOf(R$string.sports_record_weather_name_wind)), TuplesKt.to(61, Integer.valueOf(R$string.sports_record_weather_name_light_wind)), TuplesKt.to(62, Integer.valueOf(R$string.sports_record_weather_name_strong_wind)), TuplesKt.to(63, Integer.valueOf(R$string.sports_record_weather_name_storm_wind)), TuplesKt.to(64, Integer.valueOf(R$string.sports_record_weather_name_hurricane)), TuplesKt.to(65, Integer.valueOf(R$string.sports_record_weather_name_strong_storm)), TuplesKt.to(66, Integer.valueOf(R$string.sports_record_weather_name_tornado)), TuplesKt.to(67, Integer.valueOf(R$string.sports_record_weather_name_tropical_storm)));
    }

    public SportWeatherBean(int i2, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, int i3, boolean z) {
        this.type = i2;
        this.temperature = num;
        this.humidity = num2;
        this.windDegrees = num3;
        this.windPower = i3;
        this.isNight = z;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getHumidity() {
        return this.humidity;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getTemperature() {
        return this.temperature;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    public final Integer d() {
        int i2 = this.type;
        switch (i2) {
            case 56:
            case 57:
            case 58:
                if (this.isNight) {
                    i2 = -i2;
                }
                break;
        }
        Integer num = h.get(Integer.valueOf(i2));
        if (num != null) {
            return num;
        }
        Integer num2 = this.temperature;
        if (num2 == null) {
            return null;
        }
        num2.intValue();
        return Integer.valueOf(R$drawable.sports_record_weather_overcast);
    }

    @Nullable
    public final Integer e() {
        return i.get(Integer.valueOf(this.type));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportWeatherBean)) {
            return false;
        }
        SportWeatherBean sportWeatherBean = (SportWeatherBean) other;
        return this.type == sportWeatherBean.type && Intrinsics.areEqual(this.temperature, sportWeatherBean.temperature) && Intrinsics.areEqual(this.humidity, sportWeatherBean.humidity) && Intrinsics.areEqual(this.windDegrees, sportWeatherBean.windDegrees) && this.windPower == sportWeatherBean.windPower && this.isNight == sportWeatherBean.isNight;
    }

    @Nullable
    public final Integer f() {
        Integer num = this.windDegrees;
        if (num == null) {
            return null;
        }
        float f = 2;
        float f2 = (360.0f / 16) / f;
        float fIntValue = (((num.intValue() % 360) + 360) % 360) + f2;
        if (fIntValue > 360.0f) {
            fIntValue -= 360.0f;
        }
        int i2 = (int) (fIntValue / (f2 * f));
        if (i2 >= 16) {
            i2 = 0;
        }
        return g.get(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getWindPower() {
        return this.windPower;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type) * 31;
        Integer num = this.temperature;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.humidity;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.windDegrees;
        int iHashCode4 = (((iHashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31) + Integer.hashCode(this.windPower)) * 31;
        boolean z = this.isNight;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode4 + r3;
    }

    @NotNull
    public String toString() {
        return "SportWeatherBean(type=" + this.type + ", temperature=" + this.temperature + ", humidity=" + this.humidity + ", windDegrees=" + this.windDegrees + ", windPower=" + this.windPower + ", isNight=" + this.isNight + ")";
    }
}
