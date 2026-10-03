package com.squareup.wire.internal;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H\u0080\b¢\u0006\u0002\u0010\u0005\u001a\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0086\b\u001a1\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r0\u000b\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\u000e\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r0\u000eH\u0086\b*\n\u0010\u000f\"\u00020\u00102\u00020\u0010*\n\u0010\u0011\"\u00020\u00122\u00020\u0012*\n\u0010\u0013\"\u00020\u00142\u00020\u0014*\n\u0010\u0015\"\u00020\u00162\u00020\u0016¨\u0006\u0017"}, d2 = {"format", "", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "toUnmodifiableList", "", ExifInterface.GPS_DIRECTION_TRUE, "", "toUnmodifiableMap", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "ObjectStreamException", "Ljava/io/ObjectStreamException;", "ProtocolException", "Ljava/net/ProtocolException;", "Serializable", "Ljava/io/Serializable;", "Throws", "Lkotlin/jvm/Throws;", "wire-runtime"}, k = 2, mv = {1, 1, 15})
public final class _PlatformKt {
    @NotNull
    public static final String format(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkParameterIsNotNull(format, "$this$format");
        Intrinsics.checkParameterIsNotNull(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(format, *args)");
        return str;
    }

    @NotNull
    public static final <T> List<T> toUnmodifiableList(@NotNull List<T> toUnmodifiableList) {
        Intrinsics.checkParameterIsNotNull(toUnmodifiableList, "$this$toUnmodifiableList");
        List<T> listUnmodifiableList = Collections.unmodifiableList(toUnmodifiableList);
        Intrinsics.checkExpressionValueIsNotNull(listUnmodifiableList, "Collections.unmodifiableList(this)");
        return listUnmodifiableList;
    }

    @NotNull
    public static final <K, V> Map<K, V> toUnmodifiableMap(@NotNull Map<K, V> toUnmodifiableMap) {
        Intrinsics.checkParameterIsNotNull(toUnmodifiableMap, "$this$toUnmodifiableMap");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(toUnmodifiableMap);
        Intrinsics.checkExpressionValueIsNotNull(mapUnmodifiableMap, "Collections.unmodifiableMap(this)");
        return mapUnmodifiableMap;
    }
}
