package com.oplus.aiunit.vision;

import com.heytap.health.watchface.business.manager.bean.HotSearchListItem;
import com.heytap.health.watchface.business.manager.bean.SearchHistoryItem;
import com.heytap.health.watchface.network.bean.WatchFaceHomeCard;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0016\u0010\u0010\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\nH&J0\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u0016\u001a\u00020\u0015H&J(\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\nH&J \u0010\u0019\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\nH&J \u0010\u001a\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\nH&¨\u0006\u001b"}, d2 = {"Lcom/oplus/aiunit/vision/i1a;", "Lcom/oplus/aiunit/vision/lm9;", "", "state", "", "u6", "", "Lcom/heytap/health/watchface/business/manager/bean/SearchHistoryItem;", "histories", "O1", "", "Lcom/heytap/health/watchface/business/manager/bean/HotSearchListItem;", "hotLists", "S6", "", "suggestions", "J3", n28.KEYWORD, "scrollId", "Lcom/heytap/health/watchface/network/bean/WatchFaceHomeCard$Item;", "dataList", "", "illegal", "l4", "K6", "V0", "l5", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public interface i1a extends lm9 {
    void J3(@NotNull List<String> suggestions);

    void K6(@NotNull String keyword, @Nullable String scrollId, @NotNull List<? extends WatchFaceHomeCard.Item> dataList);

    void O1(@NotNull List<SearchHistoryItem> histories);

    void S6(@NotNull List<HotSearchListItem> hotLists);

    void V0(@Nullable String scrollId, @NotNull List<? extends WatchFaceHomeCard.Item> dataList);

    void l4(@NotNull String keyword, @Nullable String scrollId, @NotNull List<? extends WatchFaceHomeCard.Item> dataList, boolean illegal);

    void l5(@Nullable String scrollId, @NotNull List<? extends WatchFaceHomeCard.Item> dataList);

    void u6(int state);
}
