package com.heytap.health.voiceassistant.car;

import androidx.annotation.Keep;
import androidx.autofill.HintConstants;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import com.oplus.aiunit.vision.wrf;
import com.oplus.carlink.controlsdk.data.CarInfo;
import com.oplus.carlink.controlsdk.data.CarStatus;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003JE\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\nHÖ\u0001J\b\u0010'\u001a\u00020(H\u0016R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lcom/heytap/health/voiceassistant/car/CarLinkInfo;", "", wrf.DEFAULT_IMAGES_DIR_NAME, "", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "car", "Lcom/oplus/carlink/controlsdk/data/CarInfo;", "carStatus", "Lcom/oplus/carlink/controlsdk/data/CarStatus;", "bindCode", "", HintConstants.AUTOFILL_HINT_PASSWORD, "", "(Ljava/util/List;Lcom/oplus/carlink/controlsdk/data/CarInfo;Lcom/oplus/carlink/controlsdk/data/CarStatus;IZ)V", "getBindCode", "()I", "setBindCode", "(I)V", "getCar", "()Lcom/oplus/carlink/controlsdk/data/CarInfo;", "setCar", "(Lcom/oplus/carlink/controlsdk/data/CarInfo;)V", "getCarStatus", "()Lcom/oplus/carlink/controlsdk/data/CarStatus;", "getImages", "()Ljava/util/List;", "getPassword", "()Z", "setPassword", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "voiceassistant_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class CarLinkInfo {
    private int bindCode;

    @Nullable
    private CarInfo car;

    @Nullable
    private final CarStatus carStatus;

    @NotNull
    private final List<JViewBean> images;
    private boolean password;

    /* JADX WARN: Multi-variable type inference failed */
    public CarLinkInfo(@NotNull List<? extends JViewBean> images, @Nullable CarInfo carInfo, @Nullable CarStatus carStatus, int i, boolean z) {
        Intrinsics.checkNotNullParameter(images, "images");
        this.images = images;
        this.car = carInfo;
        this.carStatus = carStatus;
        this.bindCode = i;
        this.password = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CarLinkInfo copy$default(CarLinkInfo carLinkInfo, List list, CarInfo carInfo, CarStatus carStatus, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = carLinkInfo.images;
        }
        if ((i2 & 2) != 0) {
            carInfo = carLinkInfo.car;
        }
        CarInfo carInfo2 = carInfo;
        if ((i2 & 4) != 0) {
            carStatus = carLinkInfo.carStatus;
        }
        CarStatus carStatus2 = carStatus;
        if ((i2 & 8) != 0) {
            i = carLinkInfo.bindCode;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            z = carLinkInfo.password;
        }
        return carLinkInfo.copy(list, carInfo2, carStatus2, i3, z);
    }

    @NotNull
    public final List<JViewBean> component1() {
        return this.images;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CarInfo getCar() {
        return this.car;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CarStatus getCarStatus() {
        return this.carStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBindCode() {
        return this.bindCode;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getPassword() {
        return this.password;
    }

    @NotNull
    public final CarLinkInfo copy(@NotNull List<? extends JViewBean> images, @Nullable CarInfo car, @Nullable CarStatus carStatus, int bindCode, boolean password) {
        Intrinsics.checkNotNullParameter(images, "images");
        return new CarLinkInfo(images, car, carStatus, bindCode, password);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CarLinkInfo)) {
            return false;
        }
        CarLinkInfo carLinkInfo = (CarLinkInfo) other;
        return Intrinsics.areEqual(this.images, carLinkInfo.images) && Intrinsics.areEqual(this.car, carLinkInfo.car) && Intrinsics.areEqual(this.carStatus, carLinkInfo.carStatus) && this.bindCode == carLinkInfo.bindCode && this.password == carLinkInfo.password;
    }

    public final int getBindCode() {
        return this.bindCode;
    }

    @Nullable
    public final CarInfo getCar() {
        return this.car;
    }

    @Nullable
    public final CarStatus getCarStatus() {
        return this.carStatus;
    }

    @NotNull
    public final List<JViewBean> getImages() {
        return this.images;
    }

    public final boolean getPassword() {
        return this.password;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = this.images.hashCode() * 31;
        CarInfo carInfo = this.car;
        int iHashCode2 = (iHashCode + (carInfo == null ? 0 : carInfo.hashCode())) * 31;
        CarStatus carStatus = this.carStatus;
        int iHashCode3 = (((iHashCode2 + (carStatus != null ? carStatus.hashCode() : 0)) * 31) + Integer.hashCode(this.bindCode)) * 31;
        boolean z = this.password;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        return iHashCode3 + r3;
    }

    public final void setBindCode(int i) {
        this.bindCode = i;
    }

    public final void setCar(@Nullable CarInfo carInfo) {
        this.car = carInfo;
    }

    public final void setPassword(boolean z) {
        this.password = z;
    }

    @NotNull
    public String toString() {
        return "CarLinkInfo(car=" + this.car + ", carStatus=" + this.carStatus + ", bindCode=" + this.bindCode + ", password=" + this.password + ")";
    }

    public /* synthetic */ CarLinkInfo(List list, CarInfo carInfo, CarStatus carStatus, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, carInfo, carStatus, i, (i2 & 16) != 0 ? false : z);
    }
}
