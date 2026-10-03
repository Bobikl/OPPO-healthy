package com.oplus.aiunit.vision;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.sporthealth.blib.adapter.face.OnViewClickListener;
import com.heytap.sporthealth.blib.adapter.holder.JViewHolder;
import com.heytap.sporthealth.blib.adapter.vb.JViewBean;
import com.heytap.sports.R$layout;
import com.heytap.sports.R$string;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/dw4;", "Lcom/heytap/sporthealth/blib/adapter/vb/JViewBean;", "Lcom/heytap/sporthealth/blib/adapter/holder/JViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "position", "", "", "payloads", "Lcom/heytap/sporthealth/blib/adapter/face/OnViewClickListener;", "viewClickListener", "", "onBindViewHolder", "bindLayout", "<init>", "()V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStyleConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StyleConfig.kt\ncom/heytap/sports/track/data/DataSelectDescVb\n+ 2 UIConfig.kt\ncom/heytap/sporthealth/blib/helper/UIConfigKt\n*L\n1#1,311:1\n155#2:312\n*S KotlinDebug\n*F\n+ 1 StyleConfig.kt\ncom/heytap/sports/track/data/DataSelectDescVb\n*L\n102#1:312\n*E\n"})
public final class dw4 extends JViewBean {
    public static final int $stable = 0;

    @Override // com.heytap.sporthealth.blib.adapter.vb.JViewBean
    public int bindLayout() {
        return R$layout.track_custom_style_data_desc;
    }

    @Override // com.heytap.sporthealth.blib.adapter.face.IRecvData
    public void onBindViewHolder(@NotNull JViewHolder holder, int position, @Nullable List<Object> payloads, @Nullable OnViewClickListener<Object> viewClickListener) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        View view = holder.itemView;
        if (!(view instanceof TextView)) {
            view = null;
        }
        TextView textView = (TextView) view;
        if (textView != null) {
            textView.setText(R$string.sports_track_ani_realtime_data_limit);
            textView.setOnClickListener(null);
        }
    }
}
