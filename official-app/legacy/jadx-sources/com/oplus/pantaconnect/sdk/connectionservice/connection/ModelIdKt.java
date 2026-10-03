package com.oplus.pantaconnect.sdk.connectionservice.connection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__IterablesKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.CharsKt__CharJVMKt;
import p010kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\bH\u0000\u001a\n\u0010\t\u001a\u00020\n*\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"INT_1", "", "INVALID_SIZE", "MODEL_ID_LENGTH", "RADIX_16", "VALID_SIZE", "hexStrToByteArrayOrEmpty", "", "", "isValidModelId", "", "connectionservice_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nModelId.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModelId.kt\ncom/oplus/pantaconnect/sdk/connectionservice/connection/ModelIdKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1549#2:41\n1620#2,3:42\n*S KotlinDebug\n*F\n+ 1 ModelId.kt\ncom/oplus/pantaconnect/sdk/connectionservice/connection/ModelIdKt\n*L\n35#1:41\n35#1:42,3\n*E\n"})
public final class ModelIdKt {
    private static final int INT_1 = 1;
    private static final int INVALID_SIZE = 1;
    private static final int MODEL_ID_LENGTH = 3;
    private static final int RADIX_16 = 16;
    private static final int VALID_SIZE = 2;

    @NotNull
    public static final byte[] hexStrToByteArrayOrEmpty(@NotNull String str) {
        if ((str.length() & 1) == 1) {
            return new byte[0];
        }
        try {
            List listChunked = StringsKt___StringsKt.chunked(str, 2);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listChunked, 10));
            Iterator it = listChunked.iterator();
            while (it.hasNext()) {
                arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), CharsKt__CharJVMKt.checkRadix(16))));
            }
            return CollectionsKt___CollectionsKt.toByteArray(arrayList);
        } catch (NumberFormatException unused) {
            return new byte[0];
        }
    }

    public static final boolean isValidModelId(@NotNull String str) {
        return hexStrToByteArrayOrEmpty(str).length == 3;
    }
}
