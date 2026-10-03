package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.DeferrableSurfaces;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class DeferrableSurfaces {
    private DeferrableSurfaces() {
    }

    public static void decrementAll(@NonNull List<DeferrableSurface> list) {
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().decrementUseCount();
        }
    }

    public static void incrementAll(@NonNull List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                list.get(i).incrementUseCount();
                i++;
            } catch (DeferrableSurface.SurfaceClosedException e2) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    list.get(i2).decrementUseCount();
                }
                throw e2;
            }
        } while (i < list.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$surfaceListWithTimeout$1(final ListenableFuture listenableFuture, Executor executor, final boolean z, Collection collection, final CallbackToFutureAdapter.Completer completer) throws Exception {
        completer.addCancellationListener(new Runnable() { // from class: com.oplus.aiunit.vision.x75
            @Override // java.lang.Runnable
            public final void run() {
                listenableFuture.cancel(true);
            }
        }, executor);
        Futures.addCallback(listenableFuture, new FutureCallback<List<Surface>>() { // from class: androidx.camera.core.impl.DeferrableSurfaces.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(@NonNull Throwable th) {
                if (th instanceof TimeoutException) {
                    completer.setException(th);
                } else {
                    completer.set(Collections.emptyList());
                }
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onSuccess(@Nullable List<Surface> list) {
                Preconditions.checkNotNull(list);
                ArrayList arrayList = new ArrayList(list);
                if (z) {
                    arrayList.removeAll(Collections.singleton(null));
                }
                completer.set(arrayList);
            }
        }, executor);
        return "surfaceList[" + collection + "]";
    }

    @NonNull
    public static ListenableFuture<List<Surface>> surfaceListWithTimeout(@NonNull final Collection<DeferrableSurface> collection, final boolean z, long j2, @NonNull final Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator<DeferrableSurface> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(Futures.nonCancellationPropagating(it.next().getSurface()));
        }
        final ListenableFuture listenableFutureMakeTimeoutFuture = Futures.makeTimeoutFuture(j2, scheduledExecutorService, Futures.successfulAsList(arrayList));
        return CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: com.oplus.aiunit.vision.w75
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                return DeferrableSurfaces.lambda$surfaceListWithTimeout$1(listenableFutureMakeTimeoutFuture, executor, z, collection, completer);
            }
        });
    }

    public static boolean tryIncrementAll(@NonNull List<DeferrableSurface> list) {
        try {
            incrementAll(list);
            return true;
        } catch (DeferrableSurface.SurfaceClosedException unused) {
            return false;
        }
    }
}
