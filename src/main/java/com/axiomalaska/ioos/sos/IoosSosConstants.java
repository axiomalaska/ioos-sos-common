package com.axiomalaska.ioos.sos;

public class IoosSosConstants {
    // version
    public static String IOOS_VERSION_TITLE = "ioosTemplateVersion";
    public static String IOOS_VERSION_DEFINITION = "http://code.google.com/p/ioostech/source/browse/#svn%2Ftrunk%2Ftemplates%2FMilestone1.0";
    public static String IOOS_VERSION_M10 = "1.0";

    public static String OM_PROFILE_PATTERN = "text/xml;subtype=\"om/1.0.0/profiles/ioos_sos/%s\"";
    public static String SML_PROFILE_PATTERN = "text/xml;subtype=\"sensorML/1.0.1/profiles/ioos_sos/%s\"";

    public static String OM_PROFILE_M10 = String.format(OM_PROFILE_PATTERN, IOOS_VERSION_M10);
    public static String SML_PROFILE_M10 = String.format(SML_PROFILE_PATTERN,
            IOOS_VERSION_M10);

    public static String SRS_URL_PREFIX = "http://www.opengis.net/def/crs/EPSG/0/";
    public static String PLATFORM_LOCATION_URL = "http://www.opengis.net/def/property/OGC/0/PlatformLocation";

    public static String NETWORK_ID_DEF = "http://mmisw.org/ont/ioos/definition/networkID";
    public static String STATION_ID_DEF = "http://mmisw.org/ont/ioos/definition/stationID";
    public static String SENSOR_ID_DEF = "http://mmisw.org/ont/ioos/definition/sensorID";
    public static String OBSERVATION_TIME_RANGE_DEF = "http://mmisw.org/ont/ioos/definition/observationTimeRange";

    public static String NETWORK_ID = "networkID";
    public static String STATION_ID = "stationID";
    public static String SENSOR_ID = "sensorID";
    
    public static String SHORT_NAME = "shortName";
    public static String SHORT_NAME_DEF = "http://mmisw.org/ont/ioos/definition/shortName";
    public static String LONG_NAME = "longName";
    public static String LONG_NAME_DEF = "http://mmisw.org/ont/ioos/definition/longName";
    
    public static String WMO_ID = "wmoID";
    public static String WMO_ID_DEF = "http://mmisw.org/ont/ioos/definition/wmoID";
    
    public static String PUBLISHER = "publisher";
    public static String PUBLISHER_DEF = "http://mmisw.org/ont/ioos/definition/publisher";
    
    public static String ORGANIZATION_CODE_SPACE = "http://mmisw.org/ont/ioos/organization";
    
    public static String PARENT_NETWORK = "parentNetwork";
    public static String PARENT_NETWORK_DEF = "http://mmisw.org/ont/ioos/definition/parentNetwork";
    
    public static String PLATFORM_TYPE = "platformType";
    public static String PLATFORM_TYPE_DEF = "http://mmisw.org/ont/ioos/definition/platformType";
    public static String PLATFORM_CODESPACE = "http://mmisw.org/ont/ioos/platform";
    
    public static String OPERATOR_SECTOR = "operatorSector";
    public static String OPERATOR_SECTOR_DEF = "http://mmisw.org/ont/ioos/definition/operatorSector";
    public static String SECTOR_CODESPACE = "http://mmisw.org/ont/ioos/sector";
    
    public static String SPONSOR = "sponsor";
    public static String SPONSOR_DEF = "http://mmisw.org/ont/ioos/definition/sponsor";
    
    public static String TIME_LABEL = "time";
    public static String SENSOR_DATA_LABEL = "sensorData";
    public static String FEATURE_TYPE_LABEL = "featureType";

    public static String LATITUDE = "latitude";
    public static String LONGITUDE = "longitude";
    public static String HEIGHT = "height";

    public static String LAT_DEFINITION = "http://mmisw.org/ont/cf/parameter/latitude";
    public static String LNG_DEFINITION = "http://mmisw.org/ont/cf/parameter/longitude";
    public static String HEIGHT_DEFINITION = "http://mmisw.org/ont/cf/parameter/height";
    public static String LAT_AXIS_ID = "Lat";
    public static String LNG_AXIS_ID = "Lon";
    public static String HEIGHT_AXIS_ID = "Z";
    public static String MMI_CF_PREFIX = "http://mmisw.org/ont/cf/parameter/";

    public static String DEGREE_UOM = "deg";
    public static String METER_UOM = "m";

    public static String CF_FEATURE_TYPES_CODESPACE = "http://cf-pcmdi.llnl.gov/documents/cf-conventions/1.6/cf-conventions.html#discrete-sampling-geometries";

    public static String OBSERVED_PROPERTIES_ID_PREFIX = "observedproperties";
    public static String SENSOR_NAME = "sensor";

    public static String DISCLAIMER_TEXT = "DISCLAIMER";

    public static String PARENT_NETWORK_PROCEDURES_LABEL = "networkProcedures";
    public static String PARENT_STATION_PROCEDURE_LABEL = "stationProcedure";
    public static String PARENT_NETWORK_FIELD_NAME = "network";
    public static String PARENT_STATION_FIELD_NAME = "station";
    public static String NETWORK_ALL = "network-all";
    public static String OBSERVATION_TIME_RANGE_NAME = "observationTimeRange";

    public static String COMPONENT = "component";
    public static String STATION = "Station";
    public static String SENSOR = "Sensor";

    public static String PROCEDURE_OFFERINGS_CAPABILITIES_NAME = "procedureOfferings";

    // swe names
    public static String SWE_STATIONS_FIELD_NAME = "stations";
    public static String SWE_SENSORS_FIELD_NAME = "sensors";
    public static String SWE_PLATFORM_LOCATION_NAME = "platformLocation";
    public static String SWE_OBSERVATION_DATA_NAME = "observationData";
    public static String SWE_OBSERVATIONS_NAME = "observations";

    public static String IOOS_BUOY_CRS_URL = "https://ioostech.googlecode.com/svn/trunk/IoosCRS/IoosBuoyCRS.xml";
    public static String PLATFORM_FRAME = "#PlatformFrame";
    
    public static String EPSG_4326_DEF = "http://www.opengis.net/def/crs/EPSG/0/4326";
}