package com.oplus.pantanal.seedling.client;

import android.content.Context;
import android.os.Build;
import com.oplus.channel.client.ClientChannel;
import com.oplus.channel.client.ClientProxy;
import com.oplus.channel.client.IClient;
import com.oplus.os.OplusBuild;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.bean.SeedlingCardAction;
import com.oplus.pantanal.seedling.bean.SeedlingCardEvent;
import com.oplus.pantanal.seedling.bean.SeedlingHostEnum;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pantanal.seedling.convertor.ByteArrayToCardEventConvertor;
import com.oplus.pantanal.seedling.convertor.ConvertorFactory;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardConvertor;
import com.oplus.pantanal.seedling.convertor.WidgetCodeToSeedlingCardConvertor;
import com.oplus.pantanal.seedling.event.ISeedlingEventProcessor;
import com.oplus.pantanal.seedling.observer.ISeedlingCardObserver;
import com.oplus.pantanal.seedling.update.ISeedlingDataProcessor;
import com.oplus.pantanal.seedling.update.SeedlingCardActionParser;
import com.oplus.pantanal.seedling.update.SeedlingUpdateManager;
import com.oplus.pantanal.seedling.util.CardDataTranslaterKt;
import com.oplus.pantanal.seedling.util.ExtsKt;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.pantanal.seedling.util.NamePrefixedThreadFactory;
import com.oplus.pantanal.seedling.util.UtilsKt;
import com.oplus.pantanal.seedling.utrace.ITraceNode;
import com.oplus.pantanal.seedling.utrace.TraceNodeHelper;
import com.oplus.pantanal.seedling.utrace.UTraceWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 :2\u00020\u0001:\u00029:BG\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u000eH\u0002J\u0016\u0010'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J=\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010\u001f2!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b.\u0012\b\b\u0004\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020(0-H\u0016J0\u00100\u001a\u00020(2&\u00101\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001f02j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001f`3H\u0016J\u0006\u00104\u001a\u00020(J\u0010\u00105\u001a\u00020(2\u0006\u00106\u001a\u00020\u001fH\u0016J3\u00107\u001a\u00020(2\u0006\u00106\u001a\u00020\u001f2!\u0010,\u001a\u001d\u0012\u0013\u0012\u00110\u001f¢\u0006\f\b.\u0012\b\b\u0004\u0012\u0004\b\b(/\u0012\u0004\u0012\u00020(0-H\u0016J\u0010\u00108\u001a\u00020(2\u0006\u0010+\u001a\u00020\u0005H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0012\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006;"}, d2 = {"Lcom/oplus/pantanal/seedling/client/SeedlingClient;", "Lcom/oplus/channel/client/IClient;", "context", "Landroid/content/Context;", "name", "", "lifecycleProcessor", "Lcom/oplus/pantanal/seedling/event/ISeedlingEventProcessor;", "dataProcessor", "Lcom/oplus/pantanal/seedling/update/ISeedlingDataProcessor;", "cardObserver", "Lcom/oplus/pantanal/seedling/observer/ISeedlingCardObserver;", "superChannelHostSet", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingHostEnum;", "(Landroid/content/Context;Ljava/lang/String;Lcom/oplus/pantanal/seedling/event/ISeedlingEventProcessor;Lcom/oplus/pantanal/seedling/update/ISeedlingDataProcessor;Lcom/oplus/pantanal/seedling/observer/ISeedlingCardObserver;Ljava/util/Set;)V", "getContext", "()Landroid/content/Context;", "mCardExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getMCardExecutor", "()Ljava/util/concurrent/ExecutorService;", "mCardExecutor$delegate", "Lkotlin/Lazy;", "getName", "()Ljava/lang/String;", "buildSeedlingCard", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "widgetCode", "data", "", "checkIsAboveOSVersion14", "", "getRequestActionIdentify", "Lcom/oplus/channel/client/ClientProxy$ActionIdentify;", "params", "getSuperClientName", "host", "initSupperChannelClient", "", "hostSet", "observe", "observeResStr", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "observeData", "observes", "ids", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "onDestroy", "request", "requestData", "requestOnce", "unObserve", "Builder", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSeedlingClient.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SeedlingClient.kt\ncom/oplus/pantanal/seedling/client/SeedlingClient\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,321:1\n1855#2,2:322\n*S KotlinDebug\n*F\n+ 1 SeedlingClient.kt\ncom/oplus/pantanal/seedling/client/SeedlingClient\n*L\n119#1:322,2\n*E\n"})
public final class SeedlingClient implements IClient {
    public static final int ALLOW_TRACE_DATA = 1;

