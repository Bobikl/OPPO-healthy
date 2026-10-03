package com.oplus.aiunit.vision;

import com.heytap.health.watch.watchface.proto.Proto$SyncEventMessage;
import com.lifesense.plugin.ble.data.tracker.ATDataProfile;
import com.oplus.mydevices.sdk.Constants;
import com.oplus.weatherservicesdk.data.Weather;
import org.scilab.forge.jlatexmath.ParseException;

/* JADX INFO: loaded from: classes11.dex */
public class dpe extends mdb {
    public int f;

    public dpe(int i, int i2, int i3) {
        super(i2, i3);
        this.f = i;
    }

    public static final Object b(int i, wpj wpjVar, String[] strArr) throws ParseException {
        try {
            switch (i) {
                case 0:
                    return epe.M1(wpjVar, strArr);
                case 1:
                    return epe.l2(wpjVar, strArr);
                case 2:
                    return epe.s2(wpjVar, strArr);
                case 3:
                case 4:
                    return epe.K0(wpjVar, strArr);
                case 5:
                case 6:
                case 7:
                    return epe.Z(wpjVar, strArr);
                case 8:
                case 9:
                case 10:
                    return epe.s1(wpjVar, strArr);
                case 11:
                    return epe.Q0(wpjVar, strArr);
                case 12:
                    return epe.V(wpjVar, strArr);
                case 13:
                    return epe.A0(wpjVar, strArr);
                case 14:
                    return epe.y2(wpjVar, strArr);
                case 15:
                    return epe.D0(wpjVar, strArr);
                case 16:
                    return epe.T1(wpjVar, strArr);
                case 17:
                    return epe.c2(wpjVar, strArr);
                case 18:
                    return epe.E(wpjVar, strArr);
                case 19:
                    return epe.F(wpjVar, strArr);
                case 20:
                    return epe.Y(wpjVar, strArr);
                case 21:
                    return epe.g3(wpjVar, strArr);
                case 22:
                    return epe.E1(wpjVar, strArr);
                case 23:
                    return epe.R2(wpjVar, strArr);
                case 24:
                    return epe.T0(wpjVar, strArr);
                case 25:
                    return epe.Q(wpjVar, strArr);
                case 26:
                    return epe.p1(wpjVar, strArr);
                case 27:
                    return epe.I(wpjVar, strArr);
                case 28:
                    return epe.W2(wpjVar, strArr);
                case 29:
                    return epe.W2(wpjVar, strArr);
                case 30:
                    return epe.W2(wpjVar, strArr);
                case 31:
                    return epe.u1(wpjVar, strArr);
                case 32:
                    return epe.U0(wpjVar, strArr);
                case 33:
                    return epe.A1(wpjVar, strArr);
                case 34:
                    return epe.o2(wpjVar, strArr);
                case 35:
                    return epe.W2(wpjVar, strArr);
                case 36:
                    return epe.B1(wpjVar, strArr);
                case 37:
                    return epe.x2(wpjVar, strArr);
                case 38:
                    return epe.C1(wpjVar, strArr);
                case 39:
                    return epe.X2(wpjVar, strArr);
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                    return epe.W2(wpjVar, strArr);
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    return epe.v(wpjVar, strArr);
                case 58:
                    return epe.q(wpjVar, strArr);
                case 59:
                    return epe.v(wpjVar, strArr);
                case 60:
                    return epe.t(wpjVar, strArr);
                case 61:
                    return epe.F0(wpjVar, strArr);
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                case 69:
                case 70:
                case 71:
                case 72:
                case 73:
                case 74:
                case 75:
                    return epe.u(wpjVar, strArr);
                case 76:
                    return epe.L1(wpjVar, strArr);
                case 77:
                    return epe.H2(wpjVar, strArr);
                case 78:
                    return epe.D1(wpjVar, strArr);
                case 79:
                    return epe.a2(wpjVar, strArr);
                case 80:
                    return epe.W1(wpjVar, strArr);
                case 81:
                    return epe.X1(wpjVar, strArr);
                case 82:
                    return epe.f3(wpjVar, strArr);
                case 83:
                    return epe.b3(wpjVar, strArr);
                case 84:
                    return epe.c3(wpjVar, strArr);
                case 85:
                    return epe.l3(wpjVar, strArr);
                case 86:
                    return epe.m3(wpjVar, strArr);
                case 87:
                    return epe.Z2(wpjVar, strArr);
                case 88:
                    return epe.U1(wpjVar, strArr);
                case 89:
                    return epe.a3(wpjVar, strArr);
                case 90:
                    return epe.V1(wpjVar, strArr);
                case 91:
                    return epe.e3(wpjVar, strArr);
                case 92:
                    return epe.Z1(wpjVar, strArr);
                case 93:
                case 94:
                    return epe.L2(wpjVar, strArr);
                case 95:
                    return epe.Y1(wpjVar, strArr);
                case 96:
                    return epe.d3(wpjVar, strArr);
                case 97:
                    return epe.v1(wpjVar, strArr);
                case 98:
                    return epe.y1(wpjVar, strArr);
                case 99:
                    return epe.x1(wpjVar, strArr);
                case 100:
                    return epe.z1(wpjVar, strArr);
                case 101:
                    return epe.t1(wpjVar, strArr);
                case 102:
                    return epe.q1(wpjVar, strArr);
                case 103:
                    return epe.w1(wpjVar, strArr);
                case 104:
                    return epe.r1(wpjVar, strArr);
                case 105:
                    return epe.e1(wpjVar, strArr);
                case 106:
                    return epe.I2(wpjVar, strArr);
                case 107:
                    return epe.j3(wpjVar, strArr);
                case 108:
                    return epe.m0(wpjVar, strArr);
                case 109:
                    return epe.L0(wpjVar, strArr);
                case 110:
                    return epe.O1(wpjVar, strArr);
                case 111:
                    return epe.j1(wpjVar, strArr);
                case 112:
                    return epe.P1(wpjVar, strArr);
                case 113:
                    return epe.i1(wpjVar, strArr);
                case 114:
                    return epe.h1(wpjVar, strArr);
                case 115:
                    return epe.g1(wpjVar, strArr);
                case 116:
                    return epe.F1(wpjVar, strArr);
                case 117:
                    return epe.l0(wpjVar, strArr);
                case 118:
                    return epe.I1(wpjVar, strArr);
                case 119:
                    return epe.G0(wpjVar, strArr);
                case 120:
                    return epe.D(wpjVar, strArr);
                case 121:
                    return epe.x(wpjVar, strArr);
                case 122:
                    return epe.z(wpjVar, strArr);
                case 123:
                    return epe.z0(wpjVar, strArr);
                case 124:
                    return epe.y(wpjVar, strArr);
                case 125:
                    return epe.A(wpjVar, strArr);
                case 126:
                    return epe.J1(wpjVar, strArr);
                case 127:
                    return epe.B0(wpjVar, strArr);
                case 128:
                    return epe.C0(wpjVar, strArr);
                case 129:
                    return epe.B2(wpjVar, strArr);
                case 130:
                    return epe.A2(wpjVar, strArr);
                case 131:
                    return epe.G(wpjVar, strArr);
                case 132:
                    return epe.N1(wpjVar, strArr);
                case 133:
                    return epe.m2(wpjVar, strArr);
                case 134:
                    return epe.n1(wpjVar, strArr);
                case 135:
                    return epe.o1(wpjVar, strArr);
                case 136:
                case 137:
                    return epe.v0(wpjVar, strArr);
                case ATDataProfile.CMD_BLOOD_OXYGEN_RECORD /* 138 */:
                    return epe.O2(wpjVar, strArr);
                case 139:
                    return epe.N2(wpjVar, strArr);
                case 140:
                    return epe.w(wpjVar, strArr);
                case 141:
                    return epe.Y2(wpjVar, strArr);
                case 142:
                    return epe.i3(wpjVar, strArr);
                case 143:
                    return epe.b2(wpjVar, strArr);
                case 144:
                    return epe.g(wpjVar, strArr);
                case 145:
                    return epe.o(wpjVar, strArr);
                case 146:
                    return epe.h3(wpjVar, strArr);
                case 147:
                    return epe.R(wpjVar, strArr);
                case 148:
                    return epe.n(wpjVar, strArr);
                case 149:
                    return epe.j(wpjVar, strArr);
                case 150:
                    return epe.K(wpjVar, strArr);
                case 151:
                    return epe.a(wpjVar, strArr);
                case 152:
                    return epe.L(wpjVar, strArr);
                case 153:
                    return epe.b(wpjVar, strArr);
                case 154:
                    return epe.O(wpjVar, strArr);
                case com.garmin.fit.i.O2ToxicityFieldNum /* 155 */:
                    return epe.e(wpjVar, strArr);
                case 156:
                    return epe.M(wpjVar, strArr);
                case com.garmin.fit.e.TotalFractionalDescentFieldNum /* 157 */:
                    return epe.c(wpjVar, strArr);
                case 158:
                    return epe.P(wpjVar, strArr);
                case 159:
                    return epe.f(wpjVar, strArr);
                case 160:
                    return epe.N(wpjVar, strArr);
                case 161:
                    return epe.d(wpjVar, strArr);
                case 162:
                    return epe.o0(wpjVar, strArr);
                case 163:
                    return epe.V2(wpjVar, strArr);
                case 164:
                    return epe.w2(wpjVar, strArr);
                case 165:
                    return epe.v2(wpjVar, strArr);
                case 166:
                    return epe.C2(wpjVar, strArr);
                case 167:
                    return epe.e2(wpjVar, strArr);
                case 168:
                    return epe.r2(wpjVar, strArr);
                case 169:
                    return epe.k2(wpjVar, strArr);
                case 170:
                    return epe.u2(wpjVar, strArr);
                case 171:
                    return epe.n2(wpjVar, strArr);
                case 172:
                    return epe.i2(wpjVar, strArr);
                case 173:
                    return epe.z2(wpjVar, strArr);
                case 174:
                    return epe.S1(wpjVar, strArr);
                case 175:
                    return epe.r0(wpjVar, strArr);
                case 176:
                    return epe.d2(wpjVar, strArr);
                case 177:
                    return epe.I0(wpjVar, strArr);
                case 178:
                    return epe.k3(wpjVar, strArr);
                case 179:
                    return epe.J2(wpjVar, strArr);
                case 180:
                    return epe.K2(wpjVar, strArr);
                case 181:
                    return epe.n0(wpjVar, strArr);
                case 182:
                    return epe.T2(wpjVar, strArr);
                case 183:
                    return epe.y0(wpjVar, strArr);
                case 184:
                    return epe.J(wpjVar, strArr);
                case 185:
                    return epe.j0(wpjVar, strArr);
                case 186:
                    return epe.w0(wpjVar, strArr);
                case 187:
                    return epe.U(wpjVar, strArr);
                case 188:
                    return epe.l(wpjVar, strArr);
                case CMD_MCU_BREATHE_RATE_VALUE:
                    return epe.l(wpjVar, strArr);
                case 190:
                    return epe.p(wpjVar, strArr);
                case CMD_MCU_AUTO_PAUSE_SPORT_VALUE:
                    return epe.p(wpjVar, strArr);
                case 192:
                    return epe.m(wpjVar, strArr);
                case 193:
                    return epe.Q2(wpjVar, strArr);
                case 194:
                    return epe.m(wpjVar, strArr);
                case 195:
                    return epe.Q1(wpjVar, strArr);
                case CMD_MCU_BUTTON_TO_PAUSE_OR_RESUME_VALUE:
                    return epe.k0(wpjVar, strArr);
                case 197:
                    return epe.p0(wpjVar, strArr);
                case 198:
                    return epe.X0(wpjVar, strArr);
                case 199:
                    return epe.Y0(wpjVar, strArr);
                case 200:
                    return epe.Z0(wpjVar, strArr);
                case 201:
                    return epe.b1(wpjVar, strArr);
                case 202:
                    return epe.a1(wpjVar, strArr);
                case 203:
                    return epe.c1(wpjVar, strArr);
                case 204:
                    return epe.h(wpjVar, strArr);
                case 205:
                    return epe.m1(wpjVar, strArr);
                case 206:
                    return epe.H0(wpjVar, strArr);
                case 207:
                case 208:
                case 209:
                case 210:
                case 211:
                case 212:
                case 213:
                case 214:
                case 215:
                case 216:
                    return epe.F2(wpjVar, strArr);
                case 217:
                    return epe.W0(wpjVar, strArr);
                case 218:
                    return epe.V0(wpjVar, strArr);
                case 219:
                    return epe.J0(wpjVar, strArr);
                case 220:
                    return epe.k(wpjVar, strArr);
                case 221:
                    return epe.s0(wpjVar, strArr);
                case 222:
                    return epe.i(wpjVar, strArr);
                case 223:
                    return epe.q0(wpjVar, strArr);
                case oei.TAI_CHI /* 224 */:
                    return epe.j2(wpjVar, strArr);
                case 225:
                    return epe.G2(wpjVar, strArr);
                case 226:
                    return epe.E0(wpjVar, strArr);
                case 227:
                    return epe.G1(wpjVar, strArr);
                case 228:
                    return epe.H1(wpjVar, strArr);
                case 229:
                    return epe.D2(wpjVar, strArr);
                case 230:
                    return epe.E2(wpjVar, strArr);
                case yo3.FILE_SEND_FAIL /* 231 */:
                    return epe.B(wpjVar, strArr);
                case 232:
                    return epe.C(wpjVar, strArr);
                case 233:
                    return epe.b0(wpjVar, strArr);
                case 234:
                    return epe.t0(wpjVar, strArr);
                case 235:
                    return epe.u0(wpjVar, strArr);
                case CMD_SUNLIGHT_DETAIL_VALUE:
                    return epe.h0(wpjVar, strArr);
                case CMD_SUNLIGHT_STAT_VALUE:
                    return epe.e0(wpjVar, strArr);
                case 238:
                    return epe.g0(wpjVar, strArr);
                case 239:
                    return epe.d0(wpjVar, strArr);
                case 240:
                    return epe.i0(wpjVar, strArr);
                case 241:
                    return epe.f0(wpjVar, strArr);
                case 242:
                    return epe.a0(wpjVar, strArr);
                case 243:
                    return epe.c0(wpjVar, strArr);
                case Proto$SyncEventMessage.OUTFIT_WF_VERSION_FIELD_NUMBER /* 244 */:
                    return epe.f1(wpjVar, strArr);
                case CID_RECEIVER_USER_INFO_FROM_DEVICE_VALUE:
                    return epe.W(wpjVar, strArr);
                case 246:
                case 247:
                    return epe.q2(wpjVar, strArr);
                case 248:
                    return epe.S2(wpjVar, strArr);
                case 249:
                    return epe.U2(wpjVar, strArr);
                case 250:
                    return epe.t2(wpjVar, strArr);
                case Proto$SyncEventMessage.VIDEO_WF_VERSION_FIELD_NUMBER /* 251 */:
                case 252:
                case 253:
                case 254:
                case 255:
                case 256:
                case 257:
                case 258:
                case 259:
                case Constants.LINKAGE_SET_ACTIVE /* 260 */:
                    return epe.K1(wpjVar, strArr);
                case Constants.LINKAGE_MANUAL_SET_ACTIVE /* 261 */:
                    return epe.g2(wpjVar, strArr);
                case ixb.DIVE_ALARM /* 262 */:
                    return epe.P2(wpjVar, strArr);
                case 263:
                    return epe.P0(wpjVar, strArr);
                case ixb.EXERCISE_TITLE /* 264 */:
                    return epe.O0(wpjVar, strArr);
                case 265:
                    return epe.N0(wpjVar, strArr);
                case 266:
                    return epe.M0(wpjVar, strArr);
                case 267:
                    return epe.S0(wpjVar, strArr);
                case 268:
                    return epe.R1(wpjVar, strArr);
                case ixb.SPO2_DATA /* 269 */:
                    return epe.k1(wpjVar, strArr);
                case 270:
                    return epe.p2(wpjVar, strArr);
                case 271:
                    return epe.R0(wpjVar, strArr);
                case 272:
                    return epe.d1(wpjVar, strArr);
                case com.heytap.store.base.core.state.Constants.QR_REQUEST_CODE /* 273 */:
                    return epe.r(wpjVar, strArr);
                case 274:
                    return epe.s(wpjVar, strArr);
                case ixb.SLEEP_LEVEL /* 275 */:
                    return epe.M2(wpjVar, strArr);
                case 276:
                    return epe.x0(wpjVar, strArr);
                case 277:
                    return epe.W2(wpjVar, strArr);
                case 278:
                    return epe.f2(wpjVar, strArr);
                case 279:
                    return epe.l1(wpjVar, strArr);
                case 280:
                    return epe.h2(wpjVar, strArr);
                case 281:
                    return epe.H(wpjVar, strArr);
                case 282:
                    return epe.S(wpjVar, strArr);
                case 283:
                    return epe.T(wpjVar, strArr);
                default:
                    return null;
            }
        } catch (Exception e2) {
            throw new ParseException("Problem with command " + strArr[0] + " at position " + wpjVar.r() + ":" + wpjVar.h() + Weather.SEPARATOR + e2.getMessage());
        }
    }

    @Override // com.oplus.aiunit.vision.mdb
    public Object a(wpj wpjVar, String[] strArr) throws ParseException {
        return b(this.f, wpjVar, strArr);
    }

    public dpe(int i, int i2) {
        super(i2);
        this.f = i;
    }
}
