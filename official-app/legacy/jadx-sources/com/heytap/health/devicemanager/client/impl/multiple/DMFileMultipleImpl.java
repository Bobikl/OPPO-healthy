package com.heytap.health.devicemanager.client.impl.multiple;

import android.content.Context;
import android.net.Uri;
import com.heytap.health.devicemanager.client.impl.arouter.DMIMessageHandler;
import com.heytap.health.devicemanager.lock.LockDMHashMap;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.speech.engine.constant.EngineConstant;
import com.oplus.aiunit.vision.a1;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.fl4;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ka7;
import com.oplus.aiunit.vision.mc7;
import com.oplus.aiunit.vision.ml4;
import com.oplus.aiunit.vision.mm5;
import com.oplus.aiunit.vision.nm5;
import com.oplus.aiunit.vision.ra5;
import com.oplus.aiunit.vision.sa5;
import com.oplus.aiunit.vision.u89;
import com.oplus.aiunit.vision.wk4;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.functions.Function2;
import p010kotlin.jvm.functions.Function3;
import p010kotlin.jvm.internal.FunctionReferenceImpl;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b#\u0010$J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J4\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J>\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J0\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0017R\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0016H\u0002J0\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u0018\u001a\u0012\u0012\b\u0012\u00060\u0017R\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0016H\u0002R\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u00060\u0017R\u00020\u00000\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR$\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060!R\u00020\u00000\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001f¨\u0006'"}, d2 = {"Lcom/heytap/health/devicemanager/client/impl/multiple/DMFileMultipleImpl;", "Lcom/oplus/aiunit/vision/fl4;", "Lcom/oplus/aiunit/vision/ra5;", "role", "", "type", "Lcom/oplus/aiunit/vision/fl4$a;", "listener", "", b2n.f, LogFieldKey.LEVEL_KEY, "", "serverId", b2n.g, MapSchema.FIELD_NAME_KEY, "mac", "serviceId", "filePath", "f", "Landroid/net/Uri;", "fileUri", "i", "Lkotlin/Function1;", "Lcom/heytap/health/devicemanager/client/impl/multiple/DMFileMultipleImpl$FileTransferListenerWrapper;", "block", "b", "c", "a", "Ljava/lang/String;", "TAG", "Lcom/heytap/health/devicemanager/lock/LockDMHashMap;", "Lcom/heytap/health/devicemanager/lock/LockDMHashMap;", "fileListeners", "Lcom/heytap/health/devicemanager/client/impl/multiple/DMFileMultipleImpl$ArouterFileTransferListenerWrapper;", "fileArouterListeners", "<init>", "()V", "ArouterFileTransferListenerWrapper", "FileTransferListenerWrapper", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class DMFileMultipleImpl implements fl4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String TAG = "DMFileMultipleImpl";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final LockDMHashMap<fl4.a, FileTransferListenerWrapper> fileListeners = new LockDMHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LockDMHashMap<String, ArouterFileTransferListenerWrapper> fileArouterListeners = new LockDMHashMap<>();

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J2\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00070\fH\u0002R\u0014\u0010\u0012\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/devicemanager/client/impl/multiple/DMFileMultipleImpl$ArouterFileTransferListenerWrapper;", "Lcom/oplus/aiunit/vision/mm5;", "Lcom/oplus/aiunit/vision/ka7$a;", "", "macAddress", "Lcom/oplus/aiunit/vision/mc7;", "fileTaskInfo", "", "c", "a", "b", EngineConstant.REASON, "Lkotlin/Function2;", "Lcom/heytap/health/devicemanager/client/impl/arouter/DMIMessageHandler;", "Lcom/oplus/aiunit/vision/ra5;", "block", b2n.f, "Ljava/lang/String;", "arouterPath", "", "role", "<init>", "(Lcom/heytap/health/devicemanager/client/impl/multiple/DMFileMultipleImpl;ILjava/lang/String;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public final class ArouterFileTransferListenerWrapper extends mm5 implements ka7.a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String arouterPath;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DMFileMultipleImpl f4038c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArouterFileTransferListenerWrapper(DMFileMultipleImpl dMFileMultipleImpl, @NotNull int i, String arouterPath) {
            super(i);
            Intrinsics.checkNotNullParameter(arouterPath, "arouterPath");
            this.f4038c = dMFileMultipleImpl;
            this.arouterPath = arouterPath;
        }

        @Override // com.oplus.aiunit.vision.ka7.a
        public void a(@NotNull final String macAddress, @NotNull final mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(macAddress, "macAddress");
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            g("onProgressChanged", macAddress, new Function2<DMIMessageHandler, ra5, Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$ArouterFileTransferListenerWrapper$onProgressChanged$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(DMIMessageHandler dMIMessageHandler, ra5 ra5Var) {
                    invoke2(dMIMessageHandler, ra5Var);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull final DMIMessageHandler handler, @NotNull final ra5 role) {
                    Intrinsics.checkNotNullParameter(handler, "handler");
                    Intrinsics.checkNotNullParameter(role, "role");
                    final String str = macAddress;
                    final mc7 mc7Var = fileTaskInfo;
                    wk4.a("onProgressChanged", handler, new Function0<Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$ArouterFileTransferListenerWrapper$onProgressChanged$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            handler.onProgressChanged(role, str, mc7Var);
                        }
                    });
                }
            });
        }

        @Override // com.oplus.aiunit.vision.ka7.a
        public void b(@NotNull final String macAddress, @NotNull final mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(macAddress, "macAddress");
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            g("onTransferCompleted", macAddress, new Function2<DMIMessageHandler, ra5, Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$ArouterFileTransferListenerWrapper$onTransferCompleted$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(DMIMessageHandler dMIMessageHandler, ra5 ra5Var) {
                    invoke2(dMIMessageHandler, ra5Var);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull final DMIMessageHandler handler, @NotNull final ra5 role) {
                    Intrinsics.checkNotNullParameter(handler, "handler");
                    Intrinsics.checkNotNullParameter(role, "role");
                    final String str = macAddress;
                    final mc7 mc7Var = fileTaskInfo;
                    wk4.a("onTransferCompleted", handler, new Function0<Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$ArouterFileTransferListenerWrapper$onTransferCompleted$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            handler.onTransferCompleted(role, str, mc7Var);
                        }
                    });
                }
            });
        }

        @Override // com.oplus.aiunit.vision.ka7.a
        public void c(@NotNull final String macAddress, @NotNull final mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(macAddress, "macAddress");
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            g("onTransferRequested", macAddress, new Function2<DMIMessageHandler, ra5, Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$ArouterFileTransferListenerWrapper$onTransferRequested$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // p010kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(DMIMessageHandler dMIMessageHandler, ra5 ra5Var) {
                    invoke2(dMIMessageHandler, ra5Var);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull final DMIMessageHandler handler, @NotNull final ra5 role) {
                    Intrinsics.checkNotNullParameter(handler, "handler");
                    Intrinsics.checkNotNullParameter(role, "role");
                    final String str = macAddress;
                    final mc7 mc7Var = fileTaskInfo;
                    wk4.a("onTransferRequested", handler, new Function0<Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$ArouterFileTransferListenerWrapper$onTransferRequested$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            handler.onTransferRequested(role, str, mc7Var);
                        }
                    });
                }
            });
        }

        public final void g(String reason, String macAddress, final Function2<? super DMIMessageHandler, ? super ra5, Unit> block) {
            final ra5.c cVarF = gl4.managerApi.f(macAddress);
            ml4.a(this.f4038c.TAG, "FileArouterListener dispatch,reason:" + reason + ",mac:" + gdb.a(macAddress) + ",deviceRole:" + cVarF + ",role:" + getRole() + ",arouterPath:" + this.arouterPath);
            if (sa5.a(getRole(), cVarF)) {
                a1 a1Var = a1.INSTANCE;
                Context contextA = b78.a();
                Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
                a1Var.b(contextA, this.arouterPath, new Function1<DMIMessageHandler, Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$ArouterFileTransferListenerWrapper$dispatch$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // p010kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DMIMessageHandler dMIMessageHandler) {
                        invoke2(dMIMessageHandler);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull DMIMessageHandler it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        block.invoke(it, cVarF);
                    }
                });
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J@\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\fH\u0002R\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/heytap/health/devicemanager/client/impl/multiple/DMFileMultipleImpl$FileTransferListenerWrapper;", "Lcom/oplus/aiunit/vision/mm5;", "Lcom/oplus/aiunit/vision/ka7$a;", "", "macAddress", "Lcom/oplus/aiunit/vision/mc7;", "fileTaskInfo", "", "c", "a", "b", EngineConstant.REASON, "Lkotlin/Function3;", "Lcom/oplus/aiunit/vision/ra5$c;", "block", "i", "Lcom/oplus/aiunit/vision/fl4$a;", "Lcom/oplus/aiunit/vision/fl4$a;", "listener", "", "role", "<init>", "(Lcom/heytap/health/devicemanager/client/impl/multiple/DMFileMultipleImpl;ILcom/oplus/aiunit/vision/fl4$a;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public final class FileTransferListenerWrapper extends mm5 implements ka7.a {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final fl4.a listener;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ DMFileMultipleImpl f4039c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileTransferListenerWrapper(DMFileMultipleImpl dMFileMultipleImpl, @NotNull int i, fl4.a listener) {
            super(i);
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f4039c = dMFileMultipleImpl;
            this.listener = listener;
        }

        @Override // com.oplus.aiunit.vision.ka7.a
        public void a(@NotNull final String macAddress, @NotNull final mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(macAddress, "macAddress");
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            wk4.a("onProgressChanged", this.listener, new Function0<Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$FileTransferListenerWrapper$onProgressChanged$1

                /* JADX INFO: renamed from: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$FileTransferListenerWrapper$onProgressChanged$1$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3<ra5.c, String, mc7, Unit> {
                    public AnonymousClass1(Object obj) {
                        super(3, obj, fl4.a.class, "onProgressChanged", "onProgressChanged(Lcom/heytap/health/devicemanager/client/role/DeviceBasegetRole$DeviceRole;Ljava/lang/String;Lcom/oplus/wearable/linkservice/sdk/common/FileTaskInfo;)V", 0);
                    }

                    @Override // p010kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ra5.c cVar, String str, mc7 mc7Var) {
                        invoke2(cVar, str, mc7Var);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ra5.c p0, @NotNull String p1, @NotNull mc7 p2) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        Intrinsics.checkNotNullParameter(p1, "p1");
                        Intrinsics.checkNotNullParameter(p2, "p2");
                        ((fl4.a) this.receiver).a(p0, p1, p2);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.i("onProgressChanged", macAddress, fileTaskInfo, new AnonymousClass1(this.this$0.listener));
                }
            });
        }

        @Override // com.oplus.aiunit.vision.ka7.a
        public void b(@NotNull final String macAddress, @NotNull final mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(macAddress, "macAddress");
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            wk4.a("onTransferCompleted", this.listener, new Function0<Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$FileTransferListenerWrapper$onTransferCompleted$1

                /* JADX INFO: renamed from: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$FileTransferListenerWrapper$onTransferCompleted$1$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3<ra5.c, String, mc7, Unit> {
                    public AnonymousClass1(Object obj) {
                        super(3, obj, fl4.a.class, "onTransferCompleted", "onTransferCompleted(Lcom/heytap/health/devicemanager/client/role/DeviceBasegetRole$DeviceRole;Ljava/lang/String;Lcom/oplus/wearable/linkservice/sdk/common/FileTaskInfo;)V", 0);
                    }

                    @Override // p010kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ra5.c cVar, String str, mc7 mc7Var) {
                        invoke2(cVar, str, mc7Var);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ra5.c p0, @NotNull String p1, @NotNull mc7 p2) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        Intrinsics.checkNotNullParameter(p1, "p1");
                        Intrinsics.checkNotNullParameter(p2, "p2");
                        ((fl4.a) this.receiver).c(p0, p1, p2);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.i("onTransferCompleted", macAddress, fileTaskInfo, new AnonymousClass1(this.this$0.listener));
                }
            });
        }

        @Override // com.oplus.aiunit.vision.ka7.a
        public void c(@NotNull final String macAddress, @NotNull final mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(macAddress, "macAddress");
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            wk4.a("onTransferRequested", this.listener, new Function0<Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$FileTransferListenerWrapper$onTransferRequested$1

                /* JADX INFO: renamed from: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$FileTransferListenerWrapper$onTransferRequested$1$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function3<ra5.c, String, mc7, Unit> {
                    public AnonymousClass1(Object obj) {
                        super(3, obj, fl4.a.class, "onTransferRequested", "onTransferRequested(Lcom/heytap/health/devicemanager/client/role/DeviceBasegetRole$DeviceRole;Ljava/lang/String;Lcom/oplus/wearable/linkservice/sdk/common/FileTaskInfo;)V", 0);
                    }

                    @Override // p010kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ra5.c cVar, String str, mc7 mc7Var) {
                        invoke2(cVar, str, mc7Var);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ra5.c p0, @NotNull String p1, @NotNull mc7 p2) {
                        Intrinsics.checkNotNullParameter(p0, "p0");
                        Intrinsics.checkNotNullParameter(p1, "p1");
                        Intrinsics.checkNotNullParameter(p2, "p2");
                        ((fl4.a) this.receiver).b(p0, p1, p2);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p010kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.i("onTransferRequested", macAddress, fileTaskInfo, new AnonymousClass1(this.this$0.listener));
                }
            });
        }

        public final void i(String reason, String macAddress, mc7 fileTaskInfo, Function3<? super ra5.c, ? super String, ? super mc7, Unit> block) {
            ra5.c cVarF = gl4.managerApi.f(macAddress);
            ml4.a(this.f4039c.TAG, "FileListener dispatch,reason:" + reason + ",mac:" + gdb.a(macAddress) + ",deviceRole:" + cVarF + ",role:" + getRole() + ",listener:" + this.listener);
            if (sa5.a(getRole(), cVarF)) {
                block.invoke(cVarF, macAddress, fileTaskInfo);
            }
        }
    }

    public final void b(final ra5 role, final fl4.a listener, Function1<? super FileTransferListenerWrapper, Unit> block) {
        block.invoke((FileTransferListenerWrapper) nm5.a(this.fileListeners, role, listener, new Function0<FileTransferListenerWrapper>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$addFileListener$transferListenerWrapper$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // p010kotlin.jvm.functions.Function0
            @NotNull
            public final DMFileMultipleImpl.FileTransferListenerWrapper invoke() {
                return new DMFileMultipleImpl.FileTransferListenerWrapper(this.this$0, role.getValue(), listener);
            }
        }));
    }

    public final void c(ra5 role, fl4.a listener, Function1<? super FileTransferListenerWrapper, Unit> block) {
        FileTransferListenerWrapper fileTransferListenerWrapper = (FileTransferListenerWrapper) nm5.b(this.fileListeners, role, listener);
        if (fileTransferListenerWrapper != null) {
            block.invoke(fileTransferListenerWrapper);
        }
    }

    @Override // com.oplus.aiunit.vision.fl4
    @Nullable
    public String f(@NotNull ra5 role, @Nullable String mac, @NotNull String type, int serviceId, @NotNull String filePath) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        ra5.c cVarF = gl4.managerApi.f(mac);
        if (role.b(cVarF)) {
            return u89.FileApi.a(mac, type, serviceId, filePath);
        }
        ml4.c(this.TAG, "sendFile fail,deviceRole:" + cVarF + ",sendRole:" + role + "(" + gdb.a(mac) + "),type:" + type);
        return null;
    }

    @Override // com.oplus.aiunit.vision.fl4
    public void g(@NotNull ra5 role, @NotNull final String type, @NotNull fl4.a listener) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b(role, listener, new Function1<FileTransferListenerWrapper, Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$addListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DMFileMultipleImpl.FileTransferListenerWrapper fileTransferListenerWrapper) {
                invoke2(fileTransferListenerWrapper);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DMFileMultipleImpl.FileTransferListenerWrapper it) {
                Intrinsics.checkNotNullParameter(it, "it");
                u89.FileApi.f(type, it);
            }
        });
    }

    @Override // com.oplus.aiunit.vision.fl4
    public void h(@NotNull ra5 role, final int serverId, @NotNull fl4.a listener) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(listener, "listener");
        b(role, listener, new Function1<FileTransferListenerWrapper, Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$addListener$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DMFileMultipleImpl.FileTransferListenerWrapper fileTransferListenerWrapper) {
                invoke2(fileTransferListenerWrapper);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DMFileMultipleImpl.FileTransferListenerWrapper it) {
                Intrinsics.checkNotNullParameter(it, "it");
                u89.FileApi.c(serverId, it);
            }
        });
    }

    @Override // com.oplus.aiunit.vision.fl4
    @Nullable
    public String i(@NotNull ra5 role, @Nullable String mac, @NotNull String type, int serviceId, @NotNull String filePath, @Nullable Uri fileUri) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        ra5.c cVarF = gl4.managerApi.f(mac);
        if (role.b(cVarF)) {
            return u89.FileApi.b(mac, type, serviceId, filePath, fileUri);
        }
        ml4.c(this.TAG, "sendFileAndroidUri fail,deviceRole:" + cVarF + ",sendRole:" + role + "(" + gdb.a(mac) + "),type:" + type);
        return null;
    }

    @Override // com.oplus.aiunit.vision.fl4
    public void k(@NotNull ra5 role, final int serverId, @NotNull fl4.a listener) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(listener, "listener");
        c(role, listener, new Function1<FileTransferListenerWrapper, Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$removeListener$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DMFileMultipleImpl.FileTransferListenerWrapper fileTransferListenerWrapper) {
                invoke2(fileTransferListenerWrapper);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DMFileMultipleImpl.FileTransferListenerWrapper it) {
                Intrinsics.checkNotNullParameter(it, "it");
                u89.FileApi.h(serverId, it);
            }
        });
    }

    @Override // com.oplus.aiunit.vision.fl4
    public void l(@NotNull ra5 role, @NotNull final String type, @NotNull fl4.a listener) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(listener, "listener");
        c(role, listener, new Function1<FileTransferListenerWrapper, Unit>() { // from class: com.heytap.health.devicemanager.client.impl.multiple.DMFileMultipleImpl$removeListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DMFileMultipleImpl.FileTransferListenerWrapper fileTransferListenerWrapper) {
                invoke2(fileTransferListenerWrapper);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DMFileMultipleImpl.FileTransferListenerWrapper it) {
                Intrinsics.checkNotNullParameter(it, "it");
                u89.FileApi.g(type, it);
            }
        });
    }
}
