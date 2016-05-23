package n358vu.krisa.youtubemostpopular.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kkrisst on 23/05/2016.
 */
public class CategoryResult {

    @SerializedName("kind")
    @Expose
    private String kind;

    @SerializedName("etag")
    @Expose
    private String etag;

    @SerializedName("items")
    @Expose
    private List<Category> items = new ArrayList<Category>();

    /**
     *
     * @return
     * The kind
     */
    public String getKind() {
        return kind;
    }

    /**
     *
     * @param kind
     * The kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     *
     * @return
     * The etag
     */
    public String getEtag() {
        return etag;
    }

    /**
     *
     * @param etag
     * The etag
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

    /**
     *
     * @return
     * The items
     */
    public List<Category> getItems() {
        return items;
    }

    /**
     *
     * @param items
     * The items
     */
    public void setItems(List<Category> items) {
        this.items = items;
    }

}
