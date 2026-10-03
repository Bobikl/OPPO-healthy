package org.greenrobot.greendao.async;

import com.oplus.aiunit.vision.a6;
import com.oplus.aiunit.vision.wz4;

/* JADX INFO: loaded from: classes11.dex */
public class AsyncOperation {
    public static final int FLAG_MERGE_TX = 1;
    public static final int FLAG_STOP_QUEUE_ON_EXCEPTION = 2;
    public static final int FLAG_TRACK_CREATOR_STACKTRACE = 4;
    public final OperationType a;
    public final a6<Object, Object> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wz4 f20749c;
    public final Object d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20750e;
    public volatile long f;
    public volatile long g;
    public volatile boolean h;
    public volatile Throwable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile Object f20751j;
    public volatile int k;

    public enum OperationType {
        Insert,
        InsertInTxIterable,
        InsertInTxArray,
        InsertOrReplace,
        InsertOrReplaceInTxIterable,
        InsertOrReplaceInTxArray,
        Update,
        UpdateInTxIterable,
        UpdateInTxArray,
        Delete,
        DeleteInTxIterable,
        DeleteInTxArray,
        DeleteByKey,
        DeleteAll,
        TransactionRunnable,
        TransactionCallable,
        QueryList,
        QueryUnique,
        Load,
        LoadAll,
        Count,
        Refresh
    }

    public wz4 a() {
        wz4 wz4Var = this.f20749c;
        return wz4Var != null ? wz4Var : this.b.getDatabase();
    }

    public boolean b() {
        return this.i != null;
    }

    public boolean c() {
        return (this.f20750e & 1) != 0;
    }

    public boolean d(AsyncOperation asyncOperation) {
        return asyncOperation != null && c() && asyncOperation.c() && a() == asyncOperation.a();
    }

    public void e() {
        this.f = 0L;
        this.g = 0L;
        this.h = false;
        this.i = null;
        this.f20751j = null;
        this.k = 0;
    }

    public synchronized void f() {
        this.h = true;
        notifyAll();
    }
}
