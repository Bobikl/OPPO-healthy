package com.heytap.health.videosdk;

import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H&¨\u0006\u000f"}, d2 = {"Lcom/heytap/health/videosdk/IPalyListener;", "", "onPalyComplete", "", "onPalyProgress", ClickApiEntity.TIME, "", "onPlayError", "code", "", "onVideoConfig", "witdh", Fields.HEIGHT_FIELD, "duration", "fps", "sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface IPalyListener {
    void onPalyComplete();

    void onPalyProgress(double time);

    void onPlayError(int code);

    void onVideoConfig(int witdh, int height, double duration, double fps);
}
