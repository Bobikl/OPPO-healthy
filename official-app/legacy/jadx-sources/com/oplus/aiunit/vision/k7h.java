package com.oplus.aiunit.vision;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class k7h extends nxe<Object, View> {
    public static final int KEY_HEIGHT = 1;
    public static final int KEY_WEIGHT = 2;
    public static final int KEY_WIDTH = 0;

    public static class b {
        public SparseArray<Object> a = new SparseArray<>();
        public View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13185c;

        public b(int i) {
            this.f13185c = i;
        }

        public k7h a() {
            return new k7h(this.b, this.f13185c, this.a);
        }

        public b b(int i) {
            this.a.put(1, Integer.valueOf(i));
            return this;
        }

        public b c(float f) {
            this.a.put(2, Float.valueOf(f));
            return this;
        }

        public b d(int i) {
            this.a.put(0, Integer.valueOf(i));
            return this;
        }
    }

    @Override // com.oplus.aiunit.vision.nxe
    public void c(View view, int i, SparseArray<Object> sparseArray) {
        if (view == null || view.getLayoutParams() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (sparseArray.get(0) != null) {
            layoutParams.width = ((Integer) sparseArray.get(0)).intValue();
        }
        if (sparseArray.get(1) != null) {
            layoutParams.height = ((Integer) sparseArray.get(1)).intValue();
        }
        if (sparseArray.get(2) != null && (layoutParams instanceof LinearLayout.LayoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).weight = ((Float) sparseArray.get(2)).floatValue();
        }
        view.setLayoutParams(layoutParams);
    }

    public k7h(@Nullable View view, int i, SparseArray<Object> sparseArray) {
        super(view, i, sparseArray);
    }
}
