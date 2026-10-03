package org.greenrobot.greendao.async;

import android.os.Handler;
import android.os.Message;
import com.oplus.aiunit.vision.ds4;
import com.oplus.aiunit.vision.f5f;
import com.oplus.aiunit.vision.wz4;
import java.util.ArrayList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import org.greenrobot.greendao.DaoException;

/* JADX INFO: loaded from: classes11.dex */
public class a implements Runnable, Handler.Callback {
    public static ExecutorService o = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f20752j;
    public int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20754n;
    public final BlockingQueue<AsyncOperation> i = new LinkedBlockingQueue();
    public volatile int k = 50;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f20753l = 50;

    /* JADX INFO: renamed from: org.greenrobot.greendao.async.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C1049a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AsyncOperation.OperationType.values().length];
            a = iArr;
            try {
                iArr[AsyncOperation.OperationType.Delete.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AsyncOperation.OperationType.DeleteInTxIterable.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AsyncOperation.OperationType.DeleteInTxArray.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AsyncOperation.OperationType.Insert.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AsyncOperation.OperationType.InsertInTxIterable.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[AsyncOperation.OperationType.InsertInTxArray.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[AsyncOperation.OperationType.InsertOrReplace.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[AsyncOperation.OperationType.InsertOrReplaceInTxIterable.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[AsyncOperation.OperationType.InsertOrReplaceInTxArray.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[AsyncOperation.OperationType.Update.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[AsyncOperation.OperationType.UpdateInTxIterable.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[AsyncOperation.OperationType.UpdateInTxArray.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[AsyncOperation.OperationType.TransactionRunnable.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[AsyncOperation.OperationType.TransactionCallable.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[AsyncOperation.OperationType.QueryList.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[AsyncOperation.OperationType.QueryUnique.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[AsyncOperation.OperationType.DeleteByKey.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[AsyncOperation.OperationType.DeleteAll.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[AsyncOperation.OperationType.Load.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[AsyncOperation.OperationType.LoadAll.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[AsyncOperation.OperationType.Count.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                a[AsyncOperation.OperationType.Refresh.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public final void a(AsyncOperation asyncOperation) {
        asyncOperation.f = System.currentTimeMillis();
        try {
            switch (C1049a.a[asyncOperation.a.ordinal()]) {
                case 1:
                    asyncOperation.b.delete(asyncOperation.d);
                    break;
                case 2:
                    asyncOperation.b.deleteInTx((Iterable<Object>) asyncOperation.d);
                    break;
                case 3:
                    asyncOperation.b.deleteInTx((Object[]) asyncOperation.d);
                    break;
                case 4:
                    asyncOperation.b.insert(asyncOperation.d);
                    break;
                case 5:
                    asyncOperation.b.insertInTx((Iterable<Object>) asyncOperation.d);
                    break;
                case 6:
                    asyncOperation.b.insertInTx((Object[]) asyncOperation.d);
                    break;
                case 7:
                    asyncOperation.b.insertOrReplace(asyncOperation.d);
                    break;
                case 8:
                    asyncOperation.b.insertOrReplaceInTx((Iterable<Object>) asyncOperation.d);
                    break;
                case 9:
                    asyncOperation.b.insertOrReplaceInTx((Object[]) asyncOperation.d);
                    break;
                case 10:
                    asyncOperation.b.update(asyncOperation.d);
                    break;
                case 11:
                    asyncOperation.b.updateInTx((Iterable<Object>) asyncOperation.d);
                    break;
                case 12:
                    asyncOperation.b.updateInTx((Object[]) asyncOperation.d);
                    break;
                case 13:
                    d(asyncOperation);
                    break;
                case 14:
                    c(asyncOperation);
                    break;
                case 15:
                    asyncOperation.f20751j = ((f5f) asyncOperation.d).d().f();
                    break;
                case 16:
                    asyncOperation.f20751j = ((f5f) asyncOperation.d).d().g();
                    break;
                case 17:
                    asyncOperation.b.deleteByKey(asyncOperation.d);
                    break;
                case 18:
                    asyncOperation.b.deleteAll();
                    break;
                case 19:
                    asyncOperation.f20751j = asyncOperation.b.load(asyncOperation.d);
                    break;
                case 20:
                    asyncOperation.f20751j = asyncOperation.b.loadAll();
                    break;
                case 21:
                    asyncOperation.f20751j = Long.valueOf(asyncOperation.b.count());
                    break;
                case 22:
                    asyncOperation.b.refresh(asyncOperation.d);
                    break;
                default:
                    throw new DaoException("Unsupported operation: " + asyncOperation.a);
            }
        } catch (Throwable th) {
            asyncOperation.i = th;
        }
        asyncOperation.g = System.currentTimeMillis();
    }

    public final void b(AsyncOperation asyncOperation) {
        a(asyncOperation);
        e(asyncOperation);
    }

    public final void c(AsyncOperation asyncOperation) throws Exception {
        wz4 wz4VarA = asyncOperation.a();
        wz4VarA.beginTransaction();
        try {
            asyncOperation.f20751j = ((Callable) asyncOperation.d).call();
            wz4VarA.setTransactionSuccessful();
        } finally {
            wz4VarA.endTransaction();
        }
    }

    public final void d(AsyncOperation asyncOperation) {
        wz4 wz4VarA = asyncOperation.a();
        wz4VarA.beginTransaction();
        try {
            ((Runnable) asyncOperation.d).run();
            wz4VarA.setTransactionSuccessful();
        } finally {
            wz4VarA.endTransaction();
        }
    }

    public final void e(AsyncOperation asyncOperation) {
        asyncOperation.f();
        synchronized (this) {
            int i = this.f20754n + 1;
            this.f20754n = i;
            if (i == this.m) {
                notifyAll();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c A[LOOP:1: B:29:0x0086->B:31:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a7 A[LOOP:2: B:33:0x00a1->B:35:0x00a7, LOOP_END] */
    public final void f(AsyncOperation asyncOperation, AsyncOperation asyncOperation2) {
        boolean z;
        int size;
        ArrayList<AsyncOperation> arrayList = new ArrayList();
        arrayList.add(asyncOperation);
        arrayList.add(asyncOperation2);
        wz4 wz4VarA = asyncOperation.a();
        wz4VarA.beginTransaction();
        boolean z2 = false;
        int i = 0;
        while (true) {
            try {
                try {
                    if (i < arrayList.size()) {
                        AsyncOperation asyncOperation3 = (AsyncOperation) arrayList.get(i);
                        a(asyncOperation3);
                        if (!asyncOperation3.b()) {
                            z = true;
                            if (i == arrayList.size() - 1) {
                                AsyncOperation asyncOperationPeek = this.i.peek();
                                if (i >= this.k || !asyncOperation3.d(asyncOperationPeek)) {
                                    wz4VarA.setTransactionSuccessful();
                                } else {
                                    AsyncOperation asyncOperationRemove = this.i.remove();
                                    if (asyncOperationRemove != asyncOperationPeek) {
                                        throw new DaoException("Internal error: peeked op did not match removed op");
                                    }
                                    arrayList.add(asyncOperationRemove);
                                }
                            }
                            i++;
                        }
                        wz4VarA.endTransaction();
                        z2 = z;
                        if (z2) {
                            size = arrayList.size();
                            for (AsyncOperation asyncOperation4 : arrayList) {
                                asyncOperation4.k = size;
                                e(asyncOperation4);
                            }
                            return;
                        }
                        ds4.c("Reverted merged transaction because one of the operations failed. Executing operations one by one instead...");
                        for (AsyncOperation asyncOperation5 : arrayList) {
                            asyncOperation5.e();
                            b(asyncOperation5);
                        }
                        return;
                    }
                    wz4VarA.endTransaction();
                    z2 = z;
                } catch (RuntimeException e2) {
                    ds4.d("Async transaction could not be ended, success so far was: " + z, e2);
                }
                z = false;
                if (z2) {
                    size = arrayList.size();
                    while (r9.hasNext()) {
                        asyncOperation4.k = size;
                        e(asyncOperation4);
                    }
                    return;
                }
                ds4.c("Reverted merged transaction because one of the operations failed. Executing operations one by one instead...");
                while (r8.hasNext()) {
                    asyncOperation5.e();
                    b(asyncOperation5);
                }
                return;
            } catch (Throwable th) {
                try {
                    wz4VarA.endTransaction();
                } catch (RuntimeException e3) {
                    ds4.d("Async transaction could not be ended, success so far was: false", e3);
                }
                throw th;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        return false;
    }

    @Override // java.lang.Runnable
    public void run() {
        AsyncOperation asyncOperationPoll;
        while (true) {
            try {
                try {
                    AsyncOperation asyncOperationPoll2 = this.i.poll(1L, TimeUnit.SECONDS);
                    if (asyncOperationPoll2 == null) {
                        synchronized (this) {
                            asyncOperationPoll2 = this.i.poll();
                            if (asyncOperationPoll2 == null) {
                                this.f20752j = false;
                                this.f20752j = false;
                                return;
                            }
                        }
                    }
                    if (!asyncOperationPoll2.c() || (asyncOperationPoll = this.i.poll(this.f20753l, TimeUnit.MILLISECONDS)) == null) {
                        b(asyncOperationPoll2);
                    } else if (asyncOperationPoll2.d(asyncOperationPoll)) {
                        f(asyncOperationPoll2, asyncOperationPoll);
                    } else {
                        b(asyncOperationPoll2);
                        b(asyncOperationPoll);
                    }
                } catch (InterruptedException e2) {
                    ds4.f(Thread.currentThread().getName() + " was interruppted", e2);
                    this.f20752j = false;
                    return;
                }
            } catch (Throwable th) {
                this.f20752j = false;
                throw th;
            }
        }
    }
}
