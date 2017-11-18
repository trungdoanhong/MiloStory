package imwi.milostory.Class;

import java.util.List;

/**
 * Created by hoainiemthoau on 11/18/2017.
 */

public class User
{
    public String LoginName;
    public String Password;
    public int Id;

    private  List<Integer> TimeLineIDs;

    public void AddTimeLineID( int id )
    {
        TimeLineIDs.add(id);
    }
}
