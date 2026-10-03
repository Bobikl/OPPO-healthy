package com.oplus.aiunit.vision;

import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0005\u001a\u00020\u0002H\u0002R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/zg5;", "", "", "deviceId", "a", "b", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "encryptCache", "Ljava/lang/String;", "symmetricKey", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceIdEncryptUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceIdEncryptUtil.kt\ncom/heytap/device/data/utils/DeviceIdEncryptUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
public final class zg5 {

    @NotNull
    public static final zg5 INSTANCE = new zg5();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, String> encryptCache = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static volatile String symmetricKey = "";

    @JvmStatic
    @Nullable
    public static final String a(@Nullable String deviceId) {
        if (deviceId == null || deviceId.length() == 0) {
            a7b.f("DeviceIdEncryptUtil", "encryptDeviceId deviceId is null or empty");
            return "";
        }
        if (deviceId.length() > 32) {
            return deviceId;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = encryptCache;
        String str = concurrentHashMap.get(deviceId);
        if (str != null) {
            return str;
        }
        try {
            String strB = INSTANCE.b();
            if (strB.length() == 0) {
                a7b.b("DeviceIdEncryptUtil", "encryptDeviceId symmetricKey is empty, stop encrypt");
                return null;
            }
            String encrypted = pq.l(strB, deviceId);
            Intrinsics.checkNotNullExpressionValue(encrypted, "encrypted");
            concurrentHashMap.put(deviceId, encrypted);
            return encrypted;
        } catch (Exception e2) {
            a7b.b("DeviceIdEncryptUtil", "encryptDeviceId error: " + e2.getMessage());
            return null;
        }
    }

    public final String b() {
        if (symmetricKey.length() == 0) {
            symmetricKey = new ou6(null).l();
        }
        return symmetricKey;
    }
}
