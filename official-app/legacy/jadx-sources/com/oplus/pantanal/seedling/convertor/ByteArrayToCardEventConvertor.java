package com.oplus.pantanal.seedling.convertor;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.oplus.pantanal.seedling.bean.SeedlingCardEvent;
import com.oplus.pantanal.seedling.translator.SeedlingDataTranslator;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/pantanal/seedling/convertor/ByteArrayToCardEventConvertor;", "Lcom/oplus/pantanal/seedling/convertor/IConvertor;", "", "Lcom/oplus/pantanal/seedling/bean/SeedlingCardEvent;", "()V", "from", "data", TypedValues.TransitionType.S_TO, "seedling-support_manualRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ByteArrayToCardEventConvertor implements IConvertor<byte[], SeedlingCardEvent> {
    @Override // com.oplus.pantanal.seedling.convertor.IConvertor
    @NotNull
    public SeedlingCardEvent to(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return SeedlingDataTranslator.INSTANCE.decodeSeedlingCardEvent(data);
    }

    @Override // com.oplus.pantanal.seedling.convertor.IConvertor
    @NotNull
    public byte[] from(@NotNull SeedlingCardEvent data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return SeedlingDataTranslator.INSTANCE.encodeSeedlingCardEvent(data);
    }
}
