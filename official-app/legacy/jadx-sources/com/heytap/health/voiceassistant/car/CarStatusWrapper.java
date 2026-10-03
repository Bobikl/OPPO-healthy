package com.heytap.health.voiceassistant.car;

import androidx.annotation.Keep;
import com.oplus.carlink.controlsdk.data.CarStatus;
import com.oplus.carlink.controlsdk.data.ControlInstruction;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/voiceassistant/car/CarStatusWrapper;", "", "errorCode", "", "status", "Lcom/oplus/carlink/controlsdk/data/CarStatus;", "(ILcom/oplus/carlink/controlsdk/data/CarStatus;)V", "getErrorCode", "()I", "getStatus", "()Lcom/oplus/carlink/controlsdk/data/CarStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CarStatusWrapper {
    private final int errorCode;

    @Nullable
    private final CarStatus status;

    public CarStatusWrapper(int i, @Nullable CarStatus carStatus) {
        this.errorCode = i;
        this.status = carStatus;
    }

    public static /* synthetic */ CarStatusWrapper copy$default(CarStatusWrapper carStatusWrapper, int i, CarStatus carStatus, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = carStatusWrapper.errorCode;
        }
        if ((i2 & 2) != 0) {
            carStatus = carStatusWrapper.status;
        }
        return carStatusWrapper.copy(i, carStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CarStatus getStatus() {
        return this.status;
    }

    @NotNull
    public final CarStatusWrapper copy(int errorCode, @Nullable CarStatus status) {
        return new CarStatusWrapper(errorCode, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarStatusWrapper)) {
            return false;
        }
        CarStatusWrapper carStatusWrapper = (CarStatusWrapper) other;
        return this.errorCode == carStatusWrapper.errorCode && Intrinsics.areEqual(this.status, carStatusWrapper.status);
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    @Nullable
    public final CarStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.errorCode) * 31;
        CarStatus carStatus = this.status;
        return iHashCode + (carStatus == null ? 0 : carStatus.hashCode());
    }

    @NotNull
    public String toString() {
        List<ControlInstruction> list;
        int i = this.errorCode;
        CarStatus carStatus = this.status;
        Integer numValueOf = null;
        String str = carStatus != null ? carStatus.carId : null;
        if (carStatus != null && (list = carStatus.availableInstructions) != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        return "CarStatusWrapper(errorCode=" + i + " carId=" + str + " skill=" + numValueOf + ")";
    }
}
