package com.heytap.health.watchface.adaptation.colorconnect.client.file.bean;

import androidx.annotation.NonNull;
import com.oplus.aiunit.vision.oc7;

/* JADX INFO: loaded from: classes19.dex */
public class FileListTaskProcess extends oc7 {
    public FileStatus d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f6651e;
    public String f;

    public enum FileStatus {
        ONE_START,
        ONE_FINISH,
        ONE_ERROR
    }

    public FileListTaskProcess(FileStatus fileStatus, String str, String str2, int i, String str3, String str4) {
        super(str, str2, i);
        this.d = fileStatus;
        this.f6651e = str3;
        this.f = str4;
    }

    public static FileListTaskProcess d(String str, String str2, String str3) {
        return new FileListTaskProcess(FileStatus.ONE_ERROR, str, "", -1, str2, str3);
    }

    public static FileListTaskProcess e(String str, String str2) {
        return new FileListTaskProcess(FileStatus.ONE_FINISH, str, "", 100, str2, null);
    }

    public static FileListTaskProcess f(String str, String str2, int i) {
        return new FileListTaskProcess(FileStatus.ONE_START, str, str2, i, null, null);
    }

    public String g() {
        return this.f;
    }

    public String h() {
        return this.f6651e;
    }

    public FileStatus i() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.oc7
    @NonNull
    public String toString() {
        return "FileProcessStatus{status=" + this.d + ", filePath='" + this.f6651e + "', super ='" + super.toString() + "'}";
    }
}
