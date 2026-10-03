package com.oplus.aiunit.vision;

import android.text.SpannableString;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.ui.R$id;
import com.heytap.health.ui.R$layout;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.pz4, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0016\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010$\u001a\u00020\u000f¢\u0006\u0004\b7\u00108J\t\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J:\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0017\u0010\u0015\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a\"\u0004\b\u001d\u0010\u001eR\u0019\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014R\u0017\u0010$\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R$\u0010/\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b-\u0010\u0014\"\u0004\b&\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/oplus/aiunit/vision/pz4;", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", "", "payloads", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "viewClickListener", "", "onBindViewHolder", "bindLayout", "", "toString", "i", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "title", "", "j", "Z", MapSchema.FIELD_NAME_ENTRY, "()Z", "stable", "c", "o", "(Z)V", "selected", LogFieldKey.LEVEL_KEY, b2n.f, "unit", LogFieldKey.MESSAGE_KEY, "value", "Landroid/text/SpannableString;", "n", "Landroid/text/SpannableString;", "d", "()Landroid/text/SpannableString;", LogFieldKey.PROCESS_NAME_KEY, "(Landroid/text/SpannableString;)V", "spanStr", "b", "(Ljava/lang/String;)V", "fitnessStr", "", "J", b2n.g, "()J", "setUpdateTime", "(J)V", "updateTime", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public final class DataType extends JViewBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final boolean stable;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    public boolean selected;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String unit;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final String value;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SpannableString spanStr;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public String fitnessStr;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public long updateTime;

    public DataType() {
        this(null, false, false, null, null, 31, null);
    }

    public static final void l(OnViewClickListener onViewClickListener, DataType this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onViewClickListener != null) {
            onViewClickListener.onItemClicked(view, this$0);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFitnessStr() {
        return this.fitnessStr;
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.lib_ui_share_options_item_text;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final SpannableString getSpanStr() {
        return this.spanStr;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getStable() {
        return this.stable;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @NotNull
    public final DataType k() {
        this.updateTime = System.currentTimeMillis();
        return this;
    }

    public final void n(@Nullable String str) {
        this.fitnessStr = str;
    }

    public final void o(boolean z) {
        this.selected = z;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@Nullable JViewHolder holder, int position, @Nullable List<Object> payloads, @Nullable final OnViewClickListener<Object> viewClickListener) {
        if (holder != null) {
            int i = R$id.share_option_text;
            holder.setText(i, this.name).a(i, this.selected);
            holder.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.oz4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DataType.l(viewClickListener, this, view);
                }
            });
        }
    }

    public final void p(@Nullable SpannableString spannableString) {
        this.spanStr = spannableString;
    }

    @NotNull
    public String toString() {
        return "DataType(name='" + this.name + "', selected=" + this.selected + ")";
    }

    public /* synthetic */ DataType(String str, boolean z, boolean z2, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? "" : str3);
    }

    public DataType(@NotNull String title, boolean z, boolean z2, @Nullable String str, @NotNull String value) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.name = title;
        this.stable = z;
        this.selected = z2;
        this.unit = str;
        this.value = value;
    }
}
