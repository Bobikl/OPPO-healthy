package com.oplus.aiunit.vision;

import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmName;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\"\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006\"\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/oplus/aiunit/vision/a35;", "Lokio/BufferedSource;", "source", "", "a", "Lokio/ByteString;", "Lokio/ByteString;", "SVG_TAG", "b", "LEFT_ANGLE_BRACKET", "coil-svg_release"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "SvgDecodeUtils")
public final class d5j {

    @NotNull
    public static final ByteString a;

    @NotNull
    public static final ByteString b;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        a = companion.encodeUtf8("<svg");
        b = companion.encodeUtf8("<");
    }

    public static final boolean a(@NotNull a35 a35Var, @NotNull BufferedSource bufferedSource) {
        return bufferedSource.rangeEquals(0L, b) && i.a(bufferedSource, a, 0L, 1024L) != -1;
    }
}
