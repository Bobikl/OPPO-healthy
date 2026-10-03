package com.heytap.device.sleep;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.heytap.device.sleep.DoNotDisturbManager;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.devicemanager.processor.bean.OobeStatusBean;
import com.heytap.health.protocol.dnd.DNDProto$DoNotDisturb;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.hbi;
import com.oplus.aiunit.vision.sj5;
import com.oplus.aiunit.vision.wq8;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010/J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004J\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0002H\u0002J\b\u0010\u0014\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J \u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0004H\u0002R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020#0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060"}, d2 = {"Lcom/heytap/device/sleep/DoNotDisturbManager;", "Lcom/oplus/aiunit/vision/sj5;", "", "i", "", MapSchema.FIELD_NAME_KEY, "deviceDNDEnable", "", "deviceUpdateTime", "isSync", LogFieldKey.LEVEL_KEY, "fromDeviceSleepMode", "s", LogFieldKey.MESSAGE_KEY, "deviceListSize", "a", "u", "o", "r", "q", "v", "", "syncReason", "t", "Lcom/heytap/health/protocol/dnd/DNDProto$DoNotDisturb;", "phoneDND", "deviceDND", "n", "Landroid/database/ContentObserver;", "Landroid/database/ContentObserver;", "phoneDNDStatusObserver", "b", "Z", "isSyncOpen", "Landroidx/lifecycle/LiveData;", "Lcom/heytap/health/devicemanager/processor/bean/OobeStatusBean;", "c", "Landroidx/lifecycle/LiveData;", "deviceConnectStatus", "d", "I", "phoneState", "Landroidx/lifecycle/Observer;", MapSchema.FIELD_NAME_ENTRY, "Landroidx/lifecycle/Observer;", "deviceConnectStatusObserver", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DoNotDisturbManager implements sj5 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static ContentObserver phoneDNDStatusObserver;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static LiveData<OobeStatusBean> deviceConnectStatus;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static int phoneState;

    @NotNull
    public static final DoNotDisturbManager INSTANCE = new DoNotDisturbManager();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static volatile boolean isSyncOpen = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Observer<OobeStatusBean> deviceConnectStatusObserver = new Observer() { // from class: com.oplus.aiunit.vision.cy5
        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            DoNotDisturbManager.h((OobeStatusBean) obj);
        }
    };

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/device/sleep/DoNotDisturbManager$a", "Landroid/database/ContentObserver;", "", "selfChange", "Landroid/net/Uri;", ParserTag.TAG_URI, "", "onChange", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean selfChange, @Nullable Uri uri) {
            super.onChange(selfChange, uri);
            DoNotDisturbManager.INSTANCE.m();
        }
    }

    public static final void h(OobeStatusBean it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isConnect()) {
            DoNotDisturbRepository.Companion companion = DoNotDisturbRepository.INSTANCE;
            if (companion.d()) {
                companion.i(companion.e());
            }
            INSTANCE.t("Device connect state changed");
        }
    }

    public static final void j(DoNotDisturbManager this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        INSTANCE.u();
        gl4.managerApi.u(this$0);
    }

    public static final void p() {
        LiveData<OobeStatusBean> liveData = deviceConnectStatus;
        if (liveData != null) {
            liveData.observeForever(deviceConnectStatusObserver);
        }
        a7b.f("DoNotDisturbMgr", "Register device connect listener for dnd");
    }

    @Override // com.oplus.aiunit.vision.sj5
    public void a(int deviceListSize) {
        u();
    }

    public final void i() {
        ThreadUtils.doInBackground(new Runnable() { // from class: com.oplus.aiunit.vision.dy5
            @Override // java.lang.Runnable
            public final void run() {
                DoNotDisturbManager.j(this.i);
            }
        });
    }

    public final boolean k() {
        return phoneState == 1;
    }

    public final void l(boolean deviceDNDEnable, int deviceUpdateTime, boolean isSync) {
        isSyncOpen = isSync;
        boolean z = isSyncOpen;
        StringBuilder sb = new StringBuilder();
        sb.append("On device dnd changed, isEnable=");
        sb.append(deviceDNDEnable);
        sb.append(" time=");
        sb.append(deviceUpdateTime);
        sb.append(" isSyncOpen=");
        sb.append(z);
        if (isSyncOpen) {
            s(deviceDNDEnable, deviceUpdateTime, false);
        }
    }

    public final void m() {
        DNDProto$DoNotDisturb dNDProto$DoNotDisturbG = DoNotDisturbRepository.INSTANCE.g();
        int status = dNDProto$DoNotDisturbG != null ? dNDProto$DoNotDisturbG.getStatus() : 0;
        phoneState = status;
        if (status == 1) {
            r();
        }
        if (isSyncOpen) {
            t("Phone dnd changed");
        }
    }

    public final void n(DNDProto$DoNotDisturb phoneDND, DNDProto$DoNotDisturb deviceDND, boolean fromDeviceSleepMode) {
        if (phoneDND.getStatusChangedTime() <= deviceDND.getStatusChangedTime() && ((long) deviceDND.getStatusChangedTime()) - (System.currentTimeMillis() / 1000) <= 5) {
            DoNotDisturbRepository.INSTANCE.b(deviceDND.getStatus() == 1);
            return;
        }
        if (!fromDeviceSleepMode) {
            DoNotDisturbRepository.INSTANCE.a(phoneDND.getStatus() == 1, phoneDND.getStatusChangedTime());
            return;
        }
        a7b.f("DoNotDisturbMgr", "Sync from device sleep mode, can`t change device dnd, phoneDND=" + phoneDND.getStatus());
    }

    public final void o() {
        if (deviceConnectStatus == null) {
            deviceConnectStatus = gl4.devicePrimary.nodeApi.a();
            ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.ey5
                @Override // java.lang.Runnable
                public final void run() {
                    DoNotDisturbManager.p();
                }
            });
        }
    }

    public final void q() {
        if (phoneDNDStatusObserver == null) {
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.checkNotNull(mainLooper);
            phoneDNDStatusObserver = new a(new Handler(mainLooper));
            ContentResolver contentResolver = b78.a().getContentResolver();
            Uri uriC = DoNotDisturbRepository.INSTANCE.c();
            ContentObserver contentObserver = phoneDNDStatusObserver;
            Intrinsics.checkNotNull(contentObserver);
            contentResolver.registerContentObserver(uriC, true, contentObserver);
            a7b.f("DoNotDisturbMgr", "Register phone dnd listener");
        }
    }

    public final void r() {
        if (hbi.a(gl4.managerApi.getCurrentConnectId()).q8()) {
            DoNotDisturbRepository.INSTANCE.h();
        } else {
            a7b.f("DoNotDisturbMgr", "sendPhoneDNDChangeToDeviceForNoice  Not supported");
        }
    }

    public final void s(boolean deviceDNDEnable, int deviceUpdateTime, boolean fromDeviceSleepMode) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new DoNotDisturbManager$syncDNDByDeviceData$1(deviceDNDEnable, deviceUpdateTime, fromDeviceSleepMode, null), 3, null);
    }

    public final void t(String syncReason) {
        a7b.f(DoNotDisturbRepository.TAG, "Sync dnd reason= " + syncReason);
        DoNotDisturbRepository.Companion companion = DoNotDisturbRepository.INSTANCE;
        if (!companion.e()) {
            a7b.f("DoNotDisturbMgr", "Phone not support dnd");
        } else if (companion.d()) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new DoNotDisturbManager$syncPhoneAndDeviceDND$1(null), 3, null);
        } else {
            a7b.f("DoNotDisturbMgr", "Device not support dnd");
        }
    }

    public final void u() {
        DoNotDisturbRepository.Companion companion = DoNotDisturbRepository.INSTANCE;
        if (companion.e()) {
            DNDProto$DoNotDisturb dNDProto$DoNotDisturbG = companion.g();
            phoneState = dNDProto$DoNotDisturbG != null ? dNDProto$DoNotDisturbG.getStatus() : 0;
            q();
            t("Init sync");
        } else {
            v();
        }
        o();
    }

    public final void v() {
        if (phoneDNDStatusObserver != null) {
            ContentResolver contentResolver = b78.a().getContentResolver();
            ContentObserver contentObserver = phoneDNDStatusObserver;
            Intrinsics.checkNotNull(contentObserver);
            contentResolver.unregisterContentObserver(contentObserver);
            phoneDNDStatusObserver = null;
            a7b.f("DoNotDisturbMgr", "Unregister phone dnd listener");
        }
    }
}
