package com.oplus.aiunit.vision;

import com.oplus.cardwidget.util.Logger;
import com.oplus.cardwidget.util.StringCompressor;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¨\u0006\r"}, d2 = {"Lcom/oplus/aiunit/vision/u9m;", "Lcom/oplus/aiunit/vision/hjm;", "", "source", "Lkotlin/Pair;", "", "a", "", "size", "", "b", "<init>", "()V", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0})
public final class u9m implements hjm {
    @Override // com.oplus.aiunit.vision.hjm
    @NotNull
    public Pair<String, Integer> a(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int length = source.length();
        if (length >= 2000) {
            b(length);
            return new Pair<>(StringCompressor.INSTANCE.encompress(source), 1);
        }
        Logger.INSTANCE.d("DataPackCompressor", "no need to compress origin source size is " + source.length());
        return new Pair<>(source, 0);
    }

    public final void b(long size) {
        if (size > 20000) {
            Logger.INSTANCE.w("DataPackCompressor", "not allow to post data of size over 20000 Bytes");
        }
    }
}
