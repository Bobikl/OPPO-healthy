package com.cloud.sdk.cloudstorage.utils;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.heytap.webview.extension.protocol.Const;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/cloud/sdk/cloudstorage/utils/Crc32;", "", "()V", "bytes", "", "data", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "length", Const.Scheme.SCHEME_FILE, "Ljava/io/File;", "cloud_storage_sdk_release"}, k = 1, mv = {1, 4, 2})
public final class Crc32 {

    @NotNull
    public static final Crc32 INSTANCE = new Crc32();

    private Crc32() {
    }

    public static /* synthetic */ long bytes$default(Crc32 crc32, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return crc32.bytes(bArr, i, i2);
    }

    @JvmOverloads
    public final long bytes(@NotNull byte[] bArr) {
        return bytes$default(this, bArr, 0, 0, 6, null);
    }

    public final long file(@NotNull File file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        CRC32 crc32 = new CRC32();
        try {
            byte[] bArr = new byte[65536];
            CheckedInputStream checkedInputStream = new CheckedInputStream(new FileInputStream(file), crc32);
            do {
                try {
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(checkedInputStream, th);
                        throw th2;
                    }
                }
            } while (checkedInputStream.read(bArr) > 0);
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(checkedInputStream, null);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return crc32.getValue();
    }

    @JvmOverloads
    public final long bytes(@NotNull byte[] bArr, int i) {
        return bytes$default(this, bArr, i, 0, 4, null);
    }

    @JvmOverloads
    public final long bytes(@NotNull byte[] data, int offset, int length) {
        Intrinsics.checkNotNullParameter(data, "data");
        CRC32 crc32 = new CRC32();
        crc32.update(data, offset, length);
        return crc32.getValue();
    }
}
