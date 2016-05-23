package n358vu.krisa.youtubemostpopular.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import n358vu.krisa.youtubemostpopular.R;

import n358vu.krisa.youtubemostpopular.model.Category;

/**
 * Created by kkrisst on 23/05/2016.
 */
public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private Context context;
    private List<Category> categoryList;

    public CategoryAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_category, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Category category = categoryList.get(position);
        holder.categoryTitle.setText(category.getSnippet().getTitle());
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public Category getCategory(int position) {
        return categoryList.get(position);
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView categoryTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            categoryTitle = (TextView) itemView.findViewById(R.id.categoryTitle);
        }
    }

}
