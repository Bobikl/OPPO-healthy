package com.heytap.device.data.sporthealth.receive;

import android.os.Build;
import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.lr3;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/heytap/device/data/sporthealth/receive/LocationDevicePolicy;", "", "", MapSchema.FIELD_NAME_ENTRY, "c", "f", "d", "Lcom/oplus/aiunit/vision/lr3;", "b", "", "a", "Ljava/lang/String;", "mac", "Lcom/oplus/aiunit/vision/lr3;", "deviceCompatInfo", "<init>", "(Ljava/lang/String;)V", "Companion", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class LocationDevicePolicy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final List<String> f2969c = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"PKB110", "PKC110", "PKC130", "PKU110", "PKJ110", "PKT110", "PLB110"});

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String mac;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public lr3 deviceCompatInfo;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0018\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/heytap/device/data/sporthealth/receive/LocationDevicePolicy$Companion;", "", "", "deviceMac", "", "a", "", "provider", "b", "", "BAD_GPS_PHONE_MODES", "Ljava/util/List;", "PROVIDER_GPS", "I", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(@Nullable String deviceMac) {
            return ((Boolean) lc5.c(deviceMac).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.device.data.sporthealth.receive.LocationDevicePolicy$Companion$isWatch2OrWatch3$1
                @Override // p010kotlin.jvm.functions.Function1
                @NotNull
                public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                    Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                    return Boolean.valueOf(applyInfo.O9() || applyInfo.T9());
                }
            })).booleanValue();
        }

        public final boolean b(@Nullable String deviceMac, int provider) {
            if (provider == 1 && LocationDevicePolicy.f2969c.contains(Build.MODEL)) {
                return ((Boolean) lc5.c(deviceMac).a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.device.data.sporthealth.receive.LocationDevicePolicy$Companion$shouldBlockBadGpsPhoneFromWatchStar$1
                    @Override // p010kotlin.jvm.functions.Function1
                    @NotNull
                    public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                        Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                        return Boolean.valueOf(applyInfo.oa(DeviceConstants.BaseDevice.AbstractC0341b.e.INSTANCE));
                    }
                })).booleanValue();
            }
            return false;
        }
    }

    public LocationDevicePolicy(@Nullable String str) {
        this.mac = str;
    }

    public final lr3 b() {
        if (this.deviceCompatInfo == null) {
            this.deviceCompatInfo = lc5.c(this.mac);
        }
        lr3 lr3Var = this.deviceCompatInfo;
        Intrinsics.checkNotNull(lr3Var);
        return lr3Var;
    }

    public final boolean c() {
        return this.mac != null && ((Boolean) b().a(LocationDevicePolicy$isWatchFree$1.INSTANCE)).booleanValue();
    }

    public final boolean d() {
        return this.mac != null && ((Boolean) b().a(LocationDevicePolicy$shouldCheckLowSnr$1.INSTANCE)).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) b().a(LocationDevicePolicy$shouldReadMslAltitudeFromNmea$1.INSTANCE)).booleanValue();
    }

    public final boolean f() {
        return this.mac != null && ((Boolean) b().a(new Function1<DeviceInfo, Boolean>() { // from class: com.heytap.device.data.sporthealth.receive.LocationDevicePolicy$shouldReportLowSnrError$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceInfo applyInfo) {
                Intrinsics.checkNotNullParameter(applyInfo, "$this$applyInfo");
                return Boolean.valueOf(applyInfo.oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
            }
        })).booleanValue();
    }
}
