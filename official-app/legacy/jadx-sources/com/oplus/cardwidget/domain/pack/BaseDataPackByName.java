package com.oplus.cardwidget.domain.pack;

import android.os.Bundle;
import com.oplus.aiunit.vision.hjm;
import com.oplus.smartenginehelper.dsl.DSLCoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H&J\"\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lcom/oplus/cardwidget/domain/pack/BaseDataPackByName;", "Lcom/oplus/cardwidget/domain/pack/BaseDataPack;", "()V", "onPack", "", "coder", "Lcom/oplus/smartenginehelper/dsl/DSLCoder;", "", "widgetCode", "onProcess", "Landroid/os/Bundle;", "dslData", "", "forceUpdate", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BaseDataPackByName extends BaseDataPack {
    @NotNull
    public abstract String onPack(@NotNull DSLCoder coder, @NotNull String widgetCode);

    @Override // com.oplus.cardwidget.domain.pack.BaseDataPack
    public boolean onPack(@NotNull DSLCoder coder) {
        Intrinsics.checkNotNullParameter(coder, "coder");
        return true;
    }

    @Override // com.oplus.cardwidget.domain.pack.BaseDataPack
    @Nullable
    public Bundle onProcess(@NotNull String widgetCode, @NotNull byte[] dslData, boolean forceUpdate) {
        Pair<String, Integer> pair;
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(dslData, "dslData");
        DSLCoder dSLCoder = new DSLCoder(dslData);
        String strOnPack = onPack(dSLCoder, widgetCode);
        byte[] bArrBuild = dSLCoder.build();
        hjm dataCompress = getDataCompress();
        if (dataCompress == null || (pair = dataCompress.a(new String(bArrBuild, Charsets.UTF_8))) == null) {
            pair = new Pair<>("", 0);
        }
        Bundle bundle = new Bundle();
        bundle.putString("name", strOnPack);
        bundle.putString("data", pair.getFirst());
        bundle.putInt(BaseDataPack.KEY_DATA_COMPRESS, pair.getSecond().intValue());
        bundle.putBoolean(BaseDataPack.KEY_FORCE_CHANGE_UI, forceUpdate);
        bundle.putString("widget_code", widgetCode);
        bundle.putLong("version", getCardVersion());
        return bundle;
    }
}
