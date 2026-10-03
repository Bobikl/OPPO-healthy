package com.heytap.sporthealth.fit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.health.operation.ecg.business.PdfViewActivity;
import com.heytap.health.operations.router.providers.IFitService;
import com.heytap.sporthealth.fit.dtrain.bean.TrainData;
import com.heytap.sporthealth.fit.dtrain.play.CourseVideoActivity;
import com.heytap.sporthealth.fit.space.SpaceStation;
import com.heytap.sporthealth.fit.weiget.PlayerView;
import com.heytap.sports.record.details.running.RunningPostureVideoActivity;
import com.oplus.aiunit.vision.gxe;
import com.oplus.aiunit.vision.jt4;
import com.oplus.aiunit.vision.lbd;
import com.oplus.aiunit.vision.yg7;
import com.oplus.aiunit.vision.zz9;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Route(path = "/fit/FitService")
public class FitService implements IFitService {
    @NonNull
    public static TrainData c(String str) throws JSONException {
        TrainData trainData = new TrainData();
        JSONObject jSONObject = new JSONObject(str);
        trainData.setCourseId(jSONObject.optString("courseId", ""));
        trainData.setName(jSONObject.optString("courseName"));
        trainData.setTrainDuration(jSONObject.optInt("trainDuration", 1) * 1000);
        trainData.setImageUrl(jSONObject.optString("courseImage"));
        trainData.setVideoUrl(jSONObject.optString(RunningPostureVideoActivity.VIDEO_PATH));
        trainData.setCalorie(jSONObject.optInt("calorie", 0));
        trainData.setVideoSize(jSONObject.optInt("videoSize", 0));
        trainData.setImageUrlShare(trainData.getImageUrl());
        trainData.setImageUrlThumb(trainData.getImageUrl());
        trainData.setImageUrlRecord(trainData.getImageUrl());
        trainData.setTrainType(9);
        trainData.setFitActionRecords(jSONObject.optString("fitActionRecords"));
        return trainData;
    }

    @Override // com.heytap.health.operations.router.providers.IFitService
    public lbd<Float> F7(String... strArr) {
        return SpaceStation.i().h(strArr);
    }

    @Override // com.heytap.health.operations.router.providers.IFitService
    public void S2(Activity activity, String str) {
        if (activity == null || str == null) {
            return;
        }
        try {
            yg7.a("FitService gotoTrainVideo >>> ");
            try {
                TrainData trainDataC = c(str);
                Intent intent = new Intent(activity, (Class<?>) CourseVideoActivity.class);
                intent.putExtra(PdfViewActivity.BUND_TAG, trainDataC);
                intent.setFlags(268435456);
                activity.startActivity(intent);
            } catch (JSONException e2) {
                yg7.d(e2);
            }
        } catch (Exception e3) {
            yg7.d(e3);
        }
    }

    @Override // com.heytap.health.operations.router.providers.IFitService
    public zz9 h5(Context context) {
        return new PlayerView(context);
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        try {
            yg7.a(Thread.currentThread().getName() + " -- FitService --> init：" + context);
            if (gxe.f(context)) {
                jt4.g();
            }
        } catch (Exception e2) {
            yg7.d(e2);
        }
    }
}
