package com.heytap.health.adaptersdk;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.heytap.health.adaptersdk.IOAFAdapterService;
import com.heytap.health.adaptersdk.internal.LocalCallbackManager;
import com.oplus.aiunit.vision.gdb;
import com.oplus.aiunit.vision.oad;
import com.oplus.aiunit.vision.oxb;
import com.oplus.aiunit.vision.wil;
import com.oplus.aiunit.vision.yuf;
import com.oplus.health.apiprovider.ClientManager;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes15.dex */
public class a implements LocalCallbackManager.b {
    public static final String IOAFADAPTERSERVICE = "oaf.IOAFAdapterService";
    public static final a b = new a();
    public final AtomicInteger a;

    public a() {
        AtomicInteger atomicInteger = new AtomicInteger(new Random(System.currentTimeMillis()).nextInt(1000));
        this.a = atomicInteger;
        wil.d("OafAdapterHelper", "init random seq=" + atomicInteger);
    }

    public static a f() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(oxb oxbVar) {
        LocalCallbackManager.g().f(a(), oxbVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(oxb oxbVar) {
        LocalCallbackManager.g().q(a(), oxbVar);
    }

    @Override // com.heytap.health.adaptersdk.internal.LocalCallbackManager.b
    public IOAFAdapterService a() {
        return (IOAFAdapterService) ClientManager.getInstance().getBuildService(IOAFADAPTERSERVICE, new ClientManager.a() { // from class: com.oplus.aiunit.vision.j9d
            @Override // com.oplus.health.apiprovider.ClientManager.a
            public final Object a(IBinder iBinder) {
                return IOAFAdapterService.Stub.asInterface(iBinder);
            }
        });
    }

    public void e(final oxb oxbVar) {
        oad.f(new Runnable() { // from class: com.oplus.aiunit.vision.k9d
            @Override // java.lang.Runnable
            public final void run() {
                this.i.i(oxbVar);
            }
        });
    }

    public void g(Context context) {
        LocalCallbackManager.g().h(context, this);
    }

    public boolean h(String str) throws RemoteException {
        IOAFAdapterService iOAFAdapterServiceA = a();
        if (iOAFAdapterServiceA != null) {
            return iOAFAdapterServiceA.isOafConnect(str);
        }
        throw new RemoteException();
    }

    public void l(final oxb oxbVar) {
        oad.f(new Runnable() { // from class: com.oplus.aiunit.vision.i9d
            @Override // java.lang.Runnable
            public final void run() {
                this.i.j(oxbVar);
            }
        });
    }

    public void m(final String str, final MessageEvent messageEvent, final yuf yufVar) {
        int andIncrement = this.a.getAndIncrement();
        messageEvent.setSequence(andIncrement);
        if (wil.g()) {
            wil.d("OafAdapterHelper", "sendMessage: to " + gdb.a(str) + " seq=" + andIncrement + " sid=" + messageEvent.getServiceId() + " cid=" + messageEvent.getCommandId());
        } else {
            wil.d("OafAdapterHelper", "sendMessage: to " + gdb.a(str) + " seq=" + andIncrement + " " + messageEvent);
        }
        oad.g(new Runnable(str, messageEvent, yufVar) { // from class: com.oplus.aiunit.vision.h9d

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ String f12067j;
            public final /* synthetic */ MessageEvent k;

            @Override // java.lang.Runnable
            public final void run() {
                this.i.k(this.f12067j, this.k, null);
            }
        });
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void k(String str, MessageEvent messageEvent, yuf yufVar) {
        IOAFAdapterService iOAFAdapterServiceA = a();
        if (iOAFAdapterServiceA == null) {
            wil.b("OafAdapterHelper", "sendMessageI: apiSync is null");
            return;
        }
        try {
            iOAFAdapterServiceA.sendMessage(str, messageEvent, null);
        } catch (RemoteException e2) {
            wil.b("OafAdapterHelper", "sendMessageI: ex " + e2);
        }
    }
}
