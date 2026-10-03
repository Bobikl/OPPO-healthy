package com.oplus.aiunit.vision;

import android.os.Bundle;
import com.oplus.cardwidget.domain.pack.BaseDataPack;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/wmm;", "Lcom/oplus/aiunit/vision/t9m;", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroid/os/Bundle;", "data", "f", MapSchema.FIELD_NAME_ENTRY, "Ljava/lang/String;", b2n.f, "()Ljava/lang/String;", "widgetCode", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public final /* data */ class wmm extends t9m {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String widgetCode;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Bundle data;

    public wmm(@NotNull String widgetCode, @NotNull Bundle data) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(data, "data");
        this.widgetCode = widgetCode;
        this.data = data;
        c(System.currentTimeMillis());
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Bundle getData() {
        return this.data;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof wmm)) {
            return false;
        }
        wmm wmmVar = (wmm) other;
        return Intrinsics.areEqual(this.widgetCode, wmmVar.widgetCode) && Intrinsics.areEqual(this.data, wmmVar.data);
    }

    public final String f(Bundle data) {
        return "(forceChange:" + data.getBoolean(BaseDataPack.KEY_FORCE_CHANGE_UI, false) + ",compress:" + data.getInt(BaseDataPack.KEY_DATA_COMPRESS, 0) + ",layoutName:" + data.getString(BaseDataPack.KEY_LAYOUT_NAME, "") + ",version:" + data.getLong("version", 0L) + ")";
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getWidgetCode() {
        return this.widgetCode;
    }

    public int hashCode() {
        return (this.widgetCode.hashCode() * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "CardUpdateEvent[widgetCode:" + this.widgetCode + ",data:" + f(this.data) + "]";
    }
}
