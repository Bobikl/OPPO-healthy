package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import io.netty.handler.ssl.Ciphers;
import io.protostuff.MapSchema;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmField;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\tB\u0019\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0010\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/hb3;", "", "", "toString", "a", "Ljava/lang/String;", "javaName", "()Ljava/lang/String;", "", "b", "I", "getValue", "()I", "value", "", "()[B", "valueBytes", "<init>", "(Ljava/lang/String;I)V", "Companion", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
public final class hb3 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @JvmField
    @NotNull
    public static final hb3 TLS_AES_128_CCM_8_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_AES_128_CCM_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_AES_128_GCM_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_AES_256_GCM_SHA384;

    @JvmField
    @NotNull
    public static final hb3 TLS_CHACHA20_POLY1305_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_DSS_WITH_AES_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_DSS_WITH_AES_128_CBC_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_DSS_WITH_AES_128_GCM_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_DSS_WITH_AES_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_DSS_WITH_AES_256_CBC_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_DSS_WITH_AES_256_GCM_SHA384;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_DSS_WITH_DES_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_RSA_WITH_AES_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_RSA_WITH_AES_128_CBC_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_RSA_WITH_AES_128_GCM_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_RSA_WITH_AES_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_RSA_WITH_AES_256_CBC_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_RSA_WITH_AES_256_GCM_SHA384;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_DHE_RSA_WITH_DES_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DH_anon_EXPORT_WITH_RC4_40_MD5;

    @JvmField
    @NotNull
    public static final hb3 TLS_DH_anon_WITH_3DES_EDE_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DH_anon_WITH_AES_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DH_anon_WITH_AES_128_CBC_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_DH_anon_WITH_AES_128_GCM_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_DH_anon_WITH_AES_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DH_anon_WITH_AES_256_CBC_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_DH_anon_WITH_AES_256_GCM_SHA384;

    @JvmField
    @NotNull
    public static final hb3 TLS_DH_anon_WITH_DES_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_DH_anon_WITH_RC4_128_MD5;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_ECDSA_WITH_NULL_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_ECDSA_WITH_RC4_128_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_RSA_WITH_NULL_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDHE_RSA_WITH_RC4_128_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_ECDSA_WITH_NULL_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_ECDSA_WITH_RC4_128_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_RSA_WITH_AES_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_RSA_WITH_AES_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_RSA_WITH_NULL_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_RSA_WITH_RC4_128_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_anon_WITH_AES_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_anon_WITH_AES_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_anon_WITH_NULL_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_ECDH_anon_WITH_RC4_128_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_EMPTY_RENEGOTIATION_INFO_SCSV;

    @JvmField
    @NotNull
    public static final hb3 TLS_FALLBACK_SCSV;

    @JvmField
    @NotNull
    public static final hb3 TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5;

    @JvmField
    @NotNull
    public static final hb3 TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_KRB5_EXPORT_WITH_RC4_40_MD5;

    @JvmField
    @NotNull
    public static final hb3 TLS_KRB5_EXPORT_WITH_RC4_40_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_KRB5_WITH_3DES_EDE_CBC_MD5;

    @JvmField
    @NotNull
    public static final hb3 TLS_KRB5_WITH_3DES_EDE_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_KRB5_WITH_DES_CBC_MD5;

    @JvmField
    @NotNull
    public static final hb3 TLS_KRB5_WITH_DES_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_KRB5_WITH_RC4_128_MD5;

    @JvmField
    @NotNull
    public static final hb3 TLS_KRB5_WITH_RC4_128_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_PSK_WITH_3DES_EDE_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_PSK_WITH_AES_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_PSK_WITH_AES_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_PSK_WITH_RC4_128_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_EXPORT_WITH_DES40_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_EXPORT_WITH_RC4_40_MD5;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_3DES_EDE_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_AES_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_AES_128_CBC_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_AES_128_GCM_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_AES_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_AES_256_CBC_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_AES_256_GCM_SHA384;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_CAMELLIA_128_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_CAMELLIA_256_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_DES_CBC_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_NULL_MD5;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_NULL_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_NULL_SHA256;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_RC4_128_MD5;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_RC4_128_SHA;

    @JvmField
    @NotNull
    public static final hb3 TLS_RSA_WITH_SEED_CBC_SHA;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Comparator<String> f12090c;

    @NotNull
    public static final Map<String, hb3> d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final String javaName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int value;

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u0018\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/oplus/aiunit/vision/hb3$a", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "a", "b", "", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(@NotNull String a, @NotNull String b) {
            Intrinsics.checkNotNullParameter(a, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            int iMin = Math.min(a.length(), b.length());
            for (int i = 4; i < iMin; i++) {
                char cCharAt = a.charAt(i);
                char cCharAt2 = b.charAt(i);
                if (cCharAt != cCharAt2) {
                    return Intrinsics.compare((int) cCharAt, (int) cCharAt2) < 0 ? -1 : 1;
                }
            }
            int length = a.length();
            int length2 = b.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.hb3$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b}\b\u0086\u0003\u0018\u00002\u00020\u0001B\u000b\b\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0010R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0010R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0010R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0010R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0010R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0010R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0010R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0010R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0010R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0010R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0010R\u0014\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0010R\u0014\u0010&\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0010R\u0014\u0010'\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0010R\u0014\u0010(\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0010R\u0014\u0010)\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0010R\u0014\u0010*\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0010R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0010R\u0014\u0010,\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0010R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0010R\u0014\u0010.\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0010R\u0014\u0010/\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0010R\u0014\u00100\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0010R\u0014\u00101\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0010R\u0014\u00102\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0010R\u0014\u00103\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0010R\u0014\u00104\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0010R\u0014\u00105\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0010R\u0014\u00106\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0010R\u0014\u00107\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0010R\u0014\u00108\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0010R\u0014\u00109\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0010R\u0014\u0010:\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0010R\u0014\u0010;\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0010R\u0014\u0010<\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0010R\u0014\u0010=\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0010R\u0014\u0010>\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0010R\u0014\u0010?\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0010R\u0014\u0010@\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0010R\u0014\u0010A\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0010R\u0014\u0010B\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0010R\u0014\u0010C\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0010R\u0014\u0010D\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0010R\u0014\u0010E\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0010R\u0014\u0010F\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0010R\u0014\u0010G\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0010R\u0014\u0010H\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0010R\u0014\u0010I\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0010R\u0014\u0010J\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0010R\u0014\u0010K\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0010R\u0014\u0010L\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0010R\u0014\u0010M\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0010R\u0014\u0010N\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0010R\u0014\u0010O\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0010R\u0014\u0010P\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0010R\u0014\u0010Q\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0010R\u0014\u0010R\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0010R\u0014\u0010S\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0010R\u0014\u0010T\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0010R\u0014\u0010U\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0010R\u0014\u0010V\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010\u0010R\u0014\u0010W\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0010R\u0014\u0010X\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0010R\u0014\u0010Y\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0010R\u0014\u0010Z\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0010R\u0014\u0010[\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0010R\u0014\u0010\\\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0010R\u0014\u0010]\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0010R\u0014\u0010^\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0010R\u0014\u0010_\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010\u0010R\u0014\u0010`\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0010R\u0014\u0010a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0010R\u0014\u0010b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0010R\u0014\u0010c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010\u0010R\u0014\u0010d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010\u0010R\u0014\u0010e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010\u0010R\u0014\u0010f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010\u0010R\u0014\u0010g\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0010R\u0014\u0010h\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010\u0010R\u0014\u0010i\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bi\u0010\u0010R\u0014\u0010j\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bj\u0010\u0010R\u0014\u0010k\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010\u0010R\u0014\u0010l\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010\u0010R\u0014\u0010m\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bm\u0010\u0010R\u0014\u0010n\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010\u0010R\u0014\u0010o\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010\u0010R\u0014\u0010p\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010\u0010R\u0014\u0010q\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0010R\u0014\u0010r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\br\u0010\u0010R\u0014\u0010s\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010\u0010R\u0014\u0010t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0010R\u0014\u0010u\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bu\u0010\u0010R\u0014\u0010v\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010\u0010R\u0014\u0010w\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0010R\u0014\u0010x\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bx\u0010\u0010R\u0014\u0010y\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010\u0010R\u0014\u0010z\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0010R\u0014\u0010{\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b{\u0010\u0010R\u0014\u0010|\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0010R\u0014\u0010}\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b}\u0010\u0010R\u0014\u0010~\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b~\u0010\u0010R\u0014\u0010\u007f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010\u0010R\u0016\u0010\u0080\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0010R\u0016\u0010\u0081\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0010R\u0016\u0010\u0082\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0010R\u0016\u0010\u0083\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0010R\u0016\u0010\u0084\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0010R\u0016\u0010\u0085\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u0010R\u0016\u0010\u0086\u0001\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0010¨\u0006\u0089\u0001"}, d2 = {"Lcom/oplus/aiunit/vision/hb3$b;", "", "", "javaName", "Lcom/oplus/aiunit/vision/hb3;", "c", "", "value", "", MapSchema.FIELD_NAME_ENTRY, "f", "d", "", "INSTANCES", "Ljava/util/Map;", "TLS_AES_128_CCM_8_SHA256", "Lcom/oplus/aiunit/vision/hb3;", "TLS_AES_128_CCM_SHA256", Ciphers.TLS_AES_128_GCM_SHA256, Ciphers.TLS_AES_256_GCM_SHA384, Ciphers.TLS_CHACHA20_POLY1305_SHA256, "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", Ciphers.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, Ciphers.TLS_DHE_DSS_WITH_AES_128_CBC_SHA256, Ciphers.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, Ciphers.TLS_DHE_DSS_WITH_AES_256_CBC_SHA, Ciphers.TLS_DHE_DSS_WITH_AES_256_CBC_SHA256, Ciphers.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", Ciphers.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, Ciphers.TLS_DHE_RSA_WITH_AES_128_CBC_SHA256, Ciphers.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, Ciphers.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, Ciphers.TLS_DHE_RSA_WITH_AES_256_CBC_SHA256, Ciphers.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", Ciphers.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256, "TLS_DHE_RSA_WITH_DES_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", Ciphers.TLS_DH_anon_WITH_AES_128_CBC_SHA, Ciphers.TLS_DH_anon_WITH_AES_128_CBC_SHA256, Ciphers.TLS_DH_anon_WITH_AES_128_GCM_SHA256, Ciphers.TLS_DH_anon_WITH_AES_256_CBC_SHA, Ciphers.TLS_DH_anon_WITH_AES_256_CBC_SHA256, Ciphers.TLS_DH_anon_WITH_AES_256_GCM_SHA384, "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", Ciphers.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, Ciphers.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, Ciphers.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, Ciphers.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, Ciphers.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384, Ciphers.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, Ciphers.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", Ciphers.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA, Ciphers.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA, Ciphers.TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", Ciphers.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, Ciphers.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, Ciphers.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, Ciphers.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, Ciphers.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, Ciphers.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, Ciphers.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, "TLS_ECDHE_RSA_WITH_NULL_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_ECDSA_WITH_NULL_SHA", "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_RSA_WITH_NULL_SHA", "TLS_ECDH_RSA_WITH_RC4_128_SHA", "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", Ciphers.TLS_ECDH_anon_WITH_AES_128_CBC_SHA, Ciphers.TLS_ECDH_anon_WITH_AES_256_CBC_SHA, "TLS_ECDH_anon_WITH_NULL_SHA", "TLS_ECDH_anon_WITH_RC4_128_SHA", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_FALLBACK_SCSV", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_DES_CBC_MD5", "TLS_KRB5_WITH_DES_CBC_SHA", "TLS_KRB5_WITH_RC4_128_MD5", "TLS_KRB5_WITH_RC4_128_SHA", "TLS_PSK_WITH_3DES_EDE_CBC_SHA", Ciphers.TLS_PSK_WITH_AES_128_CBC_SHA, Ciphers.TLS_PSK_WITH_AES_256_CBC_SHA, "TLS_PSK_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", Ciphers.TLS_RSA_WITH_AES_128_CBC_SHA, Ciphers.TLS_RSA_WITH_AES_128_CBC_SHA256, Ciphers.TLS_RSA_WITH_AES_128_GCM_SHA256, Ciphers.TLS_RSA_WITH_AES_256_CBC_SHA, Ciphers.TLS_RSA_WITH_AES_256_CBC_SHA256, Ciphers.TLS_RSA_WITH_AES_256_GCM_SHA384, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_NULL_MD5", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_WITH_NULL_SHA256", "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_WITH_SEED_CBC_SHA", "<init>", "()V", "esim_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final synchronized hb3 c(@NotNull String javaName) {
            hb3 hb3Var;
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            hb3Var = (hb3) hb3.d.get(javaName);
            if (hb3Var == null) {
                hb3Var = (hb3) hb3.d.get(f(javaName));
            }
            return hb3Var;
        }

        public final hb3 d(String javaName, int value) {
            hb3 hb3Var = new hb3(javaName, value, null);
            hb3.d.put(javaName, hb3Var);
            return hb3Var;
        }

        public final byte[] e(int value) {
            return new byte[]{(byte) ((value >> 8) & 255), (byte) (value & 255)};
        }

        public final String f(String javaName) {
            if (StringsKt__StringsJVMKt.startsWith$default(javaName, "TLS_", false, 2, null)) {
                String strSubstring = javaName.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return "SSL_" + strSubstring;
            }
            if (!StringsKt__StringsJVMKt.startsWith$default(javaName, "SSL_", false, 2, null)) {
                return javaName;
            }
            String strSubstring2 = javaName.substring(4);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            return "TLS_" + strSubstring2;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f12090c = new a();
        d = new LinkedHashMap();
        TLS_RSA_WITH_NULL_MD5 = companion.d("SSL_RSA_WITH_NULL_MD5", 1);
        TLS_RSA_WITH_NULL_SHA = companion.d("SSL_RSA_WITH_NULL_SHA", 2);
        TLS_RSA_EXPORT_WITH_RC4_40_MD5 = companion.d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        TLS_RSA_WITH_RC4_128_MD5 = companion.d("SSL_RSA_WITH_RC4_128_MD5", 4);
        TLS_RSA_WITH_RC4_128_SHA = companion.d("SSL_RSA_WITH_RC4_128_SHA", 5);
        TLS_RSA_EXPORT_WITH_DES40_CBC_SHA = companion.d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        TLS_RSA_WITH_DES_CBC_SHA = companion.d("SSL_RSA_WITH_DES_CBC_SHA", 9);
        TLS_RSA_WITH_3DES_EDE_CBC_SHA = companion.d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA = companion.d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        TLS_DHE_DSS_WITH_DES_CBC_SHA = companion.d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA = companion.d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA = companion.d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        TLS_DHE_RSA_WITH_DES_CBC_SHA = companion.d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA = companion.d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        TLS_DH_anon_EXPORT_WITH_RC4_40_MD5 = companion.d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        TLS_DH_anon_WITH_RC4_128_MD5 = companion.d("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA = companion.d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        TLS_DH_anon_WITH_DES_CBC_SHA = companion.d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        TLS_DH_anon_WITH_3DES_EDE_CBC_SHA = companion.d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        TLS_KRB5_WITH_DES_CBC_SHA = companion.d("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        TLS_KRB5_WITH_3DES_EDE_CBC_SHA = companion.d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        TLS_KRB5_WITH_RC4_128_SHA = companion.d("TLS_KRB5_WITH_RC4_128_SHA", 32);
        TLS_KRB5_WITH_DES_CBC_MD5 = companion.d("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        TLS_KRB5_WITH_3DES_EDE_CBC_MD5 = companion.d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        TLS_KRB5_WITH_RC4_128_MD5 = companion.d("TLS_KRB5_WITH_RC4_128_MD5", 36);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA = companion.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        TLS_KRB5_EXPORT_WITH_RC4_40_SHA = companion.d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5 = companion.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        TLS_KRB5_EXPORT_WITH_RC4_40_MD5 = companion.d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        TLS_RSA_WITH_AES_128_CBC_SHA = companion.d(Ciphers.TLS_RSA_WITH_AES_128_CBC_SHA, 47);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA = companion.d(Ciphers.TLS_DHE_DSS_WITH_AES_128_CBC_SHA, 50);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA = companion.d(Ciphers.TLS_DHE_RSA_WITH_AES_128_CBC_SHA, 51);
        TLS_DH_anon_WITH_AES_128_CBC_SHA = companion.d(Ciphers.TLS_DH_anon_WITH_AES_128_CBC_SHA, 52);
        TLS_RSA_WITH_AES_256_CBC_SHA = companion.d(Ciphers.TLS_RSA_WITH_AES_256_CBC_SHA, 53);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA = companion.d(Ciphers.TLS_DHE_DSS_WITH_AES_256_CBC_SHA, 56);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA = companion.d(Ciphers.TLS_DHE_RSA_WITH_AES_256_CBC_SHA, 57);
        TLS_DH_anon_WITH_AES_256_CBC_SHA = companion.d(Ciphers.TLS_DH_anon_WITH_AES_256_CBC_SHA, 58);
        TLS_RSA_WITH_NULL_SHA256 = companion.d("TLS_RSA_WITH_NULL_SHA256", 59);
        TLS_RSA_WITH_AES_128_CBC_SHA256 = companion.d(Ciphers.TLS_RSA_WITH_AES_128_CBC_SHA256, 60);
        TLS_RSA_WITH_AES_256_CBC_SHA256 = companion.d(Ciphers.TLS_RSA_WITH_AES_256_CBC_SHA256, 61);
        TLS_DHE_DSS_WITH_AES_128_CBC_SHA256 = companion.d(Ciphers.TLS_DHE_DSS_WITH_AES_128_CBC_SHA256, 64);
        TLS_RSA_WITH_CAMELLIA_128_CBC_SHA = companion.d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA = companion.d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA = companion.d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        TLS_DHE_RSA_WITH_AES_128_CBC_SHA256 = companion.d(Ciphers.TLS_DHE_RSA_WITH_AES_128_CBC_SHA256, 103);
        TLS_DHE_DSS_WITH_AES_256_CBC_SHA256 = companion.d(Ciphers.TLS_DHE_DSS_WITH_AES_256_CBC_SHA256, 106);
        TLS_DHE_RSA_WITH_AES_256_CBC_SHA256 = companion.d(Ciphers.TLS_DHE_RSA_WITH_AES_256_CBC_SHA256, 107);
        TLS_DH_anon_WITH_AES_128_CBC_SHA256 = companion.d(Ciphers.TLS_DH_anon_WITH_AES_128_CBC_SHA256, 108);
        TLS_DH_anon_WITH_AES_256_CBC_SHA256 = companion.d(Ciphers.TLS_DH_anon_WITH_AES_256_CBC_SHA256, 109);
        TLS_RSA_WITH_CAMELLIA_256_CBC_SHA = companion.d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA = companion.d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA = companion.d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        TLS_PSK_WITH_RC4_128_SHA = companion.d("TLS_PSK_WITH_RC4_128_SHA", ATDataProfile.CMD_BLOOD_OXYGEN_RECORD);
        TLS_PSK_WITH_3DES_EDE_CBC_SHA = companion.d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        TLS_PSK_WITH_AES_128_CBC_SHA = companion.d(Ciphers.TLS_PSK_WITH_AES_128_CBC_SHA, 140);
        TLS_PSK_WITH_AES_256_CBC_SHA = companion.d(Ciphers.TLS_PSK_WITH_AES_256_CBC_SHA, 141);
        TLS_RSA_WITH_SEED_CBC_SHA = companion.d("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        TLS_RSA_WITH_AES_128_GCM_SHA256 = companion.d(Ciphers.TLS_RSA_WITH_AES_128_GCM_SHA256, 156);
        TLS_RSA_WITH_AES_256_GCM_SHA384 = companion.d(Ciphers.TLS_RSA_WITH_AES_256_GCM_SHA384, com.garmin.fit.e.TotalFractionalDescentFieldNum);
        TLS_DHE_RSA_WITH_AES_128_GCM_SHA256 = companion.d(Ciphers.TLS_DHE_RSA_WITH_AES_128_GCM_SHA256, 158);
        TLS_DHE_RSA_WITH_AES_256_GCM_SHA384 = companion.d(Ciphers.TLS_DHE_RSA_WITH_AES_256_GCM_SHA384, 159);
        TLS_DHE_DSS_WITH_AES_128_GCM_SHA256 = companion.d(Ciphers.TLS_DHE_DSS_WITH_AES_128_GCM_SHA256, 162);
        TLS_DHE_DSS_WITH_AES_256_GCM_SHA384 = companion.d(Ciphers.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384, 163);
        TLS_DH_anon_WITH_AES_128_GCM_SHA256 = companion.d(Ciphers.TLS_DH_anon_WITH_AES_128_GCM_SHA256, 166);
        TLS_DH_anon_WITH_AES_256_GCM_SHA384 = companion.d(Ciphers.TLS_DH_anon_WITH_AES_256_GCM_SHA384, 167);
        TLS_EMPTY_RENEGOTIATION_INFO_SCSV = companion.d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        TLS_FALLBACK_SCSV = companion.d("TLS_FALLBACK_SCSV", 22016);
        TLS_ECDH_ECDSA_WITH_NULL_SHA = companion.d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        TLS_ECDH_ECDSA_WITH_RC4_128_SHA = companion.d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA = companion.d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA = companion.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA = companion.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        TLS_ECDHE_ECDSA_WITH_NULL_SHA = companion.d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = companion.d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA = companion.d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = companion.d(Ciphers.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA, 49161);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = companion.d(Ciphers.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA, 49162);
        TLS_ECDH_RSA_WITH_NULL_SHA = companion.d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        TLS_ECDH_RSA_WITH_RC4_128_SHA = companion.d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA = companion.d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA = companion.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA = companion.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        TLS_ECDHE_RSA_WITH_NULL_SHA = companion.d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        TLS_ECDHE_RSA_WITH_RC4_128_SHA = companion.d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = companion.d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = companion.d(Ciphers.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, 49171);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = companion.d(Ciphers.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, 49172);
        TLS_ECDH_anon_WITH_NULL_SHA = companion.d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        TLS_ECDH_anon_WITH_RC4_128_SHA = companion.d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA = companion.d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        TLS_ECDH_anon_WITH_AES_128_CBC_SHA = companion.d(Ciphers.TLS_ECDH_anon_WITH_AES_128_CBC_SHA, 49176);
        TLS_ECDH_anon_WITH_AES_256_CBC_SHA = companion.d(Ciphers.TLS_ECDH_anon_WITH_AES_256_CBC_SHA, 49177);
        TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = companion.d(Ciphers.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256, 49187);
        TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384 = companion.d(Ciphers.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384, 49188);
        TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256 = companion.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384 = companion.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = companion.d(Ciphers.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256, 49191);
        TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384 = companion.d(Ciphers.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384, 49192);
        TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256 = companion.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384 = companion.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = companion.d(Ciphers.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, 49195);
        TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = companion.d(Ciphers.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, 49196);
        TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256 = companion.d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384 = companion.d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = companion.d(Ciphers.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, 49199);
        TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = companion.d(Ciphers.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, 49200);
        TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256 = companion.d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384 = companion.d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA = companion.d(Ciphers.TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA, 49205);
        TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA = companion.d(Ciphers.TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA, 49206);
        TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = companion.d(Ciphers.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, 52392);
        TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256 = companion.d(Ciphers.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, 52393);
        TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256 = companion.d(Ciphers.TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256, 52394);
        TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256 = companion.d(Ciphers.TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256, 52396);
        TLS_AES_128_GCM_SHA256 = companion.d(Ciphers.TLS_AES_128_GCM_SHA256, 4865);
        TLS_AES_256_GCM_SHA384 = companion.d(Ciphers.TLS_AES_256_GCM_SHA384, 4866);
        TLS_CHACHA20_POLY1305_SHA256 = companion.d(Ciphers.TLS_CHACHA20_POLY1305_SHA256, 4867);
        TLS_AES_128_CCM_SHA256 = companion.d("TLS_AES_128_CCM_SHA256", 4868);
        TLS_AES_128_CCM_8_SHA256 = companion.d("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public /* synthetic */ hb3(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    @NotNull
    public final byte[] b() {
        return INSTANCE.e(this.value);
    }

    @NotNull
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getJavaName() {
        return this.javaName;
    }

    public hb3(String str, int i) {
        this.javaName = str;
        this.value = i;
    }
}
