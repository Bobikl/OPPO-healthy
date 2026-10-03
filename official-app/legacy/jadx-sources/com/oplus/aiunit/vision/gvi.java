package com.oplus.aiunit.vision;

import com.heytap.health.watchface.network.bean.DetailItem;
import com.heytap.health.watchface.network.bean.WatchFaceHomeCard;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&J(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\tH&¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/gvi;", "Lcom/oplus/aiunit/vision/lm9;", "Lcom/heytap/health/watchface/network/bean/WatchFaceHomeCard$Item;", "item", "", c8l.KEY_B4, "Lcom/heytap/health/watchface/network/bean/DetailItem;", "detailItem", "H0", "", "isHasPay", "o1", "", "process", "nameRes", "stage", "enable", "g6", "watchface_impl_release"}, k = 1, mv = {1, 8, 0})
public interface gvi extends lm9 {
    void B4(@NotNull WatchFaceHomeCard.Item item);

    void H0(@NotNull DetailItem detailItem);

    void g6(int process, int nameRes, int stage, boolean enable);

    void o1(boolean isHasPay);
}
