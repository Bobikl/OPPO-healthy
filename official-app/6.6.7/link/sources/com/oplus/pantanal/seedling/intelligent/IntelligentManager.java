package com.oplus.pantanal.seedling.intelligent;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import com.oplus.pantanal.seedling.constants.Constants;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pantanal.seedling.convertor.ConvertorFactory;
import com.oplus.pantanal.seedling.convertor.JsonToSeedlingCardOptionsConvertor;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import com.oplus.pantanal.seedling.util.ExtsKt;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.pantanal.seedling.utrace.ITraceNode;
import com.oplus.pantanal.seedling.utrace.TraceNodeHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0015"}, d2 = {"Lcom/oplus/pantanal/seedling/intelligent/IntelligentManager;", "Lcom/oplus/pantanal/seedling/intelligent/IIntelligent;", "()V", "buildEventJson", "Lorg/json/JSONObject;", "data", "Lcom/oplus/pantanal/seedling/intelligent/IntelligentData;", "traceContextStr", "", "buildIntelligentJson", IntelligentManager.KEY_TIMESTAMP, "", "eventJson", "buildIntelligentParams", "sendToIntelligent", "", "context", "Landroid/content/Context;", "parentTraceCtxJson", "updateIntelligentData", "Companion", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IntelligentManager implements IIntelligent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<IntelligentManager> INSTANCE$delegate = LazyKt.lazy(new Function0<IntelligentManager>() { // from class: com.oplus.pantanal.seedling.intelligent.IntelligentManager$Companion$INSTANCE$2
        @NotNull
        public final IntelligentManager invoke() {
            return new IntelligentManager(null);
        }
    });

    @NotNull
    private static final String KEY_BUSINESS_DATA = "business_data";

    @NotNull
    private static final String KEY_CARD_OPTIONS = "card_options";

    @NotNull
    private static final String KEY_EVENT = "event";

    @NotNull
    private static final String KEY_EVENT_CODE = "event_code";

    @NotNull
    private static final String KEY_EVENT_PARAMS = "params";

    @NotNull
    private static final String KEY_INSTANCE_ID = "instance_id";

    @NotNull
    private static final String KEY_INTELLIGENT_DATA = "data_json";

    @NotNull
    private static final String KEY_OUTER_EVENT = "outer_event";

    @NotNull
    public static final String KEY_REMIND_TYPE = "remind_type";

    @NotNull
    private static final String KEY_SERVICE_INSTANCE_ID = "serviceInstanceId";

    @NotNull
    private static final String KEY_TIMESTAMP = "timestamp";

    @NotNull
    private static final String URL = "content://intelligent_data_expositor/data";

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/oplus/pantanal/seedling/intelligent/IntelligentManager$Companion;", "", "()V", "INSTANCE", "Lcom/oplus/pantanal/seedling/intelligent/IntelligentManager;", "getINSTANCE", "()Lcom/oplus/pantanal/seedling/intelligent/IntelligentManager;", "INSTANCE$delegate", "Lkotlin/Lazy;", "KEY_BUSINESS_DATA", "", "KEY_CARD_OPTIONS", "KEY_EVENT", "KEY_EVENT_CODE", "KEY_EVENT_PARAMS", "KEY_INSTANCE_ID", "KEY_INTELLIGENT_DATA", "KEY_OUTER_EVENT", "KEY_REMIND_TYPE", "KEY_SERVICE_INSTANCE_ID", "KEY_TIMESTAMP", "URL", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IntelligentManager getINSTANCE() {
            return (IntelligentManager) IntelligentManager.INSTANCE$delegate.getValue();
        }
    }

    private IntelligentManager() {
    }

    public /* synthetic */ IntelligentManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final JSONObject buildEventJson(IntelligentData data, String traceContextStr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_EVENT_CODE, data.getEventCode());
        jSONObject.put("event", data.getEvent());
        jSONObject.put("params", buildIntelligentParams(data));
        jSONObject.put("SecondTermTraceContext", traceContextStr);
        return jSONObject;
    }

    private final String buildIntelligentJson(long timestamp, JSONObject eventJson) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(KEY_TIMESTAMP, timestamp);
        jSONObject.put(KEY_OUTER_EVENT, eventJson);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final JSONObject buildIntelligentParams(IntelligentData data) throws JSONException {
        JSONObject data2 = data.getData();
        if (data2 == null) {
            data2 = new JSONObject();
        }
        SeedlingCardOptions seedlingCardOptions = data.getSeedlingCardOptions();
        if (seedlingCardOptions != null) {
            data2.put(KEY_CARD_OPTIONS, ((JSONObject) ConvertorFactory.INSTANCE.get(JsonToSeedlingCardOptionsConvertor.class).from(seedlingCardOptions)).toString());
        }
        data2.put(KEY_INSTANCE_ID, data.getTimestamp());
        String serviceInstanceId = data.getServiceInstanceId();
        if (serviceInstanceId != null) {
            data2.put(KEY_SERVICE_INSTANCE_ID, serviceInstanceId);
        }
        SeedlingCardOptions seedlingCardOptions2 = data.getSeedlingCardOptions();
        if (seedlingCardOptions2 != null) {
            data2.put(KEY_REMIND_TYPE, seedlingCardOptions2.getRemindType());
            data2.put(JsonToSeedlingCardOptionsConvertor.KEY_SHOULD_FOCUS, seedlingCardOptions2.getShouldFocus());
            Long focusTimestamp = seedlingCardOptions2.getFocusTimestamp();
            data2.put(JsonToSeedlingCardOptionsConvertor.KEY_FOCUS_TIMESTAMP, focusTimestamp != null ? focusTimestamp.longValue() : System.currentTimeMillis());
        }
        Logger.INSTANCE.i(Constants.TAG, "buildIntelligentParams,paramsJSON:" + data2);
        JSONObject businessData = data.getBusinessData();
        if (businessData != null) {
            data2.put("business_data", businessData.toString());
        }
        return data2;
    }

    private final void sendToIntelligent(Context context, String data, String parentTraceCtxJson) {
        Object obj;
        Unit unit;
        try {
            Result.Companion companion = Result.Companion;
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_INTELLIGENT_DATA, data);
            Logger.INSTANCE.i(Constants.TAG, "sendToIntelligent start.parentTraceCtxJson=" + parentTraceCtxJson);
            Uri uri = Uri.parse(URL);
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uri);
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.insert(uri, contentValues);
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            obj = Result.constructor-impl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            TraceNodeHelper traceNodeHelper = TraceNodeHelper.INSTANCE;
            String message = th2.getMessage();
            if (message == null) {
                message = "sendToIntelligent error";
            }
            traceNodeHelper.errorCodeTrace(parentTraceCtxJson, TraceConstants.ERROR_CODE_UPDATE_INTELLIGENT_DATA, message);
            Logger.INSTANCE.i(Constants.TAG, "sendToIntelligent: error = " + th2.getMessage());
        }
    }

    public static /* synthetic */ void sendToIntelligent$default(IntelligentManager intelligentManager, Context context, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        intelligentManager.sendToIntelligent(context, str, str2);
    }

    @Override // com.oplus.pantanal.seedling.intelligent.IIntelligent
    public void updateIntelligentData(@NotNull Context context, @NotNull IntelligentData data) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        Logger.INSTANCE.i(Constants.TAG, "updateIntelligentData： instanceId:" + data.getTimestamp());
        if (data.getData() == null) {
            data.setData(new JSONObject());
        }
        JSONObject data2 = data.getData();
        String strOptString = data2 != null ? data2.optString("SecondTermTraceContext") : null;
        String strStartHeadCodeTrace$default = (strOptString == null || strOptString.length() == 0) ? ITraceNode.startHeadCodeTrace$default(TraceNodeHelper.INSTANCE, TraceConstants.NODE_UPDATE_INTELLIGENT_DATA, ExtsKt.genTraceTags(data, context), null, 4, null) : TraceNodeHelper.INSTANCE.startNodeTrace(strOptString, TraceConstants.NODE_UPDATE_INTELLIGENT_DATA, ExtsKt.genTraceTags(data, context));
        JSONObject data3 = data.getData();
        if (data3 != null) {
            data3.put("SecondTermTraceContext", strStartHeadCodeTrace$default);
        }
        sendToIntelligent(context, buildIntelligentJson(data.getTimestamp(), buildEventJson(data, strStartHeadCodeTrace$default)), strStartHeadCodeTrace$default);
        ITraceNode.endNodeTrace$default(TraceNodeHelper.INSTANCE, strStartHeadCodeTrace$default, false, 2, null);
    }
}
