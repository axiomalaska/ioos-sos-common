package org.n52.sos.ioos.asset;

public class StationAsset extends AbstractAsset {
    private String station;
    
    public StationAsset( String authority, String station ){
        super( AssetType.STATION, authority );
        this.station = cleanInput( station );
    }
    
    public String getStation(){
        return station;
    }
    
    @Override
    public String getAssetId() {
        return super.getAssetId()
                + AssetConstants.DIVIDER
                + station;
    }
    
    @Override
    public String getAssetShortId() {
        return super.getAssetShortId()
                + AssetConstants.UNDERSCORE
                + station;
    }    
}