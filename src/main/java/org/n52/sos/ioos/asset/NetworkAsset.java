package org.n52.sos.ioos.asset;

public class NetworkAsset extends AbstractAsset {
    private String network;
    
    public NetworkAsset( String authority, String network ){
        super( AssetType.NETWORK, authority );
        this.network = cleanInput( network );
    }
    
    public String getNetwork(){
        return network;
    }
    
    @Override
    public String getAssetId() {
        return super.getAssetId()
                + AssetConstants.DIVIDER
                + network;
    }
    
    @Override
    public String getAssetShortId() {
        return super.getAssetShortId()
                + AssetConstants.UNDERSCORE
                + network;
    }
}