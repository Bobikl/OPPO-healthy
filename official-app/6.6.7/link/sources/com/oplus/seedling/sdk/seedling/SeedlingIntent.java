package com.oplus.seedling.sdk.seedling;

import android.util.ArrayMap;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import com.oplus.seedling.sdk.CardBlurHandler;
import com.oplus.seedling.sdk.recommendlist.ServiceInfo;
import com.oplus.utrace.sdk.UTraceCompat;
import com.oplus.utrace.sdk.UTraceContext;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pantanal.foundation.utils.RequiresVersionSdk;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 b2\u00020\u0001:\u0001bB1\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bBÕ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010\u0012\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0010\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\bHÆ\u0003J\u0017\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010HÆ\u0003J\u001d\u0010J\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0010\u0018\u00010\rHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00050\rHÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\bHÆ\u0003J\t\u0010R\u001a\u00020\nHÆ\u0003J\t\u0010S\u001a\u00020\bHÆ\u0003J\u0017\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010HÆ\u0003J\t\u0010U\u001a\u00020\bHÆ\u0003JÝ\u0001\u0010V\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00102\u001c\b\u0002\u0010\u0014\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0010\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010W\u001a\u00020\b2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Y\u001a\u0004\u0018\u00010\u0003H\u0007J\t\u0010Z\u001a\u00020\u0005HÖ\u0001J\u0012\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010^H\u0007J\u0012\u0010[\u001a\u00020\\2\b\u0010_\u001a\u0004\u0018\u00010\u0003H\u0007J\b\u0010`\u001a\u00020\u0003H\u0016J\u0006\u0010a\u001a\u00020\u0003J\f\u0010a\u001a\u00020\u0003*\u00020^H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR \u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R \u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R,\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00102\"\u0004\b6\u00104R2\u0010\u0014\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0010\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010*\"\u0004\b8\u0010,R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010.\"\u0004\b:\u00100R\u0011\u0010\u0011\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001cR\u001a\u0010\u0012\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u001c\"\u0004\b;\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u001c\"\u0004\b<\u0010\u001eR \u0010\u0015\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006c"}, d2 = {"Lcom/oplus/seedling/sdk/seedling/SeedlingIntent;", "", "serviceId", "", "cardSize", "", "initData", "allowUIBackground", "", "timestamp", "", "(Ljava/lang/String;ILjava/lang/String;ZJ)V", "cardSizeList", "", "isSubscribe", "extraData", "Landroid/util/ArrayMap;", "isAbnormal", "isEntranceTriggerCardClick", "extraDataToEngine", "extraDataToEngineList", "originServiceInfo", "Lcom/oplus/seedling/sdk/recommendlist/ServiceInfo;", "cardBlurHandler", "Lcom/oplus/seedling/sdk/CardBlurHandler;", "cardUniqueKey", "(Ljava/lang/String;ILjava/util/List;Ljava/lang/String;ZJZLandroid/util/ArrayMap;ZZLandroid/util/ArrayMap;Ljava/util/List;Lcom/oplus/seedling/sdk/recommendlist/ServiceInfo;Lcom/oplus/seedling/sdk/CardBlurHandler;Ljava/lang/String;)V", "getAllowUIBackground", "()Z", "setAllowUIBackground", "(Z)V", "getCardBlurHandler", "()Lcom/oplus/seedling/sdk/CardBlurHandler;", "setCardBlurHandler", "(Lcom/oplus/seedling/sdk/CardBlurHandler;)V", "getCardSize$annotations", "()V", "getCardSize", "()I", "setCardSize", "(I)V", "getCardSizeList", "()Ljava/util/List;", "setCardSizeList", "(Ljava/util/List;)V", "getCardUniqueKey", "()Ljava/lang/String;", "setCardUniqueKey", "(Ljava/lang/String;)V", "getExtraData", "()Landroid/util/ArrayMap;", "setExtraData", "(Landroid/util/ArrayMap;)V", "getExtraDataToEngine", "setExtraDataToEngine", "getExtraDataToEngineList", "setExtraDataToEngineList", "getInitData", "setInitData", "setEntranceTriggerCardClick", "setSubscribe", "getOriginServiceInfo", "()Lcom/oplus/seedling/sdk/recommendlist/ServiceInfo;", "setOriginServiceInfo", "(Lcom/oplus/seedling/sdk/recommendlist/ServiceInfo;)V", "getServiceId", "setServiceId", "getTimestamp", "()J", "setTimestamp", "(J)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "getUTraceIntentContext", "hashCode", "setUTraceIntentContext", "", "uTraceIntentContext", "Lcom/oplus/utrace/sdk/UTraceContext;", "uTraceIntentContextString", "toString", "toUTraceIntentString", "Companion", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SeedlingIntent {

    @NotNull
    private static final String TAG = "SeedlingIntent";
    private boolean allowUIBackground;

    @RequiresVersionSdk(version = 1002024)
    @Nullable
    private CardBlurHandler cardBlurHandler;
    private int cardSize;

    @NotNull
    private List<Integer> cardSizeList;

    @RequiresVersionSdk(version = 1002054)
    @Nullable
    private String cardUniqueKey;

    @Nullable
    private ArrayMap<String, Object> extraData;

    @RequiresVersionSdk(version = 1000026)
    @Nullable
    private ArrayMap<String, Object> extraDataToEngine;

    @RequiresVersionSdk(version = 1002006)
    @Nullable
    private List<ArrayMap<String, Object>> extraDataToEngineList;

    @Nullable
    private String initData;
    private final boolean isAbnormal;
    private boolean isEntranceTriggerCardClick;
    private boolean isSubscribe;

    @RequiresVersionSdk(version = 1002000)
    @Nullable
    private ServiceInfo originServiceInfo;

    @NotNull
    private String serviceId;
    private long timestamp;

    public SeedlingIntent(@NotNull String str, int i, @NotNull List<Integer> list, @Nullable String str2, boolean z, long j, boolean z2, @Nullable ArrayMap<String, Object> arrayMap, boolean z3, boolean z4, @Nullable ArrayMap<String, Object> arrayMap2, @Nullable List<ArrayMap<String, Object>> list2, @Nullable ServiceInfo serviceInfo, @Nullable CardBlurHandler cardBlurHandler, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(str, "serviceId");
        Intrinsics.checkNotNullParameter(list, "cardSizeList");
        this.serviceId = str;
        this.cardSize = i;
        this.cardSizeList = list;
        this.initData = str2;
        this.allowUIBackground = z;
        this.timestamp = j;
        this.isSubscribe = z2;
        this.extraData = arrayMap;
        this.isAbnormal = z3;
        this.isEntranceTriggerCardClick = z4;
        this.extraDataToEngine = arrayMap2;
        this.extraDataToEngineList = list2;
        this.originServiceInfo = serviceInfo;
        this.cardBlurHandler = cardBlurHandler;
        this.cardUniqueKey = str3;
    }

    @Deprecated(message = "do not use it after fluid cloud version, please use cardSizeList")
    public static /* synthetic */ void getCardSize$annotations() {
    }

    private final String toUTraceIntentString(UTraceContext uTraceContext) {
        return UTraceCompat.INSTANCE.writeToJsonString(uTraceContext);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getServiceId() {
        return this.serviceId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsEntranceTriggerCardClick() {
        return this.isEntranceTriggerCardClick;
    }

    @Nullable
    public final ArrayMap<String, Object> component11() {
        return this.extraDataToEngine;
    }

    @Nullable
    public final List<ArrayMap<String, Object>> component12() {
        return this.extraDataToEngineList;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final ServiceInfo getOriginServiceInfo() {
        return this.originServiceInfo;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final CardBlurHandler getCardBlurHandler() {
        return this.cardBlurHandler;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCardUniqueKey() {
        return this.cardUniqueKey;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCardSize() {
        return this.cardSize;
    }

    @NotNull
    public final List<Integer> component3() {
        return this.cardSizeList;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInitData() {
        return this.initData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getAllowUIBackground() {
        return this.allowUIBackground;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsSubscribe() {
        return this.isSubscribe;
    }

    @Nullable
    public final ArrayMap<String, Object> component8() {
        return this.extraData;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsAbnormal() {
        return this.isAbnormal;
    }

    @NotNull
    public final SeedlingIntent copy(@NotNull String serviceId, int cardSize, @NotNull List<Integer> cardSizeList, @Nullable String initData, boolean allowUIBackground, long timestamp, boolean isSubscribe, @Nullable ArrayMap<String, Object> extraData, boolean isAbnormal, boolean isEntranceTriggerCardClick, @Nullable ArrayMap<String, Object> extraDataToEngine, @Nullable List<ArrayMap<String, Object>> extraDataToEngineList, @Nullable ServiceInfo originServiceInfo, @Nullable CardBlurHandler cardBlurHandler, @Nullable String cardUniqueKey) {
        Intrinsics.checkNotNullParameter(serviceId, "serviceId");
        Intrinsics.checkNotNullParameter(cardSizeList, "cardSizeList");
        return new SeedlingIntent(serviceId, cardSize, cardSizeList, initData, allowUIBackground, timestamp, isSubscribe, extraData, isAbnormal, isEntranceTriggerCardClick, extraDataToEngine, extraDataToEngineList, originServiceInfo, cardBlurHandler, cardUniqueKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeedlingIntent)) {
            return false;
        }
        SeedlingIntent seedlingIntent = (SeedlingIntent) other;
        return Intrinsics.areEqual(this.serviceId, seedlingIntent.serviceId) && this.cardSize == seedlingIntent.cardSize && Intrinsics.areEqual(this.cardSizeList, seedlingIntent.cardSizeList) && Intrinsics.areEqual(this.initData, seedlingIntent.initData) && this.allowUIBackground == seedlingIntent.allowUIBackground && this.timestamp == seedlingIntent.timestamp && this.isSubscribe == seedlingIntent.isSubscribe && Intrinsics.areEqual(this.extraData, seedlingIntent.extraData) && this.isAbnormal == seedlingIntent.isAbnormal && this.isEntranceTriggerCardClick == seedlingIntent.isEntranceTriggerCardClick && Intrinsics.areEqual(this.extraDataToEngine, seedlingIntent.extraDataToEngine) && Intrinsics.areEqual(this.extraDataToEngineList, seedlingIntent.extraDataToEngineList) && Intrinsics.areEqual(this.originServiceInfo, seedlingIntent.originServiceInfo) && Intrinsics.areEqual(this.cardBlurHandler, seedlingIntent.cardBlurHandler) && Intrinsics.areEqual(this.cardUniqueKey, seedlingIntent.cardUniqueKey);
    }

    public final boolean getAllowUIBackground() {
        return this.allowUIBackground;
    }

    @Nullable
    public final CardBlurHandler getCardBlurHandler() {
        return this.cardBlurHandler;
    }

    public final int getCardSize() {
        return this.cardSize;
    }

    @NotNull
    public final List<Integer> getCardSizeList() {
        return this.cardSizeList;
    }

    @Nullable
    public final String getCardUniqueKey() {
        return this.cardUniqueKey;
    }

    @Nullable
    public final ArrayMap<String, Object> getExtraData() {
        return this.extraData;
    }

    @Nullable
    public final ArrayMap<String, Object> getExtraDataToEngine() {
        return this.extraDataToEngine;
    }

    @Nullable
    public final List<ArrayMap<String, Object>> getExtraDataToEngineList() {
        return this.extraDataToEngineList;
    }

    @Nullable
    public final String getInitData() {
        return this.initData;
    }

    @Nullable
    public final ServiceInfo getOriginServiceInfo() {
        return this.originServiceInfo;
    }

    @NotNull
    public final String getServiceId() {
        return this.serviceId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @RequiresVersionSdk(version = 1000030)
    @Nullable
    public final String getUTraceIntentContext() {
        String str = "getUTraceIntentContext,serviceId:" + this.serviceId + ",seedlingIntent:" + hashCode();
        ArrayMap<String, Object> arrayMap = this.extraData;
        if (arrayMap == null) {
            ht9.a.a(s8e.INSTANCE, TAG, str + ",extraData == null", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return null;
        }
        Object obj = arrayMap != null ? arrayMap.get("uTraceIntentContext") : null;
        if (obj instanceof String) {
            ht9.a.d(s8e.INSTANCE, TAG, str + ",uTraceIntentContextString is String", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return (String) obj;
        }
        if (obj instanceof UTraceContext) {
            String uTraceIntentString = toUTraceIntentString((UTraceContext) obj);
            ht9.a.d(s8e.INSTANCE, TAG, str + ",uTraceIntentContextString is UTraceContext,uTraceIntentContextString:" + uTraceIntentString, false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
            return uTraceIntentString;
        }
        ht9.a.a(s8e.INSTANCE, TAG, str + ",else,uTraceIntentContextString type:" + (obj != null ? obj.getClass().getCanonicalName() : null) + ",classLoader:" + (obj != null ? obj.getClass().getClassLoader() : null), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public int hashCode() {
        int iHashCode = ((((this.serviceId.hashCode() * 31) + Integer.hashCode(this.cardSize)) * 31) + this.cardSizeList.hashCode()) * 31;
        String str = this.initData;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.allowUIBackground;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode3 = (((iHashCode2 + r1) * 31) + Long.hashCode(this.timestamp)) * 31;
        boolean z2 = this.isSubscribe;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i = (iHashCode3 + r2) * 31;
        ArrayMap<String, Object> arrayMap = this.extraData;
        int iHashCode4 = (i + (arrayMap == null ? 0 : arrayMap.hashCode())) * 31;
        boolean z3 = this.isAbnormal;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i2 = (iHashCode4 + r3) * 31;
        boolean z4 = this.isEntranceTriggerCardClick;
        int i3 = (i2 + (z4 ? 1 : z4)) * 31;
        ArrayMap<String, Object> arrayMap2 = this.extraDataToEngine;
        int iHashCode5 = (i3 + (arrayMap2 == null ? 0 : arrayMap2.hashCode())) * 31;
        List<ArrayMap<String, Object>> list = this.extraDataToEngineList;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        ServiceInfo serviceInfo = this.originServiceInfo;
        int iHashCode7 = (iHashCode6 + (serviceInfo == null ? 0 : serviceInfo.hashCode())) * 31;
        CardBlurHandler cardBlurHandler = this.cardBlurHandler;
        int iHashCode8 = (iHashCode7 + (cardBlurHandler == null ? 0 : cardBlurHandler.hashCode())) * 31;
        String str2 = this.cardUniqueKey;
        return iHashCode8 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isAbnormal() {
        return this.isAbnormal;
    }

    public final boolean isEntranceTriggerCardClick() {
        return this.isEntranceTriggerCardClick;
    }

    public final boolean isSubscribe() {
        return this.isSubscribe;
    }

    public final void setAllowUIBackground(boolean z) {
        this.allowUIBackground = z;
    }

    public final void setCardBlurHandler(@Nullable CardBlurHandler cardBlurHandler) {
        this.cardBlurHandler = cardBlurHandler;
    }

    public final void setCardSize(int i) {
        this.cardSize = i;
    }

    public final void setCardSizeList(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.cardSizeList = list;
    }

    public final void setCardUniqueKey(@Nullable String str) {
        this.cardUniqueKey = str;
    }

    public final void setEntranceTriggerCardClick(boolean z) {
        this.isEntranceTriggerCardClick = z;
    }

    public final void setExtraData(@Nullable ArrayMap<String, Object> arrayMap) {
        this.extraData = arrayMap;
    }

    public final void setExtraDataToEngine(@Nullable ArrayMap<String, Object> arrayMap) {
        this.extraDataToEngine = arrayMap;
    }

    public final void setExtraDataToEngineList(@Nullable List<ArrayMap<String, Object>> list) {
        this.extraDataToEngineList = list;
    }

    public final void setInitData(@Nullable String str) {
        this.initData = str;
    }

    public final void setOriginServiceInfo(@Nullable ServiceInfo serviceInfo) {
        this.originServiceInfo = serviceInfo;
    }

    public final void setServiceId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serviceId = str;
    }

    public final void setSubscribe(boolean z) {
        this.isSubscribe = z;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    @RequiresVersionSdk(version = 1000030)
    public final void setUTraceIntentContext(@Nullable String uTraceIntentContextString) {
        String str = "setUTraceIntentContext,serviceId:" + this.serviceId + ",seedlingIntent:" + hashCode();
        ht9.a.a(s8e.INSTANCE, TAG, str + ",uTraceIntentContextString == null", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
    }

    @NotNull
    public String toString() {
        String str = this.serviceId;
        int i = this.cardSize;
        List<Integer> list = this.cardSizeList;
        String str2 = this.initData;
        Integer numValueOf = str2 != null ? Integer.valueOf(str2.length()) : null;
        String str3 = this.initData;
        String policyName = str3 != null ? SeedlingIntentKt.getPolicyName(str3) : null;
        boolean z = this.allowUIBackground;
        long j = this.timestamp;
        boolean z2 = this.isSubscribe;
        ArrayMap<String, Object> arrayMap = this.extraData;
        Integer numValueOf2 = arrayMap != null ? Integer.valueOf(arrayMap.size()) : null;
        boolean z3 = this.isAbnormal;
        CardBlurHandler cardBlurHandler = this.cardBlurHandler;
        boolean z4 = this.isEntranceTriggerCardClick;
        ArrayMap<String, Object> arrayMap2 = this.extraDataToEngine;
        Integer numValueOf3 = arrayMap2 != null ? Integer.valueOf(arrayMap2.size()) : null;
        List<ArrayMap<String, Object>> list2 = this.extraDataToEngineList;
        Integer numValueOf4 = list2 != null ? Integer.valueOf(list2.size()) : null;
        ServiceInfo serviceInfo = this.originServiceInfo;
        return "SeedlingIntent[serviceId:" + str + ", cardSize:" + i + ", cardSizeList:" + list + ", initData.length:" + numValueOf + ", policyName:" + policyName + ", allowUIBackground:" + z + ", timestamp:" + j + ", isSubscribe:" + z2 + ", extraData.size:" + numValueOf2 + ", isAbnormal:" + z3 + ", cardBlurHandler:" + cardBlurHandler + ", isEntranceTriggerCardClick:" + z4 + ", extraDataToEngine.size:" + numValueOf3 + ", extraDataToEngineList.size:" + numValueOf4 + ", originServiceInfo:" + (serviceInfo != null ? serviceInfo.getServiceId() : null) + "]";
    }

    @NotNull
    public final String toUTraceIntentString() {
        String str = this.serviceId;
        List<Integer> list = this.cardSizeList;
        long j = this.timestamp;
        boolean z = this.isSubscribe;
        boolean z2 = this.isAbnormal;
        String str2 = this.initData;
        Integer numValueOf = str2 != null ? Integer.valueOf(str2.length()) : null;
        String str3 = this.initData;
        String policyName = str3 != null ? SeedlingIntentKt.getPolicyName(str3) : null;
        ServiceInfo serviceInfo = this.originServiceInfo;
        String serviceId = serviceInfo != null ? serviceInfo.getServiceId() : null;
        ServiceInfo serviceInfo2 = this.originServiceInfo;
        return "SeedlingIntent[serviceId:" + str + ";cardSizeList:" + list + ";timestamp:" + j + ";isSubscribe:" + z + ";isAbnormal:" + z2 + ";initDataSize:" + numValueOf + ";policyName:" + policyName + ";originServiceInfo_id:" + serviceId + ";originServiceInfo_sizeToCardType:" + (serviceInfo2 != null ? serviceInfo2.getSizeToCardType() : null) + ";isEntranceTriggerCardClick:" + this.isEntranceTriggerCardClick + "]";
    }

    @RequiresVersionSdk(version = 1000030)
    public final void setUTraceIntentContext(@Nullable UTraceContext uTraceIntentContext) {
        ht9.a.a(s8e.INSTANCE, TAG, "setUTraceIntentContext,uTraceIntentContext == null", false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
    }

    public /* synthetic */ SeedlingIntent(String str, int i, List list, String str2, boolean z, long j, boolean z2, ArrayMap arrayMap, boolean z3, boolean z4, ArrayMap arrayMap2, List list2, ServiceInfo serviceInfo, CardBlurHandler cardBlurHandler, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, list, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? 0L : j, (i2 & 64) != 0 ? false : z2, (i2 & 128) != 0 ? null : arrayMap, (i2 & 256) != 0 ? false : z3, (i2 & 512) != 0 ? false : z4, (i2 & 1024) != 0 ? null : arrayMap2, (i2 & 2048) != 0 ? null : list2, (i2 & 4096) != 0 ? null : serviceInfo, (i2 & 8192) != 0 ? null : cardBlurHandler, (i2 & 16384) != 0 ? null : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeedlingIntent(@NotNull String str, int i, @Nullable String str2, boolean z, long j) {
        this(str, i, CollectionsKt.emptyList(), str2, z, j, false, null, false, false, null, null, null, null, null, 32512, null);
        Intrinsics.checkNotNullParameter(str, "serviceId");
    }
}
