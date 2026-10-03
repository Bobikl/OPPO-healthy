package com.heytap.health.watchface.business.creation.category.livephoto;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\n\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/watchface/business/creation/category/livephoto/WrapLLM;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$State;", "state", "", "onLayoutChildren", "Landroid/content/Context;", "i", "Landroid/content/Context;", "getC", "()Landroid/content/Context;", "c", "", "j", "I", "getI", "()I", "", MapSchema.FIELD_NAME_KEY, "Z", "getB", "()Z", "b", "<init>", "(Landroid/content/Context;IZ)V", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WrapLLM extends LinearLayoutManager {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Context c;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int i;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapLLM(@NotNull Context c2, int i, boolean z) {
        super(c2, i, z);
        Intrinsics.checkNotNullParameter(c2, "c");
        this.c = c2;
        this.i = i;
        this.b = z;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(recycler, "recycler");
        Intrinsics.checkNotNullParameter(state, "state");
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException unused) {
        }
    }
}
