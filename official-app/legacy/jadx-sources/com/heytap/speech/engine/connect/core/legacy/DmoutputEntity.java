package com.heytap.speech.engine.connect.core.legacy;

import androidx.annotation.Keep;
import com.heytap.speech.engine.constant.EngineConstant;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.platform.usercenter.bizuws.executor.dialog.ShowDialogExecutor;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0004!\"#$B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity;", "", "()V", "conditional", "Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputConditionalBean;", "getConditional", "()Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputConditionalBean;", "setConditional", "(Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputConditionalBean;)V", SpeechConstant.KEY_TTS_REQUEST_HEADER, "Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputHeaderBean;", "getHeader", "()Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputHeaderBean;", "setHeader", "(Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputHeaderBean;)V", "originData", "", "getOriginData", "()Ljava/lang/String;", "setOriginData", "(Ljava/lang/String;)V", "payload", "Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputPayloadBean;", "getPayload", "()Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputPayloadBean;", "setPayload", "(Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputPayloadBean;)V", "speak", "Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputSpeakBean;", "getSpeak", "()Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputSpeakBean;", "setSpeak", "(Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputSpeakBean;)V", "DmoutputConditionalBean", "DmoutputHeaderBean", "DmoutputPayloadBean", "DmoutputSpeakBean", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class DmoutputEntity {

    @Nullable
    private DmoutputConditionalBean conditional;

    @Nullable
    private DmoutputHeaderBean header;

    @Nullable
    private String originData;

    @Nullable
    private DmoutputPayloadBean payload;

    @Nullable
    private DmoutputSpeakBean speak;

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputConditionalBean;", "", "()V", "condition", "Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputConditionalBean$DmoutputConditionBean;", "getCondition", "()Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputConditionalBean$DmoutputConditionBean;", "setCondition", "(Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputConditionalBean$DmoutputConditionBean;)V", "directive", "Lcom/heytap/speech/engine/connect/core/legacy/DirectiveBean;", "getDirective", "()Lcom/heytap/speech/engine/connect/core/legacy/DirectiveBean;", "setDirective", "(Lcom/heytap/speech/engine/connect/core/legacy/DirectiveBean;)V", "DmoutputConditionBean", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DmoutputConditionalBean {

        @Nullable
        private DmoutputConditionBean condition;

        @Nullable
        private DirectiveBean directive;

        @Keep
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputConditionalBean$DmoutputConditionBean;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class DmoutputConditionBean {

            @Nullable
            private String name;

            @Nullable
            public final String getName() {
                return this.name;
            }

            public final void setName(@Nullable String str) {
                this.name = str;
            }
        }

        @Nullable
        public final DmoutputConditionBean getCondition() {
            return this.condition;
        }

        @Nullable
        public final DirectiveBean getDirective() {
            return this.directive;
        }

        public final void setCondition(@Nullable DmoutputConditionBean dmoutputConditionBean) {
            this.condition = dmoutputConditionBean;
        }

        public final void setDirective(@Nullable DirectiveBean directiveBean) {
            this.directive = directiveBean;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\b¨\u0006$"}, d2 = {"Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputHeaderBean;", "", "()V", SpeechConstant.KEY_CONTEXT_ID, "", "getContextId", "()Ljava/lang/String;", "setContextId", "(Ljava/lang/String;)V", ShowDialogExecutor.JSON_DIALOG_ID_KEY, "getDialogId", "setDialogId", "intent", "getIntent", "setIntent", SpeechConstant.KEY_RECORD_ID, "getRecordId", "setRecordId", "sessionId", "getSessionId", "setSessionId", "skill", "getSkill", "setSkill", "skillId", "", "getSkillId", "()I", "setSkillId", "(I)V", "topic", "getTopic", "setTopic", "userTimbreId", "getUserTimbreId", "setUserTimbreId", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DmoutputHeaderBean {

        @Nullable
        private String contextId;

        @Nullable
        private String dialogId;

        @Nullable
        private String intent;

        @Nullable
        private String recordId;

        @Nullable
        private String sessionId;

        @Nullable
        private String skill;
        private int skillId;

        @Nullable
        private String topic;

        @Nullable
        private String userTimbreId;

        @Nullable
        public final String getContextId() {
            return this.contextId;
        }

        @Nullable
        public final String getDialogId() {
            return this.dialogId;
        }

        @Nullable
        public final String getIntent() {
            return this.intent;
        }

        @Nullable
        public final String getRecordId() {
            return this.recordId;
        }

        @Nullable
        public final String getSessionId() {
            return this.sessionId;
        }

        @Nullable
        public final String getSkill() {
            return this.skill;
        }

        public final int getSkillId() {
            return this.skillId;
        }

        @Nullable
        public final String getTopic() {
            return this.topic;
        }

        @Nullable
        public final String getUserTimbreId() {
            return this.userTimbreId;
        }

        public final void setContextId(@Nullable String str) {
            this.contextId = str;
        }

        public final void setDialogId(@Nullable String str) {
            this.dialogId = str;
        }

        public final void setIntent(@Nullable String str) {
            this.intent = str;
        }

        public final void setRecordId(@Nullable String str) {
            this.recordId = str;
        }

        public final void setSessionId(@Nullable String str) {
            this.sessionId = str;
        }

        public final void setSkill(@Nullable String str) {
            this.skill = str;
        }

        public final void setSkillId(int i) {
            this.skillId = i;
        }

        public final void setTopic(@Nullable String str) {
            this.topic = str;
        }

        public final void setUserTimbreId(@Nullable String str) {
            this.userTimbreId = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputPayloadBean;", "", "()V", "dataFrom", "", "getDataFrom", "()Ljava/lang/String;", "setDataFrom", "(Ljava/lang/String;)V", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DmoutputPayloadBean {

        @Nullable
        private String dataFrom;

        @Nullable
        public final String getDataFrom() {
            return this.dataFrom;
        }

        public final void setDataFrom(@Nullable String str) {
            this.dataFrom = str;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b¨\u0006'"}, d2 = {"Lcom/heytap/speech/engine/connect/core/legacy/DmoutputEntity$DmoutputSpeakBean;", "", "()V", "audioUrl", "", "getAudioUrl", "()Ljava/lang/String;", "setAudioUrl", "(Ljava/lang/String;)V", "emotion", "getEmotion", "setEmotion", "handleBySelf", "", "getHandleBySelf", "()Z", "setHandleBySelf", "(Z)V", "micAct", "getMicAct", "setMicAct", EngineConstant.TTS_TYPE_SSML, "getSsml", "setSsml", "streamId", "getStreamId", "setStreamId", "text", "getText", ClickApiEntity.SET_TEXT, EngineConstant.TTS_TIMBRE, "getTimbre", "setTimbre", "ttsLanguage", "getTtsLanguage", "setTtsLanguage", "type", "getType", "setType", "speechEngine_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class DmoutputSpeakBean {

        @Nullable
        private String audioUrl;

        @Nullable
        private String emotion;
        private boolean handleBySelf;

        @Nullable
        private String micAct;

        @Nullable
        private String ssml;

        @Nullable
        private String streamId;

        @Nullable
        private String text;

        @Nullable
        private String timbre;

        @Nullable
        private String ttsLanguage;

        @Nullable
        private String type;

        @Nullable
        public final String getAudioUrl() {
            return this.audioUrl;
        }

        @Nullable
        public final String getEmotion() {
            return this.emotion;
        }

        public final boolean getHandleBySelf() {
            return this.handleBySelf;
        }

        @Nullable
        public final String getMicAct() {
            return this.micAct;
        }

        @Nullable
        public final String getSsml() {
            return this.ssml;
        }

        @Nullable
        public final String getStreamId() {
            return this.streamId;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        @Nullable
        public final String getTimbre() {
            return this.timbre;
        }

        @Nullable
        public final String getTtsLanguage() {
            return this.ttsLanguage;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public final void setAudioUrl(@Nullable String str) {
            this.audioUrl = str;
        }

        public final void setEmotion(@Nullable String str) {
            this.emotion = str;
        }

        public final void setHandleBySelf(boolean z) {
            this.handleBySelf = z;
        }

        public final void setMicAct(@Nullable String str) {
            this.micAct = str;
        }

        public final void setSsml(@Nullable String str) {
            this.ssml = str;
        }

        public final void setStreamId(@Nullable String str) {
            this.streamId = str;
        }

        public final void setText(@Nullable String str) {
            this.text = str;
        }

        public final void setTimbre(@Nullable String str) {
            this.timbre = str;
        }

        public final void setTtsLanguage(@Nullable String str) {
            this.ttsLanguage = str;
        }

        public final void setType(@Nullable String str) {
            this.type = str;
        }
    }

    @Nullable
    public final DmoutputConditionalBean getConditional() {
        return this.conditional;
    }

    @Nullable
    public final DmoutputHeaderBean getHeader() {
        return this.header;
    }

    @Nullable
    public final String getOriginData() {
        return this.originData;
    }

    @Nullable
    public final DmoutputPayloadBean getPayload() {
        return this.payload;
    }

    @Nullable
    public final DmoutputSpeakBean getSpeak() {
        return this.speak;
    }

    public final void setConditional(@Nullable DmoutputConditionalBean dmoutputConditionalBean) {
        this.conditional = dmoutputConditionalBean;
    }

    public final void setHeader(@Nullable DmoutputHeaderBean dmoutputHeaderBean) {
        this.header = dmoutputHeaderBean;
    }

    public final void setOriginData(@Nullable String str) {
        this.originData = str;
    }

    public final void setPayload(@Nullable DmoutputPayloadBean dmoutputPayloadBean) {
        this.payload = dmoutputPayloadBean;
    }

    public final void setSpeak(@Nullable DmoutputSpeakBean dmoutputSpeakBean) {
        this.speak = dmoutputSpeakBean;
    }
}
