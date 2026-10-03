package androidx.work;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.work.impl.WorkManagerImpl;
import com.google.common.util.concurrent.ListenableFuture;
import com.heytap.webview.extension.cache.CacheConstants;
import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.ReplaceWith;
import p010kotlin.collections.CollectionsKt__CollectionsJVMKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 ;2\u00020\u0001:\u0002;<B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H&J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u0011\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H&J\b\u0010\u0012\u001a\u00020\u0013H&J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH&J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u001dJ\u0016\u0010\u001c\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010H&J \u0010\u001e\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\r\u001a\u00020!H&J \u0010\"\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J&\u0010\"\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H&J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H&J\u000e\u0010&\u001a\b\u0012\u0004\u0012\u00020%0'H&J\u0018\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0$2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0018\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0+2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0018\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0'2\u0006\u0010\u0018\u001a\u00020\u0019H&J\u001c\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00100$2\u0006\u0010.\u001a\u00020/H&J\u001c\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00100$2\u0006\u0010\u0015\u001a\u00020\nH&J\u001c\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00100+2\u0006\u0010\u0015\u001a\u00020\nH&J\u001c\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00100'2\u0006\u0010\u0015\u001a\u00020\nH&J\u001c\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00100+2\u0006\u0010.\u001a\u00020/H&J\u001c\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00100$2\u0006\u0010\t\u001a\u00020\nH&J\u001c\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00100+2\u0006\u0010\t\u001a\u00020\nH&J\u001c\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00100'2\u0006\u0010\t\u001a\u00020\nH&J\u001c\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00100'2\u0006\u0010.\u001a\u00020/H&J\b\u00108\u001a\u00020\u0013H&J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020:0$2\u0006\u0010\r\u001a\u00020\u001dH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006="}, d2 = {"Landroidx/work/WorkManager;", "", "()V", CacheConstants.Word.CONFIGURATION, "Landroidx/work/Configuration;", "getConfiguration", "()Landroidx/work/Configuration;", "beginUniqueWork", "Landroidx/work/WorkContinuation;", "uniqueWorkName", "", "existingWorkPolicy", "Landroidx/work/ExistingWorkPolicy;", "request", "Landroidx/work/OneTimeWorkRequest;", "requests", "", "beginWith", "cancelAllWork", "Landroidx/work/Operation;", "cancelAllWorkByTag", "tag", "cancelUniqueWork", "cancelWorkById", "id", "Ljava/util/UUID;", "createCancelPendingIntent", "Landroid/app/PendingIntent;", "enqueue", "Landroidx/work/WorkRequest;", "enqueueUniquePeriodicWork", "existingPeriodicWorkPolicy", "Landroidx/work/ExistingPeriodicWorkPolicy;", "Landroidx/work/PeriodicWorkRequest;", "enqueueUniqueWork", "getLastCancelAllTimeMillis", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "getLastCancelAllTimeMillisLiveData", "Landroidx/lifecycle/LiveData;", "getWorkInfoById", "Landroidx/work/WorkInfo;", "getWorkInfoByIdFlow", "Lkotlinx/coroutines/flow/Flow;", "getWorkInfoByIdLiveData", "getWorkInfos", "workQuery", "Landroidx/work/WorkQuery;", "getWorkInfosByTag", "getWorkInfosByTagFlow", "getWorkInfosByTagLiveData", "getWorkInfosFlow", "getWorkInfosForUniqueWork", "getWorkInfosForUniqueWorkFlow", "getWorkInfosForUniqueWorkLiveData", "getWorkInfosLiveData", "pruneWork", "updateWork", "Landroidx/work/WorkManager$UpdateResult;", "Companion", "UpdateResult", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/work/WorkManager$UpdateResult;", "", "(Ljava/lang/String;I)V", "NOT_APPLIED", "APPLIED_IMMEDIATELY", "APPLIED_FOR_NEXT_RUN", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    @Deprecated(message = "Use the overload receiving Context", replaceWith = @ReplaceWith(expression = "WorkManager.getContext(context)", imports = {}))
    @JvmStatic
    @NotNull
    public static WorkManager getInstance() {
        return INSTANCE.getInstance();
    }

    @JvmStatic
    public static void initialize(@NotNull Context context, @NotNull Configuration configuration) {
        INSTANCE.initialize(context, configuration);
    }

    @JvmStatic
    public static boolean isInitialized() {
        return INSTANCE.isInitialized();
    }

    @NotNull
    public final WorkContinuation beginUniqueWork(@NotNull String uniqueWorkName, @NotNull ExistingWorkPolicy existingWorkPolicy, @NotNull OneTimeWorkRequest request) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(request, "request");
        return beginUniqueWork(uniqueWorkName, existingWorkPolicy, CollectionsKt__CollectionsJVMKt.listOf(request));
    }

    @NotNull
    public abstract WorkContinuation beginUniqueWork(@NotNull String uniqueWorkName, @NotNull ExistingWorkPolicy existingWorkPolicy, @NotNull List<OneTimeWorkRequest> requests);

    @NotNull
    public final WorkContinuation beginWith(@NotNull OneTimeWorkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return beginWith(CollectionsKt__CollectionsJVMKt.listOf(request));
    }

    @NotNull
    public abstract WorkContinuation beginWith(@NotNull List<OneTimeWorkRequest> requests);

    @NotNull
    public abstract Operation cancelAllWork();

    @NotNull
    public abstract Operation cancelAllWorkByTag(@NotNull String tag);

    @NotNull
    public abstract Operation cancelUniqueWork(@NotNull String uniqueWorkName);

    @NotNull
    public abstract Operation cancelWorkById(@NotNull UUID id);

    @NotNull
    public abstract PendingIntent createCancelPendingIntent(@NotNull UUID id);

    @NotNull
    public final Operation enqueue(@NotNull WorkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return enqueue(CollectionsKt__CollectionsJVMKt.listOf(request));
    }

    @NotNull
    public abstract Operation enqueue(@NotNull List<? extends WorkRequest> requests);

    @NotNull
    public abstract Operation enqueueUniquePeriodicWork(@NotNull String uniqueWorkName, @NotNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NotNull PeriodicWorkRequest request);

    @NotNull
    public Operation enqueueUniqueWork(@NotNull String uniqueWorkName, @NotNull ExistingWorkPolicy existingWorkPolicy, @NotNull OneTimeWorkRequest request) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(request, "request");
        return enqueueUniqueWork(uniqueWorkName, existingWorkPolicy, CollectionsKt__CollectionsJVMKt.listOf(request));
    }

    @NotNull
    public abstract Operation enqueueUniqueWork(@NotNull String uniqueWorkName, @NotNull ExistingWorkPolicy existingWorkPolicy, @NotNull List<OneTimeWorkRequest> requests);

    @NotNull
    public abstract Configuration getConfiguration();

    @NotNull
    public abstract ListenableFuture<Long> getLastCancelAllTimeMillis();

    @NotNull
    public abstract LiveData<Long> getLastCancelAllTimeMillisLiveData();

    @NotNull
    public abstract ListenableFuture<WorkInfo> getWorkInfoById(@NotNull UUID id);

    @NotNull
    public abstract Flow<WorkInfo> getWorkInfoByIdFlow(@NotNull UUID id);

    @NotNull
    public abstract LiveData<WorkInfo> getWorkInfoByIdLiveData(@NotNull UUID id);

    @NotNull
    public abstract ListenableFuture<List<WorkInfo>> getWorkInfos(@NotNull WorkQuery workQuery);

    @NotNull
    public abstract ListenableFuture<List<WorkInfo>> getWorkInfosByTag(@NotNull String tag);

    @NotNull
    public abstract Flow<List<WorkInfo>> getWorkInfosByTagFlow(@NotNull String tag);

    @NotNull
    public abstract LiveData<List<WorkInfo>> getWorkInfosByTagLiveData(@NotNull String tag);

    @NotNull
    public abstract Flow<List<WorkInfo>> getWorkInfosFlow(@NotNull WorkQuery workQuery);

    @NotNull
    public abstract ListenableFuture<List<WorkInfo>> getWorkInfosForUniqueWork(@NotNull String uniqueWorkName);

    @NotNull
    public abstract Flow<List<WorkInfo>> getWorkInfosForUniqueWorkFlow(@NotNull String uniqueWorkName);

    @NotNull
    public abstract LiveData<List<WorkInfo>> getWorkInfosForUniqueWorkLiveData(@NotNull String uniqueWorkName);

    @NotNull
    public abstract LiveData<List<WorkInfo>> getWorkInfosLiveData(@NotNull WorkQuery workQuery);

    @NotNull
    public abstract Operation pruneWork();

    @NotNull
    public abstract ListenableFuture<UpdateResult> updateWork(@NotNull WorkRequest request);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0017J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH\u0017J\b\u0010\u000b\u001a\u00020\fH\u0017¨\u0006\r"}, d2 = {"Landroidx/work/WorkManager$Companion;", "", "()V", "getInstance", "Landroidx/work/WorkManager;", "context", "Landroid/content/Context;", "initialize", "", CacheConstants.Word.CONFIGURATION, "Landroidx/work/Configuration;", "isInitialized", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Deprecated(message = "Use the overload receiving Context", replaceWith = @ReplaceWith(expression = "WorkManager.getContext(context)", imports = {}))
        @JvmStatic
        @NotNull
        public WorkManager getInstance() {
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance();
            if (workManagerImpl != null) {
                return workManagerImpl;
            }
            throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.".toString());
        }

        @JvmStatic
        public void initialize(@NotNull Context context, @NotNull Configuration configuration) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            WorkManagerImpl.initialize(context, configuration);
        }

        @JvmStatic
        public boolean isInitialized() {
            return WorkManagerImpl.isInitialized();
        }

        @JvmStatic
        @NotNull
        public WorkManager getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(context);
            Intrinsics.checkNotNullExpressionValue(workManagerImpl, "getInstance(context)");
            return workManagerImpl;
        }
    }

    @JvmStatic
    @NotNull
    public static WorkManager getInstance(@NotNull Context context) {
        return INSTANCE.getInstance(context);
    }
}
