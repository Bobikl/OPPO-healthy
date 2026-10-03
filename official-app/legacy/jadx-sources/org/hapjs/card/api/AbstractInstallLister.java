package org.hapjs.card.api;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractInstallLister implements InstallListener {
    @Override // org.hapjs.card.api.InstallListener
    public final void onInstallResult(String str, int i) {
        onInstallResult(str, i, 100);
    }
}
