package com.oplus.aiunit.vision;

import android.util.SparseArray;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes13.dex */
public class y3e extends nxe<Integer, View> {
    public static final int KEY_BOTTOM_PADDING = 2;
    public static final int KEY_END_PADDING = 3;
    public static final int KEY_START_PADDING = 1;
    public static final int KEY_TOP_PADDING = 0;

    public static class b {
        public SparseArray<Integer> a = new SparseArray<>();
        public View b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18859c;

        public b(int i) {
            this.f18859c = i;
        }

        public y3e a() {
            return new y3e(this.b, this.f18859c, this.a);
        }

        public b b(int i) {
            this.a.put(2, Integer.valueOf(i));
            return this;
        }

        public b c(int i) {
            this.a.put(3, Integer.valueOf(i));
            return this;
        }

        public b d(int i) {
            this.a.put(1, Integer.valueOf(i));
            return this;
        }

        public b e(int i) {
            this.a.put(0, Integer.valueOf(i));
            return this;
        }
    }

    @Override // com.oplus.aiunit.vision.nxe
    public void c(View view, int i, SparseArray<Integer> sparseArray) {
        ViewCompat.setPaddingRelative(view, sparseArray.get(1) != null ? sparseArray.get(1).intValue() : view.getPaddingStart(), sparseArray.get(0) != null ? sparseArray.get(0).intValue() : view.getPaddingTop(), sparseArray.get(3) != null ? sparseArray.get(3).intValue() : view.getPaddingEnd(), sparseArray.get(2) != null ? sparseArray.get(2).intValue() : view.getPaddingBottom());
    }

    public y3e(@Nullable View view, int i, SparseArray<Integer> sparseArray) {
        super(view, i, sparseArray);
    }
}
