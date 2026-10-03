package com.oplus.seedling.sdk.statistics;

import android.content.Context;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.ht9;
import com.oplus.aiunit.vision.s8e;
import com.pantanal.fundation.internal.thread.DispatchersUtil;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0007J\u0010\u0010C\u001a\u00020\u00042\u0006\u0010D\u001a\u00020EH\u0007J\u0010\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020HH\u0007J\u0010\u0010F\u001a\u00020\u00042\u0006\u0010G\u001a\u00020@H\u0007J:\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00042\u0016\b\u0002\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010O2\b\b\u0002\u0010P\u001a\u00020\u0004H\u0007J:\u0010Q\u001a\u00020J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\u00042\u0016\b\u0002\u0010N\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010O2\b\b\u0002\u0010P\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00103R\u001b\u00106\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b8\u00109R\u000e\u0010;\u001a\u00020<X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, d2 = {"Lcom/oplus/seedling/sdk/statistics/StatisticsTrackUtil;", "", "()V", "BUSINESS_TAG", "", "EVENT_ID_DATABASE_UPGRADE_ERROR", "EVENT_ID_DECISION_LIST_EMPTY", "EVENT_ID_GROUP_CARD_STATE", "EVENT_ID_LOAD_CLASS_ERROR", "EVENT_ID_PANTANAL_SDK_INIT_INFO", "EVENT_ID_PLUGIN_INIT", "EVENT_ID_SEEDLINGSDK_CARD_TYPE_ERROR", "EVENT_ID_ULE_CLIENT_ERROR", "EVENT_ID_ULE_LOAD_STATUS", "EVENT_ID_UPDATE_DATA_IGNORE", "EVENT_ID_UPK_STATUS", "EVENT_TAG", "KEY_CARD_TYPE", "KEY_CONFIG_COUNT", "KEY_DURATION", "KEY_ENGINE_TYPE", "KEY_ENTRANCE", "KEY_ENTRANCE_PKG_NAME", "KEY_ERROR_CODE", "KEY_EVENT", "KEY_FP_TIME", "KEY_FROM_VERSION", "KEY_GROUP_CARD_SERVICE_ID", "KEY_HOST_ID", "KEY_INITIALIZATION_TIME", "KEY_LAST_TS", "KEY_LOAD_TIME_OUT", "KEY_MESSAGE", "KEY_PACKAGE_NAME", "KEY_PANTA_SDK_HASH", "KEY_SERVICE_ID", "KEY_SHOULD_NOTIFY_CARD_SERVICE_TO_INIT", "KEY_START_LOADING", "KEY_STATE", "KEY_STATUS", "KEY_SUPPORTED_CARD_CATEGORY", "KEY_SUPPORT_ENTRANCE", "KEY_THIS_TS", "KEY_TOTAL_COUNT", "KEY_TO_VERSION", "KEY_UPLOAD_TIME_STAMP", "KEY_VERSION", "TAG", "dateFormat", "Ljava/text/SimpleDateFormat;", "getDateFormat", "()Ljava/text/SimpleDateFormat;", "dateFormat$delegate", "Lkotlin/Lazy;", "decimalInt4", "Ljava/text/DecimalFormat;", "getDecimalInt4", "()Ljava/text/DecimalFormat;", "decimalInt4$delegate", "statisticsScope", "Lkotlinx/coroutines/CoroutineScope;", "delayTask", "Lkotlinx/coroutines/Job;", "timeOut", "", "task", "Ljava/lang/Runnable;", "formatInt4", "int", "", "getDateText", "date", "Ljava/util/Date;", "uploadBusinessTrack", "", "context", "Landroid/content/Context;", "eventId", "data", "", "logTag", "uploadTechTrack", "foundation-internal_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class StatisticsTrackUtil {

    @NotNull
    private static final String BUSINESS_TAG = "business_tag";

    @NotNull
    public static final String EVENT_ID_DATABASE_UPGRADE_ERROR = "seedlingsdk_database_upgrade_error";

    @NotNull
    public static final String EVENT_ID_DECISION_LIST_EMPTY = "seedlingsdk_decision_list_empty";

    @NotNull
    public static final String EVENT_ID_GROUP_CARD_STATE = "group_card_state";

    @NotNull
    public static final String EVENT_ID_LOAD_CLASS_ERROR = "seedlingsdk_plugin_load_class_error";

    @NotNull
    public static final String EVENT_ID_PANTANAL_SDK_INIT_INFO = "pantanal_sdk_init_info";

    @NotNull
    public static final String EVENT_ID_PLUGIN_INIT = "seedlingsdk_plugin_init";

    @NotNull
    public static final String EVENT_ID_SEEDLINGSDK_CARD_TYPE_ERROR = "seedlingsdk_card_type_error";

    @NotNull
    public static final String EVENT_ID_ULE_CLIENT_ERROR = "seedlingsdk_ule_client_error";

    @NotNull
    public static final String EVENT_ID_ULE_LOAD_STATUS = "ule_load_status";

    @NotNull
    public static final String EVENT_ID_UPDATE_DATA_IGNORE = "seedlingsdk_update_data_ignore";

    @NotNull
    public static final String EVENT_ID_UPK_STATUS = "seedlingsdk_upk_status";

    @NotNull
    private static final String EVENT_TAG = "event_tag";

    @NotNull
    public static final String KEY_CARD_TYPE = "card_type";

    @NotNull
    public static final String KEY_CONFIG_COUNT = "config_count";

    @NotNull
    public static final String KEY_DURATION = "duration";

    @NotNull
    public static final String KEY_ENGINE_TYPE = "engine_type";

    @NotNull
    public static final String KEY_ENTRANCE = "entrance";

    @NotNull
    public static final String KEY_ENTRANCE_PKG_NAME = "entrance_pkg_name";

    @NotNull
    public static final String KEY_ERROR_CODE = "error_code";

    @NotNull
    public static final String KEY_EVENT = "event";

    @NotNull
    public static final String KEY_FP_TIME = "fp_time";

    @NotNull
    public static final String KEY_FROM_VERSION = "from_version";

    @NotNull
    public static final String KEY_GROUP_CARD_SERVICE_ID = "service_id";

    @NotNull
    public static final String KEY_HOST_ID = "host_id";

    @NotNull
    public static final String KEY_INITIALIZATION_TIME = "init_time";

    @NotNull
    public static final String KEY_LAST_TS = "last_ts";

    @NotNull
    public static final String KEY_LOAD_TIME_OUT = "load_time_out";

    @NotNull
    public static final String KEY_MESSAGE = "message";

    @NotNull
    public static final String KEY_PACKAGE_NAME = "packagename";

    @NotNull
    public static final String KEY_PANTA_SDK_HASH = "panta_sdk_hash";

    @NotNull
    public static final String KEY_SERVICE_ID = "serviceId";

    @NotNull
    public static final String KEY_SHOULD_NOTIFY_CARD_SERVICE_TO_INIT = "should_notify_card_service_to_init";

    @NotNull
    public static final String KEY_START_LOADING = "start_load";

    @NotNull
    public static final String KEY_STATE = "state";

    @NotNull
    public static final String KEY_STATUS = "status";

    @NotNull
    public static final String KEY_SUPPORTED_CARD_CATEGORY = "supported_card_category";

    @NotNull
    public static final String KEY_SUPPORT_ENTRANCE = "support_entrance";

    @NotNull
    public static final String KEY_THIS_TS = "this_ts";

    @NotNull
    public static final String KEY_TOTAL_COUNT = "total_count";

    @NotNull
    public static final String KEY_TO_VERSION = "to_version";

    @NotNull
    private static final String KEY_UPLOAD_TIME_STAMP = "upload_timestamp";

    @NotNull
    public static final String KEY_VERSION = "version";

    @NotNull
    private static final String TAG = "StatisticsTrackUtil";

    @NotNull
    public static final StatisticsTrackUtil INSTANCE = new StatisticsTrackUtil();

    @NotNull
    private static final Lazy dateFormat$delegate = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.oplus.seedling.sdk.statistics.StatisticsTrackUtil$dateFormat$2
        @NotNull
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        }
    });

    @NotNull
    private static final Lazy decimalInt4$delegate = LazyKt.lazy(new Function0<DecimalFormat>() { // from class: com.oplus.seedling.sdk.statistics.StatisticsTrackUtil$decimalInt4$2
        @NotNull
        public final DecimalFormat invoke() {
            return new DecimalFormat("0000");
        }
    });

    @NotNull
    private static final CoroutineScope statisticsScope = CoroutineScopeKt.CoroutineScope(DispatchersUtil.q());

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "com.oplus.seedling.sdk.statistics.StatisticsTrackUtil$delayTask$1", f = "StatisticsTrackUtil.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
    public static final class 1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Runnable $task;
        final /* synthetic */ long $timeOut;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(long j, Runnable runnable, Continuation<? super 1> continuation) {
            super(2, continuation);
            this.$timeOut = j;
            this.$task = runnable;
        }

        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new 1(this.$timeOut, this.$task, continuation);
        }

        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.$timeOut;
                this.label = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.$task.run();
            return Unit.INSTANCE;
        }

        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }
    }

    private StatisticsTrackUtil() {
    }

    @JvmStatic
    @NotNull
    public static final Job delayTask(long timeOut, @NotNull Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        return BuildersKt.launch$default(statisticsScope, (CoroutineContext) null, (CoroutineStart) null, new 1(timeOut, task, null), 3, (Object) null);
    }

    @JvmStatic
    @NotNull
    public static final String formatInt4(int i) {
        String str = INSTANCE.getDecimalInt4().format(Integer.valueOf(i));
        Intrinsics.checkNotNullExpressionValue(str, "decimalInt4.format(int)");
        return str;
    }

    private final SimpleDateFormat getDateFormat() {
        return (SimpleDateFormat) dateFormat$delegate.getValue();
    }

    @JvmStatic
    @NotNull
    public static final String getDateText(long date) {
        String str = INSTANCE.getDateFormat().format(new Date(date));
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(Date(date))");
        return str;
    }

    private final DecimalFormat getDecimalInt4() {
        return (DecimalFormat) decimalInt4$delegate.getValue();
    }

    @JvmStatic
    public static final void uploadBusinessTrack(@NotNull Context context, @NotNull String eventId, @Nullable Map<String, String> data, @NotNull String logTag) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(BuildersKt.launch$default(statisticsScope, (CoroutineContext) null, (CoroutineStart) null, new StatisticsTrackUtil$uploadBusinessTrack$1$1(data, context, logTag, eventId, null), 3, (Object) null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ht9.a.b(s8e.INSTANCE, TAG, "uploadBusinessTrack error, msg: " + th2.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
    }

    public static /* synthetic */ void uploadBusinessTrack$default(Context context, String str, Map map, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            str2 = BUSINESS_TAG;
        }
        uploadBusinessTrack(context, str, map, str2);
    }

    @JvmStatic
    public static final void uploadTechTrack(@NotNull Context context, @NotNull String eventId, @Nullable Map<String, String> data, @NotNull String logTag) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(logTag, "logTag");
        try {
            Result.Companion companion = Result.Companion;
            obj = Result.constructor-impl(BuildersKt.launch$default(statisticsScope, (CoroutineContext) null, (CoroutineStart) null, new StatisticsTrackUtil$uploadTechTrack$1$1(data, context, logTag, eventId, null), 3, (Object) null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Throwable th2 = Result.exceptionOrNull-impl(obj);
        if (th2 != null) {
            ht9.a.b(s8e.INSTANCE, TAG, "uploadTechTrack error, msg: " + th2.getMessage(), false, (String) null, false, 0, false, (Throwable) null, 252, (Object) null);
        }
    }

    public static /* synthetic */ void uploadTechTrack$default(Context context, String str, Map map, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            str2 = EVENT_TAG;
        }
        uploadTechTrack(context, str, map, str2);
    }

    @JvmStatic
    @NotNull
    public static final String getDateText(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        String str = INSTANCE.getDateFormat().format(date);
        Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(date)");
        return str;
    }
}
