package com.heytap.wearable.watch.emergency.safeguard;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.wearable.watch.emergency.R$id;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/heytap/wearable/watch/emergency/safeguard/ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "b", "()Landroid/widget/TextView;", "title", "j", "a", "text", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "emergency_impl_release"}, k = 1, mv = {1, 8, 0})
public final class ViewHolder extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final TextView title;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TextView text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHolder(@NotNull View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "itemView.findViewById(R.id.title)");
        this.title = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "itemView.findViewById(R.id.text)");
        TextView textView = (TextView) viewFindViewById2;
        this.text = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextView getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextView getTitle() {
        return this.title;
    }
}
