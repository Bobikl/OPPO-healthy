package com.oplus.oms.split.full.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import com.oplus.aiunit.vision.ct2;
import com.oplus.aiunit.vision.h8i;
import com.oplus.aiunit.vision.i8i;
import com.oplus.aiunit.vision.k8i;
import com.oplus.aiunit.vision.tmi;
import com.oplus.aiunit.vision.w7i;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState;

/* JADX INFO: loaded from: classes8.dex */
public final class a<S extends OplusSplitInstallSessionState> extends tmi<S> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h8i f20003e;
    public final OplusSplitInstallSessionStateFactory<S> f;

    public a(Context context, OplusSplitInstallSessionStateFactory<S> oplusSplitInstallSessionStateFactory) {
        this(context, i8i.a(), oplusSplitInstallSessionStateFactory);
    }

    public void f(Intent intent) {
        h8i h8iVar;
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            w7i.c("SplitInstallListenerRegistry", "receive null session_state", new Object[0]);
            return;
        }
        OplusSplitInstallSessionState oplusSplitInstallSessionStateCreate = this.f.create(bundleExtra);
        w7i.e("SplitInstallListenerRegistry", "changeStatus onReceive: sessionId: %d, status: %d, errorCode: %d", Integer.valueOf(oplusSplitInstallSessionStateCreate.sessionId()), Integer.valueOf(oplusSplitInstallSessionStateCreate.status()), Integer.valueOf(oplusSplitInstallSessionStateCreate.errorCode()));
        if (oplusSplitInstallSessionStateCreate.status() == 10 && !ct2.b().d()) {
            c(this.f.newState(oplusSplitInstallSessionStateCreate, 5));
        } else if (oplusSplitInstallSessionStateCreate.status() != 10 || (h8iVar = this.f20003e) == null) {
            c(oplusSplitInstallSessionStateCreate);
        } else {
            h8iVar.a(this.a, oplusSplitInstallSessionStateCreate.mSplitFileIntents, new k8i<>(this, this.f, oplusSplitInstallSessionStateCreate));
        }
    }

    public Handler g() {
        return ct2.b().a();
    }

    public a(Context context, h8i h8iVar, OplusSplitInstallSessionStateFactory<S> oplusSplitInstallSessionStateFactory) {
        super(new IntentFilter("com.oplus.oms.play.core.receiver.SplitInstallUpdateIntentService"), context);
        this.f20003e = h8iVar;
        this.f = oplusSplitInstallSessionStateFactory;
    }
}
