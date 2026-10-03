package com.heytap.health.hrv.ui.item;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.heytap.health.core.operation.space.SpaceView;
import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class KnowledgeItemKt$KnowledgeCardView$1$1 extends Lambda implements Function1<Context, SpaceView> {
    final /* synthetic */ MutableState<Boolean> $isVisible;
    final /* synthetic */ SpaceView $spaceView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnowledgeItemKt$KnowledgeCardView$1$1(SpaceView spaceView, MutableState<Boolean> mutableState) {
        super(1);
        this.$spaceView = spaceView;
        this.$isVisible = mutableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1$lambda$0(MutableState isVisible, List list) {
        Intrinsics.checkNotNullParameter(isVisible, "$isVisible");
        isVisible.setValue(Boolean.valueOf(list != null));
    }

    @Override // p010kotlin.jvm.functions.Function1
    @NotNull
    public final SpaceView invoke(@NotNull Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SpaceView spaceView = this.$spaceView;
        final MutableState<Boolean> mutableState = this.$isVisible;
        spaceView.setOnRenderDataListener(new Consumer() { // from class: com.heytap.health.hrv.ui.item.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                KnowledgeItemKt$KnowledgeCardView$1$1.invoke$lambda$1$lambda$0(mutableState, (List) obj);
            }
        });
        return spaceView;
    }
}
