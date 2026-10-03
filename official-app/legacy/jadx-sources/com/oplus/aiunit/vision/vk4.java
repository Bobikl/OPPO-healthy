package com.oplus.aiunit.vision;

import androidx.annotation.WorkerThread;
import com.heytap.health.base.utils.AsyncResult;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.constant.EngineConstant;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J&\u0010\u000f\u001a\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH&J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH&J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0017H&J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0017H&J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u001aH&J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u001aH&J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u001dH&J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u001dH&J\u0010\u0010!\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0012\u0010\"\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\b\u0010#\u001a\u00020\u000eH&J\u0012\u0010%\u001a\u0004\u0018\u00010\u00052\u0006\u0010$\u001a\u00020\u0005H&¨\u0006&"}, d2 = {"Lcom/oplus/aiunit/vision/vk4;", "", "", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "getBoundDeviceInfos", "", "mac", "getBoundDeviceInfoByMac", "Lcom/heytap/health/base/utils/AsyncResult;", LogFieldKey.MESSAGE_KEY, "deviceInfos", EngineConstant.REASON, "Lcom/oplus/aiunit/vision/sjk;", "updateType", "", "d", "", "x", "deleteDeviceByMac", "Lcom/oplus/aiunit/vision/vi5;", "listener", b2n.g, "t", "Lcom/oplus/aiunit/vision/mc5;", "r", "C", "Lcom/oplus/aiunit/vision/ta5;", LogFieldKey.PROCESS_NAME_KEY, "o", "Lcom/oplus/aiunit/vision/sj5;", "u", "s", "", "getRunMode", "w", "isSupportDynamicRegisterAgent", "deviceId", c8l.KEY_B, "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface vk4 {
    @Nullable
    String B(@NotNull String deviceId);

    void C(@NotNull mc5 listener);

    boolean d(@NotNull List<? extends UserDeviceInfo> deviceInfos, @NotNull String reason, @NotNull sjk updateType);

    boolean deleteDeviceByMac(@Nullable String mac);

    @Nullable
    UserDeviceInfo getBoundDeviceInfoByMac(@Nullable String mac);

    @NotNull
    List<UserDeviceInfo> getBoundDeviceInfos();

    @WorkerThread
    int getRunMode(@NotNull String mac);

    void h(@NotNull vi5 listener);

    boolean isSupportDynamicRegisterAgent();

    @NotNull
    AsyncResult<UserDeviceInfo> m(@Nullable String mac);

    void o(@NotNull ta5 listener);

    void p(@NotNull ta5 listener);

    void r(@NotNull mc5 listener);

    void s(@NotNull sj5 listener);

    void t(@NotNull vi5 listener);

    void u(@NotNull sj5 listener);

    boolean w(@Nullable String mac);

    void x(@NotNull UserDeviceInfo deviceInfos, @NotNull String reason, @NotNull sjk updateType);
}
