package com.oplus.aiunit.vision;

import android.text.TextUtils;
import android.util.Log;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J+\u0010\r\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0010\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0011\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016J&\u0010\u0011\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\u001c\u0010\u0014\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0018"}, d2 = {"Lcom/oplus/aiunit/vision/u20;", "Lcom/oplus/aiunit/vision/es9;", "", "level", "", "a", "", "tag", "msg", "v", "d", "", "msgList", "b", "(Ljava/lang/String;[Ljava/lang/String;)V", "i", "w", MapSchema.FIELD_NAME_ENTRY, "", "ex", "print", "<init>", "()V", "Companion", "monitor_release"}, k = 1, mv = {1, 5, 1})
public final class u20 implements es9 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static int a = 3;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.u20$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J$\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002JI\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042&\u0010\u000b\u001a\u0014\u0012\u0010\b\u0001\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\n0\n\"\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\nH\u0002¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/u20$a;", "", "", "level", "", "tag", "msg", "", "d", "f", "", "msgList", MapSchema.FIELD_NAME_ENTRY, "(ILjava/lang/String;[[Ljava/lang/String;)V", b2n.f, "MAX_LETTER_COUNT", "I", "MAX_LETTER_ONE_LINE", "sLevel", "<init>", "()V", "monitor_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void d(int level, String tag, String msg) {
            if (TextUtils.isEmpty(msg) || level < u20.a) {
                return;
            }
            f(level, tag, msg);
        }

        public final void e(int level, String tag, String[]... msgList) {
            if (level >= u20.a) {
                StringBuilder sb = new StringBuilder();
                int length = msgList.length;
                int i = 0;
                while (i < length) {
                    String[] strArr = msgList[i];
                    i++;
                    sb.append(strArr);
                }
                if (sb.length() <= 1024) {
                    g(level, tag, sb.toString());
                } else {
                    g(level, tag, sb.substring(0, 1024));
                    d(level, tag, sb.substring(1024));
                }
            }
        }

        public final void f(int level, String tag, String msg) {
            String strSubstring;
            if (TextUtils.isEmpty(msg)) {
                return;
            }
            Intrinsics.checkNotNull(msg);
            if (msg.length() > 10240) {
                strSubstring = msg.substring(0, 10240);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            } else {
                strSubstring = msg;
            }
            if (strSubstring.length() <= 1024) {
                g(level, tag, msg);
                return;
            }
            String strSubstring2 = strSubstring.substring(0, 1024);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            g(level, tag, strSubstring2);
            String strSubstring3 = strSubstring.substring(1024);
            Intrinsics.checkNotNullExpressionValue(strSubstring3, "(this as java.lang.String).substring(startIndex)");
            d(level, tag, strSubstring3);
        }

        public final void g(int level, String tag, String msg) {
            if (level == 2) {
                String strStringPlus = Intrinsics.stringPlus("Engine.", tag);
                Intrinsics.checkNotNull(msg);
                Log.v(strStringPlus, msg);
                return;
            }
            if (level == 3) {
                String strStringPlus2 = Intrinsics.stringPlus("Engine.", tag);
                Intrinsics.checkNotNull(msg);
                Log.d(strStringPlus2, msg);
                return;
            }
            if (level == 4) {
                String strStringPlus3 = Intrinsics.stringPlus("Engine.", tag);
                Intrinsics.checkNotNull(msg);
                Log.i(strStringPlus3, msg);
            } else if (level == 5) {
                String strStringPlus4 = Intrinsics.stringPlus("Engine.", tag);
                Intrinsics.checkNotNull(msg);
                Log.w(strStringPlus4, msg);
            } else {
                if (level != 6) {
                    return;
                }
                String strStringPlus5 = Intrinsics.stringPlus("Engine.", tag);
                Intrinsics.checkNotNull(msg);
                Log.e(strStringPlus5, msg);
            }
        }
    }

    @Override // com.oplus.aiunit.vision.es9
    public void a(int level) {
        a = level;
    }

    @Override // com.oplus.aiunit.vision.es9
    public void b(@Nullable String tag, @NotNull String[] msgList) {
        Intrinsics.checkNotNullParameter(msgList, "msgList");
        INSTANCE.e(3, tag, msgList);
    }

    @Override // com.oplus.aiunit.vision.es9
    public void d(@Nullable String tag, @Nullable String msg) {
        INSTANCE.d(3, tag, msg);
    }

    @Override // com.oplus.aiunit.vision.es9
    public void e(@Nullable String tag, @Nullable String msg) {
        INSTANCE.d(6, tag, msg);
    }

    @Override // com.oplus.aiunit.vision.es9
    public void i(@Nullable String tag, @Nullable String msg) {
        INSTANCE.d(4, tag, msg);
    }

    @Override // com.oplus.aiunit.vision.es9
    public void print(@Nullable String tag, @Nullable String msg) {
        INSTANCE.f(3, tag, msg);
    }

    @Override // com.oplus.aiunit.vision.es9
    public void v(@Nullable String tag, @Nullable String msg) {
        INSTANCE.d(2, tag, msg);
    }

    @Override // com.oplus.aiunit.vision.es9
    public void w(@Nullable String tag, @Nullable String msg) {
        INSTANCE.d(5, tag, msg);
    }

    @Override // com.oplus.aiunit.vision.es9
    public void e(@Nullable String tag, @Nullable String msg, @Nullable Throwable ex) {
        Log.e(Intrinsics.stringPlus("Engine.", tag), msg, ex);
    }
}
