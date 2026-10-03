package com.oplus.seedling.sdk.recommendlist;

import android.util.ArrayMap;
import androidx.annotation.Keep;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.bs9;
import com.oplus.aiunit.vision.t6e;
import com.oplus.seedling.sdk.seedling.NewSeedlingCardOptions;
import com.oplus.seedling.sdk.seedling.SeedlingCardOptions;
import com.opos.process.bridge.base.BridgeConstant;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\bm\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u0097\u00012\u00020\u0001:\u0002\u0097\u0001Bk\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0002\u0010\u0012BÉ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050&\u0012\b\b\u0002\u0010'\u001a\u00020\u0005\u0012\b\b\u0002\u0010(\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030&¢\u0006\u0002\u0010*J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\t\u0010m\u001a\u00020\u0015HÆ\u0003J\t\u0010n\u001a\u00020\u0015HÆ\u0003J\t\u0010o\u001a\u00020\u0005HÆ\u0003J\t\u0010p\u001a\u00020\u0005HÆ\u0003J\t\u0010q\u001a\u00020\u0005HÆ\u0003J\t\u0010r\u001a\u00020\u0015HÆ\u0003J\t\u0010s\u001a\u00020\u0005HÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010v\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\t\u0010w\u001a\u00020\u0005HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u0010\u0010y\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010AJ\u000b\u0010z\u001a\u0004\u0018\u00010\"HÆ\u0003J\u0010\u0010{\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010AJ\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050&HÆ\u0003J\t\u0010~\u001a\u00020\u0005HÆ\u0003J\t\u0010\u007f\u001a\u00020\u0005HÆ\u0003J\u0016\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030&HÆ\u0003J\u0010\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0005HÂ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0005HÆ\u0003Jâ\u0002\u0010\u0088\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050&2\b\b\u0002\u0010'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u00052\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030&HÆ\u0001¢\u0006\u0003\u0010\u0089\u0001J\u0015\u0010\u008a\u0001\u001a\u00020\u00152\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003J\n\u0010\u008d\u0001\u001a\u00020\u0005HÖ\u0001J\u0010\u0010\u008e\u0001\u001a\u00020\u00152\u0007\u0010\u008f\u0001\u001a\u00020\u0005J\u0010\u0010\u0090\u0001\u001a\u00020\u00152\u0007\u0010\u0091\u0001\u001a\u00020\u0005J\u0007\u0010\u0092\u0001\u001a\u00020\u0015J\u0013\u0010\u0093\u0001\u001a\u00030\u0094\u00012\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010'\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001a\u0010\u0016\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R\u001a\u0010(\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00100\"\u0004\b:\u00102R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010<R\u001e\u0010 \u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00100\"\u0004\bF\u00102R\u001e\u0010#\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u0010\n\u0002\u0010D\u001a\u0004\bG\u0010A\"\u0004\bH\u0010CR\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010,\"\u0004\bI\u0010.R\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u00100\"\u0004\bJ\u00102R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001c\u0010$\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010<\"\u0004\bP\u0010>R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR&\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u001a\u0010\u001b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u00100\"\u0004\bZ\u00102R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u00100\"\u0004\b\\\u00102R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b]\u0010<R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b^\u00100R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010`\"\u0004\bd\u0010bR\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010<\"\u0004\bf\u0010>R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bi\u0010jR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bk\u0010j¨\u0006\u0098\u0001"}, d2 = {"Lcom/oplus/seedling/sdk/recommendlist/ServiceInfo;", "Ljava/io/Serializable;", "serviceId", "", "serviceType", "", "supportCardSizes", "", "score", "", "supportEntrance", "initData", SpeechConstant.KEY_TTS_TIMESTAMP, "", "versionCode", BridgeConstant.KEY_EXTRAS, "Landroid/util/ArrayMap;", "", "(Ljava/lang/String;ILjava/util/List;FILjava/lang/String;JJLandroid/util/ArrayMap;)V", "isParamsSendToSeedling", "cannotReduceRecommend", "", "forceRebuild", "serviceCategory", "channelType", "intentCategory", "isGuaranteedCard", "seedlingType", "subdomain", "hostPackage", "seedlingCardOptions", "Lcom/oplus/seedling/sdk/seedling/SeedlingCardOptions;", "instanceId", "newSeedlingCardOptions", "Lcom/oplus/seedling/sdk/seedling/NewSeedlingCardOptions;", "intentId", "policy", "sizeToCardType", "", "cloudRemindSwitch", "groupPriority", "sizeToCardConfig", "(Ljava/lang/String;ILjava/util/List;FILjava/lang/String;JJIZZIIIZILjava/lang/String;Ljava/lang/String;Landroid/util/ArrayMap;Lcom/oplus/seedling/sdk/seedling/SeedlingCardOptions;Ljava/lang/Long;Lcom/oplus/seedling/sdk/seedling/NewSeedlingCardOptions;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;IILjava/util/Map;)V", "getCannotReduceRecommend", "()Z", "setCannotReduceRecommend", "(Z)V", "getChannelType", "()I", "setChannelType", "(I)V", "getCloudRemindSwitch", "setCloudRemindSwitch", "getExtras", "()Landroid/util/ArrayMap;", "getForceRebuild", "setForceRebuild", "getGroupPriority", "setGroupPriority", "getHostPackage", "()Ljava/lang/String;", "setHostPackage", "(Ljava/lang/String;)V", "getInitData", "getInstanceId", "()Ljava/lang/Long;", "setInstanceId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getIntentCategory", "setIntentCategory", "getIntentId", "setIntentId", "setGuaranteedCard", "setParamsSendToSeedling", "getNewSeedlingCardOptions", "()Lcom/oplus/seedling/sdk/seedling/NewSeedlingCardOptions;", "setNewSeedlingCardOptions", "(Lcom/oplus/seedling/sdk/seedling/NewSeedlingCardOptions;)V", "getPolicy", "setPolicy", "getScore", "()F", "getSeedlingCardOptions$annotations", "()V", "getSeedlingCardOptions", "()Lcom/oplus/seedling/sdk/seedling/SeedlingCardOptions;", "setSeedlingCardOptions", "(Lcom/oplus/seedling/sdk/seedling/SeedlingCardOptions;)V", "getSeedlingType", "setSeedlingType", "getServiceCategory", "setServiceCategory", "getServiceId", "getServiceType", "getSizeToCardConfig", "()Ljava/util/Map;", "setSizeToCardConfig", "(Ljava/util/Map;)V", "getSizeToCardType", "setSizeToCardType", "getSubdomain", "setSubdomain", "getSupportCardSizes", "()Ljava/util/List;", "getTimeStamp", "()J", "getVersionCode", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;ILjava/util/List;FILjava/lang/String;JJIZZIIIZILjava/lang/String;Ljava/lang/String;Landroid/util/ArrayMap;Lcom/oplus/seedling/sdk/seedling/SeedlingCardOptions;Ljava/lang/Long;Lcom/oplus/seedling/sdk/seedling/NewSeedlingCardOptions;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Map;IILjava/util/Map;)Lcom/oplus/seedling/sdk/recommendlist/ServiceInfo;", "equals", "other", "getUTraceIntentContext", "hashCode", "isSupportEntrance", "entranceType", "isSupportSize", "size", "isSupportStrongRemind", "setUTraceIntentContext", "", "uTraceIntentContextString", "toString", "Companion", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class ServiceInfo implements Serializable {
    public static final int NOT_SUPPORT_STRONG_REMIND = 1;
    public static final int SUPPORT_STRONG_REMIND = 2;

    @NotNull
    private static final String TAG = "ServiceInfo";
    private static final long serialVersionUID = 1;
    private boolean cannotReduceRecommend;
    private int channelType;
    private int cloudRemindSwitch;

    @Nullable
    private final ArrayMap<String, Object> extras;
    private boolean forceRebuild;
    private int groupPriority;

    @Nullable
    private String hostPackage;

    @Nullable
    private final String initData;

    @Nullable
    private Long instanceId;
    private int intentCategory;

    @Nullable
    private Long intentId;
    private boolean isGuaranteedCard;
    private int isParamsSendToSeedling;

    @Nullable
    private NewSeedlingCardOptions newSeedlingCardOptions;

    @Nullable
    private String policy;
    private final float score;

    @Nullable
    private SeedlingCardOptions seedlingCardOptions;
    private int seedlingType;
    private int serviceCategory;

    @NotNull
    private final String serviceId;
    private final int serviceType;

    @NotNull
    private Map<Integer, String> sizeToCardConfig;

    @NotNull
    private Map<Integer, Integer> sizeToCardType;

    @NotNull
    private String subdomain;

    @NotNull
    private final List<Integer> supportCardSizes;
    private final int supportEntrance;
    private final long timeStamp;
    private final long versionCode;

    public ServiceInfo(@NotNull String serviceId, int i, @NotNull List<Integer> supportCardSizes, float f, int i2, @Nullable String str, long j2, long j3, int i3, boolean z, boolean z2, int i4, int i5, int i6, boolean z3, int i7, @NotNull String subdomain, @Nullable String str2, @Nullable ArrayMap<String, Object> arrayMap, @Nullable SeedlingCardOptions seedlingCardOptions, @Nullable Long l2, @Nullable NewSeedlingCardOptions newSeedlingCardOptions, @Nullable Long l3, @Nullable String str3, @NotNull Map<Integer, Integer> sizeToCardType, int i8, int i9, @NotNull Map<Integer, String> sizeToCardConfig) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(supportCardSizes, "supportCardSizes");
        Intrinsics.checkNotNullParameter(subdomain, "subdomain");
        Intrinsics.checkNotNullParameter(sizeToCardType, "sizeToCardType");
        Intrinsics.checkNotNullParameter(sizeToCardConfig, "sizeToCardConfig");
        this.serviceId = serviceId;
        this.serviceType = i;
        this.supportCardSizes = supportCardSizes;
        this.score = f;
        this.supportEntrance = i2;
        this.initData = str;
        this.timeStamp = j2;
        this.versionCode = j3;
        this.isParamsSendToSeedling = i3;
        this.cannotReduceRecommend = z;
        this.forceRebuild = z2;
        this.serviceCategory = i4;
        this.channelType = i5;
        this.intentCategory = i6;
        this.isGuaranteedCard = z3;
        this.seedlingType = i7;
        this.subdomain = subdomain;
        this.hostPackage = str2;
        this.extras = arrayMap;
        this.seedlingCardOptions = seedlingCardOptions;
        this.instanceId = l2;
        this.newSeedlingCardOptions = newSeedlingCardOptions;
        this.intentId = l3;
        this.policy = str3;
        this.sizeToCardType = sizeToCardType;
        this.cloudRemindSwitch = i8;
        this.groupPriority = i9;
        this.sizeToCardConfig = sizeToCardConfig;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final int getSupportEntrance() {
        return this.supportEntrance;
    }

    @Deprecated(message = "please use NewSeedlingCardOptions instead of this attribute,which is supported in sdk version 1.1.10")
    public static /* synthetic */ void getSeedlingCardOptions$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getCannotReduceRecommend() {
        return this.cannotReduceRecommend;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getForceRebuild() {
        return this.forceRebuild;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getServiceCategory() {
        return this.serviceCategory;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getChannelType() {
        return this.channelType;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getIntentCategory() {
        return this.intentCategory;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsGuaranteedCard() {
        return this.isGuaranteedCard;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getSeedlingType() {
        return this.seedlingType;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getSubdomain() {
        return this.subdomain;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getHostPackage() {
        return this.hostPackage;
    }

    @Nullable
    public final ArrayMap<String, Object> component19() {
        return this.extras;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getServiceType() {
        return this.serviceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final SeedlingCardOptions getSeedlingCardOptions() {
        return this.seedlingCardOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Long getInstanceId() {
        return this.instanceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final NewSeedlingCardOptions getNewSeedlingCardOptions() {
        return this.newSeedlingCardOptions;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Long getIntentId() {
        return this.intentId;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getPolicy() {
        return this.policy;
    }

    @NotNull
    public final Map<Integer, Integer> component25() {
        return this.sizeToCardType;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final int getCloudRemindSwitch() {
        return this.cloudRemindSwitch;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final int getGroupPriority() {
        return this.groupPriority;
    }

    @NotNull
    public final Map<Integer, String> component28() {
        return this.sizeToCardConfig;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.supportCardSizes;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getScore() {
        return this.score;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getInitData() {
        return this.initData;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getVersionCode() {
        return this.versionCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getIsParamsSendToSeedling() {
        return this.isParamsSendToSeedling;
    }

    @NotNull
    public final ServiceInfo copy(@NotNull String serviceId, int serviceType, @NotNull List<Integer> supportCardSizes, float score, int supportEntrance, @Nullable String initData, long timeStamp, long versionCode, int isParamsSendToSeedling, boolean cannotReduceRecommend, boolean forceRebuild, int serviceCategory, int channelType, int intentCategory, boolean isGuaranteedCard, int seedlingType, @NotNull String subdomain, @Nullable String hostPackage, @Nullable ArrayMap<String, Object> extras, @Nullable SeedlingCardOptions seedlingCardOptions, @Nullable Long instanceId, @Nullable NewSeedlingCardOptions newSeedlingCardOptions, @Nullable Long intentId, @Nullable String policy, @NotNull Map<Integer, Integer> sizeToCardType, int cloudRemindSwitch, int groupPriority, @NotNull Map<Integer, String> sizeToCardConfig) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(supportCardSizes, "supportCardSizes");
        Intrinsics.checkNotNullParameter(subdomain, "subdomain");
        Intrinsics.checkNotNullParameter(sizeToCardType, "sizeToCardType");
        Intrinsics.checkNotNullParameter(sizeToCardConfig, "sizeToCardConfig");
        return new ServiceInfo(serviceId, serviceType, supportCardSizes, score, supportEntrance, initData, timeStamp, versionCode, isParamsSendToSeedling, cannotReduceRecommend, forceRebuild, serviceCategory, channelType, intentCategory, isGuaranteedCard, seedlingType, subdomain, hostPackage, extras, seedlingCardOptions, instanceId, newSeedlingCardOptions, intentId, policy, sizeToCardType, cloudRemindSwitch, groupPriority, sizeToCardConfig);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ServiceInfo)) {
            return false;
        }
        ServiceInfo serviceInfo = (ServiceInfo) other;
        return Intrinsics.areEqual(this.serviceId, serviceInfo.serviceId) && this.serviceType == serviceInfo.serviceType && Intrinsics.areEqual(this.supportCardSizes, serviceInfo.supportCardSizes) && Float.compare(this.score, serviceInfo.score) == 0 && this.supportEntrance == serviceInfo.supportEntrance && Intrinsics.areEqual(this.initData, serviceInfo.initData) && this.timeStamp == serviceInfo.timeStamp && this.versionCode == serviceInfo.versionCode && this.isParamsSendToSeedling == serviceInfo.isParamsSendToSeedling && this.cannotReduceRecommend == serviceInfo.cannotReduceRecommend && this.forceRebuild == serviceInfo.forceRebuild && this.serviceCategory == serviceInfo.serviceCategory && this.channelType == serviceInfo.channelType && this.intentCategory == serviceInfo.intentCategory && this.isGuaranteedCard == serviceInfo.isGuaranteedCard && this.seedlingType == serviceInfo.seedlingType && Intrinsics.areEqual(this.subdomain, serviceInfo.subdomain) && Intrinsics.areEqual(this.hostPackage, serviceInfo.hostPackage) && Intrinsics.areEqual(this.extras, serviceInfo.extras) && Intrinsics.areEqual(this.seedlingCardOptions, serviceInfo.seedlingCardOptions) && Intrinsics.areEqual(this.instanceId, serviceInfo.instanceId) && Intrinsics.areEqual(this.newSeedlingCardOptions, serviceInfo.newSeedlingCardOptions) && Intrinsics.areEqual(this.intentId, serviceInfo.intentId) && Intrinsics.areEqual(this.policy, serviceInfo.policy) && Intrinsics.areEqual(this.sizeToCardType, serviceInfo.sizeToCardType) && this.cloudRemindSwitch == serviceInfo.cloudRemindSwitch && this.groupPriority == serviceInfo.groupPriority && Intrinsics.areEqual(this.sizeToCardConfig, serviceInfo.sizeToCardConfig);
    }

    public final boolean getCannotReduceRecommend() {
        return this.cannotReduceRecommend;
    }

    public final int getChannelType() {
        return this.channelType;
    }

    public final int getCloudRemindSwitch() {
        return this.cloudRemindSwitch;
    }

    @Nullable
    public final ArrayMap<String, Object> getExtras() {
        return this.extras;
    }

    public final boolean getForceRebuild() {
        return this.forceRebuild;
    }

    public final int getGroupPriority() {
        return this.groupPriority;
    }

    @Nullable
    public final String getHostPackage() {
        return this.hostPackage;
    }

    @Nullable
    public final String getInitData() {
        return this.initData;
    }

    @Nullable
    public final Long getInstanceId() {
        return this.instanceId;
    }

    public final int getIntentCategory() {
        return this.intentCategory;
    }

    @Nullable
    public final Long getIntentId() {
        return this.intentId;
    }

    @Nullable
    public final NewSeedlingCardOptions getNewSeedlingCardOptions() {
        return this.newSeedlingCardOptions;
    }

    @Nullable
    public final String getPolicy() {
        return this.policy;
    }

    public final float getScore() {
        return this.score;
    }

    @Nullable
    public final SeedlingCardOptions getSeedlingCardOptions() {
        return this.seedlingCardOptions;
    }

    public final int getSeedlingType() {
        return this.seedlingType;
    }

    public final int getServiceCategory() {
        return this.serviceCategory;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    public final int getServiceType() {
        return this.serviceType;
    }

    @NotNull
    public final Map<Integer, String> getSizeToCardConfig() {
        return this.sizeToCardConfig;
    }

    @NotNull
    public final Map<Integer, Integer> getSizeToCardType() {
        return this.sizeToCardType;
    }

    @NotNull
    public final String getSubdomain() {
        return this.subdomain;
    }

    @NotNull
    public final List<Integer> getSupportCardSizes() {
        return this.supportCardSizes;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @Nullable
    public final String getUTraceIntentContext() {
        ArrayMap<String, Object> arrayMap = this.extras;
        if (arrayMap == null) {
            bs9.a.c(t6e.INSTANCE, TAG, "getUTraceIntentContext,extras == null", false, null, false, 0, false, null, 252, null);
            return null;
        }
        Object obj = arrayMap.get("uTraceIntentContext");
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final long getVersionCode() {
        return this.versionCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public int hashCode() {
        int iHashCode = ((((((((this.serviceId.hashCode() * 31) + Integer.hashCode(this.serviceType)) * 31) + this.supportCardSizes.hashCode()) * 31) + Float.hashCode(this.score)) * 31) + Integer.hashCode(this.supportEntrance)) * 31;
        String str = this.initData;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timeStamp)) * 31) + Long.hashCode(this.versionCode)) * 31) + Integer.hashCode(this.isParamsSendToSeedling)) * 31;
        boolean z = this.cannotReduceRecommend;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode2 + r1) * 31;
        boolean z2 = this.forceRebuild;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode3 = (((((((i + r2) * 31) + Integer.hashCode(this.serviceCategory)) * 31) + Integer.hashCode(this.channelType)) * 31) + Integer.hashCode(this.intentCategory)) * 31;
        boolean z3 = this.isGuaranteedCard;
        int iHashCode4 = (((((iHashCode3 + (z3 ? 1 : z3)) * 31) + Integer.hashCode(this.seedlingType)) * 31) + this.subdomain.hashCode()) * 31;
        String str2 = this.hostPackage;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayMap<String, Object> arrayMap = this.extras;
        int iHashCode6 = (iHashCode5 + (arrayMap == null ? 0 : arrayMap.hashCode())) * 31;
        SeedlingCardOptions seedlingCardOptions = this.seedlingCardOptions;
        int iHashCode7 = (iHashCode6 + (seedlingCardOptions == null ? 0 : seedlingCardOptions.hashCode())) * 31;
        Long l2 = this.instanceId;
        int iHashCode8 = (iHashCode7 + (l2 == null ? 0 : l2.hashCode())) * 31;
        NewSeedlingCardOptions newSeedlingCardOptions = this.newSeedlingCardOptions;
        int iHashCode9 = (iHashCode8 + (newSeedlingCardOptions == null ? 0 : newSeedlingCardOptions.hashCode())) * 31;
        Long l3 = this.intentId;
        int iHashCode10 = (iHashCode9 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.policy;
        return ((((((((iHashCode10 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.sizeToCardType.hashCode()) * 31) + Integer.hashCode(this.cloudRemindSwitch)) * 31) + Integer.hashCode(this.groupPriority)) * 31) + this.sizeToCardConfig.hashCode();
    }

    public final boolean isGuaranteedCard() {
        return this.isGuaranteedCard;
    }

    public final int isParamsSendToSeedling() {
        return this.isParamsSendToSeedling;
    }

    public final boolean isSupportEntrance(int entranceType) {
        int i = this.supportEntrance;
        return (i & entranceType) == entranceType || i == 0;
    }

    public final boolean isSupportSize(int size) {
        return this.supportCardSizes.contains(Integer.valueOf(size));
    }

    public final boolean isSupportStrongRemind() {
        return this.cloudRemindSwitch == 2;
    }

    public final void setCannotReduceRecommend(boolean z) {
        this.cannotReduceRecommend = z;
    }

    public final void setChannelType(int i) {
        this.channelType = i;
    }

    public final void setCloudRemindSwitch(int i) {
        this.cloudRemindSwitch = i;
    }

    public final void setForceRebuild(boolean z) {
        this.forceRebuild = z;
    }

    public final void setGroupPriority(int i) {
        this.groupPriority = i;
    }

    public final void setGuaranteedCard(boolean z) {
        this.isGuaranteedCard = z;
    }

    public final void setHostPackage(@Nullable String str) {
        this.hostPackage = str;
    }

    public final void setInstanceId(@Nullable Long l2) {
        this.instanceId = l2;
    }

    public final void setIntentCategory(int i) {
        this.intentCategory = i;
    }

    public final void setIntentId(@Nullable Long l2) {
        this.intentId = l2;
    }

    public final void setNewSeedlingCardOptions(@Nullable NewSeedlingCardOptions newSeedlingCardOptions) {
        this.newSeedlingCardOptions = newSeedlingCardOptions;
    }

    public final void setParamsSendToSeedling(int i) {
        this.isParamsSendToSeedling = i;
    }

    public final void setPolicy(@Nullable String str) {
        this.policy = str;
    }

    public final void setSeedlingCardOptions(@Nullable SeedlingCardOptions seedlingCardOptions) {
        this.seedlingCardOptions = seedlingCardOptions;
    }

    public final void setSeedlingType(int i) {
        this.seedlingType = i;
    }

    public final void setServiceCategory(int i) {
        this.serviceCategory = i;
    }

    public final void setSizeToCardConfig(@NotNull Map<Integer, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.sizeToCardConfig = map;
    }

    public final void setSizeToCardType(@NotNull Map<Integer, Integer> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.sizeToCardType = map;
    }

    public final void setSubdomain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subdomain = str;
    }

    public final void setUTraceIntentContext(@Nullable String uTraceIntentContextString) {
        ArrayMap<String, Object> arrayMap = this.extras;
        if (arrayMap != null) {
            arrayMap.put("uTraceIntentContext", uTraceIntentContextString);
        }
    }

    @NotNull
    public String toString() {
        return "ServiceInfo(serviceId=" + this.serviceId + ", serviceType=" + this.serviceType + ", supportCardSizes=" + this.supportCardSizes + ", score=" + this.score + ", supportEntrance=" + this.supportEntrance + ", initData=" + this.initData + ", timeStamp=" + this.timeStamp + ", versionCode=" + this.versionCode + ", isParamsSendToSeedling=" + this.isParamsSendToSeedling + ", cannotReduceRecommend=" + this.cannotReduceRecommend + ", forceRebuild=" + this.forceRebuild + ", serviceCategory=" + this.serviceCategory + ", channelType=" + this.channelType + ", intentCategory=" + this.intentCategory + ", isGuaranteedCard=" + this.isGuaranteedCard + ", seedlingType=" + this.seedlingType + ", subdomain=" + this.subdomain + ", hostPackage=" + this.hostPackage + ", extras=" + this.extras + ", seedlingCardOptions=" + this.seedlingCardOptions + ", instanceId=" + this.instanceId + ", newSeedlingCardOptions=" + this.newSeedlingCardOptions + ", intentId=" + this.intentId + ", policy=" + this.policy + ", sizeToCardType=" + this.sizeToCardType + ", cloudRemindSwitch=" + this.cloudRemindSwitch + ", groupPriority=" + this.groupPriority + ", sizeToCardConfig=" + this.sizeToCardConfig + ")";
    }

    public /* synthetic */ ServiceInfo(String str, int i, List list, float f, int i2, String str2, long j2, long j3, int i3, boolean z, boolean z2, int i4, int i5, int i6, boolean z3, int i7, String str3, String str4, ArrayMap arrayMap, SeedlingCardOptions seedlingCardOptions, Long l2, NewSeedlingCardOptions newSeedlingCardOptions, Long l3, String str5, Map map, int i8, int i9, Map map2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, list, f, i2, (i10 & 32) != 0 ? null : str2, j2, (i10 & 128) != 0 ? 0L : j3, (i10 & 256) != 0 ? 0 : i3, (i10 & 512) != 0 ? false : z, (i10 & 1024) != 0 ? false : z2, (i10 & 2048) != 0 ? 1 : i4, (i10 & 4096) != 0 ? 1 : i5, (i10 & 8192) != 0 ? 0 : i6, (i10 & 16384) != 0 ? false : z3, (32768 & i10) != 0 ? 1 : i7, (65536 & i10) != 0 ? "" : str3, str4, (262144 & i10) != 0 ? null : arrayMap, (524288 & i10) != 0 ? null : seedlingCardOptions, (1048576 & i10) != 0 ? null : l2, (2097152 & i10) != 0 ? null : newSeedlingCardOptions, (4194304 & i10) != 0 ? null : l3, (8388608 & i10) != 0 ? null : str5, (16777216 & i10) != 0 ? new LinkedHashMap() : map, (33554432 & i10) != 0 ? 1 : i8, (67108864 & i10) != 0 ? 4 : i9, (i10 & 134217728) != 0 ? new LinkedHashMap() : map2);
    }

    public /* synthetic */ ServiceInfo(String str, int i, List list, float f, int i2, String str2, long j2, long j3, ArrayMap arrayMap, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, list, f, i2, (i3 & 32) != 0 ? null : str2, j2, (i3 & 128) != 0 ? 0L : j3, (i3 & 256) != 0 ? null : arrayMap);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ServiceInfo(@NotNull String serviceId, int i, @NotNull List<Integer> supportCardSizes, float f, int i2, @Nullable String str, long j2, long j3, @Nullable ArrayMap<String, Object> arrayMap) {
        this(serviceId, i, supportCardSizes, f, i2, str, j2, j3, 0, false, false, 1, 1, 0, false, 1, "", "", arrayMap, null, null, null, null, null, null, 0, 0, null, 267911168, null);
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(supportCardSizes, "supportCardSizes");
    }
}
