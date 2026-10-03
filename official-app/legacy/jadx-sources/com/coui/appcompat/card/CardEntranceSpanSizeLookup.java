package com.coui.appcompat.card;

import android.annotation.SuppressLint;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroupAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0006B\u0013\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0017R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/coui/appcompat/card/CardEntranceSpanSizeLookup;", "Landroidx/recyclerview/widget/GridLayoutManager$SpanSizeLookup;", "", "position", "getSpanSize", "Landroidx/preference/PreferenceGroupAdapter;", "a", "Landroidx/preference/PreferenceGroupAdapter;", "getAdapter", "()Landroidx/preference/PreferenceGroupAdapter;", "setAdapter", "(Landroidx/preference/PreferenceGroupAdapter;)V", "adapter", "<init>", "Companion", "coui-support-card_release"}, k = 1, mv = {1, 8, 0})
public final class CardEntranceSpanSizeLookup extends GridLayoutManager.SpanSizeLookup {
    public static final int SPAN_COUNT_CARD_TYPE_LARGE = 2;
    public static final int SPAN_COUNT_CARD_TYPE_SMALL = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public PreferenceGroupAdapter adapter;

    /* JADX WARN: Multi-variable type inference failed */
    public CardEntranceSpanSizeLookup() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
    @SuppressLint({"RestrictedApi"})
    public int getSpanSize(int position) {
        PreferenceGroupAdapter preferenceGroupAdapter = this.adapter;
        Preference item = preferenceGroupAdapter != null ? preferenceGroupAdapter.getItem(position) : null;
        if (!(item instanceof COUICardEntrancePreference)) {
            return 2;
        }
        int cardType = ((COUICardEntrancePreference) item).getCardType();
        return (cardType == 1 || cardType != 2) ? 1 : 2;
    }

    public /* synthetic */ CardEntranceSpanSizeLookup(PreferenceGroupAdapter preferenceGroupAdapter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : preferenceGroupAdapter);
    }

    public CardEntranceSpanSizeLookup(@Nullable PreferenceGroupAdapter preferenceGroupAdapter) {
        this.adapter = preferenceGroupAdapter;
    }
}
