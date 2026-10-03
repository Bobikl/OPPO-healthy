package com.heytap.sports.service;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.heytap.databaseengine.model.OneTimeSport;
import com.heytap.health.sport.ISportTrackDataService;
import com.heytap.sports.map.base.utils.SportRecordDataFormatUtils;
import com.heytap.sports.map.model.TrackPoint;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Route(path = "/sports/SportTrackDataService")
public class SportTrackDataServiceImpl implements ISportTrackDataService {
    @Override // com.heytap.health.sport.ISportTrackDataService
    public double[] P4(OneTimeSport oneTimeSport, boolean z) {
        List<TrackPoint> listE = SportRecordDataFormatUtils.e(oneTimeSport, z);
        if (listE == null || listE.isEmpty()) {
            return null;
        }
        TrackPoint trackPoint = listE.get(0);
        if (trackPoint.getLocation() != null) {
            return new double[]{trackPoint.getLocation().latitude, trackPoint.getLocation().longitude};
        }
        return null;
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }
}
