package com.liulishuo.okdownload.core.listener;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.liulishuo.okdownload.DownloadTask;
import com.liulishuo.okdownload.core.Util;
import com.liulishuo.okdownload.core.cause.EndCause;
import com.liulishuo.okdownload.core.listener.assist.Listener1Assist;

/* JADX INFO: loaded from: classes5.dex */
public abstract class DownloadListener3 extends DownloadListener1 {

    /* JADX INFO: renamed from: com.liulishuo.okdownload.core.listener.DownloadListener3$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause;

        static {
            int[] iArr = new int[EndCause.values().length];
            $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause = iArr;
            try {
                iArr[EndCause.COMPLETED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause[EndCause.CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause[EndCause.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause[EndCause.PRE_ALLOCATE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause[EndCause.FILE_BUSY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$liulishuo$okdownload$core$cause$EndCause[EndCause.SAME_TASK_BUSY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public abstract void canceled(@NonNull DownloadTask downloadTask);

    public abstract void completed(@NonNull DownloadTask downloadTask);

    public abstract void error(@NonNull DownloadTask downloadTask, @NonNull Exception exc);

    public abstract void started(@NonNull DownloadTask downloadTask);

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public void taskEnd(@NonNull DownloadTask downloadTask, @NonNull EndCause endCause, @Nullable Exception exc, @NonNull Listener1Assist.Listener1Model listener1Model) {
        switch (AnonymousClass1.$SwitchMap$com$liulishuo$okdownload$core$cause$EndCause[endCause.ordinal()]) {
            case 1:
                completed(downloadTask);
                break;
            case 2:
                canceled(downloadTask);
                break;
            case 3:
            case 4:
                error(downloadTask, exc);
                break;
            case 5:
            case 6:
                warn(downloadTask);
                break;
            default:
                Util.w("DownloadListener3", "Don't support " + endCause);
                break;
        }
    }

    @Override // com.liulishuo.okdownload.core.listener.assist.Listener1Assist.Listener1Callback
    public final void taskStart(@NonNull DownloadTask downloadTask, @NonNull Listener1Assist.Listener1Model listener1Model) {
        started(downloadTask);
    }

    public abstract void warn(@NonNull DownloadTask downloadTask);
}
