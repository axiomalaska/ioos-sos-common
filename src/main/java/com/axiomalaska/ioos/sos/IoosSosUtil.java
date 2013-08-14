package com.axiomalaska.ioos.sos;

import org.n52.sos.ioos.asset.AbstractAsset;
import org.n52.sos.ioos.asset.SensorAsset;
import org.n52.sos.ioos.asset.StationAsset;

import com.axiomalaska.ioos.sos.exception.UnsupportedGeometryTypeException;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.Point;

public class IoosSosUtil {
    public static String createObservationFeatureOfInterestId(StationAsset station, Point stationPoint,
            SensorAsset sensor, Point sensorPoint, Geometry foiGeom) throws UnsupportedGeometryTypeException{
        //use station as the feature asset if sensor location is the same (minimize number of fois in SOS)
        AbstractAsset asset = station;
        Point assetPoint = stationPoint;
        if (!stationPoint.equals(sensorPoint)){
            asset = sensor;
            assetPoint = sensorPoint;
        }

        StringBuilder builder = new StringBuilder();
        if (foiGeom instanceof Point){
            Point foiPoint = (Point) foiGeom;
            if (!GeomHelper.equal2d(assetPoint, foiPoint)) {
                builder.append("lat" + foiPoint.getY());
                builder.append("lng" + foiPoint.getX());
            }
            if (GeomHelper.hasHeight(foiPoint)) {
                builder.append("height" + GeomHelper.getHeight(foiPoint) + "m");
            }
        }
        if (builder.length() > 0 ){
            return asset.getAssetId() + "(" + builder.toString() + ")";
        } else {
            return asset.getAssetId();
        }
    }
}
