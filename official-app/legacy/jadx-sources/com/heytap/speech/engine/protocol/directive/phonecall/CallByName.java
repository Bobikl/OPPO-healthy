package com.heytap.speech.engine.protocol.directive.phonecall;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u0000 62\u00020\u0001:\u000278B\u0007¢\u0006\u0004\b4\u00105R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR$\u0010\u001e\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R$\u0010!\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\f\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010+\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\f\u001a\u0004\b,\u0010\u000e\"\u0004\b-\u0010\u0010R$\u0010.\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010&\u001a\u0004\b/\u0010(\"\u0004\b0\u0010*R$\u00101\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0016\u001a\u0004\b2\u0010\u0018\"\u0004\b3\u0010\u001a¨\u00069"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/phonecall/CallByName;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "", "Lcom/heytap/speech/engine/protocol/directive/phonecall/CallByName$CandidateCallers;", "candidateCallers", "Ljava/util/List;", "getCandidateCallers", "()Ljava/util/List;", "setCandidateCallers", "(Ljava/util/List;)V", "", "matchType", "Ljava/lang/String;", "getMatchType", "()Ljava/lang/String;", "setMatchType", "(Ljava/lang/String;)V", "nickName", "getNickName", "setNickName", "", "whichIndex", "Ljava/lang/Integer;", "getWhichIndex", "()Ljava/lang/Integer;", "setWhichIndex", "(Ljava/lang/Integer;)V", "indexType", "getIndexType", "setIndexType", "simIndex", "getSimIndex", "setSimIndex", "soundType", "getSoundType", "setSoundType", "", "userConfirm", "Ljava/lang/Boolean;", "getUserConfirm", "()Ljava/lang/Boolean;", "setUserConfirm", "(Ljava/lang/Boolean;)V", "content", "getContent", "setContent", "needConfirmation", "getNeedConfirmation", "setNeedConfirmation", "shouldUpload", "getShouldUpload", "setShouldUpload", "<init>", "()V", "Companion", "CandidateCallers", "a", "protocol_release"}, k = 1, mv = {1, 5, 1})
public final class CallByName extends DirectivePayload {

    @NotNull
    private static final String VERSION = "2.1";

    @Nullable
    private List<CandidateCallers> candidateCallers;

    @Nullable
    private String content;

    @Nullable
    private Integer indexType;

    @Nullable
    private String matchType;

    @Nullable
    private Boolean needConfirmation;

    @Nullable
    private String nickName;

    @Nullable
    private Integer shouldUpload;

    @Nullable
    private String simIndex;

    @Nullable
    private String soundType;

    @Nullable
    private Boolean userConfirm;

    @Nullable
    private Integer whichIndex;

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/phonecall/CallByName$CandidateCallers;", "Ljava/io/Serializable;", "()V", "contactName", "", "getContactName", "()Ljava/lang/String;", "setContactName", "(Ljava/lang/String;)V", "nickName", "getNickName", "setNickName", "pinyin", "getPinyin", "setPinyin", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class CandidateCallers implements Serializable {

        @Nullable
        private String contactName;

        @Nullable
        private String nickName;

        @Nullable
        private String pinyin;

        @Nullable
        public final String getContactName() {
            return this.contactName;
        }

        @Nullable
        public final String getNickName() {
            return this.nickName;
        }

        @Nullable
        public final String getPinyin() {
            return this.pinyin;
        }

        public final void setContactName(@Nullable String str) {
            this.contactName = str;
        }

        public final void setNickName(@Nullable String str) {
            this.nickName = str;
        }

        public final void setPinyin(@Nullable String str) {
            this.pinyin = str;
        }
    }

    @Nullable
    public final List<CandidateCallers> getCandidateCallers() {
        return this.candidateCallers;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Integer getIndexType() {
        return this.indexType;
    }

    @Nullable
    public final String getMatchType() {
        return this.matchType;
    }

    @Nullable
    public final Boolean getNeedConfirmation() {
        return this.needConfirmation;
    }

    @Nullable
    public final String getNickName() {
        return this.nickName;
    }

    @Nullable
    public final Integer getShouldUpload() {
        return this.shouldUpload;
    }

    @Nullable
    public final String getSimIndex() {
        return this.simIndex;
    }

    @Nullable
    public final String getSoundType() {
        return this.soundType;
    }

    @Nullable
    public final Boolean getUserConfirm() {
        return this.userConfirm;
    }

    @Nullable
    public final Integer getWhichIndex() {
        return this.whichIndex;
    }

    public final void setCandidateCallers(@Nullable List<CandidateCallers> list) {
        this.candidateCallers = list;
    }

    public final void setContent(@Nullable String str) {
        this.content = str;
    }

    public final void setIndexType(@Nullable Integer num) {
        this.indexType = num;
    }

    public final void setMatchType(@Nullable String str) {
        this.matchType = str;
    }

    public final void setNeedConfirmation(@Nullable Boolean bool) {
        this.needConfirmation = bool;
    }

    public final void setNickName(@Nullable String str) {
        this.nickName = str;
    }

    public final void setShouldUpload(@Nullable Integer num) {
        this.shouldUpload = num;
    }

    public final void setSimIndex(@Nullable String str) {
        this.simIndex = str;
    }

    public final void setSoundType(@Nullable String str) {
        this.soundType = str;
    }

    public final void setUserConfirm(@Nullable Boolean bool) {
        this.userConfirm = bool;
    }

    public final void setWhichIndex(@Nullable Integer num) {
        this.whichIndex = num;
    }
}
