package com.oplus.aiunit.vision;

import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class ntj {
    public final WeakReference<TextView> a;

    public ntj(@NonNull TextView textView) {
        this.a = new WeakReference<>(textView);
    }

    public static void a(@NonNull Spannable spannable, @NonNull TextView textView) {
        ntj[] ntjVarArr = (ntj[]) spannable.getSpans(0, spannable.length(), ntj.class);
        if (ntjVarArr != null) {
            for (ntj ntjVar : ntjVarArr) {
                spannable.removeSpan(ntjVar);
            }
        }
        spannable.setSpan(new ntj(textView), 0, spannable.length(), 18);
    }

    @Nullable
    public static TextView c(@NonNull Spanned spanned) {
        ntj[] ntjVarArr = (ntj[]) spanned.getSpans(0, spanned.length(), ntj.class);
        if (ntjVarArr == null || ntjVarArr.length <= 0) {
            return null;
        }
        return ntjVarArr[0].b();
    }

    @Nullable
    public TextView b() {
        return this.a.get();
    }
}
