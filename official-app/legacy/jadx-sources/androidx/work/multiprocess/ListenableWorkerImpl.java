package androidx.work.multiprocess;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import androidx.work.multiprocess.ListenableWorkerImpl;
import androidx.work.multiprocess.parcelable.ParcelConverters;
import androidx.work.multiprocess.parcelable.ParcelableInterruptRequest;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ListenableWorkerImpl extends IListenableWorkerImpl.Stub {
    static final String TAG = Logger.tagWithPrefix("WM-RemoteWorker ListenableWorkerImpl");
    static byte[] sEMPTY = new byte[0];
    static final Object sLock = new Object();
    final Configuration mConfiguration;
    final Context mContext;
    final ForegroundUpdater mForegroundUpdater;
    final ProgressUpdater mProgressUpdater;
    final Map<String, Job> mRemoteWorkerWrapperMap;
    final TaskExecutor mTaskExecutor;

    public ListenableWorkerImpl(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
        RemoteWorkManagerInfo remoteWorkManagerInfo = RemoteWorkManagerInfo.getInstance(context);
        this.mConfiguration = remoteWorkManagerInfo.getConfiguration();
        this.mTaskExecutor = remoteWorkManagerInfo.getTaskExecutor();
        this.mProgressUpdater = remoteWorkManagerInfo.getProgressUpdater();
        this.mForegroundUpdater = remoteWorkManagerInfo.getForegroundUpdater();
        this.mRemoteWorkerWrapperMap = new HashMap();
    }

    @NonNull
    private ListenableFuture<ListenableWorker.Result> executeWorkRequest(@NonNull String str, @NonNull String str2, @NonNull WorkerParameters workerParameters) {
        CompletableJob completableJobJob = JobKt.Job((Job) null);
        synchronized (sLock) {
            this.mRemoteWorkerWrapperMap.put(str, completableJobJob);
        }
        return RemoteWorkerWrapperKt.executeRemoteWorker(this.mContext, this.mConfiguration, str2, workerParameters, completableJobJob, this.mTaskExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$interrupt$0(Job job, int i, IWorkManagerImplCallback iWorkManagerImplCallback) {
        job.cancel((CancellationException) new WorkerStoppedException(i));
        ListenableCallback.ListenableCallbackRunnable.reportSuccess(iWorkManagerImplCallback, sEMPTY);
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void interrupt(@NonNull byte[] bArr, @NonNull final IWorkManagerImplCallback iWorkManagerImplCallback) {
        final Job jobRemove;
        try {
            ParcelableInterruptRequest parcelableInterruptRequest = (ParcelableInterruptRequest) ParcelConverters.unmarshall(bArr, ParcelableInterruptRequest.CREATOR);
            String id = parcelableInterruptRequest.getId();
            final int stopReason = parcelableInterruptRequest.getStopReason();
            Logger.get().debug(TAG, "Interrupting work with id (" + id + ")");
            synchronized (sLock) {
                jobRemove = this.mRemoteWorkerWrapperMap.remove(id);
            }
            if (jobRemove != null) {
                this.mTaskExecutor.getSerialTaskExecutor().execute(new Runnable() { // from class: com.oplus.aiunit.vision.vza
                    @Override // java.lang.Runnable
                    public final void run() {
                        ListenableWorkerImpl.lambda$interrupt$0(jobRemove, stopReason, iWorkManagerImplCallback);
                    }
                });
            } else {
                ListenableCallback.ListenableCallbackRunnable.reportSuccess(iWorkManagerImplCallback, sEMPTY);
            }
        } catch (Throwable th) {
            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, th);
        }
    }

    @Override // androidx.work.multiprocess.IListenableWorkerImpl
    public void startWork(@NonNull byte[] bArr, @NonNull final IWorkManagerImplCallback iWorkManagerImplCallback) {
        try {
            ParcelableRemoteWorkRequest parcelableRemoteWorkRequest = (ParcelableRemoteWorkRequest) ParcelConverters.unmarshall(bArr, ParcelableRemoteWorkRequest.CREATOR);
            WorkerParameters workerParameters = parcelableRemoteWorkRequest.getParcelableWorkerParameters().toWorkerParameters(this.mConfiguration, this.mTaskExecutor, this.mProgressUpdater, this.mForegroundUpdater);
            final String string = workerParameters.getId().toString();
            String workerClassName = parcelableRemoteWorkRequest.getWorkerClassName();
            Logger.get().debug(TAG, "Executing work request (" + string + ", " + workerClassName + ")");
            final ListenableFuture<ListenableWorker.Result> listenableFutureExecuteWorkRequest = executeWorkRequest(string, workerClassName, workerParameters);
            listenableFutureExecuteWorkRequest.addListener(new Runnable() { // from class: androidx.work.multiprocess.ListenableWorkerImpl.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public void run() {
                    String str;
                    try {
                        try {
                            try {
                                ListenableCallback.ListenableCallbackRunnable.reportSuccess(iWorkManagerImplCallback, ParcelConverters.marshall(new ParcelableResult((ListenableWorker.Result) listenableFutureExecuteWorkRequest.get())));
                                synchronized (ListenableWorkerImpl.sLock) {
                                    Map<String, Job> map = ListenableWorkerImpl.this.mRemoteWorkerWrapperMap;
                                    str = string;
                                    map.remove(str);
                                }
                                this = str;
                            } catch (CancellationException e2) {
                                Logger.get().debug(ListenableWorkerImpl.TAG, "Worker (" + string + ") was cancelled");
                                ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, e2);
                                synchronized (ListenableWorkerImpl.sLock) {
                                    Map<String, Job> map2 = ListenableWorkerImpl.this.mRemoteWorkerWrapperMap;
                                    String str2 = string;
                                    map2.remove(str2);
                                    this = str2;
                                }
                            }
                        } catch (InterruptedException | ExecutionException e3) {
                            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, e3);
                            synchronized (ListenableWorkerImpl.sLock) {
                                Map<String, Job> map3 = ListenableWorkerImpl.this.mRemoteWorkerWrapperMap;
                                String str3 = string;
                                map3.remove(str3);
                                this = str3;
                            }
                        }
                    } catch (Throwable th) {
                        synchronized (ListenableWorkerImpl.sLock) {
                            ListenableWorkerImpl.this.mRemoteWorkerWrapperMap.remove(string);
                            throw th;
                        }
                    }
                }
            }, this.mTaskExecutor.getSerialTaskExecutor());
        } catch (Throwable th) {
            ListenableCallback.ListenableCallbackRunnable.reportFailure(iWorkManagerImplCallback, th);
        }
    }
}
