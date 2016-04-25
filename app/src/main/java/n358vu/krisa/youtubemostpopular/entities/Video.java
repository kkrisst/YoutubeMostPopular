package n358vu.krisa.youtubemostpopular.entities;

import com.orm.SugarRecord;

/**
 * Created by mobsoft on 2016. 04. 25..
 */
public class Video extends SugarRecord {
    String title;
    String thumbnail;

    public Video(){
    }

    public Video(String title, String thumbnail){
        this.title = title;
        this.thumbnail = thumbnail;
    }
}

