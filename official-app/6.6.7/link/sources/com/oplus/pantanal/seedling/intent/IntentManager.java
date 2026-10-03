package com.oplus.pantanal.seedling.intent;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.oplus.channel.client.utils.LogUtil;
import com.oplus.pantanal.seedling.bean.SeedlingIntent;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pantanal.seedling.convertor.ConvertorFactory;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import com.oplus.pantanal.seedling.util.ExtsKt;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.pantanal.seedling.utrace.ITraceNode;
import com.oplus.pantanal.seedling.utrace.IntentManagerWrapper;
import com.oplus.pantanal.seedling.utrace.TraceNodeHelper;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplusos.sau.common.utils.SauAarConstants;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J%\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0000¢\u0006\u0002\b\u0014J<\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J0\u0010\u001d\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020 J\b\u0010!\u001a\u00020\u0004H\u0002J\b\u0010\"\u001a\u00020\u0006H\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0002J!\u0010%\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\u0010&\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0002\u0010'J\u0015\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\nH\u0000¢\u0006\u0002\b*J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u0010H\u0002J\u0015\u0010-\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0010H\u0000¢\u0006\u0002\b.J\u001b\u0010/\u001a\u00020\n2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001001H\u0000¢\u0006\u0002\b2J\u0010\u00103\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0015\u00104\u001a\u00020\n2\u0006\u00105\u001a\u00020 H\u0000¢\u0006\u0002\b6J \u00107\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\u0006\u00108\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\fJ#\u00109\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\n0;H\u0016¢\u0006\u0002\u0010<J(\u0010=\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\fH\u0002J\"\u0010>\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0016J\u001e\u0010?\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00122\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001001H\u0016J\u0010\u0010@\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/oplus/pantanal/seedling/intent/IntentManager;", "Lcom/oplus/pantanal/seedling/intent/IIntentManager;", "()V", "callBackBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "resultCallBackMessenger", "Landroid/os/Messenger;", "addIntentResultCallBack", "", Node.I_KEY, "", "value", "Lcom/oplus/pantanal/seedling/intent/IIntentResultCallBack;", "buildCallBackPendingIntent", "Landroid/app/PendingIntent;", "seedlingIntent", "Lcom/oplus/pantanal/seedling/bean/SeedlingIntent;", "context", "Landroid/content/Context;", "callBack", "buildCallBackPendingIntent$seedling_support_manualRelease", "callBackToUser", "resultCode", "", "callBackKey", "action", "flag", "timeStamp", "", "createCallBackAndRegisterListener", TraceConstants.KEY_ACTION, "intentManager", "Landroid/os/Bundle;", "createResultCallBackBroadCastReceiver", "createResultCallBackMessenger", "getBooleanMetaValue", "", "getCallBackMapKey", "tag", "(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;", "getIntentBundleValues", "intentJson", "getIntentBundleValues$seedling_support_manualRelease", "intentToJson", "Lorg/json/JSONObject;", "intentToJsonString", "intentToJsonString$seedling_support_manualRelease", "intentsToJsonString", "intents", "", "intentsToJsonString$seedling_support_manualRelease", "isSupportNewMessenger", "logMessage", "it", "logMessage$seedling_support_manualRelease", "registerCallBackListener", IntentManager.KEY_TIMESTAMP, "registerResultCallBack", "actions", "", "(Landroid/content/Context;[Ljava/lang/String;)V", "sendResultCodeCallBack", "sendSeedling", "sendSeedlings", "unRegisterResultCallBack", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIntentManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentManager.kt\ncom/oplus/pantanal/seedling/intent/IntentManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,519:1\n1#2:520\n*E\n"})
public final class IntentManager implements IIntentManager {

    @NotNull
    private static final String AUTHORITIES = "com.oplus.pantanal.ums.IntentProvider";
    private static final int CACHE_TIME_DURING = 10000;
    public static final int INTENT_REQUEST_CODE = 0;

    @NotNull
    private static final String KEY_ACTION = "action";

    @NotNull
    public static final String KEY_CALL_RESULT = "result";

    @NotNull
    private static final String KEY_CARD_OPTIONS = "card_options";

    @NotNull
    private static final String KEY_DATA = "data";

    @NotNull
    private static final String KEY_FLAG = "flag";

