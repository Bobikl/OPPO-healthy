package com.oplus.aiunit.vision;

import com.heytap.speech.engine.process.OperationStatus;
import com.heytap.speech.engine.protocol.directive.Directive;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\rH&J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH&J \u0010\u0014\u001a\u00020\u00052\u0016\u0010\u0013\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0018\u00010\u0012H&¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/tmd;", "", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "directive", "", "setDirective", "Lcom/heytap/speech/engine/process/OperationStatus;", "status", "setStatus", "getStatus", "process", "cancel", "", "isCancelled", "", "data", "setOrigin", "", "directives", "setDirectiveGroup", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public interface tmd {
    void cancel();

    @NotNull
    OperationStatus getStatus();

    boolean isCancelled();

    void process();

    void setDirective(@NotNull Directive<? extends DirectivePayload> directive);

    void setDirectiveGroup(@Nullable List<? extends Directive<? extends DirectivePayload>> directives);

    void setOrigin(@Nullable String data);

    void setStatus(@NotNull OperationStatus status);
}
