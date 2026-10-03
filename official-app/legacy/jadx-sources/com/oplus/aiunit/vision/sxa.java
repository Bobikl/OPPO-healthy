package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.core.spans.LinkSpan;

/* JADX INFO: loaded from: classes10.dex */
public class sxa implements e5i {
    @Override // com.oplus.aiunit.vision.e5i
    @Nullable
    public Object a(@NonNull hgb hgbVar, @NonNull kpf kpfVar) {
        return new LinkSpan(hgbVar.e(), CoreProps.LINK_DESTINATION.c(kpfVar), hgbVar.b());
    }
}
