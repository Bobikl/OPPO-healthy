package com.heytap.health.watchpair.manager;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.heytap.health.devicemanager.client.call.DMCallException;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.telecom.TelecomPairReceiver;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.health.watch.thirdparty.ThirdPartyPresenter;
import com.heytap.health.watchpair.ability.OobeAbility;
import com.heytap.health.watchpair.manager.OobeHelper;
import com.heytap.health.watchpair.setting.ui.ConnectErrorActivity;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.accountsdk.open.core.web.executor.AcOpenGetTokenExecutor;
import com.oplus.aiunit.vision.ao0;
import com.oplus.aiunit.vision.ax7;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.bl4;
import com.oplus.aiunit.vision.bvf;
import com.oplus.aiunit.vision.f30;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.lc5;
import com.oplus.aiunit.vision.mkd;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.op;
import com.oplus.aiunit.vision.q3d;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.sl4;
import com.oplus.aiunit.vision.su8;
import com.oplus.aiunit.vision.tl4;
import com.oplus.aiunit.vision.va5;
import com.oplus.aiunit.vision.wl4;
import com.oplus.aiunit.vision.y04;
import com.oplus.aiunit.vision.y0f;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003)$\u0006B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ&\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\u0016\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019J\"\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002J*\u0010\"\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0002R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/heytap/health/watchpair/manager/OobeHelper;", "", "", "mac", "model", "", "b", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/watchpair/manager/OobeHelper$a;", "messageCallback", b2n.f, AcOpenGetTokenExecutor.ACCOUNT_NAME_KEY, ThirdPartyPresenter.TICKET, "f", "", y04.TIME_STYLE_POINT_DIR_NAME, b2n.g, "n", LogFieldKey.MESSAGE_KEY, LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/tl4$a;", "messageListener", "d", "o", "action", "", "result", MapSchema.FIELD_NAME_KEY, "Landroid/app/Activity;", "stackTopActivity", "c", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "retry", "i", "Lcom/heytap/health/watchpair/manager/OobeHelper$b;", "a", "Lcom/heytap/health/watchpair/manager/OobeHelper$b;", "nodeListener", "<init>", "()V", "DeviceNotConnectThrowable", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOobeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OobeHelper.kt\ncom/heytap/health/watchpair/manager/OobeHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n1#2:305\n*E\n"})
public final class OobeHelper {

