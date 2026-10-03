package com.heytap.speech.engine;

import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.speech.engine.constant.Constant;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.aq9;
import com.oplus.aiunit.vision.ebe;
import com.oplus.aiunit.vision.es9;
import com.oplus.aiunit.vision.iv9;
import com.oplus.aiunit.vision.ix3;
import com.oplus.aiunit.vision.oe4;
import com.oplus.aiunit.vision.tz0;
import com.oplus.aiunit.vision.upe;
import com.platform.sdk.center.webview.js.AcCommonApiMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b7\u0018\u0000 [2\u00020\u0001:\u0006\\][^_`B\u0007¢\u0006\u0004\bY\u0010ZJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u0010\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020!J\u000e\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&J\u0006\u0010(\u001a\u00020\u0002J\b\u0010)\u001a\u00020\u0004H\u0016R0\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u00101\u001a\u0004\u0018\u00010\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R$\u0010\r\u001a\u00020\f2\u0006\u00101\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b6\u00107R$\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u00101\u001a\u0004\u0018\u00010\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bC\u0010DR(\u0010E\u001a\u0004\u0018\u00010\u001a2\b\u00101\u001a\u0004\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR(\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\b\u00101\u001a\u0004\u0018\u00010\u001c8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001e\u0010I\u001a\u0004\bJ\u0010KR(\u0010L\u001a\u0004\u0018\u00010!2\b\u00101\u001a\u0004\u0018\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR(\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u00101\u001a\u0004\u0018\u00010\u001f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010P\u001a\u0004\bQ\u0010RR(\u0010%\u001a\u0004\u0018\u00010#2\b\u00101\u001a\u0004\u0018\u00010#8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010S\u001a\u0004\bT\u0010UR(\u0010'\u001a\u0004\u0018\u00010&2\b\u00101\u001a\u0004\u0018\u00010&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010V\u001a\u0004\bW\u0010X¨\u0006a"}, d2 = {"Lcom/heytap/speech/engine/EngineConfig;", "", "", "checkUser", "", "key", "value", "addConfig", "getConfig", "defaultValue", "", "containsConfig", "", "logLevel", "Lcom/oplus/aiunit/vision/es9;", "logHook", "log", "Lcom/oplus/aiunit/vision/iv9;", "cacheHook", "cache", "Lcom/oplus/aiunit/vision/aq9;", "executorHook", "executor", "Lcom/oplus/aiunit/vision/ix3;", "connectConfig", "connect", "Lcom/oplus/aiunit/vision/tz0;", "recorder", "Lcom/heytap/speech/engine/EngineConfig$DeviceInfoConfig;", "deviceInfo", "device", "Lcom/heytap/speech/engine/EngineConfig$ApplicationInfoConfig;", "applicationInfo", "Lcom/heytap/speech/engine/EngineConfig$UserInfoConfig;", ebe.KEY_USER_INFO, "Lcom/heytap/speech/engine/EngineConfig$AsrConfig;", "asrConfig", "asr", "Lcom/heytap/speech/engine/EngineConfig$TtsConfig;", "tts", "checkConfigs", "toString", "", "map", "Ljava/util/Map;", "getMap", "()Ljava/util/Map;", "setMap", "(Ljava/util/Map;)V", "<set-?>", "Lcom/oplus/aiunit/vision/es9;", "getLogHook", "()Lcom/oplus/aiunit/vision/es9;", "I", "getLogLevel", "()I", "Lcom/oplus/aiunit/vision/iv9;", "getCache", "()Lcom/oplus/aiunit/vision/iv9;", "setCache", "(Lcom/oplus/aiunit/vision/iv9;)V", "Lcom/oplus/aiunit/vision/aq9;", "getExecutor", "()Lcom/oplus/aiunit/vision/aq9;", "setExecutor", "(Lcom/oplus/aiunit/vision/aq9;)V", "Lcom/oplus/aiunit/vision/ix3;", "getConnectConfig", "()Lcom/oplus/aiunit/vision/ix3;", "audioRecorder", "Lcom/oplus/aiunit/vision/tz0;", "getAudioRecorder", "()Lcom/oplus/aiunit/vision/tz0;", "Lcom/heytap/speech/engine/EngineConfig$DeviceInfoConfig;", "getDevice", "()Lcom/heytap/speech/engine/EngineConfig$DeviceInfoConfig;", "user", "Lcom/heytap/speech/engine/EngineConfig$UserInfoConfig;", "getUser", "()Lcom/heytap/speech/engine/EngineConfig$UserInfoConfig;", "Lcom/heytap/speech/engine/EngineConfig$ApplicationInfoConfig;", "getApplicationInfo", "()Lcom/heytap/speech/engine/EngineConfig$ApplicationInfoConfig;", "Lcom/heytap/speech/engine/EngineConfig$AsrConfig;", "getAsr", "()Lcom/heytap/speech/engine/EngineConfig$AsrConfig;", "Lcom/heytap/speech/engine/EngineConfig$TtsConfig;", "getTts", "()Lcom/heytap/speech/engine/EngineConfig$TtsConfig;", "<init>", "()V", "Companion", "ApplicationInfoConfig", "AsrConfig", "DeviceInfoConfig", "TtsConfig", "UserInfoConfig", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class EngineConfig {

    @NotNull
    public static final String CLOUD_WAKEUP_BUFFER_SIZE = "83200";

    @NotNull
    public static final String K_ASR_ROUTER = "ASR_ROUTER";

    @NotNull
    public static final String K_ASR_TIPS = "ASR_TIPS";

    @NotNull
    public static final String K_BUS_PROTOCOL_VERSION_CODE = "BUS_PROTOCOL_VERSION_CODE";

    @NotNull
    public static final String K_CLOSE_TIPS = "CLOSE_TIPS";

    @NotNull
    public static final String K_CLOUD_WAKEUP_2_TIMEOUT = "CLOUD_WAKEUP_2_TIMEOUT";

    @NotNull
    public static final String K_CLOUD_WAKEUP_BUFFER_SIZE = "CLOUD_WAKEUP_BUFFER_SIZE";

    @NotNull
    public static final String K_CLOUD_WAKEUP_BUFFER_TIME = "CLOUD_WAKEUP_BUFFER_TIME";

    @NotNull
    public static final String K_CLOUD_WAKEUP_WAIT_NEXT_DIALOG_TIME = "CLOUD_WAKEUP_WAIT_NEXT_DIALOG_TIME";

    @NotNull
    public static final String K_CUSTOM_HOME = "CUSTOM_HOME";

    @NotNull
    public static final String K_CUSTOM_TIPS = "CUSTOM_TIPS";

    @NotNull
    public static final String K_DATA_HOME = "DATA_HOME";

    @NotNull
    public static final String K_DEVICE_TYPE = "TYPE";

    @NotNull
    public static final String K_DM_ROUTER = "DM_ROUTER";

    @NotNull
    public static final String K_ENGINE_SDK_VERSION = "ENGINE_SDK_VERSION";

    @NotNull
    public static final String K_ONESHOT = "ONESHOT";

    @NotNull
    public static final String K_ONESHOT_ENDTIME = "ONESHOT_ENDTIME";

    @NotNull
    public static final String K_OPUS_FRAME_SIZE = "OPUS_FRAME_SIZE";

    @NotNull
    public static final String K_OPUS_VERSION = "OPUS_VERSION";

    @NotNull
    public static final String K_SOURCE = "SOURCE";

    @NotNull
    public static final String K_TIMEOUT_DM = "TIMEOUT_DM";

    @NotNull
    public static final String K_TIMEOUT_NATIVEAPI = "TIMEOUT_NATIVEAPI";

    @NotNull
    public static final String K_VAD_DEBUG = "VAD_DEBUG";

    @NotNull
    public static final String K_VAD_LOG_LEVEL = "VAD_LOG_LEVEL";

    @NotNull
    public static final String K_VAD_MODE = "VAD_MODE";

    @NotNull
    public static final String K_VAD_ONESHOT_PARAMS = "VAD_ONESHOT_PARAMS";

    @NotNull
    public static final String K_VAD_ONESHOT_PAUSE_TIME = "VAD_ONESHOT_PAUSE_TIME";

    @NotNull
    public static final String K_VAD_ONESHOT_ROUND2_TIMEOUT = "K_VAD_ONESHOT_ROUND2_TIMEOUT";

    @NotNull
    public static final String K_VAD_PARAMS = "VAD_PARAMS";

    @NotNull
    public static final String K_VAD_PAUSE_TIME = "VAD_PAUSE_TIME";

    @NotNull
    public static final String K_VAD_TEST_PCM = "VAD_TEST_PCM";

    @NotNull
    public static final String K_VAD_TIMEOUT = "VAD_TIMEOUT";

    @NotNull
    public static final String K_VAD_TYPE = "VAD_TYPE";

    @NotNull
    public static final String K_WAKEUP_CLOUD_CHECK_TIME = "WAKEUP_CLOUD_CHECK_TIME";

    @NotNull
    public static final String K_WAKEUP_ROUTER = "WAKEUP_ROUTER";

    @NotNull
    public static final String TAG = "EngineConfig";

    @Nullable
    private ApplicationInfoConfig applicationInfo;

    @Nullable
    private AsrConfig asr;

    @Nullable
    private tz0 audioRecorder;

    @Nullable
    private iv9 cache;

    @Nullable
    private ix3 connectConfig;

    @Nullable
    private DeviceInfoConfig device;

    @Nullable
    private aq9 executor;

    @Nullable
    private es9 logHook;

    @Nullable
    private TtsConfig tts;

    @Nullable
    private UserInfoConfig user;

    @NotNull
    private Map<String, String> map = new HashMap();
    private int logLevel = 5;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n¢\u0006\u0002\u0010\rJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0015\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u0015\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\u0087\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000f¨\u0006-"}, d2 = {"Lcom/heytap/speech/engine/EngineConfig$ApplicationInfoConfig;", "", "appId", "", ConnectIdLogic.PARAM_SECRET_ID, "secretKey", "rsaPublicKey", "channel", LogSenderConst.PROTOCOLVERSION, "directiveVersion", "Ljava/util/concurrent/ConcurrentHashMap;", "namespaceVersion", "eventVersion", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;)V", "getAppId", "()Ljava/lang/String;", "getChannel", "getDirectiveVersion", "()Ljava/util/concurrent/ConcurrentHashMap;", "setDirectiveVersion", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "getEventVersion", "setEventVersion", "getNamespaceVersion", "setNamespaceVersion", "getProtocolVersion", "getRsaPublicKey", "getSecretId", "getSecretKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class ApplicationInfoConfig {

        @NotNull
        private final String appId;

        @NotNull
        private final String channel;

        @NotNull
        private ConcurrentHashMap<String, String> directiveVersion;

        @NotNull
        private ConcurrentHashMap<String, String> eventVersion;

        @NotNull
        private ConcurrentHashMap<String, String> namespaceVersion;

        @NotNull
        private final String protocolVersion;

        @NotNull
        private final String rsaPublicKey;

        @NotNull
        private final String secretId;

        @NotNull
        private final String secretKey;

        public ApplicationInfoConfig(@NotNull String appId, @NotNull String secretId, @NotNull String secretKey, @NotNull String rsaPublicKey, @NotNull String channel, @NotNull String protocolVersion, @NotNull ConcurrentHashMap<String, String> directiveVersion, @NotNull ConcurrentHashMap<String, String> namespaceVersion, @NotNull ConcurrentHashMap<String, String> eventVersion) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(secretId, "secretId");
            Intrinsics.checkNotNullParameter(secretKey, "secretKey");
            Intrinsics.checkNotNullParameter(rsaPublicKey, "rsaPublicKey");
            Intrinsics.checkNotNullParameter(channel, "channel");
            Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
            Intrinsics.checkNotNullParameter(directiveVersion, "directiveVersion");
            Intrinsics.checkNotNullParameter(namespaceVersion, "namespaceVersion");
            Intrinsics.checkNotNullParameter(eventVersion, "eventVersion");
            this.appId = appId;
            this.secretId = secretId;
            this.secretKey = secretKey;
            this.rsaPublicKey = rsaPublicKey;
            this.channel = channel;
            this.protocolVersion = protocolVersion;
            this.directiveVersion = directiveVersion;
            this.namespaceVersion = namespaceVersion;
            this.eventVersion = eventVersion;
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSecretId() {
            return this.secretId;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getSecretKey() {
            return this.secretKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getRsaPublicKey() {
            return this.rsaPublicKey;
        }

        @NotNull
        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getChannel() {
            return this.channel;
        }

        @NotNull
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getProtocolVersion() {
            return this.protocolVersion;
        }

        @NotNull
        public final ConcurrentHashMap<String, String> component7() {
            return this.directiveVersion;
        }

        @NotNull
        public final ConcurrentHashMap<String, String> component8() {
            return this.namespaceVersion;
        }

        @NotNull
        public final ConcurrentHashMap<String, String> component9() {
            return this.eventVersion;
        }

        @NotNull
        public final ApplicationInfoConfig copy(@NotNull String appId, @NotNull String secretId, @NotNull String secretKey, @NotNull String rsaPublicKey, @NotNull String channel, @NotNull String protocolVersion, @NotNull ConcurrentHashMap<String, String> directiveVersion, @NotNull ConcurrentHashMap<String, String> namespaceVersion, @NotNull ConcurrentHashMap<String, String> eventVersion) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(secretId, "secretId");
            Intrinsics.checkNotNullParameter(secretKey, "secretKey");
            Intrinsics.checkNotNullParameter(rsaPublicKey, "rsaPublicKey");
            Intrinsics.checkNotNullParameter(channel, "channel");
            Intrinsics.checkNotNullParameter(protocolVersion, "protocolVersion");
            Intrinsics.checkNotNullParameter(directiveVersion, "directiveVersion");
            Intrinsics.checkNotNullParameter(namespaceVersion, "namespaceVersion");
            Intrinsics.checkNotNullParameter(eventVersion, "eventVersion");
            return new ApplicationInfoConfig(appId, secretId, secretKey, rsaPublicKey, channel, protocolVersion, directiveVersion, namespaceVersion, eventVersion);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ApplicationInfoConfig)) {
                return false;
            }
            ApplicationInfoConfig applicationInfoConfig = (ApplicationInfoConfig) other;
            return Intrinsics.areEqual(this.appId, applicationInfoConfig.appId) && Intrinsics.areEqual(this.secretId, applicationInfoConfig.secretId) && Intrinsics.areEqual(this.secretKey, applicationInfoConfig.secretKey) && Intrinsics.areEqual(this.rsaPublicKey, applicationInfoConfig.rsaPublicKey) && Intrinsics.areEqual(this.channel, applicationInfoConfig.channel) && Intrinsics.areEqual(this.protocolVersion, applicationInfoConfig.protocolVersion) && Intrinsics.areEqual(this.directiveVersion, applicationInfoConfig.directiveVersion) && Intrinsics.areEqual(this.namespaceVersion, applicationInfoConfig.namespaceVersion) && Intrinsics.areEqual(this.eventVersion, applicationInfoConfig.eventVersion);
        }

        @NotNull
        public final String getAppId() {
            return this.appId;
        }

        @NotNull
        public final String getChannel() {
            return this.channel;
        }

        @NotNull
        public final ConcurrentHashMap<String, String> getDirectiveVersion() {
            return this.directiveVersion;
        }

        @NotNull
        public final ConcurrentHashMap<String, String> getEventVersion() {
            return this.eventVersion;
        }

        @NotNull
        public final ConcurrentHashMap<String, String> getNamespaceVersion() {
            return this.namespaceVersion;
        }

        @NotNull
        public final String getProtocolVersion() {
            return this.protocolVersion;
        }

        @NotNull
        public final String getRsaPublicKey() {
            return this.rsaPublicKey;
        }

        @NotNull
        public final String getSecretId() {
            return this.secretId;
        }

        @NotNull
        public final String getSecretKey() {
            return this.secretKey;
        }

        public int hashCode() {
            return (((((((((((((((this.appId.hashCode() * 31) + this.secretId.hashCode()) * 31) + this.secretKey.hashCode()) * 31) + this.rsaPublicKey.hashCode()) * 31) + this.channel.hashCode()) * 31) + this.protocolVersion.hashCode()) * 31) + this.directiveVersion.hashCode()) * 31) + this.namespaceVersion.hashCode()) * 31) + this.eventVersion.hashCode();
        }

        public final void setDirectiveVersion(@NotNull ConcurrentHashMap<String, String> concurrentHashMap) {
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<set-?>");
            this.directiveVersion = concurrentHashMap;
        }

        public final void setEventVersion(@NotNull ConcurrentHashMap<String, String> concurrentHashMap) {
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<set-?>");
            this.eventVersion = concurrentHashMap;
        }

        public final void setNamespaceVersion(@NotNull ConcurrentHashMap<String, String> concurrentHashMap) {
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<set-?>");
            this.namespaceVersion = concurrentHashMap;
        }

        @NotNull
        public String toString() {
            return "ApplicationInfoConfig(appId=" + this.appId + ", secretId=" + this.secretId + ", secretKey=" + this.secretKey + ", rsaPublicKey=" + this.rsaPublicKey + ", channel=" + this.channel + ", protocolVersion=" + this.protocolVersion + ", directiveVersion=" + this.directiveVersion + ", namespaceVersion=" + this.namespaceVersion + ", eventVersion=" + this.eventVersion + ')';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/heytap/speech/engine/EngineConfig$AsrConfig;", "", "lang", "", "dialect", "(Ljava/lang/String;Ljava/lang/String;)V", "getDialect", "()Ljava/lang/String;", "setDialect", "(Ljava/lang/String;)V", "getLang", "setLang", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class AsrConfig {

        @Nullable
        private String dialect;

        @NotNull
        private String lang;

        /* JADX WARN: Multi-variable type inference failed */
        public AsrConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ AsrConfig copy$default(AsrConfig asrConfig, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = asrConfig.lang;
            }
            if ((i & 2) != 0) {
                str2 = asrConfig.dialect;
            }
            return asrConfig.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLang() {
            return this.lang;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDialect() {
            return this.dialect;
        }

        @NotNull
        public final AsrConfig copy(@NotNull String lang, @Nullable String dialect) {
            Intrinsics.checkNotNullParameter(lang, "lang");
            return new AsrConfig(lang, dialect);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AsrConfig)) {
                return false;
            }
            AsrConfig asrConfig = (AsrConfig) other;
            return Intrinsics.areEqual(this.lang, asrConfig.lang) && Intrinsics.areEqual(this.dialect, asrConfig.dialect);
        }

        @Nullable
        public final String getDialect() {
            return this.dialect;
        }

        @NotNull
        public final String getLang() {
            return this.lang;
        }

        public int hashCode() {
            int iHashCode = this.lang.hashCode() * 31;
            String str = this.dialect;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final void setDialect(@Nullable String str) {
            this.dialect = str;
        }

        public final void setLang(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.lang = str;
        }

        @NotNull
        public String toString() {
            return "AsrConfig(lang=" + this.lang + ", dialect=" + ((Object) this.dialect) + ')';
        }

        public AsrConfig(@NotNull String lang, @Nullable String str) {
            Intrinsics.checkNotNullParameter(lang, "lang");
            this.lang = lang;
            this.dialect = str;
        }

        public /* synthetic */ AsrConfig(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "zh-CN" : str, (i & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/EngineConfig$TtsConfig;", "", "lang", "", "dialect", EngineConstant.TTS_TIMBRE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDialect", "()Ljava/lang/String;", "setDialect", "(Ljava/lang/String;)V", "getLang", "setLang", "getTimbre", "setTimbre", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class TtsConfig {

        @Nullable
        private String dialect;

        @NotNull
        private String lang;

        @Nullable
        private String timbre;

        public TtsConfig() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ TtsConfig copy$default(TtsConfig ttsConfig, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ttsConfig.lang;
            }
            if ((i & 2) != 0) {
                str2 = ttsConfig.dialect;
            }
            if ((i & 4) != 0) {
                str3 = ttsConfig.timbre;
            }
            return ttsConfig.copy(str, str2, str3);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getLang() {
            return this.lang;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDialect() {
            return this.dialect;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getTimbre() {
            return this.timbre;
        }

        @NotNull
        public final TtsConfig copy(@NotNull String lang, @Nullable String dialect, @Nullable String timbre) {
            Intrinsics.checkNotNullParameter(lang, "lang");
            return new TtsConfig(lang, dialect, timbre);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TtsConfig)) {
                return false;
            }
            TtsConfig ttsConfig = (TtsConfig) other;
            return Intrinsics.areEqual(this.lang, ttsConfig.lang) && Intrinsics.areEqual(this.dialect, ttsConfig.dialect) && Intrinsics.areEqual(this.timbre, ttsConfig.timbre);
        }

        @Nullable
        public final String getDialect() {
            return this.dialect;
        }

        @NotNull
        public final String getLang() {
            return this.lang;
        }

        @Nullable
        public final String getTimbre() {
            return this.timbre;
        }

        public int hashCode() {
            int iHashCode = this.lang.hashCode() * 31;
            String str = this.dialect;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.timbre;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final void setDialect(@Nullable String str) {
            this.dialect = str;
        }

        public final void setLang(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.lang = str;
        }

        public final void setTimbre(@Nullable String str) {
            this.timbre = str;
        }

        @NotNull
        public String toString() {
            return "TtsConfig(lang=" + this.lang + ", dialect=" + ((Object) this.dialect) + ", timbre=" + ((Object) this.timbre) + ')';
        }

        public TtsConfig(@NotNull String lang, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(lang, "lang");
            this.lang = lang;
            this.dialect = str;
            this.timbre = str2;
        }

        public /* synthetic */ TtsConfig(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "zh-CN" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/heytap/speech/engine/EngineConfig$UserInfoConfig;", "", "userId", "", "userMode", "token", SpeechConstant.KEY_ACCOUNT_DEVICE_ID, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHeytapAccountDeviceId", "()Ljava/lang/String;", "setHeytapAccountDeviceId", "(Ljava/lang/String;)V", AcCommonApiMethod.GET_TOKEN, "setToken", "getUserId", "setUserId", "getUserMode", "setUserMode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class UserInfoConfig {

        @NotNull
        private String heytapAccountDeviceId;

        @NotNull
        private String token;

        @NotNull
        private String userId;

        @NotNull
        private String userMode;

        public UserInfoConfig() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ UserInfoConfig copy$default(UserInfoConfig userInfoConfig, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = userInfoConfig.userId;
            }
            if ((i & 2) != 0) {
                str2 = userInfoConfig.userMode;
            }
            if ((i & 4) != 0) {
                str3 = userInfoConfig.token;
            }
            if ((i & 8) != 0) {
                str4 = userInfoConfig.heytapAccountDeviceId;
            }
            return userInfoConfig.copy(str, str2, str3, str4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getUserMode() {
            return this.userMode;
        }

        @NotNull
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getHeytapAccountDeviceId() {
            return this.heytapAccountDeviceId;
        }

        @NotNull
        public final UserInfoConfig copy(@NotNull String userId, @NotNull String userMode, @NotNull String token, @NotNull String heytapAccountDeviceId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(userMode, "userMode");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(heytapAccountDeviceId, "heytapAccountDeviceId");
            return new UserInfoConfig(userId, userMode, token, heytapAccountDeviceId);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UserInfoConfig)) {
                return false;
            }
            UserInfoConfig userInfoConfig = (UserInfoConfig) other;
            return Intrinsics.areEqual(this.userId, userInfoConfig.userId) && Intrinsics.areEqual(this.userMode, userInfoConfig.userMode) && Intrinsics.areEqual(this.token, userInfoConfig.token) && Intrinsics.areEqual(this.heytapAccountDeviceId, userInfoConfig.heytapAccountDeviceId);
        }

        @NotNull
        public final String getHeytapAccountDeviceId() {
            return this.heytapAccountDeviceId;
        }

        @NotNull
        public final String getToken() {
            return this.token;
        }

        @NotNull
        public final String getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserMode() {
            return this.userMode;
        }

        public int hashCode() {
            return (((((this.userId.hashCode() * 31) + this.userMode.hashCode()) * 31) + this.token.hashCode()) * 31) + this.heytapAccountDeviceId.hashCode();
        }

        public final void setHeytapAccountDeviceId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.heytapAccountDeviceId = str;
        }

        public final void setToken(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.token = str;
        }

        public final void setUserId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userId = str;
        }

        public final void setUserMode(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userMode = str;
        }

        @NotNull
        public String toString() {
            return "UserInfoConfig(userId=" + this.userId + ", userMode=" + this.userMode + ", token=" + this.token + ", heytapAccountDeviceId=" + this.heytapAccountDeviceId + ')';
        }

        public UserInfoConfig(@NotNull String userId, @NotNull String userMode, @NotNull String token, @NotNull String heytapAccountDeviceId) {
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(userMode, "userMode");
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(heytapAccountDeviceId, "heytapAccountDeviceId");
            this.userId = userId;
            this.userMode = userMode;
            this.token = token;
            this.heytapAccountDeviceId = heytapAccountDeviceId;
        }

        public /* synthetic */ UserInfoConfig(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "GUEST" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }
    }

    public EngineConfig() {
        addConfig(K_BUS_PROTOCOL_VERSION_CODE, 1);
        addConfig(K_ENGINE_SDK_VERSION, Integer.valueOf(BuildConfig.VERSION_CODE));
    }

    private final void checkUser() {
        UserInfoConfig userInfoConfig = this.user;
        String userId = userInfoConfig == null ? null : userInfoConfig.getUserId();
        if (userId == null || userId.length() == 0) {
            upe upeVar = upe.INSTANCE;
            String strB = upeVar.b(Constant.KEY_RANDOM_USERID, "");
            if (strB.length() == 0) {
                DeviceInfoConfig deviceInfoConfig = this.device;
                if (deviceInfoConfig == null) {
                    return;
                }
                String deviceId = deviceInfoConfig == null ? null : deviceInfoConfig.getDeviceId();
                if (deviceId == null || deviceId.length() == 0) {
                    return;
                }
                DeviceInfoConfig deviceInfoConfig2 = this.device;
                String deviceId2 = deviceInfoConfig2 != null ? deviceInfoConfig2.getDeviceId() : null;
                Intrinsics.checkNotNull(deviceId2);
                strB = oe4.a(deviceId2);
                upeVar.d(Constant.KEY_RANDOM_USERID, strB);
            }
            UserInfoConfig userInfoConfig2 = this.user;
            if (userInfoConfig2 == null) {
                return;
            }
            userInfoConfig2.setUserId(strB);
        }
    }

    @NotNull
    public final EngineConfig addConfig(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.map.put(key, value == null ? null : value.toString());
        return this;
    }

    @NotNull
    public final EngineConfig applicationInfo(@NotNull ApplicationInfoConfig applicationInfo) {
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.applicationInfo = applicationInfo;
        return this;
    }

    @NotNull
    public final EngineConfig asr(@NotNull AsrConfig asrConfig) {
        Intrinsics.checkNotNullParameter(asrConfig, "asrConfig");
        this.asr = asrConfig;
        return this;
    }

    @NotNull
    public final EngineConfig cache(@Nullable iv9 cacheHook) {
        this.cache = cacheHook;
        return this;
    }

    public final void checkConfigs() throws IllegalArgumentException {
        String str;
        if (this.connectConfig == null) {
            str = "connectConfig is null.";
        } else if (this.audioRecorder == null) {
            str = "recorder is null.";
        } else {
            DeviceInfoConfig deviceInfoConfig = this.device;
            if (deviceInfoConfig == null) {
                str = "deviceInfo is null.";
            } else if (this.applicationInfo == null) {
                str = "applicationInfo is null.";
            } else if (this.user == null) {
                str = "userInfo is null.";
            } else if (this.asr == null) {
                str = "asrInfo is null.";
            } else if (this.tts == null) {
                str = "ttsInfo is null.";
            } else {
                String deviceId = deviceInfoConfig == null ? null : deviceInfoConfig.getDeviceId();
                if (deviceId == null || deviceId.length() == 0) {
                    str = "deviceInfo.deviceId is null or empty.";
                } else {
                    ApplicationInfoConfig applicationInfoConfig = this.applicationInfo;
                    String appId = applicationInfoConfig == null ? null : applicationInfoConfig.getAppId();
                    if (appId == null || appId.length() == 0) {
                        str = "applicationInfo.appId is null or empty.";
                    } else {
                        ApplicationInfoConfig applicationInfoConfig2 = this.applicationInfo;
                        String secretId = applicationInfoConfig2 == null ? null : applicationInfoConfig2.getSecretId();
                        if (secretId == null || secretId.length() == 0) {
                            str = "applicationInfo.secretId is null or empty.";
                        } else {
                            ApplicationInfoConfig applicationInfoConfig3 = this.applicationInfo;
                            String secretKey = applicationInfoConfig3 == null ? null : applicationInfoConfig3.getSecretKey();
                            if (secretKey == null || secretKey.length() == 0) {
                                str = "applicationInfo.secretKey is null or empty.";
                            } else {
                                ApplicationInfoConfig applicationInfoConfig4 = this.applicationInfo;
                                String rsaPublicKey = applicationInfoConfig4 == null ? null : applicationInfoConfig4.getRsaPublicKey();
                                if (rsaPublicKey == null || rsaPublicKey.length() == 0) {
                                    str = "applicationInfo.rsaPublicKey is null or empty.";
                                } else {
                                    ApplicationInfoConfig applicationInfoConfig5 = this.applicationInfo;
                                    String channel = applicationInfoConfig5 == null ? null : applicationInfoConfig5.getChannel();
                                    str = channel == null || channel.length() == 0 ? "applicationInfo.channel is null or empty." : null;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (str != null) {
            throw new IllegalArgumentException(str);
        }
        checkUser();
    }

    @NotNull
    public final EngineConfig connect(@NotNull ix3 connectConfig) {
        Intrinsics.checkNotNullParameter(connectConfig, "connectConfig");
        this.connectConfig = connectConfig;
        return this;
    }

    public final boolean containsConfig(@Nullable String key) {
        Map<String, String> map = this.map;
        if (map != null) {
            return map.containsKey(key);
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    @NotNull
    public final EngineConfig device(@NotNull DeviceInfoConfig deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.device = deviceInfo;
        return this;
    }

    @NotNull
    public final EngineConfig executor(@NotNull aq9 executorHook) {
        Intrinsics.checkNotNullParameter(executorHook, "executorHook");
        this.executor = executorHook;
        return this;
    }

    @Nullable
    public final ApplicationInfoConfig getApplicationInfo() {
        return this.applicationInfo;
    }

    @Nullable
    public final AsrConfig getAsr() {
        return this.asr;
    }

    @Nullable
    public final tz0 getAudioRecorder() {
        return this.audioRecorder;
    }

    @Nullable
    public final iv9 getCache() {
        return this.cache;
    }

    @Nullable
    public final String getConfig(@Nullable String key) {
        return this.map.get(key);
    }

    @Nullable
    public final ix3 getConnectConfig() {
        return this.connectConfig;
    }

    @Nullable
    public final DeviceInfoConfig getDevice() {
        return this.device;
    }

    @Nullable
    public final aq9 getExecutor() {
        return this.executor;
    }

    @Nullable
    public final es9 getLogHook() {
        return this.logHook;
    }

    public final int getLogLevel() {
        return this.logLevel;
    }

    @NotNull
    public final Map<String, String> getMap() {
        return this.map;
    }

    @Nullable
    public final TtsConfig getTts() {
        return this.tts;
    }

    @Nullable
    public final UserInfoConfig getUser() {
        return this.user;
    }

    @NotNull
    public final EngineConfig log(int logLevel, @Nullable es9 logHook) {
        if (logHook != null) {
            this.logHook = logHook;
        }
        this.logLevel = logLevel;
        return this;
    }

    @NotNull
    public final EngineConfig recorder(@NotNull tz0 recorder) {
        Intrinsics.checkNotNullParameter(recorder, "recorder");
        this.audioRecorder = recorder;
        return this;
    }

    public final void setCache(@Nullable iv9 iv9Var) {
        this.cache = iv9Var;
    }

    public final void setExecutor(@Nullable aq9 aq9Var) {
        this.executor = aq9Var;
    }

    public final void setMap(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.map = map;
    }

    @NotNull
    public String toString() {
        return "EngineConfig(map=" + this.map + ", logHook=" + this.logHook + ", logLevel=" + this.logLevel + ", connectConfig=" + this.connectConfig + ", audioRecorder=" + this.audioRecorder + ", device=" + this.device + ", user=" + this.user + ", applicationInfo=" + this.applicationInfo + ", asr=" + this.asr + ", tts=" + this.tts + ')';
    }

    @NotNull
    public final EngineConfig tts(@NotNull TtsConfig tts) {
        Intrinsics.checkNotNullParameter(tts, "tts");
        this.tts = tts;
        return this;
    }

    @NotNull
    public final EngineConfig userInfo(@NotNull UserInfoConfig userInfo) {
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        this.user = userInfo;
        return this;
    }

    @NotNull
    public final String getConfig(@NotNull String key, @NotNull String defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        String str = this.map.get(key);
        return str == null ? defaultValue : str;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\rJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013Jp\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\nHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\f\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001c\u0010'\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0018\"\u0004\b)\u0010\u001a¨\u00068"}, d2 = {"Lcom/heytap/speech/engine/EngineConfig$DeviceInfoConfig;", "", "deviceId", "", "langCodes", "Ljava/util/ArrayList;", "location", "attributes", "", ConnectIdLogic.PARAM_OS_TYPE, "", "osVersion", "clientOsVersion", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/Map;ILjava/lang/String;Ljava/lang/Integer;)V", "getAttributes", "()Ljava/util/Map;", "setAttributes", "(Ljava/util/Map;)V", "getClientOsVersion", "()Ljava/lang/Integer;", "setClientOsVersion", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDeviceId", "()Ljava/lang/String;", "setDeviceId", "(Ljava/lang/String;)V", "getLangCodes", "()Ljava/util/ArrayList;", "setLangCodes", "(Ljava/util/ArrayList;)V", "getLocation", "setLocation", "getOsType", "()I", "setOsType", "(I)V", "getOsVersion", "setOsVersion", HttpConst.OTA_VERSION, "getOtaVersion", "setOtaVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/util/Map;ILjava/lang/String;Ljava/lang/Integer;)Lcom/heytap/speech/engine/EngineConfig$DeviceInfoConfig;", "equals", "", "other", "hashCode", "toString", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class DeviceInfoConfig {

        @Nullable
        private Map<String, ? extends Object> attributes;

        @Nullable
        private Integer clientOsVersion;

        @NotNull
        private String deviceId;

        @Nullable
        private ArrayList<String> langCodes;

        @Nullable
        private String location;
        private int osType;

        @Nullable
        private String osVersion;

        @Nullable
        private String otaVersion;

        public DeviceInfoConfig(@NotNull String deviceId, @Nullable ArrayList<String> arrayList, @Nullable String str, @Nullable Map<String, ? extends Object> map, int i, @Nullable String str2, @Nullable Integer num) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            this.deviceId = deviceId;
            this.langCodes = arrayList;
            this.location = str;
            this.attributes = map;
            this.osType = i;
            this.osVersion = str2;
            this.clientOsVersion = num;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DeviceInfoConfig copy$default(DeviceInfoConfig deviceInfoConfig, String str, ArrayList arrayList, String str2, Map map, int i, String str3, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = deviceInfoConfig.deviceId;
            }
            if ((i2 & 2) != 0) {
                arrayList = deviceInfoConfig.langCodes;
            }
            ArrayList arrayList2 = arrayList;
            if ((i2 & 4) != 0) {
                str2 = deviceInfoConfig.location;
            }
            String str4 = str2;
            if ((i2 & 8) != 0) {
                map = deviceInfoConfig.attributes;
            }
            Map map2 = map;
            if ((i2 & 16) != 0) {
                i = deviceInfoConfig.osType;
            }
            int i3 = i;
            if ((i2 & 32) != 0) {
                str3 = deviceInfoConfig.osVersion;
            }
            String str5 = str3;
            if ((i2 & 64) != 0) {
                num = deviceInfoConfig.clientOsVersion;
            }
            return deviceInfoConfig.copy(str, arrayList2, str4, map2, i3, str5, num);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        @Nullable
        public final ArrayList<String> component2() {
            return this.langCodes;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLocation() {
            return this.location;
        }

        @Nullable
        public final Map<String, Object> component4() {
            return this.attributes;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final int getOsType() {
            return this.osType;
        }

        @Nullable
        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getOsVersion() {
            return this.osVersion;
        }

        @Nullable
        /* JADX INFO: renamed from: component7, reason: from getter */
        public final Integer getClientOsVersion() {
            return this.clientOsVersion;
        }

        @NotNull
        public final DeviceInfoConfig copy(@NotNull String deviceId, @Nullable ArrayList<String> langCodes, @Nullable String location, @Nullable Map<String, ? extends Object> attributes, int osType, @Nullable String osVersion, @Nullable Integer clientOsVersion) {
            Intrinsics.checkNotNullParameter(deviceId, "deviceId");
            return new DeviceInfoConfig(deviceId, langCodes, location, attributes, osType, osVersion, clientOsVersion);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceInfoConfig)) {
                return false;
            }
            DeviceInfoConfig deviceInfoConfig = (DeviceInfoConfig) other;
            return Intrinsics.areEqual(this.deviceId, deviceInfoConfig.deviceId) && Intrinsics.areEqual(this.langCodes, deviceInfoConfig.langCodes) && Intrinsics.areEqual(this.location, deviceInfoConfig.location) && Intrinsics.areEqual(this.attributes, deviceInfoConfig.attributes) && this.osType == deviceInfoConfig.osType && Intrinsics.areEqual(this.osVersion, deviceInfoConfig.osVersion) && Intrinsics.areEqual(this.clientOsVersion, deviceInfoConfig.clientOsVersion);
        }

        @Nullable
        public final Map<String, Object> getAttributes() {
            return this.attributes;
        }

        @Nullable
        public final Integer getClientOsVersion() {
            return this.clientOsVersion;
        }

        @NotNull
        public final String getDeviceId() {
            return this.deviceId;
        }

        @Nullable
        public final ArrayList<String> getLangCodes() {
            return this.langCodes;
        }

        @Nullable
        public final String getLocation() {
            return this.location;
        }

        public final int getOsType() {
            return this.osType;
        }

        @Nullable
        public final String getOsVersion() {
            return this.osVersion;
        }

        @Nullable
        public final String getOtaVersion() {
            return this.otaVersion;
        }

        public int hashCode() {
            int iHashCode = this.deviceId.hashCode() * 31;
            ArrayList<String> arrayList = this.langCodes;
            int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            String str = this.location;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, ? extends Object> map = this.attributes;
            int iHashCode4 = (((iHashCode3 + (map == null ? 0 : map.hashCode())) * 31) + Integer.hashCode(this.osType)) * 31;
            String str2 = this.osVersion;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.clientOsVersion;
            return iHashCode5 + (num != null ? num.hashCode() : 0);
        }

        public final void setAttributes(@Nullable Map<String, ? extends Object> map) {
            this.attributes = map;
        }

        public final void setClientOsVersion(@Nullable Integer num) {
            this.clientOsVersion = num;
        }

        public final void setDeviceId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.deviceId = str;
        }

        public final void setLangCodes(@Nullable ArrayList<String> arrayList) {
            this.langCodes = arrayList;
        }

        public final void setLocation(@Nullable String str) {
            this.location = str;
        }

        public final void setOsType(int i) {
            this.osType = i;
        }

        public final void setOsVersion(@Nullable String str) {
            this.osVersion = str;
        }

        public final void setOtaVersion(@Nullable String str) {
            this.otaVersion = str;
        }

        @NotNull
        public String toString() {
            return "DeviceInfoConfig(deviceId=" + this.deviceId + ", langCodes=" + this.langCodes + ", location=" + ((Object) this.location) + ", attributes=" + this.attributes + ", osType=" + this.osType + ", osVersion=" + ((Object) this.osVersion) + ", clientOsVersion=" + this.clientOsVersion + ')';
        }

        public /* synthetic */ DeviceInfoConfig(String str, ArrayList arrayList, String str2, Map map, int i, String str3, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.arrayListOf("zh", "yue") : arrayList, (i2 & 4) != 0 ? "CN" : str2, (i2 & 8) != 0 ? null : map, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? null : str3, (i2 & 64) == 0 ? num : null);
        }
    }
}
