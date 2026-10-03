package com.heytap.speech.engine.protocol.event.payload.nlp;

import androidx.annotation.Keep;
import com.heytap.accessory.file.model.Constant;
import com.heytap.connect.config.connectid.ConnectIdLogic;
import com.heytap.databaseengineservice.db.table.healtharchives.DBHealthReviewPlan;
import com.heytap.speech.engine.protocol.event.ForceNewDialogPayload;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 M2\u00020\u0001:\u0004NOPQB\u0007¢\u0006\u0004\bK\u0010LR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR$\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR$\u0010\"\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010(\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R$\u0010+\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0004\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\bR0\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020/\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u00106\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0004\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR$\u00109\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0004\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR$\u0010=\u001a\u0004\u0018\u00010<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR*\u0010E\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006R"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/nlp/DocEventPayload;", "Lcom/heytap/speech/engine/protocol/event/ForceNewDialogPayload;", "", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "docRecordId", "getDocRecordId", "setDocRecordId", "originalName", "getOriginalName", "setOriginalName", ConnectIdLogic.PARAM_EXT, "getExt", "setExt", "", Constant.FILE_SIZE, "I", "getFileSize", "()I", "setFileSize", "(I)V", "objectName", "getObjectName", "setObjectName", "roomId", "getRoomId", "setRoomId", "agentName", "getAgentName", "setAgentName", "status", "Ljava/lang/Integer;", "getStatus", "()Ljava/lang/Integer;", "setStatus", "(Ljava/lang/Integer;)V", "sourceFrom", "getSourceFrom", "setSourceFrom", "topApp", "getTopApp", "setTopApp", "", "", "extend", "Ljava/util/Map;", "getExtend", "()Ljava/util/Map;", "setExtend", "(Ljava/util/Map;)V", "scope", "getScope", "setScope", "type", "getType", "setType", "Lcom/heytap/speech/engine/protocol/event/payload/nlp/DocEventPayload$AuditResult;", "auditResult", "Lcom/heytap/speech/engine/protocol/event/payload/nlp/DocEventPayload$AuditResult;", "getAuditResult", "()Lcom/heytap/speech/engine/protocol/event/payload/nlp/DocEventPayload$AuditResult;", "setAuditResult", "(Lcom/heytap/speech/engine/protocol/event/payload/nlp/DocEventPayload$AuditResult;)V", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/event/payload/nlp/DocEventPayload$ImagePreProcessResult;", "imagePreProcessResult", "Ljava/util/ArrayList;", "getImagePreProcessResult", "()Ljava/util/ArrayList;", "setImagePreProcessResult", "(Ljava/util/ArrayList;)V", "<init>", "()V", "Companion", "AuditDetail", "AuditResult", "a", "ImagePreProcessResult", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class DocEventPayload extends ForceNewDialogPayload {
    private static final int SOURCE_FROM_SCREEN = 0;
    private static final int UPLOAD_STATUS_FAIL = 0;

    @Nullable
    private String agentName;

    @Nullable
    private AuditResult auditResult;

    @Nullable
    private String docRecordId;

    @Nullable
    private String ext;

    @Nullable
    private Map<String, ? extends Object> extend;
    private int fileSize;

    @Nullable
    private ArrayList<ImagePreProcessResult> imagePreProcessResult;

    @Nullable
    private String objectName;

    @Nullable
    private String originalName;

    @Nullable
    private String roomId;

    @Nullable
    private String scope;

    @Nullable
    private Integer sourceFrom;

    @Nullable
    private Integer status;

    @Nullable
    private String topApp;

    @Nullable
    private String type;

    @Nullable
    private String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String VERSION = "2.2";
    private static final int UPLOAD_STATUS_SUCCESS = 1;
    private static final int SOURCE_FROM_UPLOAD = 1;

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/nlp/DocEventPayload$AuditDetail;", "", "()V", DBHealthReviewPlan.DESC, "", "getDesc", "()Ljava/lang/String;", "setDesc", "(Ljava/lang/String;)V", "state", "", "getState", "()Ljava/lang/Integer;", "setState", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "type", "getType", "setType", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AuditDetail {

        @Nullable
        private String desc;

        @Nullable
        private Integer state;

        @Nullable
        private Integer type;

        @Nullable
        public final String getDesc() {
            return this.desc;
        }

        @Nullable
        public final Integer getState() {
            return this.state;
        }

        @Nullable
        public final Integer getType() {
            return this.type;
        }

        public final void setDesc(@Nullable String str) {
            this.desc = str;
        }

        public final void setState(@Nullable Integer num) {
            this.state = num;
        }

        public final void setType(@Nullable Integer num) {
            this.type = num;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/nlp/DocEventPayload$AuditResult;", "", "()V", "auditDetail", "Lcom/heytap/speech/engine/protocol/event/payload/nlp/DocEventPayload$AuditDetail;", "getAuditDetail", "()Lcom/heytap/speech/engine/protocol/event/payload/nlp/DocEventPayload$AuditDetail;", "setAuditDetail", "(Lcom/heytap/speech/engine/protocol/event/payload/nlp/DocEventPayload$AuditDetail;)V", "auditState", "", "getAuditState", "()Ljava/lang/Integer;", "setAuditState", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AuditResult {

        @Nullable
        private AuditDetail auditDetail;

        @Nullable
        private Integer auditState;

        @Nullable
        public final AuditDetail getAuditDetail() {
            return this.auditDetail;
        }

        @Nullable
        public final Integer getAuditState() {
            return this.auditState;
        }

        public final void setAuditDetail(@Nullable AuditDetail auditDetail) {
            this.auditDetail = auditDetail;
        }

        public final void setAuditState(@Nullable Integer num) {
            this.auditState = num;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/nlp/DocEventPayload$ImagePreProcessResult;", "", "()V", "completed", "", "getCompleted", "()Ljava/lang/Boolean;", "setCompleted", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "resizeName", "", "getResizeName", "()Ljava/lang/String;", "setResizeName", "(Ljava/lang/String;)V", "resizeParam", "Ljava/util/HashMap;", "getResizeParam", "()Ljava/util/HashMap;", "setResizeParam", "(Ljava/util/HashMap;)V", "url", "getUrl", "setUrl", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ImagePreProcessResult {

        @Nullable
        private Boolean completed;

        @Nullable
        private String resizeName;

        @Nullable
        private HashMap<String, Object> resizeParam;

        @Nullable
        private String url;

        @Nullable
        public final Boolean getCompleted() {
            return this.completed;
        }

        @Nullable
        public final String getResizeName() {
            return this.resizeName;
        }

        @Nullable
        public final HashMap<String, Object> getResizeParam() {
            return this.resizeParam;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        public final void setCompleted(@Nullable Boolean bool) {
            this.completed = bool;
        }

        public final void setResizeName(@Nullable String str) {
            this.resizeName = str;
        }

        public final void setResizeParam(@Nullable HashMap<String, Object> map) {
            this.resizeParam = map;
        }

        public final void setUrl(@Nullable String str) {
            this.url = str;
        }
    }

    /* JADX INFO: renamed from: com.heytap.speech.engine.protocol.event.payload.nlp.DocEventPayload$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/protocol/event/payload/nlp/DocEventPayload$a;", "", "", "VERSION", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "protocol_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String a() {
            return DocEventPayload.VERSION;
        }
    }

    @Nullable
    public final String getAgentName() {
        return this.agentName;
    }

    @Nullable
    public final AuditResult getAuditResult() {
        return this.auditResult;
    }

    @Nullable
    public final String getDocRecordId() {
        return this.docRecordId;
    }

    @Nullable
    public final String getExt() {
        return this.ext;
    }

    @Nullable
    public final Map<String, Object> getExtend() {
        return this.extend;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    @Nullable
    public final ArrayList<ImagePreProcessResult> getImagePreProcessResult() {
        return this.imagePreProcessResult;
    }

    @Nullable
    public final String getObjectName() {
        return this.objectName;
    }

    @Nullable
    public final String getOriginalName() {
        return this.originalName;
    }

    @Nullable
    public final String getRoomId() {
        return this.roomId;
    }

    @Nullable
    public final String getScope() {
        return this.scope;
    }

    @Nullable
    public final Integer getSourceFrom() {
        return this.sourceFrom;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTopApp() {
        return this.topApp;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final void setAgentName(@Nullable String str) {
        this.agentName = str;
    }

    public final void setAuditResult(@Nullable AuditResult auditResult) {
        this.auditResult = auditResult;
    }

    public final void setDocRecordId(@Nullable String str) {
        this.docRecordId = str;
    }

    public final void setExt(@Nullable String str) {
        this.ext = str;
    }

    public final void setExtend(@Nullable Map<String, ? extends Object> map) {
        this.extend = map;
    }

    public final void setFileSize(int i) {
        this.fileSize = i;
    }

    public final void setImagePreProcessResult(@Nullable ArrayList<ImagePreProcessResult> arrayList) {
        this.imagePreProcessResult = arrayList;
    }

    public final void setObjectName(@Nullable String str) {
        this.objectName = str;
    }

    public final void setOriginalName(@Nullable String str) {
        this.originalName = str;
    }

    public final void setRoomId(@Nullable String str) {
        this.roomId = str;
    }

    public final void setScope(@Nullable String str) {
        this.scope = str;
    }

    public final void setSourceFrom(@Nullable Integer num) {
        this.sourceFrom = num;
    }

    public final void setStatus(@Nullable Integer num) {
        this.status = num;
    }

    public final void setTopApp(@Nullable String str) {
        this.topApp = str;
    }

    public final void setType(@Nullable String str) {
        this.type = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}
