package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.core.CoreProps;

/* JADX INFO: loaded from: classes10.dex */
public class mj8 implements e5i {
    @Override // com.oplus.aiunit.vision.e5i
    @Nullable
    public Object a(@NonNull hgb hgbVar, @NonNull kpf kpfVar) {
        return new lj8(hgbVar.e(), CoreProps.HEADING_LEVEL.c(kpfVar).intValue());
    }
}
