package com.heytap.health.operation.courses.viewmodel;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.operation.R$string;
import com.heytap.health.operation.courses.bean.AiCourseDetailBean;
import com.heytap.health.operation.courses.bean.MiaoCourseDetailBean;
import com.heytap.health.operations.bean.ActionBean;
import com.heytap.health.operations.bean.KeepTrainBean;
import com.heytap.health.operations.bean.StageBean;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ac4;
import com.oplus.aiunit.vision.e7c;
import com.oplus.aiunit.vision.gb4;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.hb4;
import com.oplus.aiunit.vision.hc4;
import com.oplus.aiunit.vision.kb4;
import com.oplus.aiunit.vision.nnc;
import com.oplus.aiunit.vision.r0c;
import com.oplus.aiunit.vision.v9g;
import com.oplus.aiunit.vision.wb4;
import com.oplus.aiunit.vision.xl6;
import com.oplus.aiunit.vision.zb4;
import com.oplus.aiunit.vision.zo5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class CourseDetailViewModel extends ViewModel {
    public MutableLiveData<nnc<MiaoCourseDetailBean>> i = new MutableLiveData<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MutableLiveData<nnc<JsonElement>> f5164j = new MutableLiveData<>();
    public OLiveData<nnc<JsonElement>> k = new OLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MutableLiveData<nnc<AiCourseDetailBean>> f5165l = new MutableLiveData<>();
    public zo5 m;

    public List<e7c> A(Context context, MiaoCourseDetailBean miaoCourseDetailBean, boolean z, String[] strArr, boolean z2) {
        if (miaoCourseDetailBean == null) {
            return new ArrayList();
        }
        this.m = new zo5();
        StringBuilder sb = new StringBuilder();
        sb.append("getMiaoCourseUiData, name:");
        sb.append(miaoCourseDetailBean.getName());
        sb.append(",courseCode:");
        sb.append(miaoCourseDetailBean.getCourseCode());
        ArrayList<e7c> arrayList = new ArrayList<>();
        arrayList.add(new hc4(new KeepTrainBean(miaoCourseDetailBean.getCourseCode(), miaoCourseDetailBean.getName(), miaoCourseDetailBean.getCalorie(), miaoCourseDetailBean.getDuration(), miaoCourseDetailBean.getDifficultyLevel(), 0, 0, miaoCourseDetailBean.getCourseImage(), miaoCourseDetailBean.getFee(), 0, 0L, "", null, 0, null, null, z2), !z, strArr));
        arrayList.add(new kb4(context.getString(R$string.operation_course_detail_introdution), miaoCourseDetailBean.getIntroduce()));
        if (gl4.managerApi.getBoundDeviceInfos().isEmpty() && !arrayList.contains(this.m)) {
            arrayList.add(this.m);
        }
        if (miaoCourseDetailBean.getStages() != null && !miaoCourseDetailBean.getStages().isEmpty()) {
            arrayList.add(new hb4(context.getString(R$string.operation_course_detail_actions_list)));
            w(miaoCourseDetailBean.getStages(), arrayList);
        }
        if (TextUtils.isEmpty(miaoCourseDetailBean.getVideoUrl())) {
            arrayList.add(new r0c());
        }
        arrayList.add(new xl6());
        return arrayList;
    }

    public MiaoCourseDetailBean B(String str) {
        Gson gson = new Gson();
        String strD = v9g.x("miao_course_detail").D(str);
        StringBuilder sb = new StringBuilder();
        sb.append("getMiaoDetailsFromCache courseCode:");
        sb.append(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("courseStr:");
        sb2.append(strD);
        MiaoCourseDetailBean miaoCourseDetailBean = (MiaoCourseDetailBean) gson.fromJson(strD, MiaoCourseDetailBean.class);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("miao detail bean from cache:");
        sb3.append(miaoCourseDetailBean);
        return (MiaoCourseDetailBean) gson.fromJson(strD, MiaoCourseDetailBean.class);
    }

    public MutableLiveData<nnc<MiaoCourseDetailBean>> C() {
        return this.i;
    }

    public MutableLiveData<nnc<JsonElement>> D() {
        return this.f5164j;
    }

    public boolean E(String str, int i) {
        return TextUtils.isEmpty(str) && i >= 0;
    }

    public void F(Context context, String str) {
        wb4.c(context, this.k, str);
    }

    public void G(Context context, int i) {
        wb4.f(context, i, this.f5165l);
    }

    public void H(Context context, String str) {
        wb4.g(context, str, this.i);
    }

    public void u(MiaoCourseDetailBean miaoCourseDetailBean) {
        String json = new Gson().toJson(miaoCourseDetailBean);
        a7b.f("CourseDetailViewModel", "cacheMiaoDetailData details.getCourseCode:" + miaoCourseDetailBean.getCourseCode());
        v9g.x("miao_course_detail").U(miaoCourseDetailBean.getCourseCode(), json);
    }

    public final void v(List<ActionBean> list, ArrayList<e7c> arrayList) {
        if (list == null) {
            a7b.b("CourseDetailViewModel", "actions == null!!");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new gb4(list.get(i).getImageUrl(), list.get(i).getActionName(), list.get(i).getActionTimes()));
        }
    }

    public final void w(List<StageBean> list, ArrayList<e7c> arrayList) {
        if (list == null) {
            a7b.b("CourseDetailViewModel", "stages == null!!");
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new ac4(list.get(i).getPhaseRule()));
            v(list.get(i).getActions(), arrayList);
            if (i != list.size() - 1) {
                arrayList.add(new zb4());
            }
        }
    }

    public MutableLiveData<nnc<AiCourseDetailBean>> x() {
        return this.f5165l;
    }

    public List<e7c> y(Context context, AiCourseDetailBean aiCourseDetailBean, String[] strArr, boolean z) {
        if (aiCourseDetailBean == null) {
            return new ArrayList();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getAiCourseUiData, name:");
        sb.append(aiCourseDetailBean.getName());
        sb.append(",courseCode:");
        sb.append(aiCourseDetailBean.getCourseCode());
        ArrayList<e7c> arrayList = new ArrayList<>();
        arrayList.add(new hc4(new KeepTrainBean(aiCourseDetailBean.getCourseCode(), aiCourseDetailBean.getName(), aiCourseDetailBean.getCalorie(), aiCourseDetailBean.getDuration(), aiCourseDetailBean.getDifficultyLevel(), 0, 0, aiCourseDetailBean.getCourseImage(), "", 0, 0L, "", null, 0, null, null, z), true, strArr));
        arrayList.add(new kb4(context.getString(R$string.operation_course_detail_introdution), aiCourseDetailBean.getDescription()));
        if (gl4.managerApi.getBoundDeviceInfos().isEmpty()) {
            arrayList.add(new zo5());
        }
        arrayList.add(new hb4(context.getString(R$string.operation_course_detail_actions_list)));
        w(aiCourseDetailBean.getStages(), arrayList);
        arrayList.add(new r0c());
        arrayList.add(new xl6());
        return arrayList;
    }

    public LiveData<nnc<JsonElement>> z() {
        return this.k;
    }
}
