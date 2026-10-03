package com.oplus.statistics.strategy;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.oplus.statistics.strategy.WorkThread;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class WorkThread extends HandlerThread {
    public static final int MSG_WHAT_CHATTY_EVENT = 1;
    public final List<Runnable> i;
    public final SparseArray<PendingTask> j;
    public Handler k;

    @Retention(RetentionPolicy.SOURCE)
    public @interface MsgWhatType {
    }

    public static class PendingTask {
        public final Runnable a;
        public final long b;

        public PendingTask(@NonNull Runnable runnable, long j) {
            this.a = runnable;
            this.b = j;
        }
    }

    public static class SingletonHolder {
        public static final WorkThread a = new WorkThread();
    }

    public static /* synthetic */ String b() {
        return "onLooperPrepared, but looper is null";
    }

    public static void execute(Runnable runnable) {
        getInstance().post(runnable);
    }

    public static WorkThread getInstance() {
        return SingletonHolder.a;
    }

    public synchronized boolean hasMessages(int i) {
        Handler handler = this.k;
        if (handler != null) {
            return handler.hasMessages(i);
        }
        return this.j.get(i) != null;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        super.onLooperPrepared();
        Looper looper = getLooper();
        if (looper == null) {
            LogUtil.e("WorkThread", new Supplier() { // from class: com.oplus.aiunit.vision.f3m
                @Override // com.oplus.statistics.util.Supplier
                public final Object get() {
                    return WorkThread.b();
                }
            });
            return;
        }
        synchronized (this) {
            this.k = new Handler(looper);
            Iterator<Runnable> it = this.i.iterator();
            while (it.hasNext()) {
                this.k.post(it.next());
            }
            this.i.clear();
            for (int i = 0; i < this.j.size(); i++) {
                PendingTask pendingTaskValueAt = this.j.valueAt(i);
                this.k.postDelayed(pendingTaskValueAt.a, pendingTaskValueAt.b);
            }
            this.j.clear();
        }
    }

    public synchronized void post(Runnable runnable) {
        Handler handler = this.k;
        if (handler != null) {
            handler.post(runnable);
        } else {
            this.i.add(runnable);
        }
    }

    public synchronized void postDelay(int i, @NonNull Runnable runnable, long j) {
        Handler handler = this.k;
        if (handler != null) {
            handler.postDelayed(runnable, j);
        } else {
            this.j.put(i, new PendingTask(runnable, j));
        }
    }

    public synchronized void removeMessages(int i) {
        Handler handler = this.k;
        if (handler != null) {
            handler.removeMessages(i);
        } else {
            this.j.remove(i);
        }
    }

    public WorkThread() {
        super("OplusTrack-thread");
        this.i = new ArrayList();
        this.j = new SparseArray<>();
        start();
    }
}
