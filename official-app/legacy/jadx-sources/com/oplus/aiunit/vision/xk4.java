package com.oplus.aiunit.vision;

import android.os.IBinder;
import com.heytap.health.devicemanager.processor.bean.AppListBean;
import com.heytap.health.devicemanager.processor.bean.VirtualAccountData;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.constant.EngineConstant;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH&J\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\bH&J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u001c\u0010\u0016\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0013H&J \u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H&J \u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H&J\b\u0010\u001c\u001a\u00020\bH&J \u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u001e\u001a\u00020\u001d\"\u00020\u0006H&J\u0014\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H'J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020#H&J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020#H&J\u001a\u0010&\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020#H&J\u0012\u0010'\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\bH&J\u0010\u0010*\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006,"}, d2 = {"Lcom/oplus/aiunit/vision/xk4;", "", "", "mac", "", "requestDeviceBattery", "", "a", "", "oobeFinish", "setOobeStatue", EngineConstant.REASON, "notifyUnbindStart", "Lcom/oplus/aiunit/vision/im5;", "listener", b2n.g, b2n.f, "refreshCloud", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/devicemanager/processor/bean/VirtualAccountData;", "i", "virtualAccountData", LogFieldKey.LEVEL_KEY, "Landroid/os/IBinder;", "token", "model", "addPairMonitor", "removePairMonitor", "isPairing", "", "appIds", "Lcom/oplus/aiunit/vision/ka5;", "findDeviceAppStatusByMacAndAppIds", "Lcom/heytap/health/devicemanager/processor/bean/AppListBean;", "findDeviceAppListByMac", "Lcom/oplus/aiunit/vision/ja5;", "f", "b", "c", "getDeviceBindPhoneMac", "result", "d", MapSchema.FIELD_NAME_ENTRY, "j", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface xk4 {
    int a(@Nullable String mac);

    void addPairMonitor(@NotNull IBinder token, @NotNull String mac, @NotNull String model);

    void b(@NotNull ja5 listener);

    void c(@Nullable String mac, @NotNull ja5 listener);

    void d(@NotNull String mac, boolean result);

    boolean e(@NotNull String mac);

    void f(@NotNull ja5 listener);

    @Deprecated(message = "由于结果无法判断不支持/未获取,需要业务侧调用前判断,并且目前对该api暂无述求,考虑移除")
    @Nullable
    AppListBean findDeviceAppListByMac(@Nullable String mac);

    @Nullable
    ka5 findDeviceAppStatusByMacAndAppIds(@Nullable String mac, @NotNull int... appIds);

    void g(@NotNull im5 listener);

    @NotNull
    String getDeviceBindPhoneMac(@Nullable String mac);

    void h(@NotNull im5 listener);

    @Nullable
    VirtualAccountData i(@Nullable String mac);

    boolean isPairing();

    void j(@NotNull String mac);

    void k(boolean refreshCloud);

    void l(@Nullable String mac, @Nullable VirtualAccountData virtualAccountData);

    void notifyUnbindStart(@Nullable String mac, @NotNull String reason);

    void removePairMonitor(@NotNull IBinder token, @NotNull String mac, @NotNull String model);

    void requestDeviceBattery(@Nullable String mac);

    void setOobeStatue(@Nullable String mac, boolean oobeFinish);
}
