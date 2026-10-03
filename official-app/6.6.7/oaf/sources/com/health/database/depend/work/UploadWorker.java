package com.health.database.depend.work;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.health.database.depend.work.config.CloudConfigListBean;
import com.health.database.depend.work.config.SyncDataCloudConfig;
import com.health.database.depend.work.config.TimeRangeSyncRateImpl;
import com.heytap.accessory.constant.Constants;
import com.heytap.databaseengine.api.ISportHealthDataAPI;
import com.heytap.databaseengine.api.SportHealthDataAPI;
import com.heytap.databaseengine.option.DataSyncOption;
import com.heytap.health.base.oplus.power.HealthPowerManger;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.o15;
import com.oplus.aiunit.vision.vd8;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u0012"}, d2 = {"Lcom/health/database/depend/work/UploadWorker;", "Landroidx/work/Worker;", "Landroidx/work/ListenableWorker$Result;", "doWork", "c", "Lcom/health/database/depend/work/config/CloudConfigListBean;", "syncDataCloudConfigBean", "", "e", "b", "", "d", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", Constants.EXTRA_PARAMS, "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "depend_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUploadWorkImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadWorkImpl.kt\ncom/health/database/depend/work/UploadWorker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n1855#2,2:159\n*S KotlinDebug\n*F\n+ 1 UploadWorkImpl.kt\ncom/health/database/depend/work/UploadWorker\n*L\n117#1:159,2\n*E\n"})
public final class UploadWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParameters, Constants.EXTRA_PARAMS);
    }

    public final boolean b() {
        return Math.abs(System.currentTimeMillis() - o15.q(System.currentTimeMillis())) < 600000 || Math.abs(System.currentTimeMillis() - o15.l(System.currentTimeMillis())) < 600000;
    }

    public final ListenableWorker.Result c() {
        List<CloudConfigListBean> config;
        SyncDataCloudConfig syncDataCloudConfig = (SyncDataCloudConfig) vd8.a(fdg.x(TimeRangeSyncRateImpl.CLOUD_CONFIG).D(TimeRangeSyncRateImpl.SYNC_DATA_TIME_RANGE), SyncDataCloudConfig.class);
        if (syncDataCloudConfig != null && syncDataCloudConfig.getSwitchStatus() != 0 && (config = syncDataCloudConfig.getConfig()) != null) {
            Iterator<T> it = config.iterator();
            while (it.hasNext()) {
                if (e((CloudConfigListBean) it.next())) {
                    ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
                    Intrinsics.checkNotNullExpressionValue(resultFailure, "failure()");
                    return resultFailure;
                }
            }
        }
        ISportHealthDataAPI sportHealthDataAPI = SportHealthDataAPI.getInstance();
        DataSyncOption dataSyncOption = new DataSyncOption(0, 0, 0, 0, (String) null, (String) null, 0L, 127, (DefaultConstructorMarker) null);
        dataSyncOption.setSyncAction(0);
        dataSyncOption.setSyncDataType(1000);
        sportHealthDataAPI.synCloud(dataSyncOption).c();
        m8b.f("UploadWorker", "upload data finish");
        d();
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "success()");
        return resultSuccess;
    }

    public final void d() {
        m8b.f("UploadWorker", "sendDbSyncAllBc");
        Intent intent = new Intent("ACTION_DB_SYNC_ALL");
        intent.setPackage(e88.a().getPackageName());
        e88.a().sendBroadcast(intent);
    }

    @NotNull
    public ListenableWorker.Result doWork() {
        if (b()) {
            m8b.f("UploadWorker", "less 10 minutes near midnight");
            ListenableWorker.Result resultFailure = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure, "failure()");
            return resultFailure;
        }
        if (HealthPowerManger.Companion.a().q()) {
            m8b.f("UploadWorker", "doWork skip, health power controlled");
            ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure2, "failure()");
            return resultFailure2;
        }
        if (o15.i(System.currentTimeMillis()) == fdg.x(TimeRangeSyncRateImpl.CLOUD_CONFIG).y(TimeRangeSyncRateImpl.QUERY_CONFIG_DATE) && !TextUtils.isEmpty(fdg.x(TimeRangeSyncRateImpl.CLOUD_CONFIG).D(TimeRangeSyncRateImpl.SYNC_DATA_TIME_RANGE))) {
            return c();
        }
        TimeRangeSyncRateImpl.INSTANCE.c();
        return c();
    }

    public final boolean e(CloudConfigListBean syncDataCloudConfigBean) {
        int iNextInt;
        m8b.f("UploadWorker", "timeRangeCannotSync enter");
        if (System.currentTimeMillis() - o15.q(System.currentTimeMillis()) < syncDataCloudConfigBean.getStartTime() * 60000 || System.currentTimeMillis() - o15.q(System.currentTimeMillis()) > syncDataCloudConfigBean.getEndTime() * 60000 || (iNextInt = Random.Default.nextInt(0, 100)) <= syncDataCloudConfigBean.getRate()) {
            return false;
        }
        m8b.f("UploadWorker", "timeRangeCannotSync startTime:" + syncDataCloudConfigBean.getStartTime() + ", endTime:" + syncDataCloudConfigBean.getEndTime() + ", rate:" + syncDataCloudConfigBean.getRate() + ", random:" + iNextInt);
        return true;
    }
}
