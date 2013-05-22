package org.n52.sos.ioos.asset;

public class AssetConstants {
    public static final String URN_PREFIX = "urn:ioos";
    public static final String DIVIDER = ":";
    public static final String UNDERSCORE = "_";
    
    public static final String UNKNOWN = "unknown";
    public static final String FAKE = "fake";
    public static final StationAsset UNKNOWN_STATION = new StationAsset( UNKNOWN, UNKNOWN );
    public static final SensorAsset UNKNOWN_SENSOR = new SensorAsset( UNKNOWN, UNKNOWN, UNKNOWN );
}
