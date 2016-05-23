package n358vu.krisa.youtubemostpopular.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kkrisst on 23/05/2016.
 */
public class CategorySnippet {

    @SerializedName("channelId")
    @Expose
    private String channelId;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("assignable")
    @Expose
    private boolean assignable;

    /**
     *
     * @return
     * The channelId
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     *
     * @param channelId
     * The channelId
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The assignable
     */
    public boolean getAssignable() {
        return assignable;
    }

    /**
     *
     * @param assignable
     * The assignable
     */
    public void setAssignable(boolean assignable) {
        this.assignable = assignable;
    }

}
