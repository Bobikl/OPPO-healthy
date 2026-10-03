package com.coui.component.responsiveui.status;

import com.oplus.pantaconnect.sdk.connectionservice.lan.LanConstants;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/coui/component/responsiveui/status/FoldingState;", "", "(Ljava/lang/String;I)V", "toString", "", "FOLD", "UNFOLD", LanConstants.OPERATOR_UNKNOWN, "coui-support-responsiveui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum FoldingState {
    FOLD,
    UNFOLD,
    UNKNOWN;

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return name();
    }
}
