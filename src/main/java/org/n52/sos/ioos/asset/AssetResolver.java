package org.n52.sos.ioos.asset;

public class AssetResolver {
    public static AbstractAsset resolveAsset( String assetId ){
        if( assetId == null || !assetId.startsWith( AssetConstants.URN_PREFIX )){
            return null;
        }
                
        String[] assetFields = assetId.split( AssetConstants.DIVIDER );
        if( assetFields != null && ( assetFields.length == 5 || assetFields.length == 6 ) ){
            AssetType assetType;
            try{
                assetType = AssetType.valueOf( assetFields[2].toUpperCase() );
            } catch( IllegalArgumentException iae ){
                return  null;
            }

            String authority = assetFields[3];
            
            switch( assetType ){
                case NETWORK:
                    if( assetFields.length != 5 ){
                        //TODO: throw error here?
                        return null;
                    }                    
                    return new NetworkAsset( authority, assetFields[4] );
                case SENSOR:
                    if( assetFields.length != 6 ){
                        //TODO: throw error here?
                        return null;
                    }
                    return new SensorAsset( authority, assetFields[4], assetFields[5] );
                case STATION:
                    if( assetFields.length != 5 ){
                        //TODO: throw error here?
                        return null;
                    }
                    return new StationAsset( authority, assetFields[4] );
                default:
                    return null;            
            }
                
        }
        return null;
    }
}
