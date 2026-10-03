package com.heytap.health.watchface.business.creation.category.flexible.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.heytap.health.base.base.BaseService;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.health.watchface.business.creation.category.flexible.bean.AlbumInfoExtraData;
import com.heytap.health.watchface.business.creation.category.flexible.service.FlexibleBgTaskService;
import com.heytap.health.watchface.business.creation.db.LivePhotoRecord;
import com.heytap.health.watchface.business.creation.db.a;
import com.heytap.health.watchface.business.legacy.creation.album.bean.ImageItem;
import com.heytap.health.watchface.business.store.installer.bean.WfStatusBean;
import com.heytap.health.watchface.business.store.installer.core.WfInstallManager;
import com.heytap.health.watchface.business.store.installer.exception.WfInstallExceptionType;
import com.heytap.health.watchface.utils.BiEventUtil;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ax7;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.cza;
import com.oplus.aiunit.vision.grl;
import com.oplus.aiunit.vision.i11;
import com.oplus.aiunit.vision.j2b;
import com.oplus.aiunit.vision.ltl;
import com.oplus.aiunit.vision.nd7;
import com.oplus.aiunit.vision.ntl;
import com.oplus.aiunit.vision.op;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.td4;
import com.oplus.aiunit.vision.ud4;
import com.oplus.aiunit.vision.wd7;
import com.oplus.aiunit.vision.y04;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 =2\u00020\u00012\u00020\u0002:\u0002\r>B\u0007¢\u0006\u0004\b;\u0010<J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0013J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0018J\b\u0010\u001b\u001a\u00020\u0003H\u0016J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0013H\u0002J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!H\u0002J(\u0010(\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00132\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020%0$j\b\u0012\u0004\u0012\u00020%`&H\u0002J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010,\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\tH\u0002J\u0010\u0010.\u001a\u00020-2\u0006\u0010*\u001a\u00020\u0013H\u0002J\u0018\u0010/\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00100R \u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000e028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00103R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00106R \u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00103R\u0018\u0010:\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u00109¨\u0006?"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleBgTaskService;", "Lcom/heytap/health/base/base/BaseService;", "Lcom/heytap/health/watchface/business/store/installer/core/WfInstallManager$c;", "", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "", "resultCode", "Lcom/heytap/health/watchface/business/store/installer/bean/WfStatusBean;", "wfStatusBean", "a", "Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleProcessingTask;", "task", "onStatusCallback", "c", "o", "", "uniqueId", LogFieldKey.MESSAGE_KEY, "", LogFieldKey.LEVEL_KEY, "", MapSchema.FIELD_NAME_ENTRY, LogFieldKey.PROCESS_NAME_KEY, "onDestroy", "", "j", "deviceMac", b2n.g, "r", "Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleRecordParams;", "flexibleRecordParams", "f", "Ljava/util/ArrayList;", "Lcom/heytap/health/watchface/business/creation/db/LivePhotoRecord;", "Lkotlin/collections/ArrayList;", "records", "i", "n", "extraInfo", "eventType", "q", "Lcom/heytap/health/watchface/business/creation/category/flexible/bean/AlbumInfoExtraData;", b2n.f, MapSchema.FIELD_NAME_KEY, "Landroid/os/IBinder;", "mBinder", "", "Ljava/util/Map;", "mProcessTasks", "Lcom/heytap/health/watchface/business/store/installer/core/WfInstallManager;", "Lcom/heytap/health/watchface/business/store/installer/core/WfInstallManager;", "mInstallManager", "mOnStatusListenerMap", "Ljava/lang/String;", "mCurrentTaskDeviceMac", "<init>", "()V", "Companion", "b", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFlexibleBgTaskService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlexibleBgTaskService.kt\ncom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleBgTaskService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,251:1\n766#2:252\n857#2,2:253\n1855#2,2:255\n1855#2,2:257\n1774#2,4:259\n1855#2,2:263\n*S KotlinDebug\n*F\n+ 1 FlexibleBgTaskService.kt\ncom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleBgTaskService\n*L\n130#1:252\n130#1:253,2\n132#1:255,2\n143#1:257,2\n167#1:259,4\n221#1:263,2\n*E\n"})
public final class FlexibleBgTaskService extends BaseService implements WfInstallManager.c {

    @NotNull
    public static final String TAG = "FlexibleBgTaskService";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final IBinder mBinder = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Task> mProcessTasks = new LinkedHashMap();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final WfInstallManager mInstallManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<Object, WfInstallManager.c> mOnStatusListenerMap;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public String mCurrentTaskDeviceMac;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleBgTaskService$b;", "Landroid/os/Binder;", "Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleBgTaskService;", "a", "()Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleBgTaskService;", "service", "<init>", "(Lcom/heytap/health/watchface/business/creation/category/flexible/service/FlexibleBgTaskService;)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
    public final class b extends Binder {
        public b() {
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final FlexibleBgTaskService getI() {
            return FlexibleBgTaskService.this;
        }
    }

    public FlexibleBgTaskService() {
        WfInstallManager wfInstallManagerT = WfInstallManager.T();
        Intrinsics.checkNotNullExpressionValue(wfInstallManagerT, "get()");
        this.mInstallManager = wfInstallManagerT;
        this.mOnStatusListenerMap = new LinkedHashMap();
    }

    public static final void d(WfInstallManager.c cVar, int i, WfStatusBean wfStatusBean) {
        if (cVar != null) {
            cVar.a(i, wfStatusBean);
        }
    }

    @Override // com.heytap.health.watchface.business.store.installer.core.WfInstallManager.c
    public void a(int resultCode, @Nullable WfStatusBean wfStatusBean) {
        Task task;
        ltl.a(TAG, "[registerInstallListener] has wf installed. resultCode " + resultCode + " wfStatusBean " + wfStatusBean);
        if (wfStatusBean == null || wfStatusBean.getStatus() == 8) {
            ltl.i(TAG, "not exist wfStatusBean " + wfStatusBean);
            return;
        }
        k(resultCode, wfStatusBean);
        String uniqueId = wfStatusBean.getUniqueId();
        WfInstallExceptionType wfInstallExceptionType = WfInstallExceptionType.NORMAL;
        if ((!(resultCode == wfInstallExceptionType.getValue() && wfStatusBean.getStatus() == 7) && resultCode == wfInstallExceptionType.getValue()) || (task = this.mProcessTasks.get(uniqueId)) == null) {
            return;
        }
        o(task);
        if (resultCode == wfInstallExceptionType.getValue()) {
            r(task);
        }
    }

    public final void c(@NotNull Task task, @Nullable final WfInstallManager.c onStatusCallback) {
        Intrinsics.checkNotNullParameter(task, "task");
        ltl.a(TAG, "[addProcessTask]  task " + task);
        if (!TextUtils.equals(task.getDeviceMac(), this.mCurrentTaskDeviceMac)) {
            this.mCurrentTaskDeviceMac = task.getDeviceMac();
            h(task.getDeviceMac());
        }
        AppCompatActivity appCompatActivity = null;
        if (ax7.j().k()) {
            Activity activityS = op.n().s();
            if (activityS instanceof AppCompatActivity) {
                appCompatActivity = (AppCompatActivity) activityS;
            }
        }
        this.mInstallManager.P(appCompatActivity, task.getCurrentFavorites(), task.getDownloadInfoBean(), new WfInstallManager.c() { // from class: com.oplus.aiunit.vision.nr7
            @Override // com.heytap.health.watchface.business.store.installer.core.WfInstallManager.c
            public final void a(int i, WfStatusBean wfStatusBean) {
                FlexibleBgTaskService.d(onStatusCallback, i, wfStatusBean);
            }
        });
        this.mProcessTasks.put(task.getUniqueId(), task);
    }

    public final void e(@NotNull Object o, @NotNull WfInstallManager.c onStatusCallback) {
        Intrinsics.checkNotNullParameter(o, "o");
        Intrinsics.checkNotNullParameter(onStatusCallback, "onStatusCallback");
        this.mOnStatusListenerMap.put(o, onStatusCallback);
    }

    public final void f(String deviceMac, Params flexibleRecordParams) {
        ud4 ud4VarS = a.a().s(deviceMac, flexibleRecordParams.getPackageName());
        if (ud4VarS != null) {
            String previewFile = ud4VarS.d;
            wd7.g(previewFile);
            y04 y04Var = y04.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(previewFile, "previewFile");
            wd7.g(y04Var.k(previewFile));
            String str = ud4VarS.i;
            Intrinsics.checkNotNullExpressionValue(str, "creationRecord.remark");
            List delNewListThanOldList = cza.c(g(flexibleRecordParams.getConfigData()).getAlbumPhotoBean().getAllResource(), g(str).getAlbumPhotoBean().getAllResource());
            Intrinsics.checkNotNullExpressionValue(delNewListThanOldList, "delNewListThanOldList");
            ArrayList arrayList = new ArrayList();
            for (Object obj : delNewListThanOldList) {
                String it = (String) obj;
                y04 y04Var2 = y04.INSTANCE;
                nd7 nd7Var = nd7.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                if (!y04Var2.z(nd7Var.n(it))) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                wd7.g((String) it2.next());
            }
        }
    }

    public final AlbumInfoExtraData g(String extraInfo) {
        Object objA = GsonUtil.a(extraInfo, AlbumInfoExtraData.class);
        Intrinsics.checkNotNullExpressionValue(objA, "fromJson(extraInfo, Albu…nfoExtraData::class.java)");
        return (AlbumInfoExtraData) objA;
    }

    public final void h(String deviceMac) {
        i11 i11VarJ = ntl.m().j(deviceMac);
        if (i11VarJ == null) {
            ltl.i(TAG, "initWfInstallManager failed,dataManager = null");
            return;
        }
        this.mInstallManager.W0(grl.a(deviceMac).U1());
        this.mInstallManager.U0(i11VarJ.k());
        this.mInstallManager.H(this, this);
    }

    public final void i(String deviceMac, ArrayList<LivePhotoRecord> records) {
        j2b.h().delete(deviceMac);
        for (LivePhotoRecord livePhotoRecord : records) {
            livePhotoRecord.taskStatus = 0;
            j2b.h().a(livePhotoRecord);
        }
    }

    public final boolean j(@NotNull String uniqueId) {
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        return this.mInstallManager.d0(uniqueId);
    }

    public final void k(int resultCode, WfStatusBean wfStatusBean) {
        Iterator<T> it = this.mOnStatusListenerMap.values().iterator();
        while (it.hasNext()) {
            ((WfInstallManager.c) it.next()).a(resultCode, wfStatusBean);
        }
    }

    @NotNull
    public final List<Task> l() {
        return CollectionsKt___CollectionsKt.toList(this.mProcessTasks.values());
    }

    @Nullable
    public final Task m(@NotNull String uniqueId) {
        Intrinsics.checkNotNullParameter(uniqueId, "uniqueId");
        return this.mProcessTasks.get(uniqueId);
    }

    public final void n(Task task) {
        ud4 ud4Var = new ud4();
        Params flexibleRecordParams = task.getFlexibleRecordParams();
        ud4Var.a = task.getDeviceMac();
        ud4Var.d = flexibleRecordParams.getPreviewPath();
        ud4Var.f17423c = flexibleRecordParams.getResPath();
        ud4Var.h = flexibleRecordParams.getType();
        ud4Var.b = task.getUniqueId();
        ud4Var.k = flexibleRecordParams.getPackageName();
        ud4Var.i = flexibleRecordParams.getConfigData();
        ud4Var.g = a.a().k() - 1;
        ltl.a(TAG, "recordNewFlexibleWf " + ud4Var);
        a.a().r(ud4Var);
    }

    public final void o(@NotNull Task task) {
        Intrinsics.checkNotNullParameter(task, "task");
        ltl.a(TAG, "[removeProcessTask]  task " + task);
        this.mProcessTasks.remove(task.getUniqueId());
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return this.mBinder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ltl.a(TAG, "[onCreate] ... ");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.mInstallManager.N0(this);
        this.mOnStatusListenerMap.clear();
    }

    public final void p(@NotNull Object o) {
        Intrinsics.checkNotNullParameter(o, "o");
        this.mOnStatusListenerMap.remove(o);
    }

    public final void q(String extraInfo, int eventType) {
        AlbumInfoExtraData albumInfoExtraDataG = g(extraInfo);
        int size = albumInfoExtraDataG.getAlbumPhotoBean().getPhotos().size();
        ArrayList<ImageItem> photos = albumInfoExtraDataG.getAlbumPhotoBean().getPhotos();
        int i = 0;
        if (!(photos instanceof Collection) || !photos.isEmpty()) {
            Iterator<T> it = photos.iterator();
            while (it.hasNext()) {
                if (((ImageItem) it.next()).mIsLivePhoto && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        int i2 = i;
        BiEventUtil.INSTANCE.p(eventType, new BiEventUtil.FlexibleWfConfig(albumInfoExtraDataG.getAlbumPhotoBean().getSource(), size - i2, i2, albumInfoExtraDataG.getAlbumTimeBean(), albumInfoExtraDataG.getComplicationSummaryBean()));
    }

    public final void r(Task task) {
        ltl.a(TAG, "updateChanged " + task);
        f(task.getDeviceMac(), task.getFlexibleRecordParams());
        n(task);
        ArrayList<LivePhotoRecord> lpRecords = task.getFlexibleRecordParams().getLpRecords();
        if (lpRecords != null) {
            i(task.getDeviceMac(), lpRecords);
        }
        i11 i11VarJ = ntl.m().j(task.getDeviceMac());
        if (i11VarJ != null) {
            String str = i11VarJ.m().F() + "/";
            nd7 nd7Var = nd7.INSTANCE;
            nd7Var.j(str + "/" + task.getFlexibleRecordParams().getPackageName());
            if (qe0.z()) {
                nd7Var.h(task.getFlexibleRecordParams().getResPath());
            }
            td4.f(i11VarJ, task.getUniqueId(), task.getFlexibleRecordParams().getPackageName());
        }
        q(task.getFlexibleRecordParams().getConfigData(), 1);
    }
}
