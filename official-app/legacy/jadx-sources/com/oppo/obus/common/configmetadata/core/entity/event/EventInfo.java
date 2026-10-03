package com.oppo.obus.common.configmetadata.core.entity.event;

import io.protostuff.Tag;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class EventInfo implements Serializable {
    private static final long serialVersionUID = 1765420469020953147L;

    @Tag(1)
    private Integer code;

    @Tag(2)
    private Integer grade;

    @Tag(5)
    private String group;

    @Tag(6)
    private String name;

    @Tag(3)
    private Integer networkType;

    @Tag(7)
    private Integer status;

    @Tag(4)
    private Integer uploadType;

    public EventInfo() {
    }

    public EventInfo(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Integer num5) {
        this.code = num;
        this.grade = num2;
        this.networkType = num3;
        this.uploadType = num4;
        this.group = str;
        this.name = str2;
        this.status = num5;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof EventInfo;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventInfo)) {
            return false;
        }
        EventInfo eventInfo = (EventInfo) obj;
        if (!eventInfo.canEqual(this)) {
            return false;
        }
        Integer code = getCode();
        Integer code2 = eventInfo.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        Integer grade = getGrade();
        Integer grade2 = eventInfo.getGrade();
        if (grade != null ? !grade.equals(grade2) : grade2 != null) {
            return false;
        }
        Integer networkType = getNetworkType();
        Integer networkType2 = eventInfo.getNetworkType();
        if (networkType != null ? !networkType.equals(networkType2) : networkType2 != null) {
            return false;
        }
        Integer uploadType = getUploadType();
        Integer uploadType2 = eventInfo.getUploadType();
        if (uploadType != null ? !uploadType.equals(uploadType2) : uploadType2 != null) {
            return false;
        }
        Integer status = getStatus();
        Integer status2 = eventInfo.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        String group = getGroup();
        String group2 = eventInfo.getGroup();
        if (group != null ? !group.equals(group2) : group2 != null) {
            return false;
        }
        String name = getName();
        String name2 = eventInfo.getName();
        return name != null ? name.equals(name2) : name2 == null;
    }

    public Integer getCode() {
        return this.code;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public String getGroup() {
        return this.group;
    }

    public String getName() {
        return this.name;
    }

    public Integer getNetworkType() {
        return this.networkType;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getUploadType() {
        return this.uploadType;
    }

    public int hashCode() {
        Integer code = getCode();
        int iHashCode = code == null ? 43 : code.hashCode();
        Integer grade = getGrade();
        int iHashCode2 = ((iHashCode + 59) * 59) + (grade == null ? 43 : grade.hashCode());
        Integer networkType = getNetworkType();
        int iHashCode3 = (iHashCode2 * 59) + (networkType == null ? 43 : networkType.hashCode());
        Integer uploadType = getUploadType();
        int iHashCode4 = (iHashCode3 * 59) + (uploadType == null ? 43 : uploadType.hashCode());
        Integer status = getStatus();
        int iHashCode5 = (iHashCode4 * 59) + (status == null ? 43 : status.hashCode());
        String group = getGroup();
        int i = iHashCode5 * 59;
        int iHashCode6 = group == null ? 43 : group.hashCode();
        String name = getName();
        return ((i + iHashCode6) * 59) + (name != null ? name.hashCode() : 43);
    }

    public EventInfo setCode(Integer num) {
        this.code = num;
        return this;
    }

    public EventInfo setGrade(Integer num) {
        this.grade = num;
        return this;
    }

    public EventInfo setGroup(String str) {
        this.group = str;
        return this;
    }

    public EventInfo setName(String str) {
        this.name = str;
        return this;
    }

    public EventInfo setNetworkType(Integer num) {
        this.networkType = num;
        return this;
    }

    public EventInfo setStatus(Integer num) {
        this.status = num;
        return this;
    }

    public EventInfo setUploadType(Integer num) {
        this.uploadType = num;
        return this;
    }

    public String toString() {
        return "EventInfo(code=" + getCode() + ", grade=" + getGrade() + ", networkType=" + getNetworkType() + ", uploadType=" + getUploadType() + ", group=" + getGroup() + ", name=" + getName() + ", status=" + getStatus() + ")";
    }
}
