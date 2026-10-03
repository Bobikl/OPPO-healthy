package com.heytap.health.watchface.business.manager.source;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import com.heytap.health.watchface.network.bean.WatchFaceHomeCard;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class HomeItemDiff extends DiffUtil.ItemCallback<WatchFaceHomeCard> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean areContentsTheSame(@NonNull WatchFaceHomeCard watchFaceHomeCard, @NonNull WatchFaceHomeCard watchFaceHomeCard2) {
        int code = watchFaceHomeCard.getCode();
        if (code == 10001) {
            return watchFaceHomeCard.getBanners().equals(watchFaceHomeCard2.getBanners());
        }
        if (code != 10002) {
            switch (code) {
                case 10006:
                case 10011:
                    break;
                case 10007:
                    return c(watchFaceHomeCard, watchFaceHomeCard2);
                case 10008:
                    return watchFaceHomeCard.getMenuList().equals(watchFaceHomeCard2.getMenuList());
                case 10009:
                    return watchFaceHomeCard.getTags().equals(watchFaceHomeCard2.getTags());
                case 10010:
                    return Objects.equals(watchFaceHomeCard.getTitle(), watchFaceHomeCard2.getTitle());
                default:
                    return false;
            }
        }
        return watchFaceHomeCard.getItems().equals(watchFaceHomeCard2.getItems());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean areItemsTheSame(@NonNull WatchFaceHomeCard watchFaceHomeCard, @NonNull WatchFaceHomeCard watchFaceHomeCard2) {
        return watchFaceHomeCard.getCode() == watchFaceHomeCard2.getCode();
    }

    public final boolean c(@NonNull WatchFaceHomeCard watchFaceHomeCard, @NonNull WatchFaceHomeCard watchFaceHomeCard2) {
        return Objects.equals(watchFaceHomeCard.getTitle(), watchFaceHomeCard2.getTitle()) && Objects.equals(watchFaceHomeCard.getSubTitle(), watchFaceHomeCard2.getSubTitle()) && Objects.equals(watchFaceHomeCard.getBackPicture(), watchFaceHomeCard2.getBackPicture()) && Objects.equals(watchFaceHomeCard.getThumbnailPic(), watchFaceHomeCard2.getThumbnailPic()) && Objects.equals(watchFaceHomeCard.getActionParam(), watchFaceHomeCard2.getActionParam()) && watchFaceHomeCard.getCreationWfType() == watchFaceHomeCard2.getCreationWfType();
    }
}
