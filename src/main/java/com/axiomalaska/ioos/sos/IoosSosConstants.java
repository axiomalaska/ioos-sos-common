package com.axiomalaska.ioos.sos;

public class IoosSosConstants {
    //sos constants
    public static final String SOS_V1 = "1.0.0";
    public static final String NONE = "NONE";
    
    //service identification
    public static final String SI_SERVICE_TYPE = "OGC:SOS";
    public static final String SI_SERVICE_TYPE_CODE_SPACE = "http://opengeospatial.net";
    
    // version
    public static final String IOOS_SERVICE_METADATA = "ioosServiceMetadata";
    public static final String IOOS_TEMPLATE_VERSION = "ioosTemplateVersion";    
    public static final String IOOS_VERSION_DEFINITION = "https://github.com/ioos/sos-guidelines/tree/master/template/milestone1.0";
    public static final String IOOS_VERSION_M10 = "1.0";
    public static final String SOFTWARE_VERSION = "softwareVersion";
    
    public static final String OM_SUBTYPE_PATTERN = "om/1.0.0/profiles/ioos_sos/%s";
    public static final String SML_SUBTYPE_PATTERN = "sensorML/1.0.1/profiles/ioos_sos/%s";
    
    public static final String XML_SUBTYPE_PATTERN = "text/xml; subtype=\"%s\"";
    
    public static final String OM_SUBTYPE_M10 = String.format(OM_SUBTYPE_PATTERN, IOOS_VERSION_M10);
    public static final String SML_SUBTYPE_M10 = String.format(SML_SUBTYPE_PATTERN, IOOS_VERSION_M10);

    public static final String OM_PROFILE_M10 = String.format(XML_SUBTYPE_PATTERN, OM_SUBTYPE_M10);
    public static final String SML_PROFILE_M10 = String.format(XML_SUBTYPE_PATTERN, SML_SUBTYPE_M10);

    public static final String SRS_URL_PREFIX = "http://www.opengis.net/def/crs/EPSG/0/";
    public static final String EPSG_4326_DEF = SRS_URL_PREFIX + 4326;

    public static final String LOCATION_REFERENCE_FRAME = "http://www.opengis.net/def/crs-compound?"
            + "1=http://www.opengis.net/def/crs/EPSG/0/4326&"
            + "2=http://www.opengis.net/def/crs/EPSG/0/5829";
    
    public static final String ORGANIZATION_ONTOLOGY = "http://mmisw.org/ont/ioos/organization";
    public static final String PLATFORM_ONTOLOGY = "http://mmisw.org/ont/ioos/platform";    
    public static final String SECTOR_ONTOLOGY = "http://mmisw.org/ont/ioos/sector";        
    
    public static final String TIME = "time";
    public static final String SENSOR_DATA = "sensorData";
    public static final String FEATURE_TYPE = "featureType";

    public static final String LAT_AXIS_ID = "Lat";
    public static final String LNG_AXIS_ID = "Lon";
    public static final String HEIGHT_AXIS_ID = "Z";

    public static final String DEGREE_UOM = "deg";
    public static final String METER_UOM = "m";

    public static final String CF_FEATURE_TYPES_CODESPACE = "http://cf-pcmdi.llnl.gov/documents/cf-conventions/1.6/cf-conventions.html#discrete-sampling-geometries";

    public static final String OBSERVED_PROPERTIES_ID_PREFIX = "observedproperties";

    public static final String DISCLAIMER_TEXT = "Data provided without any guarantee of accuracy. Provider assumes no liability whatsoever. USE AT YOUR OWN RISK.";

    public static final String PARENT_NETWORK_PROCEDURES_LABEL = "networkProcedures";
    public static final String PARENT_STATION_PROCEDURE_LABEL = "stationProcedure";
    public static final String PARENT_NETWORK_FIELD_NAME = "network";
    public static final String PARENT_STATION_FIELD_NAME = "station";
    public static final String NETWORK_ALL = "network-all";

    public static final String COMPONENT = "component";
    public static final String STATION = "Station";
    public static final String SENSOR = "Sensor";

    // special capabilities names
    public static final String OFFERINGS = "offerings";
    public static final String PARENT_PROCEDURES = "parentProcedures";
    
    public static final String TIME_DEF = "http://www.opengis.net/def/property/OGC/0/PhenomenonTime";
    public static final String GREGORIAN_DEF = "http://www.opengis.net/def/uom/ISO-8601/0/Gregorian";
    
    public static final String UDUNITS_URN_PREFIX = "urn:ogc:def:uom:udunits:2:";
    
    public static final String OGC_ROLE_WEB_PAGE = "urn:ogc:def:role:webPage";
    public static final String OGC_ROLE_OBJECT_IMAGE = "urn:ogc:def:role:objectImage";

    public static final String IOOS_ROLE_QUALITY_CONTROL_DOCUMENT = "qualityControlDocument";
    public static final String IOOS_ROLE_RSS_FEED = "rssFeed";
    
    /** special dummy item to get around swe:DataChoice's item 2..* requirement */
    public static final String DUMMY_ITEM = "dummy_item";
}