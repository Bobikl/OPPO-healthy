package com.oplus.aiunit.vision;

import android.graphics.Canvas;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes16.dex */
public interface dha {
    boolean a(RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder viewHolder2);

    void b(@Nullable RecyclerView.ViewHolder viewHolder, int i);

    void c(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z);

    void d(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);
}
