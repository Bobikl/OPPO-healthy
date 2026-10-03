package com.heytap.health.insight.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import com.google.gson.Gson;
import com.heytap.health.base.base.BaseActivity;
import com.heytap.health.base.task.ThreadUtils;
import com.heytap.health.devicemanager.manager.DevicePairHelper;
import com.heytap.health.health.insight.ModuleType;
import com.heytap.health.hrv.viewmodel.AchievementSkipVM;
import com.heytap.health.insight.service.InsightBroadcast;
import com.heytap.health.insight.singledimen.SingleDimenDevApi;
import com.heytap.health.insight.singledimen.TrendCardControl;
import com.heytap.health.operation.ecg.helper.EcgHelper;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gxe;
import com.oplus.aiunit.vision.ih9;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.m3k;
import com.oplus.aiunit.vision.rdf;
import com.oplus.aiunit.vision.saa;
import com.oplus.aiunit.vision.wq8;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0004\n\u0012\u0013\u0014B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/heytap/health/insight/service/InsightBroadcast;", "", "", b2n.f, "Lcom/heytap/health/base/base/BaseActivity;", "baseActivity", "d", "c", "f", "Lcom/heytap/health/insight/service/InsightBroadcast$InsightSyncBroadcastReceiver;", "a", "Lkotlin/Lazy;", "b", "()Lcom/heytap/health/insight/service/InsightBroadcast$InsightSyncBroadcastReceiver;", "receiver", "<init>", "()V", "Companion", "InsightPushContent", "InsightSyncBroadcastReceiver", "PushCommonMsg", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class InsightBroadcast {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Lazy receiver = LazyKt__LazyJVMKt.lazy(new Function0<InsightSyncBroadcastReceiver>() { // from class: com.heytap.health.insight.service.InsightBroadcast$receiver$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final InsightBroadcast.InsightSyncBroadcastReceiver invoke() {
            return new InsightBroadcast.InsightSyncBroadcastReceiver();
        }
    });
    public static final int $stable = 8;

    @StabilityInferred(parameters = 0)
    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/insight/service/InsightBroadcast$InsightPushContent;", "", "date", "", "type", LogSenderConst.SUBTYPE, "code", "", "(IIILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDate", "()I", "getSubType", "getType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class InsightPushContent {
        public static final int $stable = 0;

        @NotNull
        private final String code;
        private final int date;
        private final int subType;
        private final int type;

        public InsightPushContent(int i, int i2, int i3, @NotNull String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            this.date = i;
            this.type = i2;
            this.subType = i3;
            this.code = code;
        }

        public static /* synthetic */ InsightPushContent copy$default(InsightPushContent insightPushContent, int i, int i2, int i3, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = insightPushContent.date;
            }
            if ((i4 & 2) != 0) {
                i2 = insightPushContent.type;
            }
            if ((i4 & 4) != 0) {
                i3 = insightPushContent.subType;
            }
            if ((i4 & 8) != 0) {
                str = insightPushContent.code;
            }
            return insightPushContent.copy(i, i2, i3, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final int getSubType() {
            return this.subType;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        @NotNull
        public final InsightPushContent copy(int date, int type, int subType, @NotNull String code) {
            Intrinsics.checkNotNullParameter(code, "code");
            return new InsightPushContent(date, type, subType, code);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InsightPushContent)) {
                return false;
            }
            InsightPushContent insightPushContent = (InsightPushContent) other;
            return this.date == insightPushContent.date && this.type == insightPushContent.type && this.subType == insightPushContent.subType && Intrinsics.areEqual(this.code, insightPushContent.code);
        }

        @NotNull
        public final String getCode() {
            return this.code;
        }

        public final int getDate() {
            return this.date;
        }

        public final int getSubType() {
            return this.subType;
        }

        public final int getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.date) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.subType)) * 31) + this.code.hashCode();
        }

        @NotNull
        public String toString() {
            return "InsightPushContent(date=" + this.date + ", type=" + this.type + ", subType=" + this.subType + ", code=" + this.code + ")";
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0012\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\nH\u0002¨\u0006\u0010"}, d2 = {"Lcom/heytap/health/insight/service/InsightBroadcast$InsightSyncBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "", "content", "", "b", "needDelay", "a", "<init>", "()V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class InsightSyncBroadcastReceiver extends BroadcastReceiver {
        public static final int $stable = 0;

        public final void a(boolean needDelay) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new InsightBroadcast$InsightSyncBroadcastReceiver$doQuery$1(needDelay, null), 3, null);
        }

        public final boolean b(String content) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("isInsightPush push content:");
                sb.append(content);
                return !(content == null || StringsKt__StringsJVMKt.isBlank(content)) && ((PushCommonMsg) new Gson().fromJson(content, PushCommonMsg.class)).getMessageType() == 20;
            } catch (Exception e2) {
                a7b.b("InsightBroadcast", "error:" + e2.getMessage());
                return false;
            }
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            String action = intent != null ? intent.getAction() : null;
            if (action != null) {
                switch (action.hashCode()) {
                    case -2112708277:
                        if (action.equals("action_broadcast_spt_push_msg")) {
                            a7b.f("InsightBroadcast", "InsightSyncBroadcastReceiver obtain push");
                            if (b(intent.getStringExtra("content"))) {
                                a(false);
                            }
                            break;
                        }
                        break;
                    case 189628405:
                        if (action.equals("ACTION_DB_SYNC_ALL")) {
                            a7b.f("InsightBroadcast", "InsightSyncBroadcastReceiver obtain db sync:" + ilj.B());
                            a(true);
                            break;
                        }
                        break;
                    case 647021111:
                        if (action.equals("com.heytap.health.action_data_refresh") && intent.getIntExtra("refresh_type", -1) == 3) {
                            a7b.f("InsightBroadcast", "receive db data sleep refresh, refresh sleep data");
                            Context contextA = b78.a();
                            Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
                            if (gxe.f(contextA)) {
                                TrendCardControl.INSTANCE.n(ModuleType.SLEEP);
                            }
                        }
                        break;
                    case 1385219113:
                        if (action.equals("action_broadcast_device_sleep_wakeup")) {
                            a7b.f("InsightBroadcast", "receive wakeup notify");
                            new saa().d();
                            break;
                        }
                        break;
                    case 1490900669:
                        if (action.equals("ACTION_DB_SLEEP_SCORE_CHANGE")) {
                            a7b.f("InsightBroadcast", "obtain sleep score change");
                            Context contextA2 = b78.a();
                            Intrinsics.checkNotNullExpressionValue(contextA2, "getAppContext()");
                            if (gxe.l(contextA2)) {
                                new SingleDimenDevApi(InsightDevSync.INSTANCE).m();
                            }
                            break;
                        }
                        break;
                }
            }
        }
    }

    @StabilityInferred(parameters = 0)
    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/insight/service/InsightBroadcast$PushCommonMsg;", "", "messageType", "", EcgHelper.PUSHEXPERTINTERPRETATION_INTENT_KEY, "Lcom/heytap/health/insight/service/InsightBroadcast$InsightPushContent;", "(ILcom/heytap/health/insight/service/InsightBroadcast$InsightPushContent;)V", "getMessageType", "()I", "getPackageObject", "()Lcom/heytap/health/insight/service/InsightBroadcast$InsightPushContent;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "health_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PushCommonMsg {
        public static final int $stable = 0;
        private final int messageType;

        @NotNull
        private final InsightPushContent packageObject;

        public PushCommonMsg(int i, @NotNull InsightPushContent packageObject) {
            Intrinsics.checkNotNullParameter(packageObject, "packageObject");
            this.messageType = i;
            this.packageObject = packageObject;
        }

        public static /* synthetic */ PushCommonMsg copy$default(PushCommonMsg pushCommonMsg, int i, InsightPushContent insightPushContent, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pushCommonMsg.messageType;
            }
            if ((i2 & 2) != 0) {
                insightPushContent = pushCommonMsg.packageObject;
            }
            return pushCommonMsg.copy(i, insightPushContent);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getMessageType() {
            return this.messageType;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final InsightPushContent getPackageObject() {
            return this.packageObject;
        }

        @NotNull
        public final PushCommonMsg copy(int messageType, @NotNull InsightPushContent packageObject) {
            Intrinsics.checkNotNullParameter(packageObject, "packageObject");
            return new PushCommonMsg(messageType, packageObject);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushCommonMsg)) {
                return false;
            }
            PushCommonMsg pushCommonMsg = (PushCommonMsg) other;
            return this.messageType == pushCommonMsg.messageType && Intrinsics.areEqual(this.packageObject, pushCommonMsg.packageObject);
        }

        public final int getMessageType() {
            return this.messageType;
        }

        @NotNull
        public final InsightPushContent getPackageObject() {
            return this.packageObject;
        }

        public int hashCode() {
            return (Integer.hashCode(this.messageType) * 31) + this.packageObject.hashCode();
        }

        @NotNull
        public String toString() {
            return "PushCommonMsg(messageType=" + this.messageType + ", packageObject=" + this.packageObject + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"com/heytap/health/insight/service/InsightBroadcast$b", "Lcom/heytap/health/devicemanager/manager/DevicePairHelper$a;", "", "mac", "", "isReset", "isOobeFinish", "", "b", "a", "health_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements DevicePairHelper.a {
        public final /* synthetic */ BaseActivity a;

        public b(BaseActivity baseActivity) {
            this.a = baseActivity;
        }

        @Override // com.heytap.health.devicemanager.manager.DevicePairHelper.a
        public void a(@NotNull String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
        }

        @Override // com.heytap.health.devicemanager.manager.DevicePairHelper.a
        public void b(@NotNull String mac, boolean isReset, boolean isOobeFinish) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            boolean zQ1 = ih9.a(mac).q1();
            a7b.f("InsightBroadcast", "registerDeviceConnect onConnect:" + isOobeFinish + ", isReset:" + isReset + ", support:" + zQ1);
            if (isReset && isOobeFinish && zQ1) {
                ((AchievementSkipVM) new ViewModelProvider(this.a).get(AchievementSkipVM.class)).D();
            }
        }
    }

    public static final void e(BaseActivity baseActivity) {
        Intrinsics.checkNotNullParameter(baseActivity, "$baseActivity");
        DevicePairHelper.INSTANCE.e(new b(baseActivity));
    }

    public final InsightSyncBroadcastReceiver b() {
        return (InsightSyncBroadcastReceiver) this.receiver.getValue();
    }

    public final void c() {
        a7b.f("InsightBroadcast", "registerDbReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ACTION_DB_SYNC_ALL");
        intentFilter.addAction("com.heytap.health.action_data_refresh");
        intentFilter.addAction("ACTION_DB_SLEEP_SCORE_CHANGE");
        intentFilter.addAction("action_broadcast_device_sleep_wakeup");
        rdf.a(b78.a(), b(), intentFilter, 4);
    }

    public final void d(@NotNull final BaseActivity baseActivity) {
        Intrinsics.checkNotNullParameter(baseActivity, "baseActivity");
        a7b.f("InsightBroadcast", "registerDeviceConnect");
        ThreadUtils.doInUiThread(new Runnable() { // from class: com.oplus.aiunit.vision.daa
            @Override // java.lang.Runnable
            public final void run() {
                InsightBroadcast.e(baseActivity);
            }
        });
    }

    public final void f() {
        a7b.f("InsightBroadcast", "registerPushReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("action_broadcast_spt_push_msg");
        rdf.a(b78.a(), b(), intentFilter, 4);
    }

    public final void g() {
        a7b.f("InsightBroadcast", "registerReceiver:" + m3k.a());
        f();
        c();
    }
}
