package com.oplus.aiunit.vision;

import com.heytap.speech.engine.protocol.directive.Directive;
import com.heytap.speech.engine.protocol.directive.DirectiveHeader;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/bnd;", "", "Lcom/heytap/speech/engine/protocol/directive/Directive;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "directive", "", "a", "<init>", "()V", "speechEngine_release"}, k = 1, mv = {1, 5, 1})
public final class bnd {

    @NotNull
    public static final bnd INSTANCE = new bnd();

    @Nullable
    public final String a(@Nullable Directive<? extends DirectivePayload> directive) {
        DirectiveHeader header;
        DirectiveHeader header2;
        StringBuilder sb = new StringBuilder();
        String name = null;
        sb.append((Object) ((directive == null || (header = directive.getHeader()) == null) ? null : header.getNamespace()));
        sb.append('.');
        if (directive != null && (header2 = directive.getHeader()) != null) {
            name = header2.getName();
        }
        sb.append((Object) name);
        return sb.toString();
    }
}
