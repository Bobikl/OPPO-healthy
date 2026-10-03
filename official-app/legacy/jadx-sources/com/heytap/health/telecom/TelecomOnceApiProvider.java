package com.heytap.health.telecom;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.IBinder;
import android.telecom.CallAudioState;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.health.devicemanager.client.call.DMCallException;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.telecom.TelecomOnceApiProvider;
import com.heytap.health.telecom.aidl.ITelecomSyncOnce;
import com.heytap.health.telecom.proto.SmsProto$PhoneSendSms;
import com.heytap.health.telecom.proto.TelecomProto$CallAudio;
import com.heytap.health.telecom.proto.TelecomProto$CallAudioItem;
import com.heytap.health.telecom.proto.TelecomProto$ModifyCallAudio;
import com.heytap.health.telecom.proto.TelecomProto$PhoneCallChange;
import com.heytap.health.telecom.proto.TelecomProto$PlacePhoneCall;
import com.heytap.health.telecom.proto.TelecomProto$WatchCallChange;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.aie;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.eqj;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.i37;
import com.oplus.aiunit.vision.jl0;
import com.oplus.aiunit.vision.k4b;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.tl4;
import com.oplus.aiunit.vision.v0j;
import com.oplus.aiunit.vision.wq8;
import com.oplus.health.apiprovider.ClientManager;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\n\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/telecom/TelecomOnceApiProvider;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/telecom/aidl/ITelecomSyncOnce;", "j", "Landroid/content/Context;", "context", "", "c", "b", "", "i", "Ljava/lang/String;", "mLastMessageComboStr", "", "J", "mLastMessageTime", "Lcom/heytap/health/telecom/aidl/ITelecomSyncOnce$Stub;", MapSchema.FIELD_NAME_KEY, "Lkotlin/Lazy;", "()Lcom/heytap/health/telecom/aidl/ITelecomSyncOnce$Stub;", "binder", "<init>", "()V", "Companion", "telecom_impl_release"}, k = 1, mv = {1, 8, 0})
public final class TelecomOnceApiProvider implements cm9<ITelecomSyncOnce> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public String mLastMessageComboStr;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public long mLastMessageTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy binder = LazyKt__LazyJVMKt.lazy(new Function0<TelecomOnceApiProvider$binder$2.AnonymousClass1>() { // from class: com.heytap.health.telecom.TelecomOnceApiProvider$binder$2

        /* JADX INFO: renamed from: com.heytap.health.telecom.TelecomOnceApiProvider$binder$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0012\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0002JD\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u001f"}, d2 = {"com/heytap/health/telecom/TelecomOnceApiProvider$binder$2$1", "Lcom/heytap/health/telecom/aidl/ITelecomSyncOnce$Stub;", "createCallAudioItem", "Lcom/heytap/health/telecom/proto/TelecomProto$CallAudioItem$Builder;", "route", "", "name", "", "mac", "isActiveRoute", "", "getAndSendPhoneSimState", "", "forceSend", "onPhoneSmsMessageReceived", "messageEvent", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "onPhoneTelecomMessageReceived", "sendCallAudioState", "callAudioStates", "Landroid/telecom/CallAudioState;", "sendExtraInfo", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "sendPhoneCallChange", "callLocalStatus", "callRemoteNumber", "callSlotSubId", "callDisconnectCause", "isContactCall", "mute", "displayName", "telecom_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nTelecomOnceApiProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TelecomOnceApiProvider.kt\ncom/heytap/health/telecom/TelecomOnceApiProvider$binder$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,499:1\n1855#2:500\n1856#2:502\n1855#2,2:503\n1#3:501\n*S KotlinDebug\n*F\n+ 1 TelecomOnceApiProvider.kt\ncom/heytap/health/telecom/TelecomOnceApiProvider$binder$2$1\n*L\n376#1:500\n376#1:502\n454#1:503,2\n*E\n"})
        public static final class AnonymousClass1 extends ITelecomSyncOnce.Stub {
            final /* synthetic */ TelecomOnceApiProvider this$0;

            public AnonymousClass1(TelecomOnceApiProvider telecomOnceApiProvider) {
                this.this$0 = telecomOnceApiProvider;
            }

            private final TelecomProto$CallAudioItem.Builder createCallAudioItem(int route, String name, String mac, boolean isActiveRoute) {
                TelecomProto$CallAudioItem.Builder callAudioItem = TelecomProto$CallAudioItem.newBuilder();
                callAudioItem.setType(jl0.b(route));
                callAudioItem.setName(name);
                callAudioItem.setMac(mac);
                callAudioItem.setIsActiveRoute(isActiveRoute);
                Intrinsics.checkNotNullExpressionValue(callAudioItem, "callAudioItem");
                return callAudioItem;
            }

            private final void sendExtraInfo(String phoneNumber) {
                if (eqj.a(gl4.managerApi.q(ra5.a.INSTANCE)).i8()) {
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new TelecomOnceApiProvider$binder$2$1$sendExtraInfo$1(phoneNumber, null), 3, null);
                } else {
                    a7b.b("TelHealth.TelecomOnceApi", "sendExtraInfo not support");
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void sendPhoneCallChange$lambda$0(TelecomProto$PhoneCallChange.Builder builder, String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                builder.setCallRemoteNumber(value);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void sendPhoneCallChange$lambda$1(TelecomProto$PhoneCallChange.Builder builder, String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                builder.setDisplayName(value);
            }

            @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
            public void getAndSendPhoneSimState(boolean forceSend) {
                PhoneTelecomUtils phoneTelecomUtils = PhoneTelecomUtils.INSTANCE;
                Context contextA = b78.a();
                Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
                phoneTelecomUtils.f(contextA, forceSend);
            }

            @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
            public void onPhoneSmsMessageReceived(@NotNull MessageEvent messageEvent) {
                Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
                if (i37.b()) {
                    a7b.f("TelHealth.TelecomOnceApi", "onPhoneSmsMessageReceived with family device");
                    return;
                }
                try {
                    SmsProto$PhoneSendSms from = SmsProto$PhoneSendSms.parseFrom(messageEvent.getData());
                    Intrinsics.checkNotNullExpressionValue(from, "parseFrom(messageEvent.data)");
                    aie.a(from.getSmsSlotSubId(), from.getSmsDestinationAddress(), from.getSmsContent(), from.getSmsScAddress());
                } catch (InvalidProtocolBufferException e2) {
                    a7b.b("TelHealth.TelecomOnceApi", "onPhoneSmsMessageReceived : " + e2.getMessage());
                }
            }

            @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
            public void onPhoneTelecomMessageReceived(@NotNull MessageEvent messageEvent) throws InvalidProtocolBufferException {
                Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
                if (i37.b()) {
                    a7b.f("TelHealth.TelecomOnceApi", "onPhoneTelecomMessageReceived with family device");
                    return;
                }
                a7b.f("TelHealth.TelecomOnceApi", "onPhoneTelecomMessageReceived messageEvent = [" + messageEvent + "]");
                int commandId = messageEvent.getCommandId();
                if (commandId == 2) {
                    try {
                        TelecomProto$WatchCallChange watchCallChange = TelecomProto$WatchCallChange.parseFrom(messageEvent.getData());
                        if (k4b.b(b78.a(), watchCallChange)) {
                            return;
                        }
                        PhoneTelecomUtils phoneTelecomUtils = PhoneTelecomUtils.INSTANCE;
                        Context contextA = b78.a();
                        Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
                        Intrinsics.checkNotNullExpressionValue(watchCallChange, "watchCallChange");
                        phoneTelecomUtils.r(contextA, watchCallChange);
                        return;
                    } catch (InvalidProtocolBufferException e2) {
                        a7b.b("TelHealth.TelecomOnceApi", "onPhoneTelecomMessageReceived() " + e2.getMessage());
                        return;
                    }
                }
                if (commandId == 3) {
                    try {
                        TelecomProto$PlacePhoneCall from = TelecomProto$PlacePhoneCall.parseFrom(messageEvent.getData());
                        PhoneTelecomUtils phoneTelecomUtils2 = PhoneTelecomUtils.INSTANCE;
                        Context contextA2 = b78.a();
                        Intrinsics.checkNotNullExpressionValue(contextA2, "getAppContext()");
                        String callRemoteNumber = from.getCallRemoteNumber();
                        Intrinsics.checkNotNullExpressionValue(callRemoteNumber, "proto.callRemoteNumber");
                        phoneTelecomUtils2.d(contextA2, callRemoteNumber, from.getCallSlotSubId());
                        return;
                    } catch (InvalidProtocolBufferException e3) {
                        a7b.b("TelHealth.TelecomOnceApi", "onPhoneTelecomMessageReceived() " + e3.getMessage());
                        return;
                    }
                }
                if (commandId == 6) {
                    PhoneTelecomUtils phoneTelecomUtils3 = PhoneTelecomUtils.INSTANCE;
                    Context contextA3 = b78.a();
                    Intrinsics.checkNotNullExpressionValue(contextA3, "getAppContext()");
                    phoneTelecomUtils3.f(contextA3, true);
                    TelecomApiProvider.INSTANCE.d();
                    return;
                }
                if (commandId != 9) {
                    return;
                }
                TelecomProto$ModifyCallAudio modifyCallAudio = TelecomProto$ModifyCallAudio.parseFrom(messageEvent.getData());
                PhoneTelecomUtils phoneTelecomUtils4 = PhoneTelecomUtils.INSTANCE;
                Context contextA4 = b78.a();
                Intrinsics.checkNotNullExpressionValue(contextA4, "getAppContext()");
                Intrinsics.checkNotNullExpressionValue(modifyCallAudio, "modifyCallAudio");
                phoneTelecomUtils4.p(contextA4, modifyCallAudio);
            }

            @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
            @SuppressLint({"MissingPermission"})
            public void sendCallAudioState(@Nullable CallAudioState callAudioStates) {
                Collection<BluetoothDevice> supportedBluetoothDevices;
                Object next;
                TelecomProto$CallAudio.Builder builderNewBuilder = TelecomProto$CallAudio.newBuilder();
                boolean z = false;
                int supportedRouteMask = callAudioStates != null ? callAudioStates.getSupportedRouteMask() : 0;
                Integer numValueOf = callAudioStates != null ? Integer.valueOf(callAudioStates.getRoute()) : null;
                if ((supportedRouteMask & 2) == 2) {
                    List<UserDeviceInfo> boundDeviceInfos = gl4.managerApi.getBoundDeviceInfos();
                    if (callAudioStates != null && (supportedBluetoothDevices = callAudioStates.getSupportedBluetoothDevices()) != null) {
                        for (BluetoothDevice bluetoothDevice : supportedBluetoothDevices) {
                            if (bluetoothDevice != null) {
                                String name = bluetoothDevice.getName();
                                String address = bluetoothDevice.getAddress();
                                if (name == null) {
                                    name = address == null ? "" : address;
                                }
                                Iterator<T> it = boundDeviceInfos.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!((UserDeviceInfo) next).getMac().equals(address));
                                UserDeviceInfo userDeviceInfo = (UserDeviceInfo) next;
                                if (userDeviceInfo != null) {
                                    TelecomProto$CallAudioItem.Builder builderNewBuilder2 = TelecomProto$CallAudioItem.newBuilder();
                                    builderNewBuilder2.setType(3);
                                    builderNewBuilder2.setName(name);
                                    if (address == null) {
                                        address = "";
                                    }
                                    builderNewBuilder2.setMac(address);
                                    BluetoothDevice activeBluetoothDevice = callAudioStates.getActiveBluetoothDevice();
                                    builderNewBuilder2.setIsActiveRoute(Intrinsics.areEqual(activeBluetoothDevice != null ? activeBluetoothDevice.getAddress() : null, userDeviceInfo.getMac()) && numValueOf != null && numValueOf.intValue() == 2);
                                    builderNewBuilder.addData(builderNewBuilder2);
                                } else {
                                    String str = address == null ? "" : address;
                                    BluetoothDevice activeBluetoothDevice2 = callAudioStates.getActiveBluetoothDevice();
                                    builderNewBuilder.addData(createCallAudioItem(2, name, str, Intrinsics.areEqual(activeBluetoothDevice2 != null ? activeBluetoothDevice2.getAddress() : null, address) && numValueOf != null && numValueOf.intValue() == 2));
                                }
                            }
                        }
                    }
                }
                if ((supportedRouteMask & 1) == 1) {
                    builderNewBuilder.addData(createCallAudioItem(1, "", "", numValueOf != null && numValueOf.intValue() == 1));
                }
                if ((supportedRouteMask & 4) == 4) {
                    builderNewBuilder.addData(createCallAudioItem(4, "", "", numValueOf != null && numValueOf.intValue() == 4));
                }
                if ((supportedRouteMask & 8) == 8) {
                    builderNewBuilder.addData(createCallAudioItem(8, "", "", numValueOf != null && numValueOf.intValue() == 8));
                }
                if ((supportedRouteMask & 5) == 5) {
                    if (numValueOf != null && numValueOf.intValue() == 5) {
                        z = true;
                    }
                    builderNewBuilder.addData(createCallAudioItem(5, "", "", z));
                }
                builderNewBuilder.setPrimary(Intrinsics.areEqual(gl4.managerApi.n(), ra5.c.b.INSTANCE));
                MessageEvent messageEvent = new MessageEvent(6, 8, builderNewBuilder.build().toByteArray());
                List<TelecomProto$CallAudioItem> dataList = builderNewBuilder.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList, "callAudio.dataList");
                for (TelecomProto$CallAudioItem telecomProto$CallAudioItem : dataList) {
                    String name2 = telecomProto$CallAudioItem != null ? telecomProto$CallAudioItem.getName() : null;
                    a7b.b("TelHealth.TelecomOnceApi", "sendCallAudioState messageEvent -> name = " + name2 + ",mac = " + v0j.b(telecomProto$CallAudioItem != null ? telecomProto$CallAudioItem.getMac() : null) + ",type = " + telecomProto$CallAudioItem.getType() + ",isActiveRoute = " + telecomProto$CallAudioItem.getIsActiveRoute());
                }
                try {
                    tl4 tl4Var = gl4.deviceMultiple.messageApi;
                    ol4 ol4Var = gl4.managerApi;
                    tl4Var.o(ol4Var.n(), ol4Var.q(ra5.a.INSTANCE), messageEvent);
                } catch (DMCallException e2) {
                    a7b.b("TelHealth.TelecomOnceApi", "sendCallAudioState error " + e2.getMessage());
                }
            }

            @Override // com.heytap.health.telecom.aidl.ITelecomSyncOnce
            public void sendPhoneCallChange(int callLocalStatus, @Nullable String callRemoteNumber, int callSlotSubId, int callDisconnectCause, boolean isContactCall, boolean mute, @Nullable String displayName) {
                if (i37.b()) {
                    a7b.f("TelHealth.TelecomOnceApi", "sendPhoneCallChange() family device, return");
                    return;
                }
                String str = callLocalStatus + callRemoteNumber + callSlotSubId + callDisconnectCause + isContactCall + mute + displayName;
                if (System.currentTimeMillis() - this.this$0.mLastMessageTime < 500 && TextUtils.equals(str, this.this$0.mLastMessageComboStr)) {
                    a7b.f("TelHealth.TelecomOnceApi", "sendPhoneCallChange() duplicate message");
                    return;
                }
                this.this$0.mLastMessageComboStr = str;
                final TelecomProto$PhoneCallChange.Builder builderNewBuilder = TelecomProto$PhoneCallChange.newBuilder();
                builderNewBuilder.setChangeStatus(callLocalStatus);
                a.a(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0062: INVOKE 
                      (wrap com.heytap.health.telecom.a$a:0x005f: CONSTRUCTOR (r0v3 'builderNewBuilder' com.heytap.health.telecom.proto.TelecomProto$PhoneCallChange$Builder A[DONT_INLINE]) A[MD:(com.heytap.health.telecom.proto.TelecomProto$PhoneCallChange$Builder):void (m), WRAPPED] call: com.oplus.aiunit.vision.kqj.<init>(com.heytap.health.telecom.proto.TelecomProto$PhoneCallChange$Builder):void type: CONSTRUCTOR)
                      (r8v0 'callRemoteNumber' java.lang.String)
                     STATIC call: com.heytap.health.telecom.a.a(com.heytap.health.telecom.a$a, java.lang.String):void A[MD:(com.heytap.health.telecom.a$a<java.lang.String>, java.lang.String):void (m)] in method: com.heytap.health.telecom.TelecomOnceApiProvider$binder$2.1.sendPhoneCallChange(int, java.lang.String, int, int, boolean, boolean, java.lang.String):void, file: classes18.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.oplus.aiunit.vision.kqj, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 23 more
                    */
                /*
                    Method dump skipped, instruction units count: 214
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.telecom.TelecomOnceApiProvider$binder$2.AnonymousClass1.sendPhoneCallChange(int, java.lang.String, int, int, boolean, boolean, java.lang.String):void");
            }
        }

        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new AnonymousClass1(this.this$0);
        }
    });

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007JD\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/telecom/TelecomOnceApiProvider$Companion;", "", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "Lkotlinx/coroutines/Job;", "f", b2n.f, "", "forceSend", "c", "", "callLocalStatus", "", "callRemoteNumber", "callSlotSubId", "callDisconnectCause", "isContactCall", "mute", "displayName", "i", "Landroid/telecom/CallAudioState;", "callAudioState", b2n.g, "Lcom/heytap/health/telecom/aidl/ITelecomSyncOnce;", "d", "<init>", "()V", "telecom_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final ITelecomSyncOnce e(IBinder iBinder) {
            return ITelecomSyncOnce.Stub.asInterface(iBinder);
        }

        @JvmStatic
        @NotNull
        public final Job c(boolean forceSend) {
            return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new TelecomOnceApiProvider$Companion$getAndSendPhoneSimState$1(forceSend, null), 3, null);
        }

        public final ITelecomSyncOnce d() {
            ITelecomSyncOnce iTelecomSyncOnce = (ITelecomSyncOnce) ClientManager.getInstance().getBuildService("api_provider_telecom_once", new ClientManager.a() { // from class: com.oplus.aiunit.vision.jqj
                @Override // com.oplus.health.apiprovider.ClientManager.a
                public final Object a(IBinder iBinder) {
                    return TelecomOnceApiProvider.Companion.e(iBinder);
                }
            });
            if (iTelecomSyncOnce == null) {
                return null;
            }
            if (!iTelecomSyncOnce.asBinder().isBinderAlive()) {
                a7b.b("TelHealth.TelecomOnceApi", "getApi isBinderAlive: false");
                iTelecomSyncOnce = null;
            }
            return iTelecomSyncOnce;
        }

        @NotNull
        public final Job f(@NotNull MessageEvent messageEvent) {
            Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
            return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new TelecomOnceApiProvider$Companion$onPhoneSmsMessageReceived$1(messageEvent, null), 3, null);
        }

        @NotNull
        public final Job g(@NotNull MessageEvent messageEvent) {
            Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
            return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new TelecomOnceApiProvider$Companion$onPhoneTelecomMessageReceived$1(messageEvent, null), 3, null);
        }

        @JvmStatic
        @NotNull
        public final Job h(@Nullable CallAudioState callAudioState) {
            return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new TelecomOnceApiProvider$Companion$sendCallAudioState$1(callAudioState, null), 3, null);
        }

        @JvmStatic
        @NotNull
        public final Job i(int callLocalStatus, @Nullable String callRemoteNumber, int callSlotSubId, int callDisconnectCause, boolean isContactCall, boolean mute, @Nullable String displayName) {
            return BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(wq8.INSTANCE.e()), null, null, new TelecomOnceApiProvider$Companion$sendPhoneCallChange$1(callLocalStatus, callRemoteNumber, callSlotSubId, callDisconnectCause, isContactCall, mute, displayName, null), 3, null);
        }
    }

    @JvmStatic
    @NotNull
    public static final Job k(@Nullable CallAudioState callAudioState) {
        return INSTANCE.h(callAudioState);
    }

    @JvmStatic
    @NotNull
    public static final Job l(int i, @Nullable String str, int i2, int i3, boolean z, boolean z2, @Nullable String str2) {
        return INSTANCE.i(i, str, i2, i3, z, z2, str2);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final ITelecomSyncOnce.Stub i() {
        return (ITelecomSyncOnce.Stub) this.binder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public ITelecomSyncOnce d() {
        return i();
    }
}
