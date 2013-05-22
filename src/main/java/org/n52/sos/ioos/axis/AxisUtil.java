package org.n52.sos.ioos.axis;

import java.util.Arrays;
import java.util.List;

import com.axiomalaska.cf4j.CFStandardNames;
import com.axiomalaska.ioos.sos.IoosSosConstants;

public class AxisUtil {        
    public static final List<String> LNG_NAMES = Arrays.asList( new String[]{
        CFStandardNames.LONGITUDE.getName()
       ,IoosSosConstants.LNG_DEFINITION
       ,AxisType.LNG.name()
    });

    public static final List<String> LAT_NAMES = Arrays.asList( new String[]{
        CFStandardNames.LATITUDE.getName()
       ,IoosSosConstants.LAT_DEFINITION        
       ,AxisType.LAT.name()
    });

    //depth axes need to be inverted to altitude, keep a separate list of them
    public static final List<String> DEPTH_NAMES = Arrays.asList( new String[]{
        CFStandardNames.DEPTH.getName()
       ,CFStandardNames.DEPTH_BELOW_GEOID.getName()
    });
    
    public static final List<String> HEIGHT_NAMES = Arrays.asList( new String[]{
        CFStandardNames.HEIGHT.getName()
       ,CFStandardNames.HEIGHT_ABOVE_REFERENCE_ELLIPSOID.getName()
       ,IoosSosConstants.HEIGHT_DEFINITION       
       ,AxisType.Z.name()
    });
    
    public static boolean isLng( String phenomenon ){
        return LNG_NAMES.contains( phenomenon.toLowerCase() );
    }

    public static boolean isLat( String phenomenon ){
        return LAT_NAMES.contains( phenomenon.toLowerCase() );
    }

    public static boolean isZ( String phenomenon ){
        phenomenon = phenomenon.toLowerCase();
        return isDepth( phenomenon ) || HEIGHT_NAMES.contains( phenomenon );
    }
    
    public static boolean isDepth( String phenomenon ){
        return DEPTH_NAMES.contains( phenomenon.toLowerCase() );
    }
    
}
