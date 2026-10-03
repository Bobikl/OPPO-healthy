package com.health.database.depend.work;

import android.content.Context;
import androidx.core.content.ContextCompat;
import androidx.work.Constraints;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.health.database.depend.IUploadWork;
import com.health.database.depend.work.UploadWorkImpl;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.m8b;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/health/database/depend/work/UploadWorkImpl;", "Lcom/health/database/depend/IUploadWork$Stub;", "", "work", "call", "<init>", "()V", "Companion", "a", "depend_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUploadWorkImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadWorkImpl.kt\ncom/health/database/depend/work/UploadWorkImpl\n+ 2 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n*L\n1#1,158:1\n105#2:159\n*S KotlinDebug\n*F\n+ 1 UploadWorkImpl.kt\ncom/health/database/depend/work/UploadWorkImpl\n*L\n62#1:159\n*E\n"})
public final class UploadWorkImpl extends IUploadWork.Stub {

    @NotNull
    public static final String API_PATH_UPLOAD_DATA = "upload_data_provider_path";

    @NotNull
    private static final String TAG = "UploadWorkImpl";

    @NotNull
    private static final String WORKER_TAG = "UPLOAD_DB_DATA";

    private final void work() {
        Context contextA = e88.a();
        Constraints constraintsBuild = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
        final int iRandom = RangesKt.random(new IntRange(1, 60), Random.Default);
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(UploadWorker.class).setConstraints(constraintsBuild).setInitialDelay(iRandom, TimeUnit.MINUTES).build();
        WorkManager.Companion companion = WorkManager.Companion;
        Intrinsics.checkNotNullExpressionValue(contextA, "context");
        final ListenableFuture workInfosForUniqueWork = companion.getInstance(contextA).getWorkInfosForUniqueWork(WORKER_TAG);
        m8b.f(TAG, "worker start, random:" + iRandom);
        workInfosForUniqueWork.addListener(new Runnable() { // from class: com.oplus.aiunit.vision.vpk
            @Override // java.lang.Runnable
            public final void run() {
                UploadWorkImpl.work$lambda$0(workInfosForUniqueWork, iRandom);
            }
        }, ContextCompat.getMainExecutor(contextA));
        companion.getInstance(contextA).enqueueUniqueWork(WORKER_TAG, ExistingWorkPolicy.KEEP, oneTimeWorkRequestBuild);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void work$lambda$0(ListenableFuture listenableFuture, int i) {
        Intrinsics.checkNotNullParameter(listenableFuture, "$listenableFuture");
        if (((List) listenableFuture.get()).isEmpty()) {
            return;
        }
        WorkInfo.State state = ((WorkInfo) ((List) listenableFuture.get()).get(0)).getState();
        m8b.f(TAG, "last worker state:" + state);
        if (state.compareTo(WorkInfo.State.SUCCEEDED) >= 0) {
            m8b.f(TAG, "enqueue work with delay minutes:" + i);
        }
    }

    @Override // com.health.database.depend.IUploadWork
    public void call() {
        work();
    }
}
