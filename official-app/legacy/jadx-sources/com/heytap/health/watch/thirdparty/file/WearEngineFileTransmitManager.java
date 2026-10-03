package com.heytap.health.watch.thirdparty.file;

import android.net.Uri;
import android.text.TextUtils;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.ClientInfo;
import com.oplus.aiunit.vision.el4;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.hq9;
import com.oplus.aiunit.vision.mc7;
import com.oplus.aiunit.vision.nc7;
import com.oplus.aiunit.vision.nvj;
import com.oplus.aiunit.vision.pc7;
import com.oplus.aiunit.vision.qd7;
import com.oplus.aiunit.vision.ssg;
import com.oplus.aiunit.vision.tf3;
import com.oplus.ocs.wearengine.p2pclient.file.FileListenerManager;
import com.oplus.ocs.wearengine.p2pclient.file.SendFileRequest;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.wearable.linkservice.sdk.Node;
import io.protostuff.MapSchema;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.LazyThreadSafetyMode;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.Regex;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 02\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0002J\"\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002H\u0002J*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\"\u0010$\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J*\u0010%\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002R\"\u0010)\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00150&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/heytap/health/watch/thirdparty/file/WearEngineFileTransmitManager;", "Lcom/oplus/aiunit/vision/el4$b;", "", "macAddress", "Lcom/oplus/aiunit/vision/mc7;", "fileTaskInfo", "", "c", "a", "b", "taskId", "filePath", "x", "y", ParserTag.TAG_URI, "Lcom/oplus/ocs/wearengine/p2pclient/file/SendFileRequest;", "sendFileRequest", "Lcom/oplus/aiunit/vision/nc7;", "fileTaskListener", LogFieldKey.LEVEL_KEY, LogFieldKey.MESSAGE_KEY, "Lcom/oplus/aiunit/vision/ssg;", "sendRecordInfo", MapSchema.FIELD_NAME_KEY, "z", "tag", "nodeId", "Lcom/oplus/aiunit/vision/hq9;", "iFileTaskDispatch", "r", "n", "t", "v", "s", "u", LogFieldKey.PROCESS_NAME_KEY, "w", "j", "", "i", "Ljava/util/Map;", "mSendPendMap", "", "q", "()Ljava/util/List;", "processTaskId", "<init>", "()V", "Companion", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWearEngineFileTransmitManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WearEngineFileTransmitManager.kt\ncom/heytap/health/watch/thirdparty/file/WearEngineFileTransmitManager\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,338:1\n37#2,2:339\n37#2,2:341\n*S KotlinDebug\n*F\n+ 1 WearEngineFileTransmitManager.kt\ncom/heytap/health/watch/thirdparty/file/WearEngineFileTransmitManager\n*L\n160#1:339,2\n250#1:341,2\n*E\n"})
public final class WearEngineFileTransmitManager implements el4.b {

    @NotNull
    public static final String FILE_INFO_MERGE_TAG = "/";

