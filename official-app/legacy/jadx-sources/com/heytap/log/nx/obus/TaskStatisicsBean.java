package com.heytap.log.nx.obus;

import android.content.Context;
import android.os.Environment;
import androidx.annotation.Keep;
import com.heytap.log.BuildConfig;
import com.heytap.log.util.AppUtil;

/* JADX INFO: loaded from: classes19.dex */
@Keep
public class TaskStatisicsBean {
    public static final int TASK_TYPE_ACTIVE = 0;
    public static final int TASK_TYPE_REPORT = 1;
    long free_space;
    String h_business;
    int h_error_code;
    String h_error_msg;
    long h_file_size;
    int h_status;
    long hlog_sdk_ver;
    int kit_ver;
    int msp_ver;
    int taskType;
    int task_channel;
    String track_id;
    String track_pkg;
    int track_pkg_ver;

    public TaskStatisicsBean(int i, long j2, String str, String str2, int i2, String str3, long j3) {
        this.track_id = "";
        this.h_business = "";
        this.task_channel = -1;
        this.track_pkg = "";
        this.track_pkg_ver = 0;
        this.kit_ver = 0;
        this.msp_ver = 0;
        this.hlog_sdk_ver = 0L;
        this.h_file_size = 0L;
        this.free_space = 0L;
        this.h_status = -1;
        this.h_error_code = -1;
        this.h_error_msg = "";
        this.taskType = i;
        this.track_id = j2 + "";
        this.h_business = str;
        this.track_pkg = str2;
        this.h_status = 0;
        this.h_error_code = i2;
        this.h_error_msg = str3;
        this.task_channel = 0;
        this.hlog_sdk_ver = BuildConfig.SDK_VERSION_CODE;
        this.h_file_size = j3;
    }

    public static void fillExtraData(Context context, TaskStatisicsBean taskStatisicsBean) {
        taskStatisicsBean.track_pkg_ver = AppUtil.getAppVersionCode(context);
        taskStatisicsBean.kit_ver = 223;
        taskStatisicsBean.free_space = Environment.getExternalStorageDirectory().getFreeSpace();
    }

    public void setTaskChannel(int i) {
        this.task_channel = i;
    }

    public void setTaskType(int i) {
        this.taskType = i;
    }

    public String toString() {
        return "TaskStatisicsBean{track_id='" + this.track_id + "', h_business='" + this.h_business + "', taskType=" + this.taskType + ", task_channel=" + this.task_channel + ", track_pkg='" + this.track_pkg + "', track_pkg_ver=" + this.track_pkg_ver + ", kit_ver=" + this.kit_ver + ", msp_ver=" + this.msp_ver + ", hlog_sdk_ver=" + this.hlog_sdk_ver + ", h_file_size=" + this.h_file_size + ", free_space=" + this.free_space + ", h_status=" + this.h_status + ", h_error_code=" + this.h_error_code + ", h_error_msg='" + this.h_error_msg + "'}";
    }

    public TaskStatisicsBean(long j2, String str, String str2, int i, String str3, long j3, int i2) {
        this.track_id = "";
        this.h_business = "";
        this.taskType = 0;
        this.task_channel = -1;
        this.track_pkg = "";
        this.track_pkg_ver = 0;
        this.kit_ver = 0;
        this.msp_ver = 0;
        this.hlog_sdk_ver = 0L;
        this.h_file_size = 0L;
        this.free_space = 0L;
        this.h_status = -1;
        this.h_error_code = -1;
        this.h_error_msg = "";
        this.track_id = j2 + "";
        this.h_business = str;
        this.track_pkg = str2;
        this.h_status = i2;
        this.h_error_code = i;
        this.h_error_msg = str3;
        this.task_channel = 0;
        this.hlog_sdk_ver = BuildConfig.SDK_VERSION_CODE;
        this.h_file_size = j3;
    }

    public TaskStatisicsBean(long j2, String str, String str2, int i, String str3, long j3) {
        this.track_id = "";
        this.h_business = "";
        this.taskType = 0;
        this.task_channel = -1;
        this.track_pkg = "";
        this.track_pkg_ver = 0;
        this.kit_ver = 0;
        this.msp_ver = 0;
        this.hlog_sdk_ver = 0L;
        this.h_file_size = 0L;
        this.free_space = 0L;
        this.h_status = -1;
        this.h_error_code = -1;
        this.h_error_msg = "";
        this.track_id = j2 + "";
        this.h_business = str;
        this.track_pkg = str2;
        this.h_status = 0;
        this.h_error_code = i;
        this.h_error_msg = str3;
        this.task_channel = 0;
        this.hlog_sdk_ver = BuildConfig.SDK_VERSION_CODE;
        this.h_file_size = j3;
    }
}
