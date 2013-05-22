/**
 * Copyright (C) 2013
 * by 52 North Initiative for Geospatial Open Source Software GmbH
 *
 * Contact: Andreas Wytzisk
 * 52 North Initiative for Geospatial Open Source Software GmbH
 * Martin-Luther-King-Weg 24
 * 48155 Muenster, Germany
 * info@52north.org
 *
 * This program is free software; you can redistribute and/or modify it under
 * the terms of the GNU General Public License version 2 as published by the
 * Free Software Foundation.
 *
 * This program is distributed WITHOUT ANY WARRANTY; even without the implied
 * WARRANTY OF MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program (see gnu-gpl v2.txt). If not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA or
 * visit the Free Software Foundation web page, http://www.fsf.org.
 */
package com.axiomalaska.ioos.sos;

public interface IoosSosConstants {
    // version
    String IOOS_VERSION_TITLE = "ioosTemplateVersion";
    String IOOS_VERSION_DEFINITION = "http://code.google.com/p/ioostech/source/browse/#svn%2Ftrunk%2Ftemplates%2FMilestone1.0";
    String IOOS_VERSION_M10 = "1.0";

    String OM_PROFILE_PATTERN = "text/xml;subtype=\"om/1.0.0/profiles/ioos_sos/%s\"";
    String SML_PROFILE_PATTERN = "text/xml;subtype=\"sensorML/1.0.1/profiles/ioos_sos/%s\"";

    String OM_PROFILE_M10 = String.format(OM_PROFILE_PATTERN, IOOS_VERSION_M10);
    String SML_PROFILE_M10 = String.format(SML_PROFILE_PATTERN,
            IOOS_VERSION_M10);

    String SRS_URL_PREFIX = "http://www.opengis.net/def/crs/EPSG/0/";
    String PLATFORM_LOCATION_URL = "http://www.opengis.net/def/property/OGC/0/PlatformLocation";

    String NETWORK_ID_DEFINITION = "http://mmisw.org/ont/ioos/definition/networkID";
    String STATION_ID_DEFINITION = "http://mmisw.org/ont/ioos/definition/stationID";
    String SENSOR_ID_DEFINITION = "http://mmisw.org/ont/ioos/definition/sensorID";
    String OBSERVATION_TIME_RANGE_DEFINITION = "http://mmisw.org/ont/ioos/definition/observationTimeRange";

    String STATION_ID = "stationID";
    String SENSOR_ID = "sensorID";
    String TIME_LABEL = "time";
    String SENSOR_DATA_LABEL = "sensorData";
    String FEATURE_TYPE_LABEL = "featureType";

    String LATITUDE = "latitude";
    String LONGITUDE = "longitude";
    String HEIGHT = "height";

    String LAT_DEFINITION = "http://mmisw.org/ont/cf/parameter/latitude";
    String LNG_DEFINITION = "http://mmisw.org/ont/cf/parameter/longitude";
    String HEIGHT_DEFINITION = "http://mmisw.org/ont/cf/parameter/height";
    String LAT_AXIS_ID = "Lat";
    String LNG_AXIS_ID = "Lon";
    String HEIGHT_AXIS_ID = "Z";
    String MMI_CF_PREFIX = "http://mmisw.org/ont/cf/parameter/";

    String DEGREE_UOM = "deg";
    String METER_UOM = "m";

    String CF_FEATURE_TYPES_CODESPACE = "http://cf-pcmdi.llnl.gov/documents/cf-conventions/1.6/cf-conventions.html#discrete-sampling-geometries";

    String OBSERVED_PROPERTIES_ID_PREFIX = "observedproperties";
    String SENSOR_NAME = "sensor";

    String DISCLAIMER_TEXT = "DISCLAIMER";

    String PARENT_NETWORK_PROCEDURES_LABEL = "networkProcedures";
    String PARENT_STATION_PROCEDURE_LABEL = "stationProcedure";
    String PARENT_NETWORK_FIELD_NAME = "network";
    String PARENT_STATION_FIELD_NAME = "station";
    String NETWORK_ALL = "network-all";
    String OBSERVATION_TIME_RANGE_NAME = "observationTimeRange";

    
    String COMPONENT = "component";
    String STATION = "Station";
    String SENSOR = "Sensor";

    String PROCEDURE_OFFERINGS_CAPABILITIES_NAME = "procedureOfferings";

    String PUBLISHER = "publisher";

    // swe names
    String SWE_STATIONS_FIELD_NAME = "stations";
    String SWE_SENSORS_FIELD_NAME = "sensors";
    String SWE_PLATFORM_LOCATION_NAME = "platformLocation";
    String SWE_OBSERVATION_DATA_NAME = "observationData";
    String SWE_OBSERVATIONS_NAME = "observations";

    String IOOS_BUOY_CRS_URL = "https://ioostech.googlecode.com/svn/trunk/IoosCRS/IoosBuoyCRS.xml";
    String PLATFORM_FRAME = "#PlatformFrame";
}