    @NotNull
    private static final String KEY_INSTANCE_ID = "instance_id";

    @NotNull
    public static final String KEY_INTENT_VALUE = "intentValue";

    @NotNull
    private static final String KEY_IS_SUPPORT_MULTI_INSTANCE = "isSupportMultiInstance";

    @NotNull
    private static final String KEY_META_SUPPORT_MESSENGER = "isSupportMessenger";

    @NotNull
    private static final String KEY_OPTIONS = "options";

    @NotNull
    public static final String KEY_RESULT_CALLBACK_INTENT = "result_callback";

    @NotNull
    public static final String KEY_RESULT_CODE = "resultCode";

    @NotNull
    private static final String KEY_SERVICE_INSTANCE_ID = "serviceInstanceId";

    @NotNull
    private static final String KEY_TIMESTAMP = "timestamp";
    public static final int METHOD_INTENT_ERROR = 0;
    private static final int RECEIVE_DECISION_RESULT_CALLBACK = 0;

    @NotNull
    public static final String START_INTENTS = "content://com.oplus.pantanal.ums.IntentProvider";

    @NotNull
    public static final String START_INTENTS_METHOD = "start_intents";

    @Nullable
    private static Long lastCacheTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, IIntentResultCallBack> callBackResultMap = new ConcurrentHashMap<>();

    @NotNull
    private static final Lazy<IntentManager> INSTANCE$delegate = LazyKt.lazy(new Function0<IntentManager>() { // from class: com.oplus.pantanal.seedling.intent.IntentManager$Companion$INSTANCE$2
        @NotNull
        public final IntentManager invoke() {
            return new IntentManager();
        }
    });

    @Nullable
    private Messenger resultCallBackMessenger = createResultCallBackMessenger();