    @NotNull
    public static final String TAG = "WearEngineFileTransmitManager";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Map<String, ssg> mSendPendMap;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final Lazy<WearEngineFileTransmitManager> f6647j = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new Function0<WearEngineFileTransmitManager>() { // from class: com.heytap.health.watch.thirdparty.file.WearEngineFileTransmitManager$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final WearEngineFileTransmitManager invoke() {
            return new WearEngineFileTransmitManager(null);
        }
    });

    /* JADX INFO: renamed from: com.heytap.health.watch.thirdparty.file.WearEngineFileTransmitManager$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0007\u001a\u00020\u00028GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/watch/thirdparty/file/WearEngineFileTransmitManager$a;", "", "Lcom/heytap/health/watch/thirdparty/file/WearEngineFileTransmitManager;", "instance$delegate", "Lkotlin/Lazy;", "a", "()Lcom/heytap/health/watch/thirdparty/file/WearEngineFileTransmitManager;", "instance", "", "FILE_INFO_MERGE_TAG", "Ljava/lang/String;", "TAG", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final WearEngineFileTransmitManager a() {
            return (WearEngineFileTransmitManager) WearEngineFileTransmitManager.f6647j.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/watch/thirdparty/file/WearEngineFileTransmitManager$b", "Lcom/oplus/aiunit/vision/hq9;", "", "nodeId", "Lcom/oplus/aiunit/vision/mc7;", "fileTaskInfo", "", "b", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements hq9 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.hq9
        public void a(@Nullable String nodeId, @NotNull mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            WearEngineFileTransmitManager.this.t(fileTaskInfo);
        }

        @Override // com.oplus.aiunit.vision.hq9
        public void b(@Nullable String nodeId, @NotNull mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            WearEngineFileTransmitManager.this.v(fileTaskInfo);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/watch/thirdparty/file/WearEngineFileTransmitManager$c", "Lcom/oplus/aiunit/vision/hq9;", "", "nodeId", "Lcom/oplus/aiunit/vision/mc7;", "fileTaskInfo", "", "b", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements hq9 {
        public c() {
        }

        @Override // com.oplus.aiunit.vision.hq9
        public void a(@Nullable String nodeId, @NotNull mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            WearEngineFileTransmitManager.this.s(fileTaskInfo);
        }

        @Override // com.oplus.aiunit.vision.hq9
        public void b(@Nullable String nodeId, @NotNull mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            WearEngineFileTransmitManager.this.u(fileTaskInfo);
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/watch/thirdparty/file/WearEngineFileTransmitManager$d", "Lcom/oplus/aiunit/vision/hq9;", "", "nodeId", "Lcom/oplus/aiunit/vision/mc7;", "fileTaskInfo", "", "b", "a", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class d implements hq9 {
        public d() {
        }

        @Override // com.oplus.aiunit.vision.hq9
        public void a(@Nullable String nodeId, @NotNull mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
            WearEngineFileTransmitManager.this.n(fileTaskInfo);
        }

        @Override // com.oplus.aiunit.vision.hq9
        public void b(@Nullable String nodeId, @NotNull mc7 fileTaskInfo) {
            Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        }
    }

    public /* synthetic */ WearEngineFileTransmitManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @JvmStatic
    @NotNull
    public static final WearEngineFileTransmitManager o() {
        return INSTANCE.a();
    }

    @Override // com.oplus.aiunit.vision.el4.b
    public synchronized void a(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        r("onProgressChanged", macAddress, fileTaskInfo, new b());
    }

    @Override // com.oplus.aiunit.vision.el4.b
    public synchronized void b(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        r("onTransferCompleted", macAddress, fileTaskInfo, new c());
    }

    @Override // com.oplus.aiunit.vision.el4.b
    public synchronized void c(@NotNull String macAddress, @NotNull mc7 fileTaskInfo) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(fileTaskInfo, "fileTaskInfo");
        r("onTransferRequested", macAddress, fileTaskInfo, new d());
    }

    public final void j(String uri, String filePath, String taskId, nc7 fileTaskListener) {
        k(taskId, new ssg(uri, filePath, taskId, fileTaskListener));
        w(uri, taskId, filePath);
    }

    public final void k(String taskId, ssg sendRecordInfo) {
        nvj.a(TAG, "[addPendTask] --> sendRecordInfo " + sendRecordInfo, new Object[0]);
        this.mSendPendMap.put(taskId, sendRecordInfo);
    }

    @Nullable
    public final synchronized String l(@Nullable String uri, @NotNull SendFileRequest sendFileRequest, @NotNull nc7 fileTaskListener) {
        Intrinsics.checkNotNullParameter(sendFileRequest, "sendFileRequest");
        Intrinsics.checkNotNullParameter(fileTaskListener, "fileTaskListener");
        ClientInfo clientInfoF = tf3.INSTANCE.f(sendFileRequest.getRequestPackageName());
        if (clientInfoF == null) {
            nvj.b(TAG, "[sendFile] --> clientInfo == null " + sendFileRequest.getRequestPackageName(), new Object[0]);
            return null;
        }
        String filePath = sendFileRequest.getFilePath();
        if (filePath != null && uri != null) {
            List<Node> connectedNodes = gl4.managerApi.getConnectedNodes();
            if (!connectedNodes.isEmpty() && connectedNodes.get(0) != null) {
                nvj.a(TAG, "[sendFile] --> start send file: uri=" + uri + ",filePath=" + filePath, new Object[0]);
                Node node = connectedNodes.get(0);
                int i = Intrinsics.areEqual(sendFileRequest.getTargetPackageName(), clientInfoF.getMcuTargetPackageName()) ? 104 : 17;
                el4 el4Var = gl4.devicePrimary.fileApi;
                Intrinsics.checkNotNull(node);
                String strB = el4Var.b(node.getMainModule().getMacAddress(), uri, i, filePath, Uri.parse(filePath));
                if (TextUtils.isEmpty(strB)) {
                    nvj.b(TAG, "[sendFile] --> taskId is empty", new Object[0]);
                    return null;
                }
                nvj.a(TAG, "[sendFile] --> mCurrentTaskId=" + strB, new Object[0]);
                j(uri, filePath, strB, fileTaskListener);
                return strB;
            }
            nvj.b(TAG, "[sendFile] --> nodeList size error", new Object[0]);
            return null;
        }
        nvj.b(TAG, "[sendFile] -->failed: apiClient == null) || (filePath == null", new Object[0]);
        return null;
    }

    public final synchronized void m(@NotNull String taskId) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        nvj.a(TAG, "[cancelSendAddWf] --> cancel success taskId=" + taskId, new Object[0]);
        gl4.devicePrimary.fileApi.cancelFile(taskId);
    }

    public final void n(mc7 fileTaskInfo) {
        String taskId = fileTaskInfo.h();
        long jC = fileTaskInfo.c();
        String fileName = fileTaskInfo.b();
        String uri = fileTaskInfo.i();
        Intrinsics.checkNotNullExpressionValue(uri, "uri");
        String[] strArr = (String[]) new Regex("/").split(uri, 0).toArray(new String[0]);
        String str = strArr.length >= 3 ? strArr[2] : "";
        String strP = p(fileTaskInfo);
        nvj.a(TAG, "dispatchRecFileMsg taskId = " + taskId + " fileSize = " + jC + " uri = " + uri + " packageName = " + strP + " fileInfo = " + str, new Object[0]);
        Intrinsics.checkNotNullExpressionValue(taskId, "taskId");
        Intrinsics.checkNotNullExpressionValue(fileName, "fileName");
        FileListenerManager.g(strP, taskId, jC, fileName, str);
    }

    public final String p(mc7 fileTaskInfo) {
        String uri = fileTaskInfo.i();
        Intrinsics.checkNotNullExpressionValue(uri, "uri");
        String[] strArr = (String[]) new Regex("/").split(uri, 0).toArray(new String[0]);
        return strArr.length >= 2 ? strArr[1] : "";
    }

    public final synchronized List<String> q() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<Map.Entry<String, ssg>> it = this.mSendPendMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }

    public final void r(String tag, String nodeId, mc7 fileTaskInfo, hq9 iFileTaskDispatch) {
        nvj.a(TAG, "[" + tag + "] nodeId = " + nodeId, new Object[0]);
        if (fileTaskInfo == null) {
            nvj.a(TAG, "[filter] fileTaskInfo = null.", new Object[0]);
            return;
        }
        nvj.a(TAG, "[" + tag + "] -->  taskId  = " + fileTaskInfo.h() + " uri  = " + fileTaskInfo.i() + " nodeId  = " + nodeId + " fileName  = " + fileTaskInfo.b() + " progress  = " + fileTaskInfo.f() + " errorCode  = " + fileTaskInfo.a(), new Object[0]);
        if (fileTaskInfo.i() != null) {
            if (q().contains(fileTaskInfo.h())) {
                iFileTaskDispatch.b(nodeId, fileTaskInfo);
                return;
            } else {
                iFileTaskDispatch.a(nodeId, fileTaskInfo);
                return;
            }
        }
        nvj.a(TAG, "[" + tag + "] fileTaskInfo Uri = null.", new Object[0]);
    }

    public final void s(mc7 fileTaskInfo) {
        String strP = p(fileTaskInfo);
        String strH = fileTaskInfo.h();
        Intrinsics.checkNotNullExpressionValue(strH, "fileTaskInfo.taskId");
        String strB = fileTaskInfo.b();
        Intrinsics.checkNotNullExpressionValue(strB, "fileTaskInfo.fileName");
        FileListenerManager.f(strP, strH, strB, fileTaskInfo.a());
    }

    public final void t(mc7 fileTaskInfo) {
        String strP = p(fileTaskInfo);
        String strH = fileTaskInfo.h();
        Intrinsics.checkNotNullExpressionValue(strH, "fileTaskInfo.taskId");
        FileListenerManager.e(strP, strH, fileTaskInfo.f());
    }

    public final void u(mc7 fileTaskInfo) {
        String taskId = fileTaskInfo.h();
        int iA = fileTaskInfo.a();
        String strI = fileTaskInfo.i();
        ssg ssgVar = this.mSendPendMap.get(taskId);
        if (ssgVar == null) {
            nvj.d(TAG, "[onTransferCompleted] --> task uri = " + strI + " is not in task,and no handle.", new Object[0]);
            return;
        }
        nvj.a(TAG, "[onTransferCompleted] --> sendRecordInfo " + ssgVar, new Object[0]);
        nc7 observer = ssgVar.getObserver();
        nvj.d(TAG, "[onTransferCompleted] --> errorCode = " + iA, new Object[0]);
        if (iA == 0) {
            Intrinsics.checkNotNullExpressionValue(taskId, "taskId");
            observer.onSuccess(taskId);
        } else if (iA == 9) {
            nvj.a(TAG, "[onTransferCompleted] --> user cancel file,and not need callback. ", new Object[0]);
        }
        if (iA != 0) {
            nvj.a(TAG, "[onTransferCompleted] --> onError observer = " + observer, new Object[0]);
            Intrinsics.checkNotNullExpressionValue(taskId, "taskId");
            observer.onError(iA, taskId);
        }
        Intrinsics.checkNotNullExpressionValue(taskId, "taskId");
        z(taskId);
    }

    public final void v(mc7 fileTaskInfo) {
        String taskId = fileTaskInfo.h();
        ssg ssgVar = this.mSendPendMap.get(taskId);
        nvj.a(TAG, "[onProgressChanged] --> sendRecordInfo " + ssgVar, new Object[0]);
        nc7 observer = ssgVar != null ? ssgVar.getObserver() : null;
        if (observer != null) {
            Intrinsics.checkNotNullExpressionValue(taskId, "taskId");
            observer.a(new pc7(taskId, fileTaskInfo.b(), fileTaskInfo.f()));
        }
    }

    public final void w(String uri, String taskId, String filePath) {
        mc7 mc7Var = new mc7();
        mc7Var.l(qd7.a(filePath));
        mc7Var.o(0);
        mc7Var.s(uri);
        mc7Var.r(taskId);
        v(mc7Var);
    }

    public final void x(@NotNull String taskId, @Nullable String filePath) {
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        nvj.a(TAG, "receiveFile taskId = " + taskId + " filePath = " + filePath, new Object[0]);
        el4 el4Var = gl4.devicePrimary.fileApi;
        Intrinsics.checkNotNull(filePath);
        el4Var.receiveFile(taskId, filePath);
    }

    public final void y(@Nullable String taskId) {
        el4 el4Var = gl4.devicePrimary.fileApi;
        Intrinsics.checkNotNull(taskId);
        el4Var.rejectFile(taskId);
    }

    public final void z(String taskId) {
        nvj.a(TAG, "[removePendTask] --> taskId " + taskId, new Object[0]);
        this.mSendPendMap.remove(taskId);
    }

    public WearEngineFileTransmitManager() {
        this.mSendPendMap = new HashMap();
    }
}
