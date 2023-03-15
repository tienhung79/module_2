package case_study.service.imp;

import case_study.common.read.ReadVilla;
import case_study.model.Villa;

import java.util.LinkedHashMap;

public class ServiceVilla {
    public static void addVilla(){
        ReadVilla.readVilla("src/case_study/data/dataVilla.csv");
        LinkedHashMap<Villa,Integer> villaLinkedHashMap = new LinkedHashMap<>();
        
    }
}
