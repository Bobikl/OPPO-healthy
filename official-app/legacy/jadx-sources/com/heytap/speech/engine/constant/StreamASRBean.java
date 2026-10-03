package com.heytap.speech.engine.constant;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/heytap/speech/engine/constant/StreamASRBean;", "", "()V", SpeechConstant.KEY_RECORD_ID, "", "getRecordId", "()Ljava/lang/String;", "setRecordId", "(Ljava/lang/String;)V", "sentenceList", "", "Lcom/heytap/speech/engine/constant/StreamASRBean$StreamSentenceBean;", "getSentenceList", "()Ljava/util/List;", "setSentenceList", "(Ljava/util/List;)V", "text", "getText", ClickApiEntity.SET_TEXT, "StreamSentenceBean", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class StreamASRBean {

    @Nullable
    private String recordId;

    @Nullable
    private List<StreamSentenceBean> sentenceList;

    @Nullable
    private String text;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/constant/StreamASRBean$StreamSentenceBean;", "", "()V", "sentence", "", "getSentence", "()Ljava/lang/String;", "setSentence", "(Ljava/lang/String;)V", "seqNo", "", "getSeqNo", "()Ljava/lang/Integer;", "setSeqNo", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class StreamSentenceBean {

        @Nullable
        private String sentence;

        @Nullable
        private Integer seqNo;

        @Nullable
        public final String getSentence() {
            return this.sentence;
        }

        @Nullable
        public final Integer getSeqNo() {
            return this.seqNo;
        }

        public final void setSentence(@Nullable String str) {
            this.sentence = str;
        }

        public final void setSeqNo(@Nullable Integer num) {
            this.seqNo = num;
        }
    }

    @Nullable
    public final String getRecordId() {
        return this.recordId;
    }

    @Nullable
    public final List<StreamSentenceBean> getSentenceList() {
        return this.sentenceList;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public final void setRecordId(@Nullable String str) {
        this.recordId = str;
    }

    public final void setSentenceList(@Nullable List<StreamSentenceBean> list) {
        this.sentenceList = list;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }
}
