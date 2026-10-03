package com.lifesense.android.bluetooth.core.enums;

import com.lifesense.android.bluetooth.core.protocol.frame.a;
import com.lifesense.android.bluetooth.core.protocol.parser.b;

/* JADX INFO: loaded from: classes4.dex */
public enum PackageType {
    UNKNOWN,
    LOGIN_REQUEST_PACKAGE { // from class: com.lifesense.android.bluetooth.core.enums.PackageType.1
        @Override // com.lifesense.android.bluetooth.core.enums.PackageType
        public void handlePackage(b bVar, String str, a aVar) {
            bVar.onLoginRequestDataPackage(str, aVar);
        }
    },
    INIT_REQUEST_PACKAGE { // from class: com.lifesense.android.bluetooth.core.enums.PackageType.2
        @Override // com.lifesense.android.bluetooth.core.enums.PackageType
        public void handlePackage(b bVar, String str, a aVar) {
            bVar.onInitRequestDataPackage(str, aVar);
        }
    },
    MEASURE_DATA_PACKAGE { // from class: com.lifesense.android.bluetooth.core.enums.PackageType.3
        @Override // com.lifesense.android.bluetooth.core.enums.PackageType
        public void handlePackage(b bVar, String str, a aVar) {
            bVar.onMeasuredDataDataPackage(str, aVar);
        }
    },
    ACK_DATA_PACKAGE { // from class: com.lifesense.android.bluetooth.core.enums.PackageType.4
        @Override // com.lifesense.android.bluetooth.core.enums.PackageType
        public void handlePackage(b bVar, String str, a aVar) {
            bVar.onReceiveAckDataPackage(str, aVar);
        }
    },
    SETTING_RESPONSE_DATA_PACKAGE { // from class: com.lifesense.android.bluetooth.core.enums.PackageType.5
        @Override // com.lifesense.android.bluetooth.core.enums.PackageType
        public void handlePackage(b bVar, String str, a aVar) {
            bVar.onReceiveSettingDataPackage(str, aVar);
        }
    },
    USER_INFO_DATA_PACKAGE { // from class: com.lifesense.android.bluetooth.core.enums.PackageType.6
        @Override // com.lifesense.android.bluetooth.core.enums.PackageType
        public void handlePackage(b bVar, String str, a aVar) {
            bVar.onReceiveUserInfoDataPackage(str, aVar);
        }
    };

    public void handlePackage(b bVar, String str, a aVar) {
    }
}
