package com.oplus.mydevices.sdk.utils;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toEncryptedContainer", "Lcom/oplus/mydevices/sdk/utils/Cryptor$EncryptedContainer;", "", "sdk_domesticRelease"}, k = 2, mv = {1, 4, 0})
public final class CryptorKt {
    @NotNull
    public static final Cryptor.EncryptedContainer toEncryptedContainer(@NotNull String toEncryptedContainer) {
        Intrinsics.checkNotNullParameter(toEncryptedContainer, "$this$toEncryptedContainer");
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) toEncryptedContainer, new String[]{Cryptor.DATA_IV_SEPARATOR}, false, 0, 6, (Object) null);
        return new Cryptor.EncryptedContainer((String) CollectionsKt___CollectionsKt.first(listSplit$default), (String) CollectionsKt___CollectionsKt.last(listSplit$default));
    }
}
