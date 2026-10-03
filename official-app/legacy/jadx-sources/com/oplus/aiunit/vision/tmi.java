package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.IntentFilter;
import com.oplus.oms.split.full.core.listener.OplusStateUpdatedListener;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public abstract class tmi<StateT> {
    public final Context a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IntentFilter f17064c;
    public final Set<OplusStateUpdatedListener<StateT>> b = Collections.newSetFromMap(new ConcurrentHashMap());
    public final Object d = new Object();

    public class a implements Runnable {
        public final /* synthetic */ Object i;

        public a(Object obj) {
            this.i = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (tmi.this.d) {
                Iterator it = tmi.this.b.iterator();
                while (it.hasNext()) {
                    ((OplusStateUpdatedListener) it.next()).onStateUpdate(this.i);
                }
            }
        }
    }

    public tmi(IntentFilter intentFilter, Context context) {
        this.f17064c = intentFilter;
        this.a = context;
    }

    public final void c(StateT statet) {
        w7i.e("StateUpdateListenerRegister", "notifyListeners: %s", statet);
        ct2.b().execute(new a(statet));
    }

    public final void d(OplusStateUpdatedListener<StateT> oplusStateUpdatedListener) {
        synchronized (this.d) {
            w7i.e("StateUpdateListenerRegister", "registerListener :%s", w7i.d(oplusStateUpdatedListener));
            if (this.b.contains(oplusStateUpdatedListener)) {
                w7i.e("StateUpdateListenerRegister", "listener has been registered! %s", w7i.d(oplusStateUpdatedListener));
            } else {
                this.b.add(oplusStateUpdatedListener);
            }
        }
    }

    public final void e(OplusStateUpdatedListener<StateT> oplusStateUpdatedListener) {
        synchronized (this.d) {
            w7i.e("StateUpdateListenerRegister", "unregisterListener :%s ret: %b", w7i.d(oplusStateUpdatedListener), Boolean.valueOf(this.b.remove(oplusStateUpdatedListener)));
        }
    }
}
