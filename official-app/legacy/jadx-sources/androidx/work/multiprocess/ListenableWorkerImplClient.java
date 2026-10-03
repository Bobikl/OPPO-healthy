package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes12.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ListenableWorkerImplClient {
    static final String TAG = Logger.tagWithPrefix("ListenableWorkerImplClient");
    private Connection mConnection;
    final Context mContext;
    final Executor mExecutor;
    private final Object mLock = new Object();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class Connection implements ServiceConnection {
        private static final String TAG = Logger.tagWithPrefix("ListenableWorkerImplSession");
        final SettableFuture<IListenableWorkerImpl> mFuture = SettableFuture.create();

        @Override // android.content.ServiceConnection
        public void onBindingDied(@NonNull ComponentName componentName) {
            Logger.get().warning(TAG, "Binding died");
            this.mFuture.setException(new RuntimeException("Binding died"));
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(@NonNull ComponentName componentName) {
            Logger.get().error(TAG, "Unable to bind to service");
            this.mFuture.setException(new RuntimeException("Cannot bind to service " + componentName));
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
            Logger.get().debug(TAG, "Service connected");
            this.mFuture.set(IListenableWorkerImpl.Stub.asInterface(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NonNull ComponentName componentName) {
            Logger.get().warning(TAG, "Service disconnected");
            this.mFuture.setException(new RuntimeException("Service disconnected"));
        }
    }

    public ListenableWorkerImplClient(@NonNull Context context, @NonNull Executor executor) {
        this.mContext = context;
        this.mExecutor = executor;
    }

    private static void unableToBind(@NonNull Connection connection, @NonNull Throwable th) {
        Logger.get().error(TAG, "Unable to bind to service", th);
        connection.mFuture.setException(th);
    }

    @NonNull
    public ListenableFuture<byte[]> execute(@NonNull ComponentName componentName, @NonNull RemoteDispatcher<IListenableWorkerImpl> remoteDispatcher) {
        return execute(getListenableWorkerImpl(componentName), remoteDispatcher);
    }

    @Nullable
    @VisibleForTesting
    public Connection getConnection() {
        return this.mConnection;
    }

    @NonNull
    public ListenableFuture<IListenableWorkerImpl> getListenableWorkerImpl(@NonNull ComponentName componentName) {
        SettableFuture<IListenableWorkerImpl> settableFuture;
        synchronized (this.mLock) {
            if (this.mConnection == null) {
                Logger.get().debug(TAG, "Binding to " + componentName.getPackageName() + ", " + componentName.getClassName());
                this.mConnection = new Connection();
                try {
                    Intent intent = new Intent();
                    intent.setComponent(componentName);
                    if (!this.mContext.bindService(intent, this.mConnection, 1)) {
                        unableToBind(this.mConnection, new RuntimeException("Unable to bind to service"));
                    }
                } catch (Throwable th) {
                    unableToBind(this.mConnection, th);
                }
                settableFuture = this.mConnection.mFuture;
            } else {
                settableFuture = this.mConnection.mFuture;
            }
            throw th;
        }
        return settableFuture;
    }

    public void unbindService() {
        synchronized (this.mLock) {
            Connection connection = this.mConnection;
            if (connection != null) {
                this.mContext.unbindService(connection);
                this.mConnection = null;
            }
        }
    }

    @NonNull
    @SuppressLint({"LambdaLast"})
    public ListenableFuture<byte[]> execute(@NonNull ListenableFuture<IListenableWorkerImpl> listenableFuture, @NonNull RemoteDispatcher<IListenableWorkerImpl> remoteDispatcher) {
        return RemoteExecuteKt.execute(this.mExecutor, listenableFuture, remoteDispatcher);
    }
}
