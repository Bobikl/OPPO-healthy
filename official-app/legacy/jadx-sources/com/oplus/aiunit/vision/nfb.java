package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
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
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0001H\u0016R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/nfb;", "Lcom/oplus/aiunit/vision/nrj;", "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", "", "payloads", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "viewClickListener", "", "onBindViewHolder", "bindLayout", "a", "Landroid/graphics/Bitmap;", "j", "Landroid/graphics/Bitmap;", "d", "()Landroid/graphics/Bitmap;", "traceData", MapSchema.FIELD_NAME_KEY, "I", "getResId", "()I", "resId", "", "selected", "<init>", "(Landroid/graphics/Bitmap;IZ)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final class nfb extends nrj {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Bitmap traceData;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int resId;

    public /* synthetic */ nfb(Bitmap bitmap, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bitmap, i, (i2 & 4) != 0 ? false : z);
    }

    @Override // com.oplus.aiunit.vision.nrj
    @NotNull
    public nrj a() {
        return new nfb(this.traceData, this.resId, getSelected());
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.lib_ui_share_item_template_map;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Bitmap getTraceData() {
        return this.traceData;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@Nullable JViewHolder holder, int position, @Nullable List<Object> payloads, @Nullable OnViewClickListener<?> viewClickListener) {
        if (holder != null) {
            holder.itemView.setSelected(getSelected());
            holder.setImageResource(R$id.share_template_image, this.resId);
        }
    }

    public nfb(@Nullable Bitmap bitmap, int i, boolean z) {
        super(z);
        this.traceData = bitmap;
        this.resId = i;
    }
}
