package com.oplus.aiunit.vision;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/h5f;", "", "", "originFileName", "destFilePath", "", "a", "TAG", "Ljava/lang/String;", "ASSET_DIR", "", "COPY_FILE_BUFFER_SIZE", "I", "<init>", "()V", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nProviderUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProviderUtil.kt\ncom/oplus/phonenoareainquire/utils/ProviderUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,54:1\n1#2:55\n*E\n"})
public final class h5f {

    @NotNull
    public static final String ASSET_DIR = "/assets/";
    public static final int COPY_FILE_BUFFER_SIZE = 1024;

    @NotNull
    public static final h5f INSTANCE = new h5f();

    @NotNull
    public static final String TAG = "ProviderUtil";

    @JvmStatic
    public static final boolean a(@NotNull String originFileName, @NotNull String destFilePath) {
        Intrinsics.checkNotNullParameter(originFileName, "originFileName");
        Intrinsics.checkNotNullParameter(destFilePath, "destFilePath");
        try {
            InputStream resourceAsStream = h5f.class.getResourceAsStream(ASSET_DIR + originFileName);
            FileOutputStream fileOutputStream = new FileOutputStream(destFilePath);
            if (resourceAsStream != null) {
                try {
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = resourceAsStream.read(bArr, 0, 1024);
                            if (i == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i);
                            g3e.b(TAG, "error when copy file from assets to data dir " + e.getMessage());
                            return false;
                        }
                        g3e.a(TAG, "successfully copy file " + originFileName + " to data dir");
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(resourceAsStream, (Throwable) null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(fileOutputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        CloseableKt.closeFinally(resourceAsStream, th3);
                        throw th4;
                    }
                }
            }
            CloseableKt.closeFinally(fileOutputStream, (Throwable) null);
            return true;
        } catch (IOException e) {
            g3e.b(TAG, "error when copy file from assets to data dir " + e.getMessage());
            return false;
        }
    }
}
