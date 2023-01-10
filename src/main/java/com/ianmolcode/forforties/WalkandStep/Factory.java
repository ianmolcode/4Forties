
package com.ianmolcode.forforties.WalkandStep;

import android.content.pm.PackageManager;

import com.ianmolcode.forforties.WalkandStep.services.AbstractStepDetectorService;
import com.ianmolcode.forforties.WalkandStep.services.AccelerometerStepDetectorService;
import com.ianmolcode.forforties.WalkandStep.services.HardwareStepDetectorService;
import com.ianmolcode.forforties.WalkandStep.utils.AndroidVersionHelper;




public class Factory {



    public static Class<? extends AbstractStepDetectorService> getStepDetectorServiceClass(PackageManager pm){
        if(pm != null && AndroidVersionHelper.supportsStepDetector(pm)) {
            return HardwareStepDetectorService.class;
        }else{
            return AccelerometerStepDetectorService.class;
        }
    }
}
