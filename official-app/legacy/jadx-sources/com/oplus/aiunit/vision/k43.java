package com.oplus.aiunit.vision;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.impl.R$id;
import com.heytap.health.device_settings.impl.R$layout;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.health.watchpair.view.WatchView;
import com.heytap.sporthealth.blib.adapter.face.IRecvDataDiff;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\b\b\u0003\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J6\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016R\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/oplus/aiunit/vision/k43;", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "Lcom/heytap/sporthealth/blib/adapter/face/IRecvDataDiff;", "oldData", "newData", "", "areContentsTheSame", "areItemsTheSame", "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", "", "payloads", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "viewClickListener", "", "onBindViewHolder", "bindLayout", "i", "I", "getDrawableResId", "()I", "drawableResId", "j", "getTitleResId", "titleResId", "<init>", "(II)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSunysResourceResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SunysResourceResponse.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/CarouselImageBean\n+ 2 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n*L\n1#1,137:1\n155#2:138\n155#2:139\n155#2:140\n155#2:141\n*S KotlinDebug\n*F\n+ 1 SunysResourceResponse.kt\ncom/heytap/health/settings/watch/sporthealthsettings2/ui/collaborationRelated/CarouselImageBean\n*L\n65#1:138\n66#1:139\n71#1:140\n72#1:141\n*E\n"})
public final class k43 extends JViewBean {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int drawableResId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int titleResId;

    public k43(int i, @StringRes int i2) {
        this.drawableResId = i;
        this.titleResId = i2;
    }

    public static final void b(WatchView watchView) {
        watchView.U(0.0f, qtf.b(320.0f));
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean, com.heytap.sporthealth.blib.adapter.face.IRecvDataDiff
    public boolean areContentsTheSame(@Nullable IRecvDataDiff oldData, @Nullable IRecvDataDiff newData) {
        k43 k43Var;
        k43 k43Var2;
        if (oldData != null) {
            if (!(oldData instanceof k43)) {
                oldData = null;
            }
            k43Var = (k43) oldData;
        } else {
            k43Var = null;
        }
        if (newData != null) {
            if (!(newData instanceof k43)) {
                newData = null;
            }
            k43Var2 = (k43) newData;
        } else {
            k43Var2 = null;
        }
        if (Intrinsics.areEqual(k43Var != null ? Integer.valueOf(k43Var.drawableResId) : null, k43Var2 != null ? Integer.valueOf(k43Var2.drawableResId) : null)) {
            if (Intrinsics.areEqual(k43Var != null ? Integer.valueOf(k43Var.titleResId) : null, k43Var2 != null ? Integer.valueOf(k43Var2.titleResId) : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean, com.heytap.sporthealth.blib.adapter.face.IRecvDataDiff
    public boolean areItemsTheSame(@Nullable IRecvDataDiff oldData, @Nullable IRecvDataDiff newData) {
        k43 k43Var;
        k43 k43Var2;
        if (oldData != null) {
            if (!(oldData instanceof k43)) {
                oldData = null;
            }
            k43Var = (k43) oldData;
        } else {
            k43Var = null;
        }
        if (newData != null) {
            if (!(newData instanceof k43)) {
                newData = null;
            }
            k43Var2 = (k43) newData;
        } else {
            k43Var2 = null;
        }
        if (Intrinsics.areEqual(k43Var != null ? Integer.valueOf(k43Var.drawableResId) : null, k43Var2 != null ? Integer.valueOf(k43Var2.drawableResId) : null)) {
            if (Intrinsics.areEqual(k43Var != null ? Integer.valueOf(k43Var.titleResId) : null, k43Var2 != null ? Integer.valueOf(k43Var2.titleResId) : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.lib_ip_item_select_photo;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@NotNull JViewHolder holder, int position, @Nullable List<Object> payloads, @Nullable OnViewClickListener<?> viewClickListener) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ((TextView) holder.getView(R$id.tv_title)).setText(this.titleResId != 0 ? holder.itemView.getContext().getString(this.titleResId) : "");
        ImageView imageView = (ImageView) holder.getView(R$id.iv_photo);
        final WatchView watchView = (WatchView) holder.getView(R$id.iv_ipWatchKk);
        imageView.setImageResource(this.drawableResId);
        UserDeviceInfo userDeviceInfoJ = gl4.managerApi.j();
        if (userDeviceInfoJ != null) {
            watchView.L(userDeviceInfoJ.getMac(), userDeviceInfoJ.getModel());
            watchView.post(new Runnable() { // from class: com.oplus.aiunit.vision.j43
                @Override // java.lang.Runnable
                public final void run() {
                    k43.b(watchView);
                }
            });
        }
    }
}
