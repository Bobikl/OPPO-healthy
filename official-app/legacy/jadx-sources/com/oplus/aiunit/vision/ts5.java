package com.oplus.aiunit.vision;

import com.heytap.webview.extension.protocol.Const;
import io.protostuff.MapSchema;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;
import p010kotlin.text.Charsets;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0007¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/ts5;", "", "", "content", "c", "Ljava/io/File;", Const.Scheme.SCHEME_FILE, "b", "", MapSchema.FIELD_NAME_ENTRY, "d", "msg", "a", "<init>", "()V", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class ts5 {

    @NotNull
    public static final ts5 INSTANCE = new ts5();

    @JvmStatic
    @NotNull
    public static final String a(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytes = msg.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        String strEncodeToString = encoder.encodeToString(bytes);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "getEncoder().encodeToString(msg.toByteArray())");
        return strEncodeToString;
    }

    @JvmStatic
    @Nullable
    public static final String b(@NotNull File file) throws Throwable {
        Intrinsics.checkNotNullParameter(file, "file");
        byte[] bArrD = d(file);
        if (bArrD == null) {
            return null;
        }
        return i1j.a(bArrD);
    }

    @JvmStatic
    @NotNull
    public static final String c(@NotNull String content) {
        String strA;
        Intrinsics.checkNotNullParameter(content, "content");
        byte[] bArrE = e(content);
        return (bArrE == null || (strA = i1j.a(bArrE)) == null) ? "" : strA;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0064: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:30:0x0064 */
    @JvmStatic
    public static final byte[] d(File file) throws Throwable {
        FileInputStream fileInputStream;
        Closeable closeable;
        Closeable closeable2 = null;
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
        try {
            try {
                Ref.IntRef intRef = new Ref.IntRef();
                byte[] bArr = new byte[1024];
                fileInputStream = new FileInputStream(file);
                while (true) {
                    try {
                        int i = fileInputStream.read(bArr);
                        intRef.element = i;
                        if (i == -1) {
                            byte[] bArrDigest = messageDigest.digest();
                            mh3.a(fileInputStream);
                            return bArrDigest;
                        }
                        messageDigest.update(bArr, 0, i);
                    } catch (IOException e2) {
                        e = e2;
                        f7b.h(gc0.SHA256, Intrinsics.stringPlus("read file exception:", e.getMessage()));
                        mh3.a(fileInputStream);
                        return null;
                    } catch (Exception e3) {
                        e = e3;
                        f7b.h(gc0.SHA256, Intrinsics.stringPlus("digest exception:", e.getMessage()));
                        mh3.a(fileInputStream);
                        return null;
                    }
                }
            } catch (Throwable th) {
                th = th;
                closeable2 = closeable;
                mh3.a(closeable2);
                throw th;
            }
        } catch (IOException e4) {
            e = e4;
            fileInputStream = null;
        } catch (Exception e5) {
            e = e5;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            mh3.a(closeable2);
            throw th;
        }
    }

    @JvmStatic
    public static final byte[] e(String content) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256);
            byte[] bytes = content.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return messageDigest.digest(bytes);
        } catch (IllegalStateException e2) {
            f7b.h("sha256", Intrinsics.stringPlus("digest exception:", e2.getMessage()));
            return null;
        } catch (NoSuchAlgorithmException e3) {
            f7b.h("sha256", Intrinsics.stringPlus("digest exception:", e3.getMessage()));
            return null;
        } catch (Exception e4) {
            f7b.h("sha256", Intrinsics.stringPlus("digest exception:", e4.getMessage()));
            return null;
        }
    }
}
