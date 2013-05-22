package org.n52.sos.ioos.asset;

public class SensorAsset extends AbstractAsset {
    private String station;
    private String sensor;
    
    public SensorAsset( String authority, String station, String sensor ){
        super( AssetType.SENSOR, authority );
        this.assetType = AssetType.SENSOR;
        this.station = cleanInput( station );
        this.sensor = cleanInput( sensor );
    }

    public SensorAsset( StationAsset stationAsset, String sensor ){
        super( AssetType.SENSOR, stationAsset.getAuthority() );
        this.assetType = AssetType.SENSOR;
        this.station = stationAsset.getStation();
        this.sensor = cleanInput( sensor );
    }

    public String getStation(){
        return station;
    }
    
    public String getSensor(){
        return sensor;
    }

    public StationAsset getStationAsset(){
        return new StationAsset( getAuthority(), station ); 
    }

    @Override
    public String getAssetId() {
        return super.getAssetId()
                + AssetConstants.DIVIDER
                + station
                + AssetConstants.DIVIDER                
                + sensor;
    }
    
    @Override
    public String getAssetShortId() {
        return super.getAssetShortId()
                + AssetConstants.UNDERSCORE
                + station
                + AssetConstants.UNDERSCORE
                + sensor;
    }    
}