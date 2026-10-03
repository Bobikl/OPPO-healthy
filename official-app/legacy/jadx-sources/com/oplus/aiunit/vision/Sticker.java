package com.oplus.aiunit.vision;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
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

/* JADX INFO: renamed from: com.oplus.aiunit.vision.wti, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010 \u001a\u00020\u000f\u0012\b\b\u0002\u0010#\u001a\u00020\u0013\u0012\b\b\u0002\u0010&\u001a\u00020\u0013¢\u0006\u0004\b'\u0010(J:\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u0006\u0010\u0012\u001a\u00020\u0000J\b\u0010\u0014\u001a\u00020\u0013H\u0016R\u001a\u0010\u0019\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010 \u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u001a\u0010&\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\u0018¨\u0006)"}, d2 = {"Lcom/oplus/aiunit/vision/wti;", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", "", "payloads", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "viewClickListener", "", "onBindViewHolder", "bindLayout", "other", "", "equals", "hashCode", "b", "", "toString", "i", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "name", "j", "Z", MapSchema.FIELD_NAME_ENTRY, "()Z", b2n.f, "(Z)V", "selected", MapSchema.FIELD_NAME_KEY, "c", "darkIcon", LogFieldKey.LEVEL_KEY, "getLightIcon", "lightIcon", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public final class Sticker extends JViewBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public boolean selected;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("darkIcon")
    @NotNull
    private final String icon;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lightIcon")
    @NotNull
    private final String lightIcon;

    public Sticker(@NotNull String name, boolean z, @NotNull String darkIcon, @NotNull String lightIcon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(darkIcon, "darkIcon");
        Intrinsics.checkNotNullParameter(lightIcon, "lightIcon");
        this.name = name;
        this.selected = z;
        this.icon = darkIcon;
        this.lightIcon = lightIcon;
    }

    public static final void f(OnViewClickListener onViewClickListener, Sticker this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (onViewClickListener != null) {
            onViewClickListener.onItemClicked(view, this$0);
        }
    }

    @NotNull
    public final Sticker b() {
        return new Sticker(this.name, this.selected, this.icon, null, 8, null);
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.lib_ui_share_options_item_sticker;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getSelected() {
        return this.selected;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Sticker.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.sporthealth.blib.weiget.share.vb.Sticker");
        Sticker sticker = (Sticker) other;
        return Intrinsics.areEqual(this.name, sticker.name) && this.selected == sticker.selected;
    }

    public final void g(boolean z) {
        this.selected = z;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Boolean.hashCode(this.selected);
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@Nullable JViewHolder holder, int position, @Nullable List<Object> payloads, @Nullable final OnViewClickListener<Object> viewClickListener) {
        if (holder != null) {
            afk.j(holder, R$id.share_option_sticker_icon, qe0.y(rg7.h()) ? this.icon : this.lightIcon);
            holder.setText(R$id.share_option_sticker_text, this.name);
            holder.itemView.setSelected(this.selected);
            holder.setOnClickListener(new View.OnClickListener() { // from class: com.oplus.aiunit.vision.vti
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Sticker.f(viewClickListener, this, view);
                }
            });
        }
    }

    @NotNull
    public String toString() {
        return "Sticker(name='" + this.name + "', selected=" + this.selected + ", icon='" + this.icon + "')";
    }

    public /* synthetic */ Sticker(String str, boolean z, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
