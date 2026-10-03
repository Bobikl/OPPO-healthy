package com.pantanal.server.content.upkmanage.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.heytap.speech.engine.protocol.event.payload.analogclick.Feedback;
import com.heytap.webview.extension.protocol.Const;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Entity(tableName = UpkEntity.TABLE_NAME)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b)\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001EB\u0007¢\u0006\u0004\bB\u0010CJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010$\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u0010\f\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\u0010R$\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\f\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R\"\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0006\u001a\u0004\b+\u0010\b\"\u0004\b,\u0010\nR$\u0010-\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\f\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010R$\u00100\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u0010\f\u001a\u0004\b1\u0010\u000e\"\u0004\b2\u0010\u0010R$\u00103\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010\f\u001a\u0004\b4\u0010\u000e\"\u0004\b5\u0010\u0010R\"\u00106\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\b\"\u0004\b8\u0010\nR\"\u00109\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010\u001f\u001a\u0004\b:\u0010!\"\u0004\b;\u0010#R\"\u0010<\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u0010\u001f\u001a\u0004\b=\u0010!\"\u0004\b>\u0010#R\"\u0010?\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001f\u001a\u0004\b@\u0010!\"\u0004\bA\u0010#¨\u0006F"}, d2 = {"Lcom/pantanal/server/content/upkmanage/entity/UpkEntity;", "", "", "toString", "", "id", "J", "getId", "()J", "setId", "(J)V", "serviceId", "Ljava/lang/String;", "getServiceId", "()Ljava/lang/String;", "setServiceId", "(Ljava/lang/String;)V", "hashServiceId", "getHashServiceId", "setHashServiceId", "packageName", "getPackageName", "setPackageName", Feedback.WIDGET_LABEL, "getLabel", "setLabel", "icons", "getIcons", "setIcons", "", "versionCode", "I", "getVersionCode", "()I", "setVersionCode", "(I)V", "versionName", "getVersionName", "setVersionName", "filesDirectoryPath", "getFilesDirectoryPath", "setFilesDirectoryPath", "lastLaunchTime", "getLastLaunchTime", "setLastLaunchTime", "clickJsonString", "getClickJsonString", "setClickJsonString", "hostPackageName", "getHostPackageName", "setHostPackageName", "hostComponentName", "getHostComponentName", "setHostComponentName", "installTime", "getInstallTime", "setInstallTime", "useTemplate", "getUseTemplate", "setUseTemplate", "needDelete", "getNeedDelete", "setNeedDelete", "useCount", "getUseCount", "setUseCount", "<init>", "()V", "Companion", "a", "staticmanagersdk_release"}, k = 1, mv = {1, 5, 1})
public final class UpkEntity {

    @NotNull
    public static final String TABLE_NAME = "UpkEntity";
    public static final int USE_TEMPLATE_DESKTOP = 0;
    public static final int USE_TEMPLATE_NOTIFICATION = 1;

    @ColumnInfo(name = "click_json_string")
    @Nullable
    private String clickJsonString;

    @ColumnInfo(name = "files_directory_path")
    @Nullable
    private String filesDirectoryPath;

    @ColumnInfo(name = "hashed_service_id")
    @Nullable
    private String hashServiceId;

    @ColumnInfo(name = "host_component_name")
    @Nullable
    private String hostComponentName;

    @ColumnInfo(name = "host_package_name")
    @Nullable
    private String hostPackageName;

    @ColumnInfo(name = "icons")
    @Nullable
    private String icons;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "_id")
    private long id;

    @ColumnInfo(name = "install_time")
    private long installTime;

    @ColumnInfo(name = Feedback.WIDGET_LABEL)
    @Nullable
    private String label;

    @ColumnInfo(name = "last_launch_time")
    private long lastLaunchTime;

    @ColumnInfo(name = "package_name")
    @Nullable
    private String packageName;

    @ColumnInfo(name = "service_id")
    @Nullable
    private String serviceId;

    @Ignore
    private int useCount;

    @ColumnInfo(name = "version_code")
    private int versionCode;

    @ColumnInfo(name = Const.Callback.AppInfo.VERSION_NAME)
    @Nullable
    private String versionName;

    @ColumnInfo(defaultValue = "-1", name = "use_template")
    private int useTemplate = -1;

    @ColumnInfo(defaultValue = "-1", name = "need_delete")
    private int needDelete = -1;

    @Nullable
    public final String getClickJsonString() {
        return this.clickJsonString;
    }

    @Nullable
    public final String getFilesDirectoryPath() {
        return this.filesDirectoryPath;
    }

    @Nullable
    public final String getHashServiceId() {
        return this.hashServiceId;
    }

    @Nullable
    public final String getHostComponentName() {
        return this.hostComponentName;
    }

    @Nullable
    public final String getHostPackageName() {
        return this.hostPackageName;
    }

    @Nullable
    public final String getIcons() {
        return this.icons;
    }

    public final long getId() {
        return this.id;
    }

    public final long getInstallTime() {
        return this.installTime;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    public final long getLastLaunchTime() {
        return this.lastLaunchTime;
    }

    public final int getNeedDelete() {
        return this.needDelete;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    @Nullable
    public final String getServiceId() {
        return this.serviceId;
    }

    public final int getUseCount() {
        return this.useCount;
    }

    public final int getUseTemplate() {
        return this.useTemplate;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    @Nullable
    public final String getVersionName() {
        return this.versionName;
    }

    public final void setClickJsonString(@Nullable String str) {
        this.clickJsonString = str;
    }

    public final void setFilesDirectoryPath(@Nullable String str) {
        this.filesDirectoryPath = str;
    }

    public final void setHashServiceId(@Nullable String str) {
        this.hashServiceId = str;
    }

    public final void setHostComponentName(@Nullable String str) {
        this.hostComponentName = str;
    }

    public final void setHostPackageName(@Nullable String str) {
        this.hostPackageName = str;
    }

    public final void setIcons(@Nullable String str) {
        this.icons = str;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setInstallTime(long j2) {
        this.installTime = j2;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }

    public final void setLastLaunchTime(long j2) {
        this.lastLaunchTime = j2;
    }

    public final void setNeedDelete(int i) {
        this.needDelete = i;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    public final void setServiceId(@Nullable String str) {
        this.serviceId = str;
    }

    public final void setUseCount(int i) {
        this.useCount = i;
    }

    public final void setUseTemplate(int i) {
        this.useTemplate = i;
    }

    public final void setVersionCode(int i) {
        this.versionCode = i;
    }

    public final void setVersionName(@Nullable String str) {
        this.versionName = str;
    }

    @NotNull
    public String toString() {
        return "UpkEntity[\"id\":" + this.id + ",\"serviceId\":" + ((Object) this.serviceId) + ",\"hashServiceId\":" + ((Object) this.hashServiceId) + ",\"pkgName\":" + ((Object) this.packageName) + ",\"label\":" + ((Object) this.label) + ",\"icons\":" + ((Object) this.icons) + ",\"versionCode\":" + this.versionCode + ",\"filePath\":" + ((Object) this.filesDirectoryPath) + ",\"launchTime\":" + this.lastLaunchTime + ",\"installTime\":" + this.installTime + ",\"needDelete\":" + this.needDelete + ",\"useCount\":" + this.useCount + ",\"hostPackageName\":" + ((Object) this.hostPackageName) + ",\"hostComponentName\":" + ((Object) this.hostComponentName) + ",\"clickJson\":" + ((Object) this.clickJsonString) + ']';
    }
}
