package com.health.health_seedlingcard.utlis;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.log.consts.LogSenderConst;
import com.oplus.aiunit.vision.a7b;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.io.CloseableKt;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/health/health_seedlingcard/utlis/a;", "", "Companion", "a", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
public final class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.health.health_seedlingcard.utlis.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\t"}, d2 = {"Lcom/health/health_seedlingcard/utlis/a$a;", "", "Landroid/content/Context;", "context", "", LogSenderConst.FILENAME, "a", "<init>", "()V", "health_seedlingcard_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nGsonLoaderUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GsonLoaderUtils.kt\ncom/health/health_seedlingcard/utlis/GsonLoaderUtils$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final String a(@Nullable Context context, @NotNull String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            if (TextUtils.isEmpty(fileName)) {
                a7b.m("GsonLoaderUtils", "getJsonFromAssets fileName is null");
                return null;
            }
            if (context == null || context.getResources() == null) {
                a7b.m("GsonLoaderUtils", "getJsonFromAssets: context is " + context);
                return null;
            }
            StringBuilder sb = new StringBuilder();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(fileName)));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        return sb.toString();
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(bufferedReader, th);
                            throw th2;
                        }
                    }
                    a7b.c("GsonLoaderUtils", "getJsonFromAssets: ", e);
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedReader, null);
            } catch (IOException e2) {
                a7b.c("GsonLoaderUtils", "getJsonFromAssets: ", e2);
            }
            return sb.toString();
        }
    }
}
