package com.google.zxing.oned;

import com.alipay.sdk.m.u.a;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.cloud.sdk.cloudstorage.http.ServerException;
import com.heytap.health.watchface.adaptation.common.ConfigHolder;
import com.heytap.nearx.tangramconfig.net.IResponse;
import com.heytap.nearx.uikit.widget.NearHintRedDot;
import com.oplus.aiunit.vision.alf;
import com.oplus.aiunit.vision.apj;
import com.oplus.aiunit.vision.hq8;
import com.oplus.aiunit.vision.ixb;
import com.oplus.aiunit.vision.k18;
import com.oplus.aiunit.vision.oei;
import com.oplus.aiunit.vision.weg;
import com.oplus.drs.core.net.entity.UploadStateAware;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
final class EANManufacturerOrgSupport {
    private final List<int[]> ranges = new ArrayList();
    private final List<String> countryIdentifiers = new ArrayList();

    private void add(int[] iArr, String str) {
        this.ranges.add(iArr);
        this.countryIdentifiers.add(str);
    }

    private synchronized void initIfNeeded() {
        if (this.ranges.isEmpty()) {
            add(new int[]{0, 19}, "US/CA");
            add(new int[]{30, 39}, alf.US);
            add(new int[]{60, 139}, "US/CA");
            add(new int[]{300, 379}, "FR");
            add(new int[]{380}, "BG");
            add(new int[]{383}, "SI");
            add(new int[]{385}, "HR");
            add(new int[]{ixb.CHRONO_SHOT_SESSION}, "BA");
            add(new int[]{400, UploadStateAware.HTTP_DECRYPT_FAILED}, "DE");
            add(new int[]{450, 459}, "JP");
            add(new int[]{a.i, 469}, alf.RU);
            add(new int[]{471}, alf.TW);
            add(new int[]{474}, "EE");
            add(new int[]{475}, "LV");
            add(new int[]{ConfigHolder.DEFAULT_WATCH_HEIGHT}, "AZ");
            add(new int[]{477}, "LT");
            add(new int[]{478}, "UZ");
            add(new int[]{479}, "LK");
            add(new int[]{480}, alf.PH);
            add(new int[]{481}, alf.BY);
            add(new int[]{482}, "UA");
            add(new int[]{484}, "MD");
            add(new int[]{485}, "AM");
            add(new int[]{486}, "GE");
            add(new int[]{487}, alf.KZ);
            add(new int[]{489}, "HK");
            add(new int[]{490, 499}, "JP");
            add(new int[]{500, 509}, "GB");
            add(new int[]{NearHintRedDot.RED_POINT_ANIM_DURATION}, "GR");
            add(new int[]{528}, "LB");
            add(new int[]{529}, "CY");
            add(new int[]{531}, "MK");
            add(new int[]{535}, "MT");
            add(new int[]{539}, "IE");
            add(new int[]{hq8.WORST_100MI_PACE, 549}, "BE/LU");
            add(new int[]{560}, "PT");
            add(new int[]{569}, "IS");
            add(new int[]{570, 579}, "DK");
            add(new int[]{590}, "PL");
            add(new int[]{594}, "RO");
            add(new int[]{ServerException.SERVICE_BLOCK_PUT_FAILED}, "HU");
            add(new int[]{600, 601}, "ZA");
            add(new int[]{603}, "GH");
            add(new int[]{608}, alf.BH);
            add(new int[]{609}, "MU");
            add(new int[]{611}, "MA");
            add(new int[]{oei.PADEL_TENNIS}, alf.DZ);
            add(new int[]{616}, "KE");
            add(new int[]{618}, "CI");
            add(new int[]{619}, "TN");
            add(new int[]{621}, alf.SY);
            add(new int[]{622}, alf.EG);
            add(new int[]{624}, "LY");
            add(new int[]{625}, alf.JO);
            add(new int[]{626}, "IR");
            add(new int[]{627}, alf.KW);
            add(new int[]{628}, alf.SA);
            add(new int[]{629}, alf.AE);
            add(new int[]{GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 649}, "FI");
            add(new int[]{690, 695}, "CN");
            add(new int[]{700, 709}, "NO");
            add(new int[]{729}, "IL");
            add(new int[]{730, 739}, "SE");
            add(new int[]{740}, "GT");
            add(new int[]{741}, "SV");
            add(new int[]{742}, "HN");
            add(new int[]{743}, "NI");
            add(new int[]{744}, "CR");
            add(new int[]{745}, "PA");
            add(new int[]{746}, "DO");
            add(new int[]{weg.WINDOW_MORNING_PEAK_END}, alf.MX);
            add(new int[]{754, 755}, alf.CA);
            add(new int[]{759}, "VE");
            add(new int[]{760, k18.GL_ONE_MINUS_SRC_COLOR}, "CH");
            add(new int[]{k18.GL_SRC_ALPHA}, alf.CO);
            add(new int[]{k18.GL_ONE_MINUS_DST_ALPHA}, "UY");
            add(new int[]{k18.GL_ONE_MINUS_DST_COLOR}, "PE");
            add(new int[]{777}, "BO");
            add(new int[]{779}, "AR");
            add(new int[]{780}, "CL");
            add(new int[]{784}, "PY");
            add(new int[]{785}, "PE");
            add(new int[]{786}, apj.Thread_Type_Executor_Cached);
            add(new int[]{789, 790}, alf.BR);
            add(new int[]{800, 839}, "IT");
            add(new int[]{840, 849}, apj.Thread_Type_Executor_Single);
            add(new int[]{850}, "CU");
            add(new int[]{858}, "SK");
            add(new int[]{859}, "CZ");
            add(new int[]{860}, "YU");
            add(new int[]{865}, "MN");
            add(new int[]{867}, "KP");
            add(new int[]{868, 869}, alf.TR);
            add(new int[]{870, 879}, "NL");
            add(new int[]{880}, "KR");
            add(new int[]{885}, alf.TH);
            add(new int[]{888}, alf.SG);
            add(new int[]{890}, alf.IN);
            add(new int[]{893}, alf.VN);
            add(new int[]{896}, "PK");
            add(new int[]{899}, alf.ID);
            add(new int[]{900, 919}, "AT");
            add(new int[]{IResponse.RESPONSE_CODE_HTTP_RETRY, 939}, "AU");
            add(new int[]{940, 949}, "AZ");
            add(new int[]{955}, alf.MY);
            add(new int[]{958}, "MO");
        }
    }

    public String lookupCountryIdentifier(String str) {
        int[] iArr;
        int i;
        initIfNeeded();
        int i2 = Integer.parseInt(str.substring(0, 3));
        int size = this.ranges.size();
        for (int i3 = 0; i3 < size && i2 >= (i = (iArr = this.ranges.get(i3))[0]); i3++) {
            if (iArr.length != 1) {
                i = iArr[1];
            }
            if (i2 <= i) {
                return this.countryIdentifiers.get(i3);
            }
        }
        return null;
    }
}
