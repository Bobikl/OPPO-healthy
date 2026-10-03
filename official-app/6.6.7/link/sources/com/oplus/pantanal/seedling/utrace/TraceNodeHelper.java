package com.oplus.pantanal.seedling.utrace;

import android.os.Bundle;
import com.oplus.pantanal.seedling.bean.SeedlingIntent;
import com.oplus.pantanal.seedling.bean.SeedlingIntentFlagEnum;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.pantanal.seedling.update.SeedlingCardOptions;
import com.oplus.pantanal.seedling.util.Logger;
import com.oplus.pantanal.seedling.util.UtilsKt;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.oplus.utrace.lib.SpanType;
import com.oplus.utrace.sdk.CompletionType;
import com.oplus.utrace.sdk.UTrace;
import com.oplus.utrace.sdk.UTraceCompat;
import com.oplus.utrace.sdk.UTraceContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0006H\u0016J\u001a\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\"\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0006H\u0016J\"\u0010\u001c\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0006H\u0016J\"\u0010!\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0006H\u0002J:\u0010$\u001a\u00020\u00142\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\"\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060)j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`*H\u0002J4\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020'2\"\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060)j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`*H\u0002J.\u0010-\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060.2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J \u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\u0006\u0010,\u001a\u00020'2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J&\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00062\f\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J.\u00101\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u00062\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010.H\u0016J.\u00101\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010.H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/oplus/pantanal/seedling/utrace/TraceNodeHelper;", "Lcom/oplus/pantanal/seedling/utrace/ITraceNode;", "()V", "CODE_ERROR_TRACE", "", "CODE_INTENT_RESULT", "", "CODE_IS_SUPPORT_SYSTEM_INTENT", "CODE_IS_USER_UNLOCKED", "CODE_MULTIPLE_ACTION", "CODE_RECEIVE_INTENT_CALLBACK", "CODE_SINGLE_ACTION", "CONNECT_TAG", "ERROR_CODE_END", "KEY_FLAG", "KEY_GRADE", "KEY_IS_MILESTONE", "KEY_PAGE_ID", "TAG", "endCompleteNodeTrace", "", "resultCode", "flag", "traceCtxJson", "endNodeTrace", "traceCtxStr", "isComplete", "", "errorCodeTrace", "bundle", "Landroid/os/Bundle;", "errorCode", "errorMsg", "errorNodeTrace", UTraceSQLiteHelperKt.COL_SPAN_NAME, "genErrorCodeBySpanName", "initIntentListParams", "intents", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingIntent;", UTraceSQLiteHelperKt.COL_TAGS, "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "initIntentParams", TraceConstants.KEY_ACTION, "startHeadCodeTrace", "", "startHeadNodeTrace", TraceConstants.KEY_PKG_NAME, "startNodeTrace", "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTraceNodeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TraceNodeHelper.kt\ncom/oplus/pantanal/seedling/utrace/TraceNodeHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,407:1\n1864#2,3:408\n*S KotlinDebug\n*F\n+ 1 TraceNodeHelper.kt\ncom/oplus/pantanal/seedling/utrace/TraceNodeHelper\n*L\n129#1:408,3\n*E\n"})
public final class TraceNodeHelper implements ITraceNode {
    public static final int CODE_ERROR_TRACE = 100;

    @NotNull
    public static final String CODE_INTENT_RESULT = "106";

    @NotNull
    public static final String CODE_IS_SUPPORT_SYSTEM_INTENT = "104";

    @NotNull
    public static final String CODE_IS_USER_UNLOCKED = "103";

    @NotNull
    public static final String CODE_MULTIPLE_ACTION = "101";

    @NotNull
    public static final String CODE_RECEIVE_INTENT_CALLBACK = "105";

    @NotNull
    public static final String CODE_SINGLE_ACTION = "102";

    @NotNull
    private static final String CONNECT_TAG = "&";

    @NotNull
    private static final String ERROR_CODE_END = "1";

    @NotNull
    public static final TraceNodeHelper INSTANCE = new TraceNodeHelper();

