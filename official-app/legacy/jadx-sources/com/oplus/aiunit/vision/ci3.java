package com.oplus.aiunit.vision;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.heytap.health.settings.watch.sporthealthsettings2.ui.collaborationRelated.CloudDownloadWorker;
import com.heytap.log.consts.LogSenderConst;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/ci3;", "", "", "url", LogSenderConst.FILENAME, "fileMd5", CloudDownloadWorker.KEY_SECRET, "tempDir", "decryptDir", "", "c", "a", "", "b", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCloudDownloadServiceHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudDownloadServiceHelper.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/CloudDownloadServiceHelper\n+ 2 Data.kt\nandroidx/work/DataKt\n+ 3 OneTimeWorkRequest.kt\nandroidx/work/OneTimeWorkRequestKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n31#2,5:105\n105#3:110\n1747#4,3:111\n*S KotlinDebug\n*F\n+ 1 CloudDownloadServiceHelper.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/CloudDownloadServiceHelper\n*L\n44#1:105,5\n54#1:110\n97#1:111,3\n*E\n"})
public final class ci3 {
    public static final int $stable = 0;

    @NotNull
    public static final ci3 INSTANCE = new ci3();

    public final void a() {
        try {
            Context context = b78.a();
            WorkManager.Companion companion = WorkManager.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            companion.getInstance(context).cancelUniqueWork(CloudDownloadWorker.WORK_NAME);
            a7b.f("CloudDownloadServiceHelper", "cancelDownload: 下载任务已取消");
        } catch (Exception e2) {
            a7b.c("CloudDownloadServiceHelper", "cancelDownload: 取消下载任务失败", e2);
        }
    }

    public final boolean b() {
        try {
            Context context = b78.a();
            WorkManager.Companion companion = WorkManager.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            List<WorkInfo> workInfos = companion.getInstance(context).getWorkInfosForUniqueWork(CloudDownloadWorker.WORK_NAME).get();
            Intrinsics.checkNotNullExpressionValue(workInfos, "workInfos");
            List<WorkInfo> list = workInfos;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((WorkInfo) it.next()).getState().isFinished()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            a7b.c("CloudDownloadServiceHelper", "hasRunningDownload: 检查下载任务状态失败", e2);
            return false;
        }
    }

    public final void c(@NotNull String url, @NotNull String fileName, @Nullable String fileMd5, @NotNull String secret, @NotNull String tempDir, @NotNull String decryptDir) throws Exception {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(tempDir, "tempDir");
        Intrinsics.checkNotNullParameter(decryptDir, "decryptDir");
        try {
            Context context = b78.a();
            WorkManager.Companion companion = WorkManager.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(context, "context");
            WorkManager companion2 = companion.getInstance(context);
            Constraints constraintsBuild = new Constraints.Builder().setRequiresStorageNotLow(true).build();
            Pair[] pairArr = new Pair[6];
            pairArr[0] = TuplesKt.to("url", url);
            pairArr[1] = TuplesKt.to("file_name", fileName);
            if (fileMd5 == null) {
                fileMd5 = "";
            }
            pairArr[2] = TuplesKt.to(CloudDownloadWorker.KEY_FILE_MD5, fileMd5);
            pairArr[3] = TuplesKt.to(CloudDownloadWorker.KEY_SECRET, secret);
            pairArr[4] = TuplesKt.to(CloudDownloadWorker.KEY_TEMP_DIR, tempDir);
            pairArr[5] = TuplesKt.to(CloudDownloadWorker.KEY_DECRYPT_DIR, decryptDir);
            Data.Builder builder = new Data.Builder();
            for (int i = 0; i < 6; i++) {
                Pair pair = pairArr[i];
                builder.put((String) pair.getFirst(), pair.getSecond());
            }
            companion2.enqueueUniqueWork(CloudDownloadWorker.WORK_NAME, ExistingWorkPolicy.REPLACE, new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) CloudDownloadWorker.class).setConstraints(constraintsBuild).setInputData(builder.build()).build());
            a7b.f("CloudDownloadServiceHelper", "startDownload: 下载任务已启动, fileName=" + fileName);
        } catch (Exception e2) {
            a7b.c("CloudDownloadServiceHelper", "startDownload: 启动下载任务失败", e2);
            throw e2;
        }
    }
}
