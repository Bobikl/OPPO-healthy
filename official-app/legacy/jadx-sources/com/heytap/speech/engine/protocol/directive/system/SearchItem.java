package com.heytap.speech.engine.protocol.directive.system;

import androidx.annotation.Keep;
import com.heytap.speech.engine.protocol.directive.DirectivePayload;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R.\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/heytap/speech/engine/protocol/directive/system/SearchItem;", "Lcom/heytap/speech/engine/protocol/directive/DirectivePayload;", "()V", "alternativeItems", "Ljava/util/ArrayList;", "Lcom/heytap/speech/engine/protocol/directive/system/ItemInfo;", "Lkotlin/collections/ArrayList;", "getAlternativeItems", "()Ljava/util/ArrayList;", "setAlternativeItems", "(Ljava/util/ArrayList;)V", "targetItem", "getTargetItem", "()Lcom/heytap/speech/engine/protocol/directive/system/ItemInfo;", "setTargetItem", "(Lcom/heytap/speech/engine/protocol/directive/system/ItemInfo;)V", "protocol_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SearchItem extends DirectivePayload {

    @Nullable
    private ArrayList<ItemInfo> alternativeItems;

    @Nullable
    private ItemInfo targetItem;

    @Nullable
    public final ArrayList<ItemInfo> getAlternativeItems() {
        return this.alternativeItems;
    }

    @Nullable
    public final ItemInfo getTargetItem() {
        return this.targetItem;
    }

    public final void setAlternativeItems(@Nullable ArrayList<ItemInfo> arrayList) {
        this.alternativeItems = arrayList;
    }

    public final void setTargetItem(@Nullable ItemInfo itemInfo) {
        this.targetItem = itemInfo;
    }
}
