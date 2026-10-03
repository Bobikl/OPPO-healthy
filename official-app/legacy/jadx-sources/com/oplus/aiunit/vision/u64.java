package com.oplus.aiunit.vision;

import android.util.Log;
import io.protostuff.MapSchema;
import java.util.Arrays;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.text.StringsKt__IndentKt;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\b\u0010\tJ9\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\n\u0010\tJ7\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\tJ \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fJ5\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0005\"\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000f\u0010\tJ \u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/u64;", "", "", "tag", "message", "", "args", "", "a", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V", "c", "d", "", "throwable", "b", "f", MapSchema.FIELD_NAME_ENTRY, "PREFIX", "Ljava/lang/String;", "<init>", "()V", "contactsync_impl_release"}, k = 1, mv = {1, 8, 0})
public final class u64 {

    @NotNull
    public static final u64 INSTANCE = new u64();

    @NotNull
    public static final String PREFIX = "Sync_Contacts";

    @JvmStatic
    public static final void a(@NotNull String tag, @NotNull String message, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.length == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(tag);
            sb.append(": ");
            sb.append(message);
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tag);
        sb2.append(": ");
        sb2.append(str);
    }

    @JvmStatic
    public static final void c(@NotNull String tag, @Nullable String message, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.length == 0) {
            a7b.b(PREFIX, tag + ": " + message);
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        if (message == null) {
            message = "";
        }
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        a7b.b(PREFIX, tag + ": " + str);
    }

    @JvmStatic
    public static final void d(@NotNull String tag, @NotNull String message, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.length == 0) {
            a7b.f(PREFIX, tag + ": " + message);
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        a7b.f(PREFIX, tag + ": " + str);
    }

    public final void b(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        a7b.b(PREFIX, StringsKt__IndentKt.trimIndent(" " + tag + ": " + message + " " + Log.getStackTraceString(throwable) + " "));
    }

    public final void e(@NotNull String tag, @NotNull String message, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        a7b.m(PREFIX, StringsKt__IndentKt.trimIndent(" " + tag + ": " + message + " " + Log.getStackTraceString(throwable) + " "));
    }

    public final void f(@NotNull String tag, @NotNull String message, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.length == 0) {
            a7b.m(PREFIX, tag + ": " + message);
            return;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        a7b.m(PREFIX, tag + ": " + str);
    }
}
