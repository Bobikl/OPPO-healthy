package com.oplus.aiunit.vision;

import com.oplus.cardwidget.interfaceLayer.DataConvertHelperKt;
import com.oplus.cardwidget.util.Logger;
import com.oplus.smartenginehelper.ParserTag;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/nkm;", "Lcom/oplus/aiunit/vision/k9m;", "", "cardId", "", "value", "", a8i.UPDATE, ParserTag.TAG_GET, "", "a", "Ljava/util/Map;", "cache", "<init>", "()V", "b", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public final class nkm extends k9m {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Map<String, String> cache = new LinkedHashMap();

    @Override // com.oplus.aiunit.vision.k9m
    @Nullable
    public byte[] get(@NotNull String cardId) {
        byte[] bArrConvertToByteArray;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Logger.INSTANCE.i("DSLCardMemSource", "get card data id is:" + cardId);
        synchronized (this.cache) {
            String str = this.cache.get(cardId);
            bArrConvertToByteArray = str != null ? DataConvertHelperKt.convertToByteArray(str) : null;
        }
        return bArrConvertToByteArray;
    }

    @Override // com.oplus.aiunit.vision.k9m
    public void update(@NotNull String cardId, @Nullable byte[] value) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Logger.INSTANCE.i("DSLCardMemSource", "update cardId is:" + cardId + " value is null:" + (value == null));
        synchronized (this.cache) {
            try {
                if (value != null) {
                    this.cache.put(cardId, DataConvertHelperKt.convertToString(value));
                    Unit unit = Unit.INSTANCE;
                } else {
                    this.cache.remove(cardId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
