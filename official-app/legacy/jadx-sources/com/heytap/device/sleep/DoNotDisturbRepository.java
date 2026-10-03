package com.heytap.device.sleep;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import com.heytap.health.devicemanager.client.call.DMCallException;
import com.heytap.health.protocol.dnd.DNDProto$DoNotDisturb;
import com.heytap.health.protocol.dnd.DNDProto$DoNotDisturbSupport;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.oplus.aiunit.vision.a1e;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.hbi;
import com.oplus.aiunit.vision.sl4;
import com.oplus.aiunit.vision.v3d;
import com.oplus.aiunit.vision.w3d;
import com.oplus.aiunit.vision.wwc;
import com.oplus.aiunit.vision.zk4;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/heytap/device/sleep/DoNotDisturbRepository;", "", "Companion", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class DoNotDisturbRepository {

    @NotNull
    public static final String TAG = "DoNotDisturbHelper";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final Uri a = Settings.Global.getUriFor("zen_mode");

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0007J\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fR\u001f\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/heytap/device/sleep/DoNotDisturbRepository$Companion;", "", "", "d", MapSchema.FIELD_NAME_ENTRY, "Lcom/heytap/health/protocol/dnd/DNDProto$DoNotDisturb;", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", b2n.f, "isPhoneSupport", "", "i", b2n.g, "isDNDEnable", "b", "", "timestamp", "a", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "DND_URI", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "", "TAG", "Ljava/lang/String;", "ZEN_MODE_EXT_INF", "<init>", "()V", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/heytap/device/sleep/DoNotDisturbRepository$Companion$a", "Lcom/oplus/aiunit/vision/sl4;", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "a", "Lcom/heytap/health/devicemanager/client/call/DMCallException;", "throwable", "b", "device_data_sync_impl_release"}, k = 1, mv = {1, 8, 0})
        public static final class a implements sl4 {
            @Override // com.oplus.aiunit.vision.sl4
            public void a(@NotNull String mac, @NotNull MessageEvent response) {
                Intrinsics.checkNotNullParameter(mac, "mac");
                Intrinsics.checkNotNullParameter(response, "response");
                a7b.f(DoNotDisturbRepository.TAG, "Change device dnd success");
            }

            @Override // com.oplus.aiunit.vision.sl4
            public void b(@NotNull DMCallException throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                a7b.f(DoNotDisturbRepository.TAG, "Change device dnd fail=" + throwable);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(boolean isDNDEnable, int timestamp) {
            a7b.f(DoNotDisturbRepository.TAG, "Change device dnd, enable=" + isDNDEnable + " timestamp=" + timestamp);
            MessageEvent messageEvent = new MessageEvent(1, 108, DNDProto$DoNotDisturb.newBuilder().setStatus(isDNDEnable ? 1 : 0).setStatusChangedTime(timestamp).build().toByteArray());
            String activeNodeId = gl4.managerApi.getActiveNodeId();
            if (activeNodeId == null) {
                a7b.f(DoNotDisturbRepository.TAG, "Change device dnd fail, active device is null");
            } else {
                zk4.a.b(gl4.devicePrimary.callApi, activeNodeId, messageEvent, new a(), null, 0L, 0, 56, null);
            }
        }

        @SuppressLint({"ServiceCast"})
        public final void b(boolean isDNDEnable) {
            try {
                a7b.f(DoNotDisturbRepository.TAG, "Change phone zenMode=" + (isDNDEnable ? 1 : 0));
                if (v3d.e()) {
                    a7b.f(DoNotDisturbRepository.TAG, "Change phone zenMode=" + (isDNDEnable ? 1 : 0) + ", use new API");
                    w3d.INSTANCE.a(isDNDEnable ? 1 : 0, "HealthAPP Sync Watch");
                } else {
                    wwc.b(b78.a(), isDNDEnable ? 1 : 0, null, "HealthAPP Sync Watch");
                }
            } catch (Throwable th) {
                a7b.f(DoNotDisturbRepository.TAG, "Change phone zenMode error=" + th);
            }
        }

        public final Uri c() {
            return DoNotDisturbRepository.a;
        }

        public final boolean d() {
            String currentConnectId = gl4.managerApi.getCurrentConnectId();
            if (currentConnectId == null) {
                return false;
            }
            return hbi.a(currentConnectId).B7();
        }

        public final boolean e() {
            Object objM5287constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(Boolean.valueOf(!TextUtils.isEmpty(Settings.Global.getString(b78.a().getContentResolver(), "zen_mode_ext_info"))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m5290exceptionOrNullimpl(objM5287constructorimpl) != null) {
                objM5287constructorimpl = Boolean.FALSE;
            }
            return ((Boolean) objM5287constructorimpl).booleanValue();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Nullable
        public final Object f(@NotNull Continuation<? super DNDProto$DoNotDisturb> continuation) {
            DoNotDisturbRepository$Companion$readDNDFromDevice$1 doNotDisturbRepository$Companion$readDNDFromDevice$1;
            if (continuation instanceof DoNotDisturbRepository$Companion$readDNDFromDevice$1) {
                doNotDisturbRepository$Companion$readDNDFromDevice$1 = (DoNotDisturbRepository$Companion$readDNDFromDevice$1) continuation;
                int i = doNotDisturbRepository$Companion$readDNDFromDevice$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    doNotDisturbRepository$Companion$readDNDFromDevice$1.label = i - Integer.MIN_VALUE;
                } else {
                    doNotDisturbRepository$Companion$readDNDFromDevice$1 = new DoNotDisturbRepository$Companion$readDNDFromDevice$1(this, continuation);
                }
            } else {
                doNotDisturbRepository$Companion$readDNDFromDevice$1 = new DoNotDisturbRepository$Companion$readDNDFromDevice$1(this, continuation);
            }
            DoNotDisturbRepository$Companion$readDNDFromDevice$1 doNotDisturbRepository$Companion$readDNDFromDevice$2 = doNotDisturbRepository$Companion$readDNDFromDevice$1;
            Object objD = doNotDisturbRepository$Companion$readDNDFromDevice$2.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = doNotDisturbRepository$Companion$readDNDFromDevice$2.label;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objD);
                    String activeNodeId = gl4.managerApi.getActiveNodeId();
                    if (activeNodeId != null) {
                        MessageEvent messageEvent = new MessageEvent(1, 107, null);
                        Result.Companion companion = Result.INSTANCE;
                        zk4 zk4Var = gl4.devicePrimary.callApi;
                        doNotDisturbRepository$Companion$readDNDFromDevice$2.label = 1;
                        objD = zk4.a.d(zk4Var, activeNodeId, messageEvent, null, 8000L, 0, doNotDisturbRepository$Companion$readDNDFromDevice$2, 20, null);
                        if (objD == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    a7b.b(DoNotDisturbRepository.TAG, "Read dnd from device fail, not response");
                    return null;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objD);
                MessageEvent messageEvent2 = (MessageEvent) objD;
                if (messageEvent2 == null) {
                    Result.m5287constructorimpl(Unit.INSTANCE);
                    a7b.b(DoNotDisturbRepository.TAG, "Read dnd from device fail, not response");
                    return null;
                }
                DNDProto$DoNotDisturb from = DNDProto$DoNotDisturb.parseFrom(messageEvent2.getData());
                a7b.f(DoNotDisturbRepository.TAG, "Read device dnd is=" + a1e.b(from));
                return from;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0097 A[Catch: all -> 0x00a2, TryCatch #0 {all -> 0x00a2, blocks: (B:3:0x0003, B:5:0x002e, B:7:0x004b, B:9:0x009d, B:8:0x0097), top: B:19:0x0003 }] */
        @Nullable
        public final DNDProto$DoNotDisturb g() {
            Object objM5287constructorimpl;
            DNDProto$DoNotDisturb dNDProto$DoNotDisturbBuild;
            Object obj = null;
            try {
                Result.Companion companion = Result.INSTANCE;
                String zenExtInfoStr = Settings.Global.getString(b78.a().getContentResolver(), "zen_mode_ext_info");
                a7b.f(DoNotDisturbRepository.TAG, "Phone dnd extInfo=" + zenExtInfoStr);
                if (TextUtils.isEmpty(zenExtInfoStr)) {
                    a7b.f(DoNotDisturbRepository.TAG, "Read phone dnd is empty");
                    dNDProto$DoNotDisturbBuild = null;
                } else {
                    Intrinsics.checkNotNullExpressionValue(zenExtInfoStr, "zenExtInfoStr");
                    List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) zenExtInfoStr, new String[]{","}, false, 0, 6, (Object) null);
                    if (listSplit$default.size() >= 5) {
                        long j2 = Long.parseLong((String) listSplit$default.get(0));
                        int i = Integer.parseInt((String) listSplit$default.get(4));
                        a7b.f(DoNotDisturbRepository.TAG, "Read phone dnd success, status=" + i + " timestamp=" + j2);
                        dNDProto$DoNotDisturbBuild = DNDProto$DoNotDisturb.newBuilder().setStatus(i).setStatusChangedTime((int) (j2 / 1000)).setSupportLinkage(1).build();
                    } else {
                        a7b.f(DoNotDisturbRepository.TAG, "Read phone dnd is empty");
                        dNDProto$DoNotDisturbBuild = null;
                    }
                }
                objM5287constructorimpl = Result.m5287constructorimpl(dNDProto$DoNotDisturbBuild);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM5290exceptionOrNullimpl = Result.m5290exceptionOrNullimpl(objM5287constructorimpl);
            if (thM5290exceptionOrNullimpl == null) {
                obj = objM5287constructorimpl;
            } else {
                a7b.b(DoNotDisturbRepository.TAG, "Read phone dnd fail, error=" + thM5290exceptionOrNullimpl);
            }
            return (DNDProto$DoNotDisturb) obj;
        }

        public final void h() {
            a7b.f(SleepModeBTRepository.TAG, "sendPhoneDNDChangeToDeviceForNoice");
            gl4.devicePrimary.messageApi.b(new MessageEvent(1, 168, new byte[0]));
        }

        public final void i(boolean isPhoneSupport) {
            DNDProto$DoNotDisturbSupport dNDProto$DoNotDisturbSupportBuild = DNDProto$DoNotDisturbSupport.newBuilder().setSupport(isPhoneSupport ? 1 : 0).build();
            gl4.devicePrimary.messageApi.b(new MessageEvent(1, 110, dNDProto$DoNotDisturbSupportBuild.toByteArray()));
            a7b.f(DoNotDisturbRepository.TAG, "Send phone support dnd to device, isSupport=" + dNDProto$DoNotDisturbSupportBuild.getSupport());
        }
    }
}
