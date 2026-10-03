package com.oplus.aiunit.vision;

import android.content.Context;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes15.dex */
public abstract class e7c {
    public abstract int a();

    public abstract void b(RecyclerView.ViewHolder viewHolder, int i, Context context);

    public void c() {
    }

    public void d(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
