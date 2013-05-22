package org.n52.sos.ioos.asset;

public class FakeStationAsset extends StationAsset {
    private String originalProcedureId;
    
    public FakeStationAsset( String station, String originalProcedureId ){
        super( AssetConstants.UNKNOWN, station );
        this.originalProcedureId = originalProcedureId;
    }
    
    public String getOriginalProcedureId(){
        return originalProcedureId;
    }
    
    @Override
    public String getAssetId(){
    	return originalProcedureId;
    }
}