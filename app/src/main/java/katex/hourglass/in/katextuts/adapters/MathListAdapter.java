package katex.hourglass.in.katextuts.adapters;

/**
 * Created by lingaraj on 4/4/17.
 */

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import katex.hourglass.in.katextuts.Helpers;
import katex.hourglass.in.katextuts.R;
import katex.hourglass.in.katextuts.activities.MathViewListActivity;
import katex.hourglass.in.mathlib.MathView;

/**
 * Created by nrupul on 3/7/16.
 */
public class MathListAdapter extends RecyclerView.Adapter<MathListAdapter.ViewHolder> {

    private String TAG = "MATH_LIST_ADAP";
    private MathViewListActivity.CardClick cardClick;
    private int selected_card_position = -1;
    private String[] formulas;
    private Context mContext;
    
   
    public MathListAdapter(Context context,MathViewListActivity.CardClick click, String [] formulas_array)
    {
        //Full Page Correction Rubric list click
        this.mContext = context;
       this.cardClick = click;
       this.formulas = formulas_array;
    }





    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout_recyclerview, parent, false);
        v.setOnClickListener(this.cardClick);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (selected_card_position==position)
        {
            holder.cardView.setCardBackgroundColor(Helpers.getRandomColor(position));
            holder.math_view.setTextColor(ContextCompat.getColor(mContext,R.color.colorTextPrimary));
            holder.math_view.setTextSize(14);
        }
        else
        {

            holder.cardView.setCardBackgroundColor(ContextCompat.getColor(mContext,R.color.colorTextPrimary));
            holder.math_view.setTextColor(Helpers.getRandomColor(position));
            holder.math_view.setTextSize(14);

        }
        holder.math_view.setDisplayText(formulas[position]);

       }



    @Override
    public int getItemCount() {

        return formulas.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        MathView math_view;


        public ViewHolder(View v) {
            super(v);
            cardView = (CardView) v.findViewById(R.id.card_view);
            math_view = (MathView) v.findViewById(R.id.math_view);
         }
    }


    public void toggleMarked(int position) {
          if (selected_card_position==position)
          {
              selected_card_position = -1;
              //de selecting a previous selection;
          }
          else
          {
              selected_card_position = position;
              // mentioning a new selection
          }
          notifyItemChanged(position);
    }


}