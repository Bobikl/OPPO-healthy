package com.heytap.store.db.entity.dao;

import com.heytap.store.db.entity.main.AnnounceBanners;
import com.oplus.aiunit.vision.a6;
import com.oplus.aiunit.vision.c6;
import com.oplus.aiunit.vision.cs4;
import com.oplus.aiunit.vision.wz4;
import java.util.Map;
import org.greenrobot.greendao.identityscope.IdentityScopeType;

/* JADX INFO: loaded from: classes4.dex */
public class DaoSession extends c6 {
    private final AnnounceBannersDao announceBannersDao;
    private final cs4 announceBannersDaoConfig;

    public DaoSession(wz4 wz4Var, IdentityScopeType identityScopeType, Map<Class<? extends a6<?, ?>>, cs4> map) {
        super(wz4Var);
        cs4 cs4VarClone = map.get(AnnounceBannersDao.class).clone();
        this.announceBannersDaoConfig = cs4VarClone;
        cs4VarClone.d(identityScopeType);
        AnnounceBannersDao announceBannersDao = new AnnounceBannersDao(cs4VarClone, this);
        this.announceBannersDao = announceBannersDao;
        registerDao(AnnounceBanners.class, announceBannersDao);
    }

    public void clear() {
        this.announceBannersDaoConfig.a();
    }

    public AnnounceBannersDao getAnnounceBannersDao() {
        return this.announceBannersDao;
    }
}
