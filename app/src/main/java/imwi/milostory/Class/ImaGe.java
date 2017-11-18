package imwi.milostory.Class;

import android.graphics.Bitmap;

import java.util.Date;
import java.util.List;

/**
 * Created by hoainiemthoau on 11/18/2017.
 */

public class ImaGe {
    public String Name;
    public int Id;
    public Date CaptureDate;
    public int LikeNumber;
    public String ImageAddress;
    public Bitmap Image;

    private List<Comment> Comments;

    public ImaGe(String name, int id, Date captureDate, int likeNumber, String imageAddress, Bitmap image, List<Comment> comments) {
        Name = name;
        Id = id;
        CaptureDate = captureDate;
        LikeNumber = likeNumber;
        ImageAddress = imageAddress;
        Image = image;
        Comments = comments;
    }

    public void AddComment(Comment comment)
    {
        Comments.add(comment);
    }

    public void DeleteComment(int id)
    {
        for(Comment cmt: Comments)
        {
            if (cmt.Id == id)
            {
                Comments.remove(cmt);
                return;
            }
        }
    }
}
