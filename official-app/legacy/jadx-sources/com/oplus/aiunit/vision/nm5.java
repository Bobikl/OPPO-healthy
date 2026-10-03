package com.oplus.aiunit.vision;

import androidx.exifinterface.media.ExifInterface;
import com.heytap.health.devicemanager.lock.LockDMHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aK\u0010\t\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\f\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lcom/oplus/aiunit/vision/mm5;", "R", "Lcom/heytap/health/devicemanager/lock/LockDMHashMap;", "Lcom/oplus/aiunit/vision/ra5;", "role", "key", "Lkotlin/Function0;", "create", "a", "(Lcom/heytap/health/devicemanager/lock/LockDMHashMap;Lcom/oplus/aiunit/vision/ra5;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Lcom/oplus/aiunit/vision/mm5;", "listener", "b", "(Lcom/heytap/health/devicemanager/lock/LockDMHashMap;Lcom/oplus/aiunit/vision/ra5;Ljava/lang/Object;)Lcom/oplus/aiunit/vision/mm5;", "device_manager_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceRoleListenerApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceRoleListenerApi.kt\ncom/heytap/health/devicemanager/client/role/DeviceRoleListenerApiKt\n+ 2 LockUtils.kt\ncom/heytap/health/devicemanager/lock/LockUtilsKt\n*L\n1#1,71:1\n19#2,11:72\n19#2,11:83\n*S KotlinDebug\n*F\n+ 1 DeviceRoleListenerApi.kt\ncom/heytap/health/devicemanager/client/role/DeviceRoleListenerApiKt\n*L\n32#1:72,11\n58#1:83,11\n*E\n"})
public final class nm5 {
    @NotNull
    public static final <T, R extends mm5> R a(@NotNull LockDMHashMap<T, R> lockDMHashMap, @NotNull ra5 role, T t, @NotNull Function0<? extends R> create) {
        Intrinsics.checkNotNullParameter(lockDMHashMap, "<this>");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(create, "create");
        try {
            u5b.a("", "writeLock");
            lockDMHashMap.writeLock();
            R rInvoke = lockDMHashMap.get(t);
            if (rInvoke == null) {
                rInvoke = create.invoke();
                lockDMHashMap.put(t, rInvoke);
            } else if (!sa5.a(rInvoke.getRole(), role)) {
                rInvoke.f(sa5.d(rInvoke.getRole(), role));
            }
            return rInvoke;
        } finally {
            lockDMHashMap.writeUnLock();
            u5b.a("", "writeUnLock");
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0037  */
    @Nullable
    public static final <T, R extends mm5> R b(@NotNull LockDMHashMap<T, R> lockDMHashMap, @NotNull ra5 role, T t) {
        Intrinsics.checkNotNullParameter(lockDMHashMap, "<this>");
        Intrinsics.checkNotNullParameter(role, "role");
        try {
            u5b.a("", "writeLock");
            lockDMHashMap.writeLock();
            R r = lockDMHashMap.get(t);
            if (r != null) {
                r.f(sa5.c(r.getRole(), role));
                if (sa5.b(r.getRole())) {
                    lockDMHashMap.remove(t);
                } else {
                    r = null;
                }
            } else {
                r = null;
            }
            return r;
        } finally {
            lockDMHashMap.writeUnLock();
            u5b.a("", "writeUnLock");
        }
    }
}
