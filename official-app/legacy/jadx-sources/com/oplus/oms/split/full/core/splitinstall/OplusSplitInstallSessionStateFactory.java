package com.oplus.oms.split.full.core.splitinstall;

import android.os.Bundle;
import com.oplus.oms.split.full.core.splitinstall.OplusSplitInstallSessionState;

/* JADX INFO: loaded from: classes8.dex */
public interface OplusSplitInstallSessionStateFactory<S extends OplusSplitInstallSessionState> {
    S create(Bundle bundle);

    S newState(S s, int i);

    S newState(S s, int i, int i2);
}
