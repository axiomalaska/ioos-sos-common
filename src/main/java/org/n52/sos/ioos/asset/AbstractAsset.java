package org.n52.sos.ioos.asset;

public abstract class AbstractAsset implements Comparable<AbstractAsset> {    
    protected String authority;
    protected AssetType assetType;
    
    public AbstractAsset( AssetType assetType, String authority ){
        this.assetType = assetType;
        this.authority = cleanInput( authority );
    }

    public AssetType getAssetType(){
        return assetType;
    }    
    
    public String getAuthority(){
        return authority;
    }
    
    public String getAssetId(){
        return AssetConstants.URN_PREFIX
                + AssetConstants.DIVIDER
                + assetType.toString().toLowerCase()
                + AssetConstants.DIVIDER
                + authority;
    }

    public String getAssetShortId(){
        return authority;
    }
    
    /**
     * Asset field aren't allowed to have :     
     * @param input
     * @return cleaned input
     */
    protected String cleanInput( String input ){
        if (input == null) {
            return null;
        }
        return input.replace(':', '_');
    }
    
    public String toString(){
        return getAssetId();
    }
    
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof AbstractAsset) {
            AbstractAsset anotherAbstractAsset = (AbstractAsset) anObject;
            if( getAssetId().equals( anotherAbstractAsset.getAssetId() ) ){
                return true;
            }
        }
        return false;
    }
    
    public int hashCode() {
        int h = 0;
        int len = getAssetId().length();
        if (h == 0 && len > 0) {
            int off = 0;
            char val[] = getAssetId().toCharArray();

            for (int i = 0; i < len; i++) {
                h = 31*h + val[off++];
            }
        }
        return h;
    }
    
    @Override
    public int compareTo(AbstractAsset o) {
        return getAssetId().compareTo( o.getAssetId() );
    }
}