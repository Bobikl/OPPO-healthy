package com.allawn.weather.common.vo;

/* JADX INFO: loaded from: classes12.dex */
public class IndexDataVO {
    private Object adData;
    private String adHost;
    private String adUrl;
    private String desc;
    private String grayIcon;
    private Boolean haveAdData;
    private String icon;
    private String info;
    private String level;
    private String name;
    private int pos;
    private int type;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IndexDataVO indexDataVO = (IndexDataVO) obj;
            if (this.type != indexDataVO.type || this.pos != indexDataVO.pos) {
                return false;
            }
            String str = this.name;
            if (str != null) {
                if (!str.equals(indexDataVO.name)) {
                    return false;
                }
            } else if (indexDataVO.name != null) {
                return false;
            }
            String str2 = this.level;
            if (str2 != null) {
                if (!str2.equals(indexDataVO.level)) {
                    return false;
                }
            } else if (indexDataVO.level != null) {
                return false;
            }
            String str3 = this.desc;
            if (str3 == null ? indexDataVO.desc == null : str3.equals(indexDataVO.desc)) {
                String str4 = this.icon;
                if (str4 == null ? indexDataVO.icon == null : str4.equals(indexDataVO.icon)) {
                    String str5 = this.grayIcon;
                    if (str5 == null ? indexDataVO.grayIcon == null : str5.equals(indexDataVO.grayIcon)) {
                        String str6 = this.adHost;
                        if (str6 != null) {
                            if (!str6.equals(indexDataVO.adHost)) {
                                return false;
                            }
                        } else if (indexDataVO.adHost != null) {
                            return false;
                        }
                        Boolean bool = this.haveAdData;
                        if (bool == null ? indexDataVO.haveAdData == null : bool.equals(indexDataVO.haveAdData)) {
                            Object obj2 = this.adData;
                            if (obj2 != null) {
                                if (!obj2.equals(indexDataVO.adData)) {
                                    return false;
                                }
                            } else if (indexDataVO.adData != null) {
                                return false;
                            }
                            String str7 = this.info;
                            if (str7 != null) {
                                if (str7.equals(indexDataVO.info)) {
                                    String str8 = this.adUrl;
                                    if (str8 != null) {
                                        return str8.equals(indexDataVO.adUrl);
                                    }
                                    return indexDataVO.adUrl == null;
                                }
                            } else if (indexDataVO.info == null) {
                                String str9 = this.adUrl;
                                if (str9 != null) {
                                    return str9.equals(indexDataVO.adUrl);
                                }
                                return indexDataVO.adUrl == null;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public Object getAdData() {
        return this.adData;
    }

    public String getAdHost() {
        return this.adHost;
    }

    public String getAdUrl() {
        return this.adUrl;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getGrayIcon() {
        return this.grayIcon;
    }

    public Boolean getHaveAdData() {
        return this.haveAdData;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getInfo() {
        return this.info;
    }

    public String getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    public int getPos() {
        return this.pos;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return ((((((((((((((((((((getName() != null ? getName().hashCode() : 0) * 31) + getType()) * 31) + (getLevel() != null ? getLevel().hashCode() : 0)) * 31) + getPos()) * 31) + (getIcon() != null ? getIcon().hashCode() : 0)) * 31) + (getGrayIcon() != null ? getGrayIcon().hashCode() : 0)) * 31) + (getAdHost() != null ? getAdHost().hashCode() : 0)) * 31) + (getAdUrl() != null ? getAdUrl().hashCode() : 0)) * 31) + (getHaveAdData() != null ? getHaveAdData().hashCode() : 0)) * 31) + (getAdData() != null ? getAdData().hashCode() : 0)) * 31) + (getInfo() != null ? getInfo().hashCode() : 0);
    }

    public void setAdData(Object obj) {
        this.adData = obj;
    }

    public void setAdHost(String str) {
        this.adHost = str;
    }

    public void setAdUrl(String str) {
        this.adUrl = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setGrayIcon(String str) {
        this.grayIcon = str;
    }

    public void setHaveAdData(Boolean bool) {
        this.haveAdData = bool;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setInfo(String str) {
        this.info = str;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPos(int i) {
        this.pos = i;
    }

    public void setType(int i) {
        this.type = i;
    }
}
