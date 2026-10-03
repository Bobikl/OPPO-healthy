package autodispose2.lifecycle;

import autodispose2.OutsideScopeException;

/* JADX INFO: loaded from: classes12.dex */
public class LifecycleEndedException extends OutsideScopeException {
    public LifecycleEndedException() {
        this("Lifecycle has ended!");
    }

    public LifecycleEndedException(String str) {
        super(str);
    }
}
