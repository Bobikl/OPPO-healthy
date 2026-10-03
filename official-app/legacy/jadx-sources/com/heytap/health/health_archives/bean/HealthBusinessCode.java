package com.heytap.health.health_archives.bean;

import com.heytap.health.health_archives.R$string;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechErrorCode;
import com.oplus.aiunit.vision.iim;
import com.oplus.aiunit.vision.qtf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'COMMIT_FILE_NOT_FOUND' uses external variables
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
/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b.\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/¨\u00060"}, d2 = {"Lcom/heytap/health/health_archives/bean/HealthBusinessCode;", "", "", "code", "I", "getCode", "()I", iim.a.f, "getDescription", "<init>", "(Ljava/lang/String;III)V", "Companion", "a", "SUCCESS", "FILE_PRE_SIGN_ERROR", "FILE_UPLOAD_OCS_ERROR", "UNKNOWN_ERROR", "FILE_CLASSIFY_ERROR", "FILE_READ_ERROR", "FILE_TYPE_ERROR", "FILE_SIZE_ERROR", "FILE_NOT_EXIST", "ASYNC_STRUCT_ERROR", "ASYNC_NETWORK_ERROR", "USER_CANCEL_ERROR", "NET_TIMEOUT_ERROR", "FILE_DUPLICATE", "FILE_NAME_ERROR", "FILE_BIZ_TYPE_NOT_EXIST", "FILE_EXTENSION_ERROR", "FILE_ENCRYPT_KEY_NOT_EXIST", "FILE_DUPLICATE_BY_MD5", "HEALTH_DOCUMENT_NOT_EXIST", "ALGO_DOCSTRUCT_RESULT_NULL", "FILE_OCR_RESP_NULL", "FILE_IS_NOT_HEALTH_DOC", "ALGO_SYNCTABLE_RESULT_NULL", "COMMIT_FILE_NOT_FOUND", "FILE_DUPLICATE_RETRY", "COMMIT_FILE_IS_EMPTY", "QUALITY_CONTROL_FAIL", "SHARE_DATA_NOT_EXIST", "SHARE_TIMES_OVER_LIMIT", "QUALITY_CTRL_MUTIL_BACKGROUND", "QUALITY_CTRL_HANDWRITTEN_REPORT", "AUDIT_IMAGE_ILLEGAL", "AUDIT_FILE_ILLEGAL", "HEALTH_DOC_MAX_LIMIT", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class HealthBusinessCode {
    private static final /* synthetic */ HealthBusinessCode[] $VALUES;
    public static final HealthBusinessCode AUDIT_FILE_ILLEGAL;
    public static final HealthBusinessCode AUDIT_IMAGE_ILLEGAL;
    public static final HealthBusinessCode COMMIT_FILE_IS_EMPTY;
    public static final HealthBusinessCode COMMIT_FILE_NOT_FOUND;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final HealthBusinessCode FILE_DUPLICATE_RETRY;
    public static final HealthBusinessCode HEALTH_DOC_MAX_LIMIT;
    public static final HealthBusinessCode QUALITY_CONTROL_FAIL;
    public static final HealthBusinessCode QUALITY_CTRL_HANDWRITTEN_REPORT;
    public static final HealthBusinessCode QUALITY_CTRL_MUTIL_BACKGROUND;
    public static final HealthBusinessCode SHARE_DATA_NOT_EXIST;
    public static final HealthBusinessCode SHARE_TIMES_OVER_LIMIT;
    private final int code;
    private final int description;
    public static final HealthBusinessCode SUCCESS = new HealthBusinessCode("SUCCESS", 0, 0, R$string.health_archives_success);
    public static final HealthBusinessCode FILE_PRE_SIGN_ERROR = new HealthBusinessCode("FILE_PRE_SIGN_ERROR", 1, 10000, R$string.health_archives_file_pre_sign_error);
    public static final HealthBusinessCode FILE_UPLOAD_OCS_ERROR = new HealthBusinessCode("FILE_UPLOAD_OCS_ERROR", 2, 10001, R$string.health_archives_file_upload_ocs_error);
    public static final HealthBusinessCode UNKNOWN_ERROR = new HealthBusinessCode("UNKNOWN_ERROR", 3, 10002, R$string.health_archives_file_unknow_error);
    public static final HealthBusinessCode FILE_CLASSIFY_ERROR = new HealthBusinessCode("FILE_CLASSIFY_ERROR", 4, 1003, R$string.health_archives_file_classify_error);
    public static final HealthBusinessCode FILE_READ_ERROR = new HealthBusinessCode("FILE_READ_ERROR", 5, 1004, R$string.health_archives_file_read_error);
    public static final HealthBusinessCode FILE_TYPE_ERROR = new HealthBusinessCode("FILE_TYPE_ERROR", 6, 1005, R$string.health_archives_file_type_error);
    public static final HealthBusinessCode FILE_SIZE_ERROR = new HealthBusinessCode("FILE_SIZE_ERROR", 7, 1006, R$string.health_archives_file_size_error);
    public static final HealthBusinessCode FILE_NOT_EXIST = new HealthBusinessCode("FILE_NOT_EXIST", 8, 1007, R$string.health_archives_file_not_exist);
    public static final HealthBusinessCode ASYNC_STRUCT_ERROR = new HealthBusinessCode("ASYNC_STRUCT_ERROR", 9, 1008, R$string.health_archives_async_struct_error);
    public static final HealthBusinessCode ASYNC_NETWORK_ERROR = new HealthBusinessCode("ASYNC_NETWORK_ERROR", 10, 1009, R$string.health_archives_async_network_error);
    public static final HealthBusinessCode USER_CANCEL_ERROR = new HealthBusinessCode("USER_CANCEL_ERROR", 11, 1010, R$string.health_archives_cancel_upload_pdf);
    public static final HealthBusinessCode NET_TIMEOUT_ERROR = new HealthBusinessCode("NET_TIMEOUT_ERROR", 12, 1011, R$string.health_archives_net_timeout_error);
    public static final HealthBusinessCode FILE_DUPLICATE = new HealthBusinessCode("FILE_DUPLICATE", 13, 23500, R$string.health_archives_file_duplicate_error);
    public static final HealthBusinessCode FILE_NAME_ERROR = new HealthBusinessCode("FILE_NAME_ERROR", 14, 23501, R$string.health_archives_file_name_error);
    public static final HealthBusinessCode FILE_BIZ_TYPE_NOT_EXIST = new HealthBusinessCode("FILE_BIZ_TYPE_NOT_EXIST", 15, 23502, R$string.health_archives_file_type_not_exist_error);
    public static final HealthBusinessCode FILE_EXTENSION_ERROR = new HealthBusinessCode("FILE_EXTENSION_ERROR", 16, 23503, R$string.health_archives_file_extension_error);
    public static final HealthBusinessCode FILE_ENCRYPT_KEY_NOT_EXIST = new HealthBusinessCode("FILE_ENCRYPT_KEY_NOT_EXIST", 17, 23504, R$string.health_archives_file_encrypt_key_not_exist);
    public static final HealthBusinessCode FILE_DUPLICATE_BY_MD5 = new HealthBusinessCode("FILE_DUPLICATE_BY_MD5", 18, 23505, R$string.health_archives_file_duplicate_by_md5);
    public static final HealthBusinessCode HEALTH_DOCUMENT_NOT_EXIST = new HealthBusinessCode("HEALTH_DOCUMENT_NOT_EXIST", 19, 25000, R$string.health_archives_document_not_exist);
    public static final HealthBusinessCode ALGO_DOCSTRUCT_RESULT_NULL = new HealthBusinessCode("ALGO_DOCSTRUCT_RESULT_NULL", 20, SpeechErrorCode.ERROR_AUDIO_DECODE_OPUS_HEAD_SIZE, R$string.health_archives_algo_docstruct_empty);
    public static final HealthBusinessCode FILE_OCR_RESP_NULL = new HealthBusinessCode("FILE_OCR_RESP_NULL", 21, SpeechErrorCode.ERROR_AUDIO_DECODE_OPUS_BODY_SIZE, R$string.health_archives_ocr_resp_empty);
    public static final HealthBusinessCode FILE_IS_NOT_HEALTH_DOC = new HealthBusinessCode("FILE_IS_NOT_HEALTH_DOC", 22, 25003, R$string.health_archives_upload_error_invalid_img);
    public static final HealthBusinessCode ALGO_SYNCTABLE_RESULT_NULL = new HealthBusinessCode("ALGO_SYNCTABLE_RESULT_NULL", 23, 25005, R$string.health_archives_algo_synctable_empty);

    /* JADX INFO: renamed from: com.heytap.health.health_archives.bean.HealthBusinessCode$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/heytap/health/health_archives/bean/HealthBusinessCode$a;", "", "", "code", "", "a", "<init>", "()V", "health_archives_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nHealthBusinessCode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthBusinessCode.kt\ncom/heytap/health/health_archives/bean/HealthBusinessCode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,69:1\n1#2:70\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:14:0x001e  */
        /* JADX WARN: Code duplicated, block: B:18:? A[RETURN, SYNTHETIC] */
        @Nullable
        public final String a(int code) {
            for (HealthBusinessCode healthBusinessCode : HealthBusinessCode.values()) {
                if (healthBusinessCode.getCode() == code) {
                    if (healthBusinessCode != null) {
                        return qtf.l(healthBusinessCode.getDescription());
                    }
                    return null;
                }
            }
            healthBusinessCode = null;
            if (healthBusinessCode != null) {
                return qtf.l(healthBusinessCode.getDescription());
            }
            return null;
        }
    }

    private static final /* synthetic */ HealthBusinessCode[] $values() {
        return new HealthBusinessCode[]{SUCCESS, FILE_PRE_SIGN_ERROR, FILE_UPLOAD_OCS_ERROR, UNKNOWN_ERROR, FILE_CLASSIFY_ERROR, FILE_READ_ERROR, FILE_TYPE_ERROR, FILE_SIZE_ERROR, FILE_NOT_EXIST, ASYNC_STRUCT_ERROR, ASYNC_NETWORK_ERROR, USER_CANCEL_ERROR, NET_TIMEOUT_ERROR, FILE_DUPLICATE, FILE_NAME_ERROR, FILE_BIZ_TYPE_NOT_EXIST, FILE_EXTENSION_ERROR, FILE_ENCRYPT_KEY_NOT_EXIST, FILE_DUPLICATE_BY_MD5, HEALTH_DOCUMENT_NOT_EXIST, ALGO_DOCSTRUCT_RESULT_NULL, FILE_OCR_RESP_NULL, FILE_IS_NOT_HEALTH_DOC, ALGO_SYNCTABLE_RESULT_NULL, COMMIT_FILE_NOT_FOUND, FILE_DUPLICATE_RETRY, COMMIT_FILE_IS_EMPTY, QUALITY_CONTROL_FAIL, SHARE_DATA_NOT_EXIST, SHARE_TIMES_OVER_LIMIT, QUALITY_CTRL_MUTIL_BACKGROUND, QUALITY_CTRL_HANDWRITTEN_REPORT, AUDIT_IMAGE_ILLEGAL, AUDIT_FILE_ILLEGAL, HEALTH_DOC_MAX_LIMIT};
    }

    static {
        int i = R$string.health_archives_commit_file_empty;
        COMMIT_FILE_NOT_FOUND = new HealthBusinessCode("COMMIT_FILE_NOT_FOUND", 24, 25006, i);
        FILE_DUPLICATE_RETRY = new HealthBusinessCode("FILE_DUPLICATE_RETRY", 25, 25008, R$string.health_archives_file_duplicate_retry);
        COMMIT_FILE_IS_EMPTY = new HealthBusinessCode("COMMIT_FILE_IS_EMPTY", 26, 25009, i);
        QUALITY_CONTROL_FAIL = new HealthBusinessCode("QUALITY_CONTROL_FAIL", 27, 25010, R$string.health_archives_quality_control_fail);
        SHARE_DATA_NOT_EXIST = new HealthBusinessCode("SHARE_DATA_NOT_EXIST", 28, 25011, R$string.health_archives_share_data_not_exist);
        SHARE_TIMES_OVER_LIMIT = new HealthBusinessCode("SHARE_TIMES_OVER_LIMIT", 29, 25017, R$string.health_archives_share_over_limit);
        QUALITY_CTRL_MUTIL_BACKGROUND = new HealthBusinessCode("QUALITY_CTRL_MUTIL_BACKGROUND", 30, 25013, R$string.health_archives_quality_multi_background);
        QUALITY_CTRL_HANDWRITTEN_REPORT = new HealthBusinessCode("QUALITY_CTRL_HANDWRITTEN_REPORT", 31, 25014, R$string.health_archives_quality_handwritten_report);
        AUDIT_IMAGE_ILLEGAL = new HealthBusinessCode("AUDIT_IMAGE_ILLEGAL", 32, 25019, R$string.health_archives_quality_image_illegal);
        AUDIT_FILE_ILLEGAL = new HealthBusinessCode("AUDIT_FILE_ILLEGAL", 33, 25020, R$string.health_archives_quality_fill_illegal);
        HEALTH_DOC_MAX_LIMIT = new HealthBusinessCode("HEALTH_DOC_MAX_LIMIT", 34, 25026, R$string.health_archives_archives_over_limit);
        $VALUES = $values();
        INSTANCE = new Companion(null);
    }

    private HealthBusinessCode(String str, int i, int i2, int i3) {
        super(str, i);
        this.code = i2;
        this.description = i3;
    }

    public static HealthBusinessCode valueOf(String str) {
        return (HealthBusinessCode) Enum.valueOf(HealthBusinessCode.class, str);
    }

    public static HealthBusinessCode[] values() {
        return (HealthBusinessCode[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }

    public final int getDescription() {
        return this.description;
    }
}
