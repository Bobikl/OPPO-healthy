package com.heytap.store.platform.location.base.config;

import com.amap.api.maps.model.MyLocationStyle;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.oplus.aiunit.vision.f58;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"¨\u0006*"}, d2 = {"Lcom/heytap/store/platform/location/base/config/BaseLocationConfig;", "", "()V", "coorType", "", "getCoorType", "()Ljava/lang/String;", "setCoorType", "(Ljava/lang/String;)V", "isOnceLocation", "", "()Z", "setOnceLocation", "(Z)V", CityBean.LOCALE, "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "setLocale", "(Ljava/util/Locale;)V", MyLocationStyle.LOCATION_TYPE, "Lcom/heytap/store/platform/location/base/config/BaseLocationConfig$LocationType;", "getLocationType", "()Lcom/heytap/store/platform/location/base/config/BaseLocationConfig$LocationType;", "setLocationType", "(Lcom/heytap/store/platform/location/base/config/BaseLocationConfig$LocationType;)V", "openGps", "getOpenGps", "setOpenGps", "scanSpan", "", "getScanSpan", "()I", "setScanSpan", "(I)V", "timeOut", "getTimeOut", "setTimeOut", "setLocationMode", "", "loationMode", "LocationType", "location_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public class BaseLocationConfig {
    private boolean isOnceLocation;

    @Nullable
    private Locale locale;
    private boolean openGps;
    private int scanSpan;
    private int timeOut;

    @NotNull
    private String coorType = "gcj02";

    @NotNull
    private LocationType locationType = LocationType.Hight_Accuracy;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/heytap/store/platform/location/base/config/BaseLocationConfig$LocationType;", "", "(Ljava/lang/String;I)V", "Hight_Accuracy", "Battery_Saving", "Device_Sensors", f58.GPS, "network", "passive", "fused", "location_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum LocationType {
        Hight_Accuracy,
        Battery_Saving,
        Device_Sensors,
        gps,
        network,
        passive,
        fused;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static LocationType[] valuesCustom() {
            LocationType[] locationTypeArrValuesCustom = values();
            return (LocationType[]) Arrays.copyOf(locationTypeArrValuesCustom, locationTypeArrValuesCustom.length);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LocationType.valuesCustom().length];
            iArr[LocationType.Hight_Accuracy.ordinal()] = 1;
            iArr[LocationType.Battery_Saving.ordinal()] = 2;
            iArr[LocationType.Device_Sensors.ordinal()] = 3;
            iArr[LocationType.gps.ordinal()] = 4;
            iArr[LocationType.network.ordinal()] = 5;
            iArr[LocationType.passive.ordinal()] = 6;
            iArr[LocationType.fused.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public final String getCoorType() {
        return this.coorType;
    }

    @Nullable
    public final Locale getLocale() {
        return this.locale;
    }

    @NotNull
    public final LocationType getLocationType() {
        return this.locationType;
    }

    public final boolean getOpenGps() {
        return this.openGps;
    }

    public final int getScanSpan() {
        return this.scanSpan;
    }

    public final int getTimeOut() {
        return this.timeOut;
    }

    /* JADX INFO: renamed from: isOnceLocation, reason: from getter */
    public final boolean getIsOnceLocation() {
        return this.isOnceLocation;
    }

    public final void setCoorType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.coorType = str;
    }

    public final void setLocale(@Nullable Locale locale) {
        this.locale = locale;
    }

    public final void setLocationMode(@NotNull LocationType loationMode) {
        Intrinsics.checkNotNullParameter(loationMode, "loationMode");
        switch (WhenMappings.$EnumSwitchMapping$0[loationMode.ordinal()]) {
            case 1:
                this.openGps = true;
                return;
            case 2:
                this.openGps = false;
                return;
            case 3:
                this.openGps = true;
                return;
            case 4:
                this.openGps = true;
                return;
            case 5:
                this.openGps = false;
                return;
            case 6:
                this.openGps = false;
                return;
            case 7:
                this.openGps = false;
                return;
            default:
                throw new IllegalArgumentException(Intrinsics.stringPlus("Illegal this mode : ", loationMode));
        }
    }

    public final void setLocationType(@NotNull LocationType locationType) {
        Intrinsics.checkNotNullParameter(locationType, "<set-?>");
        this.locationType = locationType;
    }

    public final void setOnceLocation(boolean z) {
        this.isOnceLocation = z;
    }

    public final void setOpenGps(boolean z) {
        this.openGps = z;
    }

    public final void setScanSpan(int i) {
        this.scanSpan = i;
    }

    public final void setTimeOut(int i) {
        this.timeOut = i;
    }
}
