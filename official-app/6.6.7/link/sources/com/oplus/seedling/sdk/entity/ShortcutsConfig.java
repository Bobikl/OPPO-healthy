package com.oplus.seedling.sdk.entity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.ArrayMap;
import androidx.annotation.Keep;
import com.oplus.aiunit.vision.EnumModeData;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.opos.process.bridge.base.BridgeConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0002\u0010\nR\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/oplus/seedling/sdk/entity/ShortcutsConfig;", "", EnumModeData.TAG_ICON, "Landroid/graphics/drawable/Drawable;", "title", "", TraceConstants.KEY_ACTION, "Landroid/content/Intent;", BridgeConstant.KEY_EXTRAS, "Landroid/util/ArrayMap;", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;Landroid/content/Intent;Landroid/util/ArrayMap;)V", "getExtras", "()Landroid/util/ArrayMap;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "getIntent", "()Landroid/content/Intent;", "setIntent", "(Landroid/content/Intent;)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShortcutsConfig {

    @Nullable
    private final ArrayMap<String, Object> extras;

    @Nullable
    private Drawable icon;

    @NotNull
    private Intent intent;

    @NotNull
    private String title;

    public ShortcutsConfig(@Nullable Drawable drawable, @NotNull String str, @NotNull Intent intent, @Nullable ArrayMap<String, Object> arrayMap) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
        this.icon = drawable;
        this.title = str;
        this.intent = intent;
        this.extras = arrayMap;
    }

    @Nullable
    public final ArrayMap<String, Object> getExtras() {
        return this.extras;
    }

    @Nullable
    public final Drawable getIcon() {
        return this.icon;
    }

    @NotNull
    public final Intent getIntent() {
        return this.intent;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setIcon(@Nullable Drawable drawable) {
        this.icon = drawable;
    }

    public final void setIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "<set-?>");
        this.intent = intent;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public /* synthetic */ ShortcutsConfig(Drawable drawable, String str, Intent intent, ArrayMap arrayMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, str, intent, (i & 8) != 0 ? null : arrayMap);
    }
}
