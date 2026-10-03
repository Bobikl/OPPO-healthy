package com.oplus.aiunit.vision;

import android.content.Context;
import com.oplus.accountsdk.base.common.util.AcLogUtil;
import com.platform.usercenter.account.ams.ipc.IpcRequest;
import com.platform.usercenter.account.ams.ipc.support.AcInnerCallbackWrapper;
import com.platform.usercenter.account.ams.ipc.support.AcIpcRequestHelper;
import com.platform.usercenter.account.ams.ipc.support.AcIpcResponse;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback;
import com.platform.usercenter.account.ams.ipc.support.IAcIpcUriProvider;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes6.dex */
public class wa<T> {
    public String a;
    public AtomicBoolean b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ConcurrentLinkedQueue<AcInnerCallbackWrapper> f18179c = new ConcurrentLinkedQueue<>();
    public final ReentrantReadWriteLock d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReentrantReadWriteLock.ReadLock f18180e;
    public final ReentrantReadWriteLock.WriteLock f;

    public wa(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.d = reentrantReadWriteLock;
        this.f18180e = reentrantReadWriteLock.readLock();
        this.f = reentrantReadWriteLock.writeLock();
        this.a = str;
    }

    public static /* synthetic */ void d(IAcIpcRequestCallback iAcIpcRequestCallback, Object obj) {
        iAcIpcRequestCallback.call((AcIpcResponse) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str, AcInnerCallbackWrapper acInnerCallbackWrapper, AcIpcResponse acIpcResponse) {
        AcLogUtil.i("AcIpcSchedulerHelper", "start callback for appI: " + this.a, str);
        acInnerCallbackWrapper.getCallback().call(acIpcResponse);
        AcLogUtil.i("AcIpcSchedulerHelper", "end callback for appI: " + this.a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(final AcIpcResponse acIpcResponse) {
        this.f.lock();
        while (true) {
            try {
                final AcInnerCallbackWrapper acInnerCallbackWrapperPoll = this.f18179c.poll();
                if (acInnerCallbackWrapperPoll == null) {
                    this.b.set(false);
                    this.f.unlock();
                    return;
                } else {
                    final String traceId = acInnerCallbackWrapperPoll.getTraceId();
                    zj.a().g(new Runnable() { // from class: com.oplus.aiunit.vision.va
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.i.e(traceId, acInnerCallbackWrapperPoll, acIpcResponse);
                        }
                    });
                }
            } catch (Throwable th) {
                this.b.set(false);
                this.f.unlock();
                throw th;
            }
        }
    }

    public void g(boolean z, Context context, IpcRequest ipcRequest, String str, final IAcIpcRequestCallback<AcIpcResponse> iAcIpcRequestCallback, IAcIpcUriProvider iAcIpcUriProvider) {
        AcInnerCallbackWrapper acInnerCallbackWrapper = new AcInnerCallbackWrapper(str, new IAcIpcRequestCallback() { // from class: com.oplus.aiunit.vision.ta
            @Override // com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback
            public final void call(Object obj) {
                wa.d(iAcIpcRequestCallback, obj);
            }
        });
        this.f18180e.lock();
        try {
            this.f18179c.add(acInnerCallbackWrapper);
            if (this.b.compareAndSet(false, true)) {
                this.f18180e.unlock();
                AcIpcRequestHelper.requestIpc(z, context, new WeakReference(context), ipcRequest, str, new IAcIpcRequestCallback() { // from class: com.oplus.aiunit.vision.ua
                    @Override // com.platform.usercenter.account.ams.ipc.support.IAcIpcRequestCallback
                    public final void call(Object obj) {
                        this.a.f((AcIpcResponse) obj);
                    }
                }, iAcIpcUriProvider);
                return;
            }
            AcLogUtil.i("AcIpcSchedulerHelper", " appI: " + this.a + " request ipc waiting result waiting size" + this.f18179c.size(), str);
            this.f18180e.unlock();
        } catch (Throwable th) {
            this.f18180e.unlock();
            throw th;
        }
    }
}
