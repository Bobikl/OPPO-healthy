package com.health.database.depend.work.config;

import com.oplus.aiunit.vision.zr8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/health/database/depend/work/config/TimeRangeSyncRateImpl;", "", "Companion", "depend_release"}, k = 1, mv = {1, 8, 0})
public final class TimeRangeSyncRateImpl {

    @NotNull
    public static final String CLOUD_CONFIG = "CLOUD_CONFIG";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String QUERY_CONFIG_DATE = "QUERY_CONFIG_DATE";

    @NotNull
    public static final String SYNC_DATA_TIME_RANGE = "SYNC_DATA_TIME_RANGE";

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001b\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/health/database/depend/work/config/TimeRangeSyncRateImpl$Companion;", "", "", "c", "Lcom/health/database/depend/work/config/SyncDataCloudConfig;", "config", "b", "(Lcom/health/database/depend/work/config/SyncDataCloudConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", TimeRangeSyncRateImpl.CLOUD_CONFIG, "Ljava/lang/String;", TimeRangeSyncRateImpl.QUERY_CONFIG_DATE, TimeRangeSyncRateImpl.SYNC_DATA_TIME_RANGE, "TAG", "<init>", "()V", "depend_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object b(SyncDataCloudConfig syncDataCloudConfig, Continuation<? super Unit> continuation) {
            Object objWithContext = BuildersKt.withContext(zr8.INSTANCE.e(), new TimeRangeSyncRateImpl$Companion$processConfig$2(syncDataCloudConfig, null), continuation);
            return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
        }

        public final void c() {
            BuildersKt.runBlocking$default((CoroutineContext) null, new TimeRangeSyncRateImpl$Companion$queryCloudConfigData$1(null), 1, (Object) null);
        }
    }
}
