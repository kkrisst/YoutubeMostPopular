package n358vu.krisa.youtubemostpopular.model;

import com.orm.SugarRecord;

/**
 * Created by kkrisst on 05/05/2016.
 */
public class Video extends SugarRecord {

    private String title;
    private String uploader;
    //private Image thumbnail;

    public Video(){
    }

    public Video(String title, String uploader){
        this.title = title;
        this.uploader = uploader;
    }

}
