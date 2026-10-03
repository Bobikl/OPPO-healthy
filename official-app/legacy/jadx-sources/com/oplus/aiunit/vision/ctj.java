package com.oplus.aiunit.vision;

import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class ctj {
    public final WeakReference<Layout> a;

    public ctj(@NonNull Layout layout) {
        this.a = new WeakReference<>(layout);
    }

    public static void a(@NonNull Spannable spannable, @NonNull Layout layout) {
        ctj[] ctjVarArr = (ctj[]) spannable.getSpans(0, spannable.length(), ctj.class);
        if (ctjVarArr != null) {
            for (ctj ctjVar : ctjVarArr) {
                spannable.removeSpan(ctjVar);
            }
        }
        spannable.setSpan(new ctj(layout), 0, spannable.length(), 18);
    }

    @Nullable
    public static Layout c(@NonNull Spanned spanned) {
        ctj[] ctjVarArr = (ctj[]) spanned.getSpans(0, spanned.length(), ctj.class);
        if (ctjVarArr == null || ctjVarArr.length <= 0) {
            return null;
        }
        return ctjVarArr[0].b();
    }

    @Nullable
    public Layout b() {
        return this.a.get();
    }
}
