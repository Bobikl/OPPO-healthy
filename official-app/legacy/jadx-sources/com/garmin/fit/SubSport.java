package com.garmin.fit;

import com.oplus.aiunit.vision.gz;

/* JADX INFO: loaded from: classes13.dex */
public enum SubSport {
    GENERIC(0),
    TREADMILL(1),
    STREET(2),
    TRAIL(3),
    TRACK(4),
    SPIN(5),
    INDOOR_CYCLING(6),
    ROAD(7),
    MOUNTAIN(8),
    DOWNHILL(9),
    RECUMBENT(10),
    CYCLOCROSS(11),
    HAND_CYCLING(12),
    TRACK_CYCLING(13),
    INDOOR_ROWING(14),
    ELLIPTICAL(15),
    STAIR_CLIMBING(16),
    LAP_SWIMMING(17),
    OPEN_WATER(18),
    FLEXIBILITY_TRAINING(19),
    STRENGTH_TRAINING(20),
    WARM_UP(21),
    MATCH(22),
    EXERCISE(23),
    CHALLENGE(24),
    INDOOR_SKIING(25),
    CARDIO_TRAINING(26),
    INDOOR_WALKING(27),
    E_BIKE_FITNESS(28),
    BMX(29),
    CASUAL_WALKING(30),
    SPEED_WALKING(31),
    BIKE_TO_RUN_TRANSITION(32),
    RUN_TO_BIKE_TRANSITION(33),
    SWIM_TO_BIKE_TRANSITION(34),
    ATV(35),
    MOTOCROSS(36),
    BACKCOUNTRY(37),
    RESORT(38),
    RC_DRONE(39),
    WINGSUIT(40),
    WHITEWATER(41),
    SKATE_SKIING(42),
    YOGA(43),
    PILATES(44),
    INDOOR_RUNNING(45),
    GRAVEL_CYCLING(46),
    E_BIKE_MOUNTAIN(47),
    COMMUTING(48),
    MIXED_SURFACE(49),
    NAVIGATE(50),
    TRACK_ME(51),
    MAP(52),
    SINGLE_GAS_DIVING(53),
    MULTI_GAS_DIVING(54),
    GAUGE_DIVING(55),
    APNEA_DIVING(56),
    APNEA_HUNTING(57),
    VIRTUAL_ACTIVITY(58),
    OBSTACLE(59),
    BREATHING(62),
    SAIL_RACE(65),
    ULTRA(67),
    INDOOR_CLIMBING(68),
    BOULDERING(69),
    HIIT(70),
    AMRAP(73),
    EMOM(74),
    TABATA(75),
    PICKLEBALL(84),
    PADEL(85),
    INDOOR_WHEELCHAIR_WALK(86),
    INDOOR_WHEELCHAIR_RUN(87),
    INDOOR_HAND_CYCLING(88),
    SQUASH(94),
    BADMINTON(95),
    RACQUETBALL(96),
    TABLE_TENNIS(97),
    FLY_CANOPY(gz.unsupported_extension),
    FLY_PARAGLIDE(gz.certificate_unobtainable),
    FLY_PARAMOTOR(gz.unrecognized_name),
    FLY_PRESSURIZED(gz.bad_certificate_status_response),
    FLY_NAVIGATE(gz.bad_certificate_hash_value),
    FLY_TIMER(gz.unknown_psk_identity),
    FLY_ALTIMETER(116),
    FLY_WX(117),
    FLY_VFR(118),
    FLY_IFR(119),
    ALL(254),
    INVALID(255);

    protected short value;

    SubSport(short s) {
        this.value = s;
    }

    public static SubSport getByValue(Short sh) {
        for (SubSport subSport : values()) {
            if (sh.shortValue() == subSport.value) {
                return subSport;
            }
        }
        return INVALID;
    }

    public static String getStringFromValue(SubSport subSport) {
        return subSport.name();
    }

    public short getValue() {
        return this.value;
    }
}
