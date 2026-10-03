package org.hapjs.card.api;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractRenderListener implements IRenderListener {
    @Override // org.hapjs.card.api.IRenderListener, com.nearme.instant.xcard.IRenderListener
    public final void onRenderException(int i, String str) {
        onRenderFailed(i, str);
    }
}
