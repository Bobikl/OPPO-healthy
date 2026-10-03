package com.heytap.health.device.log;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.protobuf.InvalidProtocolBufferException;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.devicemanager.client.call.DMCallException;
import com.heytap.health.protocol.file.FileProto$FileRequest;
import com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt;
import com.heytap.log.consts.LogSenderConst;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.el4;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.mc7;
import com.oplus.aiunit.vision.sl4;
import com.oplus.aiunit.vision.ul4;
import com.oplus.aiunit.vision.wq8;
import com.oplus.aiunit.vision.zk4;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.CoroutineContext;
import p010kotlin.coroutines.SafeContinuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.coroutines.jvm.internal.DebugProbesKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000u\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007*\u0001?\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0015B\t\b\u0002¢\u0006\u0004\bC\u0010DJ\u0006\u0010\u0005\u001a\u00020\u0004JM\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0002J#\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001c\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u001a\u0010'\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00040,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010/R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R$\u0010>\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00130;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E"}, d2 = {"Lcom/heytap/health/device/log/DeviceFileRepo;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/oplus/aiunit/vision/el4$b;", "Lcom/oplus/aiunit/vision/ul4$a;", "Ljava/io/File;", b2n.g, "", Fields.FILE_TYPE, "", "fileUri", "", "fileNameList", "Lcom/heytap/health/device/log/DeviceFileRepo$a;", "listener", "i", "(ILjava/lang/String;Ljava/util/List;Lcom/heytap/health/device/log/DeviceFileRepo$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "macAddress", "Lcom/oplus/aiunit/vision/mc7;", "fileTaskInfo", "", "c", "a", "b", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, "onPeerConnected", "onPeerDisconnected", MapSchema.FIELD_NAME_KEY, LogSenderConst.FILENAME, "index", "", LogFieldKey.LEVEL_KEY, "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", LogFieldKey.MESSAGE_KEY, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "j", "Ljava/lang/String;", "DEVICE_FILE_DIR", "reqFileUri", "", "Ljava/util/List;", "filesGeted", "Lcom/heytap/health/device/log/DeviceFileRepo$a;", "logRequestListener", "n", "I", "logFileSize", "", "o", UserInfo.SEX_FEMALE, "progress", LogFieldKey.PROCESS_NAME_KEY, "Lcom/oplus/aiunit/vision/mc7;", "transforIngTask", "Lkotlin/Function1;", "q", "Lkotlin/jvm/functions/Function1;", "transferCompleted", "com/heytap/health/device/log/DeviceFileRepo$b", "r", "Lcom/heytap/health/device/log/DeviceFileRepo$b;", "timeoutChecker", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeviceFileRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFileRepo.kt\ncom/heytap/health/device/log/DeviceFileRepo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,220:1\n1864#2,3:221\n*S KotlinDebug\n*F\n+ 1 DeviceFileRepo.kt\ncom/heytap/health/device/log/DeviceFileRepo\n*L\n97#1:221,3\n*E\n"})
public final class DeviceFileRepo implements CoroutineScope, el4.b, ul4.a {
    public static final int $stable;

    @NotNull
    public static final DeviceFileRepo INSTANCE;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public static final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final String DEVICE_FILE_DIR;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public static String reqFileUri;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final List<File> filesGeted;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public static a logRequestListener;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static int logFileSize;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public static float progress;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public static mc7 transforIngTask;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public static Function1<? super mc7, Unit> transferCompleted;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public static final b timeoutChecker;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/heytap/health/device/log/DeviceFileRepo$a;", "", "", "progress", "", "parentDir", "", "a", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(float progress, @Nullable String parentDir);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/heytap/health/device/log/DeviceFileRepo$b", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            a7b.b("DLF.DeviceLogRepo", "requestLogs timeout");
            DeviceFileRepo.transferCompleted.invoke(null);
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/heytap/health/device/log/DeviceFileRepo$c", "Lcom/oplus/aiunit/vision/sl4;", "", "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", AbsCallInterceptionHandlerKt.GSON_KEY_RESPONSE, "", "a", "Lcom/heytap/health/devicemanager/client/call/DMCallException;", "throwable", "b", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements sl4 {
        @Override // com.oplus.aiunit.vision.sl4
        public void a(@NotNull String mac, @NotNull MessageEvent response) throws InvalidProtocolBufferException {
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(response, "response");
            FileProto$FileRequest from = FileProto$FileRequest.parseFrom(response.getData());
            if (from.getState() == 0) {
                a7b.f("DLF.DeviceLogRepo", "requestLogs requestFile waitTransferFileComplete");
                return;
            }
            a7b.f("DLF.DeviceLogRepo", "requestLogs requestFile failed: " + from.getState());
            DeviceFileRepo.timeoutChecker.removeMessages(0);
            DeviceFileRepo.transferCompleted.invoke(null);
        }

