package com.oplus.aiunit.vision;

import com.heytap.webview.extension.protocol.Const;
import io.protostuff.MapSchema;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003J\u001c\u0010\u000e\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¨\u0006\u0011"}, d2 = {"Lcom/oplus/aiunit/vision/dc7;", "", "Ljava/io/File;", Const.Scheme.SCHEME_FILE, "", "c", "Ljava/io/BufferedReader;", "d", "Ljava/io/InputStream;", "inputStream", MapSchema.FIELD_NAME_ENTRY, "reader", "", "closeStream", "a", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class dc7 {

    @NotNull
    public static final dc7 INSTANCE = new dc7();

    @JvmStatic
    public static final String a(BufferedReader reader, boolean closeStream) {
        if (reader == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        try {
            try {
                String line = reader.readLine();
                while (line != null) {
                    sb.append(line);
                    sb.append('\n');
                    line = reader.readLine();
                }
                if (closeStream) {
                    mh3.a(reader);
                }
            } catch (Exception e2) {
                f7b.h("FileReadUtils", e2.toString());
                if (closeStream) {
                }
            }
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        } catch (Throwable th) {
            if (closeStream) {
                mh3.a(reader);
            }
            throw th;
        }
    }

    public static /* synthetic */ String b(BufferedReader bufferedReader, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return a(bufferedReader, z);
    }

    @JvmStatic
    @Nullable
    public static final String c(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            return b(d(file), false, 2, null);
        } catch (Exception e2) {
            f7b.g("FileReadUtils", Intrinsics.stringPlus("readFile error, file:", file.getPath()), e2);
            return null;
        }
    }

    @JvmStatic
    @NotNull
    public static final BufferedReader d(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return e(new FileInputStream(file));
    }

    @JvmStatic
    public static final BufferedReader e(InputStream inputStream) {
        return new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
    }
}
