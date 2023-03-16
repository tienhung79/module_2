package case_study.common.write;

import case_study.model.Room;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WriteRoom {
    public static void writeRoom(String path, LinkedHashMap<Room,Integer> roomList){
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter = new FileWriter(path);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Map.Entry<Room,Integer> temp: roomList.entrySet()
                 ) {
                bufferedWriter.write(temp.getKey().toWriteCSV()+","+"0");
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
