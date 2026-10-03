package com.heytap.health.voiceassistant.car;

import androidx.annotation.Keep;
import com.oplus.carlink.controlsdk.data.CarInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/voiceassistant/car/CarInfoWrapper;", "", "errorCode", "", "car", "Lcom/oplus/carlink/controlsdk/data/CarInfo;", "(ILcom/oplus/carlink/controlsdk/data/CarInfo;)V", "getCar", "()Lcom/oplus/carlink/controlsdk/data/CarInfo;", "getErrorCode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CarInfoWrapper {

    @Nullable
    private final CarInfo car;
    private final int errorCode;

    public CarInfoWrapper(int i, @Nullable CarInfo carInfo) {
        this.errorCode = i;
        this.car = carInfo;
    }

    public static /* synthetic */ CarInfoWrapper copy$default(CarInfoWrapper carInfoWrapper, int i, CarInfo carInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = carInfoWrapper.errorCode;
        }
        if ((i2 & 2) != 0) {
            carInfo = carInfoWrapper.car;
        }
        return carInfoWrapper.copy(i, carInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CarInfo getCar() {
        return this.car;
    }

    @NotNull
    public final CarInfoWrapper copy(int errorCode, @Nullable CarInfo car) {
        return new CarInfoWrapper(errorCode, car);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarInfoWrapper)) {
            return false;
        }
        CarInfoWrapper carInfoWrapper = (CarInfoWrapper) other;
        return this.errorCode == carInfoWrapper.errorCode && Intrinsics.areEqual(this.car, carInfoWrapper.car);
    }

    @Nullable
    public final CarInfo getCar() {
        return this.car;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.errorCode) * 31;
        CarInfo carInfo = this.car;
        return iHashCode + (carInfo == null ? 0 : carInfo.hashCode());
    }

    @NotNull
    public String toString() {
        int i = this.errorCode;
        CarInfo carInfo = this.car;
        return "CarInfoWrapper(errorCode=" + i + " ,carId=" + (carInfo != null ? carInfo.carId : null) + " ,name=" + (carInfo != null ? carInfo.name : null) + " ,image=" + (carInfo != null ? carInfo.image : null) + " ,companyId=" + (carInfo != null ? carInfo.companyId : null) + " ,isCurrentCar=" + (carInfo != null ? carInfo.isCurrentCar : null) + ")";
    }
}
