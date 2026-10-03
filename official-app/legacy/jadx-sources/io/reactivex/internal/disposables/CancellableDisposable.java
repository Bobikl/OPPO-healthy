package io.reactivex.internal.disposables;

import com.oplus.aiunit.vision.bx2;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.h4g;
import com.oplus.aiunit.vision.iu6;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class CancellableDisposable extends AtomicReference<bx2> implements cv5 {
    private static final long serialVersionUID = 5718521705281392066L;

    public CancellableDisposable(bx2 bx2Var) {
        super(bx2Var);
    }

    @Override // com.oplus.aiunit.vision.cv5
    public void dispose() {
        bx2 andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        try {
            andSet.cancel();
        } catch (Exception e2) {
            iu6.b(e2);
            h4g.r(e2);
        }
    }

    @Override // com.oplus.aiunit.vision.cv5
    public boolean isDisposed() {
        return get() == null;
    }
}
