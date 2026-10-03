package com.heytap.health.sunshine.ui.compose;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.MutableState;
import com.heytap.health.core.operation.space.SpaceView;
import java.util.List;
import java.util.function.Consumer;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class KnowledgeItemKt$SunshineKnowledgeCard$1$1 extends Lambda implements Function1<Context, SpaceView> {
    final /* synthetic */ String $cardCode;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Boolean> $isVisible;
    final /* synthetic */ String $pageCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KnowledgeItemKt$SunshineKnowledgeCard$1$1(Context context, String str, String str2, MutableState<Boolean> mutableState) {
        super(1);
        this.$context = context;
        this.$cardCode = str;
        this.$pageCode = str2;
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
        SpaceView spaceView = new SpaceView(this.$context);
        String str = this.$cardCode;
        String str2 = this.$pageCode;
        final MutableState<Boolean> mutableState = this.$isVisible;
        spaceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        spaceView.setCardCode(str);
        spaceView.setPageCode(str2);
        spaceView.setOnRenderDataListener(new Consumer() { // from class: com.heytap.health.sunshine.ui.compose.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                KnowledgeItemKt$SunshineKnowledgeCard$1$1.invoke$lambda$1$lambda$0(mutableState, (List) obj);
            }
        });
        spaceView.b();
        return spaceView;
    }
}
