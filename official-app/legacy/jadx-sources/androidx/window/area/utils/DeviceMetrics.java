package androidx.window.area.utils;

import android.util.DisplayMetrics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Landroidx/window/area/utils/DeviceMetrics;", "", "manufacturer", "", "model", "rearDisplayMetrics", "Landroid/util/DisplayMetrics;", "(Ljava/lang/String;Ljava/lang/String;Landroid/util/DisplayMetrics;)V", "getManufacturer", "()Ljava/lang/String;", "getModel", "getRearDisplayMetrics", "()Landroid/util/DisplayMetrics;", "equals", "", "other", "hashCode", "", "toString", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeviceMetrics {

    @NotNull
    private final String manufacturer;

    @NotNull
    private final String model;

    @NotNull
    private final DisplayMetrics rearDisplayMetrics;

    public DeviceMetrics(@NotNull String manufacturer, @NotNull String model, @NotNull DisplayMetrics rearDisplayMetrics) {
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(rearDisplayMetrics, "rearDisplayMetrics");
        this.manufacturer = manufacturer;
        this.model = model;
        this.rearDisplayMetrics = rearDisplayMetrics;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof DeviceMetrics) {
            DeviceMetrics deviceMetrics = (DeviceMetrics) other;
            if (Intrinsics.areEqual(this.manufacturer, deviceMetrics.manufacturer) && Intrinsics.areEqual(this.model, deviceMetrics.model) && this.rearDisplayMetrics.equals(deviceMetrics.rearDisplayMetrics)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getManufacturer() {
        return this.manufacturer;
    }

    @NotNull
    public final String getModel() {
        return this.model;
    }

    @NotNull
    public final DisplayMetrics getRearDisplayMetrics() {
        return this.rearDisplayMetrics;
    }

    public int hashCode() {
        return (((this.manufacturer.hashCode() * 31) + this.model.hashCode()) * 31) + this.rearDisplayMetrics.hashCode();
    }

    @NotNull
    public String toString() {
        return "DeviceMetrics{ Manufacturer: " + this.manufacturer + ", model: " + this.model + ", Rear display metrics: " + this.rearDisplayMetrics + " }";
    }
}
