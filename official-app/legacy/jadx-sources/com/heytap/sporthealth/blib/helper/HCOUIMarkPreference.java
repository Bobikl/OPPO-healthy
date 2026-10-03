package com.heytap.sporthealth.blib.helper;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.coui.appcompat.preference.COUIMarkPreference;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R*\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/heytap/sporthealth/blib/helper/HCOUIMarkPreference;", "Lcom/coui/appcompat/preference/COUIMarkPreference;", "", "drawDivider", "value", "v", "Z", "isShowDivider", "()Z", "setShowDivider", "(Z)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "lib_ui_release"}, k = 1, mv = {1, 8, 0})
public final class HCOUIMarkPreference extends COUIMarkPreference {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean isShowDivider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HCOUIMarkPreference(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.isShowDivider = true;
    }

    @Override // com.coui.appcompat.preference.COUIMarkPreference, androidx.recyclerview.widget.COUIRecyclerView.ICOUIDividerDecorationInterface
    public boolean drawDivider() {
        return this.isShowDivider && super.drawDivider();
    }

    public final void setShowDivider(boolean z) {
        this.isShowDivider = z;
        notifyChanged();
    }
}
