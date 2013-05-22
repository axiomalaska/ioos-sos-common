package org.n52.sos.ioos.asset;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssetTest {
    private static final String networkAssetId = "urn:ioos:network:nanoos:oceanacidif";
    private static final String stationAssetId = "urn:ioos:station:wmo:41001";
    private static final String sensorAssetId = "urn:ioos:sensor:cencoos:mb_ptreyes:baro1";
    private static final String badAssetId = "urn:ioos:madeup:noos:dinosaur";
    
    @Test
    public void testNetworkAsset(){
       AbstractAsset asset = AssetResolver.resolveAsset( networkAssetId );
       assertNotNull( asset );
       assertTrue( asset instanceof NetworkAsset );
       NetworkAsset networkAsset = (NetworkAsset) asset;
       assertEquals( AssetType.NETWORK, networkAsset.getAssetType() );
       assertEquals( "nanoos", networkAsset.getAuthority() );
       assertEquals( "oceanacidif", networkAsset.getNetwork() );
       assertEquals( networkAssetId, networkAsset.getAssetId() );
    }
    
    @Test
    public void testStationAsset(){
       AbstractAsset asset = AssetResolver.resolveAsset( stationAssetId );
       assertNotNull( asset );
       assertTrue( asset instanceof StationAsset );
       StationAsset stationAsset = (StationAsset) asset;
       assertEquals( AssetType.STATION, stationAsset.getAssetType() );
       assertEquals( "wmo", stationAsset.getAuthority() );
       assertEquals( "41001", stationAsset.getStation() );
       assertEquals( stationAssetId, stationAsset.getAssetId() );
    }
    
    @Test
    public void testSensorAsset(){
       AbstractAsset asset = AssetResolver.resolveAsset( sensorAssetId );
       assertNotNull( asset );
       assertTrue( asset instanceof SensorAsset );
       SensorAsset sensorAsset = (SensorAsset) asset;
       assertEquals( AssetType.SENSOR, sensorAsset.getAssetType() );
       assertEquals( "cencoos", sensorAsset.getAuthority() );
       assertEquals( "mb_ptreyes", sensorAsset.getStation() );
       assertEquals( "baro1", sensorAsset.getSensor() );
       assertEquals( sensorAssetId, sensorAsset.getAssetId() );
    }
    
    @Test
    public void testBadAsset(){
       AbstractAsset asset = AssetResolver.resolveAsset( badAssetId );
       assertNull( asset );
    }        
}