    @NotNull
    public static final OobeHelper INSTANCE = new OobeHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public static b nodeListener;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/heytap/health/watchpair/manager/OobeHelper$DeviceNotConnectThrowable;", "", "mac", "", "(Ljava/lang/String;)V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DeviceNotConnectThrowable extends Throwable {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeviceNotConnectThrowable(@NotNull String mac) {
            super("device " + gdb.a(mac) + " not connect");
            Intrinsics.checkNotNullParameter(mac, "mac");
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\fH&R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/watchpair/manager/OobeHelper$a;", "Lcom/oplus/aiunit/vision/sl4;", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "a", "Lcom/heytap/health/devicemanager/client/call/DMCallException;", "throwable", "b", MapSchema.FIELD_NAME_ENTRY, "", b2n.f, "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class a implements sl4 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Handler handler = new Handler(Looper.getMainLooper());

        public static final void f(a this$0, DMCallException throwable) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(throwable, "$throwable");
            this$0.g(throwable);
        }

        public static final void h(a this$0, String mac, MessageEvent response) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(mac, "$mac");
            Intrinsics.checkNotNullParameter(response, "$response");
            this$0.e(mac, response);
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void a(@NotNull final String mac, @NotNull final MessageEvent response) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(response, "response");
            this.handler.post(new Runnable() { // from class: com.oplus.aiunit.vision.wkd
                @Override // java.lang.Runnable
                public final void run() {
                    OobeHelper.a.h(this.i, mac, response);
                }
            });
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void b(@NotNull final DMCallException throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            ml4.c("OobeHelper", "message callback error:" + throwable.getMessage());
            this.handler.post(new Runnable() { // from class: com.oplus.aiunit.vision.xkd
                @Override // java.lang.Runnable
                public final void run() {
                    OobeHelper.a.f(this.i, throwable);
                }
            });
        }

        public abstract void e(@NotNull String mac, @NotNull MessageEvent response);

        public abstract void g(@NotNull Throwable throwable);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\"\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/watchpair/manager/OobeHelper$b;", "Lcom/oplus/aiunit/vision/wl4$a;", "", "mac", "", "c", "Lcom/oplus/aiunit/vision/ra5$c;", "role", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "f", LogFieldKey.MESSAGE_KEY, "a", "b", "i", "Ljava/lang/String;", "<init>", "()V", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class b implements wl4.a {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public String mac;

        public abstract void a(@NotNull Node node);

        public abstract void b(@NotNull Node node);

        public final void c(@NotNull String mac) {
            Intrinsics.checkNotNullParameter(mac, "mac");
            this.mac = mac;
            ml4.a("OobeHelper", "setCurrMac:" + gdb.a(mac));
        }

        @Override // com.oplus.aiunit.vision.wl4.a
        public void f(@NotNull ra5.c role, @NotNull Node node) {
            Intrinsics.checkNotNullParameter(role, "role");
            Intrinsics.checkNotNullParameter(node, "node");
            if (Intrinsics.areEqual(node.getNodeId(), this.mac)) {
                a(node);
                return;
            }
            ml4.c("OobeHelper", "onPeerConnected not curr set mac,node:" + gdb.a(node.getNodeId()) + ",mac:" + gdb.a(this.mac) + " ");
        }

        @Override // com.oplus.aiunit.vision.wl4.a
        public void m(@NotNull ra5.c role, @NotNull Node node) {
            Intrinsics.checkNotNullParameter(role, "role");
            Intrinsics.checkNotNullParameter(node, "node");
            if (Intrinsics.areEqual(node.getNodeId(), this.mac)) {
                b(node);
                return;
            }
            ml4.c("OobeHelper", "onPeerDisconnected not curr set mac,node:" + gdb.a(node.getNodeId()) + ",mac:" + gdb.a(this.mac) + " ");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/watchpair/manager/OobeHelper$c", "Lcom/heytap/health/watchpair/manager/OobeHelper$b;", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "", "a", "b", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nOobeHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OobeHelper.kt\ncom/heytap/health/watchpair/manager/OobeHelper$initConnectListener$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n1#2:305\n*E\n"})
    public static final class c extends b {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f7170j;
        public final /* synthetic */ String k;

        public c(String str, String str2) {
            this.f7170j = str;
            this.k = str2;
        }

        @Override // com.heytap.health.watchpair.manager.OobeHelper.b
        public void a(@NotNull Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
        }

        @Override // com.heytap.health.watchpair.manager.OobeHelper.b
        public void b(@NotNull Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            Activity activityP = op.n().p();
            boolean zAreEqual = activityP != null ? Intrinsics.areEqual(ConnectErrorActivity.class.getSimpleName(), activityP.getClass().getSimpleName()) : false;
            int iA = q3d.a(b78.a(), this.f7170j);
            boolean z = zAreEqual || 60 == iA;
            ml4.a("OobeHelper", "onDisconnected stackTopActivity:" + activityP + " currentState:" + iA);
            if (z || !q3d.d()) {
                return;
            }
            OobeHelper.INSTANCE.c(this.f7170j, this.k, activityP);
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/heytap/health/watchpair/manager/OobeHelper$d", "Lcom/oplus/aiunit/vision/ao0;", "Lcom/oplus/aiunit/vision/bvf;", "Lcom/heytap/health/devicemanager/processor/bean/UserDeviceInfo;", "result", "", "c", "device_pair_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d extends ao0<bvf<UserDeviceInfo>> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f7171j;
        public final /* synthetic */ String k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Activity f7172l;

        public d(String str, String str2, Activity activity) {
            this.f7171j = str;
            this.k = str2;
            this.f7172l = activity;
        }

        @Override // com.oplus.aiunit.vision.ao0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@NotNull bvf<UserDeviceInfo> result) {
            Object objM5287constructorimpl;
            Unit unit;
            Intrinsics.checkNotNullParameter(result, "result");
            String str = this.f7171j;
            String str2 = this.k;
            Activity activity = this.f7172l;
            try {
                Result.Companion companion = Result.INSTANCE;
                result.c();
                Intent intent = new Intent(b78.a(), (Class<?>) ConnectErrorActivity.class);
                intent.setFlags(335544320);
                intent.putExtra("device_address", str);
                intent.putExtra(va5.TAG_DEVICE_MODEL, str2);
                b78.a().startActivity(intent);
                if (activity != null) {
                    if (OobeAbility.INSTANCE.c().values().contains(activity.getClass())) {
                        activity.finish();
                    }
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                objM5287constructorimpl = Result.m5287constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
            if (thM5290exceptionOrNullimpl != null) {
                ml4.c("OobeHelper", "jumpConnectError faile " + thM5290exceptionOrNullimpl.getMessage());
            }
        }
    }

    public static /* synthetic */ void j(OobeHelper oobeHelper, String str, MessageEvent messageEvent, int i, a aVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        oobeHelper.i(str, messageEvent, i, aVar);
    }

    public final void b(@NotNull String mac, @NotNull String model) {
        b bVar;
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(model, "model");
        if (((Boolean) lc5.d(model).a(new Function1<DeviceModel, Boolean>() { // from class: com.heytap.health.watchpair.manager.OobeHelper$initConnectListener$1
            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull DeviceModel applyMode) {
                Intrinsics.checkNotNullParameter(applyMode, "$this$applyMode");
                return Boolean.valueOf(applyMode.k0());
            }
        })).booleanValue()) {
            ml4.a("OobeHelper", "initConnectListener is iwatch");
            return;
        }
        if (nodeListener == null) {
            c cVar = new c(mac, model);
            nodeListener = cVar;
            cVar.c(mac);
            ml4.d("OobeHelper", "addListener");
            wl4 wl4Var = gl4.deviceMultiple.nodeApi;
            ra5.a aVar = ra5.a.INSTANCE;
            b bVar2 = nodeListener;
            Intrinsics.checkNotNull(bVar2);
            wl4Var.i(aVar, bVar2);
            ol4 ol4Var = gl4.managerApi;
            if (!ol4Var.isConnected(mac) && (bVar = nodeListener) != null) {
                bVar.m(ol4Var.f(mac), new Node(mac));
            }
        }
        b bVar3 = nodeListener;
        if (bVar3 != null) {
            bVar3.c(mac);
        }
    }

    public final void c(String mac, String model, Activity stackTopActivity) {
        if (ax7.j().k()) {
            gl4.managerApi.m(mac).g().L0(su8.c()).n0(f30.c()).subscribe(new d(mac, model, stackTopActivity));
        } else {
            ml4.c("OobeHelper", "jumpConnectError curr app is foreground!!!");
            mkd.c().b();
        }
    }

    public final void d(@NotNull tl4.a messageListener) {
        Intrinsics.checkNotNullParameter(messageListener, "messageListener");
        gl4.deviceMultiple.messageApi.l(ra5.a.INSTANCE, 11, 10, messageListener);
    }

    public final void e() {
        b bVar = nodeListener;
        if (bVar == null) {
            ml4.c("OobeHelper", "removeConnectListener is null");
            return;
        }
        ml4.d("OobeHelper", "releaseConnectListener");
        gl4.deviceMultiple.nodeApi.f(ra5.a.INSTANCE, bVar);
        nodeListener = null;
    }

    public final void f(@NotNull String mac, @NotNull String accountName, @NotNull String ticket, @NotNull a messageCallback) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(accountName, "accountName");
        Intrinsics.checkNotNullParameter(ticket, "ticket");
        Intrinsics.checkNotNullParameter(messageCallback, "messageCallback");
        ml4.d("OobeHelper", "sendCloudBindSuccess accountName:" + accountName + " ticket:" + ticket);
        MessageEvent messageEventB = y0f.b(0, ticket, accountName);
        Intrinsics.checkNotNullExpressionValue(messageEventB, "connectMessage(0, ticket, accountName)");
        j(this, mac, messageEventB, 0, messageCallback, 4, null);
    }

    public final void g(@NotNull String mac, @NotNull a messageCallback) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(messageCallback, "messageCallback");
        ml4.d("OobeHelper", "sendConnectSuccess");
        MessageEvent messageEventF = y0f.f();
        Intrinsics.checkNotNullExpressionValue(messageEventF, "getDeviceInfoMessage()");
        j(this, mac, messageEventF, 0, messageCallback, 4, null);
    }

