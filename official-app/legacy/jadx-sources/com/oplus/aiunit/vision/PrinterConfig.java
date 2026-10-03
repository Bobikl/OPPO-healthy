package com.oplus.aiunit.vision;

import com.heytap.log.formatter.LogFieldKey;
import com.oplus.pantanal.log.printer.EncryptType;
import io.protostuff.MapSchema;
import java.util.LinkedHashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.oue, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010#\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0016¢\u0006\u0004\bM\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u0010\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010+\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\b\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010&\u001a\u0004\b,\u0010(\"\u0004\b-\u0010*R\"\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b.\u0010(\"\u0004\b/\u0010*R \u00105\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u00106\u001a\b\u0012\u0004\u0012\u00020\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u00102\u001a\u0004\b1\u00104R\u001a\u0010:\u001a\u00020\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u00107\u001a\u0004\b8\u00109R\u001a\u0010;\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b%\u0010(R\"\u0010\u000e\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b\u001e\u0010>\"\u0004\b?\u0010@R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\b\u0017\u0010C\"\u0004\bD\u0010ER\"\u0010H\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bF\u0010\u001f\u001a\u0004\bA\u0010!\"\u0004\bG\u0010#R\"\u0010J\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010\u001f\u001a\u0004\b<\u0010!\"\u0004\bI\u0010#R\"\u0010L\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001f\u001a\u0004\bF\u0010!\"\u0004\bK\u0010#¨\u0006N"}, d2 = {"Lcom/oplus/aiunit/vision/oue;", "", "", "newTagPrefix", "", "o", "logMsgSuffix", "n", "logTagSecondaryPrefix", LogFieldKey.PROCESS_NAME_KEY, "Lcom/oplus/aiunit/vision/dn6;", "encryptConfig", "q", "Lcom/oplus/pantanal/log/printer/EncryptType;", "encryptType", "r", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/oue$a;", "a", "Lcom/oplus/aiunit/vision/oue$a;", "getBuilder", "()Lcom/oplus/aiunit/vision/oue$a;", "setBuilder", "(Lcom/oplus/aiunit/vision/oue$a;)V", "builder", "b", "I", "d", "()I", "setLogFloorLevel$OLog_release", "(I)V", "logFloorLevel", "c", "Ljava/lang/String;", b2n.f, "()Ljava/lang/String;", "setLogTagPrefix$OLog_release", "(Ljava/lang/String;)V", "logTagPrefix", b2n.g, "setLogTagSecondaryPrefix$OLog_release", MapSchema.FIELD_NAME_ENTRY, "setLogMsgSuffix$OLog_release", "", "f", "Ljava/util/Set;", "i", "()Ljava/util/Set;", "logTagWhiteSet", "logTagBlackSet", "Z", LogFieldKey.MESSAGE_KEY, "()Z", "printFileNameAndLineNumber", "logClassName", "j", "Lcom/oplus/pantanal/log/printer/EncryptType;", "()Lcom/oplus/pantanal/log/printer/EncryptType;", "setEncryptType$OLog_release", "(Lcom/oplus/pantanal/log/printer/EncryptType;)V", MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/dn6;", "()Lcom/oplus/aiunit/vision/dn6;", "setEncryptConfig$OLog_release", "(Lcom/oplus/aiunit/vision/dn6;)V", LogFieldKey.LEVEL_KEY, "setMaxTagLen$OLog_release", "maxTagLen", "setMaxMsgLen$OLog_release", "maxMsgLen", "setMaxTotalMsgLen$OLog_release", "maxTotalMsgLen", "<init>", "OLog_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class PrinterConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public a builder;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public volatile int logFloorLevel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String logTagPrefix;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public String logTagSecondaryPrefix;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public volatile String logMsgSuffix;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Set<String> logTagWhiteSet;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Set<String> logTagBlackSet;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean printFileNameAndLineNumber;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String logClassName;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public volatile EncryptType encryptType;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public volatile EncryptConfig encryptConfig;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public int maxTagLen;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int maxMsgLen;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int maxTotalMsgLen;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.oue$a */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010#\n\u0002\b\u001f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bK\u0010LJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0005J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\nJ\u0018\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\nJ\u0006\u0010\u001b\u001a\u00020\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010*\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R\"\u0010\b\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010$\"\u0004\b-\u0010&R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00050.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010/\u001a\u0004\b0\u00101R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00050.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010/\u001a\u0004\b3\u00101R\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\r\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010\"\u001a\u0004\b+\u0010$\"\u0004\b:\u0010&R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010;\u001a\u0004\b'\u0010<\"\u0004\b=\u0010>R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010?\u001a\u0004\b!\u0010@\"\u0004\bA\u0010BR\"\u0010F\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010\u001c\u001a\u0004\bD\u0010\u001e\"\u0004\bE\u0010 R\"\u0010\u0015\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010\u001c\u001a\u0004\bC\u0010\u001e\"\u0004\bH\u0010 R\"\u0010J\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010\u001c\u001a\u0004\bG\u0010\u001e\"\u0004\bI\u0010 ¨\u0006M"}, d2 = {"Lcom/oplus/aiunit/vision/oue$a;", "", "", "logLevel", LogFieldKey.PROCESS_NAME_KEY, "", "logTagPrefix", "r", "logMsgSuffix", "q", "", "printFileNameAndLineNumber", "y", "logClassName", "o", "Lcom/oplus/pantanal/log/printer/EncryptType;", "encryptType", "x", "Lcom/oplus/aiunit/vision/dn6;", "encryptConfig", "w", "maxMsgLen", "checkValid", "s", "maxTotalMsgLen", "u", "Lcom/oplus/aiunit/vision/oue;", "a", "I", MapSchema.FIELD_NAME_ENTRY, "()I", "setLogLevel$OLog_release", "(I)V", "b", "Ljava/lang/String;", b2n.g, "()Ljava/lang/String;", "setLogTagPrefix$OLog_release", "(Ljava/lang/String;)V", "c", "i", "setLogTagSecondaryPrefix$OLog_release", "logTagSecondaryPrefix", "d", "f", "setLogMsgSuffix$OLog_release", "", "Ljava/util/Set;", b2n.f, "()Ljava/util/Set;", "logTagBlackSet", "j", "logTagWhiteSet", "Z", "n", "()Z", "setPrintFileNameAndLineNumber$OLog_release", "(Z)V", "setLogClassName$OLog_release", "Lcom/oplus/pantanal/log/printer/EncryptType;", "()Lcom/oplus/pantanal/log/printer/EncryptType;", "setEncryptType$OLog_release", "(Lcom/oplus/pantanal/log/printer/EncryptType;)V", "Lcom/oplus/aiunit/vision/dn6;", "()Lcom/oplus/aiunit/vision/dn6;", "setEncryptConfig$OLog_release", "(Lcom/oplus/aiunit/vision/dn6;)V", MapSchema.FIELD_NAME_KEY, LogFieldKey.MESSAGE_KEY, "setMaxTagLen$OLog_release", "maxTagLen", LogFieldKey.LEVEL_KEY, "setMaxMsgLen$OLog_release", "setMaxMsgTotalLen$OLog_release", "maxMsgTotalLen", "<init>", "()V", "OLog_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public EncryptConfig encryptConfig;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public int logLevel = 1;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public String logTagPrefix = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public String logTagSecondaryPrefix = "";

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public String logMsgSuffix = "";

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Set<String> logTagBlackSet = new LinkedHashSet();

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        public final Set<String> logTagWhiteSet = new LinkedHashSet();

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public boolean printFileNameAndLineNumber = true;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @NotNull
        public String logClassName = "";

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @NotNull
        public EncryptType encryptType = EncryptType.NONE;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public int maxTagLen = 84;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        public int maxMsgLen = 3000;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public int maxMsgTotalLen = 10000;

        public static /* synthetic */ a t(a aVar, int i, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            return aVar.s(i, z);
        }

        public static /* synthetic */ a v(a aVar, int i, boolean z, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            return aVar.u(i, z);
        }

        @NotNull
        public final PrinterConfig a() {
            return new PrinterConfig(this);
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final EncryptConfig getEncryptConfig() {
            return this.encryptConfig;
        }

        @NotNull
        /* JADX INFO: renamed from: c, reason: from getter */
        public final EncryptType getEncryptType() {
            return this.encryptType;
        }

        @NotNull
        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getLogClassName() {
            return this.logClassName;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getLogLevel() {
            return this.logLevel;
        }

        @NotNull
        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getLogMsgSuffix() {
            return this.logMsgSuffix;
        }

        @NotNull
        public final Set<String> g() {
            return this.logTagBlackSet;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getLogTagPrefix() {
            return this.logTagPrefix;
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getLogTagSecondaryPrefix() {
            return this.logTagSecondaryPrefix;
        }

        @NotNull
        public final Set<String> j() {
            return this.logTagWhiteSet;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getMaxMsgLen() {
            return this.maxMsgLen;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final int getMaxMsgTotalLen() {
            return this.maxMsgTotalLen;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getMaxTagLen() {
            return this.maxTagLen;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getPrintFileNameAndLineNumber() {
            return this.printFileNameAndLineNumber;
        }

        @NotNull
        public final a o(@NotNull String logClassName) {
            Intrinsics.checkNotNullParameter(logClassName, "logClassName");
            this.logClassName = logClassName;
            return this;
        }

        @NotNull
        public final a p(int logLevel) {
            this.logLevel = logLevel;
            return this;
        }

        @NotNull
        public final a q(@NotNull String logMsgSuffix) {
            Intrinsics.checkNotNullParameter(logMsgSuffix, "logMsgSuffix");
            this.logMsgSuffix = logMsgSuffix;
            return this;
        }

        @NotNull
        public final a r(@NotNull String logTagPrefix) {
            Intrinsics.checkNotNullParameter(logTagPrefix, "logTagPrefix");
            this.logTagPrefix = logTagPrefix;
            return this;
        }

        @NotNull
        public final a s(int maxMsgLen, boolean checkValid) {
            if (checkValid) {
                if (maxMsgLen <= 100) {
                    this.maxMsgLen = 100;
                    return this;
                }
                if (maxMsgLen >= 4000) {
                    this.maxMsgLen = 4000;
                    return this;
                }
            }
            this.maxMsgLen = maxMsgLen;
            return this;
        }

        @NotNull
        public final a u(int maxTotalMsgLen, boolean checkValid) {
            int i;
            if (!checkValid || maxTotalMsgLen >= (i = this.maxMsgLen)) {
                this.maxMsgTotalLen = maxTotalMsgLen;
                return this;
            }
            this.maxMsgTotalLen = i;
            return this;
        }

        @NotNull
        public final a w(@Nullable EncryptConfig encryptConfig) {
            this.encryptConfig = encryptConfig;
            return this;
        }

        @NotNull
        public final a x(@NotNull EncryptType encryptType) {
            Intrinsics.checkNotNullParameter(encryptType, "encryptType");
            this.encryptType = encryptType;
            return this;
        }

        @NotNull
        public final a y(boolean printFileNameAndLineNumber) {
            this.printFileNameAndLineNumber = printFileNameAndLineNumber;
            return this;
        }
    }

    public PrinterConfig(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.builder = builder;
        this.logFloorLevel = builder.getLogLevel();
        this.logTagPrefix = this.builder.getLogTagPrefix();
        this.logTagSecondaryPrefix = this.builder.getLogTagSecondaryPrefix();
        this.logMsgSuffix = this.builder.getLogMsgSuffix();
        this.logTagWhiteSet = this.builder.j();
        this.logTagBlackSet = this.builder.g();
        this.printFileNameAndLineNumber = this.builder.getPrintFileNameAndLineNumber();
        this.logClassName = this.builder.getLogClassName();
        this.encryptType = this.builder.getEncryptType();
        this.encryptConfig = this.builder.getEncryptConfig();
        this.maxTagLen = this.builder.getMaxTagLen();
        this.maxMsgLen = this.builder.getMaxMsgLen();
        this.maxTotalMsgLen = this.builder.getMaxMsgTotalLen();
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final EncryptConfig getEncryptConfig() {
        return this.encryptConfig;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final EncryptType getEncryptType() {
        return this.encryptType;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getLogClassName() {
        return this.logClassName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getLogFloorLevel() {
        return this.logFloorLevel;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getLogMsgSuffix() {
        return this.logMsgSuffix;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PrinterConfig) && Intrinsics.areEqual(this.builder, ((PrinterConfig) other).builder);
    }

    @NotNull
    public final Set<String> f() {
        return this.logTagBlackSet;
    }

    @NotNull
    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getLogTagPrefix() {
        return this.logTagPrefix;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getLogTagSecondaryPrefix() {
        return this.logTagSecondaryPrefix;
    }

    public int hashCode() {
        return this.builder.hashCode();
    }

    @NotNull
    public final Set<String> i() {
        return this.logTagWhiteSet;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getMaxMsgLen() {
        return this.maxMsgLen;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getMaxTagLen() {
        return this.maxTagLen;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getMaxTotalMsgLen() {
        return this.maxTotalMsgLen;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getPrintFileNameAndLineNumber() {
        return this.printFileNameAndLineNumber;
    }

    public final void n(@NotNull String logMsgSuffix) {
        Intrinsics.checkNotNullParameter(logMsgSuffix, "logMsgSuffix");
        this.logMsgSuffix = logMsgSuffix;
    }

    public final void o(@NotNull String newTagPrefix) {
        Intrinsics.checkNotNullParameter(newTagPrefix, "newTagPrefix");
        this.logTagPrefix = newTagPrefix;
    }

    public final void p(@NotNull String logTagSecondaryPrefix) {
        Intrinsics.checkNotNullParameter(logTagSecondaryPrefix, "logTagSecondaryPrefix");
        this.logTagSecondaryPrefix = logTagSecondaryPrefix;
    }

    public final void q(@Nullable EncryptConfig encryptConfig) {
        this.encryptConfig = encryptConfig;
    }

    public final void r(@NotNull EncryptType encryptType) {
        Intrinsics.checkNotNullParameter(encryptType, "encryptType");
        this.encryptType = encryptType;
    }

    @NotNull
    public String toString() {
        return "PrinterConfig(builder=" + this.builder + ")";
    }
}
