package com.oplus.aiunit.vision;

import android.R;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import com.heytap.sports.R$layout;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/jzj;", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", "", "payloads", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "viewClickListener", "", "onBindViewHolder", "bindLayout", "", "i", "Z", "getSelected", "()Z", "d", "(Z)V", "selected", "j", "I", "getName", "()I", "name", MapSchema.FIELD_NAME_KEY, "b", ClickApiEntity.TIME, "<init>", "(ZII)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class jzj extends JViewBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean selected;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int name;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int time;

    public jzj(boolean z, int i, int i2) {
        this.selected = z;
        this.name = i;
        this.time = i2;
    }

    public static final void c(jzj this$0, OnViewClickListener onViewClickListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selected = !this$0.selected;
        if (onViewClickListener != null) {
            onViewClickListener.onItemClicked(view, this$0);
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.track_custom_style_time;
    }

    public final void d(boolean z) {
        this.selected = z;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@NotNull JViewHolder holder, int position, @Nullable List<Object> payloads, @Nullable final OnViewClickListener<Object> viewClickListener) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        TextView textView = (TextView) holder.itemView.findViewById(R.id.text1);
        textView.setText(this.name);
        textView.setSelected(this.selected);
        textView.setEnabled(!this.selected);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.izj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jzj.c(this.i, viewClickListener, view);
            }
        });
    }
}
