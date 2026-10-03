package com.heytap.health.rpc;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import com.oplus.aiunit.vision.gc0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/rpc/b;", "", "Companion", "a", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
public final class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.heytap.health.rpc.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u000e"}, d2 = {"Lcom/heytap/health/rpc/b$a;", "", "Landroid/content/Context;", "context", "", "packageName", "expectedSHA1", "", "b", "", "certBytes", "a", "<init>", "()V", "lib_rpc_base_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPackageUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PackageUtil.kt\ncom/heytap/health/rpc/PackageUtil$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,57:1\n12744#2,2:58\n*S KotlinDebug\n*F\n+ 1 PackageUtil.kt\ncom/heytap/health/rpc/PackageUtil$Companion\n*L\n29#1:58,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(byte[] certBytes) {
            try {
                byte[] publicKey = MessageDigest.getInstance(gc0.SHA1).digest(certBytes);
                StringBuilder sb = new StringBuilder();
                Intrinsics.checkNotNullExpressionValue(publicKey, "publicKey");
                for (byte b : publicKey) {
                    String hexString = Integer.toHexString(b & 255);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(0xFF and b.toInt())");
                    String upperCase = hexString.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    if (upperCase.length() == 1) {
                        sb.append("0");
                    }
                    sb.append(upperCase);
                    sb.append(":");
                }
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "hexString.toString()");
                String strSubstring = string.substring(0, string.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
            } catch (NoSuchAlgorithmException e2) {
                c.INSTANCE.b("certToSHA1 NoSuchAlgorithmException, error=" + e2);
                return null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0056  */
        /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
        public final boolean b(@NotNull Context context, @NotNull String packageName, @NotNull String expectedSHA1) {
            boolean z;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            Intrinsics.checkNotNullParameter(expectedSHA1, "expectedSHA1");
            try {
                SigningInfo signingInfo = context.getPackageManager().getPackageInfo(packageName, 134217728).signingInfo;
                if (signingInfo == null) {
                    return false;
                }
                Signature[] apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                if (apkContentsSigners == null) {
                    return false;
                }
                for (Signature signature : apkContentsSigners) {
                    Companion companion = b.INSTANCE;
                    byte[] byteArray = signature.toByteArray();
                    Intrinsics.checkNotNullExpressionValue(byteArray, "it.toByteArray()");
                    if (Intrinsics.areEqual(companion.a(byteArray), expectedSHA1)) {
                        z = true;
                        if (z) {
                            return true;
                        }
                        return false;
                    }
                }
                z = false;
                if (z) {
                    return true;
                }
                return false;
            } catch (PackageManager.NameNotFoundException e2) {
                c.INSTANCE.b("Package info not found, package=" + packageName + ", error=" + e2);
                return false;
            } catch (Exception e3) {
                c.INSTANCE.b("hasMatchingSHA1 error, package=" + packageName + ", error=" + e3);
                return false;
            }
        }
    }
}
