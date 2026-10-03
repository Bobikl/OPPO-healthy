package com.oplus.deviceui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.heytap.udeviceui.R$layout;
import com.oplus.aiunit.vision.eid;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/oplus/deviceui/DeviceItemButton;", "Landroid/widget/FrameLayout;", "Lcom/oplus/aiunit/vision/eid;", "listener", "", "setOnModeActionClickListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final class DeviceItemButton extends FrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceItemButton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), R$layout.mode_item_layout, this);
    }

    public final void setOnModeActionClickListener(@NotNull eid listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }
}
