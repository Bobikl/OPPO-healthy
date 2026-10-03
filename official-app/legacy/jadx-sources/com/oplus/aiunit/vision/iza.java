package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.core.CoreProps;
import p010kotlin.text.Typography;

/* JADX INFO: loaded from: classes10.dex */
public class iza implements e5i {
    @Override // com.oplus.aiunit.vision.e5i
    @Nullable
    public Object a(@NonNull hgb hgbVar, @NonNull kpf kpfVar) {
        if (CoreProps.ListItemType.BULLET == CoreProps.LIST_ITEM_TYPE.c(kpfVar)) {
            return new p82(hgbVar.e(), CoreProps.BULLET_LIST_ITEM_LEVEL.c(kpfVar).intValue());
        }
        return new ord(hgbVar.e(), String.valueOf(CoreProps.ORDERED_LIST_ITEM_NUMBER.c(kpfVar)) + "." + Typography.nbsp);
    }
}
