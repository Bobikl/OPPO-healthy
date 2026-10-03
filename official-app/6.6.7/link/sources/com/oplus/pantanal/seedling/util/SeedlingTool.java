package com.oplus.pantanal.seedling.util;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import com.oplus.channel.client.utils.LogUtil;
import com.oplus.pantanal.seedling.bean.SeedlingCard;
import com.oplus.pantanal.seedling.bean.SeedlingIntent;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pantanal.seedling.intelligent.IIntelligent;
import com.oplus.pantanal.seedling.intelligent.IntelligentData;
import com.oplus.pantanal.seedling.intelligent.IntelligentManager;
import com.oplus.pantanal.seedling.intent.IIntentManager;
import com.oplus.pantanal.seedling.intent.IIntentResultCallBack;
import com.oplus.pantanal.seedling.intent.IntentManager;
import com.oplus.pantanal.seedling.unlock.UserUnlockManager;
import com.oplus.pantanal.seedling.update.INegativeFeedbackCallback;
import com.oplus.pantanal.seedling.update.ISeedlingDataUpdate;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import com.oplus.pantanal.seedling.update.SeedlingUpdateManager;
import com.oplus.pantanal.seedling.utrace.ITraceNode;
import com.oplus.pantanal.seedling.utrace.TraceNodeHelper;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplusos.sau.common.utils.SauAarConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J.\u0010\u001c\u001a*\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u001dj\u0014\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e` J\u001e\u0010!\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0007H\u0086@¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J$\u0010$\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00192\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020%0'H\u0007J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u001d\u0010)\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,J\u0018\u0010-\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0007H\u0002J#\u0010.\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001b00H\u0016¢\u0006\u0002\u00101J\"\u00102\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\u001e\u00107\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\f\u00108\u001a\b\u0012\u0004\u0012\u00020409H\u0017J\u0010\u0010:\u001a\u00020%2\u0006\u0010;\u001a\u00020\u0012H\u0007J\u0010\u0010<\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J>\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020\u001b2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010D\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010EH\u0016J$\u0010=\u001a\u00020%2\u0006\u0010>\u001a\u00020\u001f2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J>\u0010F\u001a\u00020%2\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020\u001b2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010C2\u0006\u0010D\u001a\u00020\u00072\b\u0010&\u001a\u0004\u0018\u00010EH\u0016J$\u0010F\u001a\u00020%2\u0006\u0010>\u001a\u00020\u001f2\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J\u0018\u0010G\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010H\u001a\u00020IH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006J"}, d2 = {"Lcom/oplus/pantanal/seedling/util/SeedlingTool;", "Lcom/oplus/pantanal/seedling/util/BaseTool;", "Lcom/oplus/pantanal/seedling/update/ISeedlingDataUpdate;", "Lcom/oplus/pantanal/seedling/intelligent/IIntelligent;", "Lcom/oplus/pantanal/seedling/intent/IIntentManager;", "()V", "CODE_SUCCESS", "", "DECISION_RESULT_FAILED", "DECISION_RESULT_REPEATED_ACTION", "DECISION_RESULT_SUCCEED", "EVENT_CODE_BUILD_INTENT_DIRECTLY", "INSTANCE_ID_MATCH_TYPE_STRONG", "INSTANCE_ID_MATCH_TYPE_WEAK", "MAX_RETRY_COUNT", "RETRY_DELAY_TIME", "", "initSdkOnCreate", "", "getInitSdkOnCreate$seedling_support_manualRelease", "()Z", "setInitSdkOnCreate$seedling_support_manualRelease", "(Z)V", "getBooleanMetaValue", "context", "Landroid/content/Context;", Node.I_KEY, "", "getSeedlingCardMap", "Ljava/util/HashMap;", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingCard;", "Lkotlin/collections/HashMap;", "isServiceEnabled", "serviceType", "(Landroid/content/Context;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSupportFluidCloud", "", "callback", "Lkotlin/Function1;", "isSupportSeedlingCard", "isSupportSystemSendIntent", "bundle", "Landroid/os/Bundle;", "isSupportSystemSendIntent$seedling_support_manualRelease", "queryServiceEnabled", "registerResultCallBack", "actions", "", "(Landroid/content/Context;[Ljava/lang/String;)V", "sendSeedling", TraceConstants.KEY_ACTION, "Lcom/oplus/pantanal/seedling/bean/SeedlingIntent;", "callBack", "Lcom/oplus/pantanal/seedling/intent/IIntentResultCallBack;", "sendSeedlings", "intents", "", "setInitSdkOnCreate", "initOnCreate", "unRegisterResultCallBack", "updateAllCardData", "card", "instanceId", "businessData", "Lorg/json/JSONObject;", "cardOptions", "Lcom/oplus/pantanal/seedling/update/SeedlingCardOptions;", "instanceIdMatchType", "Lcom/oplus/pantanal/seedling/update/INegativeFeedbackCallback;", "updateData", "updateIntelligentData", "data", "Lcom/oplus/pantanal/seedling/intelligent/IntelligentData;", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SeedlingTool extends BaseTool implements ISeedlingDataUpdate, IIntelligent, IIntentManager {
    private static final int CODE_SUCCESS = 1;
    public static final int DECISION_RESULT_FAILED = 1;
    public static final int DECISION_RESULT_REPEATED_ACTION = 2;
    public static final int DECISION_RESULT_SUCCEED = 0;
    private static final int EVENT_CODE_BUILD_INTENT_DIRECTLY = 20104;

    @NotNull
    public static final SeedlingTool INSTANCE = new SeedlingTool();
    public static final int INSTANCE_ID_MATCH_TYPE_STRONG = 2;
    public static final int INSTANCE_ID_MATCH_TYPE_WEAK = 1;
    private static final int MAX_RETRY_COUNT = 3;
    private static final long RETRY_DELAY_TIME = 400;
    private static boolean initSdkOnCreate;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.oplus.pantanal.seedling.util.SeedlingTool", f = "SeedlingTool.kt", i = {0, 0, 0, 0}, l = {391}, m = "isServiceEnabled", n = {"context", "retryCount", "isEnable", "serviceType"}, s = {"L$0", "L$1", "L$2", "I$0"})
    public static final class 1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public 1(Continuation<? super 1> continuation) {
            super(continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= SauAarConstants.I;
            return SeedlingTool.this.isServiceEnabled(null, 0, this);
        }
    }

    private SeedlingTool() {
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

    @JvmStatic
    public static final void isSupportFluidCloud(@NotNull Context context, @NotNull Function1<? super Boolean, Unit> callback) {
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        UserUnlockManager userUnlockManager = UserUnlockManager.INSTANCE;
        userUnlockManager.init(context, callback);
        if (BaseTool.Companion.isUserUnlocked$seedling_support_manualRelease$default(BaseTool.INSTANCE, context, null, 2, null)) {
            userUnlockManager.release(context);
            boolValueOf = Boolean.valueOf(isSupportFluidCloud(context));
        } else {
            Logger.INSTANCE.e(Constants.TAG, "isSupportFluidCloud error, because isUserUnlocked is false");
            boolValueOf = Boolean.FALSE;
        }
        callback.invoke(boolValueOf);
    }

    @JvmStatic
    public static final boolean isSupportSeedlingCard(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BaseTool.Companion companion = BaseTool.INSTANCE;
        if (!BaseTool.Companion.isUserUnlocked$seedling_support_manualRelease$default(companion, context, null, 2, null)) {
            Logger.INSTANCE.e(Constants.TAG, "isSupportSeedlingCard error, because isUserUnlocked is false");
            return false;
        }
        SeedlingTool seedlingTool = INSTANCE;
        if (seedlingTool.getBooleanMetaValue(context, Constants.META_DATA_ABNORMAL_MODE_SUPPORT)) {
            boolean zIsSupport$seedling_support_manualRelease$default = BaseTool.Companion.isSupport$seedling_support_manualRelease$default(companion, context, Constants.METHOD_SEEDLING_SUPPORT, Constants.KEY_SEEDLING_CARD_SUPPORT, 0L, 8, null);
            Logger.INSTANCE.i(Constants.TAG, "isSupportSeedlingCard, support = " + zIsSupport$seedling_support_manualRelease$default);
            return zIsSupport$seedling_support_manualRelease$default;
        }
        boolean booleanMetaValue = seedlingTool.getBooleanMetaValue(context, Constants.META_DATA_IS_SEEDLING_CARD_SUPPORT);
        Logger.INSTANCE.i(Constants.TAG, "isSupportSeedlingCard, metaDataValue = " + booleanMetaValue);
        return booleanMetaValue;
    }

    @JvmStatic
    public static final boolean isSupportSystemSendIntent(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BaseTool.Companion companion = BaseTool.INSTANCE;
        if (!BaseTool.Companion.isUserUnlocked$seedling_support_manualRelease$default(companion, context, null, 2, null)) {
            Logger.INSTANCE.e(Constants.TAG, "isSupportSystemSendIntent error, because isUserUnlocked is false");
            return false;
        }
        SeedlingTool seedlingTool = INSTANCE;
        if (seedlingTool.getBooleanMetaValue(context, Constants.META_DATA_ABNORMAL_MODE_SUPPORT)) {
            boolean zIsSupport$seedling_support_manualRelease$default = BaseTool.Companion.isSupport$seedling_support_manualRelease$default(companion, context, Constants.METHOD_SYSTEM_INTENT_SUPPORT, Constants.KEY_SEEDLING_INTENT_SUPPORT, 0L, 8, null);
            Logger.INSTANCE.i(Constants.TAG, "isSupportSystemSendIntent, support = " + zIsSupport$seedling_support_manualRelease$default);
            return zIsSupport$seedling_support_manualRelease$default;
        }
        boolean booleanMetaValue = seedlingTool.getBooleanMetaValue(context, Constants.META_DATA_IS_SEEDLING_INTENT_SUPPORT);
        Logger.INSTANCE.i(Constants.TAG, "isSupportSystemSendIntent, metaDataValue = " + booleanMetaValue);
        return booleanMetaValue;
    }

    @JvmStatic
    public static final boolean isSupportSystemSendIntent$seedling_support_manualRelease(@NotNull Context context, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        BaseTool.Companion companion = BaseTool.INSTANCE;
        if (!companion.isUserUnlocked$seedling_support_manualRelease(context, bundle)) {
            Logger.INSTANCE.e(Constants.TAG, "isSupportSystemSendIntent error, because isUserUnlocked is false");
            ITraceNode.errorCodeTrace$default(TraceNodeHelper.INSTANCE, bundle, TraceConstants.ERROR_CODE_USER_IS_LOCKED, (String) null, 4, (Object) null);
            return false;
        }
        TraceNodeHelper traceNodeHelper = TraceNodeHelper.INSTANCE;
        String strStartNodeTrace$default = ITraceNode.startNodeTrace$default(traceNodeHelper, bundle, TraceNodeHelper.CODE_IS_SUPPORT_SYSTEM_INTENT, (Map) null, 4, (Object) null);
        SeedlingTool seedlingTool = INSTANCE;
        if (seedlingTool.getBooleanMetaValue(context, Constants.META_DATA_ABNORMAL_MODE_SUPPORT)) {
            boolean zIsSupport$seedling_support_manualRelease$default = BaseTool.Companion.isSupport$seedling_support_manualRelease$default(companion, context, Constants.METHOD_SYSTEM_INTENT_SUPPORT, Constants.KEY_SEEDLING_INTENT_SUPPORT, 0L, 8, null);
            Logger.INSTANCE.i(Constants.TAG, "isSupportSystemSendIntent, support = " + zIsSupport$seedling_support_manualRelease$default);
            if (zIsSupport$seedling_support_manualRelease$default) {
                ITraceNode.endNodeTrace$default(traceNodeHelper, strStartNodeTrace$default, false, 2, null);
            } else {
                ITraceNode.errorNodeTrace$default(traceNodeHelper, strStartNodeTrace$default, TraceNodeHelper.CODE_IS_SUPPORT_SYSTEM_INTENT, null, 4, null);
            }
            return zIsSupport$seedling_support_manualRelease$default;
        }
        boolean booleanMetaValue = seedlingTool.getBooleanMetaValue(context, Constants.META_DATA_IS_SEEDLING_INTENT_SUPPORT);
        Logger.INSTANCE.i(Constants.TAG, "isSupportSystemSendIntent, metaDataValue = " + booleanMetaValue);
        if (booleanMetaValue) {
            ITraceNode.endNodeTrace$default(traceNodeHelper, strStartNodeTrace$default, false, 2, null);
        } else {
            ITraceNode.errorNodeTrace$default(traceNodeHelper, strStartNodeTrace$default, TraceNodeHelper.CODE_IS_SUPPORT_SYSTEM_INTENT, null, 4, null);
        }
        return booleanMetaValue;
    }

    private final boolean queryServiceEnabled(Context context, int serviceType) {
        Unit unit;
        Cursor cursorQuery = context.getContentResolver().query(Constants.INSTANCE.getSWITCH_QUERY_URI(), null, null, new String[]{Integer.toString(serviceType)}, null);
        boolean z = false;
        if (cursorQuery != null) {
            if (cursorQuery.moveToFirst()) {
                int i = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("code"));
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("message"));
                int i2 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("result"));
                Logger logger = Logger.INSTANCE;
                logger.i(Constants.TAG, "isServiceEnabled " + serviceType + ",code=" + i + ",isServiceOn=" + i2);
                if (1 == i && 1 == i2) {
                    z = true;
                } else {
                    logger.i(Constants.TAG, "isServiceEnabled false," + serviceType + ",message=" + string);
                }
            }
            cursorQuery.close();
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null) {
            return z;
        }
        throw new IllegalStateException("cursor is null");
    }

    @JvmStatic
    public static final void setInitSdkOnCreate(boolean initOnCreate) {
        initSdkOnCreate = initOnCreate;
        Logger.INSTANCE.i(Constants.TAG, "setInitSdkOnCreate initOnCreate=" + initOnCreate + "}");
    }

    public final boolean getInitSdkOnCreate$seedling_support_manualRelease() {
        return initSdkOnCreate;
    }

    @NotNull
    public final HashMap<String, List<SeedlingCard>> getSeedlingCardMap() {
        return SeedlingUpdateManager.INSTANCE.getINSTANCE().getMCardCache().getSeedlingCardMap$seedling_support_manualRelease();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c1 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #1 {all -> 0x00d5, blocks: (B:27:0x0095, B:29:0x00c1, B:24:0x007d, B:19:0x0055, B:20:0x0057, B:23:0x0063), top: B:47:0x0055, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        if (r10.element < 3) goto L24;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:42:0x00e8, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0092 -> B:27:0x0095). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object isServiceEnabled(@org.jetbrains.annotations.NotNull android.content.Context r11, int r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r13) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oplus.pantanal.seedling.util.SeedlingTool.isServiceEnabled(android.content.Context, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.oplus.pantanal.seedling.intent.IIntentManager
    public void registerResultCallBack(@NotNull Context context, @NotNull String[] actions) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(actions, "actions");
        try {
            Result.Companion companion = Result.Companion;
            IntentManager.INSTANCE.getINSTANCE().registerResultCallBack(context, actions);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, "registerResultCallBack has error = " + th2.getMessage());
        }
    }

    @Override // com.oplus.pantanal.seedling.intent.IIntentManager
    public int sendSeedling(@NotNull Context context, @NotNull SeedlingIntent intent, @Nullable IIntentResultCallBack callBack) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        try {
            Result.Companion companion = Result.Companion;
            return IntentManager.INSTANCE.getINSTANCE().sendSeedling(context, intent, callBack);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return 0;
            }
            LogUtil.e(Constants.TAG, "sendSeedling error=" + th2.getMessage());
            return 0;
        }
    }

    @Override // com.oplus.pantanal.seedling.intent.IIntentManager
    @Deprecated(message = "该方法不支持获取决策是否成功的状态，推荐使用sendSeedling方法", replaceWith = @ReplaceWith(expression = "sendSeedling(context,intent,callBack)", imports = {"com.oplus.pantanal.seedling.util.SeedlingTool.sendSeedling"}))
    public int sendSeedlings(@NotNull Context context, @NotNull List<SeedlingIntent> intents) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intents, "intents");
        try {
            Result.Companion companion = Result.Companion;
            return IntentManager.INSTANCE.getINSTANCE().sendSeedlings(context, intents);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return 0;
            }
            LogUtil.e(Constants.TAG, "sendSeedlings error=" + th2.getMessage());
            return 0;
        }
    }

    public final void setInitSdkOnCreate$seedling_support_manualRelease(boolean z) {
        initSdkOnCreate = z;
    }

    @Override // com.oplus.pantanal.seedling.intent.IIntentManager
    public void unRegisterResultCallBack(@NotNull Context context) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.Companion;
            IntentManager.INSTANCE.getINSTANCE().unRegisterResultCallBack(context);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, "unRegisterResultCallBack has error = " + th2.getMessage());
        }
    }

    @Override // com.oplus.pantanal.seedling.update.ISeedlingDataUpdate
    public void updateAllCardData(@NotNull SeedlingCard card, @NotNull String instanceId, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions, int instanceIdMatchType, @Nullable INegativeFeedbackCallback callback) {
        Object obj;
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        try {
            Result.Companion companion = Result.Companion;
            SeedlingUpdateManager.INSTANCE.getINSTANCE().updateAllCardData(card, instanceId, businessData, cardOptions, instanceIdMatchType, callback);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, "updateAllCardData instance error.msg=" + th2.getMessage());
        }
    }

    @Override // com.oplus.pantanal.seedling.update.ISeedlingDataUpdate
    public void updateData(@NotNull SeedlingCard card, @NotNull String instanceId, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions, int instanceIdMatchType, @Nullable INegativeFeedbackCallback callback) {
        Object obj;
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        try {
            Result.Companion companion = Result.Companion;
            Logger.INSTANCE.i(Constants.TAG, "updateData with instance id card=" + card + ",businessData is null=" + (businessData == null) + ".cardOptions=" + cardOptions);
            SeedlingUpdateManager.INSTANCE.getINSTANCE().updateData(card, instanceId, businessData, cardOptions, instanceIdMatchType, callback);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, "updateData with instance id error.msg=" + th2.getMessage());
        }
    }

    @Override // com.oplus.pantanal.seedling.intelligent.IIntelligent
    public void updateIntelligentData(@NotNull Context context, @NotNull IntelligentData data) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.getEventCode() != EVENT_CODE_BUILD_INTENT_DIRECTLY && (data.getBusinessData() != null || data.getSeedlingCardOptions() != null)) {
            Logger.INSTANCE.e(Constants.TAG, "metis do not support deal with businessData or seedlingCardOptions when eventCode is not 20104");
        }
        IntelligentManager.INSTANCE.getINSTANCE().updateIntelligentData(context, data);
    }

    @JvmStatic
    public static final boolean isSupportFluidCloud(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BaseTool.Companion companion = BaseTool.INSTANCE;
        if (!BaseTool.Companion.isUserUnlocked$seedling_support_manualRelease$default(companion, context, null, 2, null)) {
            Logger.INSTANCE.e(Constants.TAG, "isSupportFluidCloud error, because isUserUnlocked is false");
            return false;
        }
        boolean zIsSupport$seedling_support_manualRelease$default = BaseTool.Companion.isSupport$seedling_support_manualRelease$default(companion, context, Constants.METHOD_FLUID_CLOUD_SUPPORT, Constants.KEY_FLUID_CLOUD_SUPPORT, 0L, 8, null);
        Logger.INSTANCE.i(Constants.TAG, "isSupportFluidCloud, isSupportFluidCloud = " + zIsSupport$seedling_support_manualRelease$default);
        return zIsSupport$seedling_support_manualRelease$default;
    }

    @Override // com.oplus.pantanal.seedling.update.ISeedlingDataUpdate
    public void updateAllCardData(@NotNull SeedlingCard card, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions) {
        Object obj;
        Intrinsics.checkNotNullParameter(card, "card");
        try {
            Result.Companion companion = Result.Companion;
            SeedlingUpdateManager.INSTANCE.getINSTANCE().updateAllCardData(card, businessData, cardOptions);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, "updateAllCardData error.msg=" + th2.getMessage());
        }
    }

    @Override // com.oplus.pantanal.seedling.update.ISeedlingDataUpdate
    public void updateData(@NotNull SeedlingCard card, @Nullable JSONObject businessData, @Nullable SeedlingCardOptions cardOptions) {
        Object obj;
        Intrinsics.checkNotNullParameter(card, "card");
        try {
            Result.Companion companion = Result.Companion;
            Logger.INSTANCE.i(Constants.TAG, "updateData card=" + card + ",businessData is null=" + (businessData == null) + ".cardOptions=" + cardOptions);
            SeedlingUpdateManager.INSTANCE.getINSTANCE().updateData(card, businessData, cardOptions);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, "updateData error.msg=" + th2.getMessage());
        }
    }
}
