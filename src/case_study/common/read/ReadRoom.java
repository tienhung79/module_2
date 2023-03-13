package case_study.common.read;

import case_study.common.write.WriteRoom;
import case_study.model.Room;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadRoom {
    public static List<Room> readRoom(String path){
        List<Room> roomList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
            String temp ="";
            String[] tempArray;
            Room room;
            while ((temp= bufferedReader.readLine())!=null){
                tempArray = temp.split(",");
                room = new Room(tempArray[0],Integer.parseInt(tempArray[1]),Integer.parseInt(tempArray[2]),Integer.parseInt(tempArray[3]),tempArray[4],tempArray[5]);
                roomList.add(room);
            }
            fileReader.close();
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            WriteRoom.writeRoom(path,roomList);
        }
        return roomList;
    }
}
