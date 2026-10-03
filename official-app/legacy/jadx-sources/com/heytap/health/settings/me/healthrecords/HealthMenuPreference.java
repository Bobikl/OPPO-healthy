package com.heytap.health.settings.me.healthrecords;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.preference.PreferenceViewHolder;
import com.coui.appcompat.preference.COUIMenuPreference;
import com.heytap.health.wallet.ui.adapter.BaseRecyclerViewHolder;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/settings/me/healthrecords/HealthMenuPreference;", "Lcom/coui/appcompat/preference/COUIMenuPreference;", "Landroidx/preference/PreferenceViewHolder;", BaseRecyclerViewHolder.HOLDER_TAG_HEADER, "", "onBindViewHolder", "Landroid/view/View;", "i0", "Landroid/view/View;", LogFieldKey.PROCESS_NAME_KEY, "()Landroid/view/View;", "setItemView", "(Landroid/view/View;)V", "itemView", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final class HealthMenuPreference extends COUIMenuPreference {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    @Nullable
    public View itemView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthMenuPreference(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.coui.appcompat.preference.COUIMenuPreference, com.coui.appcompat.preference.COUIPreference, androidx.preference.Preference
    public void onBindViewHolder(@NotNull PreferenceViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onBindViewHolder(holder);
        this.itemView = holder.itemView;
    }

    @Nullable
    /* JADX INFO: renamed from: p, reason: from getter */
    public final View getItemView() {
        return this.itemView;
    }
}