    @NotNull
    private static final String CARD_EXECUTOR_NAME = "SeedlingSupportCardExecutor";
    public static final int NOT_ALLOW_TRACE_DATA = 0;

    @NotNull
    private static final String SUPER_CLIENT_NAME_SPLIT = "_";

    @Nullable
    private final ISeedlingCardObserver cardObserver;

    @NotNull
    private final Context context;

    @Nullable
    private final ISeedlingEventProcessor lifecycleProcessor;

    @NotNull
    private final Lazy mCardExecutor$delegate;

    @NotNull
    private final String name;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\u0019\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/oplus/pantanal/seedling/client/SeedlingClient$Builder;", "", "context", "Landroid/content/Context;", "name", "", "(Landroid/content/Context;Ljava/lang/String;)V", "actionProcessor", "Lcom/oplus/pantanal/seedling/event/ISeedlingEventProcessor;", "cardObserver", "Lcom/oplus/pantanal/seedling/observer/ISeedlingCardObserver;", "getContext", "()Landroid/content/Context;", "dataProcessor", "Lcom/oplus/pantanal/seedling/update/ISeedlingDataProcessor;", "hostSet", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingHostEnum;", "getName", "()Ljava/lang/String;", "build", "Lcom/oplus/pantanal/seedling/client/SeedlingClient;", "setSeedlingCardObserver", "setSeedlingDataProcessor", "setSeedlingEventProcessor", "setSuperChannelHost", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {

        @Nullable
        private ISeedlingEventProcessor actionProcessor;

        @Nullable
        private ISeedlingCardObserver cardObserver;

        @NotNull
        private final Context context;

        @Nullable
        private ISeedlingDataProcessor dataProcessor;

        @Nullable
        private Set<? extends SeedlingHostEnum> hostSet;

        @NotNull
        private final String name;

        public Builder(@NotNull Context context, @NotNull String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(str, "name");
            this.context = context;
            this.name = str;
        }

        @NotNull
        public final SeedlingClient build() {
            return new SeedlingClient(this.context, this.name, this.actionProcessor, this.dataProcessor, this.cardObserver, this.hostSet, null);
        }

        @NotNull
        public final Context getContext() {
            return this.context;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Builder setSeedlingCardObserver(@NotNull ISeedlingCardObserver cardObserver) {
            Intrinsics.checkNotNullParameter(cardObserver, "cardObserver");
            this.cardObserver = cardObserver;
            return this;
        }

        @NotNull
        public final Builder setSeedlingDataProcessor(@NotNull ISeedlingDataProcessor dataProcessor) {
            Intrinsics.checkNotNullParameter(dataProcessor, "dataProcessor");
            this.dataProcessor = dataProcessor;
            return this;
        }

        @NotNull
        public final Builder setSeedlingEventProcessor(@NotNull ISeedlingEventProcessor actionProcessor) {
            Intrinsics.checkNotNullParameter(actionProcessor, "actionProcessor");
            this.actionProcessor = actionProcessor;
            return this;
        }

        @NotNull
        public final Builder setSuperChannelHost(@NotNull Set<? extends SeedlingHostEnum> hostSet) {
            Intrinsics.checkNotNullParameter(hostSet, "hostSet");
            this.hostSet = hostSet;
            Logger.INSTANCE.i(Constants.TAG, "setSuperChannelHost:" + hostSet);
            return this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x008d  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x008d, please report this as an issue */
    private SeedlingClient(Context context, String str, ISeedlingEventProcessor iSeedlingEventProcessor, ISeedlingDataProcessor iSeedlingDataProcessor, ISeedlingCardObserver iSeedlingCardObserver, Set<? extends SeedlingHostEnum> set) {
        Object obj;
        Throwable th;
        this.context = context;
        this.name = str;
        this.lifecycleProcessor = iSeedlingEventProcessor;
        this.cardObserver = iSeedlingCardObserver;
        this.mCardExecutor$delegate = LazyKt.lazy(new Function0<ExecutorService>() { // from class: com.oplus.pantanal.seedling.client.SeedlingClient$mCardExecutor$2
            public final ExecutorService invoke() {
                return Executors.newSingleThreadExecutor(new NamePrefixedThreadFactory("SeedlingSupportCardExecutor"));
            }
        });
        Logger logger = Logger.INSTANCE;
        logger.i(Constants.TAG, "init:clientName = " + str + "init:sdk_version = manual_3000007");
        try {
            Result.Companion companion = Result.Companion;
            boolean zCheckIsAboveOSVersion14 = checkIsAboveOSVersion14();
            UTraceWrapper.INSTANCE.init(context, zCheckIsAboveOSVersion14);
            UtilsKt.syncIsDebug(context);
            if (iSeedlingDataProcessor != null) {
                SeedlingUpdateManager.INSTANCE.getINSTANCE().init$seedling_support_manualRelease(iSeedlingDataProcessor);
            }
            ClientChannel clientChannel = ClientChannel.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            Unit unit = null;
            ClientChannel.initClientChannel$default(clientChannel, applicationContext, (ExecutorService) null, 2, (Object) null);
            if (zCheckIsAboveOSVersion14) {
                logger.i(Constants.TAG, "initClientImpl by UMS");
                clientChannel.initClientImpl(Constants.UMS_CARD_SERVICE_AUTHORITY, str, this);
                if (set != null) {
                    initSupperChannelClient(set);
                }
                obj = Result.constructor-impl(unit);
                th = Result.exceptionOrNull-impl(obj);
                if (th != null) {
                    Logger.INSTANCE.e(Constants.TAG, "SeedlingClient.init error = " + th.getMessage());
                }
            }
            logger.i(Constants.TAG, "initClientImpl by ASSISTANT");
            clientChannel.initClientImpl(Constants.ASSISTANT_SCREEN_CARD_SERVICE_AUTHORITY, str, this);
            unit = Unit.INSTANCE;
            obj = Result.constructor-impl(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th2));
        }
        th = Result.exceptionOrNull-impl(obj);
        if (th != null) {
            Logger.INSTANCE.e(Constants.TAG, "SeedlingClient.init error = " + th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0087  */
    public final SeedlingCard buildSeedlingCard(String widgetCode, byte[] data) {
        String str;
        if (data != null) {
            JSONObject jSONObject = new JSONObject(new String(data, Charsets.UTF_8));
            Logger.INSTANCE.i(Constants.TAG, "buildSeedlingCard jsonObject = " + jSONObject);
            String strOptString = jSONObject.optString("service_id");
            int iOptInt = jSONObject.optInt("card_size");
            int iOptInt2 = jSONObject.optInt(JsonToSeedlingCardConvertor.KEY_SUBSCRIBE_TYPE);
            int iOptInt3 = jSONObject.optInt(JsonToSeedlingCardConvertor.KEY_SEEDLING_ENTRANCE);
            String strOptString2 = jSONObject.optString(JsonToSeedlingCardConvertor.KEY_PAGE_ID);
            long jOptLong = jSONObject.optLong(JsonToSeedlingCardConvertor.KEY_UPK_VERSION_CODE);
            String strOptString3 = jSONObject.optString("service_instance_id");
            String str2 = widgetCode + WidgetCodeToSeedlingCardConvertor.CARD_SPLIT;
            Intrinsics.checkNotNull(strOptString);
            Integer numValueOf = Integer.valueOf(iOptInt2);
            Integer numValueOf2 = Integer.valueOf(iOptInt);
            Integer numValueOf3 = Integer.valueOf(iOptInt3);
            Intrinsics.checkNotNull(strOptString2);
            Long lValueOf = Long.valueOf(jOptLong);
            Intrinsics.checkNotNull(strOptString3);
            str = ExtsKt.format(str2, WidgetCodeToSeedlingCardConvertor.CARD_SPLIT, strOptString, numValueOf, numValueOf2, numValueOf3, strOptString2, lValueOf, strOptString3);
            if (str == null) {
                str = widgetCode;
            }
        } else {
            str = widgetCode;
        }
        Logger.INSTANCE.i(Constants.TAG, "buildSeedlingCard, widgetCode = " + widgetCode + " seedlingCardId = " + ((Object) str));
        return SeedlingCard.INSTANCE.build(str);
    }

    private final boolean checkIsAboveOSVersion14() {
        boolean z;
        Object obj;
        boolean z2;
        try {
            Result.Companion companion = Result.Companion;
            z2 = Build.VERSION.SDK_INT >= 33 && OplusBuild.VERSION.SDK_VERSION >= 30;
            try {
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                z = z2;
                th = th;
                Result.Companion companion2 = Result.Companion;
                boolean z3 = z;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
                z2 = z3;
            }
        } catch (Throwable th2) {
            th = th2;
            z = false;
        }
        Throwable th3 = Result.exceptionOrNull-impl(obj);
        if (th3 == null) {
            return z2;
        }
        Logger.INSTANCE.e(Constants.TAG, "checkIsAboveOSVersion14 error," + th3.getMessage());
        return false;
    }

    private final ExecutorService getMCardExecutor() {
        return (ExecutorService) this.mCardExecutor$delegate.getValue();
    }

    private final String getSuperClientName(SeedlingHostEnum host) {
        String str = this.name + SUPER_CLIENT_NAME_SPLIT + host.getHostId();
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return str;
    }

    private final void initSupperChannelClient(Set<? extends SeedlingHostEnum> hostSet) {
        for (SeedlingHostEnum seedlingHostEnum : hostSet) {
            ClientChannel.INSTANCE.initClientImpl(seedlingHostEnum.getProviderAuthority$seedling_support_manualRelease(), getSuperClientName(seedlingHostEnum), this);
        }
        Logger.INSTANCE.i(Constants.TAG, "initSupperChannelClient hostSet: " + hostSet);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public ClientProxy.ActionIdentify getRequestActionIdentify(@NotNull byte[] params) {
        String str;
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            Result.Companion companion = Result.Companion;
            SeedlingCardAction seedlingCardAction = SeedlingCardActionParser.INSTANCE.parse(new JSONObject(new String(params, Charsets.UTF_8)));
            Logger.INSTANCE.d(Constants.TAG, "Json onDecode data size is " + params.length + " action is: " + seedlingCardAction);
            String widgetCode = seedlingCardAction.getWidgetCode();
            String strValueOf = String.valueOf(CardDataTranslaterKt.getCardType(widgetCode));
            String strValueOf2 = String.valueOf(CardDataTranslaterKt.getCardId(widgetCode));
            String strValueOf3 = String.valueOf(CardDataTranslaterKt.getHostId(widgetCode));
            Map<String, String> param = seedlingCardAction.getParam();
            if (param == null || (str = param.get("life_circle")) == null) {
                str = "";
            }
            return new ClientProxy.ActionIdentify(strValueOf, strValueOf2, strValueOf3, str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 != null) {
                Logger.INSTANCE.e(Constants.TAG, "onDecode has error:" + th2.getMessage());
            }
            return new ClientProxy.ActionIdentify("", "", "", "");
        }
    }

    public void observe(@NotNull String observeResStr, @Nullable byte[] params, @NotNull Function1<? super byte[], Unit> callback) {
        Object obj;
        boolean zOptBoolean;
        String strStartNodeTrace$default;
        Intrinsics.checkNotNullParameter(observeResStr, "observeResStr");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            Result.Companion companion = Result.Companion;
            JSONObject jSONObject = new JSONObject();
            if (params != null) {
                jSONObject = new JSONObject(new String(params, Charsets.UTF_8));
                zOptBoolean = jSONObject.optBoolean(Constants.SUPPORT_SUPER_CHANNEL);
                String strOptString = jSONObject.optString("SecondTermTraceContext");
                Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
                strStartNodeTrace$default = ITraceNode.startNodeTrace$default(TraceNodeHelper.INSTANCE, strOptString, TraceConstants.NODE_CARD_OBSERVE, (Map) null, 4, (Object) null);
            } else {
                zOptBoolean = false;
                strStartNodeTrace$default = "";
            }
            Logger.INSTANCE.i(Constants.TAG, "observe observeResStr= " + observeResStr + ",supportSuperChannel=" + zOptBoolean + ",params=" + jSONObject);
            if (zOptBoolean) {
                SeedlingUpdateManager.INSTANCE.getINSTANCE().observeSuperChannel$seedling_support_manualRelease(observeResStr, callback);
            } else {
                SeedlingUpdateManager.INSTANCE.getINSTANCE().observe$seedling_support_manualRelease(observeResStr, callback);
            }
            TraceNodeHelper.INSTANCE.endNodeTrace(strStartNodeTrace$default, true);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            String str = params != null ? new String(params, Charsets.UTF_8) : "";
            Logger.INSTANCE.e(Constants.TAG, "observe observeResStr has error." + observeResStr + ",params=" + ((Object) str));
        }
    }

    public void observes(@NotNull final HashMap<String, byte[]> ids) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Logger.INSTANCE.i(Constants.TAG, "observes = " + ids.size());
        ExecutorService mCardExecutor = getMCardExecutor();
        Intrinsics.checkNotNullExpressionValue(mCardExecutor, "<get-mCardExecutor>(...)");
        ExtsKt.runOnThread(this, mCardExecutor, new Function1<SeedlingClient, Unit>() { // from class: com.oplus.pantanal.seedling.client.SeedlingClient.observes.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SeedlingClient) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SeedlingClient seedlingClient) {
                Intrinsics.checkNotNullParameter(seedlingClient, "$this$runOnThread");
                ISeedlingCardObserver iSeedlingCardObserver = seedlingClient.cardObserver;
                if (iSeedlingCardObserver != null) {
                    Context context = seedlingClient.getContext();
                    String name = seedlingClient.getName();
                    HashMap<String, byte[]> map = ids;
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                        SeedlingCard seedlingCardBuildSeedlingCard = seedlingClient.buildSeedlingCard(entry.getKey(), entry.getValue());
                        seedlingCardBuildSeedlingCard.setClientName$seedling_support_manualRelease(seedlingClient.getName());
                        arrayList.add(seedlingCardBuildSeedlingCard);
                    }
                    iSeedlingCardObserver.onCardObserve(context, name, arrayList);
                }
            }
        });
    }

    public final void onDestroy() {
        SeedlingUpdateManager.INSTANCE.getINSTANCE().onDestroy$seedling_support_manualRelease();
        if (getMCardExecutor().isShutdown()) {
            return;
        }
        getMCardExecutor().shutdown();
    }

    public void replaceObserve(@NotNull String str, @Nullable byte[] bArr, @NotNull Function1<? super byte[], Unit> function1) {
        IClient.DefaultImpls.replaceObserve(this, str, bArr, function1);
    }

    public void request(@NotNull final byte[] requestData) {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        ExecutorService mCardExecutor = getMCardExecutor();
        Intrinsics.checkNotNullExpressionValue(mCardExecutor, "<get-mCardExecutor>(...)");
        ExtsKt.runOnThread(this, mCardExecutor, new Function1<SeedlingClient, Unit>() { // from class: com.oplus.pantanal.seedling.client.SeedlingClient.request.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((SeedlingClient) obj);
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull SeedlingClient seedlingClient) {
                Intrinsics.checkNotNullParameter(seedlingClient, "$this$runOnThread");
                Logger.INSTANCE.i(Constants.TAG, "CardExecutor: request,data:" + requestData.length);
                SeedlingCardEvent seedlingCardEvent = (SeedlingCardEvent) ConvertorFactory.INSTANCE.get(ByteArrayToCardEventConvertor.class).to(requestData);
                seedlingCardEvent.getCard().setClientName$seedling_support_manualRelease(seedlingClient.getName());
                ISeedlingEventProcessor iSeedlingEventProcessor = seedlingClient.lifecycleProcessor;
                if (iSeedlingEventProcessor != null) {
                    iSeedlingEventProcessor.handleEvent(seedlingClient.getContext(), seedlingCardEvent);
                }
            }
        });
    }

