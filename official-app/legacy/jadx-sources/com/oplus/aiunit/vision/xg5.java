package com.oplus.aiunit.vision;

import android.content.Context;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.health.settings.R$id;
import com.heytap.health.settings.R$layout;
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
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016R\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/xg5;", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", "", "payloads", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "viewClickListener", "", "onBindViewHolder", "bindLayout", "i", "I", "getImgres", "()I", "imgres", "j", "getImageIndex", "imageIndex", MapSchema.FIELD_NAME_KEY, "getTitle", "title", LogFieldKey.LEVEL_KEY, "getDesc", DBHealthReviewPlan.DESC, "<init>", "(IIII)V", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class xg5 extends JViewBean {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int imgres;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int imageIndex;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int title;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final int desc;

    public xg5(int i, int i2, int i3, int i4) {
        this.imgres = i;
        this.imageIndex = i2;
        this.title = i3;
        this.desc = i4;
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.settings_mm_hardware_tips_vp_item;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@NotNull JViewHolder holder, int position, @Nullable List<Object> payloads, @Nullable OnViewClickListener<?> viewClickListener) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        String str = yg5.c()[this.imageIndex][qe0.y(holder.getActivity()) ? 1 : 0];
        Context activity = holder.getActivity();
        if (activity == null) {
            activity = b78.a();
        }
        com.bumptech.glide.a.v(activity).d().Y0(str).q(this.imgres).h0(this.imgres).s0(true).Q0((ImageView) holder.getView(R$id.iv));
        holder.setText(R$id.name, this.title).setText(R$id.desc, this.desc);
    }
}
