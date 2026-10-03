package autodispose2.lifecycle;

import autodispose2.OutsideScopeException;

/* JADX INFO: loaded from: classes12.dex */
public class LifecycleNotStartedException extends OutsideScopeException {
    public LifecycleNotStartedException() {
        this("Lifecycle hasn't started!");
    }

    public LifecycleNotStartedException(String str) {
        super(str);
    }
}
