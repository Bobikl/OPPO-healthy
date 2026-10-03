package com.oplus.aiunit.vision;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.health.step.R$id;
import com.heytap.health.step.R$layout;
import com.heytap.health.step.R$string;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 !2\u00020\u0001:\u0002\u0003\nB\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R$\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/hsi;", "Lcom/oplus/aiunit/vision/e7c;", "", "a", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "position", "Landroid/content/Context;", "context", "", "b", "", "i", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "j", "getContent", "setContent", "content", "Lcom/oplus/aiunit/vision/hsi$b;", MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/hsi$b;", "getOnClickListener", "()Lcom/oplus/aiunit/vision/hsi$b;", "setOnClickListener", "(Lcom/oplus/aiunit/vision/hsi$b;)V", "onClickListener", "<init>", "()V", "Companion", "step_release"}, k = 1, mv = {1, 8, 0})
public final class hsi extends e7c {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public String title;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String content;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public b onClickListener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/hsi$b;", "", "", "a", "step_release"}, k = 1, mv = {1, 8, 0})
    public interface b {
        boolean a();
    }

    public hsi() {
        String string = b78.a().getString(R$string.step_start_step_record);
        Intrinsics.checkNotNullExpressionValue(string, "getAppContext()\n        …g.step_start_step_record)");
        this.title = string;
        String string2 = b78.a().getString(R$string.step_perm_tips_content);
        Intrinsics.checkNotNullExpressionValue(string2, "getAppContext()\n        …g.step_perm_tips_content)");
        this.content = string2;
    }

    public static final void f(hsi this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        a7b.f("StepPermTipsView", "onClickEnable");
        b bVar = this$0.onClickListener;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // com.oplus.aiunit.vision.e7c
    public int a() {
        return R$layout.step_perm_tips;
    }

    @Override // com.oplus.aiunit.vision.e7c
    public void b(@Nullable RecyclerView.ViewHolder holder, int position, @Nullable Context context) {
        View view;
        if (holder == null || (view = holder.itemView) == null) {
            return;
        }
        ((TextView) view.findViewById(R$id.step_perm_tips_title)).setText(this.title);
        ((TextView) view.findViewById(R$id.step_perm_tips_content)).setText(this.content);
        ((TextView) view.findViewById(R$id.step_perm_tips_enable)).setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.gsi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hsi.f(this.i, view2);
            }
        });
    }

    public final void setOnClickListener(@Nullable b bVar) {
        this.onClickListener = bVar;
    }
}