    @Nullable
    private BroadcastReceiver callBackBroadcastReceiver = createResultCallBackBroadCastReceiver();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u000e\u0010\r\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0004\n\u0002\u0010%¨\u0006&"}, d2 = {"Lcom/oplus/pantanal/seedling/intent/IntentManager$Companion;", "", "()V", "AUTHORITIES", "", "CACHE_TIME_DURING", "", "INSTANCE", "Lcom/oplus/pantanal/seedling/intent/IntentManager;", "getINSTANCE", "()Lcom/oplus/pantanal/seedling/intent/IntentManager;", "INSTANCE$delegate", "Lkotlin/Lazy;", "INTENT_REQUEST_CODE", "KEY_ACTION", "KEY_CALL_RESULT", "KEY_CARD_OPTIONS", "KEY_DATA", "KEY_FLAG", "KEY_INSTANCE_ID", "KEY_INTENT_VALUE", "KEY_IS_SUPPORT_MULTI_INSTANCE", "KEY_META_SUPPORT_MESSENGER", "KEY_OPTIONS", "KEY_RESULT_CALLBACK_INTENT", "KEY_RESULT_CODE", "KEY_SERVICE_INSTANCE_ID", "KEY_TIMESTAMP", "METHOD_INTENT_ERROR", "RECEIVE_DECISION_RESULT_CALLBACK", "START_INTENTS", "START_INTENTS_METHOD", "callBackResultMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/oplus/pantanal/seedling/intent/IIntentResultCallBack;", "lastCacheTime", "", "Ljava/lang/Long;", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntentManager getINSTANCE() {
            return (IntentManager) IntentManager.INSTANCE$delegate.getValue();
        }
    }

    private final void addIntentResultCallBack(String key, IIntentResultCallBack value) {
        callBackResultMap.put(key, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callBackToUser(int resultCode, String callBackKey, IIntentResultCallBack callBack, String action, int flag, long timeStamp) {
        String str;
        Unit unit;
        Logger logger = Logger.INSTANCE;
        ConcurrentHashMap<String, IIntentResultCallBack> concurrentHashMap = callBackResultMap;
        logger.i(Constants.TAG, "callBackToUser: resultCode = " + resultCode + ",key = " + callBackKey + ",callBackMap = " + concurrentHashMap);
        if (callBack != null) {
            if (action != null) {
                sendResultCodeCallBack(action, flag, resultCode, callBack);
                if (concurrentHashMap.containsKey(callBackKey)) {
                    concurrentHashMap.remove(callBackKey);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            } else {
                str = "createCallBack: action = null";
            }
        } else {
            str = "createCallBack: callBack = null,key = " + callBackKey + ",timestamp=" + timeStamp + ",flag=" + flag + ",map = " + concurrentHashMap;
        }
        logger.i(Constants.TAG, str);
    }

    private final BroadcastReceiver createResultCallBackBroadCastReceiver() {
        return new BroadcastReceiver() { // from class: com.oplus.pantanal.seedling.intent.IntentManager.createResultCallBackBroadCastReceiver.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@Nullable Context context, @Nullable Intent intent) {
                PushAutoTrackHelper.onBroadcastReceiver(this, context, intent);
                Logger logger = Logger.INSTANCE;
                logger.d(Constants.TAG, "onReceive: " + intent);
                if (intent != null) {
                    IntentManager intentManager = IntentManager.this;
                    String stringExtra = intent.getStringExtra(TraceConstants.KEY_TRACE_CONTEXT);
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    String str = stringExtra;
                    Intrinsics.checkNotNull(str);
                    TraceNodeHelper traceNodeHelper = TraceNodeHelper.INSTANCE;
                    String strStartNodeTrace$default = ITraceNode.startNodeTrace$default(traceNodeHelper, str, TraceNodeHelper.CODE_INTENT_RESULT, (Map) null, 4, (Object) null);
                    long longExtra = intent.getLongExtra(IntentManager.KEY_TIMESTAMP, 0L);
                    int intExtra = intent.getIntExtra("flag", 0);
                    String callBackMapKey = intentManager.getCallBackMapKey(intent.getAction(), Long.valueOf(longExtra));
                    IIntentResultCallBack iIntentResultCallBack = (IIntentResultCallBack) IntentManager.callBackResultMap.getOrDefault(callBackMapKey, null);
                    int resultCode = getResultCode();
                    logger.i(Constants.TAG, "createResultCallBackBroadCastReceiver,call back to user.action=" + intent.getAction() + ",flag=" + intExtra);
                    intentManager.callBackToUser(resultCode, callBackMapKey, iIntentResultCallBack, intent.getAction(), intExtra, longExtra);
                    traceNodeHelper.endCompleteNodeTrace(resultCode, intExtra, strStartNodeTrace$default);
                }
            }
        };
    }

    private final Messenger createResultCallBackMessenger() {
        return new Messenger(new Handler(Looper.getMainLooper()) { // from class: com.oplus.pantanal.seedling.intent.IntentManager.createResultCallBackMessenger.1
            @Override // android.os.Handler
            public void handleMessage(@NotNull Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                int i = msg.what;
                if (i != 0) {
                    Logger.INSTANCE.e(Constants.TAG, "createResultCallBackMessenger,current msg not supported,msg.what=" + i);
                    return;
                }
                TraceNodeHelper traceNodeHelper = TraceNodeHelper.INSTANCE;
                Bundle data = msg.getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                String strStartNodeTrace$default = ITraceNode.startNodeTrace$default(traceNodeHelper, data, TraceNodeHelper.CODE_INTENT_RESULT, (Map) null, 4, (Object) null);
                Bundle data2 = msg.getData();
                String string = data2.getString("action", null);
                long j = data2.getLong(IntentManager.KEY_TIMESTAMP, 0L);
                int i2 = data2.getInt("flag", 0);
                String callBackMapKey = IntentManager.this.getCallBackMapKey(data2.getString("action"), Long.valueOf(j));
                IIntentResultCallBack iIntentResultCallBack = (IIntentResultCallBack) IntentManager.callBackResultMap.getOrDefault(callBackMapKey, null);
                int i3 = data2.getInt("resultCode");
                Logger.INSTANCE.i(Constants.TAG, "createResultCallBackMessenger,call back to user.action=" + string + ",flag=" + i2);
                IntentManager.this.callBackToUser(i3, callBackMapKey, iIntentResultCallBack, string, i2, j);
                traceNodeHelper.endCompleteNodeTrace(i3, i2, strStartNodeTrace$default);
            }
        });
    }

    private final boolean getBooleanMetaValue(Context context, String key) {
        Object obj;
        boolean z = false;
        try {
            Result.Companion companion = Result.Companion;
            z = context.getPackageManager().getApplicationInfo("com.oplus.pantanal.ums", 128).metaData.getBoolean(key);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, "getBooleanMetaValue error:" + th2);
        }
        Logger.INSTANCE.i(Constants.TAG, "getBooleanMetaValue, key = " + key + ", value = " + z);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getCallBackMapKey(String action, Long tag) {
        return action + "_" + tag;
    }

    private final JSONObject intentToJson(SeedlingIntent intent) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_TIMESTAMP, intent.getTimestamp());
        jSONObject.put("action", intent.getAction());
        jSONObject.put("flag", intent.getFlag().getFlag());
        jSONObject.put("data", intent.getData());
        jSONObject.put(KEY_OPTIONS, intent.getOptions());
        jSONObject.put(KEY_INSTANCE_ID, intent.getTimestamp());
        jSONObject.put(KEY_SERVICE_INSTANCE_ID, intent.getServiceInstanceId());
        jSONObject.put("isSupportMultiInstance", intent.getIsSupportMultiInstance());
        if (intent.getCardOptions() != null) {
            jSONObject.put(KEY_CARD_OPTIONS, (JSONObject) ConvertorFactory.INSTANCE.get(JsonToSeedlingCardOptionsConvertor.class).from(intent.getCardOptions()));
        }
        return jSONObject;
    }

    private final boolean isSupportNewMessenger(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = lastCacheTime;
        if (l != null && Math.abs(jCurrentTimeMillis - l.longValue()) < 10000) {
            Logger.INSTANCE.i(Constants.TAG, "isSupportNewMessenger true, lastCacheTime=" + lastCacheTime);
            return true;
        }
        boolean booleanMetaValue = getBooleanMetaValue(context, KEY_META_SUPPORT_MESSENGER);
        if (booleanMetaValue) {
            lastCacheTime = Long.valueOf(jCurrentTimeMillis);
        }
        Logger.INSTANCE.i(Constants.TAG, "isSupportNewMessenger = " + booleanMetaValue);
        return booleanMetaValue;
    }

    private final void sendResultCodeCallBack(String action, int flag, int resultCode, IIntentResultCallBack callBack) {
        boolean z = true;
        if (resultCode != 0 && (resultCode == 1 || resultCode != 2)) {
            z = false;
        }
        callBack.onIntentResult(action, flag, z);
        LogUtil.i(Constants.TAG, "createCallBack,action = " + action + ",flag=" + flag + ",resultCode=" + resultCode);
        callBack.onIntentResultCodeCallBack(action, flag, resultCode);
    }

    @NotNull
    public final PendingIntent buildCallBackPendingIntent$seedling_support_manualRelease(@NotNull SeedlingIntent seedlingIntent, @NotNull Context context, @NotNull IIntentResultCallBack callBack) {
        Intrinsics.checkNotNullParameter(seedlingIntent, "seedlingIntent");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        long jNanoTime = System.nanoTime();
        Intent intent = new Intent();
        intent.setAction(seedlingIntent.getAction());
        intent.putExtra(KEY_TIMESTAMP, jNanoTime);
        intent.putExtra("flag", seedlingIntent.getFlag().getFlag());
        intent.setIdentifier(getCallBackMapKey(seedlingIntent.getAction(), Long.valueOf(jNanoTime)));
        intent.setPackage(context.getPackageName());
        registerCallBackListener(seedlingIntent.getAction(), jNanoTime, callBack);
        Logger.INSTANCE.i(Constants.TAG, "buildCallBackPendingIntent,timestamp=" + jNanoTime + ",action=" + seedlingIntent.getAction() + ",flag=" + seedlingIntent.getFlag());
        PushAutoTrackHelper.hookIntentGetBroadcast(context, 0, intent, SauAarConstants.N);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, SauAarConstants.N);
        PushAutoTrackHelper.hookPendingIntentGetBroadcast(broadcast, context, 0, intent, SauAarConstants.N);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    public final void createCallBackAndRegisterListener(@Nullable IIntentResultCallBack callBack, @NotNull Context context, @NotNull SeedlingIntent intent, @NotNull IntentManager intentManager, @NotNull Bundle seedlingIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        Intrinsics.checkNotNullParameter(intentManager, "intentManager");
        Intrinsics.checkNotNullParameter(seedlingIntent, "seedlingIntent");
        if (callBack != null) {
            if (isSupportNewMessenger(context)) {
                intentManager.registerCallBackListener(intent.getAction(), intent.getTimestamp(), callBack);
                Messenger messenger = this.resultCallBackMessenger;
                if (messenger != null) {
                    seedlingIntent.putBinder("reply", messenger.getBinder());
                }
                Logger.INSTANCE.i(Constants.TAG, "createCallBackAndRegisterListener with Messenger");
                return;
            }
            PendingIntent pendingIntentBuildCallBackPendingIntent$seedling_support_manualRelease = intentManager.buildCallBackPendingIntent$seedling_support_manualRelease(intent, context, callBack);
            Logger.INSTANCE.d(Constants.TAG, "createCallBackAndRegisterListener with PendingIntent：" + pendingIntentBuildCallBackPendingIntent$seedling_support_manualRelease);
            seedlingIntent.putParcelable(KEY_RESULT_CALLBACK_INTENT, pendingIntentBuildCallBackPendingIntent$seedling_support_manualRelease);
        }
    }

    @NotNull
    public final Bundle getIntentBundleValues$seedling_support_manualRelease(@NotNull String intentJson) {
        Intrinsics.checkNotNullParameter(intentJson, "intentJson");
        Bundle bundle = new Bundle();
        bundle.putString(KEY_INTENT_VALUE, intentJson);
        return bundle;
    }

    @NotNull
    public final String intentToJsonString$seedling_support_manualRelease(@NotNull SeedlingIntent intent) {
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(intentToJson(intent));
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String intentsToJsonString$seedling_support_manualRelease(@NotNull List<SeedlingIntent> intents) {
        Intrinsics.checkNotNullParameter(intents, "intents");
        JSONArray jSONArray = new JSONArray();
        Iterator<SeedlingIntent> it = intents.iterator();
        while (it.hasNext()) {
            jSONArray.put(intentToJson(it.next()));
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public final String logMessage$seedling_support_manualRelease(@NotNull Bundle it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            Result.Companion companion = Result.Companion;
            JSONArray jSONArray = new JSONArray(it.getString(KEY_INTENT_VALUE));
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                JSONObject jSONObject = obj instanceof JSONObject ? (JSONObject) obj : null;
                if (jSONObject != null) {
                    jSONObject.remove("data");
                    jSONObject.remove(KEY_OPTIONS);
                }
            }
            String string = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return "";
            }
            Logger.INSTANCE.e(Constants.TAG, "logMessage error:" + th2);
            return "";
        }
    }

    public final void registerCallBackListener(@Nullable String action, long timestamp, @NotNull IIntentResultCallBack callBack) {
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        addIntentResultCallBack(getCallBackMapKey(action, Long.valueOf(timestamp)), callBack);
    }

    @Override // com.oplus.pantanal.seedling.intent.IIntentManager
    public void registerResultCallBack(@NotNull Context context, @NotNull String[] actions) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actions, "actions");
        IntentFilter intentFilter = new IntentFilter();
        for (String str : actions) {
            intentFilter.addAction(str);
        }
        Logger.INSTANCE.d(Constants.TAG, "registerResultCallBack,actions = " + actions);
        BroadcastReceiver broadcastReceiver = this.callBackBroadcastReceiver;
        if (broadcastReceiver != null) {
            ExtsKt.registerExportedReceiver(context, broadcastReceiver, intentFilter);
        }
    }

    @Override // com.oplus.pantanal.seedling.intent.IIntentManager
    public int sendSeedling(@NotNull Context context, @NotNull SeedlingIntent intent, @Nullable IIntentResultCallBack callBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        return IntentManagerWrapper.INSTANCE.sendSeedling$seedling_support_manualRelease(context, intent, callBack);
    }

    @Override // com.oplus.pantanal.seedling.intent.IIntentManager
    public int sendSeedlings(@NotNull Context context, @NotNull List<SeedlingIntent> intents) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intents, "intents");
        return IntentManagerWrapper.INSTANCE.sendSeedlings$seedling_support_manualRelease(context, intents);
    }

    @Override // com.oplus.pantanal.seedling.intent.IIntentManager
    public void unRegisterResultCallBack(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Logger.INSTANCE.d(Constants.TAG, "unRegisterResultCallBack");
        context.unregisterReceiver(this.callBackBroadcastReceiver);
        callBackResultMap.clear();
    }
}
