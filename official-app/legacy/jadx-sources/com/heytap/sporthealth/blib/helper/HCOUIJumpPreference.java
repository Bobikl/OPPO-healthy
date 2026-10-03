package com.heytap.sporthealth.blib.helper;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.preference.PreferenceViewHolder;
import com.coui.appcompat.preference.COUIJumpPreference;
import com.heytap.health.ui.R$drawable;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.qtf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R.\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/heytap/sporthealth/blib/helper/HCOUIJumpPreference;", "Lcom/coui/appcompat/preference/COUIJumpPreference;", "Landroidx/preference/PreferenceViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "onBindViewHolder", "", "value", "Q", "Ljava/lang/String;", "getIconUrl", "()Ljava/lang/String;", LogFieldKey.LEVEL_KEY, "(Ljava/lang/String;)V", "iconUrl", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreferenceDSL.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferenceDSL.kt\ncom/heytap/sporthealth/blib/helper/HCOUIJumpPreference\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1480:1\n256#2,2:1481\n*S KotlinDebug\n*F\n+ 1 PreferenceDSL.kt\ncom/heytap/sporthealth/blib/helper/HCOUIJumpPreference\n*L\n1275#1:1481,2\n*E\n"})
public final class HCOUIJumpPreference extends COUIJumpPreference {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @Nullable
    public String iconUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HCOUIJumpPreference(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void l(@Nullable String str) {
        setIcon(R$drawable.fit_default_img_holder);
        this.iconUrl = str;
    }

    @Override // com.coui.appcompat.preference.COUIPreference, androidx.preference.Preference
    public void onBindViewHolder(@NotNull PreferenceViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onBindViewHolder(holder);
        String str = this.iconUrl;
        if (str != null) {
            View viewFindViewById = holder.findViewById(R.id.icon);
            Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
            ImageView imageView = (ImageView) viewFindViewById;
            imageView.setVisibility(0);
            imageView.setMinimumWidth(qtf.b(36.0f));
            imageView.setMinimumHeight(imageView.getMinimumWidth());
            com.bumptech.glide.a.w(holder.itemView).q(str).i0(getIcon()).Q0(imageView);
        }
    }
}
