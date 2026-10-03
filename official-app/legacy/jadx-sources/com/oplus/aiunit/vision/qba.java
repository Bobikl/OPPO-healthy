package com.oplus.aiunit.vision;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/qba;", "Lcom/oplus/aiunit/vision/hr9;", "Lcom/oplus/aiunit/vision/dzb;", "", "invoke", "value", "b", "clear", "Lcom/oplus/aiunit/vision/qba$a;", "a", "Lcom/oplus/aiunit/vision/qba$a;", "stateChange", "Lcom/oplus/aiunit/vision/dzb;", "<init>", "(Lcom/oplus/aiunit/vision/qba$a;)V", "card-instant_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nInstantCardMessageState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InstantCardMessageState.kt\npantanal/app/instant/internal/InstantCardMessageState\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,49:1\n215#2,2:50\n215#2,2:52\n*S KotlinDebug\n*F\n+ 1 InstantCardMessageState.kt\npantanal/app/instant/internal/InstantCardMessageState\n*L\n24#1:50,2\n27#1:52,2\n*E\n"})
public final class qba implements hr9<MessageSet> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final a stateChange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public MessageSet value;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/qba$a;", "", "", "code", "", "msg", "", "sendMessage", "replyMessage", "card-instant_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void replyMessage(int code, @NotNull String msg);

        void sendMessage(int code, @NotNull String msg);
    }

    public qba(@NotNull a stateChange) {
        Intrinsics.checkNotNullParameter(stateChange, "stateChange");
        this.stateChange = stateChange;
    }

    @Override // com.oplus.aiunit.vision.hr9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(@NotNull MessageSet value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
    }

    @Override // com.oplus.aiunit.vision.hr9
    public void clear() {
        this.value = null;
    }

    @Override // com.oplus.aiunit.vision.hr9
    public void invoke() {
        MessageSet messageSet = this.value;
        if (messageSet != null) {
            for (Map.Entry<Integer, String> entry : messageSet.b().entrySet()) {
                this.stateChange.sendMessage(entry.getKey().intValue(), entry.getValue());
            }
            for (Map.Entry<Integer, String> entry2 : messageSet.a().entrySet()) {
                this.stateChange.replyMessage(entry2.getKey().intValue(), entry2.getValue());
            }
        }
        this.value = null;
    }
}
