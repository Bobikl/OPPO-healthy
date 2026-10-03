package com.heytap.health.sleep.snore.utils;

import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.md7;
import com.oplus.aiunit.vision.pq;
import com.oplus.aiunit.vision.t0g;
import com.oplus.aiunit.vision.vo6;
import com.oplus.aiunit.vision.y80;
import io.protostuff.MapSchema;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Triple;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Lcom/heytap/health/sleep/snore/utils/FileSecretUtil;", "", "", "filePath", LogSenderConst.FILENAME, "Lkotlin/Triple;", "", "c", "<init>", "()V", "Companion", "a", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class FileSecretUtil {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Lazy<String> a = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.health.sleep.snore.utils.FileSecretUtil$Companion$localKey$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            return StringsKt__StringsJVMKt.replace$default(string, "-", "", false, 4, (Object) null);
        }
    });

    @NotNull
    public static final Lazy<String> b = LazyKt__LazyJVMKt.lazy(new Function0<String>() { // from class: com.heytap.health.sleep.snore.utils.FileSecretUtil$Companion$localKeyWithRsa$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            String strC = t0g.c(FileSecretUtil.INSTANCE.b(), vo6.b(b78.a(), y80.SNORE_FILE_RES_PORTAL));
            return strC == null ? "" : strC;
        }
    });

    /* JADX INFO: renamed from: com.heytap.health.sleep.snore.utils.FileSecretUtil$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u001b\u0010\t\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\f\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/heytap/health/sleep/snore/utils/FileSecretUtil$a;", "", "", "b", "d", "localKey$delegate", "Lkotlin/Lazy;", "c", "()Ljava/lang/String;", "localKey", "localKeyWithRsa$delegate", MapSchema.FIELD_NAME_ENTRY, "localKeyWithRsa", "TAG", "Ljava/lang/String;", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String b() {
            return c();
        }

        public final String c() {
            return (String) FileSecretUtil.a.getValue();
        }

        @NotNull
        public final String d() {
            return e();
        }

        public final String e() {
            return (String) FileSecretUtil.b.getValue();
        }
    }

    @NotNull
    public final Triple<Boolean, String, String> c(@NotNull String filePath, @NotNull String fileName) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (TextUtils.isEmpty(filePath)) {
            a7b.f("FileSecretUtil", "encryptionFile filePath is null");
            return new Triple<>(Boolean.FALSE, "", "");
        }
        a7b.f("FileSecretUtil", "filePath:" + filePath + ", fileName:" + fileName);
        Companion companion = INSTANCE;
        String strC = companion.c();
        StringBuilder sb = new StringBuilder();
        sb.append("localKey:");
        sb.append(strC);
        String str = md7.j() + "/" + fileName;
        a7b.f("FileSecretUtil", "encryptPath:" + str);
        return new Triple<>(Boolean.valueOf(pq.e(companion.c(), filePath, str)), companion.d(), str);
    }
}
