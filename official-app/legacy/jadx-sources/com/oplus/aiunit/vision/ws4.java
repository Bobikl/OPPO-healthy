package com.oplus.aiunit.vision;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.core.widget.charts.data.TimeStampedData;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import com.heytap.sports.R$layout;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b\u0012\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"¢\u0006\u0004\b*\u0010+J8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R%\u0010)\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/oplus/aiunit/vision/ws4;", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", "", "payloads", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "viewClickListener", "", "onBindViewHolder", "bindLayout", "", "i", "Z", MapSchema.FIELD_NAME_ENTRY, "()Z", b2n.f, "(Z)V", "selected", "j", "I", "c", "()I", "name", "", "Lcom/heytap/health/core/widget/charts/data/TimeStampedData;", MapSchema.FIELD_NAME_KEY, "Ljava/util/List;", "b", "()Ljava/util/List;", "data", "Lkotlin/Function1;", "", "", LogFieldKey.LEVEL_KEY, "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "nameUnit", "<init>", "(ZILjava/util/List;Lkotlin/jvm/functions/Function1;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStyleConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StyleConfig.kt\ncom/heytap/sports/track/data/DataCurve\n+ 2 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n*L\n1#1,311:1\n155#2:312\n*S KotlinDebug\n*F\n+ 1 StyleConfig.kt\ncom/heytap/sports/track/data/DataCurve\n*L\n71#1:312\n*E\n"})
public final class ws4 extends JViewBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean selected;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int name;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final List<TimeStampedData> data;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function1<Float, String> nameUnit;

    public ws4() {
        this(false, 0, null, null, 15, null);
    }

    public static final void f(ws4 this$0, OnViewClickListener onViewClickListener, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.selected = !this$0.selected;
        if (onViewClickListener != null) {
            onViewClickListener.onItemClicked(view, this$0);
        }
    }

    @NotNull
    public final List<TimeStampedData> b() {
        return this.data;
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.track_custom_style_data;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getName() {
        return this.name;
    }

    @Nullable
    public final Function1<Float, String> d() {
        return this.nameUnit;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public final void g(boolean z) {
        this.selected = z;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@NotNull JViewHolder holder, int position, @Nullable List<Object> payloads, @Nullable final OnViewClickListener<Object> viewClickListener) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setSelected(this.selected);
        View view = holder.itemView;
        if (!(view instanceof TextView)) {
            view = null;
        }
        TextView textView = (TextView) view;
        if (textView != null) {
            textView.setText(this.name);
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.vs4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ws4.f(this.i, viewClickListener, view2);
                }
            });
        }
    }

    public /* synthetic */ ws4(boolean z, int i, List list, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? null : function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ws4(boolean z, int i, @NotNull List<? extends TimeStampedData> data, @Nullable Function1<? super Float, String> function1) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.selected = z;
        this.name = i;
        this.data = data;
        this.nameUnit = function1;
    }
}
