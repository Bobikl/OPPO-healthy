package com.oplus.aiunit.vision;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/fdb;", "", "Companion", "a", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
public final class fdb {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final ConcurrentHashMap<String, String> a = new ConcurrentHashMap<>();

    @NotNull
    public static final ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static String f11300c = qa2.INSTANCE.k().r0();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.fdb$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\rJ\u0012\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007R(\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/fdb$a;", "", "", "dataClient", "b", "a", "symmetricKey", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "(Ljava/lang/String;)V", "getSymmetricKey$annotations", "()V", "TAG", "Ljava/util/concurrent/ConcurrentHashMap;", "dataClientDecryptMap", "Ljava/util/concurrent/ConcurrentHashMap;", "dataClientEncryptMap", "<init>", "databaseengineservice_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String a(@Nullable String dataClient) {
            if (dataClient == null || dataClient.length() == 0) {
                cj4.c("MacEncryptDecrypt", "getDecryptClient dataClient is null or empty");
                return "";
            }
            if (TextUtils.isEmpty((CharSequence) fdb.b.get(dataClient))) {
                fdb.b.put(dataClient, qa2.INSTANCE.k().n(c(), dataClient));
                cj4.c("MacEncryptDecrypt", "getDecryptClient dataClient is " + fdb.b.get(dataClient) + ", k:" + c());
            }
            String str = (String) fdb.b.get(dataClient);
            if (str == null) {
                str = dataClient;
            }
            Intrinsics.checkNotNullExpressionValue(str, "dataClientDecryptMap[dataClient] ?: dataClient");
            if (str.length() > 32) {
                fdb.b.put(dataClient, qa2.INSTANCE.k().n(c(), str));
            }
            String str2 = (String) fdb.b.get(dataClient);
            return str2 == null ? dataClient : str2;
        }

        @JvmStatic
        @NotNull
        public final String b(@Nullable String dataClient) {
            if (dataClient == null || dataClient.length() == 0) {
                cj4.c("MacEncryptDecrypt", "getEncryptClient dataClient is null or empty");
                return "";
            }
            if (dataClient.length() > 32) {
                return dataClient;
            }
            CharSequence charSequence = (CharSequence) fdb.a.get(dataClient);
            if (charSequence == null || charSequence.length() == 0) {
                fdb.a.put(dataClient, qa2.INSTANCE.k().h0(c(), dataClient));
                cj4.c("MacEncryptDecrypt", "getEncryptClient dataClient is " + fdb.a.get(dataClient) + ", k:" + c());
            }
            String str = (String) fdb.a.get(dataClient);
            return str == null ? dataClient : str;
        }

        @NotNull
        public final String c() {
            return fdb.f11300c;
        }

        public final void d(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            fdb.f11300c = str;
        }
    }

    @JvmStatic
    @NotNull
    public static final String e(@Nullable String str) {
        return INSTANCE.a(str);
    }

    @JvmStatic
    @NotNull
    public static final String f(@Nullable String str) {
        return INSTANCE.b(str);
    }

    @NotNull
    public static final String g() {
        return INSTANCE.c();
    }

    public static final void h(@NotNull String str) {
        INSTANCE.d(str);
    }
}