        @Override // com.oplus.aiunit.vision.sl4
        public void b(@NotNull DMCallException throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            a7b.f("DLF.DeviceLogRepo", "requestLogs requestFile onError：" + throwable.getMessage());
            if (DeviceFileRepo.transforIngTask == null) {
                a7b.f("DLF.DeviceLogRepo", "requestLogs requestFile onError：transferCompleted");
                DeviceFileRepo.timeoutChecker.removeMessages(0);
                DeviceFileRepo.transferCompleted.invoke(null);
            }
        }
    }

    static {
        DeviceFileRepo deviceFileRepo = new DeviceFileRepo();
        INSTANCE = deviceFileRepo;
        coroutineContext = wq8.INSTANCE.b("DeviceLog");
        DEVICE_FILE_DIR = b78.a().getCacheDir().toString() + "/device_files/";
        reqFileUri = "device_log";
        filesGeted = new ArrayList();
        transferCompleted = new Function1<mc7, Unit>() { // from class: com.heytap.health.device.log.DeviceFileRepo$transferCompleted$1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable mc7 mc7Var) {
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(mc7 mc7Var) {
                invoke2(mc7Var);
                return Unit.INSTANCE;
            }
        };
        timeoutChecker = new b(Looper.getMainLooper());
        gl4.devicePrimary.nodeApi.g(deviceFileRepo);
        $stable = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object j(DeviceFileRepo deviceFileRepo, int i, String str, List list, a aVar, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            str = "device_log";
        }
        return deviceFileRepo.i(i3, str, (i2 & 4) != 0 ? null : list, (i2 & 8) != 0 ? null : aVar, continuation);
    }

    @Override // com.oplus.aiunit.vision.el4.b
    public void a(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        if (logFileSize <= 0 || fileTaskInfo.f() >= 100) {
            return;
        }
        mc7 mc7Var = transforIngTask;
        if ((mc7Var != null ? mc7Var.f() : 0) != fileTaskInfo.f()) {
            a7b.f("DLF.DeviceLogRepo", "transferFile onProgressChanged：" + fileTaskInfo.b() + " " + fileTaskInfo.f());
            a aVar = logRequestListener;
            if (aVar != null) {
                aVar.a(progress + ((fileTaskInfo.f() / 100.0f) / logFileSize), null);
            }
            transforIngTask = fileTaskInfo;
        }
    }

    @Override // com.oplus.aiunit.vision.el4.b
    public void b(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        a7b.f("DLF.DeviceLogRepo", "transferFile onTransferCompleted：" + fileTaskInfo.a() + " " + fileTaskInfo.b() + " " + fileTaskInfo.c());
        transforIngTask = null;
        if (fileTaskInfo.a() == 0) {
            transferCompleted.invoke(fileTaskInfo);
            return;
        }
        List<File> list = filesGeted;
        list.remove(CollectionsKt__CollectionsKt.getLastIndex(list));
        transferCompleted.invoke(null);
    }

    @Override // com.oplus.aiunit.vision.el4.b
    public void c(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        String str = DEVICE_FILE_DIR + reqFileUri + "/" + fileTaskInfo.b();
        filesGeted.add(new File(str));
        a7b.f("DLF.DeviceLogRepo", "transferFile onTransferRequested：" + fileTaskInfo.b() + " " + str);
        timeoutChecker.removeMessages(0);
        transforIngTask = fileTaskInfo;
        el4 el4Var = gl4.devicePrimary.fileApi;
        String strH = fileTaskInfo.h();
        Intrinsics.checkNotNullExpressionValue(strH, "fileTaskInfo.taskId");
        el4Var.receiveFile(strH, str);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return coroutineContext;
    }

    @NotNull
    public final File h() {
        return new File(b78.a().getCacheDir() + "/device_files/device_log");
    }

    /* JADX WARN: Code duplicated, block: B:51:0x014c A[Catch: all -> 0x019c, TryCatch #2 {all -> 0x019c, blocks: (B:60:0x017a, B:49:0x0146, B:51:0x014c, B:53:0x0154, B:54:0x0157, B:57:0x0162, B:62:0x0181, B:68:0x0196, B:69:0x019b, B:41:0x00ea, B:43:0x0101, B:46:0x010a, B:48:0x0113, B:30:0x008f, B:32:0x00a0, B:38:0x00ac), top: B:79:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0154 A[Catch: all -> 0x019c, TryCatch #2 {all -> 0x019c, blocks: (B:60:0x017a, B:49:0x0146, B:51:0x014c, B:53:0x0154, B:54:0x0157, B:57:0x0162, B:62:0x0181, B:68:0x0196, B:69:0x019b, B:41:0x00ea, B:43:0x0101, B:46:0x010a, B:48:0x0113, B:30:0x008f, B:32:0x00a0, B:38:0x00ac), top: B:79:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0161  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162 A[Catch: all -> 0x019c, TryCatch #2 {all -> 0x019c, blocks: (B:60:0x017a, B:49:0x0146, B:51:0x014c, B:53:0x0154, B:54:0x0157, B:57:0x0162, B:62:0x0181, B:68:0x0196, B:69:0x019b, B:41:0x00ea, B:43:0x0101, B:46:0x010a, B:48:0x0113, B:30:0x008f, B:32:0x00a0, B:38:0x00ac), top: B:79:0x008f }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0179 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0161 -> B:61:0x017f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x0177 -> B:60:0x017a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object i(int r21, @org.jetbrains.annotations.NotNull java.lang.String r22, @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> r23, @org.jetbrains.annotations.Nullable com.heytap.health.device.log.DeviceFileRepo.a r24, @org.jetbrains.annotations.NotNull p010kotlin.coroutines.Continuation<? super java.util.List<? extends java.io.File>> r25) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.heytap.health.device.log.DeviceFileRepo.i(int, java.lang.String, java.util.List, com.heytap.health.device.log.DeviceFileRepo$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void k(String fileUri) {
        progress = 0.0f;
        logFileSize = 0;
        logRequestListener = null;
        gl4.devicePrimary.fileApi.j(fileUri, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(String str, int i, Continuation<? super Boolean> continuation) {
        DeviceFileRepo$requestFileWithProgress$1 deviceFileRepo$requestFileWithProgress$1;
        a aVar;
        if (continuation instanceof DeviceFileRepo$requestFileWithProgress$1) {
            deviceFileRepo$requestFileWithProgress$1 = (DeviceFileRepo$requestFileWithProgress$1) continuation;
            int i2 = deviceFileRepo$requestFileWithProgress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deviceFileRepo$requestFileWithProgress$1.label = i2 - Integer.MIN_VALUE;
            } else {
                deviceFileRepo$requestFileWithProgress$1 = new DeviceFileRepo$requestFileWithProgress$1(this, continuation);
            }
        } else {
            deviceFileRepo$requestFileWithProgress$1 = new DeviceFileRepo$requestFileWithProgress$1(this, continuation);
        }
        Object objM = deviceFileRepo$requestFileWithProgress$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = deviceFileRepo$requestFileWithProgress$1.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objM);
            deviceFileRepo$requestFileWithProgress$1.L$0 = this;
            deviceFileRepo$requestFileWithProgress$1.I$0 = i;
            deviceFileRepo$requestFileWithProgress$1.label = 1;
            objM = m(str, deviceFileRepo$requestFileWithProgress$1);
            if (objM == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = deviceFileRepo$requestFileWithProgress$1.I$0;
            ResultKt.throwOnFailure(objM);
        }
        boolean z = objM != null;
        float f = (i + 1) / logFileSize;
        progress = f;
        if (f < 1.0f) {
            a aVar2 = logRequestListener;
            if (aVar2 != null) {
                aVar2.a(f, null);
            }
        } else if (z && (aVar = logRequestListener) != null) {
            aVar.a(f, DEVICE_FILE_DIR + reqFileUri + "/");
        }
        return Boxing.boxBoolean(z);
    }

    public final Object m(String str, Continuation<? super mc7> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        a7b.f("DLF.DeviceLogRepo", "requestLogs requestFile: " + str);
        transferCompleted = new Function1<mc7, Unit>() { // from class: com.heytap.health.device.log.DeviceFileRepo$waitTransferFileComplete$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(mc7 mc7Var) {
                invoke2(mc7Var);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable mc7 mc7Var) {
                safeContinuation.resumeWith(Result.m5287constructorimpl(mc7Var));
            }
        };
        transforIngTask = null;
        MessageEvent messageEvent = new MessageEvent(26, 1, FileProto$FileRequest.newBuilder().setName(str).setUri(reqFileUri).setServiceId(26).build().toByteArray());
        timeoutChecker.sendEmptyMessageDelayed(0, 10000L);
        zk4.a.a(gl4.devicePrimary.callApi, messageEvent, new c(), null, 0L, 0, 28, null);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerConnected(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        a7b.f("DLF.DeviceLogRepo", "onPeerConnected");
        logRequestListener = null;
    }

    @Override // com.oplus.aiunit.vision.ul4.a
    public void onPeerDisconnected(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        a7b.f("DLF.DeviceLogRepo", "onPeerDisconnected");
    }
}
