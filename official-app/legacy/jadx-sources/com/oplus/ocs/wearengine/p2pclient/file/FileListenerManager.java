package com.oplus.ocs.wearengine.p2pclient.file;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.heytap.accessory.file.model.Constant;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.k25;
import com.oplus.aiunit.vision.tf3;
import com.oplus.ocs.wearengine.aidl.IFileTransferListener;
import com.oplus.ocs.wearengine.common.Status;
import io.protostuff.MapSchema;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.SetsKt__SetsKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0007J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0005H\u0007J0\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0007J \u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J(\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0012H\u0007J3\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022!\u0010\u001b\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u001a0\u0017H\u0007J\u0010\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002R<\u0010#\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f0\u001ej\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u001f` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$¨\u0006("}, d2 = {"Lcom/oplus/ocs/wearengine/p2pclient/file/FileListenerManager;", "", "", "packageName", "", "Lcom/oplus/ocs/wearengine/aidl/IFileTransferListener;", "c", "listener", "", b2n.g, "i", "taskId", "", Constant.FILE_SIZE, LogSenderConst.FILENAME, "fileInfo", "Lcom/oplus/ocs/wearengine/common/Status;", b2n.f, "", "progress", MapSchema.FIELD_NAME_ENTRY, "errorCode", "f", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "block", "b", "d", "Ljava/util/HashMap;", "Landroid/os/RemoteCallbackList;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "MAP", "Ljava/util/Set;", "EMPTY", "<init>", "()V", "thirdparty_impl_release"}, k = 1, mv = {1, 8, 0})
public final class FileListenerManager {

    @NotNull
    public static final FileListenerManager INSTANCE = new FileListenerManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<String, RemoteCallbackList<IFileTransferListener>> MAP = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final Set<IFileTransferListener> EMPTY = SetsKt__SetsKt.emptySet();

    @JvmStatic
    @NotNull
    public static final Status b(@NotNull String packageName, @NotNull Function1<? super IFileTransferListener, Boolean> block) {
        Status status;
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(block, "block");
        if (tf3.INSTANCE.f(packageName) != null) {
            try {
                Set<IFileTransferListener> setC = c(packageName);
                boolean zBooleanValue = false;
                if (setC == null || setC.isEmpty()) {
                    status = new Status(28, null, 2, null);
                } else {
                    Iterator<IFileTransferListener> it = setC.iterator();
                    while (it.hasNext()) {
                        zBooleanValue |= block.invoke(it.next()).booleanValue();
                    }
                    status = zBooleanValue ? Status.SUCCESS : new Status(29, null, 2, null);
                }
            } catch (Exception e2) {
                k25.b("FileListenerManager", "dispatch() error:" + e2.getMessage());
                status = new Status(8, e2.getMessage());
            }
            if (status != null) {
                return status;
            }
        }
        return new Status(20, null, 2, null);
    }

    @JvmStatic
    @NotNull
    public static final synchronized Set<IFileTransferListener> c(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        RemoteCallbackList<IFileTransferListener> remoteCallbackList = MAP.get(packageName);
        if (remoteCallbackList == null) {
            return EMPTY;
        }
        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
        HashSet hashSet = new HashSet(iBeginBroadcast);
        for (int i = 0; i < iBeginBroadcast; i++) {
            hashSet.add(remoteCallbackList.getBroadcastItem(i));
        }
        remoteCallbackList.finishBroadcast();
        return hashSet;
    }

    @JvmStatic
    @NotNull
    public static final Status e(@NotNull String packageName, @NotNull final String taskId, final int progress) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        return b(packageName, new Function1<IFileTransferListener, Boolean>() { // from class: com.oplus.ocs.wearengine.p2pclient.file.FileListenerManager$onProgressChanged$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull IFileTransferListener it) throws RemoteException {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onProgressChanged(taskId, progress);
                return Boolean.TRUE;
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final Status f(@NotNull String packageName, @NotNull final String taskId, @NotNull final String fileName, final int errorCode) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return b(packageName, new Function1<IFileTransferListener, Boolean>() { // from class: com.oplus.ocs.wearengine.p2pclient.file.FileListenerManager$onTransferCompleted$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull IFileTransferListener it) throws RemoteException {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onTransferCompleted(taskId, fileName, FileListenerManager.INSTANCE.d(errorCode));
                return Boolean.TRUE;
            }
        });
    }

    @JvmStatic
    @NotNull
    public static final Status g(@NotNull String packageName, @NotNull final String taskId, final long fileSize, @NotNull final String fileName, @NotNull final String fileInfo) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileInfo, "fileInfo");
        return b(packageName, new Function1<IFileTransferListener, Boolean>() { // from class: com.oplus.ocs.wearengine.p2pclient.file.FileListenerManager$onTransferRequested$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p010kotlin.jvm.functions.Function1
            @NotNull
            public final Boolean invoke(@NotNull IFileTransferListener it) throws RemoteException {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onTransferRequested(taskId, fileSize, fileName, fileInfo);
                return Boolean.TRUE;
            }
        });
    }

    @JvmStatic
    public static final synchronized void h(@NotNull String packageName, @NotNull IFileTransferListener listener) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(listener, "listener");
        HashMap<String, RemoteCallbackList<IFileTransferListener>> map = MAP;
        RemoteCallbackList<IFileTransferListener> remoteCallbackList = map.get(packageName);
        if (remoteCallbackList == null) {
            remoteCallbackList = new RemoteCallbackList<>();
            map.put(packageName, remoteCallbackList);
        }
        remoteCallbackList.register(listener);
    }

    @JvmStatic
    public static final synchronized void i(@NotNull String packageName, @NotNull IFileTransferListener listener) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(listener, "listener");
        RemoteCallbackList<IFileTransferListener> remoteCallbackList = MAP.get(packageName);
        if (remoteCallbackList != null) {
            remoteCallbackList.unregister(listener);
        }
    }

    public final int d(int errorCode) {
        if (errorCode == 8) {
            return 208;
        }
        if (errorCode == 9) {
            return 209;
        }
        if (errorCode == 20001) {
            return 221;
        }
        switch (errorCode) {
            case -1:
                return 200;
            case 0:
                return 0;
            case 1:
                return 201;
            case 2:
                return 202;
            case 3:
                return 203;
            case 4:
                return 204;
            case 5:
                return 205;
            default:
                switch (errorCode) {
                    case 11:
                        return 211;
                    case 12:
                        return 212;
                    case 13:
                        return 213;
                    default:
                        return 8;
                }
        }
    }
}
