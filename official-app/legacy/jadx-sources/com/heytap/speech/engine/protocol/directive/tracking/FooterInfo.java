package com.heytap.speech.engine.protocol.directive.tracking;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\b¨\u00062"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/tracking/FooterInfo;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "copyFlag", "", "getCopyFlag", "()Ljava/lang/Boolean;", "setCopyFlag", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "copyInfo", "Lcom/heytap/speech/engine/protocol/directive/tracking/CopyInfo;", "getCopyInfo", "()Lcom/heytap/speech/engine/protocol/directive/tracking/CopyInfo;", "setCopyInfo", "(Lcom/heytap/speech/engine/protocol/directive/tracking/CopyInfo;)V", "extraActions", "Lcom/heytap/speech/engine/protocol/directive/tracking/ExtraActions;", "getExtraActions", "()Lcom/heytap/speech/engine/protocol/directive/tracking/ExtraActions;", "setExtraActions", "(Lcom/heytap/speech/engine/protocol/directive/tracking/ExtraActions;)V", "noteInfo", "Lcom/heytap/speech/engine/protocol/directive/tracking/NoteInfo;", "getNoteInfo", "()Lcom/heytap/speech/engine/protocol/directive/tracking/NoteInfo;", "setNoteInfo", "(Lcom/heytap/speech/engine/protocol/directive/tracking/NoteInfo;)V", "preferenceAction", "Lcom/heytap/speech/engine/protocol/directive/tracking/PreferenceAction;", "getPreferenceAction", "()Lcom/heytap/speech/engine/protocol/directive/tracking/PreferenceAction;", "setPreferenceAction", "(Lcom/heytap/speech/engine/protocol/directive/tracking/PreferenceAction;)V", "regenerate", "Lcom/heytap/speech/engine/protocol/directive/tracking/Regenerate;", "getRegenerate", "()Lcom/heytap/speech/engine/protocol/directive/tracking/Regenerate;", "setRegenerate", "(Lcom/heytap/speech/engine/protocol/directive/tracking/Regenerate;)V", "shareInfos", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/tracking/ShareInfo;", "getShareInfos", "()Ljava/util/ArrayList;", "setShareInfos", "(Ljava/util/ArrayList;)V", "upvoteFlag", "getUpvoteFlag", "setUpvoteFlag", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class FooterInfo extends DirectivePayload {

    @Nullable
    private Boolean copyFlag;

    @Nullable
    private CopyInfo copyInfo;

    @Nullable
    private ExtraActions extraActions;

    @Nullable
    private NoteInfo noteInfo;

    @Nullable
    private PreferenceAction preferenceAction;

    @Nullable
    private Regenerate regenerate;

    @Nullable
    private ArrayList<ShareInfo> shareInfos;

    @Nullable
    private Boolean upvoteFlag;

    @Nullable
    public final Boolean getCopyFlag() {
        return this.copyFlag;
    }

    @Nullable
    public final CopyInfo getCopyInfo() {
        return this.copyInfo;
    }

    @Nullable
    public final ExtraActions getExtraActions() {
        return this.extraActions;
    }

    @Nullable
    public final NoteInfo getNoteInfo() {
        return this.noteInfo;
    }

    @Nullable
    public final PreferenceAction getPreferenceAction() {
        return this.preferenceAction;
    }

    @Nullable
    public final Regenerate getRegenerate() {
        return this.regenerate;
    }

    @Nullable
    public final ArrayList<ShareInfo> getShareInfos() {
        return this.shareInfos;
    }

    @Nullable
    public final Boolean getUpvoteFlag() {
        return this.upvoteFlag;
    }

    public final void setCopyFlag(@Nullable Boolean bool) {
        this.copyFlag = bool;
    }

    public final void setCopyInfo(@Nullable CopyInfo copyInfo) {
        this.copyInfo = copyInfo;
    }

    public final void setExtraActions(@Nullable ExtraActions extraActions) {
        this.extraActions = extraActions;
    }

    public final void setNoteInfo(@Nullable NoteInfo noteInfo) {
        this.noteInfo = noteInfo;
    }

    public final void setPreferenceAction(@Nullable PreferenceAction preferenceAction) {
        this.preferenceAction = preferenceAction;
    }

    public final void setRegenerate(@Nullable Regenerate regenerate) {
        this.regenerate = regenerate;
    }

    public final void setShareInfos(@Nullable ArrayList<ShareInfo> arrayList) {
        this.shareInfos = arrayList;
    }

    public final void setUpvoteFlag(@Nullable Boolean bool) {
        this.upvoteFlag = bool;
    }
}
