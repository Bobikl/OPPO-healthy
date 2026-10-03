package com.oplus.aiunit.vision;

import com.heytap.health.operation.courses.bean.MiaoCourseDetailBean;
import com.heytap.health.operations.bean.RunningCourseDetailBean;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/heytap/health/operations/bean/RunningCourseDetailBean;", "Lcom/heytap/health/operation/courses/bean/MiaoCourseDetailBean;", "a", "operation_impl_release"}, k = 2, mv = {1, 8, 0})
public final class ea4 {
    @NotNull
    public static final MiaoCourseDetailBean a(@NotNull RunningCourseDetailBean runningCourseDetailBean) {
        Intrinsics.checkNotNullParameter(runningCourseDetailBean, "<this>");
        MiaoCourseDetailBean miaoCourseDetailBean = new MiaoCourseDetailBean();
        miaoCourseDetailBean.setCourseImage(runningCourseDetailBean.getCourseImage());
        miaoCourseDetailBean.setDuration(runningCourseDetailBean.getDuration());
        miaoCourseDetailBean.setCalorie(runningCourseDetailBean.getCalorie());
        miaoCourseDetailBean.setCourseCode(runningCourseDetailBean.getCourseCode());
        miaoCourseDetailBean.setIntroduce(runningCourseDetailBean.getIntroduce());
        miaoCourseDetailBean.setDifficultyLevel(runningCourseDetailBean.getDifficultyLevel());
        miaoCourseDetailBean.setName(runningCourseDetailBean.getName());
        miaoCourseDetailBean.setVideoUrl(runningCourseDetailBean.getVideoUrl());
        miaoCourseDetailBean.setVideoSize(runningCourseDetailBean.getVideoSize());
        miaoCourseDetailBean.setActions(runningCourseDetailBean.getActions());
        return miaoCourseDetailBean;
    }
}
