package com.heytap.nearx.tangramconfig.stat;

import android.content.Context;
import com.heytap.nearx.tangramconfig.BuildConfig;
import com.heytap.nearx.tangramconfig.api.ExceptionHandler;
import com.heytap.nearx.tangramconfig.api.IConfigStateListener;
import com.heytap.nearx.tangramconfig.device.DeviceInfo;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.smartenginehelper.entity.VideoEntity;
import io.protostuff.MapSchema;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b1\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 T2\u00020\u0001:\u0001TB§\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0002\u0010\u001bJ\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\u0015\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011HÆ\u0003J\t\u00109\u001a\u00020\u0013HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015HÆ\u0003J\t\u0010;\u001a\u00020\u0017HÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\tHÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\rHÆ\u0003J\t\u0010D\u001a\u00020\u0005HÆ\u0003J¿\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0001J\u0013\u0010F\u001a\u00020\u00032\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020\tHÖ\u0001J\u0006\u0010I\u001a\u00020\u0003J\u000e\u0010J\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020LJ\u001a\u0010M\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020\t2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0001J\u001c\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00112\u0006\u0010Q\u001a\u00020RJ\t\u0010S\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001f\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\"\"\u0004\b1\u00102R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\"¨\u0006U"}, d2 = {"Lcom/heytap/nearx/tangramconfig/stat/TaskStat;", "", "report", "", Fields.PRODUCT_ID, "", "packageName", "configId", "configType", "", "version", "netType", SpeechConstant.KEY_TTS_TIMESTAMP, "", "clientVersion", "taskStep", "condition", "", "exceptionHandler", "Lcom/heytap/nearx/tangramconfig/api/ExceptionHandler;", "errorMessage", "", VideoEntity.STATE_LISTENER, "Lcom/heytap/nearx/tangramconfig/api/IConfigStateListener;", "logAction", "Lkotlin/Function1;", "", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;JLjava/lang/String;ILjava/util/Map;Lcom/heytap/nearx/tangramconfig/api/ExceptionHandler;Ljava/util/List;Lcom/heytap/nearx/tangramconfig/api/IConfigStateListener;Lkotlin/jvm/functions/Function1;)V", "getClientVersion", "()Ljava/lang/String;", "getCondition", "()Ljava/util/Map;", "getConfigId", "getConfigType", "()I", "getErrorMessage", "()Ljava/util/List;", "getExceptionHandler", "()Lcom/heytap/nearx/tangramconfig/api/ExceptionHandler;", "getLogAction", "()Lkotlin/jvm/functions/Function1;", "getNetType", "getPackageName", "getProductId", "getReport", "()Z", "getStateListener", "()Lcom/heytap/nearx/tangramconfig/api/IConfigStateListener;", "getTaskStep", "setTaskStep", "(I)V", "getTimeStamp", "()J", "getVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "isSuccess", "onException", MapSchema.FIELD_NAME_ENTRY, "", "setStep", "step", "obj", "toMap", "context", "Landroid/content/Context;", "toString", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class TaskStat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<SecureRandom> sampleRandom$delegate = LazyKt__LazyJVMKt.lazy(new Function0<SecureRandom>() { // from class: com.heytap.nearx.tangramconfig.stat.TaskStat$Companion$sampleRandom$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final SecureRandom invoke() {
            return new SecureRandom();
        }
    });

    @NotNull
    private final String clientVersion;

    @NotNull
    private final Map<String, String> condition;

    @NotNull
    private final String configId;
    private final int configType;

    @NotNull
    private final List<String> errorMessage;

    @NotNull
    private final ExceptionHandler exceptionHandler;

    @Nullable
    private final Function1<String, Unit> logAction;

    @NotNull
    private final String netType;

    @NotNull
    private final String packageName;

    @NotNull
    private final String productId;
    private final boolean report;

    @NotNull
    private final IConfigStateListener stateListener;
    private int taskStep;
    private final long timeStamp;
    private final int version;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jp\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u001c"}, d2 = {"Lcom/heytap/nearx/tangramconfig/stat/TaskStat$Companion;", "", "()V", "sampleRandom", "Ljava/security/SecureRandom;", "getSampleRandom", "()Ljava/security/SecureRandom;", "sampleRandom$delegate", "Lkotlin/Lazy;", "newStat", "Lcom/heytap/nearx/tangramconfig/stat/TaskStat;", "sampleRatio", "", Fields.PRODUCT_ID, "", "configId", "configType", "version", "packageName", "condition", "", "exceptionHandler", "Lcom/heytap/nearx/tangramconfig/api/ExceptionHandler;", VideoEntity.STATE_LISTENER, "Lcom/heytap/nearx/tangramconfig/api/IConfigStateListener;", "logAction", "Lkotlin/Function1;", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final SecureRandom getSampleRandom() {
            return (SecureRandom) TaskStat.sampleRandom$delegate.getValue();
        }

        @NotNull
        public final TaskStat newStat(int sampleRatio, @NotNull String productId, @NotNull String configId, int configType, int version, @NotNull String packageName, @NotNull Map<String, String> condition, @NotNull ExceptionHandler exceptionHandler, @NotNull IConfigStateListener stateListener, @Nullable Function1<? super String, Unit> logAction) {
            Intrinsics.checkNotNullParameter(productId, "productId");
            Intrinsics.checkNotNullParameter(configId, "configId");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(condition, "condition");
            Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
            Intrinsics.checkNotNullParameter(stateListener, "stateListener");
            return new TaskStat(getSampleRandom().nextInt(100) + 1 <= sampleRatio, productId, packageName, configId, configType, version, "", System.currentTimeMillis(), "unspecified", 0, condition, exceptionHandler, new CopyOnWriteArrayList(), stateListener, logAction);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaskStat(boolean z, @NotNull String productId, @NotNull String packageName, @NotNull String configId, int i, int i2, @NotNull String netType, long j2, @NotNull String clientVersion, int i3, @NotNull Map<String, String> condition, @NotNull ExceptionHandler exceptionHandler, @NotNull List<String> errorMessage, @NotNull IConfigStateListener stateListener, @Nullable Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(configId, "configId");
        Intrinsics.checkNotNullParameter(netType, "netType");
        Intrinsics.checkNotNullParameter(clientVersion, "clientVersion");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(stateListener, "stateListener");
        this.report = z;
        this.productId = productId;
        this.packageName = packageName;
        this.configId = configId;
        this.configType = i;
        this.version = i2;
        this.netType = netType;
        this.timeStamp = j2;
        this.clientVersion = clientVersion;
        this.taskStep = i3;
        this.condition = condition;
        this.exceptionHandler = exceptionHandler;
        this.errorMessage = errorMessage;
        this.stateListener = stateListener;
        this.logAction = function1;
    }

    public static /* synthetic */ void setStep$default(TaskStat taskStat, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            obj = null;
        }
        taskStat.setStep(i, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getReport() {
        return this.report;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getTaskStep() {
        return this.taskStep;
    }

    @NotNull
    public final Map<String, String> component11() {
        return this.condition;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final ExceptionHandler getExceptionHandler() {
        return this.exceptionHandler;
    }

    @NotNull
    public final List<String> component13() {
        return this.errorMessage;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final IConfigStateListener getStateListener() {
        return this.stateListener;
    }

    @Nullable
    public final Function1<String, Unit> component15() {
        return this.logAction;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getConfigId() {
        return this.configId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getConfigType() {
        return this.configType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getNetType() {
        return this.netType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getClientVersion() {
        return this.clientVersion;
    }

    @NotNull
    public final TaskStat copy(boolean report, @NotNull String productId, @NotNull String packageName, @NotNull String configId, int configType, int version, @NotNull String netType, long timeStamp, @NotNull String clientVersion, int taskStep, @NotNull Map<String, String> condition, @NotNull ExceptionHandler exceptionHandler, @NotNull List<String> errorMessage, @NotNull IConfigStateListener stateListener, @Nullable Function1<? super String, Unit> logAction) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(configId, "configId");
        Intrinsics.checkNotNullParameter(netType, "netType");
        Intrinsics.checkNotNullParameter(clientVersion, "clientVersion");
        Intrinsics.checkNotNullParameter(condition, "condition");
        Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(stateListener, "stateListener");
        return new TaskStat(report, productId, packageName, configId, configType, version, netType, timeStamp, clientVersion, taskStep, condition, exceptionHandler, errorMessage, stateListener, logAction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaskStat)) {
            return false;
        }
        TaskStat taskStat = (TaskStat) other;
        return this.report == taskStat.report && Intrinsics.areEqual(this.productId, taskStat.productId) && Intrinsics.areEqual(this.packageName, taskStat.packageName) && Intrinsics.areEqual(this.configId, taskStat.configId) && this.configType == taskStat.configType && this.version == taskStat.version && Intrinsics.areEqual(this.netType, taskStat.netType) && this.timeStamp == taskStat.timeStamp && Intrinsics.areEqual(this.clientVersion, taskStat.clientVersion) && this.taskStep == taskStat.taskStep && Intrinsics.areEqual(this.condition, taskStat.condition) && Intrinsics.areEqual(this.exceptionHandler, taskStat.exceptionHandler) && Intrinsics.areEqual(this.errorMessage, taskStat.errorMessage) && Intrinsics.areEqual(this.stateListener, taskStat.stateListener) && Intrinsics.areEqual(this.logAction, taskStat.logAction);
    }

    @NotNull
    public final String getClientVersion() {
        return this.clientVersion;
    }

    @NotNull
    public final Map<String, String> getCondition() {
        return this.condition;
    }

    @NotNull
    public final String getConfigId() {
        return this.configId;
    }

    public final int getConfigType() {
        return this.configType;
    }

    @NotNull
    public final List<String> getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final ExceptionHandler getExceptionHandler() {
        return this.exceptionHandler;
    }

    @Nullable
    public final Function1<String, Unit> getLogAction() {
        return this.logAction;
    }

    @NotNull
    public final String getNetType() {
        return this.netType;
    }

    @NotNull
    public final String getPackageName() {
        return this.packageName;
    }

    @NotNull
    public final String getProductId() {
        return this.productId;
    }

    public final boolean getReport() {
        return this.report;
    }

    @NotNull
    public final IConfigStateListener getStateListener() {
        return this.stateListener;
    }

    public final int getTaskStep() {
        return this.taskStep;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public final int getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    public int hashCode() {
        boolean z = this.report;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iHashCode = ((((((((((((((((((((((((((r0 * 31) + this.productId.hashCode()) * 31) + this.packageName.hashCode()) * 31) + this.configId.hashCode()) * 31) + Integer.hashCode(this.configType)) * 31) + Integer.hashCode(this.version)) * 31) + this.netType.hashCode()) * 31) + Long.hashCode(this.timeStamp)) * 31) + this.clientVersion.hashCode()) * 31) + Integer.hashCode(this.taskStep)) * 31) + this.condition.hashCode()) * 31) + this.exceptionHandler.hashCode()) * 31) + this.errorMessage.hashCode()) * 31) + this.stateListener.hashCode()) * 31;
        Function1<String, Unit> function1 = this.logAction;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public final boolean isSuccess() {
        return this.taskStep >= 4;
    }

    public final void onException(@NotNull Throwable e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        String message = e2.getMessage();
        if (message == null) {
            message = e2.toString();
        }
        this.errorMessage.add(message);
        Function1<String, Unit> function1 = this.logAction;
        if (function1 != null) {
            function1.invoke(String.valueOf(e2));
        }
    }

    public final void setStep(int step, @Nullable Object obj) {
        String string;
        this.taskStep = step;
        if (step < 4) {
            this.stateListener.onConfigLoading(this.configType, this.configId, step);
            return;
        }
        IConfigStateListener iConfigStateListener = this.stateListener;
        int i = this.configType;
        String str = this.configId;
        int i2 = this.version;
        if (obj == null || (string = obj.toString()) == null) {
            string = "";
        }
        iConfigStateListener.onConfigUpdated(i, str, i2, string);
    }

    public final void setTaskStep(int i) {
        this.taskStep = i;
    }

    @Nullable
    public final Map<String, String> toMap(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.report) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("package_name", this.packageName);
        concurrentHashMap.put(Fields.PRODUCT_ID, this.productId);
        concurrentHashMap.put("configId", this.configId);
        concurrentHashMap.put("configType", String.valueOf(this.configType));
        concurrentHashMap.put("configVersion", String.valueOf(this.version));
        concurrentHashMap.put("net_type", this.taskStep <= 0 ? DeviceInfo.INSTANCE.getNetworkType(context) : this.netType);
        concurrentHashMap.put("time_stamp", String.valueOf(this.timeStamp));
        concurrentHashMap.put("client_version", this.clientVersion);
        concurrentHashMap.put("cost_time", String.valueOf(System.currentTimeMillis() - this.timeStamp));
        concurrentHashMap.put("step", String.valueOf(this.taskStep));
        concurrentHashMap.put("is_success", String.valueOf(this.taskStep >= 4));
        concurrentHashMap.put("error_message", CollectionsKt___CollectionsKt.joinToString$default(this.errorMessage, ";", null, null, 0, null, null, 62, null));
        concurrentHashMap.putAll(this.condition);
        return concurrentHashMap;
    }

    @NotNull
    public String toString() {
        return "TaskStat(report=" + this.report + ", productId=" + this.productId + ", packageName=" + this.packageName + ", configId=" + this.configId + ", configType=" + this.configType + ", version=" + this.version + ", netType=" + this.netType + ", timeStamp=" + this.timeStamp + ", clientVersion=" + this.clientVersion + ", taskStep=" + this.taskStep + ", condition=" + this.condition + ", exceptionHandler=" + this.exceptionHandler + ", errorMessage=" + this.errorMessage + ", stateListener=" + this.stateListener + ", logAction=" + this.logAction + ')';
    }

    public /* synthetic */ TaskStat(boolean z, String str, String str2, String str3, int i, int i2, String str4, long j2, String str5, int i3, Map map, ExceptionHandler exceptionHandler, List list, IConfigStateListener iConfigStateListener, Function1 function1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? false : z, str, str2, str3, (i4 & 16) != 0 ? 1 : i, (i4 & 32) != 0 ? 0 : i2, (i4 & 64) != 0 ? "" : str4, j2, str5, i3, map, exceptionHandler, list, iConfigStateListener, (i4 & 16384) != 0 ? null : function1);
    }
}
