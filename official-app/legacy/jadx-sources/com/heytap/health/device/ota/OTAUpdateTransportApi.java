package com.heytap.health.device.ota;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.health.device.ota.OTAUpdateTransportApi;
import com.heytap.health.device.ota.bean.OTAVersion;
import com.heytap.health.device.ota.check.OTADeviceTransManager;
import com.heytap.health.device.ota.check.OTADownloadManager;
import com.heytap.health.device.ota.update.OTAUpdateManager;
import com.heytap.health.protocol.dm.DMProto$ConnectDeviceInfo;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.h6d;
import com.oplus.health.apiprovider.ClientManager;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u001b\u0010\u000e\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/device/ota/OTAUpdateTransportApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/device/ota/IOTASyncTransport;", "Lcom/heytap/health/device/ota/IOTASyncTransport$Stub;", "f", "Landroid/content/Context;", "context", "", "c", "b", "i", "Lkotlin/Lazy;", MapSchema.FIELD_NAME_ENTRY, "()Lcom/heytap/health/device/ota/IOTASyncTransport$Stub;", "mBinder", "<init>", "()V", "Companion", "a", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
public final class OTAUpdateTransportApi implements cm9<IOTASyncTransport> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy mBinder = LazyKt__LazyJVMKt.lazy(new Function0<OTAUpdateTransportApi$mBinder$2.AnonymousClass1>() { // from class: com.heytap.health.device.ota.OTAUpdateTransportApi$mBinder$2

        /* JADX INFO: renamed from: com.heytap.health.device.ota.OTAUpdateTransportApi$mBinder$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001c\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J$\u0010\u0011\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0012\u001a\u00020\u0003H\u0016J*\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0014"}, d2 = {"com/heytap/health/device/ota/OTAUpdateTransportApi$mBinder$2$1", "Lcom/heytap/health/device/ota/IOTASyncTransport$Stub;", "isDownloadingOrTransferring", "", "registerCallback", HttpConst.OTA_VERSION, "", "callback", "Lcom/heytap/health/device/ota/IOTAUpdateCallback;", "removeOTADownloadListener", "", "btMac", "versionInfo", "Lcom/heytap/health/device/ota/bean/OTAVersion;", "autoDownload", "listener", "Lcom/heytap/health/device/ota/IOTADownloadListener;", "requestOTAUpdate", "isSilence", "startOTADownload", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class AnonymousClass1 extends IOTASyncTransport.Stub {
            /* JADX INFO: Access modifiers changed from: private */
            public static final void removeOTADownloadListener$lambda$1(OTAVersion versionInfo, boolean z, IOTADownloadListener listener, DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo) {
                Intrinsics.checkNotNullParameter(versionInfo, "$versionInfo");
                Intrinsics.checkNotNullParameter(listener, "$listener");
                if (dMProto$ConnectDeviceInfo == null) {
                    a7b.b("OTAUpdateTransportApi", "removeOTADownloadListener deviceInfo is null");
                } else {
                    OTADownloadManager.Companion.a(dMProto$ConnectDeviceInfo, versionInfo, z).o(listener);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void startOTADownload$lambda$0(OTAVersion versionInfo, boolean z, IOTADownloadListener iOTADownloadListener, DMProto$ConnectDeviceInfo dMProto$ConnectDeviceInfo) {
                Intrinsics.checkNotNullParameter(versionInfo, "$versionInfo");
                if (dMProto$ConnectDeviceInfo == null) {
                    a7b.b("OTAUpdateTransportApi", "startOTADownload deviceInfo is null");
                } else {
                    OTADownloadManager.Companion.a(dMProto$ConnectDeviceInfo, versionInfo, z).r(iOTADownloadListener);
                }
            }

            @Override // com.heytap.health.device.ota.IOTASyncTransport
            public boolean isDownloadingOrTransferring() {
                return OTADeviceTransManager.INSTANCE.h();
            }

            @Override // com.heytap.health.device.ota.IOTASyncTransport
            public boolean registerCallback(@Nullable String otaVersion, @Nullable IOTAUpdateCallback callback) {
                if (otaVersion == null || callback == null) {
                    return false;
                }
                return OTAUpdateManager.getInstance().registerCallback(otaVersion, callback);
            }

            @Override // com.heytap.health.device.ota.IOTASyncTransport
            public void removeOTADownloadListener(@NotNull String btMac, @NotNull final OTAVersion versionInfo, final boolean autoDownload, @NotNull final IOTADownloadListener listener) {
                Intrinsics.checkNotNullParameter(btMac, "btMac");
                Intrinsics.checkNotNullParameter(versionInfo, "versionInfo");
                Intrinsics.checkNotNullParameter(listener, "listener");
                h6d.d().e(btMac, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0018: INVOKE 
                      (wrap com.oplus.aiunit.vision.h6d:0x000f: INVOKE  STATIC call: com.oplus.aiunit.vision.h6d.d():com.oplus.aiunit.vision.h6d A[MD:():com.oplus.aiunit.vision.h6d (m), WRAPPED])
                      (r2v0 'btMac' java.lang.String)
                      (wrap com.oplus.aiunit.vision.gh5:0x0015: CONSTRUCTOR 
                      (r3v0 'versionInfo' com.heytap.health.device.ota.bean.OTAVersion A[DONT_INLINE])
                      (r4v0 'autoDownload' boolean A[DONT_INLINE])
                      (r5v0 'listener' com.heytap.health.device.ota.IOTADownloadListener A[DONT_INLINE])
                     A[MD:(com.heytap.health.device.ota.bean.OTAVersion, boolean, com.heytap.health.device.ota.IOTADownloadListener):void (m), WRAPPED] call: com.oplus.aiunit.vision.o8d.<init>(com.heytap.health.device.ota.bean.OTAVersion, boolean, com.heytap.health.device.ota.IOTADownloadListener):void type: CONSTRUCTOR)
                     VIRTUAL call: com.oplus.aiunit.vision.h6d.e(java.lang.String, com.oplus.aiunit.vision.gh5):void A[MD:(java.lang.String, com.oplus.aiunit.vision.gh5):void (m)] in method: com.heytap.health.device.ota.OTAUpdateTransportApi$mBinder$2.1.removeOTADownloadListener(java.lang.String, com.heytap.health.device.ota.bean.OTAVersion, boolean, com.heytap.health.device.ota.IOTADownloadListener):void, file: classes16.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.oplus.aiunit.vision.o8d, state: NOT_LOADED
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
                    	... 15 more
                    */
                /*
                    this = this;
                    java.lang.String r1 = "btMac"
                    p010kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                    java.lang.String r1 = "versionInfo"
                    p010kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
                    java.lang.String r1 = "listener"
                    p010kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
                    com.oplus.aiunit.vision.h6d r1 = com.oplus.aiunit.vision.h6d.d()
                    com.oplus.aiunit.vision.o8d r0 = new com.oplus.aiunit.vision.o8d
                    r0.<init>(r3, r4, r5)
                    r1.e(r2, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.device.ota.OTAUpdateTransportApi$mBinder$2.AnonymousClass1.removeOTADownloadListener(java.lang.String, com.heytap.health.device.ota.bean.OTAVersion, boolean, com.heytap.health.device.ota.IOTADownloadListener):void");
            }

            @Override // com.heytap.health.device.ota.IOTASyncTransport
            public void requestOTAUpdate(@Nullable OTAVersion versionInfo, @Nullable IOTAUpdateCallback callback, boolean isSilence) {
                OTAUpdateManager.getInstance().requestOTAUpdate(versionInfo, callback, isSilence);
            }

            @Override // com.heytap.health.device.ota.IOTASyncTransport
            public void startOTADownload(@NotNull String btMac, @NotNull final OTAVersion versionInfo, final boolean autoDownload, @Nullable final IOTADownloadListener listener) {
                Intrinsics.checkNotNullParameter(btMac, "btMac");
                Intrinsics.checkNotNullParameter(versionInfo, "versionInfo");
                h6d.d().e(btMac, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0013: INVOKE 
                      (wrap com.oplus.aiunit.vision.h6d:0x000a: INVOKE  STATIC call: com.oplus.aiunit.vision.h6d.d():com.oplus.aiunit.vision.h6d A[MD:():com.oplus.aiunit.vision.h6d (m), WRAPPED])
                      (r2v0 'btMac' java.lang.String)
                      (wrap com.oplus.aiunit.vision.gh5:0x0010: CONSTRUCTOR 
                      (r3v0 'versionInfo' com.heytap.health.device.ota.bean.OTAVersion A[DONT_INLINE])
                      (r4v0 'autoDownload' boolean A[DONT_INLINE])
                      (r5v0 'listener' com.heytap.health.device.ota.IOTADownloadListener A[DONT_INLINE])
                     A[MD:(com.heytap.health.device.ota.bean.OTAVersion, boolean, com.heytap.health.device.ota.IOTADownloadListener):void (m), WRAPPED] call: com.oplus.aiunit.vision.p8d.<init>(com.heytap.health.device.ota.bean.OTAVersion, boolean, com.heytap.health.device.ota.IOTADownloadListener):void type: CONSTRUCTOR)
                     VIRTUAL call: com.oplus.aiunit.vision.h6d.e(java.lang.String, com.oplus.aiunit.vision.gh5):void A[MD:(java.lang.String, com.oplus.aiunit.vision.gh5):void (m)] in method: com.heytap.health.device.ota.OTAUpdateTransportApi$mBinder$2.1.startOTADownload(java.lang.String, com.heytap.health.device.ota.bean.OTAVersion, boolean, com.heytap.health.device.ota.IOTADownloadListener):void, file: classes16.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.oplus.aiunit.vision.p8d, state: NOT_LOADED
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
                    	... 15 more
                    */
                /*
                    this = this;
                    java.lang.String r1 = "btMac"
                    p010kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
                    java.lang.String r1 = "versionInfo"
                    p010kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
                    com.oplus.aiunit.vision.h6d r1 = com.oplus.aiunit.vision.h6d.d()
                    com.oplus.aiunit.vision.p8d r0 = new com.oplus.aiunit.vision.p8d
                    r0.<init>(r3, r4, r5)
                    r1.e(r2, r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.device.ota.OTAUpdateTransportApi$mBinder$2.AnonymousClass1.startOTADownload(java.lang.String, com.heytap.health.device.ota.bean.OTAVersion, boolean, com.heytap.health.device.ota.IOTADownloadListener):void");
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            return new AnonymousClass1();
        }
    });

    /* JADX INFO: renamed from: com.heytap.health.device.ota.OTAUpdateTransportApi$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J$\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u001c\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J*\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007J(\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\b\u0010\u0015\u001a\u00020\bH\u0007R\u0014\u0010\u0016\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/heytap/health/device/ota/OTAUpdateTransportApi$a;", "", "Lcom/heytap/health/device/ota/IOTASyncTransport;", "b", "Lcom/heytap/health/device/ota/bean/OTAVersion;", "versionInfo", "Lcom/heytap/health/device/ota/IOTAUpdateCallback;", "callback", "", "isSilence", "", b2n.f, "", HttpConst.OTA_VERSION, MapSchema.FIELD_NAME_ENTRY, "btMac", "autoDownload", "Lcom/heytap/health/device/ota/IOTADownloadListener;", "listener", b2n.g, "f", "d", "TAG", "Ljava/lang/String;", "<init>", "()V", "deviceota_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final IOTASyncTransport c(IBinder iBinder) {
            return IOTASyncTransport.Stub.asInterface(iBinder);
        }

        @JvmStatic
        @Nullable
        public final IOTASyncTransport b() {
            return (IOTASyncTransport) ClientManager.getInstance().getBuildService("api_provider_ota_transport", new ClientManager.a() { // from class: com.oplus.aiunit.vision.n8d
                @Override // com.oplus.health.apiprovider.ClientManager.a
                public final Object a(IBinder iBinder) {
                    return OTAUpdateTransportApi.Companion.c(iBinder);
                }
            });
        }

        @JvmStatic
        public final boolean d() {
            try {
                IOTASyncTransport iOTASyncTransportB = b();
                if (iOTASyncTransportB != null) {
                    return iOTASyncTransportB.isDownloadingOrTransferring();
                }
                return false;
            } catch (RemoteException e2) {
                a7b.b("OTAUpdateTransportApi", "isDownloadingOrTransferring " + e2.getMessage());
                return false;
            }
        }

        @JvmStatic
        public final boolean e(@Nullable String otaVersion, @Nullable IOTAUpdateCallback callback) {
            try {
                IOTASyncTransport iOTASyncTransportB = b();
                if (iOTASyncTransportB != null) {
                    return iOTASyncTransportB.registerCallback(otaVersion, callback);
                }
                return false;
            } catch (RemoteException e2) {
                a7b.b("OTAUpdateTransportApi", "registerCallback " + e2.getMessage());
                return false;
            }
        }

        @JvmStatic
        public final void f(@NotNull String btMac, @NotNull OTAVersion versionInfo, boolean autoDownload, @NotNull IOTADownloadListener listener) {
            Intrinsics.checkNotNullParameter(btMac, "btMac");
            Intrinsics.checkNotNullParameter(versionInfo, "versionInfo");
            Intrinsics.checkNotNullParameter(listener, "listener");
            try {
                IOTASyncTransport iOTASyncTransportB = b();
                if (iOTASyncTransportB != null) {
                    iOTASyncTransportB.removeOTADownloadListener(btMac, versionInfo, autoDownload, listener);
                }
            } catch (RemoteException e2) {
                a7b.b("OTAUpdateTransportApi", "removeOTADownloadListener " + e2.getMessage());
            }
        }

        @JvmStatic
        public final void g(@Nullable OTAVersion versionInfo, @Nullable IOTAUpdateCallback callback, boolean isSilence) {
            try {
                IOTASyncTransport iOTASyncTransportB = b();
                if (iOTASyncTransportB != null) {
                    iOTASyncTransportB.requestOTAUpdate(versionInfo, callback, isSilence);
                }
            } catch (RemoteException e2) {
                a7b.b("OTAUpdateTransportApi", "onActionTimeChanged " + e2.getMessage());
            }
        }

        @JvmStatic
        public final void h(@NotNull String btMac, @NotNull OTAVersion versionInfo, boolean autoDownload, @Nullable IOTADownloadListener listener) {
            Intrinsics.checkNotNullParameter(btMac, "btMac");
            Intrinsics.checkNotNullParameter(versionInfo, "versionInfo");
            try {
                IOTASyncTransport iOTASyncTransportB = b();
                if (iOTASyncTransportB != null) {
                    iOTASyncTransportB.startOTADownload(btMac, versionInfo, autoDownload, listener);
                }
            } catch (RemoteException e2) {
                a7b.b("OTAUpdateTransportApi", "startOTADownload " + e2.getMessage());
            }
        }
    }

    @JvmStatic
    public static final boolean g() {
        return INSTANCE.d();
    }

    @JvmStatic
    public static final boolean h(@Nullable String str, @Nullable IOTAUpdateCallback iOTAUpdateCallback) {
        return INSTANCE.e(str, iOTAUpdateCallback);
    }

    @JvmStatic
    public static final void i(@NotNull String str, @NotNull OTAVersion oTAVersion, boolean z, @NotNull IOTADownloadListener iOTADownloadListener) {
        INSTANCE.f(str, oTAVersion, z, iOTADownloadListener);
    }

    @JvmStatic
    public static final void j(@Nullable OTAVersion oTAVersion, @Nullable IOTAUpdateCallback iOTAUpdateCallback, boolean z) {
        INSTANCE.g(oTAVersion, iOTAUpdateCallback, z);
    }

    @JvmStatic
    public static final void k(@NotNull String str, @NotNull OTAVersion oTAVersion, boolean z, @Nullable IOTADownloadListener iOTADownloadListener) {
        INSTANCE.h(str, oTAVersion, z, iOTADownloadListener);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final IOTASyncTransport.Stub e() {
        return (IOTASyncTransport.Stub) this.mBinder.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public IOTASyncTransport.Stub d() {
        return e();
    }
}
