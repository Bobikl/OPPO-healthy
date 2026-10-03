package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.multiprocess.RemoteListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes12.dex */
public abstract class RemoteListenableWorker extends ListenableWorker {
    public static final String ARGUMENT_CLASS_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME";
    public static final String ARGUMENT_PACKAGE_NAME = "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME";
    static final String TAG = Logger.tagWithPrefix("RemoteListenableWorker");

    public RemoteListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    private static ListenableFuture<ListenableWorker.Result> getFailedFuture(@NonNull final String str) {
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: com.oplus.aiunit.vision.pof
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return RemoteListenableWorker.lambda$getFailedFuture$0(str, completer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$getFailedFuture$0(String str, CallbackToFutureAdapter.Completer completer) throws Exception {
        Logger.get().error(TAG, str);
        completer.setException(new IllegalArgumentException(str));
        return "RemoteListenableWorker Failed Future";
    }

    @NonNull
    public abstract ListenableFuture<ListenableWorker.Result> startRemoteWork();

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final ListenableFuture<ListenableWorker.Result> startWork() {
        return getFailedFuture("startWork() shouldn't never be called on RemoteListenableWorker");
    }
}
