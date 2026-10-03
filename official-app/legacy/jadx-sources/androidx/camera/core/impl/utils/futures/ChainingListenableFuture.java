package androidx.camera.core.impl.utils.futures;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class ChainingListenableFuture<I, O> extends FutureChain<O> implements Runnable {

    @Nullable
    private AsyncFunction<? super I, ? extends O> mFunction;

    @Nullable
    private ListenableFuture<? extends I> mInputFuture;
    private final BlockingQueue<Boolean> mMayInterruptIfRunningChannel = new LinkedBlockingQueue(1);
    private final CountDownLatch mOutputCreated = new CountDownLatch(1);

    @Nullable
    volatile ListenableFuture<? extends O> mOutputFuture;

    public ChainingListenableFuture(@NonNull AsyncFunction<? super I, ? extends O> asyncFunction, @NonNull ListenableFuture<? extends I> listenableFuture) {
        this.mFunction = (AsyncFunction) Preconditions.checkNotNull(asyncFunction);
        this.mInputFuture = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    private <E> void putUninterruptibly(@NonNull BlockingQueue<E> blockingQueue, @NonNull E e2) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(e2);
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private <E> E takeUninterruptibly(@NonNull BlockingQueue<E> blockingQueue) {
        E eTake;
        boolean z = false;
        while (true) {
            try {
                eTake = blockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return eTake;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (!super.cancel(z)) {
            return false;
        }
        putUninterruptibly(this.mMayInterruptIfRunningChannel, Boolean.valueOf(z));
        cancel(this.mInputFuture, z);
        cancel(this.mOutputFuture, z);
        return true;
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    @Nullable
    public O get() throws ExecutionException, InterruptedException {
        if (!isDone()) {
            ListenableFuture<? extends I> listenableFuture = this.mInputFuture;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.mOutputCreated.await();
            ListenableFuture<? extends O> listenableFuture2 = this.mOutputFuture;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return (O) super.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.camera.core.impl.utils.futures.AsyncFunction<? super I, ? extends O>, com.google.common.util.concurrent.ListenableFuture<? extends I>] */
    @Override // java.lang.Runnable
    public void run() {
        ?? r0 = (AsyncFunction<? super I, ? extends O>) null;
        try {
            try {
                try {
                    try {
                        final ListenableFuture<? extends O> listenableFutureApply = this.mFunction.apply(Futures.getUninterruptibly(this.mInputFuture));
                        this.mOutputFuture = listenableFutureApply;
                        if (!isCancelled()) {
                            listenableFutureApply.addListener(new Runnable() { // from class: androidx.camera.core.impl.utils.futures.ChainingListenableFuture.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        try {
                                            ChainingListenableFuture.this.set(Futures.getUninterruptibly(listenableFutureApply));
                                        } catch (CancellationException unused) {
                                            ChainingListenableFuture.this.cancel(false);
                                        } catch (ExecutionException e2) {
                                            ChainingListenableFuture.this.setException(e2.getCause());
                                        }
                                    } finally {
                                        ChainingListenableFuture.this.mOutputFuture = null;
                                    }
                                }
                            }, CameraXExecutors.directExecutor());
                        } else {
                            listenableFutureApply.cancel(((Boolean) takeUninterruptibly(this.mMayInterruptIfRunningChannel)).booleanValue());
                            this.mOutputFuture = null;
                        }
                    } catch (Error e2) {
                        setException(e2);
                    } catch (UndeclaredThrowableException e3) {
                        setException(e3.getCause());
                    }
                } finally {
                    this.mFunction = null;
                    this.mInputFuture = null;
                    this.mOutputCreated.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e4) {
                setException(e4.getCause());
            }
        } catch (Exception e5) {
            setException(e5);
        }
    }

    private void cancel(@Nullable Future<?> future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    @Override // androidx.camera.core.impl.utils.futures.FutureChain, java.util.concurrent.Future
    @Nullable
    public O get(long j2, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j2 = timeUnit2.convert(j2, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture<? extends I> listenableFuture = this.mInputFuture;
            if (listenableFuture != null) {
                long jNanoTime = System.nanoTime();
                listenableFuture.get(j2, timeUnit);
                j2 -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.mOutputCreated.await(j2, timeUnit)) {
                j2 -= Math.max(0L, System.nanoTime() - jNanoTime2);
                ListenableFuture<? extends O> listenableFuture2 = this.mOutputFuture;
                if (listenableFuture2 != null) {
                    listenableFuture2.get(j2, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j2, timeUnit);
    }
}
