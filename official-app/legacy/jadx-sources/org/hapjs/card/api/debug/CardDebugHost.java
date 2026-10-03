package org.hapjs.card.api.debug;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public interface CardDebugHost {
    String getArchiveHost();

    String getRuntimeHost();

    boolean launch(Context context, String str);
}
