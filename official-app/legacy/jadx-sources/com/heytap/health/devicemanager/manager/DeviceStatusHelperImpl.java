package com.heytap.health.devicemanager.manager;

import com.heytap.health.devicemanager.lock.LocKDMHashSet;
import com.heytap.health.devicemanager.processor.bean.OobeStatusBean;
import com.oplus.aiunit.vision.to5;
import com.oplus.aiunit.vision.u5b;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/devicemanager/manager/DeviceStatusHelperImpl;", "", "Lcom/heytap/health/devicemanager/processor/bean/OobeStatusBean;", "oobeStatusBean", "Lcom/oplus/aiunit/vision/to5;", "deviceStatusCallback", "", "b", "Lcom/heytap/health/devicemanager/lock/LocKDMHashSet;", "", "a", "Lkotlin/Lazy;", "()Lcom/heytap/health/devicemanager/lock/LocKDMHashSet;", "oobeStatusList", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceStatusHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceStatusHelper.kt\ncom/heytap/health/devicemanager/manager/DeviceStatusHelperImpl\n+ 2 LockUtils.kt\ncom/heytap/health/devicemanager/lock/LockUtilsKt\n*L\n1#1,64:1\n19#2,11:65\n*S KotlinDebug\n*F\n+ 1 DeviceStatusHelper.kt\ncom/heytap/health/devicemanager/manager/DeviceStatusHelperImpl\n*L\n47#1:65,11\n*E\n"})
public final class DeviceStatusHelperImpl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy oobeStatusList = LazyKt__LazyJVMKt.lazy(new Function0<LocKDMHashSet<String>>() { // from class: com.heytap.health.devicemanager.manager.DeviceStatusHelperImpl$oobeStatusList$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final LocKDMHashSet<String> invoke() {
            return new LocKDMHashSet<>();
        }
    });

    public final LocKDMHashSet<String> a() {
        return (LocKDMHashSet) this.oobeStatusList.getValue();
    }

    public void b(@NotNull OobeStatusBean oobeStatusBean, @NotNull to5 deviceStatusCallback) {
        Intrinsics.checkNotNullParameter(oobeStatusBean, "oobeStatusBean");
        Intrinsics.checkNotNullParameter(deviceStatusCallback, "deviceStatusCallback");
        LocKDMHashSet<String> locKDMHashSetA = a();
        try {
            u5b.a("", "writeLock");
            locKDMHashSetA.writeLock();
            String mac = oobeStatusBean.getMac();
            if (!oobeStatusBean.isConnect()) {
                locKDMHashSetA.remove(mac);
                Intrinsics.checkNotNullExpressionValue(mac, "mac");
                deviceStatusCallback.a(mac);
            } else if (oobeStatusBean.isOobeFinish()) {
                Intrinsics.checkNotNullExpressionValue(mac, "mac");
                deviceStatusCallback.b(mac, locKDMHashSetA.contains(mac), true);
            } else {
                locKDMHashSetA.add(mac);
                Intrinsics.checkNotNullExpressionValue(mac, "mac");
                deviceStatusCallback.b(mac, true, false);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            locKDMHashSetA.writeUnLock();
            u5b.a("", "writeUnLock");
        }
    }
}
