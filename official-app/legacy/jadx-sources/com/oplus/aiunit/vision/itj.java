package com.oplus.aiunit.vision;

import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes13.dex */
public class itj extends nxe<Float, TextView> {
    public static final int KEY_SIZE_UNIT = 2;
    public static final int KEY_TEXT_SIZE = 1;

    public static class b {
        public SparseArray<Float> a = new SparseArray<>();
        public TextView b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12651c;

        public b(int i) {
            this.f12651c = i;
        }

        public itj a() {
            return new itj(this.b, this.f12651c, this.a);
        }

        public b b(float f) {
            this.a.put(2, Float.valueOf(f));
            return this;
        }

        public b c(float f) {
            this.a.put(1, Float.valueOf(f));
            return this;
        }
    }

    public final int g(float f) {
        if (f == 1.0f) {
            return 1;
        }
        return f == 2.0f ? 0 : 2;
    }

    @Override // com.oplus.aiunit.vision.nxe
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(TextView textView, int i, SparseArray<Float> sparseArray) {
        int iG = sparseArray.get(2) != null ? g(sparseArray.get(2).floatValue()) : 2;
        if (sparseArray.get(1) != null) {
            textView.setTextSize(iG, sparseArray.get(1).floatValue());
        }
    }

    public itj(@Nullable TextView textView, int i, @NonNull SparseArray<Float> sparseArray) {
        super(textView, i, sparseArray);
    }
}
