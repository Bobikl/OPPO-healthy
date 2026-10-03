package com.google.android.material.shape;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.oplus.aiunit.vision.jg2;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@RequiresApi(33)
class ShapeableDelegateV33 extends ShapeableDelegate {
    public ShapeableDelegateV33(@NonNull View view) {
        initMaskOutlineProvider(view);
    }

    @DoNotInline
    private void initMaskOutlineProvider(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.shape.ShapeableDelegateV33.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                if (ShapeableDelegateV33.this.shapePath.isEmpty()) {
                    return;
                }
                jg2.a(outline, ShapeableDelegateV33.this.shapePath);
            }
        });
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public void invalidateClippingMethod(@NonNull View view) {
        view.setClipToOutline(!shouldUseCompatClipping());
        if (shouldUseCompatClipping()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public boolean shouldUseCompatClipping() {
        return this.forceCompatClippingEnabled;
    }
}
