package com.heytap.health.watchface.business.creation.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
@Entity(primaryKeys = {"device_flag", "img_id", SensorsBean.STYLE_ID})
public class LivePhotoRecord implements Serializable {

    @NonNull
    @ColumnInfo(defaultValue = "", name = "device_flag")
    public String deviceFlag = "";
    public String extraInfo;

    @NonNull
    @ColumnInfo(defaultValue = "", name = "img_id")
    public String imgId;
    public String imgPath;

    @NonNull
    @ColumnInfo(defaultValue = "", name = SensorsBean.STYLE_ID)
    public String styleId;
    public long taskId;
    public int taskStatus;
    public String videoPath;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LivePhotoRecord livePhotoRecord = (LivePhotoRecord) obj;
        return Objects.equals(this.deviceFlag, livePhotoRecord.deviceFlag) && Objects.equals(this.imgId, livePhotoRecord.imgId) && Objects.equals(this.styleId, livePhotoRecord.styleId);
    }

    public int hashCode() {
        return Objects.hash(this.deviceFlag, this.imgId, this.styleId);
    }

    public String toString() {
        return "LivePhotoRecord{styleId='" + this.styleId + "', videoPath='" + this.videoPath + "', imgId='" + this.imgId + "', taskStatus='" + this.taskStatus + "', filePath='" + this.imgPath + "', extraInfo='" + this.extraInfo + "'}";
    }
}
