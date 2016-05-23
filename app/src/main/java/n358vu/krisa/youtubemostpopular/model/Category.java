package n358vu.krisa.youtubemostpopular.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kkrisst on 23/05/2016.
 */
public class Category {

    @SerializedName("kind")
    @Expose
    private String kind;

    @SerializedName("etag")
    @Expose
    private String etag;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("snippet")
    @Expose
    private CategorySnippet snippet;

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
         * The snippet
         */
        public CategorySnippet getSnippet() {
        return snippet;
    }

        /**
         *
         * @param snippet
         * The snippet
         */
        public void setSnippet(CategorySnippet snippet) {
        this.snippet = snippet;
    }

}
