package com.chad.library.adapter.base.binder;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"com/chad/library/adapter/base/binder/QuickDataBindingItemBinder$BinderDataBindingHolder", "Landroidx/databinding/ViewDataBinding;", "DB", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "i", "Landroidx/databinding/ViewDataBinding;", "getDataBinding", "()Landroidx/databinding/ViewDataBinding;", "dataBinding", "<init>", "(Landroidx/databinding/ViewDataBinding;)V", "com.github.CymChad.brvah"}, k = 1, mv = {1, 6, 0})
public final class QuickDataBindingItemBinder$BinderDataBindingHolder<DB extends ViewDataBinding> extends BaseViewHolder {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final DB dataBinding;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuickDataBindingItemBinder$BinderDataBindingHolder(@NotNull DB dataBinding) {
        Intrinsics.checkNotNullParameter(dataBinding, "dataBinding");
        View root = dataBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "dataBinding.root");
        super(root);
        this.dataBinding = dataBinding;
    }
}
