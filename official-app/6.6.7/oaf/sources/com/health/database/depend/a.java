package com.health.database.depend;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.health.database.depend.IUploadWork;
import com.health.database.depend.work.UploadWorkImpl;
import com.heytap.accessory.constant.Constants;
import com.heytap.accessory.pair.seeker.DeviceEventManager;
import com.heytap.databaseengine.model.SleepIndex;
import com.heytap.databaseengineservice.db.AppDatabase;
import com.heytap.databaseengineservice.db.table.DBSleepIndex;
import com.heytap.health.base.sp.MultiProgressDataStoreRepository;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.base.track.quality.QualityTrack;
import com.heytap.health.base.track.quality.Scenes;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.cs8;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.ep9;
import com.oplus.aiunit.vision.fdg;
import com.oplus.aiunit.vision.i7k;
import com.oplus.aiunit.vision.if0;
import com.oplus.aiunit.vision.l9b;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.onh;
import com.oplus.aiunit.vision.rze;
import com.oplus.aiunit.vision.t15;
import com.oplus.aiunit.vision.tx4;
import com.oplus.aiunit.vision.yye;
import com.oplus.health.apiprovider.ClientManager;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001e\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\bA\u0010BJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\u0016\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u0010\u0010$\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0005H\u0016J \u0010)\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%H\u0016J(\u0010.\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\u0005H\u0016J\b\u0010/\u001a\u00020\u0016H\u0016J\u0010\u00101\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0005H\u0016J\u0010\u00102\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0005H\u0016JH\u0010;\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020\u000fH\u0016J \u0010?\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\u00052\u0006\u0010=\u001a\u00020\u00052\u0006\u0010>\u001a\u00020\u0005H\u0016J\u0010\u0010@\u001a\u00020\u00162\u0006\u00100\u001a\u00020\u0005H\u0016¨\u0006C"}, d2 = {"Lcom/health/database/depend/a;", "Lcom/oplus/aiunit/vision/ep9;", "Lcom/oplus/aiunit/vision/ep9$a;", "Landroid/content/Context;", "c", "", "f", "", "t", "isDebug", "k", DeviceEventManager.Event.KEY_TAG, "Ljava/util/concurrent/ExecutorService;", "d", "v", "", "threadCounts", "Ljava/util/concurrent/Executor;", "q", "caller", "Ljava/lang/Runnable;", "runnable", "", "a", "message", "i", "l", "u", "h", "w", "", "Lcom/heytap/databaseengineservice/db/table/DBSleepIndex;", "dbSleepIndexList", "Lcom/heytap/databaseengine/model/SleepIndex;", "b", "reason", "m", "", "pageId", "moduleId", "position1", "g", "api", "uid", "statusCode", "sdkVersion", "r", "e", "msg", "j", "o", "clientDataId", "deviceUniqueId", Constants.EXTRA_DEVICE_TYPE, "startTimestamp", "endTimestamp", "sportMode", "version", "source", "p", "dataUid", "dataClient", "dbUid", "s", "n", "<init>", "()V", "depend_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCommonDelegateImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonDelegateImpl.kt\ncom/health/database/depend/CommonDelegateImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
public final class a implements ep9, ep9.a {
    public void a(@NotNull String caller, @NotNull Runnable runnable) {
        Intrinsics.checkNotNullParameter(caller, "caller");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        ThreadUtils.doInBackground(caller, runnable);
    }

    @NotNull
    public SleepIndex b(@NotNull List<? extends DBSleepIndex> dbSleepIndexList) {
        List listC;
        SleepIndex sleepIndex;
        Intrinsics.checkNotNullParameter(dbSleepIndexList, "dbSleepIndexList");
        List listF = tx4.INSTANCE.F(dbSleepIndexList);
        return (listF == null || (listC = new onh().c(listF)) == null || (sleepIndex = (SleepIndex) listC.get(0)) == null) ? new SleepIndex() : sleepIndex;
    }

    @NotNull
    public Context c() {
        Context contextA = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        return contextA;
    }

    @NotNull
    public ExecutorService d(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, DeviceEventManager.Event.KEY_TAG);
        ExecutorService executorServiceE = cs8.e(tag);
        Intrinsics.checkNotNullExpressionValue(executorServiceE, "newSingleThreadExecutor(tag)");
        return executorServiceE;
    }

    public void e() {
        QualityTrack.INSTANCE.b(Scenes.DB_RECOVERY);
    }

    @NotNull
    public String f() {
        String strE = fdg.x("privacy_sync_data_state").E("privacy_data_sync_state", "0");
        Intrinsics.checkNotNullExpressionValue(strE, "getInstance(PrivacySyncM…TATE_CLOSED\n            )");
        return strE;
    }

    public void g(@NotNull Object pageId, @NotNull Object moduleId, @NotNull Object position1) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(position1, "position1");
    }

    public void h(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, DeviceEventManager.Event.KEY_TAG);
        Intrinsics.checkNotNullParameter(message, "message");
        if (if0.w()) {
            m8b.b(tag, message);
        } else {
            l9b.c(tag, message);
        }
    }

    public void i(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, DeviceEventManager.Event.KEY_TAG);
        Intrinsics.checkNotNullParameter(message, "message");
        if0.w();
    }

    public boolean isDebug() {
        return if0.s();
    }

    public void j(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        QualityTrack.INSTANCE.g(Scenes.DB_RECOVERY, msg);
    }

    @Nullable
    public String k() {
        return if0.n();
    }

    public void l(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, DeviceEventManager.Event.KEY_TAG);
        Intrinsics.checkNotNullParameter(message, "message");
        if (if0.w()) {
            m8b.f(tag, message);
        } else {
            l9b.f(tag, message);
        }
    }

    public void m(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        rze.z(reason);
    }

    public void n(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        com.heytap.health.base.track.a.p().a("appDatabase", msg).b();
    }

    public void o(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        QualityTrack.INSTANCE.e(Scenes.DB_RECOVERY, msg);
    }

    public void p(@NotNull String clientDataId, @NotNull String deviceUniqueId, @NotNull String deviceType, int startTimestamp, int endTimestamp, int sportMode, int version, int source) {
        Intrinsics.checkNotNullParameter(clientDataId, "clientDataId");
        Intrinsics.checkNotNullParameter(deviceUniqueId, "deviceUniqueId");
        Intrinsics.checkNotNullParameter(deviceType, Constants.EXTRA_DEVICE_TYPE);
        com.heytap.health.base.track.a.C().a("clientDataId", clientDataId).a("ssoid", cn.c().getSsoid()).a("deviceUniqueId", deviceUniqueId).a(Constants.EXTRA_DEVICE_TYPE, deviceType).a("startTimestamp", Integer.valueOf(startTimestamp)).a("endTimestamp", Integer.valueOf(endTimestamp)).a("sportMode", Integer.valueOf(sportMode)).a("version", Integer.valueOf(version)).a("display", 1).a("source", Integer.valueOf(source)).b();
    }

    @NotNull
    public Executor q(@NotNull String tag, int threadCounts) {
        Intrinsics.checkNotNullParameter(tag, DeviceEventManager.Event.KEY_TAG);
        Executor executorC = cs8.c(tag, threadCounts);
        Intrinsics.checkNotNullExpressionValue(executorC, "newFixedThreadPool(tag, threadCounts)");
        return executorC;
    }

    public void r(@NotNull String api, int uid, @NotNull String statusCode, @NotNull String sdkVersion) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        com.heytap.health.base.track.a.e(api, uid, statusCode, sdkVersion);
    }

    public void s(@NotNull String dataUid, @NotNull String dataClient, @NotNull String dbUid) {
        Intrinsics.checkNotNullParameter(dataUid, "dataUid");
        Intrinsics.checkNotNullParameter(dataClient, "dataClient");
        Intrinsics.checkNotNullParameter(dbUid, "dbUid");
        MultiProgressDataStoreRepository.a aVar = MultiProgressDataStoreRepository.Companion;
        Context contextA = e88.a();
        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
        MultiProgressDataStoreRepository multiProgressDataStoreRepositoryA = aVar.a(contextA, "INSERT_DATA_USER_ID");
        long jK = multiProgressDataStoreRepositoryA.k(dataClient + "_report_timestamp", 0L);
        long jK2 = multiProgressDataStoreRepositoryA.k(dataClient + "_error_count", 0L);
        if (System.currentTimeMillis() - jK <= t15.millisecondsOnDay) {
            multiProgressDataStoreRepositoryA.p(dataClient + "_error_count", jK2 + 1);
            return;
        }
        com.heytap.health.base.track.a.p().a("type", "INSERT_DATA_USER_ID").a("dataClient", dataClient).a("dataUid", dataUid).a("dbUid", dbUid).a("count", Long.valueOf(jK2 + 1)).a("blankUserStepMinutes", Long.valueOf(AppDatabase.K(e88.a()).N0().o(jK, "", dataClient))).b();
        multiProgressDataStoreRepositoryA.p(dataClient + "_report_timestamp", System.currentTimeMillis());
        multiProgressDataStoreRepositoryA.p(dataClient + "_error_count", 0L);
    }

    public boolean t() {
        return yye.m();
    }

    public void u(@NotNull String tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, DeviceEventManager.Event.KEY_TAG);
        Intrinsics.checkNotNullParameter(message, "message");
        if (if0.w()) {
            m8b.m(tag, message);
        } else {
            l9b.j(tag, message);
        }
    }

    @NotNull
    public ExecutorService v(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, DeviceEventManager.Event.KEY_TAG);
        ExecutorService executorServiceB = cs8.b(tag);
        Intrinsics.checkNotNullExpressionValue(executorServiceB, "getFixedThreadPool(tag)");
        return executorServiceB;
    }

    public void w() throws RemoteException {
        IUploadWork iUploadWork;
        if (i7k.x() || (iUploadWork = (IUploadWork) ClientManager.getInstance().getBuildService(UploadWorkImpl.API_PATH_UPLOAD_DATA, new ClientManager.a() { // from class: com.oplus.aiunit.vision.on3
            public final Object a(IBinder iBinder) {
                return IUploadWork.Stub.asInterface(iBinder);
            }
        })) == null) {
            return;
        }
        iUploadWork.call();
    }
}