    public void requestOnce(@NotNull byte[] requestData, @NotNull Function1<? super byte[], Unit> callback) {
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public void unObserve(@NotNull String observeResStr) {
        Intrinsics.checkNotNullParameter(observeResStr, "observeResStr");
        Logger.INSTANCE.i(Constants.TAG, "unObserve observeResStr= " + observeResStr);
        SeedlingUpdateManager.Companion companion = SeedlingUpdateManager.INSTANCE;
        companion.getINSTANCE().unObserve$seedling_support_manualRelease(observeResStr);
        companion.getINSTANCE().unObserveSuperChannel$seedling_support_manualRelease(observeResStr);
        companion.getINSTANCE().getMCardCache().removeCardByWidgetCode(observeResStr);
    }

    public /* synthetic */ SeedlingClient(Context context, String str, ISeedlingEventProcessor iSeedlingEventProcessor, ISeedlingDataProcessor iSeedlingDataProcessor, ISeedlingCardObserver iSeedlingCardObserver, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, iSeedlingEventProcessor, iSeedlingDataProcessor, iSeedlingCardObserver, (i & 32) != 0 ? null : set);
    }

    @Deprecated(message = "it is replace with fun observes(ids: HashMap<String, ByteArray?>)")
    public void observes(@NotNull List<String> list) {
        IClient.DefaultImpls.observes(this, list);
    }

    public /* synthetic */ SeedlingClient(Context context, String str, ISeedlingEventProcessor iSeedlingEventProcessor, ISeedlingDataProcessor iSeedlingDataProcessor, ISeedlingCardObserver iSeedlingCardObserver, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, iSeedlingEventProcessor, iSeedlingDataProcessor, iSeedlingCardObserver, set);
    }
}
