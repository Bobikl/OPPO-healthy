package com.heytap.nearx.uikit.widget.dialogview.widget;

import android.content.Context;
import android.graphics.Outline;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.heytap.nearx.uikit.R$dimen;

/* JADX INFO: loaded from: classes18.dex */
public class NearAlertDialogClipCornerLinearLayout extends LinearLayoutCompat {
    public NearAlertDialogClipCornerLinearLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R$dimen.nx_dialog_background_corner_radius);
        setClipToOutline(true);
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.heytap.nearx.uikit.widget.dialogview.widget.NearAlertDialogClipCornerLinearLayout.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, NearAlertDialogClipCornerLinearLayout.this.getMeasuredWidth(), NearAlertDialogClipCornerLinearLayout.this.getMeasuredHeight(), dimensionPixelOffset);
            }
        });
    }

    public NearAlertDialogClipCornerLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NearAlertDialogClipCornerLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
