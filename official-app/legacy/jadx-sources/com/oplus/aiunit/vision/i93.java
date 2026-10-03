package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.TypefaceSpan;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.ui.R$plurals;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sports.R$id;
import com.heytap.sports.R$layout;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J:\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0001H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lcom/oplus/aiunit/vision/i93;", "Lcom/oplus/aiunit/vision/nrj;", "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", "", "payloads", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "viewClickListener", "", "onBindViewHolder", "bindLayout", "a", "numDays", "Landroid/content/Context;", "context", "", b2n.f, "", "j", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "sportStr", MapSchema.FIELD_NAME_KEY, "I", MapSchema.FIELD_NAME_ENTRY, "()I", "days", "", "selected", "<init>", "(Ljava/lang/String;IZ)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class i93 extends nrj {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String sportStr;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int days;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i93(@NotNull String sportStr, int i, boolean z) {
        super(z);
        Intrinsics.checkNotNullParameter(sportStr, "sportStr");
        this.sportStr = sportStr;
        this.days = i;
    }

    public static final void h(OnViewClickListener onViewClickListener, i93 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onViewClickListener != null) {
            onViewClickListener.onItemClicked(view, this$0);
        }
    }

    @Override // com.oplus.aiunit.vision.nrj
    @NotNull
    public nrj a() {
        return new i93(this.sportStr, this.days, getSelected());
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.lib_ui_share_item_template_check_in;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getDays() {
        return this.days;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSportStr() {
        return this.sportStr;
    }

    public final CharSequence g(int numDays, Context context) {
        String strK = qtf.k(R$plurals.lib_ui_share_template_day, context, numDays);
        SpannableString spannableString = new SpannableString(strK);
        spannableString.setSpan(new AbsoluteSizeSpan(32, true), 0, String.valueOf(numDays).length(), 33);
        spannableString.setSpan(new TypefaceSpan("sans-serif"), String.valueOf(numDays).length(), strK.length(), 33);
        return spannableString;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@Nullable JViewHolder holder, int position, @Nullable List<Object> payloads, @Nullable final OnViewClickListener<Object> viewClickListener) {
        if (holder != null) {
            holder.itemView.setSelected(getSelected());
            holder.setText(R$id.share_template_check_in_text1, this.sportStr);
            int i = this.days;
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
            holder.setText(R$id.share_template_check_in_text2, g(i, context));
            holder.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.h93
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    i93.h(viewClickListener, this, view);
                }
            });
        }
    }
}
