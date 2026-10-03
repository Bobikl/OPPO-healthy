package com.heytap.health.sport.sportrecord;

import android.graphics.Bitmap;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.health.base.share.SportShareDataBean;
import com.heytap.sports.record.details.RecordDetailsInstructionActivity;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.CoachInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u001c\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH&J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H&J\u001b\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H&J&\u0010\u0018\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u0004H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/heytap/health/sport/sportrecord/SportService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Lcom/oplus/aiunit/vision/sj3;", "O4", "", "Ma", "", "title", "Lcom/heytap/health/base/share/SportShareDataBean;", "dataBean", "", "i0", RecordDetailsInstructionActivity.KEY_SPORT_MODE, "Xa", "", SpeechConstant.KEY_TTS_TIMESTAMP, "o5", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/heytap/databaseengine/model/OneTimeSport;", "oneTimeSport", "Landroid/graphics/Bitmap;", "A5", "defaultSportName", "gameId", "c2", "sport_release"}, k = 1, mv = {1, 8, 0})
public interface SportService extends IProvider {
    @Nullable
    Bitmap A5(@NotNull OneTimeSport oneTimeSport);

    int Ma();

    @Nullable
    CoachInfo O4();

    void Xa(int sportMode);

    @NotNull
    String c2(int sportMode, @Nullable String defaultSportName, int gameId);

    void i0(@Nullable String title, @Nullable SportShareDataBean dataBean);

    @Nullable
    Object o5(long j2, @NotNull Continuation<? super String> continuation);
}
