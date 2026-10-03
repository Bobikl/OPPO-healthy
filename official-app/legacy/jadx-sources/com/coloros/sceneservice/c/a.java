package com.coloros.sceneservice.c;

import com.coloros.sceneservice.dataprovider.listener.StatementListener;
import com.coloros.sceneservice.f.h;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements Runnable {
    public final /* synthetic */ StatementListener la;

    public a(StatementListener statementListener) {
        this.la = statementListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.la.onGetStatementState(h.j());
    }
}
