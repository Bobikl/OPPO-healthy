package com.heytap.nearx.cloudconfig.bean;

import com.amap.api.maps.model.MyLocationStyle;
import com.heytap.nearx.cloudconfig.datasource.DirConfig;
import com.heytap.nearx.cloudconfig.observable.OnErrorSubscriber;
import io.protostuff.MapSchema;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005¢\u0006\u0002\u0010\u000fJ\b\u0010)\u001a\u00020&H\u0002J\u000e\u0010*\u001a\u00020&2\u0006\u0010\f\u001a\u00020\u0007J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003Jc\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0005HÆ\u0001J\u0013\u00105\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0010\u00107\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u00020\nJ\t\u00109\u001a\u00020\u0007HÖ\u0001J\u000e\u0010:\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010;\u001a\u00020\nJ\u001f\u0010<\u001a\u00020&2\u0006\u0010=\u001a\u00020\u00072\b\u0010>\u001a\u0004\u0018\u00010?H\u0000¢\u0006\u0002\b@J\u001a\u0010A\u001a\u00020&2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&0%J\t\u0010C\u001a\u00020\u0005HÖ\u0001J\u001a\u0010D\u001a\u00020\n2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&0%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0011\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u001f\"\u0004\b\"\u0010!R \u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&0%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018¨\u0006E"}, d2 = {"Lcom/heytap/nearx/cloudconfig/bean/ConfigTrace;", "", "dirConfig", "Lcom/heytap/nearx/cloudconfig/datasource/DirConfig;", "configId", "", "configType", "", "configVersion", "isHardcode", "", "isPreload", "state", "currStep", "configPath", "(Lcom/heytap/nearx/cloudconfig/datasource/DirConfig;Ljava/lang/String;IIZZIILjava/lang/String;)V", "getConfigId", "()Ljava/lang/String;", "getConfigPath", "setConfigPath", "(Ljava/lang/String;)V", "getConfigType", "()I", "setConfigType", "(I)V", "getConfigVersion", "setConfigVersion", "getCurrStep", "setCurrStep", "getDirConfig", "()Lcom/heytap/nearx/cloudconfig/datasource/DirConfig;", "()Z", "setHardcode", "(Z)V", "setPreload", "listeners", "", "Lkotlin/Function1;", "", "getState", "setState", "callStateChanged", "changeState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", MyLocationStyle.ERROR_INFO, "isFailed", "hashCode", "isException", "needPreload", "onError", "step", MapSchema.FIELD_NAME_ENTRY, "", "onError$com_heytap_nearx_cloudconfig", "registerObserver", "action", "toString", "unregisterObserver", "com.heytap.nearx.cloudconfig"}, k = 1, mv = {1, 1, 16})
public final /* data */ class ConfigTrace {

    @NotNull
    private final String configId;

    @NotNull
    private String configPath;
    private int configType;
    private int configVersion;
    private int currStep;

    @NotNull
    private final DirConfig dirConfig;
    private boolean isHardcode;
    private boolean isPreload;
    private final List<Function1<Integer, Unit>> listeners;
    private int state;

    public ConfigTrace(@NotNull DirConfig dirConfig, @NotNull String configId, int i, int i2, boolean z, boolean z2, int i3, int i4, @NotNull String configPath) {
        Intrinsics.checkParameterIsNotNull(dirConfig, "dirConfig");
        Intrinsics.checkParameterIsNotNull(configId, "configId");
        Intrinsics.checkParameterIsNotNull(configPath, "configPath");
        this.dirConfig = dirConfig;
        this.configId = configId;
        this.configType = i;
        this.configVersion = i2;
        this.isHardcode = z;
        this.isPreload = z2;
        this.state = i3;
        this.currStep = i4;
        this.configPath = configPath;
        this.listeners = new CopyOnWriteArrayList();
    }

    private final void callStateChanged() {
        synchronized (this.listeners) {
            Iterator it = CollectionsKt___CollectionsKt.toList(this.listeners).iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(Integer.valueOf(this.state));
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public static /* synthetic */ String errorInfo$default(ConfigTrace configTrace, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return configTrace.errorInfo(z);
    }

    public final void changeState(int state) {
        if (state != -8 && state != 1) {
            if (state == 10 || state == 40) {
                this.state = (this.state % state) + state;
                return;
            } else if (state != 101) {
                if (state != 200) {
                    this.state += state;
                    return;
                } else {
                    this.state += state;
                    callStateChanged();
                    return;
                }
            }
        }
        this.state = state;
        callStateChanged();
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DirConfig getDirConfig() {
        return this.dirConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getConfigId() {
        return this.configId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getConfigType() {
        return this.configType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getConfigVersion() {
        return this.configVersion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsHardcode() {
        return this.isHardcode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsPreload() {
        return this.isPreload;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCurrStep() {
        return this.currStep;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getConfigPath() {
        return this.configPath;
    }

    @NotNull
    public final ConfigTrace copy(@NotNull DirConfig dirConfig, @NotNull String configId, int configType, int configVersion, boolean isHardcode, boolean isPreload, int state, int currStep, @NotNull String configPath) {
        Intrinsics.checkParameterIsNotNull(dirConfig, "dirConfig");
        Intrinsics.checkParameterIsNotNull(configId, "configId");
        Intrinsics.checkParameterIsNotNull(configPath, "configPath");
        return new ConfigTrace(dirConfig, configId, configType, configVersion, isHardcode, isPreload, state, currStep, configPath);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfigTrace)) {
            return false;
        }
        ConfigTrace configTrace = (ConfigTrace) other;
        return Intrinsics.areEqual(this.dirConfig, configTrace.dirConfig) && Intrinsics.areEqual(this.configId, configTrace.configId) && this.configType == configTrace.configType && this.configVersion == configTrace.configVersion && this.isHardcode == configTrace.isHardcode && this.isPreload == configTrace.isPreload && this.state == configTrace.state && this.currStep == configTrace.currStep && Intrinsics.areEqual(this.configPath, configTrace.configPath);
    }

    @NotNull
    public final String errorInfo(boolean isFailed) {
        if (!isFailed && ConfigTraceKt.isSuccess(this.state)) {
            return "配置加载成功，开始数据查询";
        }
        int i = this.currStep;
        if (i == -101) {
            return "配置项检查更新失败";
        }
        if (i == 0) {
            return ConfigTraceKt.isFailed(this.state) ? "配置项文件下载出错" : String.valueOf(this.currStep);
        }
        if (i == 1) {
            return ConfigTraceKt.isFailed(this.state) ? "配置项文件校验异常" : String.valueOf(this.currStep);
        }
        if (i == 2) {
            return ConfigTraceKt.isFailed(this.state) ? "配置项解压错误" : String.valueOf(this.currStep);
        }
        if (i == 3) {
            return ConfigTraceKt.isFailed(this.state) ? "配置项数据预读取错误" : String.valueOf(this.currStep);
        }
        if (i == 4) {
            return ConfigTraceKt.isFailed(this.state) ? "未匹配到正确的配置项" : String.valueOf(this.currStep);
        }
        switch (i) {
            case -8:
                return "配置项被删除停用";
            case -7:
                return "插件Zip文件解压失败";
            case -6:
                return "插件文件MD5校验失败";
            case -5:
                return "最新配置项已存在";
            case -4:
                return "网络不可用或者检查太频繁";
            case -3:
                return "配置项紧急停用";
            case -2:
                return "错误的配置项code或者产品id";
            default:
                return "发生未知错误";
        }
    }

    @NotNull
    public final String getConfigId() {
        return this.configId;
    }

    @NotNull
    public final String getConfigPath() {
        return this.configPath;
    }

    public final int getConfigType() {
        return this.configType;
    }

    public final int getConfigVersion() {
        return this.configVersion;
    }

    public final int getCurrStep() {
        return this.currStep;
    }

    @NotNull
    public final DirConfig getDirConfig() {
        return this.dirConfig;
    }

    public final int getState() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        DirConfig dirConfig = this.dirConfig;
        int iHashCode = (dirConfig != null ? dirConfig.hashCode() : 0) * 31;
        String str = this.configId;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.configType)) * 31) + Integer.hashCode(this.configVersion)) * 31;
        boolean z = this.isHardcode;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode2 + r2) * 31;
        boolean z2 = this.isPreload;
        int iHashCode3 = (((((i + (z2 ? 1 : z2)) * 31) + Integer.hashCode(this.state)) * 31) + Integer.hashCode(this.currStep)) * 31;
        String str2 = this.configPath;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isException(int state) {
        int i;
        return state >= 200 && ((i = this.currStep) == -8 || i == -3 || i == -1 || i == -11 || i == -12);
    }

    public final boolean isHardcode() {
        return this.isHardcode;
    }

    public final boolean isPreload() {
        return this.isPreload;
    }

    public final boolean needPreload() {
        return !ConfigTraceKt.isExist(this.state) && this.state < 10;
    }

    public final void onError$com_heytap_nearx_cloudconfig(int step, @Nullable Throwable e2) {
        for (Function1 function1 : CollectionsKt___CollectionsKt.toList(this.listeners)) {
            if (function1 instanceof OnErrorSubscriber) {
                ((OnErrorSubscriber) function1).onError(e2 != null ? e2 : new IllegalStateException("config load Error: " + step + " -> " + errorInfo(true)));
            }
        }
    }

    public final void registerObserver(@NotNull Function1<? super Integer, Unit> action) {
        Intrinsics.checkParameterIsNotNull(action, "action");
        synchronized (this.listeners) {
            if (!this.listeners.contains(action)) {
                this.listeners.add(action);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void setConfigPath(@NotNull String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.configPath = str;
    }

    public final void setConfigType(int i) {
        this.configType = i;
    }

    public final void setConfigVersion(int i) {
        this.configVersion = i;
    }

    public final void setCurrStep(int i) {
        this.currStep = i;
    }

    public final void setHardcode(boolean z) {
        this.isHardcode = z;
    }

    public final void setPreload(boolean z) {
        this.isPreload = z;
    }

    public final void setState(int i) {
        this.state = i;
    }

    @NotNull
    public String toString() {
        return "ConfigTrace(dirConfig=" + this.dirConfig + ", configId=" + this.configId + ", configType=" + this.configType + ", configVersion=" + this.configVersion + ", isHardcode=" + this.isHardcode + ", isPreload=" + this.isPreload + ", state=" + this.state + ", currStep=" + this.currStep + ", configPath=" + this.configPath + ")";
    }

    public final boolean unregisterObserver(@NotNull Function1<? super Integer, Unit> action) {
        boolean zRemove;
        Intrinsics.checkParameterIsNotNull(action, "action");
        synchronized (this.listeners) {
            zRemove = this.listeners.remove(action);
        }
        return zRemove;
    }

    public /* synthetic */ ConfigTrace(DirConfig dirConfig, String str, int i, int i2, boolean z, boolean z2, int i3, int i4, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(dirConfig, str, (i5 & 4) != 0 ? 0 : i, (i5 & 8) != 0 ? 0 : i2, (i5 & 16) != 0 ? false : z, (i5 & 32) != 0 ? false : z2, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? 0 : i4, (i5 & 256) != 0 ? "" : str2);
    }
}
