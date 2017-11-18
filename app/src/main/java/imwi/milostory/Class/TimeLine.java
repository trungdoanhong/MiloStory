package imwi.milostory.Class;

import java.util.Date;
import java.util.List;

/**
 * Created by hoainiemthoau on 11/18/2017.
 */

public class TimeLine {
    public String Name;
    public int Id;
    public Date LastUpdateTime;
    public User Owner;

    private List<ImaGe> ImagGeIds;

    void AddImaGe( ImaGe imaGe )
    {
        ImagGeIds.add(imaGe);
    }

    void DeleteImage(int imaGeID)
    {
        ImagGeIds.remove(imaGeID);
    }

    void SortImageByTime()
    {

    }
}
