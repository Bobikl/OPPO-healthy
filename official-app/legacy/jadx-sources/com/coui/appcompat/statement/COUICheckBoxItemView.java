package com.coui.appcompat.statement;

import android.widget.LinearLayout;
import com.coui.appcompat.checkbox.COUICheckBox;
import com.oplus.aiunit.vision.ove;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/coui/appcompat/statement/COUICheckBoxItemView;", "Landroid/widget/LinearLayout;", "Lcom/coui/appcompat/checkbox/COUICheckBox$c;", "listener", "", "setOnStateChangeListener", "Lcom/coui/appcompat/checkbox/COUICheckBox;", "i", "Lcom/coui/appcompat/checkbox/COUICheckBox;", "checkBox", "Lcom/oplus/aiunit/vision/ove;", "privacyItem", "Lcom/oplus/aiunit/vision/ove;", "getPrivacyItem", "()Lcom/oplus/aiunit/vision/ove;", "coui-support-statement_release"}, k = 1, mv = {1, 8, 0})
public final class COUICheckBoxItemView extends LinearLayout {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public COUICheckBox checkBox;

    @NotNull
    public final ove getPrivacyItem() {
        return null;
    }

    public final void setOnStateChangeListener(@NotNull COUICheckBox.c listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.checkBox.setOnStateChangeListener(listener);
    }
}
