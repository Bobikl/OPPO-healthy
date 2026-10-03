package com.heytap.health.esim;

import android.content.Context;
import android.view.View;
import androidx.preference.PreferenceViewHolder;
import com.coui.appcompat.preference.COUIJumpPreference;
import com.coui.appcompat.rotateview.COUIRotateView;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"com/heytap/health/esim/EsimListEmptyFragment$createAndAddItem$titleItem$1", "Lcom/coui/appcompat/preference/COUIJumpPreference;", "Landroidx/preference/PreferenceViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "onBindViewHolder", "", "expand", LogFieldKey.LEVEL_KEY, "Lcom/coui/appcompat/rotateview/COUIRotateView;", "Q", "Lcom/coui/appcompat/rotateview/COUIRotateView;", "getRotateView", "()Lcom/coui/appcompat/rotateview/COUIRotateView;", "setRotateView", "(Lcom/coui/appcompat/rotateview/COUIRotateView;)V", "rotateView", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class EsimListEmptyFragment$createAndAddItem$titleItem$1 extends COUIJumpPreference {

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    public COUIRotateView rotateView;

    public EsimListEmptyFragment$createAndAddItem$titleItem$1(Context context) {
        super(context);
    }

    public final void l(boolean expand) {
        COUIRotateView cOUIRotateView = this.rotateView;
        if (cOUIRotateView != null) {
            cOUIRotateView.b(expand, true);
        }
    }

    @Override // com.coui.appcompat.preference.COUIPreference, androidx.preference.Preference
    public void onBindViewHolder(@Nullable PreferenceViewHolder holder) {
        View view;
        super.onBindViewHolder(holder);
        this.rotateView = (holder == null || (view = holder.itemView) == null) ? null : (COUIRotateView) view.findViewById(R$id.coui_preference_widget_rotate_jump);
    }
}
