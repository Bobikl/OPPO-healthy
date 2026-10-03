package com.oplus.pantanal.seedling.utrace;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.oplus.pantanal.seedling.bean.SeedlingIntent;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pantanal.seedling.intent.IIntentResultCallBack;
import com.oplus.pantanal.seedling.intent.IntentManager;
import com.oplus.pantanal.seedling.util.ExtsKt;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.pantanal.seedling.util.SeedlingTool;
import com.oplus.utrace.sdk.UTraceCompat;
import com.oplus.utrace.sdk.UTraceContext;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J'\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0002\b\u000eJ#\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/oplus/pantanal/seedling/utrace/IntentManagerWrapper;", "", "()V", "seedlingIntentToUMS", "", "seedlingIntent", "Landroid/os/Bundle;", "context", "Landroid/content/Context;", "sendSeedling", TraceConstants.KEY_ACTION, "Lcom/oplus/pantanal/seedling/bean/SeedlingIntent;", "callBack", "Lcom/oplus/pantanal/seedling/intent/IIntentResultCallBack;", "sendSeedling$seedling_support_manualRelease", "sendSeedlings", "intents", "", "sendSeedlings$seedling_support_manualRelease", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntentManagerWrapper {

    @NotNull
    public static final IntentManagerWrapper INSTANCE = new IntentManagerWrapper();

    private IntentManagerWrapper() {
    }

    private final int seedlingIntentToUMS(Bundle seedlingIntent, Context context) throws JSONException {
        String str;
        TraceNodeHelper traceNodeHelper;
        int i;
        if (SeedlingTool.isSupportSystemSendIntent$seedling_support_manualRelease(context, seedlingIntent)) {
            TraceNodeHelper traceNodeHelper2 = TraceNodeHelper.INSTANCE;
            String strStartNodeTrace$default = ITraceNode.startNodeTrace$default(traceNodeHelper2, seedlingIntent, TraceNodeHelper.CODE_RECEIVE_INTENT_CALLBACK, (Map) null, 4, (Object) null);
            TraceNodeHelperKt.saveTraceContextToIntentValue(seedlingIntent, strStartNodeTrace$default);
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(Uri.parse(IntentManager.START_INTENTS));
            try {
                Result.Companion companion = Result.Companion;
                Logger.INSTANCE.i(Constants.TAG, "seedlingIntent to UMS start: " + IntentManager.INSTANCE.getINSTANCE().logMessage$seedling_support_manualRelease(seedlingIntent));
                String string = seedlingIntent.getString("SecondTermTraceContext", "");
                UTraceCompat uTraceCompat = UTraceCompat.INSTANCE;
                Intrinsics.checkNotNull(string);
                UTraceContext fromJsonString = uTraceCompat.readFromJsonString(string);
                if (fromJsonString != null) {
                    uTraceCompat.writeToBundle(fromJsonString, seedlingIntent, TraceConstants.KEY_OLD_TRACE_CONTEXT, TraceConstants.KEY_NEW_TRACE_CONTEXT);
                }
                Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.call(IntentManager.START_INTENTS_METHOD, null, seedlingIntent) : null;
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                int i2 = bundleCall != null ? bundleCall.getInt("result", 0) : 0;
                try {
                    if (i2 == 0) {
                        ITraceNode.errorNodeTrace$default(traceNodeHelper2, strStartNodeTrace$default, TraceNodeHelper.CODE_RECEIVE_INTENT_CALLBACK, null, 4, null);
                        str = strStartNodeTrace$default;
                        ITraceNode.errorCodeTrace$default(traceNodeHelper2, seedlingIntent, TraceConstants.ERROR_CODE_TO_UMS_ERROR, (String) null, 4, (Object) null);
                    } else {
                        str = strStartNodeTrace$default;
                        ITraceNode.endNodeTrace$default(traceNodeHelper2, str, false, 2, null);
                    }
                    return i2;
                } catch (Throwable th) {
                    th = th;
                    Result.Companion companion2 = Result.Companion;
                    Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
                    if (th2 == null) {
                        return 0;
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    String str2 = "seedlingIntent to UMS error:" + th2.getMessage();
                    Logger.INSTANCE.e(Constants.TAG, str2);
                    traceNodeHelper = TraceNodeHelper.INSTANCE;
                    traceNodeHelper.errorNodeTrace(str, TraceNodeHelper.CODE_RECEIVE_INTENT_CALLBACK, str2);
                    i = TraceConstants.ERROR_CODE_TO_UMS_ERROR;
                    ITraceNode.errorCodeTrace$default(traceNodeHelper, seedlingIntent, i, (String) null, 4, (Object) null);
                    return 0;
                }
            } catch (Throwable th3) {
                th = th3;
                contentProviderClientAcquireUnstableContentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                str = strStartNodeTrace$default;
            }
        } else {
            traceNodeHelper = TraceNodeHelper.INSTANCE;
            i = TraceConstants.ERROR_CODE_NOT_SUPPORT_SYSTEM_INTENT;
        }
        ITraceNode.errorCodeTrace$default(traceNodeHelper, seedlingIntent, i, (String) null, 4, (Object) null);
        return 0;
    }

    public final int sendSeedling$seedling_support_manualRelease(@NotNull Context context, @NotNull SeedlingIntent intent, @Nullable IIntentResultCallBack callBack) {
        int iSeedlingIntentToUMS;
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        Logger.INSTANCE.i(Constants.TAG, "sendSeedling, instanceId：" + intent.getTimestamp());
        IntentManager instance = IntentManager.INSTANCE.getINSTANCE();
        Bundle intentBundleValues$seedling_support_manualRelease = instance.getIntentBundleValues$seedling_support_manualRelease(instance.intentToJsonString$seedling_support_manualRelease(intent));
        TraceNodeHelper traceNodeHelper = TraceNodeHelper.INSTANCE;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        String strStartHeadNodeTrace = traceNodeHelper.startHeadNodeTrace(packageName, intent, intentBundleValues$seedling_support_manualRelease);
        String strStartHeadCodeTrace = traceNodeHelper.startHeadCodeTrace(TraceConstants.NODE_SEND_SEEDLING, ExtsKt.genTraceTags(intent, context), intentBundleValues$seedling_support_manualRelease);
        try {
            Result.Companion companion = Result.Companion;
            instance.createCallBackAndRegisterListener(callBack, context, intent, instance, intentBundleValues$seedling_support_manualRelease);
            iSeedlingIntentToUMS = INSTANCE.seedlingIntentToUMS(intentBundleValues$seedling_support_manualRelease, context);
            try {
                obj = Result.constructor-impl(Unit.INSTANCE);
            } catch (Throwable th) {
                th = th;
                Result.Companion companion2 = Result.Companion;
                obj = Result.constructor-impl(ResultKt.createFailure(th));
            }
        } catch (Throwable th2) {
            th = th2;
            iSeedlingIntentToUMS = 0;
        }
        if (Result.exceptionOrNull-impl(obj) != null) {
            Logger.INSTANCE.e(Constants.TAG, "seedlingIntent to UMS error: $ {it.message}");
            TraceNodeHelper traceNodeHelper2 = TraceNodeHelper.INSTANCE;
            traceNodeHelper2.errorCodeTrace(strStartHeadCodeTrace, TraceConstants.ERROR_CODE_TO_UMS_ERROR, "seedlingIntent to UMS error: $ {it.message}");
            traceNodeHelper2.errorNodeTrace(strStartHeadNodeTrace, TraceNodeHelper.CODE_RECEIVE_INTENT_CALLBACK, "seedlingIntent to UMS error: $ {it.message}");
        }
        TraceNodeHelper traceNodeHelper3 = TraceNodeHelper.INSTANCE;
        ITraceNode.endNodeTrace$default(traceNodeHelper3, strStartHeadNodeTrace, false, 2, null);
        ITraceNode.endNodeTrace$default(traceNodeHelper3, strStartHeadCodeTrace, false, 2, null);
        return iSeedlingIntentToUMS;
    }

    public final int sendSeedlings$seedling_support_manualRelease(@NotNull Context context, @NotNull List<SeedlingIntent> intents) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intents, "intents");
        IntentManager instance = IntentManager.INSTANCE.getINSTANCE();
        Bundle intentBundleValues$seedling_support_manualRelease = instance.getIntentBundleValues$seedling_support_manualRelease(instance.intentsToJsonString$seedling_support_manualRelease(intents));
        int iSeedlingIntentToUMS = 0;
        try {
            Result.Companion companion = Result.Companion;
            iSeedlingIntentToUMS = INSTANCE.seedlingIntentToUMS(intentBundleValues$seedling_support_manualRelease, context);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(Constants.TAG, "seedlingIntent to UMS error: " + th2.getMessage());
        }
        return iSeedlingIntentToUMS;
    }
}
