package com.heytap.speech.engine.constant;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.text.CharsKt__CharJVMKt;
import p010kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u00042\u0016\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\"\"\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004J\u0010\u0010%\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004J\u0006\u0010&\u001a\u00020\u0004J\u0010\u0010'\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004J\u0006\u0010(\u001a\u00020\u0004J\u0010\u0010)\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0004H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0011\u0010\u0019\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0011\u0010\u001b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0011\u0010\u001d\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006¨\u0006-"}, d2 = {"Lcom/heytap/speech/engine/constant/PhoneConstants;", "", "()V", "CLOS_H", "", "getCLOS_H", "()Ljava/lang/String;", "CLOS_L", "getCLOS_L", "CLOS_LC", "getCLOS_LC", "CLOS_UC", "getCLOS_UC", "OPLS_H", "getOPLS_H", "OPLS_L", "getOPLS_L", "OPLS_UC", "getOPLS_UC", "OP_H", "getOP_H", "OP_L", "getOP_L", "OP_UC", "getOP_UC", "RLM_H", "getRLM_H", "RLM_L", "getRLM_L", "RLM_UC", "getRLM_UC", "format", "origin", "args", "", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "formatColorOS", "formatOp", "getOPLSUC", "getOplsEncodeLower", "getRLMUC", "getRlmEncodeLower", "unicode2String", "unicodes", "Companion", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class PhoneConstants {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final PhoneConstants INSTANCE = new PhoneConstants();

    @NotNull
    private final String OP_L = unicode2String("\\u6f\\u70\\u70\\u6f");

    @NotNull
    private final String OP_UC = unicode2String("\\u4f\\u70\\u70\\u6f");

    @NotNull
    private final String OP_H = unicode2String("\\u4f\\u50\\u50\\u4f");

    @NotNull
    private final String OPLS_L = unicode2String("\\u6f\\u6e\\u65\\u70\\u6c\\u75\\u73");

    @NotNull
    private final String OPLS_UC = unicode2String("\\u4f\\u6e\\u65\\u50\\u6c\\u75\\u73");

    @NotNull
    private final String OPLS_H = unicode2String("\\u4f\\u4e\\u45\\u50\\u4c\\u55\\u53");

    @NotNull
    private final String RLM_L = unicode2String("\\u72\\u65\\u61\\u6c\\u6d\\u65");

    @NotNull
    private final String RLM_UC = unicode2String("\\u52\\u65\\u61\\u6c\\u6d\\u65");

    @NotNull
    private final String RLM_H = unicode2String("\\u52\\u45\\u41\\u4c\\u4d\\u45");

    @NotNull
    private final String CLOS_L = unicode2String("\\u63\\u6f\\u6c\\u6f\\u72\\u6f\\u73");

    @NotNull
    private final String CLOS_H = unicode2String("\\u43\\u4f\\u4c\\u4f\\u52\\u4f\\u53");

    @NotNull
    private final String CLOS_LC = unicode2String("\\u63\\u6f\\u6c\\u6f\\u72\\u4f\\u73");

    @NotNull
    private final String CLOS_UC = unicode2String("\\u43\\u6f\\u6c\\u6f\\u72\\u4f\\u53");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/heytap/speech/engine/constant/PhoneConstants$Companion;", "", "()V", "INSTANCE", "Lcom/heytap/speech/engine/constant/PhoneConstants;", "getINSTANCE", "()Lcom/heytap/speech/engine/constant/PhoneConstants;", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PhoneConstants getINSTANCE() {
            return PhoneConstants.INSTANCE;
        }
    }

    private final String unicode2String(String unicodes) {
        StringBuilder sb = new StringBuilder();
        Object[] array = StringsKt__StringsKt.split$default((CharSequence) unicodes, new String[]{"\\u"}, false, 0, 6, (Object) null).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        String[] strArr = (String[]) array;
        int length = strArr.length;
        int i = 1;
        if (1 < length) {
            while (true) {
                int i2 = i + 1;
                sb.append((char) Integer.parseInt(strArr[i], CharsKt__CharJVMKt.checkRadix(16)));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "string.toString()");
        return string;
    }

    @NotNull
    public final String format(@Nullable String origin, @NotNull Object... args) {
        String str;
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            if (!(args.length == 0)) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Intrinsics.checkNotNull(origin);
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                str = String.format(origin, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                Intrinsics.checkNotNull(origin);
                str = String.format(origin, Arrays.copyOf(new Object[]{this.OP_L}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
            }
            origin = str;
        } catch (Exception unused) {
        }
        Intrinsics.checkNotNull(origin);
        return origin;
    }

    @NotNull
    public final String formatColorOS(@Nullable String origin) {
        return format(origin, this.CLOS_L);
    }

    @NotNull
    public final String formatOp(@Nullable String origin) {
        return format(origin, this.OP_L);
    }

    @NotNull
    public final String getCLOS_H() {
        return this.CLOS_H;
    }

    @NotNull
    public final String getCLOS_L() {
        return this.CLOS_L;
    }

    @NotNull
    public final String getCLOS_LC() {
        return this.CLOS_LC;
    }

    @NotNull
    public final String getCLOS_UC() {
        return this.CLOS_UC;
    }

    @NotNull
    /* JADX INFO: renamed from: getOPLSUC, reason: from getter */
    public final String getOPLS_UC() {
        return this.OPLS_UC;
    }

    @NotNull
    public final String getOPLS_H() {
        return this.OPLS_H;
    }

    @NotNull
    public final String getOPLS_L() {
        return this.OPLS_L;
    }

    @NotNull
    public final String getOPLS_UC() {
        return this.OPLS_UC;
    }

    @NotNull
    public final String getOP_H() {
        return this.OP_H;
    }

    @NotNull
    public final String getOP_L() {
        return this.OP_L;
    }

    @NotNull
    public final String getOP_UC() {
        return this.OP_UC;
    }

    @NotNull
    public final String getOplsEncodeLower(@Nullable String origin) {
        return format(origin, this.OPLS_L);
    }

    @NotNull
    /* JADX INFO: renamed from: getRLMUC, reason: from getter */
    public final String getRLM_UC() {
        return this.RLM_UC;
    }

    @NotNull
    public final String getRLM_H() {
        return this.RLM_H;
    }

    @NotNull
    public final String getRLM_L() {
        return this.RLM_L;
    }

    @NotNull
    public final String getRLM_UC() {
        return this.RLM_UC;
    }

    @NotNull
    public final String getRlmEncodeLower(@Nullable String origin) {
        return format(origin, this.RLM_L);
    }
}