    @NotNull
    private static final String KEY_FLAG = "flag";

    @NotNull
    private static final String KEY_GRADE = "grade";

    @NotNull
    private static final String KEY_IS_MILESTONE = "isMilestone";

    @NotNull
    private static final String KEY_PAGE_ID = "pageId";

    @NotNull
    public static final String TAG = "TraceHelper";

    private TraceNodeHelper() {
    }

    private final int genErrorCodeBySpanName(String spanName) {
        String str = spanName + "1";
        try {
            Result.Companion companion = Result.Companion;
            return Integer.parseInt(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return 100;
            }
            Logger.INSTANCE.e(TAG, spanName + " getErrorCodeBySpanName error:" + th2.getMessage());
            return 100;
        }
    }

    private final void initIntentListParams(List<SeedlingIntent> intents, HashMap<String, String> tags) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        int size = intents.size();
        int i = 0;
        for (Object obj : intents) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            SeedlingIntent seedlingIntent = (SeedlingIntent) obj;
            sb.append(seedlingIntent.getAction());
            sb2.append(seedlingIntent.getFlag());
            SeedlingCardOptions cardOptions = seedlingIntent.getCardOptions();
            if (cardOptions != null) {
                sb3.append(cardOptions.getPageId());
                sb4.append(cardOptions.getGrade());
                sb5.append(cardOptions.isMilestone());
            }
            if (i != size - 1) {
                sb.append("&");
                sb2.append("&");
                sb3.append("&");
                sb4.append("&");
                sb5.append("&");
            }
            i = i2;
        }
        tags.put(TraceConstants.KEY_ACTION, sb.toString());
        tags.put("flag", sb2.toString());
        tags.put("pageId", sb3.toString());
        tags.put("grade", sb4.toString());
        tags.put("isMilestone", sb5.toString());
        Logger.INSTANCE.i(TAG, "initIntentListParams tags=" + tags);
    }

    private final void initIntentParams(SeedlingIntent intent, HashMap<String, String> tags) {
        tags.put(TraceConstants.KEY_ACTION, intent.getAction());
        tags.put("flag", String.valueOf(intent.getFlag().getFlag()));
        SeedlingCardOptions cardOptions = intent.getCardOptions();
        if (cardOptions != null) {
            tags.put("pageId", String.valueOf(cardOptions.getPageId()));
            tags.put("grade", String.valueOf(cardOptions.getGrade()));
            tags.put("isMilestone", String.valueOf(cardOptions.isMilestone()));
        }
        Logger.INSTANCE.i(TAG, "initIntentParams tags=" + tags);
    }

    @Override // com.oplus.pantanal.seedling.utrace.ITraceNode
    public void endCompleteNodeTrace(int resultCode, int flag, @NotNull String traceCtxJson) {
        Object obj;
        Intrinsics.checkNotNullParameter(traceCtxJson, "traceCtxJson");
        try {
            Result.Companion companion = Result.Companion;
            UTraceContext fromJsonString = UTraceCompat.INSTANCE.readFromJsonString(traceCtxJson);
            if (fromJsonString != null) {
                if (resultCode != 0) {
                    int iGenErrorCodeBySpanName = INSTANCE.genErrorCodeBySpanName(CODE_INTENT_RESULT);
                    Logger.INSTANCE.i(TAG, "endCompleteNodeTrace error spanName=" + iGenErrorCodeBySpanName + ",traceCtx=" + fromJsonString);
                    StringBuilder sb = new StringBuilder();
                    sb.append("sendResultCodeCallBack resultCode=");
                    sb.append(resultCode);
                    UTrace.error(fromJsonString, iGenErrorCodeBySpanName, sb.toString());
                } else if (flag == SeedlingIntentFlagEnum.START.getFlag()) {
                    Logger.INSTANCE.i(TAG, "endCompleteNodeTrace end spanName=106");
                    UTrace.end$default(fromJsonString, null, false, 6, null);
                } else {
                    Logger.INSTANCE.i(TAG, "endCompleteNodeTrace complete spanName=106");
                }
                UTrace.end$default(fromJsonString, CompletionType.COMPLETE, false, 4, null);
            }
            Logger.INSTANCE.i(TAG, "endIntentTrace traceCtx=" + traceCtxJson + ",resultCode=" + resultCode);
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(TAG, "endIntentTrace error=" + th2.getMessage());
        }
    }

    @Override // com.oplus.pantanal.seedling.utrace.ITraceNode
    public void endNodeTrace(@Nullable String traceCtxStr, boolean isComplete) {
        Object obj;
        if (traceCtxStr == null || traceCtxStr.length() == 0) {
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            UTraceContext fromJsonString = UTraceCompat.INSTANCE.readFromJsonString(traceCtxStr);
            Logger logger = Logger.INSTANCE;
            logger.i(TAG, "endNodeTrace traceCtxStr=" + traceCtxStr);
            Unit unit = null;
            if (fromJsonString != null) {
                if (isComplete) {
                    UTrace.end$default(fromJsonString, CompletionType.COMPLETE, false, 4, null);
                } else {
                    UTrace.end$default(fromJsonString, null, false, 6, null);
                }
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                logger.e(TAG, traceCtxStr + " endTrace has error:readFromJsonString is null");
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(TAG, "endTrace has error:" + th2.getMessage());
        }
    }

    @Override // com.oplus.pantanal.seedling.utrace.ITraceNode
    public void errorCodeTrace(@Nullable Bundle bundle, int errorCode, @NotNull String errorMsg) {
        Object obj;
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        if (bundle == null) {
            Logger.INSTANCE.i(TAG, "errorCode=" + errorCode + ",errorCodeTrace traceCtxStr is null.");
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            UTraceContext traceContext = TraceNodeHelperKt.getTraceContext(bundle, "SecondTermTraceContext");
            Logger logger = Logger.INSTANCE;
            logger.i(TAG, "errorCodeTrace errorCode=" + errorCode + ".traceCtx=" + traceContext);
            Unit unit = null;
            if (traceContext != null) {
                UTrace.error(traceContext, errorCode, errorMsg);
                UTrace.end$default(traceContext, CompletionType.COMPLETE, false, 4, null);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                logger.e(TAG, "errorCode=" + errorCode + ":readFromJsonString is null.errorCode=" + errorCode);
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(TAG, "errorCodeTrace msg=" + th2.getMessage() + ".errorCode=" + errorCode);
        }
    }

    @Override // com.oplus.pantanal.seedling.utrace.ITraceNode
    public void errorNodeTrace(@Nullable String traceCtxStr, @NotNull String spanName, @NotNull String errorMsg) {
        Object obj;
        Intrinsics.checkNotNullParameter(spanName, UTraceSQLiteHelperKt.COL_SPAN_NAME);
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        if (traceCtxStr == null || traceCtxStr.length() == 0) {
            Logger.INSTANCE.i(TAG, "errorNodeTrace traceCtxStr is null.");
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            int iGenErrorCodeBySpanName = INSTANCE.genErrorCodeBySpanName(spanName);
            UTraceContext fromJsonString = UTraceCompat.INSTANCE.readFromJsonString(traceCtxStr);
            Logger logger = Logger.INSTANCE;
            logger.i(TAG, "errorNodeTrace spanName=" + spanName + ".traceCtx=" + fromJsonString);
            Unit unit = null;
            if (fromJsonString != null) {
                UTrace.error(fromJsonString, iGenErrorCodeBySpanName, errorMsg);
                UTrace.end$default(fromJsonString, CompletionType.COMPLETE, false, 4, null);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                logger.e(TAG, traceCtxStr + " errorTrace has error:readFromJsonString is null.spanName=" + spanName);
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(TAG, "errorNodeTrace has error:" + th2.getMessage());
        }
    }

    @Override // com.oplus.pantanal.seedling.utrace.ITraceNode
    @NotNull
    public String startHeadCodeTrace(@NotNull String spanName, @NotNull Map<String, String> tags, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(spanName, UTraceSQLiteHelperKt.COL_SPAN_NAME);
        Intrinsics.checkNotNullParameter(tags, UTraceSQLiteHelperKt.COL_TAGS);
        try {
            Result.Companion companion = Result.Companion;
            Logger.INSTANCE.i(TAG, "startHeadCodeTrace spanName=" + spanName);
            UTraceContext uTraceContextStartHead$default = UTrace.startHead$default(null, spanName, null, 5, null);
            if (bundle != null) {
                TraceNodeHelperKt.saveTraceContext(bundle, uTraceContextStartHead$default, "SecondTermTraceContext");
            }
            UTrace.addSpanTags(uTraceContextStartHead$default, tags);
            UTrace.addTraceTags(uTraceContextStartHead$default, UtilsKt.genVersionNameMap());
            return UTraceCompat.INSTANCE.writeToJsonString(uTraceContextStartHead$default);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return "";
            }
            Logger.INSTANCE.e(TAG, "startHeadCodeTrace spanName=" + spanName + " error=" + th2.getMessage());
            return "";
        }
    }

    @Override // com.oplus.pantanal.seedling.utrace.ITraceNode
    @NotNull
    public String startHeadNodeTrace(@NotNull String pkgName, @NotNull SeedlingIntent intent, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(pkgName, TraceConstants.KEY_PKG_NAME);
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        try {
            Result.Companion companion = Result.Companion;
            UTraceContext uTraceContextStartHead$default = UTrace.startHead$default(null, CODE_SINGLE_ACTION, SpanType.IntentTrace, 1, null);
            HashMap<String, String> map = new HashMap<>();
            map.put(TraceConstants.KEY_PKG_NAME, pkgName);
            INSTANCE.initIntentParams(intent, map);
            UTrace.addTraceTags(uTraceContextStartHead$default, map);
            TraceNodeHelperKt.saveTraceContext(bundle, uTraceContextStartHead$default);
            Logger.INSTANCE.i(TAG, "startTrace spanName=" + CODE_SINGLE_ACTION);
            return UTraceCompat.INSTANCE.writeToJsonString(uTraceContextStartHead$default);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return "";
            }
            Logger.INSTANCE.e(TAG, "startTrace error=" + th2.getMessage());
            return "";
        }
    }

    @Override // com.oplus.pantanal.seedling.utrace.ITraceNode
    @NotNull
    public String startNodeTrace(@NotNull Bundle bundle, @NotNull String spanName, @Nullable Map<String, String> tags) {
        Object obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(spanName, UTraceSQLiteHelperKt.COL_SPAN_NAME);
        try {
            Result.Companion companion = Result.Companion;
            UTraceContext traceContext = TraceNodeHelperKt.getTraceContext(bundle);
            Logger.INSTANCE.i(TAG, "startTrace spanName=" + spanName + ".parentTraceCtx=" + traceContext);
            if (traceContext != null) {
                UTraceContext uTraceContextStart$default = UTrace.start$default(traceContext, null, spanName, 2, null);
                TraceNodeHelperKt.saveTraceContext(bundle, uTraceContextStart$default);
                if (tags != null) {
                    UTrace.addSpanTags(traceContext, tags);
                }
                UTrace.addTraceTags(traceContext, UtilsKt.genVersionNameMap());
                return UTraceCompat.INSTANCE.writeToJsonString(uTraceContextStart$default);
            }
            obj = Result.constructor-impl((Object) null);
            Throwable th = Result.exceptionOrNull-impl(obj);
            if (th == null) {
                return "";
            }
            Logger.INSTANCE.e(TAG, "startTrace error=" + th.getMessage());
            return "";
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th2));
        }
    }

    @Override // com.oplus.pantanal.seedling.utrace.ITraceNode
    public void errorCodeTrace(@Nullable String traceCtxStr, int errorCode, @NotNull String errorMsg) {
        Object obj;
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        if (traceCtxStr == null || traceCtxStr.length() == 0) {
            Logger.INSTANCE.i(TAG, "errorNodeTrace traceCtxStr is null.");
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            UTraceContext fromJsonString = UTraceCompat.INSTANCE.readFromJsonString(traceCtxStr);
            Logger logger = Logger.INSTANCE;
            logger.i(TAG, "errorCodeTrace errorCode=" + errorCode + ".traceCtx=" + fromJsonString);
            Unit unit = null;
            if (fromJsonString != null) {
                UTrace.error(fromJsonString, errorCode, errorMsg);
                UTrace.end$default(fromJsonString, CompletionType.COMPLETE, false, 4, null);
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                logger.e(TAG, traceCtxStr + " errorCodeTrace has error:readFromJsonString is null.errorCode=" + errorCode);
            }
            obj = Result.constructor-impl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            Logger.INSTANCE.e(TAG, "errorCodeTrace msg=" + th2.getMessage() + ".errorCode=" + errorCode);
        }
    }

    @Override // com.oplus.pantanal.seedling.utrace.ITraceNode
    @NotNull
    public String startHeadNodeTrace(@NotNull String pkgName, @NotNull List<SeedlingIntent> intents, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(pkgName, TraceConstants.KEY_PKG_NAME);
        Intrinsics.checkNotNullParameter(intents, "intents");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        try {
            Result.Companion companion = Result.Companion;
            UTraceContext uTraceContextStartHead$default = UTrace.startHead$default(null, CODE_MULTIPLE_ACTION, SpanType.IntentTrace, 1, null);
            HashMap<String, String> map = new HashMap<>();
            map.put(TraceConstants.KEY_PKG_NAME, pkgName);
            INSTANCE.initIntentListParams(intents, map);
            UTrace.addTraceTags(uTraceContextStartHead$default, map);
            TraceNodeHelperKt.saveTraceContext(bundle, uTraceContextStartHead$default);
            Logger.INSTANCE.i(TAG, "startTrace spanName=" + CODE_MULTIPLE_ACTION);
            return UTraceCompat.INSTANCE.writeToJsonString(uTraceContextStartHead$default);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Throwable th2 = Result.exceptionOrNull-impl(Result.constructor-impl(ResultKt.createFailure(th)));
            if (th2 == null) {
                return "";
            }
            Logger.INSTANCE.e(TAG, "startTrace error=" + th2.getMessage());
            return "";
        }
    }

    @Override // com.oplus.pantanal.seedling.utrace.ITraceNode
    @NotNull
    public String startNodeTrace(@NotNull String traceCtxJson, @NotNull String spanName, @Nullable Map<String, String> tags) {
        Object obj;
        Intrinsics.checkNotNullParameter(traceCtxJson, "traceCtxJson");
        Intrinsics.checkNotNullParameter(spanName, UTraceSQLiteHelperKt.COL_SPAN_NAME);
        try {
            Result.Companion companion = Result.Companion;
            UTraceCompat uTraceCompat = UTraceCompat.INSTANCE;
            UTraceContext fromJsonString = uTraceCompat.readFromJsonString(traceCtxJson);
            Logger.INSTANCE.i(TAG, "startTrace spanName=" + spanName + ".parentTraceCtx=" + fromJsonString);
            if (fromJsonString != null) {
                UTraceContext uTraceContextStart$default = UTrace.start$default(fromJsonString, null, spanName, 2, null);
                if (tags != null) {
                    UTrace.addSpanTags(fromJsonString, tags);
                }
                UTrace.addTraceTags(fromJsonString, UtilsKt.genVersionNameMap());
                return uTraceCompat.writeToJsonString(uTraceContextStart$default);
            }
            obj = Result.constructor-impl((Object) null);
            Throwable th = Result.exceptionOrNull-impl(obj);
            if (th == null) {
                return "";
            }
            Logger.INSTANCE.e(TAG, "startTrace error=" + th.getMessage());
            return "";
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th2));
        }
    }
}
