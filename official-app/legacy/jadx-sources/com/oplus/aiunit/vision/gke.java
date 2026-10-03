package com.oplus.aiunit.vision;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.device_settings.impl.R$drawable;
import com.heytap.health.device_settings.impl.R$id;
import com.heytap.health.device_settings.impl.R$layout;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.sporthealth.blib.adapter.face.IRecvDataDiff;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\u0007\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J6\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/oplus/aiunit/vision/gke;", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "Lcom/heytap/sporthealth/blib/adapter/face/IRecvDataDiff;", "oldData", "newData", "", "areContentsTheSame", "areItemsTheSame", "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", "", "payloads", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "viewClickListener", "", "onBindViewHolder", "bindLayout", "", "i", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "path", "<init>", "(Ljava/lang/String;)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPicImg.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PicImg.kt\ncom/heytap/health/devicelog/img/PicImg\n+ 2 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,39:1\n155#2:40\n29#3:41\n*S KotlinDebug\n*F\n+ 1 PicImg.kt\ncom/heytap/health/devicelog/img/PicImg\n*L\n20#1:40\n28#1:41\n*E\n"})
public final class gke extends JViewBean {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public final String path;

    /* JADX WARN: Multi-variable type inference failed */
    public gke() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean, com.heytap.sporthealth.blib.adapter.face.IRecvDataDiff
    public boolean areContentsTheSame(@Nullable IRecvDataDiff oldData, @Nullable IRecvDataDiff newData) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean, com.heytap.sporthealth.blib.adapter.face.IRecvDataDiff
    public boolean areItemsTheSame(@Nullable IRecvDataDiff oldData, @Nullable IRecvDataDiff newData) {
        String str;
        if (oldData == null) {
            str = null;
        } else {
            if (!(oldData instanceof gke)) {
                oldData = null;
            }
            gke gkeVar = (gke) oldData;
            if (gkeVar != null) {
                str = gkeVar.path;
            } else {
                str = null;
            }
        }
        if (!(newData instanceof gke)) {
            newData = null;
        }
        gke gkeVar2 = (gke) newData;
        return Intrinsics.areEqual(str, gkeVar2 != null ? gkeVar2.path : null);
    }

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.setting_device_pic_device_item;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@NotNull JViewHolder holder, int position, @Nullable List<Object> payloads, @Nullable OnViewClickListener<?> viewClickListener) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        String str = this.path;
        if (str == null) {
            holder.setImageResource(R$id.iv_pic, R$drawable.device_img_add);
            holder.goneViews(R$id.iv_del);
            return;
        }
        ImageView imageView = (ImageView) holder.getView(R$id.iv_pic);
        holder.visibleViews(R$id.iv_del);
        Bitmap bitmapH = fg1.h(Uri.parse(str));
        if (bitmapH != null) {
            imageView.setImageBitmap(bitmapH);
        }
    }

    public gke(@Nullable String str) {
        this.path = str;
    }

    public /* synthetic */ gke(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
