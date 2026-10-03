package androidx.window.area.utils;

import android.util.DisplayMetrics;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000bJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\b\u000eR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/window/area/utils/DeviceUtils;", "", "()V", "deviceList", "", "Landroidx/window/area/utils/DeviceMetrics;", "getRearDisplayMetrics", "Landroid/util/DisplayMetrics;", "manufacturer", "", "model", "getRearDisplayMetrics$window_release", "hasDeviceMetrics", "", "hasDeviceMetrics$window_release", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceUtils.kt\nandroidx/window/area/utils/DeviceUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,50:1\n1747#2,3:51\n288#2,2:54\n*S KotlinDebug\n*F\n+ 1 DeviceUtils.kt\nandroidx/window/area/utils/DeviceUtils\n*L\n37#1:51,3\n44#1:54,2\n*E\n"})
public final class DeviceUtils {

    @NotNull
    public static final DeviceUtils INSTANCE = new DeviceUtils();

    @NotNull
    private static final List<DeviceMetrics> deviceList;

    static {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.widthPixels = 1080;
        displayMetrics.heightPixels = 2092;
        displayMetrics.density = 2.625f;
        displayMetrics.densityDpi = 420;
        Unit unit = Unit.INSTANCE;
        deviceList = CollectionsKt__CollectionsJVMKt.listOf(new DeviceMetrics("google", "pixel fold", displayMetrics));
    }

    private DeviceUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0050  */
    @Nullable
    public final DisplayMetrics getRearDisplayMetrics$window_release(@NotNull String manufacturer, @NotNull String model) {
        Object next;
        boolean z;
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        Iterator<T> it = deviceList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            DeviceMetrics deviceMetrics = (DeviceMetrics) next;
            String manufacturer2 = deviceMetrics.getManufacturer();
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = manufacturer.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual(manufacturer2, lowerCase)) {
                String model2 = deviceMetrics.getModel();
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = model.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                if (Intrinsics.areEqual(model2, lowerCase2)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        } while (!z);
        DeviceMetrics deviceMetrics2 = (DeviceMetrics) next;
        if (deviceMetrics2 != null) {
            return deviceMetrics2.getRearDisplayMetrics();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005e  */
    public final boolean hasDeviceMetrics$window_release(@NotNull String manufacturer, @NotNull String model) {
        boolean z;
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        List<DeviceMetrics> list = deviceList;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (DeviceMetrics deviceMetrics : list) {
            String manufacturer2 = deviceMetrics.getManufacturer();
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = manufacturer.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual(manufacturer2, lowerCase)) {
                String model2 = deviceMetrics.getModel();
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = model.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                if (Intrinsics.areEqual(model2, lowerCase2)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
