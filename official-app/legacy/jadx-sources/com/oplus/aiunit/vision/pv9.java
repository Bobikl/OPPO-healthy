package com.oplus.aiunit.vision;

import android.util.Log;
import com.oplus.pantanal.log.printer.EncryptType;
import com.oplus.weatherservicesdk.data.Weather;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.ranges.RangesKt___RangesKt;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001JR\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J \u0010\u0017\u001a\u00060\u0014j\u0002`\u00152\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J&\u0010\u001c\u001a\u00020\u000f2\n\u0010\u0018\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J*\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J \u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0016J\u001a\u0010\"\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 H\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0007H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\n\u0010(\u001a\u0004\u0018\u00010\u001aH\u0002J8\u0010)\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u001c\u0010*\u001a\u00020\u000f2\n\u0010\u0018\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u000b\u001a\u00020\u0002H\u0002R\u001c\u0010\u0012\u001a\u00020\u00118&@&X¦\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/oplus/aiunit/vision/pv9;", "", "", "logLevel", "", "tag", "msg", "", "isMsgContainsSensitiveInfo", "sensitiveMsg", "printThreadInfo", "stackTraceDepth", "printClassNameAndMethodName", "", "throwable", "", "println", "Lcom/oplus/aiunit/vision/oue;", "logConfig", "handleTag", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "input", "handleLongMsgV2", "sb", "blankCnt", "Ljava/lang/StackTraceElement;", "stackTraceElement", "appendCurTraceElementToNxtLine", "doPrint", "shouldPrint", "handleSensitiveMsg", "Lcom/oplus/aiunit/vision/dn6;", "encryptConfig", "genEncryptedMsgViaRsa", "msgContainsSensitiveInfo", "handleOriginMsg", "formatThreadInfo", "formatClassNameAndMethodName", "fortmatFileNameAndLineNumber", "findTargetTraceElement", "handleMsg", "handleStackTrace", "getLogConfig", "()Lcom/oplus/aiunit/vision/oue;", "setLogConfig", "(Lcom/oplus/aiunit/vision/oue;)V", "OLog_release"}, k = 1, mv = {1, 8, 0})
public interface pv9 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nIPrinter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IPrinter.kt\ncom/oplus/pantanal/log/printer/IPrinter$DefaultImpls\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,405:1\n13644#2,3:406\n13644#2,3:409\n*S KotlinDebug\n*F\n+ 1 IPrinter.kt\ncom/oplus/pantanal/log/printer/IPrinter$DefaultImpls\n*L\n232#1:406,3\n393#1:409,3\n*E\n"})
    public static final class a {
        public static void a(@NotNull pv9 pv9Var, @NotNull StringBuilder sb, int i, @Nullable StackTraceElement stackTraceElement) {
            Intrinsics.checkNotNullParameter(sb, "sb");
            if (stackTraceElement == null || i <= 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder("|");
            for (int i2 = 0; i2 < i; i2++) {
                sb2.append("__");
            }
            sb.append(Weather.SEPARATOR);
            sb.append((CharSequence) sb2);
            sb.append(stackTraceElement.toString());
        }

        public static StackTraceElement b(pv9 pv9Var) {
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTraceElements, "stackTraceElements");
            int length = stackTraceElements.length;
            int i = -1;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = i3 + 1;
                String className = stackTraceElements[i2].getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "element.className");
                if (StringsKt__StringsJVMKt.endsWith$default(className, pv9Var.getLogConfig().getLogClassName(), false, 2, null)) {
                    i = i3 + 2;
                }
                i2++;
                i3 = i4;
            }
            if (i == -1 || i >= stackTraceElements.length) {
                return null;
            }
            return stackTraceElements[i];
        }

        @NotNull
        public static String c(@NotNull pv9 pv9Var) {
            StackTraceElement stackTraceElementB = b(pv9Var);
            if (stackTraceElementB == null) {
                return "";
            }
            return stackTraceElementB.getClassName() + "." + stackTraceElementB.getMethodName();
        }

        @NotNull
        public static String d(@NotNull pv9 pv9Var) {
            return "t(" + Thread.currentThread().getName() + ")";
        }

        @NotNull
        public static String e(@NotNull pv9 pv9Var) {
            StackTraceElement stackTraceElementB = b(pv9Var);
            if (stackTraceElementB == null) {
                return "";
            }
            return "(" + stackTraceElementB.getFileName() + ":" + stackTraceElementB.getLineNumber() + ")";
        }

        @NotNull
        public static String f(@NotNull pv9 pv9Var, @NotNull String sensitiveMsg, @Nullable EncryptConfig encryptConfig) {
            Intrinsics.checkNotNullParameter(sensitiveMsg, "sensitiveMsg");
            if ((encryptConfig != null ? encryptConfig.getRsaTransformation() : null) == null || encryptConfig.getRsaPubKeyString() == null) {
                Log.w("OLog", "rsaPubKeyString or rsaTransformation is null.");
                return sensitiveMsg;
            }
            String rsaPubKeyString = encryptConfig.getRsaPubKeyString();
            Intrinsics.checkNotNull(rsaPubKeyString);
            String rsaTransformation = encryptConfig.getRsaTransformation();
            Intrinsics.checkNotNull(rsaTransformation);
            return gn6.b(sensitiveMsg, rsaPubKeyString, rsaTransformation);
        }

        @NotNull
        public static StringBuilder g(@NotNull pv9 pv9Var, @NotNull StringBuilder input, @NotNull PrinterConfig logConfig) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(logConfig, "logConfig");
            if (input.length() <= logConfig.getMaxMsgLen()) {
                return input;
            }
            StringBuilder sb = new StringBuilder(input.length() + (input.length() / logConfig.getMaxMsgLen()) + 1);
            int maxMsgLen = 0;
            while (maxMsgLen < input.length()) {
                sb.append((CharSequence) input, maxMsgLen, RangesKt___RangesKt.coerceAtMost(logConfig.getMaxMsgLen(), input.length() - maxMsgLen) + maxMsgLen);
                maxMsgLen += logConfig.getMaxMsgLen();
                if (maxMsgLen < input.length()) {
                    sb.append(Weather.SEPARATOR);
                }
            }
            return sb;
        }

        @NotNull
        public static StringBuilder h(@NotNull pv9 pv9Var, @NotNull StringBuilder input, @NotNull PrinterConfig logConfig) {
            int length;
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(logConfig, "logConfig");
            int maxTotalMsgLen = logConfig.getMaxTotalMsgLen();
            int maxMsgLen = logConfig.getMaxMsgLen();
            if (input.length() <= maxMsgLen) {
                if (input.length() > maxTotalMsgLen) {
                    int length2 = input.length();
                    input.delete(maxTotalMsgLen, input.length());
                    input.append("\n...[DROPPED " + (length2 - maxTotalMsgLen) + " CHARS]");
                }
                return input;
            }
            boolean z = true;
            StringBuilder sb = new StringBuilder(input.length() + (input.length() / maxMsgLen) + 1);
            int i = 0;
            while (true) {
                if (i >= input.length()) {
                    z = false;
                    break;
                }
                int iCoerceAtMost = RangesKt___RangesKt.coerceAtMost(maxMsgLen, input.length() - i) + i;
                if (iCoerceAtMost > maxTotalMsgLen) {
                    int i2 = maxTotalMsgLen - i;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 + i;
                    sb.append((CharSequence) input, i, i3);
                    i = i3;
                    break;
                }
                sb.append((CharSequence) input, i, iCoerceAtMost);
                if (iCoerceAtMost < input.length() && iCoerceAtMost < maxTotalMsgLen) {
                    sb.append(Weather.SEPARATOR);
                }
                i = iCoerceAtMost;
            }
            if ((z || i < input.length()) && (length = input.length() - i) > 0) {
                sb.append("\n...[DROPPED " + length + " CHARS]");
            }
            return sb;
        }

        public static String i(pv9 pv9Var, String str, boolean z, String str2, boolean z2, int i, boolean z3) {
            StringBuilder sb = new StringBuilder();
            if (z2) {
                sb.append(pv9Var.formatThreadInfo());
            }
            String strHandleOriginMsg = pv9Var.handleOriginMsg(str, z);
            sb.append(" ");
            sb.append(strHandleOriginMsg);
            String strHandleSensitiveMsg = pv9Var.handleSensitiveMsg(str2);
            if (str2.length() > 0) {
                sb.append(",");
                sb.append(strHandleSensitiveMsg);
            }
            sb.append(pv9Var.getLogConfig().getLogMsgSuffix());
            if (z3) {
                sb.append(" at ");
                sb.append(pv9Var.formatClassNameAndMethodName());
            }
            if (pv9Var.getLogConfig().getPrintFileNameAndLineNumber()) {
                sb.append(pv9Var.fortmatFileNameAndLineNumber());
            }
            StringBuilder sbHandleLongMsgV2 = pv9Var.handleLongMsgV2(sb, pv9Var.getLogConfig());
            l(pv9Var, sbHandleLongMsgV2, i);
            String string = sbHandleLongMsgV2.toString();
            Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
            return string;
        }

        @NotNull
        public static String j(@NotNull pv9 pv9Var, @NotNull String msg, boolean z) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            return msg;
        }

        @NotNull
        public static String k(@NotNull pv9 pv9Var, @NotNull String sensitiveMsg) {
            Intrinsics.checkNotNullParameter(sensitiveMsg, "sensitiveMsg");
            int i = b.$EnumSwitchMapping$0[pv9Var.getLogConfig().getEncryptType().ordinal()];
            if (i != 2) {
                return i != 3 ? sensitiveMsg : pv9Var.genEncryptedMsgViaRsa(sensitiveMsg, pv9Var.getLogConfig().getEncryptConfig());
            }
            return gn6.a(sensitiveMsg, pv9Var.getLogConfig().getEncryptConfig());
        }

        public static void l(pv9 pv9Var, StringBuilder sb, int i) {
            if (i == 1) {
                return;
            }
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            Intrinsics.checkNotNullExpressionValue(stackTraceElements, "stackTraceElements");
            int length = stackTraceElements.length;
            int i2 = 0;
            int i3 = 0;
            int i4 = -1;
            while (i2 < length) {
                int i5 = i3 + 1;
                String className = stackTraceElements[i2].getClassName();
                Intrinsics.checkNotNullExpressionValue(className, "element.className");
                if (StringsKt__StringsJVMKt.endsWith$default(className, pv9Var.getLogConfig().getLogClassName(), false, 2, null)) {
                    i4 = i3 + 3;
                }
                i2++;
                i3 = i5;
            }
            int i6 = 1;
            while (i > 1 && i4 != -1 && i4 < stackTraceElements.length) {
                pv9Var.appendCurTraceElementToNxtLine(sb, i6, stackTraceElements[i4]);
                i4++;
                i6++;
                i--;
            }
        }

        @NotNull
        public static String m(@NotNull pv9 pv9Var, @NotNull String tag, @NotNull PrinterConfig logConfig) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(logConfig, "logConfig");
            String logTagPrefix = logConfig.getLogTagPrefix();
            if (logConfig.getLogTagSecondaryPrefix().length() > 0) {
                logTagPrefix = logTagPrefix + "." + logConfig.getLogTagSecondaryPrefix();
            }
            String str = logTagPrefix + "." + tag;
            if (str.length() < logConfig.getMaxTagLen()) {
                return str;
            }
            String strSubstring = str.substring(0, logConfig.getMaxTagLen());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return strSubstring;
        }

        public static void n(@NotNull pv9 pv9Var, int i, @NotNull String tag, @NotNull String msg, boolean z, @NotNull String sensitiveMsg, boolean z2, int i2, boolean z3, @Nullable Throwable th) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            Intrinsics.checkNotNullParameter(sensitiveMsg, "sensitiveMsg");
            if (pv9Var.shouldPrint(i, tag, msg)) {
                pv9Var.doPrint(i, pv9Var.handleTag(tag, pv9Var.getLogConfig()), i(pv9Var, msg, z, sensitiveMsg, z2, i2, z3), th);
            }
        }

        public static boolean o(@NotNull pv9 pv9Var, int i, @NotNull String tag, @NotNull String msg) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            if (i < pv9Var.getLogConfig().getLogFloorLevel()) {
                return false;
            }
            if (!(!pv9Var.getLogConfig().i().isEmpty())) {
                return !pv9Var.getLogConfig().f().contains(tag);
            }
            if (pv9Var.getLogConfig().i().contains(tag)) {
                return true;
            }
            Log.i("OLog", "shouldPrint return false,tag:" + tag + " not in tagWhiteSet" + pv9Var.getLogConfig().i() + ",");
            return false;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EncryptType.values().length];
            try {
                iArr[EncryptType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EncryptType.BASE64.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EncryptType.RSA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    void appendCurTraceElementToNxtLine(@NotNull StringBuilder sb, int blankCnt, @Nullable StackTraceElement stackTraceElement);

    void doPrint(int logLevel, @NotNull String tag, @NotNull String msg, @Nullable Throwable throwable);

    @NotNull
    String formatClassNameAndMethodName();

    @NotNull
    String formatThreadInfo();

    @NotNull
    String fortmatFileNameAndLineNumber();

    @NotNull
    String genEncryptedMsgViaRsa(@NotNull String sensitiveMsg, @Nullable EncryptConfig encryptConfig);

    @NotNull
    PrinterConfig getLogConfig();

    @NotNull
    StringBuilder handleLongMsgV2(@NotNull StringBuilder input, @NotNull PrinterConfig logConfig);

    @NotNull
    String handleOriginMsg(@NotNull String msg, boolean msgContainsSensitiveInfo);

    @NotNull
    String handleSensitiveMsg(@NotNull String sensitiveMsg);

    @NotNull
    String handleTag(@NotNull String tag, @NotNull PrinterConfig logConfig);

    void println(int logLevel, @NotNull String tag, @NotNull String msg, boolean isMsgContainsSensitiveInfo, @NotNull String sensitiveMsg, boolean printThreadInfo, int stackTraceDepth, boolean printClassNameAndMethodName, @Nullable Throwable throwable);

    boolean shouldPrint(int logLevel, @NotNull String tag, @NotNull String msg);
}
