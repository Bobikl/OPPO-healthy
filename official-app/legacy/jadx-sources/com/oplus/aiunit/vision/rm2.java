package com.oplus.aiunit.vision;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.support.appcompat.R$dimen;

/* JADX INFO: loaded from: classes13.dex */
public class rm2 {

    public class a extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName("android.widget.Button");
        }
    }

    public static void a(View view, boolean z) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -2);
        } else {
            layoutParams.width = -2;
            layoutParams.height = -2;
        }
        view.setLayoutParams(layoutParams);
        if (!z) {
            int dimensionPixelOffset = view.getContext().getResources().getDimensionPixelOffset(R$dimen.text_ripple_bg_padding_vertical);
            int dimensionPixelOffset2 = view.getContext().getResources().getDimensionPixelOffset(R$dimen.text_ripple_bg_padding_horizontal);
            view.setPadding(dimensionPixelOffset2, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset);
        }
        fj2 fj2Var = new fj2(view.getContext());
        fj2Var.v();
        view.setBackground(fj2Var);
        ph2.c(view, false);
        if (ViewCompat.getAccessibilityDelegate(view) == null) {
            ViewCompat.setAccessibilityDelegate(view, new a());
        }
    }

    public static void b(TextView textView) {
        a(textView, false);
    }
}
