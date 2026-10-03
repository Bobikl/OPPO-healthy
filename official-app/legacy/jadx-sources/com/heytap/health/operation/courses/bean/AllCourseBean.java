package com.heytap.health.operation.courses.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
@Keep
public class AllCourseBean {
    private int count;
    private List<CourseListBean> courseList;

    public int getCount() {
        return this.count;
    }

    public List<CourseListBean> getCourseList() {
        return this.courseList;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setCourseList(List<CourseListBean> list) {
        this.courseList = list;
    }
}