    public final void h(@NotNull String mac, int hand, @NotNull a messageCallback) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(messageCallback, "messageCallback");
        MessageEvent messageEventI = y0f.i(hand);
        Intrinsics.checkNotNullExpressionValue(messageEventI, "handSend(hand)");
        i(mac, messageEventI, 3, messageCallback);
    }

    public final void i(String mac, MessageEvent messageEvent, int retry, a messageCallback) {
        if (gl4.managerApi.isConnected(mac)) {
            bl4.a.a(gl4.deviceMultiple.callApi, ra5.a.INSTANCE, mac, messageEvent, messageCallback, null, 0L, retry, 48, null);
            return;
        }
        ml4.c("OobeHelper", "device not connect " + gdb.a(mac));
        messageCallback.g(new DeviceNotConnectThrowable(mac));
    }

    public final void k(int action, boolean result) {
        ml4.a("OobeHelper", "sendReceiverToEveryWhere :action=" + action + ",result=" + result);
        Intent intent = new Intent();
        intent.putExtra("native_sync_result", result);
        intent.putExtra(TelecomPairReceiver.SERVER_ACTION_DETAIL, action);
        intent.setAction("com.op.smartwear.public.wearable.RECEIVER");
        LocalBroadcastManager.getInstance(b78.a()).sendBroadcast(intent);
    }

    public final void l(@NotNull String mac, @NotNull a messageCallback) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(messageCallback, "messageCallback");
        MessageEvent messageEventD = y0f.d();
        Intrinsics.checkNotNullExpressionValue(messageEventD, "finishSyncSuccessMessage()");
        j(this, mac, messageEventD, 0, messageCallback, 4, null);
    }

    public final void m(@NotNull String mac, @NotNull a messageCallback) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(messageCallback, "messageCallback");
        ConnectErrorActivity.k();
        MessageEvent messageEventC = y0f.c(true);
        Intrinsics.checkNotNullExpressionValue(messageEventC, "endSyncSuccessMessage(true)");
        j(this, mac, messageEventC, 0, messageCallback, 4, null);
    }

    public final void n(@NotNull String mac, @NotNull a messageCallback) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(messageCallback, "messageCallback");
        MessageEvent messageEventM = y0f.m();
        Intrinsics.checkNotNullExpressionValue(messageEventM, "startSyncMessage()");
        j(this, mac, messageEventM, 0, messageCallback, 4, null);
    }

    public final void o(@NotNull tl4.a messageListener) {
        Intrinsics.checkNotNullParameter(messageListener, "messageListener");
        gl4.deviceMultiple.messageApi.s(ra5.a.INSTANCE, 11, 10, messageListener);
    }
}
