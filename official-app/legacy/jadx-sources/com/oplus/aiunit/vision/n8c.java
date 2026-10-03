package com.oplus.aiunit.vision;

import io.protostuff.MapSchema;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J!\u0010\u0007\u001a\u00020\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0006\"\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0006\"\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\rH\u0086\u0002J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\rJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\rR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/n8c;", "", "", "", "strings", "a", "", "b", "([Ljava/lang/String;)Lcom/oplus/aiunit/vision/n8c;", "", "bytes", "c", "([[B)Lcom/oplus/aiunit/vision/n8c;", "", "i", "d", MapSchema.FIELD_NAME_ENTRY, "fromIndex", "toIndex", b2n.f, "(II)[[B", "f", "Ljava/util/ArrayList;", "Ljava/util/ArrayList;", "parts", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class n8c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final ArrayList<byte[]> parts = new ArrayList<>();

    @NotNull
    public final n8c a(@NotNull List<String> strings) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        synchronized (strings) {
            for (String str : strings) {
                ArrayList<byte[]> arrayList = this.parts;
                Charset charset = Charsets.UTF_8;
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                arrayList.add(bytes);
            }
        }
        return this;
    }

    @NotNull
    public final n8c b(@NotNull String... strings) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        int length = strings.length;
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                String str = strings[i];
                ArrayList<byte[]> arrayList = this.parts;
                Charset charset = Charsets.UTF_8;
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(charset);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                arrayList.add(bytes);
                if (i2 < length) {
                    i = i2;
                }
            }
        }
        return this;
    }

    @NotNull
    public final n8c c(@NotNull byte[]... bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            byte[] bArr = bytes[i];
            i++;
            this.parts.add(bArr);
        }
        return this;
    }

    @Nullable
    public final byte[] d(int i) {
        if (i >= this.parts.size()) {
            return null;
        }
        return this.parts.get(i);
    }

    @Nullable
    public final String e(int i) {
        if (i >= this.parts.size()) {
            return null;
        }
        byte[] bArr = this.parts.get(i);
        Intrinsics.checkNotNullExpressionValue(bArr, "parts[i]");
        return new String(bArr, Charsets.UTF_8);
    }

    public final int f() {
        return this.parts.size();
    }

    @NotNull
    public final byte[][] g(int fromIndex, int toIndex) {
        List<byte[]> listSubList = this.parts.subList(fromIndex, toIndex);
        Intrinsics.checkNotNullExpressionValue(listSubList, "parts.subList(fromIndex, toIndex)");
        Object[] array = listSubList.toArray(new byte[0][]);
        if (array != null) {
            return (byte[][]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
