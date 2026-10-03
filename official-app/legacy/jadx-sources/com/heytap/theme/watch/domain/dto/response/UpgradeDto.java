package com.heytap.theme.watch.domain.dto.response;

import io.protostuff.Tag;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class UpgradeDto {

    @Tag(1)
    private List<UpgradeInfo> infos;

    public List<UpgradeInfo> getInfos() {
        return this.infos;
    }

    public void setInfos(List<UpgradeInfo> list) {
        this.infos = list;
    }

    public String toString() {
        return "UpgradeDto{infos=" + this.infos + '}';
    }
}
