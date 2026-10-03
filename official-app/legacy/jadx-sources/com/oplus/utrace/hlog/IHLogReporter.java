package com.oplus.utrace.hlog;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u001a\u001bJ\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J=\u0010\u000b\u001a\u00020\u00002.\u0010\f\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000e0\r\"\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eH&¢\u0006\u0002\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H&J\u0010\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016H&J\"\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H&¨\u0006\u001c"}, d2 = {"Lcom/oplus/utrace/hlog/IHLogReporter;", "", "report", "", "code", "Lcom/oplus/utrace/hlog/IHLogReporter$Codes;", "message", "", "reportDirect", "directOnly", "", "setExtras", "pairs", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lcom/oplus/utrace/hlog/IHLogReporter;", "setLogFiles", "files", "", "Ljava/io/File;", "setPushData", "pushData", "Lcom/oplus/utrace/hlog/PushData;", "traceId", "", "targetPkg", "Codes", "Phase", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IHLogReporter {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PushSvc_100000_process_ahead' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b-\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1¨\u00062"}, d2 = {"Lcom/oplus/utrace/hlog/IHLogReporter$Codes;", "", TypedValues.CycleType.S_WAVE_PHASE, "Lcom/oplus/utrace/hlog/IHLogReporter$Phase;", "detail", "", "(Ljava/lang/String;ILcom/oplus/utrace/hlog/IHLogReporter$Phase;I)V", "value", "getValue", "()I", "PushSvc_100000_process_ahead", "PushSvc_100001_invalid_message", "PushSvc_100002_not_domestic", "PushSvc_100003_hlog_disabled", "OsenseSdk_110000_pass", "OsenseSdk_110001_enqueue", "OsenseSdk_110002_unavailable", "OsenseSdk_110003_delayed", "OsenseSdk_110004_timeout", "Start_120000_broadcast", "Start_120001_hlog_disabled", "Start_120002_invalid_message", "Start_120003_enqueue", "Start_120004_duplicated", "Start_120005_uploader_error", "Receiver_130000_upload_succ", "Receiver_130001_invalid_message", "Receiver_130002_disabled", "Receiver_130003_duplicated", "Receiver_130004_upload_fail", "Receiver_130005_onreceive", "SendFds_140000_send", "SendFds_140001_resolve", "SendFds_140002_open", "SendFds_140003_call", "RecvFds_150000_start_service", "RecvFds_150001_invalid_call", "RecvFds_150002_enqueue", "RecvFds_150003_extract_fds", "RecvFds_150004_no_uploader", "RecvFds_150005_uploader_error", "RecvFds_150006_copy_error", "UploadSvc_160000_upload_succ", "UploadSvc_160001_enqueue", "UploadSvc_160002_invalid_message", "UploadSvc_160003_hlog_error", "UploadSvc_160004_upload_fail", "Proxy_180000_start", "Proxy_180001_result", "Proxy_180002_result", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Codes {
        private static final /* synthetic */ Codes[] $VALUES;
        public static final Codes OsenseSdk_110000_pass;
        public static final Codes OsenseSdk_110001_enqueue;
        public static final Codes OsenseSdk_110002_unavailable;
        public static final Codes OsenseSdk_110003_delayed;
        public static final Codes OsenseSdk_110004_timeout;
        public static final Codes Proxy_180000_start;
        public static final Codes Proxy_180001_result;
        public static final Codes Proxy_180002_result;
        public static final Codes PushSvc_100000_process_ahead;
        public static final Codes PushSvc_100001_invalid_message;
        public static final Codes PushSvc_100002_not_domestic;
        public static final Codes PushSvc_100003_hlog_disabled;
        public static final Codes Receiver_130000_upload_succ;
        public static final Codes Receiver_130001_invalid_message;
        public static final Codes Receiver_130002_disabled;
        public static final Codes Receiver_130003_duplicated;
        public static final Codes Receiver_130004_upload_fail;
        public static final Codes Receiver_130005_onreceive;
        public static final Codes RecvFds_150000_start_service;
        public static final Codes RecvFds_150001_invalid_call;
        public static final Codes RecvFds_150002_enqueue;
        public static final Codes RecvFds_150003_extract_fds;
        public static final Codes RecvFds_150004_no_uploader;
        public static final Codes RecvFds_150005_uploader_error;
        public static final Codes RecvFds_150006_copy_error;
        public static final Codes SendFds_140000_send;
        public static final Codes SendFds_140001_resolve;
        public static final Codes SendFds_140002_open;
        public static final Codes SendFds_140003_call;
        public static final Codes Start_120000_broadcast;
        public static final Codes Start_120001_hlog_disabled;
        public static final Codes Start_120002_invalid_message;
        public static final Codes Start_120003_enqueue;
        public static final Codes Start_120004_duplicated;
        public static final Codes Start_120005_uploader_error;
        public static final Codes UploadSvc_160000_upload_succ;
        public static final Codes UploadSvc_160001_enqueue;
        public static final Codes UploadSvc_160002_invalid_message;
        public static final Codes UploadSvc_160003_hlog_error;
        public static final Codes UploadSvc_160004_upload_fail;
        private final int value;

        private static final /* synthetic */ Codes[] $values() {
            return new Codes[]{PushSvc_100000_process_ahead, PushSvc_100001_invalid_message, PushSvc_100002_not_domestic, PushSvc_100003_hlog_disabled, OsenseSdk_110000_pass, OsenseSdk_110001_enqueue, OsenseSdk_110002_unavailable, OsenseSdk_110003_delayed, OsenseSdk_110004_timeout, Start_120000_broadcast, Start_120001_hlog_disabled, Start_120002_invalid_message, Start_120003_enqueue, Start_120004_duplicated, Start_120005_uploader_error, Receiver_130000_upload_succ, Receiver_130001_invalid_message, Receiver_130002_disabled, Receiver_130003_duplicated, Receiver_130004_upload_fail, Receiver_130005_onreceive, SendFds_140000_send, SendFds_140001_resolve, SendFds_140002_open, SendFds_140003_call, RecvFds_150000_start_service, RecvFds_150001_invalid_call, RecvFds_150002_enqueue, RecvFds_150003_extract_fds, RecvFds_150004_no_uploader, RecvFds_150005_uploader_error, RecvFds_150006_copy_error, UploadSvc_160000_upload_succ, UploadSvc_160001_enqueue, UploadSvc_160002_invalid_message, UploadSvc_160003_hlog_error, UploadSvc_160004_upload_fail, Proxy_180000_start, Proxy_180001_result, Proxy_180002_result};
        }

        static {
            Phase phase = Phase.PushSvc;
            PushSvc_100000_process_ahead = new Codes("PushSvc_100000_process_ahead", 0, phase, 0);
            PushSvc_100001_invalid_message = new Codes("PushSvc_100001_invalid_message", 1, phase, 1);
            PushSvc_100002_not_domestic = new Codes("PushSvc_100002_not_domestic", 2, phase, 2);
            PushSvc_100003_hlog_disabled = new Codes("PushSvc_100003_hlog_disabled", 3, phase, 3);
            Phase phase2 = Phase.OsenseSdk;
            OsenseSdk_110000_pass = new Codes("OsenseSdk_110000_pass", 4, phase2, 0);
            OsenseSdk_110001_enqueue = new Codes("OsenseSdk_110001_enqueue", 5, phase2, 1);
            OsenseSdk_110002_unavailable = new Codes("OsenseSdk_110002_unavailable", 6, phase2, 2);
            OsenseSdk_110003_delayed = new Codes("OsenseSdk_110003_delayed", 7, phase2, 3);
            OsenseSdk_110004_timeout = new Codes("OsenseSdk_110004_timeout", 8, phase2, 4);
            Phase phase3 = Phase.Start;
            Start_120000_broadcast = new Codes("Start_120000_broadcast", 9, phase3, 0);
            Start_120001_hlog_disabled = new Codes("Start_120001_hlog_disabled", 10, phase3, 1);
            Start_120002_invalid_message = new Codes("Start_120002_invalid_message", 11, phase3, 2);
            Start_120003_enqueue = new Codes("Start_120003_enqueue", 12, phase3, 3);
            Start_120004_duplicated = new Codes("Start_120004_duplicated", 13, phase3, 4);
            Start_120005_uploader_error = new Codes("Start_120005_uploader_error", 14, phase3, 5);
            Phase phase4 = Phase.Receiver;
            Receiver_130000_upload_succ = new Codes("Receiver_130000_upload_succ", 15, phase4, 0);
            Receiver_130001_invalid_message = new Codes("Receiver_130001_invalid_message", 16, phase4, 1);
            Receiver_130002_disabled = new Codes("Receiver_130002_disabled", 17, phase4, 2);
            Receiver_130003_duplicated = new Codes("Receiver_130003_duplicated", 18, phase4, 3);
            Receiver_130004_upload_fail = new Codes("Receiver_130004_upload_fail", 19, phase4, 4);
            Receiver_130005_onreceive = new Codes("Receiver_130005_onreceive", 20, phase4, 5);
            Phase phase5 = Phase.SendFds;
            SendFds_140000_send = new Codes("SendFds_140000_send", 21, phase5, 0);
            SendFds_140001_resolve = new Codes("SendFds_140001_resolve", 22, phase5, 1);
            SendFds_140002_open = new Codes("SendFds_140002_open", 23, phase5, 2);
            SendFds_140003_call = new Codes("SendFds_140003_call", 24, phase5, 3);
            Phase phase6 = Phase.RecvFds;
            RecvFds_150000_start_service = new Codes("RecvFds_150000_start_service", 25, phase6, 0);
            RecvFds_150001_invalid_call = new Codes("RecvFds_150001_invalid_call", 26, phase6, 1);
            RecvFds_150002_enqueue = new Codes("RecvFds_150002_enqueue", 27, phase6, 2);
            RecvFds_150003_extract_fds = new Codes("RecvFds_150003_extract_fds", 28, phase6, 3);
            RecvFds_150004_no_uploader = new Codes("RecvFds_150004_no_uploader", 29, phase6, 4);
            RecvFds_150005_uploader_error = new Codes("RecvFds_150005_uploader_error", 30, phase6, 5);
            RecvFds_150006_copy_error = new Codes("RecvFds_150006_copy_error", 31, phase6, 6);
            Phase phase7 = Phase.UploadSvc;
            UploadSvc_160000_upload_succ = new Codes("UploadSvc_160000_upload_succ", 32, phase7, 0);
            UploadSvc_160001_enqueue = new Codes("UploadSvc_160001_enqueue", 33, phase7, 1);
            UploadSvc_160002_invalid_message = new Codes("UploadSvc_160002_invalid_message", 34, phase7, 2);
            UploadSvc_160003_hlog_error = new Codes("UploadSvc_160003_hlog_error", 35, phase7, 3);
            UploadSvc_160004_upload_fail = new Codes("UploadSvc_160004_upload_fail", 36, phase7, 4);
            Phase phase8 = Phase.PROXY;
            Proxy_180000_start = new Codes("Proxy_180000_start", 37, phase8, 0);
            Proxy_180001_result = new Codes("Proxy_180001_result", 38, phase8, 1);
            Proxy_180002_result = new Codes("Proxy_180002_result", 39, phase8, 2);
            $VALUES = $values();
        }

        private Codes(String str, int i, Phase phase, int i2) {
            super(str, i);
            this.value = (phase.getValue() * 1000) + i2;
        }

        public static Codes valueOf(String str) {
            return (Codes) Enum.valueOf(Codes.class, str);
        }

        public static Codes[] values() {
            return (Codes[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void report$default(IHLogReporter iHLogReporter, Codes codes, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report");
            }
            if ((i & 2) != 0) {
                str = "";
            }
            iHLogReporter.report(codes, str);
        }

        public static /* synthetic */ void reportDirect$default(IHLogReporter iHLogReporter, Codes codes, boolean z, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportDirect");
            }
            if ((i & 4) != 0) {
                str = "";
            }
            iHLogReporter.reportDirect(codes, z, str);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/oplus/utrace/hlog/IHLogReporter$Phase;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "PushSvc", "OsenseSdk", "Start", "Receiver", "SendFds", "RecvFds", "UploadSvc", "PROXY", "utrace-sdk-log_logRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Phase {
        PushSvc(100),
        OsenseSdk(110),
        Start(120),
        Receiver(130),
        SendFds(140),
        RecvFds(150),
        UploadSvc(160),
        PROXY(180);

        private final int value;

        Phase(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    void report(@NotNull Codes code, @NotNull String message);

    void reportDirect(@NotNull Codes code, boolean directOnly, @NotNull String message);

    @NotNull
    IHLogReporter setExtras(@NotNull Pair<String, ? extends Object>... pairs);

    @NotNull
    IHLogReporter setLogFiles(@NotNull List<? extends File> files);

    @NotNull
    IHLogReporter setPushData(long traceId, @NotNull String targetPkg, @Nullable Object pushData);

    @NotNull
    IHLogReporter setPushData(@NotNull PushData pushData);
}
